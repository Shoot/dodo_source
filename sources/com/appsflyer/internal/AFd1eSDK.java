package com.appsflyer.internal;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import ch.qos.logback.core.joran.action.Action;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1xSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AFd1eSDK extends AFd1kSDK<String> {
    private static final AFd1wSDK[] afWarnLog = {AFd1wSDK.DLSDK, AFd1wSDK.ONELINK, AFd1wSDK.MONITORSDK, AFd1wSDK.REGISTER};
    public final AFa1sSDK AFLogger;
    protected final AFb1gSDK AFLogger$LogLevel;
    private final AFc1cSDK AFVersionDeclaration;

    public AFd1eSDK(@NonNull AFa1sSDK aFa1sSDK, @NonNull AFc1xSDK aFc1xSDK) {
        this(aFa1sSDK, aFc1xSDK, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    @Override // com.appsflyer.internal.AFd1kSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.appsflyer.internal.AFc1oSDK<java.lang.String> AFInAppEventParameterName(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1eSDK.AFInAppEventParameterName(java.lang.String):com.appsflyer.internal.AFc1oSDK");
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected boolean AFLogger() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return this.AFLogger.AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void values(AFa1sSDK aFa1sSDK) {
        boolean z;
        AFd1ySDK aFd1ySDK;
        boolean y;
        if (aFa1sSDK.afErrorLog()) {
            aFa1sSDK.AFInAppEventType(new AFa1xSDK.AFa1wSDK(aFa1sSDK.AFInAppEventType(), ((AFd1kSDK) this).afRDLog.AFKeystoreWrapper.values));
        }
        if (aFa1sSDK.afDebugLog()) {
            aFa1sSDK.AFInAppEventType(((AFd1kSDK) this).afRDLog.values());
        }
        Set<AFd1wSDK> set = this.values;
        if (!set.contains(AFd1wSDK.LAUNCH) && !set.contains(AFd1wSDK.CONVERSION)) {
            z = false;
        } else {
            z = true;
        }
        if (afRDLog() && z) {
            aFa1sSDK.AFInAppEventParameterName(this.AFLogger$LogLevel.AFInAppEventType("appsFlyerCount", 0));
        }
        try {
            if (aFa1sSDK.AFInAppEventType().containsKey("appsflyerKey") && aFa1sSDK.afErrorLog()) {
                new AFa1aSDK();
                aFa1sSDK.valueOf("af_v", AFa1aSDK.valueOf(aFa1sSDK.AFInAppEventType()));
                new AFa1aSDK();
                aFa1sSDK.valueOf("af_v2", AFa1aSDK.values(aFa1sSDK.AFInAppEventType()));
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th)), th);
        }
        if (aFa1sSDK.afInfoLog()) {
            Map map = (Map) aFa1sSDK.AFInAppEventType().get("meta");
            if (map == null) {
                map = new HashMap();
                aFa1sSDK.AFInAppEventType().put("meta", map);
            }
            AFc1cSDK aFc1cSDK = this.AFVersionDeclaration;
            String AFKeystoreWrapper = aFc1cSDK.AFKeystoreWrapper();
            String AFInAppEventParameterName = aFc1cSDK.AFInAppEventParameterName();
            if (AFc1cSDK.AFInAppEventType()) {
                aFd1ySDK = AFd1ySDK.DEFAULT;
            } else {
                aFd1ySDK = AFd1ySDK.API;
            }
            AFc1bSDK aFc1bSDK = new AFc1bSDK(AFKeystoreWrapper, AFInAppEventParameterName, aFd1ySDK);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Action.NAME_ATTRIBUTE, aFc1bSDK.AFInAppEventType);
            AFd1ySDK aFd1ySDK2 = aFc1bSDK.AFKeystoreWrapper;
            if (aFd1ySDK2 != AFd1ySDK.DEFAULT) {
                jSONObject.put("method", aFd1ySDK2.values);
            }
            String str = aFc1bSDK.valueOf;
            if (str != null) {
                y = l0b.y(str);
                if (!y) {
                    jSONObject.put("prefix", aFc1bSDK.valueOf);
                }
            }
            map.put("host", jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1eSDK(@NonNull AFa1sSDK aFa1sSDK, @NonNull AFc1xSDK aFc1xSDK, String str) {
        super(aFa1sSDK.values(), new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, str);
        this.AFLogger = aFa1sSDK;
        this.AFVersionDeclaration = aFc1xSDK.AppsFlyer2dXConversionCallback();
        this.AFLogger$LogLevel = aFc1xSDK.afErrorLog();
        for (AFd1wSDK aFd1wSDK : afWarnLog) {
            if (this.AFKeystoreWrapper == aFd1wSDK) {
                return;
            }
        }
        int i = this.AFLogger.afDebugLog;
        AFd1wSDK aFd1wSDK2 = this.AFKeystoreWrapper;
        if (i <= 0) {
            AFd1wSDK aFd1wSDK3 = AFd1wSDK.CONVERSION;
            if (aFd1wSDK2 != aFd1wSDK3) {
                this.values.add(aFd1wSDK3);
                return;
            }
            return;
        }
        this.AFInAppEventParameterName.add(AFd1wSDK.CONVERSION);
    }
}
