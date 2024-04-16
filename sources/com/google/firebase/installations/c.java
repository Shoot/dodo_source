package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.c;
import defpackage.rib;
import defpackage.w45;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: FirebaseInstallations.java */
/* loaded from: classes2.dex */
public class c implements ew3 {
    private static final Object m = new Object();
    private static final ThreadFactory n = new a();
    private final qv3 a;
    private final zv3 b;
    private final yy7 c;
    private final h d;
    private final qn5<zt4> e;
    private final d49 f;
    private final Object g;
    private final ExecutorService h;
    private final Executor i;
    private String j;
    private Set<es3> k;
    private final List<g> l;

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes2.dex */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[rib.b.values().length];
            b = iArr;
            try {
                iArr[rib.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[rib.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[rib.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[w45.b.values().length];
            a = iArr2;
            try {
                iArr2[w45.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[w45.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c(final qv3 qv3Var, @NonNull bs8<qn4> bs8Var, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, qv3Var, new zv3(qv3Var.k(), bs8Var), new yy7(qv3Var), h.c(), new qn5(new bs8() { // from class: bw3
            @Override // defpackage.bs8
            public final Object get() {
                zt4 y;
                y = c.y(qv3.this);
                return y;
            }
        }), new d49());
    }

    private String A(zy7 zy7Var) {
        if ((!this.a.m().equals("CHIME_ANDROID_SDK") && !this.a.u()) || !zy7Var.m()) {
            return this.f.a();
        }
        String f = o().f();
        if (TextUtils.isEmpty(f)) {
            return this.f.a();
        }
        return f;
    }

    private zy7 B(zy7 zy7Var) throws FirebaseInstallationsException {
        String str;
        if (zy7Var.d() != null && zy7Var.d().length() == 11) {
            str = o().i();
        } else {
            str = null;
        }
        w45 d = this.b.d(l(), zy7Var.d(), t(), m(), str);
        int i = b.a[d.e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return zy7Var.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return zy7Var.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator<g> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void D(zy7 zy7Var) {
        synchronized (this.g) {
            try {
                Iterator<g> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(zy7Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.j = str;
    }

    private synchronized void F(zy7 zy7Var, zy7 zy7Var2) {
        if (this.k.size() != 0 && !TextUtils.equals(zy7Var.d(), zy7Var2.d())) {
            for (es3 es3Var : this.k) {
                es3Var.a(zy7Var2.d());
            }
        }
    }

    private y6b<f> f() {
        a7b a7bVar = new a7b();
        h(new d(this.d, a7bVar));
        return a7bVar.a();
    }

    private y6b<String> g() {
        a7b a7bVar = new a7b();
        h(new e(a7bVar));
        return a7bVar.a();
    }

    private void h(g gVar) {
        synchronized (this.g) {
            this.l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            zy7 r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.h r3 = r2.d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            zy7 r3 = r2.k(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            goto L28
        L24:
            zy7 r3 = r2.B(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
        L28:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L5d:
            r2.D(r3)
        L60:
            return
        L61:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void x(final boolean z) {
        zy7 s = s();
        if (z) {
            s = s.p();
        }
        D(s);
        this.i.execute(new Runnable() { // from class: cw3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.v(z);
            }
        });
    }

    private zy7 k(@NonNull zy7 zy7Var) throws FirebaseInstallationsException {
        rib e = this.b.e(l(), zy7Var.d(), t(), zy7Var.f());
        int i = b.b[e.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    E(null);
                    return zy7Var.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
            }
            return zy7Var.q("BAD CONFIG");
        }
        return zy7Var.o(e.c(), e.d(), this.d.b());
    }

    private synchronized String n() {
        return this.j;
    }

    private zt4 o() {
        return this.e.get();
    }

    @NonNull
    public static c p() {
        return q(qv3.l());
    }

    @NonNull
    public static c q(@NonNull qv3 qv3Var) {
        boolean z;
        if (qv3Var != null) {
            z = true;
        } else {
            z = false;
        }
        gh8.b(z, "Null is not a valid value of FirebaseApp.");
        return (c) qv3Var.j(ew3.class);
    }

    private zy7 r() {
        zy7 d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                d = this.c.d();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    private zy7 s() {
        zy7 d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                d = this.c.d();
                if (d.j()) {
                    d = this.c.b(d.t(A(d)));
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    private void u(zy7 zy7Var) {
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                this.c.b(zy7Var);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zt4 y(qv3 qv3Var) {
        return new zt4(qv3Var);
    }

    private void z() {
        gh8.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gh8.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gh8.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gh8.b(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gh8.b(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.ew3
    @NonNull
    public y6b<f> a(final boolean z) {
        z();
        y6b<f> f = f();
        this.h.execute(new Runnable() { // from class: dw3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.x(z);
            }
        });
        return f;
    }

    @Override // defpackage.ew3
    @NonNull
    public y6b<String> getId() {
        z();
        String n2 = n();
        if (n2 != null) {
            return o7b.e(n2);
        }
        y6b<String> g = g();
        this.h.execute(new Runnable() { // from class: aw3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.w();
            }
        });
        return g;
    }

    String l() {
        return this.a.n().b();
    }

    String m() {
        return this.a.n().c();
    }

    String t() {
        return this.a.n().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, qv3 qv3Var, zv3 zv3Var, yy7 yy7Var, h hVar, qn5<zt4> qn5Var, d49 d49Var) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = qv3Var;
        this.b = zv3Var;
        this.c = yy7Var;
        this.d = hVar;
        this.e = qn5Var;
        this.f = d49Var;
        this.h = executorService;
        this.i = executor;
    }
}
