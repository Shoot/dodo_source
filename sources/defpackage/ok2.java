package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: DataCollectionArbiter.java */
/* renamed from: ok2  reason: default package */
/* loaded from: classes2.dex */
public class ok2 {
    private final SharedPreferences a;
    private final qv3 b;
    private final Object c;
    a7b<Void> d;
    boolean e;
    private boolean f;
    private Boolean g;
    private final a7b<Void> h;

    public ok2(qv3 qv3Var) {
        Object obj = new Object();
        this.c = obj;
        this.d = new a7b<>();
        this.e = false;
        this.f = false;
        this.h = new a7b<>();
        Context k = qv3Var.k();
        this.b = qv3Var;
        this.a = ek1.q(k);
        Boolean b = b();
        this.g = b == null ? a(k) : b;
        synchronized (obj) {
            try {
                if (d()) {
                    this.d.e(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g = g(context);
        if (g == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g));
    }

    private Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private boolean e() {
        try {
            return this.b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.g == null) {
            str2 = "global Firebase setting";
        } else if (this.f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        rx5.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            rx5.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    public void c(boolean z) {
        if (z) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean e;
        try {
            Boolean bool = this.g;
            if (bool != null) {
                e = bool.booleanValue();
            } else {
                e = e();
            }
            f(e);
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public y6b<Void> h() {
        y6b<Void> a;
        synchronized (this.c) {
            a = this.d.a();
        }
        return a;
    }

    public y6b<Void> i(Executor executor) {
        return gvb.o(executor, this.h.a(), h());
    }
}
