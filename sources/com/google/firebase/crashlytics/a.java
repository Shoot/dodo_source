package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public class a {
    final a12 a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0241a implements dv1<Void, Object> {
        C0241a() {
        }

        @Override // defpackage.dv1
        public Object a(@NonNull y6b<Void> y6bVar) throws Exception {
            if (!y6bVar.q()) {
                rx5.f().e("Error fetching settings.", y6bVar.l());
                return null;
            }
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* loaded from: classes2.dex */
    class b implements Callable<Void> {
        final /* synthetic */ boolean a;
        final /* synthetic */ a12 b;
        final /* synthetic */ bga c;

        b(boolean z, a12 a12Var, bga bgaVar) {
            this.a = z;
            this.b = a12Var;
            this.c = bgaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (this.a) {
                this.b.g(this.c);
                return null;
            }
            return null;
        }
    }

    private a(@NonNull a12 a12Var) {
        this.a = a12Var;
    }

    @NonNull
    public static a a() {
        a aVar = (a) qv3.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(@NonNull qv3 qv3Var, @NonNull ew3 ew3Var, @NonNull gs2<c12> gs2Var, @NonNull gs2<jc> gs2Var2, @NonNull gs2<qx3> gs2Var3) {
        Context k = qv3Var.k();
        String packageName = k.getPackageName();
        rx5 f = rx5.f();
        f.g("Initializing Firebase Crashlytics " + a12.i() + " for " + packageName);
        hu3 hu3Var = new hu3(k);
        ok2 ok2Var = new ok2(qv3Var);
        gt4 gt4Var = new gt4(k, packageName, ew3Var, ok2Var);
        f12 f12Var = new f12(gs2Var);
        pc pcVar = new pc(gs2Var2);
        ExecutorService c = hm3.c("Crashlytics Exception Handler");
        v02 v02Var = new v02(ok2Var, hu3Var);
        zx3.e(v02Var);
        a12 a12Var = new a12(qv3Var, gt4Var, f12Var, ok2Var, pcVar.e(), pcVar.d(), hu3Var, c, v02Var, new ed9(gs2Var3));
        String c2 = qv3Var.n().c();
        String m = ek1.m(k);
        List<lh0> j = ek1.j(k);
        rx5 f2 = rx5.f();
        f2.b("Mapping file ID is: " + m);
        for (lh0 lh0Var : j) {
            rx5.f().b(String.format("Build id for %s on %s: %s", lh0Var.c(), lh0Var.a(), lh0Var.b()));
        }
        try {
            yn a = yn.a(k, gt4Var, c2, m, j, new p13(k));
            rx5 f3 = rx5.f();
            f3.i("Installer package name is: " + a.d);
            ExecutorService c3 = hm3.c("com.google.firebase.crashlytics.startup");
            bga l = bga.l(k, c2, gt4Var, new oq4(), a.f, a.g, hu3Var, ok2Var);
            l.p(c3).j(c3, new C0241a());
            o7b.c(c3, new b(a12Var.o(a, l), a12Var, l));
            return new a(a12Var);
        } catch (PackageManager.NameNotFoundException e) {
            rx5.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public void c(@NonNull String str) {
        this.a.k(str);
    }

    public void d(@NonNull Throwable th) {
        if (th == null) {
            rx5.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.l(th);
        }
    }

    public void e(@NonNull String str, @NonNull String str2) {
        this.a.p(str, str2);
    }
}
