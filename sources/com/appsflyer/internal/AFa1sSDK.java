package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFa1sSDK {
    @Nullable
    String AFInAppEventParameterName;
    @Nullable
    public AppsFlyerRequestListener AFInAppEventType;
    @Nullable
    public Application AFKeystoreWrapper;
    public String AFLogger;
    public int afDebugLog;
    public String afErrorLog;
    private byte[] afErrorLogForExcManagerOnly;
    String afInfoLog;
    String afRDLog;
    private final boolean afWarnLog;
    public final Map<String, Object> valueOf;
    @Nullable
    Map<String, Object> values;

    public AFa1sSDK() {
        this(null, null, null, null);
    }

    public final AFa1sSDK AFInAppEventParameterName(byte[] bArr) {
        this.afErrorLogForExcManagerOnly = bArr;
        return this;
    }

    public AFa1sSDK AFInAppEventType(String str) {
        this.AFLogger = str;
        return this;
    }

    public final boolean AFKeystoreWrapper() {
        if (this.afRDLog == null && this.afErrorLog == null) {
            return true;
        }
        return false;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return false;
    }

    public boolean afRDLog() {
        return true;
    }

    public final byte[] valueOf() {
        return this.afErrorLogForExcManagerOnly;
    }

    public abstract AFd1wSDK values();

    public AFa1sSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Context context) {
        this.valueOf = new HashMap();
        this.afRDLog = str;
        this.AFLogger = str2;
        this.afWarnLog = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
    }

    public final boolean AFInAppEventParameterName() {
        return this.afWarnLog;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.valueOf;
    }

    public final AFa1sSDK valueOf(String str, Object obj) {
        synchronized (this.valueOf) {
            this.valueOf.put(str, obj);
        }
        return this;
    }

    public final AFa1sSDK AFInAppEventParameterName(int i) {
        this.afDebugLog = i;
        synchronized (this.valueOf) {
            try {
                if (this.valueOf.containsKey("counter")) {
                    this.valueOf.put("counter", Integer.toString(i));
                }
                if (this.valueOf.containsKey("launch_counter")) {
                    this.valueOf.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final AFa1sSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.valueOf.putAll(map);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public final String AFInAppEventParameterName(String str) {
        String valueOf = AFb1zSDK.AFInAppEventType().valueOf(this.AFKeystoreWrapper);
        return valueOf != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, valueOf).build().toString() : str;
    }
}
