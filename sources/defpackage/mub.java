package defpackage;

import defpackage.j12;
import defpackage.mub;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: UserMetadata.java */
/* renamed from: mub  reason: default package */
/* loaded from: classes2.dex */
public class mub {
    private final li6 a;
    private final w02 b;
    private String c;
    private final a d = new a(false);
    private final a e = new a(true);
    private final kn9 f = new kn9(128);
    private final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    /* renamed from: mub$a */
    /* loaded from: classes2.dex */
    public class a {
        final AtomicMarkableReference<pg5> a;
        private final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        private final boolean c;

        public a(boolean z) {
            int i;
            this.c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.a = new AtomicMarkableReference<>(new pg5(64, i), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() throws Exception {
            this.b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: lub
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c;
                    c = mub.a.this.c();
                    return c;
                }
            };
            if (ho1.a(this.b, null, callable)) {
                mub.this.b.h(callable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.a.isMarked()) {
                        map = this.a.getReference().a();
                        AtomicMarkableReference<pg5> atomicMarkableReference = this.a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                mub.this.a.q(mub.this.c, map, this.c);
            }
        }

        public Map<String, String> b() {
            return this.a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<pg5> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public mub(String str, hu3 hu3Var, w02 w02Var) {
        this.c = str;
        this.a = new li6(hu3Var);
        this.b = w02Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object i(List list) throws Exception {
        this.a.r(this.c, list);
        return null;
    }

    public static mub j(String str, hu3 hu3Var, w02 w02Var) {
        li6 li6Var = new li6(hu3Var);
        mub mubVar = new mub(str, hu3Var, w02Var);
        mubVar.d.a.getReference().e(li6Var.i(str, false));
        mubVar.e.a.getReference().e(li6Var.i(str, true));
        mubVar.g.set(li6Var.k(str), false);
        mubVar.f.c(li6Var.j(str));
        return mubVar;
    }

    public static String k(String str, hu3 hu3Var) {
        return new li6(hu3Var).k(str);
    }

    public Map<String, String> e() {
        return this.d.b();
    }

    public Map<String, String> f() {
        return this.e.b();
    }

    public List<j12.e.d.AbstractC0389e> g() {
        return this.f.a();
    }

    public String h() {
        return this.g.getReference();
    }

    public boolean l(String str, String str2) {
        return this.d.f(str, str2);
    }

    public boolean m(String str, String str2) {
        return this.e.f(str, str2);
    }

    public void n(String str) {
        synchronized (this.c) {
            try {
                this.c = str;
                Map<String, String> b = this.d.b();
                List<jn9> b2 = this.f.b();
                if (h() != null) {
                    this.a.s(str, h());
                }
                if (!b.isEmpty()) {
                    this.a.p(str, b);
                }
                if (!b2.isEmpty()) {
                    this.a.r(str, b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(List<jn9> list) {
        synchronized (this.f) {
            try {
                if (!this.f.c(list)) {
                    return false;
                }
                final List<jn9> b = this.f.b();
                this.b.h(new Callable() { // from class: kub
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object i;
                        i = mub.this.i(b);
                        return i;
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
