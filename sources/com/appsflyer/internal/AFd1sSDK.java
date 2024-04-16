package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
/* loaded from: classes.dex */
public final class AFd1sSDK extends AFd1kSDK<String> {
    @NonNull
    private final String AFLogger;
    @Nullable
    private final AFe1tSDK afErrorLogForExcManagerOnly;

    public AFd1sSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull String str, @Nullable AFe1tSDK aFe1tSDK) {
        super(AFd1wSDK.IMPRESSIONS, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, str);
        this.AFLogger = str;
        this.afErrorLogForExcManagerOnly = aFe1tSDK;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return this.afErrorLog.AFInAppEventType(this.AFLogger);
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        AFc1dSDK<Result> aFc1dSDK = ((AFd1kSDK) this).afDebugLog;
        if (aFc1dSDK != 0) {
            int statusCode = aFc1dSDK.getStatusCode();
            if (statusCode != 200) {
                if (statusCode != 301 && statusCode != 302) {
                    StringBuilder sb = new StringBuilder("call to ");
                    sb.append(this.AFLogger);
                    sb.append(" failed: ");
                    sb.append(statusCode);
                    AFLogger.afInfoLog(sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                sb2.append(this.AFLogger);
                AFLogger.afInfoLog(sb2.toString(), false);
                String AFInAppEventType = aFc1dSDK.AFInAppEventType("Location");
                AFe1tSDK aFe1tSDK = this.afErrorLogForExcManagerOnly;
                if (aFe1tSDK != null && AFInAppEventType != null) {
                    aFe1tSDK.AFInAppEventParameterName = AFInAppEventType;
                    Context context = aFe1tSDK.AFInAppEventType.get();
                    if (context != null) {
                        try {
                            if (aFe1tSDK.AFInAppEventParameterName != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFe1tSDK.AFInAppEventParameterName)).setFlags(268435456));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion impressions success: ");
            sb3.append(this.AFLogger);
            AFLogger.afInfoLog(sb3.toString(), false);
        }
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return null;
    }
}
