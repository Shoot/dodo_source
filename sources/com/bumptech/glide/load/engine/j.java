package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import defpackage.b33;
import defpackage.po3;
import defpackage.tc6;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: Engine.java */
/* loaded from: classes.dex */
public class j implements l, tc6.a, o.a {
    private static final boolean i = Log.isLoggable("Engine", 2);
    private final p a;
    private final n b;
    private final tc6 c;
    private final b d;
    private final u e;
    private final c f;
    private final a g;
    private final com.bumptech.glide.load.engine.a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {
        final h.e a;
        final jf8<h<?>> b = po3.d(150, new C0104a());
        private int c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0104a implements po3.d<h<?>> {
            C0104a() {
            }

            @Override // defpackage.po3.d
            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.a, aVar.b);
            }
        }

        a(h.e eVar) {
            this.a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, m mVar, se5 se5Var, int i, int i2, Class<?> cls, Class<R> cls2, yj8 yj8Var, d33 d33Var, Map<Class<?>, tkb<?>> map, boolean z, boolean z2, boolean z3, ac7 ac7Var, h.b<R> bVar) {
            h hVar = (h) eh8.d(this.b.b());
            int i3 = this.c;
            this.c = i3 + 1;
            return hVar.x(dVar, obj, mVar, se5Var, i, i2, cls, cls2, yj8Var, d33Var, map, z, z2, z3, ac7Var, bVar, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {
        final yf4 a;
        final yf4 b;
        final yf4 c;
        final yf4 d;
        final l e;
        final o.a f;
        final jf8<k<?>> g = po3.d(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        class a implements po3.d<k<?>> {
            a() {
            }

            @Override // defpackage.po3.d
            /* renamed from: b */
            public k<?> a() {
                b bVar = b.this;
                return new k<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        b(yf4 yf4Var, yf4 yf4Var2, yf4 yf4Var3, yf4 yf4Var4, l lVar, o.a aVar) {
            this.a = yf4Var;
            this.b = yf4Var2;
            this.c = yf4Var3;
            this.d = yf4Var4;
            this.e = lVar;
            this.f = aVar;
        }

        <R> k<R> a(se5 se5Var, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((k) eh8.d(this.g.b())).l(se5Var, z, z2, z3, z4);
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    private static class c implements h.e {
        private final b33.a a;
        private volatile b33 b;

        c(b33.a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public b33 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.a();
                        }
                        if (this.b == null) {
                            this.b = new c33();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {
        private final k<?> a;
        private final pj9 b;

        d(pj9 pj9Var, k<?> kVar) {
            this.b = pj9Var;
            this.a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.a.r(this.b);
            }
        }
    }

    public j(tc6 tc6Var, b33.a aVar, yf4 yf4Var, yf4 yf4Var2, yf4 yf4Var3, yf4 yf4Var4, boolean z) {
        this(tc6Var, aVar, yf4Var, yf4Var2, yf4Var3, yf4Var4, null, null, null, null, null, null, z);
    }

    private o<?> e(se5 se5Var) {
        nj9<?> c2 = this.c.c(se5Var);
        if (c2 == null) {
            return null;
        }
        if (c2 instanceof o) {
            return (o) c2;
        }
        return new o<>(c2, true, true, se5Var, this);
    }

    private o<?> g(se5 se5Var) {
        o<?> e = this.h.e(se5Var);
        if (e != null) {
            e.d();
        }
        return e;
    }

    private o<?> h(se5 se5Var) {
        o<?> e = e(se5Var);
        if (e != null) {
            e.d();
            this.h.a(se5Var, e);
        }
        return e;
    }

    private o<?> i(m mVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        o<?> g = g(mVar);
        if (g != null) {
            if (i) {
                j("Loaded resource from active resources", j, mVar);
            }
            return g;
        }
        o<?> h = h(mVar);
        if (h == null) {
            return null;
        }
        if (i) {
            j("Loaded resource from cache", j, mVar);
        }
        return h;
    }

    private static void j(String str, long j, se5 se5Var) {
        Log.v("Engine", str + " in " + hx5.a(j) + "ms, key: " + se5Var);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, se5 se5Var, int i2, int i3, Class<?> cls, Class<R> cls2, yj8 yj8Var, d33 d33Var, Map<Class<?>, tkb<?>> map, boolean z, boolean z2, ac7 ac7Var, boolean z3, boolean z4, boolean z5, boolean z6, pj9 pj9Var, Executor executor, m mVar, long j) {
        k<?> a2 = this.a.a(mVar, z6);
        if (a2 != null) {
            a2.d(pj9Var, executor);
            if (i) {
                j("Added to existing load", j, mVar);
            }
            return new d(pj9Var, a2);
        }
        k<R> a3 = this.d.a(mVar, z3, z4, z5, z6);
        h<R> a4 = this.g.a(dVar, obj, mVar, se5Var, i2, i3, cls, cls2, yj8Var, d33Var, map, z, z2, z6, ac7Var, a3);
        this.a.c(mVar, a3);
        a3.d(pj9Var, executor);
        a3.s(a4);
        if (i) {
            j("Started new load", j, mVar);
        }
        return new d(pj9Var, a3);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void a(se5 se5Var, o<?> oVar) {
        this.h.d(se5Var);
        if (oVar.f()) {
            this.c.e(se5Var, oVar);
        } else {
            this.e.a(oVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k<?> kVar, se5 se5Var) {
        this.a.d(se5Var, kVar);
    }

    @Override // defpackage.tc6.a
    public void c(@NonNull nj9<?> nj9Var) {
        this.e.a(nj9Var, true);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void d(k<?> kVar, se5 se5Var, o<?> oVar) {
        if (oVar != null) {
            try {
                if (oVar.f()) {
                    this.h.a(se5Var, oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.d(se5Var, kVar);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, se5 se5Var, int i2, int i3, Class<?> cls, Class<R> cls2, yj8 yj8Var, d33 d33Var, Map<Class<?>, tkb<?>> map, boolean z, boolean z2, ac7 ac7Var, boolean z3, boolean z4, boolean z5, boolean z6, pj9 pj9Var, Executor executor) {
        long b2 = i ? hx5.b() : 0L;
        m a2 = this.b.a(obj, se5Var, i2, i3, map, cls, cls2, ac7Var);
        synchronized (this) {
            try {
                o<?> i4 = i(a2, z3, b2);
                if (i4 == null) {
                    return l(dVar, obj, se5Var, i2, i3, cls, cls2, yj8Var, d33Var, map, z, z2, ac7Var, z3, z4, z5, z6, pj9Var, executor, a2, b2);
                }
                pj9Var.b(i4, dl2.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(nj9<?> nj9Var) {
        if (nj9Var instanceof o) {
            ((o) nj9Var).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    j(tc6 tc6Var, b33.a aVar, yf4 yf4Var, yf4 yf4Var2, yf4 yf4Var3, yf4 yf4Var4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar2, b bVar, a aVar3, u uVar, boolean z) {
        this.c = tc6Var;
        c cVar = new c(aVar);
        this.f = cVar;
        com.bumptech.glide.load.engine.a aVar4 = aVar2 == null ? new com.bumptech.glide.load.engine.a(z) : aVar2;
        this.h = aVar4;
        aVar4.f(this);
        this.b = nVar == null ? new n() : nVar;
        this.a = pVar == null ? new p() : pVar;
        this.d = bVar == null ? new b(yf4Var, yf4Var2, yf4Var3, yf4Var4, this, this) : bVar;
        this.g = aVar3 == null ? new a(cVar) : aVar3;
        this.e = uVar == null ? new u() : uVar;
        tc6Var.d(this);
    }
}
