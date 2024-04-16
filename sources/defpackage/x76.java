package defpackage;

import defpackage.ab5;
import defpackage.cb5;
import defpackage.da5;
import defpackage.db5;
import defpackage.ic5;
import defpackage.mp1;
import defpackage.ta5;
import defpackage.v1c;
import defpackage.x76;
import java.io.Serializable;
/* compiled from: MapperConfigBase.java */
/* renamed from: x76  reason: default package */
/* loaded from: classes2.dex */
public abstract class x76<CFG extends mp1, T extends x76<CFG, T>> extends w76<T> implements Serializable {
    protected static final up1 l = up1.a();
    private static final long m = y76.k();
    private static final long n = (((y76.AUTO_DETECT_FIELDS.q() | y76.AUTO_DETECT_GETTERS.q()) | y76.AUTO_DETECT_IS_GETTERS.q()) | y76.AUTO_DETECT_SETTERS.q()) | y76.AUTO_DETECT_CREATORS.q();
    protected final mla e;
    protected final q1b f;
    protected final vq8 g;
    protected final Class<?> h;
    protected final gu1 i;
    protected final bo9 j;
    protected final vp1 k;

    /* JADX INFO: Access modifiers changed from: protected */
    public x76(i80 i80Var, q1b q1bVar, mla mlaVar, bo9 bo9Var, vp1 vp1Var) {
        super(i80Var, m);
        this.e = mlaVar;
        this.f = q1bVar;
        this.j = bo9Var;
        this.g = null;
        this.h = null;
        this.i = gu1.b();
        this.k = vp1Var;
    }

    @Override // defpackage.j81.a
    public final Class<?> a(Class<?> cls) {
        return this.e.a(cls);
    }

    protected abstract T b0(long j);

    public vq8 e0(Class<?> cls) {
        vq8 vq8Var = this.g;
        if (vq8Var != null) {
            return vq8Var;
        }
        return this.j.a(cls, this);
    }

    public final Class<?> f0() {
        return this.h;
    }

    public final gu1 h0() {
        return this.i;
    }

    public final ab5.a j0(Class<?> cls) {
        ab5.a c;
        up1 b = this.k.b(cls);
        if (b != null && (c = b.c()) != null) {
            return c;
        }
        return null;
    }

    @Override // defpackage.w76
    public final up1 l(Class<?> cls) {
        up1 b = this.k.b(cls);
        if (b == null) {
            return l;
        }
        return b;
    }

    public final ab5.a l0(Class<?> cls, bl blVar) {
        ab5.a N;
        ql i = i();
        if (i == null) {
            N = null;
        } else {
            N = i.N(this, blVar);
        }
        return ab5.a.k(N, j0(cls));
    }

    public final cb5.b m0() {
        return this.k.c();
    }

    @Override // defpackage.w76
    public final cb5.b n(Class<?> cls, Class<?> cls2) {
        cb5.b e = l(cls2).e();
        cb5.b s = s(cls);
        if (s == null) {
            return e;
        }
        return s.o(e);
    }

    public final db5.a n0(Class<?> cls, bl blVar) {
        ql i = i();
        if (i == null) {
            return null;
        }
        return i.S(this, blVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [v1c<?>, v1c] */
    public final v1c<?> o0() {
        v1c<?> f = this.k.f();
        long j = this.a;
        long j2 = n;
        if ((j & j2) != j2) {
            v1c<?> v1cVar = f;
            if (!S(y76.AUTO_DETECT_FIELDS)) {
                v1cVar = f.k(da5.c.NONE);
            }
            v1c<?> v1cVar2 = v1cVar;
            if (!S(y76.AUTO_DETECT_GETTERS)) {
                v1cVar2 = v1cVar.f(da5.c.NONE);
            }
            v1c<?> v1cVar3 = v1cVar2;
            if (!S(y76.AUTO_DETECT_IS_GETTERS)) {
                v1cVar3 = v1cVar2.m(da5.c.NONE);
            }
            v1c<?> v1cVar4 = v1cVar3;
            if (!S(y76.AUTO_DETECT_SETTERS)) {
                v1cVar4 = v1cVar3.d(da5.c.NONE);
            }
            if (!S(y76.AUTO_DETECT_CREATORS)) {
                return v1cVar4.l(da5.c.NONE);
            }
            return v1cVar4;
        }
        return f;
    }

    public final vq8 p0() {
        return this.g;
    }

    @Override // defpackage.w76
    public Boolean q() {
        return this.k.d();
    }

    public final q1b q0() {
        return this.f;
    }

    @Override // defpackage.w76
    public final ta5.d r(Class<?> cls) {
        return this.k.a(cls);
    }

    public final T r0(y76... y76VarArr) {
        long j = this.a;
        for (y76 y76Var : y76VarArr) {
            j |= y76Var.q();
        }
        if (j == this.a) {
            return this;
        }
        return b0(j);
    }

    @Override // defpackage.w76
    public final cb5.b s(Class<?> cls) {
        cb5.b d = l(cls).d();
        cb5.b m0 = m0();
        if (m0 == null) {
            return d;
        }
        return m0.o(d);
    }

    @Override // defpackage.w76
    public final ic5.a w() {
        return this.k.e();
    }

    public final T x0(y76... y76VarArr) {
        long j = this.a;
        for (y76 y76Var : y76VarArr) {
            j &= ~y76Var.q();
        }
        if (j == this.a) {
            return this;
        }
        return b0(j);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [v1c<?>, v1c] */
    @Override // defpackage.w76
    public final v1c<?> y(Class<?> cls, bl blVar) {
        v1c<?> o0;
        if (q81.I(cls)) {
            o0 = v1c.a.q();
        } else {
            o0 = o0();
        }
        ql i = i();
        if (i != null) {
            o0 = i.e(blVar, o0);
        }
        up1 b = this.k.b(cls);
        if (b != null) {
            return o0.e(b.i());
        }
        return o0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x76(x76<CFG, T> x76Var, long j) {
        super(x76Var, j);
        this.e = x76Var.e;
        this.f = x76Var.f;
        this.j = x76Var.j;
        this.g = x76Var.g;
        this.h = x76Var.h;
        this.i = x76Var.i;
        this.k = x76Var.k;
    }
}
