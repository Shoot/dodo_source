package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class AFd1oSDK extends AFd1kSDK<String> {
    private final AFb1fSDK AFLogger;
    @Nullable
    private final String AFLogger$LogLevel;
    private final Map<String, String> AFVersionDeclaration;
    @Nullable
    private final LinkGenerator.ResponseListener afErrorLogForExcManagerOnly;
    private final String afWarnLog;
    private final UUID getLevel;

    public AFd1oSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener) {
        super(AFd1wSDK.ONELINK, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        this.AFLogger = aFc1xSDK.values();
        this.getLevel = uuid;
        this.afWarnLog = str;
        this.AFVersionDeclaration = new HashMap(map);
        this.afErrorLogForExcManagerOnly = responseListener;
        this.AFLogger$LogLevel = str2;
    }

    private String afWarnLog() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.AFLogger.valueOf.values.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.afWarnLog, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFVersionDeclaration);
        AFb1zSDK.AFInAppEventType();
        String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            addParameters.setReferrerCustomerId(AFKeystoreWrapper);
        }
        return addParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return this.afErrorLog.values(this.afWarnLog, this.AFVersionDeclaration, this.AFLogger$LogLevel, this.getLevel, str);
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        ResponseNetwork responseNetwork;
        super.AFKeystoreWrapper();
        LinkGenerator.ResponseListener responseListener = this.afErrorLogForExcManagerOnly;
        if (responseListener != null) {
            if (this.AFInAppEventType == AFc1aSDK.SUCCESS && (responseNetwork = ((AFd1kSDK) this).afDebugLog) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            if (afDebugLog instanceof ParsingException) {
                if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(afWarnLog());
                    return;
                }
            }
            responseListener.onResponse(afWarnLog());
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

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean getLevel() {
        return false;
    }
}
