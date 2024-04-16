package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class AFc1sSDK implements AFc1vSDK, AFc1zSDK, AFd1zSDK {
    @VisibleForTesting
    private static String AFKeystoreWrapper;
    @VisibleForTesting
    private static String values;
    @Nullable
    private final byte[] AFInAppEventParameterName;
    @NonNull
    private final String AFInAppEventType;
    private boolean AFLogger;
    private int AFVersionDeclaration;
    private final boolean afDebugLog;
    private boolean afErrorLog;
    private boolean afInfoLog;
    @NonNull
    private final Map<String, String> afRDLog;
    @NonNull
    private final String valueOf;

    public AFc1sSDK() {
    }

    public AFc1sSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this.afInfoLog = true;
        this.afErrorLog = false;
        this.AFLogger = true;
        this.AFVersionDeclaration = -1;
        this.valueOf = str;
        this.AFInAppEventParameterName = bArr;
        this.AFInAppEventType = str2;
        this.afRDLog = map;
        this.afDebugLog = z;
    }

    public AFc1sSDK AFInAppEventParameterName(int i) {
        this.AFVersionDeclaration = i;
        return this;
    }

    @Nullable
    public byte[] AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    @NonNull
    public String AFLogger() {
        return this.AFInAppEventType;
    }

    public boolean AFVersionDeclaration() {
        return this.afErrorLog;
    }

    public int afDebugLog() {
        return this.AFVersionDeclaration;
    }

    public boolean afErrorLog() {
        return this.afDebugLog;
    }

    public AFc1sSDK afErrorLogForExcManagerOnly() {
        this.AFLogger = false;
        return this;
    }

    @NonNull
    public Map<String, String> afInfoLog() {
        return this.afRDLog;
    }

    public boolean afRDLog() {
        return this.afInfoLog;
    }

    public boolean getLevel() {
        return this.AFLogger;
    }

    public AFc1sSDK valueOf(boolean z) {
        this.afErrorLog = z;
        return this;
    }

    @NonNull
    public String values() {
        return this.valueOf;
    }

    public AFc1sSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public static void valueOf(String str) {
        if (values == null) {
            values(AFb1zSDK.AFInAppEventType().AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType);
        }
        String str2 = values;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFKeystoreWrapper));
        }
    }

    public static void values(String str) {
        values = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i != str.length() - 1) {
                sb.append(Marker.ANY_MARKER);
            } else {
                sb.append(str.charAt(i));
            }
        }
        AFKeystoreWrapper = sb.toString();
    }
}
