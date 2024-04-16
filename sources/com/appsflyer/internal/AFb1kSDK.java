package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* loaded from: classes.dex */
public final class AFb1kSDK {
    public int AFInAppEventParameterName;
    public String AFInAppEventType;
    public long AFKeystoreWrapper;
    public String afErrorLog;
    public Throwable afInfoLog;
    public AFf1xSDK afRDLog;
    @NonNull
    public String valueOf;
    public long values;

    public AFb1kSDK() {
    }

    public AFb1kSDK(String str, String str2, long j, long j2, int i, AFf1xSDK aFf1xSDK, String str3, Throwable th) {
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.values = j;
        this.AFKeystoreWrapper = j2;
        this.AFInAppEventParameterName = i;
        this.afRDLog = aFf1xSDK;
        this.afErrorLog = str3;
        this.afInfoLog = th;
    }

    @Nullable
    public static Uri values(Activity activity) {
        Uri referrer;
        if (Build.VERSION.SDK_INT >= 22) {
            referrer = activity.getReferrer();
            return referrer;
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
}
