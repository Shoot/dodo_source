package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public class p {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(qv3 qv3Var) {
        String d = qv3Var.n().d();
        if (d != null) {
            return d;
        }
        String c = qv3Var.n().c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        try {
            if (this.b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        try {
            if (this.c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f;
        try {
            if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
                this.d = f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    synchronized int e() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!ad8.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (ad8.h()) {
            this.e = 2;
        } else {
            this.e = 1;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
