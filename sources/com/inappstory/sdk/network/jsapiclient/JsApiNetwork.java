package com.inappstory.sdk.network.jsapiclient;

import android.content.Context;
import android.provider.Settings;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.ContainerUtils;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.ApiSettings;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequest;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequestHeader;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class JsApiNetwork {
    static URL getURL(String str, Map<String, String> map) throws Exception {
        String str2 = NetworkClient.getInstance().getBaseUrl() + "v2/" + str;
        String str3 = "";
        if (map != null && map.keySet().size() > 0) {
            for (String str4 : map.keySet()) {
                str3 = str3 + ContainerUtils.FIELD_DELIMITER + ((Object) str4) + ContainerUtils.KEY_VALUE_DELIMITER + map.get(str4);
            }
            str3 = CallerData.NA + str3.substring(1);
        }
        return new URL(str2 + str3);
    }

    public static JsApiResponse sendRequest(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, String str4, Context context) throws Exception {
        boolean z;
        String str5;
        String responseFromStream;
        Response build;
        JsApiResponse jsApiResponse = new JsApiResponse();
        jsApiResponse.requestId = str4;
        if (!InAppStoryService.isConnected()) {
            jsApiResponse.status = 12163;
            return jsApiResponse;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(getURL(str2, map2).openConnection()));
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestMethod(str);
        String packageName = context.getPackageName();
        String languageTag = Locale.getDefault().toLanguageTag();
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Accept-Language", languageTag);
        if (packageName == null) {
            packageName = "-";
        }
        httpURLConnection.setRequestProperty("X-APP-PACKAGE-ID", packageName);
        httpURLConnection.setRequestProperty("User-Agent", NetworkClient.getUAString(context));
        httpURLConnection.setRequestProperty("Authorization", "Bearer " + ApiSettings.getInstance().getApiKey());
        httpURLConnection.setRequestProperty("X-Device-Id", Settings.Secure.getString(context.getContentResolver(), "android_id"));
        httpURLConnection.setRequestProperty("X-Request-ID", UUID.randomUUID().toString());
        if (InAppStoryService.isNotNull()) {
            httpURLConnection.setRequestProperty("X-User-id", InAppStoryService.getInstance().getUserId());
        }
        httpURLConnection.setRequestProperty("auth-session-id", Session.getInstance().id);
        httpURLConnection.setRequestProperty("Accept-Encoding", "br, gzip");
        if (!str.equals(NetworkHandler.GET) && str3 != null && !str3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
        }
        if (map != null) {
            for (String str6 : map.keySet()) {
                httpURLConnection.setRequestProperty(str6, map.get(str6));
            }
        }
        ApiLogRequest apiLogRequest = new ApiLogRequest();
        String uuid = UUID.randomUUID().toString();
        apiLogRequest.id = uuid;
        apiLogRequest.url = httpURLConnection.getURL().toString();
        apiLogRequest.timestamp = System.currentTimeMillis();
        apiLogRequest.method = str;
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                apiLogRequest.headers.add(new ApiLogRequestHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        if (z) {
            apiLogRequest.body = str3;
            InAppStoryManager.sendApiRequestLog(apiLogRequest);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            outputStreamWriter.write(str3);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            outputStream.close();
        } else {
            InAppStoryManager.sendApiRequestLog(apiLogRequest);
        }
        int responseCode = httpURLConnection.getResponseCode();
        jsApiResponse.status = Integer.valueOf(responseCode);
        HashMap hashMap = new HashMap();
        if (httpURLConnection.getHeaderFields() != null && httpURLConnection.getHeaderFields().size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (String str7 : httpURLConnection.getHeaderFields().keySet()) {
                if (httpURLConnection.getHeaderFields().get(str7) != null && httpURLConnection.getHeaderFields().get(str7).size() > 0 && str7 != null) {
                    String str8 = httpURLConnection.getHeaderFields().get(str7).get(0);
                    jSONObject.put(str7, str8);
                    hashMap.put(str7, str8);
                }
            }
            jsApiResponse.headers = jSONObject.toString();
        }
        HashMap<String, String> headers = NetworkHandler.getHeaders(httpURLConnection);
        if (headers.containsKey("Content-Encoding")) {
            str5 = headers.get("Content-Encoding");
        } else {
            str5 = null;
        }
        if (headers.containsKey("content-encoding")) {
            str5 = headers.get("content-encoding");
        }
        if (responseCode != 200 && responseCode != 201 && responseCode != 202) {
            responseFromStream = NetworkHandler.getResponseFromStream(httpURLConnection.getErrorStream(), str5);
            long length = responseFromStream.length();
            InAppStoryManager.showDLog("InAppStory_Network", str4 + " Error: " + responseFromStream);
            build = new Response.Builder().contentLength(length).headers(headers).code(responseCode).errorBody(responseFromStream).build();
        } else {
            responseFromStream = NetworkHandler.getResponseFromStream(httpURLConnection.getInputStream(), str5);
            long length2 = responseFromStream.length();
            InAppStoryManager.showDLog("InAppStory_Network", str4 + " Response: " + responseFromStream);
            build = new Response.Builder().contentLength(length2).headers(headers).code(responseCode).body(responseFromStream).build();
        }
        ApiLogResponse apiLogResponse = new ApiLogResponse();
        apiLogResponse.id = uuid;
        apiLogResponse.timestamp = System.currentTimeMillis();
        apiLogResponse.contentLength = httpURLConnection.getContentLength();
        String str9 = build.body;
        if (str9 != null) {
            apiLogResponse.generateJsonResponse(build.code, str9, build.headers);
        } else {
            apiLogResponse.generateError(build.code, build.errorBody, build.headers);
        }
        jsApiResponse.data = responseFromStream;
        httpURLConnection.disconnect();
        InAppStoryManager.sendApiResponseLog(apiLogResponse);
        return jsApiResponse;
    }
}
