package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import defpackage.po3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
class k<R> implements h.b<R>, po3.f {
    private static final c z = new c();
    final e a;
    private final eva b;
    private final o.a c;
    private final jf8<k<?>> d;
    private final c e;
    private final l f;
    private final yf4 g;
    private final yf4 h;
    private final yf4 i;
    private final yf4 j;
    private final AtomicInteger k;
    private se5 l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private nj9<?> q;
    dl2 r;
    private boolean s;
    GlideException t;
    private boolean u;
    o<?> v;
    private h<R> w;
    private volatile boolean x;
    private boolean y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private final pj9 a;

        a(pj9 pj9Var) {
            this.a = pj9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.f()) {
                synchronized (k.this) {
                    if (k.this.a.d(this.a)) {
                        k.this.e(this.a);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private final pj9 a;

        b(pj9 pj9Var) {
            this.a = pj9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.f()) {
                synchronized (k.this) {
                    if (k.this.a.d(this.a)) {
                        k.this.v.d();
                        k.this.f(this.a);
                        k.this.r(this.a);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> o<R> a(nj9<R> nj9Var, boolean z, se5 se5Var, o.a aVar) {
            return new o<>(nj9Var, z, true, se5Var, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {
        final pj9 a;
        final Executor b;

        d(pj9 pj9Var, Executor executor) {
            this.a = pj9Var;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {
        private final List<d> a;

        e() {
            this(new ArrayList(2));
        }

        private static d g(pj9 pj9Var) {
            return new d(pj9Var, im3.a());
        }

        void a(pj9 pj9Var, Executor executor) {
            this.a.add(new d(pj9Var, executor));
        }

        void clear() {
            this.a.clear();
        }

        boolean d(pj9 pj9Var) {
            return this.a.contains(g(pj9Var));
        }

        e f() {
            return new e(new ArrayList(this.a));
        }

        void h(pj9 pj9Var) {
            this.a.remove(g(pj9Var));
        }

        boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.a.iterator();
        }

        int size() {
            return this.a.size();
        }

        e(List<d> list) {
            this.a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(yf4 yf4Var, yf4 yf4Var2, yf4 yf4Var3, yf4 yf4Var4, l lVar, o.a aVar, jf8<k<?>> jf8Var) {
        this(yf4Var, yf4Var2, yf4Var3, yf4Var4, lVar, aVar, jf8Var, z);
    }

    private yf4 j() {
        if (this.n) {
            return this.i;
        }
        if (this.o) {
            return this.j;
        }
        return this.h;
    }

    private boolean m() {
        if (!this.u && !this.s && !this.x) {
            return false;
        }
        return true;
    }

    private synchronized void q() {
        if (this.l != null) {
            this.a.clear();
            this.l = null;
            this.v = null;
            this.q = null;
            this.u = false;
            this.x = false;
            this.s = false;
            this.y = false;
            this.w.H(false);
            this.w = null;
            this.t = null;
            this.r = null;
            this.d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(h<?> hVar) {
        j().execute(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void b(nj9<R> nj9Var, dl2 dl2Var, boolean z2) {
        synchronized (this) {
            this.q = nj9Var;
            this.r = dl2Var;
            this.y = z2;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.t = glideException;
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(pj9 pj9Var, Executor executor) {
        try {
            this.b.c();
            this.a.a(pj9Var, executor);
            if (this.s) {
                k(1);
                executor.execute(new b(pj9Var));
            } else if (this.u) {
                k(1);
                executor.execute(new a(pj9Var));
            } else {
                eh8.a(!this.x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void e(pj9 pj9Var) {
        try {
            pj9Var.c(this.t);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void f(pj9 pj9Var) {
        try {
            pj9Var.b(this.v, this.r, this.y);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    @Override // defpackage.po3.f
    @NonNull
    public eva g() {
        return this.b;
    }

    void h() {
        if (m()) {
            return;
        }
        this.x = true;
        this.w.k();
        this.f.b(this, this.l);
    }

    void i() {
        boolean z2;
        o<?> oVar;
        synchronized (this) {
            try {
                this.b.c();
                eh8.a(m(), "Not yet complete!");
                int decrementAndGet = this.k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                eh8.a(z2, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    oVar = this.v;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oVar != null) {
            oVar.g();
        }
    }

    synchronized void k(int i) {
        o<?> oVar;
        eh8.a(m(), "Not yet complete!");
        if (this.k.getAndAdd(i) == 0 && (oVar = this.v) != null) {
            oVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized k<R> l(se5 se5Var, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.l = se5Var;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.b.c();
                if (this.x) {
                    q();
                } else if (!this.a.isEmpty()) {
                    if (!this.u) {
                        this.u = true;
                        se5 se5Var = this.l;
                        e f = this.a.f();
                        k(f.size() + 1);
                        this.f.d(this, se5Var, null);
                        Iterator<d> it = f.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.b.execute(new a(next.a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.b.c();
                if (this.x) {
                    this.q.b();
                    q();
                } else if (!this.a.isEmpty()) {
                    if (!this.s) {
                        this.v = this.e.a(this.q, this.m, this.l, this.c);
                        this.s = true;
                        e f = this.a.f();
                        k(f.size() + 1);
                        this.f.d(this, this.l, this.v);
                        Iterator<d> it = f.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.b.execute(new b(next.a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(pj9 pj9Var) {
        try {
            this.b.c();
            this.a.h(pj9Var);
            if (this.a.isEmpty()) {
                h();
                if (!this.s) {
                    if (this.u) {
                    }
                }
                if (this.k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h<R> hVar) {
        yf4 j;
        try {
            this.w = hVar;
            if (hVar.O()) {
                j = this.g;
            } else {
                j = j();
            }
            j.execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    k(yf4 yf4Var, yf4 yf4Var2, yf4 yf4Var3, yf4 yf4Var4, l lVar, o.a aVar, jf8<k<?>> jf8Var, c cVar) {
        this.a = new e();
        this.b = eva.a();
        this.k = new AtomicInteger();
        this.g = yf4Var;
        this.h = yf4Var2;
        this.i = yf4Var3;
        this.j = yf4Var4;
        this.f = lVar;
        this.c = aVar;
        this.d = jf8Var;
        this.e = cVar;
    }
}
