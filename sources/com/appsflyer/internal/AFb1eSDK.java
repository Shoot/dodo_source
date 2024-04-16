package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFb1eSDK implements AFb1gSDK {
    private final SharedPreferences values;

    public AFb1eSDK(SharedPreferences sharedPreferences) {
        this.values = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.values.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventType(String str, long j) {
        this.values.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFKeystoreWrapper(String str) {
        this.values.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final String valueOf(String str, String str2) {
        try {
            return this.values.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventParameterName(String str, int i) {
        this.values.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final int AFInAppEventType(String str, int i) {
        try {
            return this.values.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean valueOf(String str) {
        try {
            return this.values.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void valueOf(String str, boolean z) {
        this.values.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final long valueOf(String str, long j) {
        try {
            return this.values.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }
}
