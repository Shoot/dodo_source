package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CrashlyticsCore.java */
/* renamed from: a12  reason: default package */
/* loaded from: classes2.dex */
public class a12 {
    private final Context a;
    private final qv3 b;
    private final ok2 c;
    private b12 f;
    private b12 g;
    private boolean h;
    private y02 i;
    private final gt4 j;
    private final hu3 k;
    public final tf0 l;
    private final sc m;
    private final ExecutorService n;
    private final w02 o;
    private final v02 p;
    private final c12 q;
    private final ed9 r;
    private final long e = System.currentTimeMillis();
    private final w77 d = new w77();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: a12$a */
    /* loaded from: classes2.dex */
    public class a implements Callable<y6b<Void>> {
        final /* synthetic */ gga a;

        a(gga ggaVar) {
            this.a = ggaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public y6b<Void> call() throws Exception {
            return a12.this.f(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: a12$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        final /* synthetic */ gga a;

        b(gga ggaVar) {
            this.a = ggaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a12.this.f(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: a12$c */
    /* loaded from: classes2.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d = a12.this.f.d();
                if (!d) {
                    rx5.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                rx5.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: a12$d */
    /* loaded from: classes2.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(a12.this.i.s());
        }
    }

    public a12(qv3 qv3Var, gt4 gt4Var, c12 c12Var, ok2 ok2Var, tf0 tf0Var, sc scVar, hu3 hu3Var, ExecutorService executorService, v02 v02Var, ed9 ed9Var) {
        this.b = qv3Var;
        this.c = ok2Var;
        this.a = qv3Var.k();
        this.j = gt4Var;
        this.q = c12Var;
        this.l = tf0Var;
        this.m = scVar;
        this.n = executorService;
        this.k = hu3Var;
        this.o = new w02(executorService);
        this.p = v02Var;
        this.r = ed9Var;
    }

    private void d() {
        try {
            this.h = Boolean.TRUE.equals((Boolean) gvb.f(this.o.h(new d())));
        } catch (Exception unused) {
            this.h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y6b<Void> f(gga ggaVar) {
        n();
        try {
            this.l.a(new sf0() { // from class: z02
                @Override // defpackage.sf0
                public final void a(String str) {
                    a12.this.k(str);
                }
            });
            this.i.S();
            if (!ggaVar.b().b.a) {
                rx5.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return o7b.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.z(ggaVar)) {
                rx5.f().k("Previous sessions could not be finalized.");
            }
            return this.i.V(ggaVar.a());
        } catch (Exception e) {
            rx5.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return o7b.d(e);
        } finally {
            m();
        }
    }

    private void h(gga ggaVar) {
        Future<?> submit = this.n.submit(new b(ggaVar));
        rx5.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            rx5.f().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            rx5.f().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            rx5.f().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String i() {
        return "18.6.2";
    }

    static boolean j(String str, boolean z) {
        if (!z) {
            rx5.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    boolean e() {
        return this.f.c();
    }

    public y6b<Void> g(gga ggaVar) {
        return gvb.h(this.n, new a(ggaVar));
    }

    public void k(String str) {
        this.i.Z(System.currentTimeMillis() - this.e, str);
    }

    public void l(@NonNull Throwable th) {
        this.i.Y(Thread.currentThread(), th);
    }

    void m() {
        this.o.h(new c());
    }

    void n() {
        this.o.b();
        this.f.a();
        rx5.f().i("Initialization marker file was created.");
    }

    public boolean o(yn ynVar, gga ggaVar) {
        if (j(ynVar.b, ek1.i(this.a, "com.crashlytics.RequireBuildId", true))) {
            String al0Var = new al0(this.j).toString();
            try {
                this.g = new b12("crash_marker", this.k);
                this.f = new b12("initialization_marker", this.k);
                mub mubVar = new mub(al0Var, this.k, this.o);
                sw5 sw5Var = new sw5(this.k);
                zi6 zi6Var = new zi6(1024, new be9(10));
                this.r.c(mubVar);
                this.i = new y02(this.a, this.o, this.j, this.c, this.k, this.g, ynVar, mubVar, sw5Var, bfa.h(this.a, this.j, this.k, ynVar, sw5Var, mubVar, zi6Var, ggaVar, this.d, this.p), this.q, this.m, this.p);
                boolean e = e();
                d();
                this.i.x(al0Var, Thread.getDefaultUncaughtExceptionHandler(), ggaVar);
                if (e && ek1.d(this.a)) {
                    rx5.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(ggaVar);
                    return false;
                }
                rx5.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e2) {
                rx5.f().e("Crashlytics was not started due to an exception during initialization", e2);
                this.i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void p(String str, String str2) {
        this.i.T(str, str2);
    }
}
