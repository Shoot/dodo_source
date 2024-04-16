package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
/* compiled from: DataCollectionConfigStorage.java */
/* renamed from: pk2  reason: default package */
/* loaded from: classes2.dex */
public class pk2 {
    private final Context a;
    private final SharedPreferences b;
    private final ms8 c;
    private boolean d;

    public pk2(Context context, String str, ms8 ms8Var) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.c = ms8Var;
        this.d = c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return iu1.b(context);
    }

    private boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.d;
    }
}
