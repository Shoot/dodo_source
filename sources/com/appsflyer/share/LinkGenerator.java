package com.appsflyer.share;

import android.content.Context;
import android.support.annotation.WorkerThread;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFf1lSDK;
import com.huawei.hms.opendevice.c;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> AFVersionDeclaration = new HashMap();
    private String afDebugLog;
    private String afErrorLog;
    private String afErrorLogForExcManagerOnly;
    private String afInfoLog;
    private String afRDLog;
    private String getLevel;
    private final String valueOf;
    String values;

    /* loaded from: classes.dex */
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.valueOf = str;
    }

    private Map<String, String> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.valueOf);
        String str = this.afErrorLog;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.afDebugLog;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            hashMap.put(c.a, str4);
        }
        String str5 = this.afInfoLog;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.afRDLog;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.getLevel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getLevel);
            String str7 = this.AFLogger;
            if (str7 != null) {
                String str8 = "";
                this.AFLogger = str7.replaceFirst("^[/]", "");
                if (!this.getLevel.endsWith("/")) {
                    str8 = "/";
                }
                sb.append(str8);
                sb.append(this.AFLogger);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.AFVersionDeclaration.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1vSDK.AFInAppEventParameterName(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.AFVersionDeclaration.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.AFVersionDeclaration.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.values;
        if (str != null && str.startsWith("http")) {
            sb.append(this.values);
        } else {
            sb.append(String.format(AFf1lSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        }
        if (this.AFInAppEventType != null) {
            sb.append('/');
            sb.append(this.AFInAppEventType);
        }
        Map<String, String> AFInAppEventType = AFInAppEventType();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFInAppEventType.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.afErrorLogForExcManagerOnly;
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public String getChannel() {
        return this.AFKeystoreWrapper;
    }

    public String getMediaSource() {
        return this.valueOf;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.AFVersionDeclaration);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            this.values = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : "go.onelink.me", str);
        } else {
            this.values = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()), str3);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afErrorLogForExcManagerOnly = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.afDebugLog = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.afErrorLog = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.afErrorLogForExcManagerOnly;
        Map<String, String> AFInAppEventType = AFInAppEventType();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1zSDK.AFInAppEventType().AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventParameterName = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName();
        AFd1oSDK aFd1oSDK = new AFd1oSDK(AFInAppEventParameterName, UUID.randomUUID(), string, AFInAppEventType, str, responseListener);
        AFd1xSDK afDebugLog = AFInAppEventParameterName.afDebugLog();
        afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1oSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
