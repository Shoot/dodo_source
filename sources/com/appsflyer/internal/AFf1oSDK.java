package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1uSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class AFf1oSDK extends AFf1zSDK {
    public AFf1oSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean AFKeystoreWrapper(@NonNull Context context) {
        if (!AFf1zSDK.valueOf(context)) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.miui.referrer.api.GetAppsReferrerClient");
            sb.append(" not found");
            AFLogger.afRDLog(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFInAppEventType(final Context context) {
        if (!AFKeystoreWrapper(context)) {
            return;
        }
        this.afRDLog = System.currentTimeMillis();
        this.afDebugLog = AFf1uSDK.AFa1ySDK.STARTED;
        addObserver(new AFf1uSDK.AnonymousClass2());
        final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
        build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFf1oSDK.3
            public final void onGetAppsReferrerSetupFinished(int i) {
                AFf1oSDK.this.values.put("api_ver", Long.valueOf(AFa1dSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks")));
                AFf1oSDK.this.values.put("api_ver_name", AFa1dSDK.values(context, "com.xiaomi.mipicks"));
                if (i != -1) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        AFLogger.afWarnLog("responseCode not found.");
                                    } else {
                                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                        AFf1oSDK.this.values.put("response", "PERMISSION_ERROR");
                                    }
                                } else {
                                    AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                    AFf1oSDK.this.values.put("response", "DEVELOPER_ERROR");
                                }
                            } else {
                                AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                AFf1oSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFf1oSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                        }
                    } else {
                        AFf1oSDK aFf1oSDK = AFf1oSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFf1oSDK.values.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFf1oSDK.values.put("referrer", installReferrer2);
                                }
                                aFf1oSDK.values.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFf1oSDK.values.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFf1oSDK.values.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            AFLogger.afWarnLog(sb.toString());
                        }
                    }
                } else {
                    AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                    AFf1oSDK.this.values.put("response", "SERVICE_DISCONNECTED");
                }
                AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                AFf1oSDK.this.valueOf();
                build.endConnection();
            }

            public final void onGetAppsServiceDisconnected() {
            }
        });
    }
}
