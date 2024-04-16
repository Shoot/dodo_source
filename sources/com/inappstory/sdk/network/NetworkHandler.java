package com.inappstory.sdk.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.ContainerUtils;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.Request;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequest;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequestHeader;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
/* loaded from: classes3.dex */
public final class NetworkHandler implements InvocationHandler {
    public static final String DELETE = "DELETE";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static boolean sessionKill = false;
    HashMap<String, String> headers;
    public NetworkClient networkClient;

    private List<Pair<String, String>> convertObjectToQuery(String str, String str2) {
        try {
            return JsonParser.toQueryParams(str, str2);
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static Response doRequest(Request request, String str) throws Exception {
        String str2;
        Response build;
        ApiLogRequest apiLogRequest = new ApiLogRequest();
        URL url = getURL(request);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestMethod(request.getMethod());
        apiLogRequest.method = request.getMethod();
        apiLogRequest.url = url.toString();
        apiLogRequest.timestamp = System.currentTimeMillis();
        apiLogRequest.id = str;
        if (request.getHeaders() != null) {
            for (String str3 : request.getHeaders().keySet()) {
                httpURLConnection.setRequestProperty(str3.toString(), request.getHeader(str3));
            }
        }
        if (InAppStoryService.getInstance() != null && InAppStoryService.getInstance().getUserId() != null) {
            httpURLConnection.setRequestProperty("X-User-id", InAppStoryService.getInstance().getUserId());
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "br, gzip");
        httpURLConnection.setRequestProperty("X-Request-ID", UUID.randomUUID().toString());
        if (request.isFormEncoded()) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        if (!sessionKill && !Session.needToUpdate() && !request.getUrl().contains("session/open")) {
            httpURLConnection.setRequestProperty("auth-session-id", Session.getInstance().id);
        }
        InAppStoryManager.showDLog("InAppStory_Network", str + " " + httpURLConnection.getRequestProperties().toString());
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                apiLogRequest.headers.add(new ApiLogRequestHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        if (!request.getMethod().equals(GET) && !request.getMethod().equals(HEAD) && !request.getBody().isEmpty()) {
            InAppStoryManager.showDLog("InAppStory_Network", str + " " + request.getBody());
            apiLogRequest.body = request.getBody();
            apiLogRequest.bodyRaw = request.getBodyRaw();
            apiLogRequest.bodyUrlEncoded = request.getBodyEncoded();
            if (!request.isFormEncoded()) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                apiLogRequest.headers.add(new ApiLogRequestHeader("Content-Type", "application/json"));
            }
            InAppStoryManager.sendApiRequestLog(apiLogRequest);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            outputStreamWriter.write(request.getBody());
            outputStreamWriter.flush();
            outputStreamWriter.close();
            outputStream.close();
        } else {
            InAppStoryManager.sendApiRequestLog(apiLogRequest);
        }
        int responseCode = httpURLConnection.getResponseCode();
        InAppStoryManager.showDLog("InAppStory_Network", str + " " + httpURLConnection.getURL().toString() + " \nStatus Code: " + responseCode);
        HashMap<String, String> headers = getHeaders(httpURLConnection);
        if (headers.containsKey("Content-Encoding")) {
            str2 = headers.get("Content-Encoding");
        } else {
            str2 = null;
        }
        if (headers.containsKey("content-encoding")) {
            str2 = headers.get("content-encoding");
        }
        if (responseCode != 200 && responseCode != 201 && responseCode != 202) {
            String responseFromStream = getResponseFromStream(httpURLConnection.getErrorStream(), str2);
            InAppStoryManager.showDLog("InAppStory_Network", str + " Error: " + responseFromStream);
            build = new Response.Builder().contentLength((long) responseFromStream.length()).headers(headers).code(responseCode).errorBody(responseFromStream).build();
        } else {
            String responseFromStream2 = getResponseFromStream(httpURLConnection.getInputStream(), str2);
            InAppStoryManager.showDLog("InAppStory_Network", str + " Response: " + responseFromStream2);
            build = new Response.Builder().contentLength((long) responseFromStream2.length()).headers(headers).code(responseCode).body(responseFromStream2).build();
        }
        ApiLogResponse apiLogResponse = new ApiLogResponse();
        apiLogResponse.id = str;
        apiLogResponse.timestamp = System.currentTimeMillis();
        apiLogResponse.contentLength = build.contentLength;
        String str4 = build.body;
        if (str4 != null) {
            apiLogResponse.generateJsonResponse(build.code, str4, build.headers);
        } else {
            apiLogResponse.generateError(build.code, build.errorBody, build.headers);
        }
        InAppStoryManager.sendApiResponseLog(apiLogResponse);
        httpURLConnection.disconnect();
        return build;
    }

    public static InputStream getDecompressedStream(InputStream inputStream, String str) throws Exception {
        if (str != null) {
            if (!str.equals("br")) {
                if (str.equals("gzip")) {
                    return new GZIPInputStream(inputStream);
                }
            } else {
                return new hg0(inputStream);
            }
        }
        return inputStream;
    }

    public static HashMap<String, String> getHeaders(@NonNull HttpURLConnection httpURLConnection) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                hashMap.put(key, entry.getValue().get(0));
            }
        }
        return hashMap;
    }

    public static String getResponseFromStream(InputStream inputStream, String str) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getDecompressedStream(inputStream, str)));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                stringBuffer.append(readLine);
            } else {
                bufferedReader.close();
                return stringBuffer.toString();
            }
        }
    }

    static URL getURL(Request request) throws Exception {
        String url = request.getUrl();
        StringBuilder sb = new StringBuilder();
        if (!request.getVarList().isEmpty() || !request.getVars().isEmpty()) {
            for (String str : request.getVarKeys()) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append((Object) str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((Object) request.getVars().get(str));
            }
            for (Pair<String, String> pair : request.getVarList()) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append((String) pair.first);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((String) pair.second);
            }
            sb = new StringBuilder(CallerData.NA + sb.substring(1));
        }
        return new URL(url + ((Object) sb));
    }

    public static <T> T implement(Class cls, NetworkClient networkClient) {
        NetworkHandler networkHandler = new NetworkHandler();
        networkHandler.networkClient = networkClient;
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, networkHandler);
    }

    public String encode(String str) {
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public Request generateRequest(String str, Annotation[][] annotationArr, Object[] objArr, Request.Builder builder) {
        Annotation[] annotationArr2;
        if (this.networkClient == null) {
            this.networkClient = NetworkClient.getInstance();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        if (this.headers == null) {
            this.headers = this.networkClient.getHeaders();
        }
        String str2 = str;
        String str3 = "";
        String str4 = str3;
        for (int i = 0; i < annotationArr.length; i++) {
            if (objArr[i] != null && (annotationArr2 = annotationArr[i]) != null && annotationArr2.length > 0) {
                Annotation annotation = annotationArr2[0];
                if (annotation instanceof Path) {
                    str2 = str2.replaceFirst("\\{" + ((Path) annotation).value() + "\\}", objArr[i].toString());
                } else if (annotation instanceof Query) {
                    hashMap.put(((Query) annotation).value(), encode(objArr[i].toString()));
                } else if (annotation instanceof QueryObject) {
                    List<Pair<String, String>> convertObjectToQuery = convertObjectToQuery(((QueryObject) annotation).value(), objArr[i].toString());
                    if (convertObjectToQuery != null) {
                        for (int i2 = 0; i2 < convertObjectToQuery.size(); i2++) {
                            arrayList.add(new Pair(convertObjectToQuery.get(i2).first, encode((String) convertObjectToQuery.get(i2).second)));
                        }
                    }
                } else if (annotation instanceof Field) {
                    str3 = str3 + ContainerUtils.FIELD_DELIMITER + ((Field) annotation).value() + ContainerUtils.KEY_VALUE_DELIMITER + encode(objArr[i].toString());
                } else if (annotation instanceof Body) {
                    try {
                        str4 = str4 + JsonParser.getJson(objArr[i]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (!str3.isEmpty() && str3.startsWith(ContainerUtils.FIELD_DELIMITER)) {
            str3 = str3.substring(1);
        }
        String str5 = "" + str3;
        if (!str5.isEmpty() && !str4.isEmpty()) {
            str5 = str5 + "\n";
        }
        String str6 = str5 + str4;
        Request.Builder headers = builder.headers(this.headers);
        if (NetworkClient.getInstance().getBaseUrl() != null) {
            str2 = NetworkClient.getInstance().getBaseUrl() + str2;
        }
        return headers.url(str2).vars(hashMap).varList(arrayList).bodyRaw(str4).bodyEncoded(str3).body(str6).build();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Request invoke(Object obj, Method method, Object[] objArr) {
        if (this.networkClient == null) {
            this.networkClient = NetworkClient.getInstance();
        }
        GET get = (GET) method.getAnnotation(GET.class);
        POST post = (POST) method.getAnnotation(POST.class);
        DELETE delete = (DELETE) method.getAnnotation(DELETE.class);
        PUT put = (PUT) method.getAnnotation(PUT.class);
        if (delete != null) {
            return generateRequest(delete.value(), method.getParameterAnnotations(), objArr, new Request.Builder().delete());
        }
        if (get != null) {
            return generateRequest(get.value(), method.getParameterAnnotations(), objArr, new Request.Builder().get());
        }
        boolean z = method.getAnnotation(FormUrlEncoded.class) != null;
        if (post != null) {
            return generateRequest(post.value(), method.getParameterAnnotations(), objArr, new Request.Builder().post().isFormEncoded(z));
        }
        if (put != null) {
            return generateRequest(put.value(), method.getParameterAnnotations(), objArr, new Request.Builder().put().isFormEncoded(z));
        }
        throw new IllegalStateException("Don't know what to do.");
    }
}
