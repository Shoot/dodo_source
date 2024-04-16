package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFd1xSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1qSDK {
    static final List<String> AFInAppEventParameterName = new ArrayList();
    public static String[] AFKeystoreWrapper;
    @VisibleForTesting
    private static AFa1qSDK afInfoLog;
    @VisibleForTesting
    public static Intent values;
    public DeepLinkListener AFInAppEventType;
    @Nullable
    public List<List<String>> afDebugLog = new ArrayList();
    public Map<String, String> afErrorLog;
    public String valueOf;

    public static AFa1qSDK AFInAppEventParameterName() {
        if (afInfoLog == null) {
            afInfoLog = new AFa1qSDK();
        }
        return afInfoLog;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFKeystoreWrapper(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1qSDK.AFKeystoreWrapper(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFd1mSDK aFd1mSDK = new AFd1mSDK(context, map, uri, AFInAppEventParameterName);
        AFb1zSDK.AFInAppEventType().AFKeystoreWrapper(context);
        AFd1xSDK afDebugLog = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName().afDebugLog();
        afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1mSDK));
        values = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType(Map<String, Object> map, Intent intent, Context context) {
        AFb1zSDK.AFInAppEventType().AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventParameterName2 = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName();
        AFb1gSDK afErrorLog = AFInAppEventParameterName2.afErrorLog();
        if (!AFKeystoreWrapper(intent, context, map) && this.AFInAppEventType != null && AFInAppEventParameterName2.values().values.AFInAppEventType("appsFlyerCount", 0) == 0 && !afErrorLog.valueOf("ddl_sent")) {
            AFb1pSDK aFb1pSDK = new AFb1pSDK(context, AFInAppEventParameterName2);
            AFd1xSDK afDebugLog = AFInAppEventParameterName2.afDebugLog();
            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(new AFd1lSDK(aFb1pSDK)));
        }
        afErrorLog.valueOf("ddl_sent", true);
    }

    @Nullable
    private Uri AFInAppEventParameterName(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    public static Uri valueOf(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }
}
