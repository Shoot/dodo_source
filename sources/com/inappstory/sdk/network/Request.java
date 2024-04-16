package com.inappstory.sdk.network;

import android.os.AsyncTask;
import android.util.Pair;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import java.lang.reflect.ParameterizedType;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes3.dex */
public class Request<T> {
    private String body;
    private String bodyEncoded;
    private String bodyRaw;
    private HashMap<String, String> headers;
    private boolean isFormEncoded;
    private String method;
    private String url;
    private List<Pair<String, String>> varList;
    private HashMap<String, String> vars;

    /* loaded from: classes3.dex */
    public static class Builder {
        private String body;
        private String bodyEncoded;
        private String bodyRaw;
        private HashMap<String, String> headers;
        private boolean isFormEncoded;
        private String method;
        private String url;
        private List<Pair<String, String>> varList;
        private HashMap<String, String> vars;

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public Builder bodyEncoded(String str) {
            this.bodyEncoded = str;
            return this;
        }

        public Builder bodyRaw(String str) {
            this.bodyRaw = str;
            return this;
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder delete() {
            this.method = NetworkHandler.DELETE;
            return this;
        }

        public Builder get() {
            this.method = NetworkHandler.GET;
            return this;
        }

        public Builder head() {
            this.method = NetworkHandler.HEAD;
            return this;
        }

        public Builder headers(HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }

        public Builder isFormEncoded(boolean z) {
            this.isFormEncoded = z;
            return this;
        }

        public Builder method(String str) {
            this.method = str;
            return this;
        }

        public Builder post() {
            this.method = NetworkHandler.POST;
            return this;
        }

        public Builder put() {
            this.method = NetworkHandler.PUT;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Builder varList(List<Pair<String, String>> list) {
            this.varList = list;
            return this;
        }

        public Builder vars(HashMap<String, String> hashMap) {
            this.vars = hashMap;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AsyncTask<Void, String, Response> {
        final /* synthetic */ Callback a;

        a(Callback callback) {
            this.a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Response doInBackground(Void... voidArr) {
            Response build;
            String uuid = UUID.randomUUID().toString();
            try {
                build = NetworkHandler.doRequest(Request.this, uuid);
            } catch (SocketException e) {
                build = new Response.Builder().code(-2).errorBody(e.getMessage()).build();
            } catch (SocketTimeoutException e2) {
                build = new Response.Builder().code(-1).errorBody(e2.getMessage()).build();
            } catch (Exception e3) {
                build = new Response.Builder().code(-3).errorBody(e3.getMessage()).build();
            }
            build.logId = uuid;
            return build;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Response response) {
            Object fromJson;
            if (response != null) {
                ApiLogResponse apiLogResponse = new ApiLogResponse();
                apiLogResponse.id = response.logId;
                apiLogResponse.timestamp = System.currentTimeMillis();
                apiLogResponse.contentLength = response.contentLength;
                String str = response.body;
                if (str == null) {
                    Request.this.sendError(apiLogResponse, response, response.errorBody, this.a);
                    return;
                }
                apiLogResponse.generateJsonResponse(response.code, str, response.headers);
                InAppStoryManager.sendApiResponseLog(apiLogResponse);
                try {
                    if (this.a.getType() == null) {
                        this.a.onSuccess(response);
                        return;
                    }
                    if (this.a.getType() instanceof ParameterizedType) {
                        fromJson = JsonParser.listFromJson(response.body, (Class) ((ParameterizedType) this.a.getType()).getActualTypeArguments()[0]);
                    } else {
                        fromJson = JsonParser.fromJson(response.body, (Class) this.a.getType());
                    }
                    if (fromJson == null) {
                        Request.this.sendError(apiLogResponse, response, response.errorBody, this.a);
                    } else {
                        this.a.onSuccess(fromJson);
                    }
                } catch (Exception e) {
                    Request.this.sendError(apiLogResponse, response, e.getMessage(), this.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.vars = builder.vars;
        this.varList = builder.varList;
        this.bodyRaw = builder.bodyRaw;
        this.bodyEncoded = builder.bodyEncoded;
        this.body = builder.body;
        this.isFormEncoded = builder.isFormEncoded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendError(ApiLogResponse apiLogResponse, Response response, String str, Callback callback) {
        apiLogResponse.generateJsonResponse(response.code, str, response.headers);
        InAppStoryManager.sendApiResponseLog(apiLogResponse);
        callback.onFailure(response);
    }

    public void enqueue(Callback callback) {
        new a(callback).execute(new Void[0]);
    }

    public Response execute() {
        Response build;
        String uuid = UUID.randomUUID().toString();
        try {
            build = NetworkHandler.doRequest(this, uuid);
        } catch (SocketException e) {
            build = new Response.Builder().code(-2).errorBody(e.getMessage()).build();
        } catch (SocketTimeoutException e2) {
            build = new Response.Builder().code(-1).errorBody(e2.getMessage()).build();
        } catch (Exception e3) {
            build = new Response.Builder().code(-3).errorBody(e3.getMessage()).build();
        }
        build.logId = uuid;
        ApiLogResponse apiLogResponse = new ApiLogResponse();
        apiLogResponse.id = uuid;
        apiLogResponse.timestamp = System.currentTimeMillis();
        apiLogResponse.contentLength = build.contentLength;
        String str = build.body;
        if (str != null) {
            apiLogResponse.generateJsonResponse(build.code, str, build.headers);
        } else {
            apiLogResponse.generateError(build.code, build.errorBody, build.headers);
        }
        InAppStoryManager.sendApiResponseLog(apiLogResponse);
        return build;
    }

    public String getBody() {
        return this.body;
    }

    public String getBodyEncoded() {
        return this.bodyEncoded;
    }

    public String getBodyRaw() {
        return this.bodyRaw;
    }

    public String getHeader(Object obj) {
        return this.headers.get(obj);
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public String getHeadersString() {
        HashMap<String, String> hashMap = this.headers;
        if (hashMap == null) {
            return "";
        }
        return hashMap.toString();
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public Set<String> getVarKeys() {
        HashMap<String, String> hashMap = this.vars;
        if (hashMap != null) {
            return hashMap.keySet();
        }
        return new HashSet();
    }

    public List<Pair<String, String>> getVarList() {
        List<Pair<String, String>> list = this.varList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public HashMap<String, String> getVars() {
        HashMap<String, String> hashMap = this.vars;
        if (hashMap == null) {
            return new HashMap<>();
        }
        return hashMap;
    }

    public boolean isFormEncoded() {
        return this.isFormEncoded;
    }
}
