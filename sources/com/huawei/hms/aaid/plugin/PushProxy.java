package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    v6b<Void> subscribe(Context context, String str, String str2);

    v6b<Void> turnOff(Context context, String str);

    v6b<Void> turnOn(Context context, String str);

    v6b<Void> unsubscribe(Context context, String str, String str2);
}
