package com.inappstory.sdk.network.jsapiclient;

import android.content.Context;
import com.inappstory.sdk.InAppStoryService;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public class JsApiRequestAsync implements Callable<JsApiResponse> {
    String body;
    Context context;
    Map<String, String> getParams;
    Map<String, String> headers;
    String method;
    String path;
    String requestId;

    public JsApiRequestAsync(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, String str4, Context context) {
        this.method = str;
        this.path = str2;
        this.headers = map;
        this.getParams = map2;
        this.body = str3;
        this.requestId = str4;
        this.context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public JsApiResponse call() {
        try {
            return JsApiNetwork.sendRequest(this.method, this.path, this.headers, this.getParams, this.body, this.requestId, this.context);
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            JsApiResponse jsApiResponse = new JsApiResponse();
            jsApiResponse.status = 12002;
            jsApiResponse.requestId = this.requestId;
            return jsApiResponse;
        }
    }
}
