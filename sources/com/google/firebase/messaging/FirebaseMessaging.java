package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a0;
import com.google.firebase.messaging.w;
import defpackage.gw3;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class FirebaseMessaging {
    private static final long o = TimeUnit.HOURS.toSeconds(8);
    private static a0 p;
    @SuppressLint({"FirebaseUnknownNullness"})
    static xlb q;
    static ScheduledExecutorService r;
    private final qv3 a;
    private final gw3 b;
    private final ew3 c;
    private final Context d;
    private final n e;
    private final w f;
    private final a g;
    private final Executor h;
    private final Executor i;
    private final Executor j;
    private final y6b<f0> k;
    private final p l;
    private boolean m;
    private final Application.ActivityLifecycleCallbacks n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a {
        private final j1b a;
        private boolean b;
        private vk3<qk2> c;
        private Boolean d;

        a(j1b j1bVar) {
            this.a = j1bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(nk3 nk3Var) {
            if (c()) {
                FirebaseMessaging.this.C();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k = FirebaseMessaging.this.a.k();
            SharedPreferences sharedPreferences = k.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean e = e();
                this.d = e;
                if (e == null) {
                    vk3<qk2> vk3Var = new vk3() { // from class: com.google.firebase.messaging.l
                        @Override // defpackage.vk3
                        public final void a(nk3 nk3Var) {
                            FirebaseMessaging.a.this.d(nk3Var);
                        }
                    };
                    this.c = vk3Var;
                    this.a.b(qk2.class, vk3Var);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            boolean t;
            try {
                b();
                Boolean bool = this.d;
                if (bool != null) {
                    t = bool.booleanValue();
                } else {
                    t = FirebaseMessaging.this.a.t();
                }
            } catch (Throwable th) {
                throw th;
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(qv3 qv3Var, gw3 gw3Var, bs8<dub> bs8Var, bs8<rn4> bs8Var2, ew3 ew3Var, xlb xlbVar, j1b j1bVar) {
        this(qv3Var, gw3Var, bs8Var, bs8Var2, ew3Var, xlbVar, j1bVar, new p(qv3Var.k()));
    }

    private synchronized void B() {
        if (!this.m) {
            D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        gw3 gw3Var = this.b;
        if (gw3Var != null) {
            gw3Var.a();
        } else if (E(p())) {
            B();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull qv3 qv3Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) qv3Var.j(FirebaseMessaging.class);
            gh8.k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @NonNull
    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(qv3.l());
        }
        return firebaseMessaging;
    }

    @NonNull
    private static synchronized a0 m(Context context) {
        a0 a0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (p == null) {
                    p = new a0(context);
                }
                a0Var = p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    private String n() {
        if ("[DEFAULT]".equals(this.a.m())) {
            return "";
        }
        return this.a.o();
    }

    public static xlb q() {
        return q;
    }

    private void r(String str) {
        if ("[DEFAULT]".equals(this.a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new e(this.d).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b u(final String str, final a0.a aVar) {
        return this.e.e().s(this.j, new r1b() { // from class: com.google.firebase.messaging.k
            @Override // defpackage.r1b
            public final y6b a(Object obj) {
                y6b v;
                v = FirebaseMessaging.this.v(str, aVar, (String) obj);
                return v;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b v(String str, a0.a aVar, String str2) throws Exception {
        m(this.d).f(n(), str, str2, this.l.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            r(str2);
        }
        return o7b.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(a7b a7bVar) {
        try {
            a7bVar.c(i());
        } catch (Exception e) {
            a7bVar.b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (s()) {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(f0 f0Var) {
        if (s()) {
            f0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        s.c(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void A(boolean z) {
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void D(long j) {
        j(new b0(this, Math.min(Math.max(30L, 2 * j), o)), j);
        this.m = true;
    }

    boolean E(a0.a aVar) {
        if (aVar != null && !aVar.b(this.l.a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() throws IOException {
        gw3 gw3Var = this.b;
        if (gw3Var != null) {
            try {
                return (String) o7b.a(gw3Var.c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final a0.a p2 = p();
        if (!E(p2)) {
            return p2.a;
        }
        final String c = p.c(this.a);
        try {
            return (String) o7b.a(this.f.b(c, new w.a() { // from class: com.google.firebase.messaging.j
                @Override // com.google.firebase.messaging.w.a
                public final y6b start() {
                    y6b u;
                    u = FirebaseMessaging.this.u(c, p2);
                    return u;
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public void j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (r == null) {
                    r = new ScheduledThreadPoolExecutor(1, new rs6("TAG"));
                }
                r.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.d;
    }

    @NonNull
    public y6b<String> o() {
        gw3 gw3Var = this.b;
        if (gw3Var != null) {
            return gw3Var.c();
        }
        final a7b a7bVar = new a7b();
        this.h.execute(new Runnable() { // from class: lw3
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.w(a7bVar);
            }
        });
        return a7bVar.a();
    }

    a0.a p() {
        return m(this.d).d(n(), p.c(this.a));
    }

    public boolean s() {
        return this.g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return this.l.g();
    }

    FirebaseMessaging(qv3 qv3Var, gw3 gw3Var, bs8<dub> bs8Var, bs8<rn4> bs8Var2, ew3 ew3Var, xlb xlbVar, j1b j1bVar, p pVar) {
        this(qv3Var, gw3Var, ew3Var, xlbVar, j1bVar, pVar, new n(qv3Var, pVar, bs8Var, bs8Var2, ew3Var), f.f(), f.c(), f.b());
    }

    FirebaseMessaging(qv3 qv3Var, gw3 gw3Var, ew3 ew3Var, xlb xlbVar, j1b j1bVar, p pVar, n nVar, Executor executor, Executor executor2, Executor executor3) {
        this.m = false;
        q = xlbVar;
        this.a = qv3Var;
        this.b = gw3Var;
        this.c = ew3Var;
        this.g = new a(j1bVar);
        Context k = qv3Var.k();
        this.d = k;
        h hVar = new h();
        this.n = hVar;
        this.l = pVar;
        this.i = executor;
        this.e = nVar;
        this.f = new w(executor);
        this.h = executor2;
        this.j = executor3;
        Context k2 = qv3Var.k();
        if (k2 instanceof Application) {
            ((Application) k2).registerActivityLifecycleCallbacks(hVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + k2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (gw3Var != null) {
            gw3Var.b(new gw3.a() { // from class: iw3
            });
        }
        executor2.execute(new Runnable() { // from class: jw3
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.x();
            }
        });
        y6b<f0> e = f0.e(this, pVar, nVar, k, f.g());
        this.k = e;
        e.h(executor2, new a97() { // from class: com.google.firebase.messaging.i
            @Override // defpackage.a97
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.y((f0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: kw3
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.z();
            }
        });
    }
}
