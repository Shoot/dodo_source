package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1uSDK;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AFf1ySDK extends AFf1zSDK {
    public final Map<String, Object> AFInAppEventParameterName;

    public AFf1ySDK(Runnable runnable) {
        super("store", "google", runnable);
        this.AFInAppEventParameterName = new HashMap();
    }

    private static boolean AFInAppEventParameterName(@NonNull Context context) {
        if (!AFf1zSDK.valueOf(context)) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFa1dSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.afRDLog(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFInAppEventType(final Context context) {
        if (!AFInAppEventParameterName(context)) {
            return;
        }
        this.afRDLog = System.currentTimeMillis();
        this.afDebugLog = AFf1uSDK.AFa1ySDK.STARTED;
        addObserver(new AFf1uSDK.AnonymousClass2());
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
            build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.AFf1ySDK.2
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog("Install Referrer service disconnected");
                }

                public final void onInstallReferrerSetupFinished(int i) {
                    AFf1ySDK.this.AFInAppEventParameterName.put("code", String.valueOf(i));
                    AFf1ySDK.this.values.put("api_ver", Long.valueOf(AFa1dSDK.AFKeystoreWrapper(context, "com.android.vending")));
                    AFf1ySDK.this.values.put("api_ver_name", AFa1dSDK.values(context, "com.android.vending"));
                    if (i != -1) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        AFLogger.afWarnLog("responseCode not found.");
                                    } else {
                                        AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                                        AFf1ySDK.this.values.put("response", "DEVELOPER_ERROR");
                                    }
                                } else {
                                    AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                                    AFf1ySDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                                }
                            } else {
                                AFf1ySDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                                AFLogger.afWarnLog("InstallReferrer not supported");
                            }
                        } else {
                            AFf1ySDK.this.values.put("response", "OK");
                            try {
                                AFLogger.afDebugLog("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        AFf1ySDK.this.AFInAppEventParameterName.put("val", installReferrer2);
                                        AFf1ySDK.this.values.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    AFf1ySDK.this.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    AFf1ySDK.this.values.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    AFf1ySDK.this.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                                    AFf1ySDK.this.values.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        AFf1ySDK.this.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError e) {
                                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError e2) {
                                        AFLogger.afErrorLogForExcManagerOnly("some method not exist", e2);
                                    }
                                    if (!hashMap.isEmpty()) {
                                        AFf1ySDK.this.values.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                                    AFf1ySDK.this.AFInAppEventParameterName.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                AFLogger.afWarnLog("Failed to get install referrer: " + th.getMessage());
                                AFf1ySDK.this.AFInAppEventParameterName.put("err", th.getMessage());
                                AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th);
                            }
                        }
                    } else {
                        AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                        AFf1ySDK.this.values.put("response", "SERVICE_DISCONNECTED");
                    }
                    AFLogger.afDebugLog("Install Referrer collected locally");
                    AFf1ySDK.this.valueOf();
                    build.endConnection();
                }
            });
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
