package com.inappstory.sdk.network.jsapiclient;

import android.content.Context;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.utils.SessionManager;
import com.inappstory.sdk.stories.utils.TaskRunner;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class JsApiClient {
    Context context;
    TaskRunner taskRunner = new TaskRunner();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements TaskRunner.Callback<JsApiResponse> {
        final /* synthetic */ String a;
        final /* synthetic */ JsApiResponseCallback b;
        final /* synthetic */ String c;

        b(String str, JsApiResponseCallback jsApiResponseCallback, String str2) {
            this.a = str;
            this.b = jsApiResponseCallback;
            this.c = str2;
        }

        @Override // com.inappstory.sdk.stories.utils.TaskRunner.Callback
        /* renamed from: a */
        public void onComplete(JsApiResponse jsApiResponse) {
            ProfilingManager.getInstance().setReady(this.a);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("requestId", jsApiResponse.requestId);
                jSONObject.put("status", jsApiResponse.status);
                jSONObject.put("data", JsApiClient.this.oldEscape(jsApiResponse.data));
                try {
                    jSONObject.put("headers", new JSONObject(jsApiResponse.headers));
                } catch (Exception unused) {
                }
                this.b.onJsApiResponse(jSONObject.toString(), this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public JsApiClient(Context context) {
        this.context = context;
    }

    void checkSessionAndSendRequest(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, String str4, String str5, String str6, JsApiResponseCallback jsApiResponseCallback) {
        if (Session.needToUpdate()) {
            SessionManager.getInstance().useOrOpenSession(new a(str, str2, map, map2, str3, str4, str5, str6, jsApiResponseCallback));
        } else {
            sendRequest(str, str2, map, map2, str3, str4, str5, str6, jsApiResponseCallback);
        }
    }

    String oldEscape(String str) {
        return JSONObject.quote(str).replaceFirst("^\"(.*)\"$", "$1").replaceAll("\n", " ").replaceAll("\r", " ");
    }

    public void sendApiRequest(String str, JsApiResponseCallback jsApiResponseCallback) {
        Map<String, String> map;
        JsApiRequestConfig jsApiRequestConfig = (JsApiRequestConfig) JsonParser.fromJson(str, JsApiRequestConfig.class);
        String str2 = jsApiRequestConfig.headers;
        Map<String, String> map2 = null;
        if (str2 != null && !str2.isEmpty()) {
            map = JsonParser.toMap(jsApiRequestConfig.headers);
        } else {
            map = null;
        }
        String str3 = jsApiRequestConfig.params;
        if (str3 != null && !str3.isEmpty()) {
            map2 = JsonParser.toMap(jsApiRequestConfig.params);
        }
        checkSessionAndSendRequest(jsApiRequestConfig.method, jsApiRequestConfig.url, map, map2, jsApiRequestConfig.data, jsApiRequestConfig.id, jsApiRequestConfig.cb, jsApiRequestConfig.profilingKey, jsApiResponseCallback);
    }

    void sendRequest(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, String str4, String str5, String str6, JsApiResponseCallback jsApiResponseCallback) {
        String str7;
        if (str6 != null && !str6.isEmpty()) {
            str7 = ProfilingManager.getInstance().addTask(str6);
        } else {
            str7 = null;
        }
        this.taskRunner.executeAsync(new JsApiRequestAsync(str, str2, map, map2, str3, str4, this.context), new b(str7, jsApiResponseCallback, str5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements OpenSessionCallback {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;
        final /* synthetic */ Map d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ JsApiResponseCallback i;

        a(String str, String str2, Map map, Map map2, String str3, String str4, String str5, String str6, JsApiResponseCallback jsApiResponseCallback) {
            this.a = str;
            this.b = str2;
            this.c = map;
            this.d = map2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = jsApiResponseCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            JsApiClient.this.sendRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
        }
    }
}
