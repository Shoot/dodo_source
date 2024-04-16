package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
final class o0<T> implements x0<T> {
    private final l0 a;
    private final d1<?, ?> b;
    private final boolean c;
    private final o<?> d;

    private o0(d1<?, ?> d1Var, o<?> oVar, l0 l0Var) {
        this.b = d1Var;
        this.c = oVar.e(l0Var);
        this.d = oVar;
        this.a = l0Var;
    }

    private <UT, UB> int j(d1<UT, UB> d1Var, T t) {
        return d1Var.i(d1Var.g(t));
    }

    private <UT, UB, ET extends s.b<ET>> void k(d1<UT, UB> d1Var, o<ET> oVar, T t, w0 w0Var, n nVar) throws IOException {
        UB f = d1Var.f(t);
        s<ET> d = oVar.d(t);
        do {
            try {
                if (w0Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                d1Var.o(t, f);
            }
        } while (m(w0Var, nVar, oVar, d, d1Var, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> o0<T> l(d1<?, ?> d1Var, o<?> oVar, l0 l0Var) {
        return new o0<>(d1Var, oVar, l0Var);
    }

    private <UT, UB, ET extends s.b<ET>> boolean m(w0 w0Var, n nVar, o<ET> oVar, s<ET> sVar, d1<UT, UB> d1Var, UB ub) throws IOException {
        int a = w0Var.a();
        if (a != i1.a) {
            if (i1.b(a) == 2) {
                Object b = oVar.b(nVar, this.a, i1.a(a));
                if (b != null) {
                    oVar.h(w0Var, b, nVar, sVar);
                    return true;
                }
                return d1Var.m(ub, w0Var);
            }
            return w0Var.D();
        }
        Object obj = null;
        g gVar = null;
        int i = 0;
        while (w0Var.A() != Integer.MAX_VALUE) {
            int a2 = w0Var.a();
            if (a2 == i1.c) {
                i = w0Var.h();
                obj = oVar.b(nVar, this.a, i);
            } else if (a2 == i1.d) {
                if (obj != null) {
                    oVar.h(w0Var, obj, nVar, sVar);
                } else {
                    gVar = w0Var.o();
                }
            } else if (!w0Var.D()) {
                break;
            }
        }
        if (w0Var.a() == i1.b) {
            if (gVar != null) {
                if (obj != null) {
                    oVar.i(gVar, obj, nVar, sVar);
                } else {
                    d1Var.d(ub, i, gVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.a();
    }

    private <UT, UB> void n(d1<UT, UB> d1Var, T t, j1 j1Var) throws IOException {
        d1Var.s(d1Var.g(t), j1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void a(T t, T t2) {
        z0.G(this.b, t, t2);
        if (this.c) {
            z0.E(this.d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(T t) {
        return this.d.c(t).p();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public int d(T t) {
        int j = j(this.b, t);
        if (this.c) {
            return j + this.d.c(t).j();
        }
        return j;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public T e() {
        return (T) this.a.e().k();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public int f(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public boolean g(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void h(T t, w0 w0Var, n nVar) throws IOException {
        k(this.b, this.d, t, w0Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void i(T t, j1 j1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> s = this.d.c(t).s();
        while (s.hasNext()) {
            Map.Entry<?, Object> next = s.next();
            s.b bVar = (s.b) next.getKey();
            if (bVar.m() == i1.c.MESSAGE && !bVar.j() && !bVar.n()) {
                if (next instanceof y.b) {
                    j1Var.b(bVar.e(), ((y.b) next).a().e());
                } else {
                    j1Var.b(bVar.e(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        n(this.b, t, j1Var);
    }
}
