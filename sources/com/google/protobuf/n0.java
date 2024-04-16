package com.google.protobuf;

import com.google.protobuf.h1;
import com.google.protobuf.r;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
final class n0<T> implements w0<T> {
    private final k0 a;
    private final c1<?, ?> b;
    private final boolean c;
    private final n<?> d;

    private n0(c1<?, ?> c1Var, n<?> nVar, k0 k0Var) {
        this.b = c1Var;
        this.c = nVar.e(k0Var);
        this.d = nVar;
        this.a = k0Var;
    }

    private <UT, UB> int j(c1<UT, UB> c1Var, T t) {
        return c1Var.i(c1Var.g(t));
    }

    private <UT, UB, ET extends r.b<ET>> void k(c1<UT, UB> c1Var, n<ET> nVar, T t, v0 v0Var, m mVar) throws IOException {
        UB f = c1Var.f(t);
        r<ET> d = nVar.d(t);
        do {
            try {
                if (v0Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                c1Var.o(t, f);
            }
        } while (m(v0Var, mVar, nVar, d, c1Var, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> n0<T> l(c1<?, ?> c1Var, n<?> nVar, k0 k0Var) {
        return new n0<>(c1Var, nVar, k0Var);
    }

    private <UT, UB, ET extends r.b<ET>> boolean m(v0 v0Var, m mVar, n<ET> nVar, r<ET> rVar, c1<UT, UB> c1Var, UB ub) throws IOException {
        int a = v0Var.a();
        if (a != h1.a) {
            if (h1.b(a) == 2) {
                Object b = nVar.b(mVar, this.a, h1.a(a));
                if (b != null) {
                    nVar.h(v0Var, b, mVar, rVar);
                    return true;
                }
                return c1Var.m(ub, v0Var);
            }
            return v0Var.D();
        }
        Object obj = null;
        f fVar = null;
        int i = 0;
        while (v0Var.A() != Integer.MAX_VALUE) {
            int a2 = v0Var.a();
            if (a2 == h1.c) {
                i = v0Var.h();
                obj = nVar.b(mVar, this.a, i);
            } else if (a2 == h1.d) {
                if (obj != null) {
                    nVar.h(v0Var, obj, mVar, rVar);
                } else {
                    fVar = v0Var.o();
                }
            } else if (!v0Var.D()) {
                break;
            }
        }
        if (v0Var.a() == h1.b) {
            if (fVar != null) {
                if (obj != null) {
                    nVar.i(fVar, obj, mVar, rVar);
                } else {
                    c1Var.d(ub, i, fVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void n(c1<UT, UB> c1Var, T t, i1 i1Var) throws IOException {
        c1Var.s(c1Var.g(t), i1Var);
    }

    @Override // com.google.protobuf.w0
    public void a(T t, T t2) {
        y0.G(this.b, t, t2);
        if (this.c) {
            y0.E(this.d, t, t2);
        }
    }

    @Override // com.google.protobuf.w0
    public void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.google.protobuf.w0
    public final boolean c(T t) {
        return this.d.c(t).p();
    }

    @Override // com.google.protobuf.w0
    public int d(T t) {
        int j = j(this.b, t);
        if (this.c) {
            return j + this.d.c(t).j();
        }
        return j;
    }

    @Override // com.google.protobuf.w0
    public T e() {
        k0 k0Var = this.a;
        if (k0Var instanceof u) {
            return (T) ((u) k0Var).U();
        }
        return (T) k0Var.e().k();
    }

    @Override // com.google.protobuf.w0
    public int f(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.w0
    public boolean g(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.w0
    public void h(T t, i1 i1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> t2 = this.d.c(t).t();
        while (t2.hasNext()) {
            Map.Entry<?, Object> next = t2.next();
            r.b bVar = (r.b) next.getKey();
            if (bVar.m() == h1.c.MESSAGE && !bVar.j() && !bVar.n()) {
                if (next instanceof x.b) {
                    i1Var.b(bVar.e(), ((x.b) next).a().e());
                } else {
                    i1Var.b(bVar.e(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        n(this.b, t, i1Var);
    }

    @Override // com.google.protobuf.w0
    public void i(T t, v0 v0Var, m mVar) throws IOException {
        k(this.b, this.d, t, v0Var, mVar);
    }
}
