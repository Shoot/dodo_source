package com.inappstory.sdk.network;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.inappstory.sdk.BuildConfig;
import java.lang.reflect.Constructor;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class NetworkClient {
    private static ApiInterface apiInterface;
    private static Context appContext;
    private static NetworkClient instance;
    private static ApiInterface statApiInterface;
    private static NetworkClient statinstance;
    private static Object syncLock = new Object();
    private String baseUrl;
    private Context context;
    private HashMap<String, String> headers;

    /* loaded from: classes3.dex */
    public static class Builder {
        private String baseUrl;
        private Context context;
        private HashMap<String, String> headers;

        public Builder addHeader(String str, String str2) {
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            this.headers.put(str, str2);
            return this;
        }

        public Builder baseUrl(String str) {
            this.baseUrl = str;
            return this;
        }

        public NetworkClient build() {
            return new NetworkClient(this.context, this.baseUrl, this.headers);
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        static String a(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }
    }

    public NetworkClient(Context context, String str, HashMap<String, String> hashMap) {
        this.context = context;
        this.baseUrl = str;
        this.headers = hashMap;
    }

    public static void clear() {
        instance = null;
        statinstance = null;
        apiInterface = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:21:0x00a6, B:23:0x00aa, B:24:0x00b6, B:25:0x00b8, B:11:0x0011, B:13:0x001b, B:14:0x0020, B:16:0x0022, B:20:0x006e), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inappstory.sdk.network.ApiInterface getApi() {
        /*
            java.lang.Object r0 = com.inappstory.sdk.network.NetworkClient.syncLock
            monitor-enter(r0)
            com.inappstory.sdk.network.NetworkClient r1 = com.inappstory.sdk.network.NetworkClient.instance     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L11
            java.lang.String r1 = r1.getBaseUrl()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto La6
            goto L11
        Le:
            r1 = move-exception
            goto Lba
        L11:
            com.inappstory.sdk.network.ApiSettings r1 = com.inappstory.sdk.network.ApiSettings.getInstance()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getCmsUrl()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L22
            com.inappstory.sdk.network.DumbApiInterface r1 = new com.inappstory.sdk.network.DumbApiInterface     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L22:
            android.content.Context r1 = com.inappstory.sdk.network.NetworkClient.appContext     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Le
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.toLanguageTag()     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r3 = new com.inappstory.sdk.network.NetworkClient$Builder     // Catch: java.lang.Throwable -> Le
            r3.<init>()     // Catch: java.lang.Throwable -> Le
            android.content.Context r4 = com.inappstory.sdk.network.NetworkClient.appContext     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r3 = r3.context(r4)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.ApiSettings r4 = com.inappstory.sdk.network.ApiSettings.getInstance()     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r4.getCmsUrl()     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r3 = r3.baseUrl(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = "Accept"
            java.lang.String r5 = "application/json"
            com.inappstory.sdk.network.NetworkClient$Builder r3 = r3.addHeader(r4, r5)     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = "Accept-Language"
            com.inappstory.sdk.network.NetworkClient$Builder r2 = r3.addHeader(r4, r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "X-Device-Id"
            android.content.Context r4 = com.inappstory.sdk.network.NetworkClient.appContext     // Catch: java.lang.Throwable -> Le
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> Le
            java.lang.String r5 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r5)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r2 = r2.addHeader(r3, r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "X-APP-PACKAGE-ID"
            if (r1 == 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r1 = "-"
        L6e:
            com.inappstory.sdk.network.NetworkClient$Builder r1 = r2.addHeader(r3, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "User-Agent"
            android.content.Context r3 = com.inappstory.sdk.network.NetworkClient.appContext     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = getUAString(r3)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r1 = r1.addHeader(r2, r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Authorization"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r3.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = "Bearer "
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.ApiSettings r4 = com.inappstory.sdk.network.ApiSettings.getInstance()     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r4.getApiKey()     // Catch: java.lang.Throwable -> Le
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient$Builder r1 = r1.addHeader(r2, r3)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient r1 = r1.build()     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient.instance = r1     // Catch: java.lang.Throwable -> Le
            r1 = 0
            com.inappstory.sdk.network.NetworkClient.apiInterface = r1     // Catch: java.lang.Throwable -> Le
        La6:
            com.inappstory.sdk.network.ApiInterface r1 = com.inappstory.sdk.network.NetworkClient.apiInterface     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto Lb6
            java.lang.Class<com.inappstory.sdk.network.ApiInterface> r1 = com.inappstory.sdk.network.ApiInterface.class
            com.inappstory.sdk.network.NetworkClient r2 = com.inappstory.sdk.network.NetworkClient.instance     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = com.inappstory.sdk.network.NetworkHandler.implement(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.ApiInterface r1 = (com.inappstory.sdk.network.ApiInterface) r1     // Catch: java.lang.Throwable -> Le
            com.inappstory.sdk.network.NetworkClient.apiInterface = r1     // Catch: java.lang.Throwable -> Le
        Lb6:
            com.inappstory.sdk.network.ApiInterface r1 = com.inappstory.sdk.network.NetworkClient.apiInterface     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Lba:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.network.NetworkClient.getApi():com.inappstory.sdk.network.ApiInterface");
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static String getDefaultUserAgentString(Context context) {
        try {
            return a.a(context);
        } catch (Exception unused) {
            return getDefaultUserStringOld(context);
        }
    }

    public static String getDefaultUserStringOld(Context context) {
        try {
            try {
                Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                declaredConstructor.setAccessible(true);
                String userAgentString = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                declaredConstructor.setAccessible(false);
                return userAgentString;
            } catch (Exception unused) {
                return System.getProperty("http.agent");
            }
        } catch (Exception unused2) {
            return new WebView(context).getSettings().getUserAgentString();
        }
    }

    public static NetworkClient getInstance() {
        if (instance == null) {
            instance = new Builder().build();
        }
        return instance;
    }

    public static ApiInterface getStatApi() {
        if (statinstance == null) {
            statinstance = new Builder().context(appContext).baseUrl(ApiSettings.getInstance().getCmsUrl()).addHeader("User-Agent", getUAString(appContext)).build();
        }
        if (statApiInterface == null) {
            statApiInterface = (ApiInterface) NetworkHandler.implement(ApiInterface.class, statinstance);
        }
        return statApiInterface;
    }

    private static String getSystemUA() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property.trim();
        }
        return "";
    }

    public static String getUAString(Context context) {
        String defaultUserAgentString;
        String str;
        if (context == null) {
            return "InAppStorySDK/761 " + getSystemUA();
        }
        String systemUA = getSystemUA();
        String str2 = "";
        if (!systemUA.isEmpty()) {
            String str3 = BuildConfig.VERSION_NAME;
            int i = BuildConfig.VERSION_CODE;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                i = packageInfo.versionCode;
                str3 = packageInfo.versionName;
                str = packageInfo.packageName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                str = "";
            }
            defaultUserAgentString = "InAppStorySDK/761 " + systemUA + " Application/" + i + " (" + str + " " + str3 + ")";
        } else {
            defaultUserAgentString = getDefaultUserAgentString(context);
        }
        for (int i2 = 0; i2 < defaultUserAgentString.length(); i2++) {
            char charAt = defaultUserAgentString.charAt(i2);
            if (charAt > 31 && charAt < 127) {
                str2 = str2 + charAt;
            }
        }
        return str2;
    }

    public static void setContext(Context context) {
        appContext = context;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public Context getContext() {
        return this.context;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }
}
