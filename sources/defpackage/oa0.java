package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ab5;
import defpackage.db5;
import defpackage.ia0;
import defpackage.ql;
import defpackage.rc5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: BeanSerializerFactory.java */
/* renamed from: oa0  reason: default package */
/* loaded from: classes2.dex */
public class oa0 extends p90 implements Serializable {
    public static final oa0 d = new oa0(null);

    protected oa0(ada adaVar) {
        super(adaVar);
    }

    protected boolean E0(Class<?> cls) {
        if (q81.f(cls) == null && !q81.N(cls)) {
            return true;
        }
        return false;
    }

    protected void F0(pca pcaVar, na0 na0Var) {
        List<ka0> g = na0Var.g();
        boolean S = pcaVar.S(y76.DEFAULT_VIEW_INCLUSION);
        int size = g.size();
        ka0[] ka0VarArr = new ka0[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ka0 ka0Var = g.get(i2);
            Class<?>[] q = ka0Var.q();
            if (q != null && q.length != 0) {
                i++;
                ka0VarArr[i2] = l0(ka0Var, q);
            } else if (S) {
                ka0VarArr[i2] = ka0Var;
            }
        }
        if (S && i == 0) {
            return;
        }
        na0Var.l(ka0VarArr);
    }

    protected void I0(pca pcaVar, fa0 fa0Var, List<ja0> list) {
        ql i = pcaVar.i();
        HashMap hashMap = new HashMap();
        Iterator<ja0> it = list.iterator();
        while (it.hasNext()) {
            ja0 next = it.next();
            if (next.k() == null) {
                it.remove();
            } else {
                Class<?> x = next.x();
                Boolean bool = (Boolean) hashMap.get(x);
                if (bool == null) {
                    bool = pcaVar.l(x).f();
                    if (bool == null && (bool = i.R0(pcaVar.P(x).k())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(x, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected List<ka0> J0(bda bdaVar, fa0 fa0Var, na0 na0Var, List<ka0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ka0 ka0Var = list.get(i);
            bob o = ka0Var.o();
            if (o != null && o.c() == rc5.a.EXTERNAL_PROPERTY) {
                vq8 a = vq8.a(o.b());
                Iterator<ka0> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ka0 next = it.next();
                    if (next != ka0Var && next.L(a)) {
                        ka0Var.k(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected void K0(pca pcaVar, fa0 fa0Var, List<ja0> list) {
        Iterator<ja0> it = list.iterator();
        while (it.hasNext()) {
            ja0 next = it.next();
            if (!next.a() && !next.B()) {
                it.remove();
            }
        }
    }

    protected ka0 Z(bda bdaVar, ja0 ja0Var, sq8 sq8Var, boolean z, hl hlVar) throws JsonMappingException {
        bob x0;
        vq8 q = ja0Var.q();
        y85 d2 = hlVar.d();
        ia0.b bVar = new ia0.b(q, d2, ja0Var.A(), hlVar, ja0Var.t());
        gc5<?> S = S(bdaVar, hlVar);
        if (S instanceof ij9) {
            ((ij9) S).b(bdaVar);
        }
        gc5<?> F0 = bdaVar.F0(S, bVar);
        if (!d2.N() && !d2.c()) {
            x0 = null;
        } else {
            x0 = x0(d2, bdaVar.f(), hlVar);
        }
        return sq8Var.c(bdaVar, ja0Var, d2, F0, z0(d2, bdaVar.f(), hlVar), x0, hlVar, z);
    }

    @Override // defpackage.zca
    public gc5<Object> b(bda bdaVar, y85 y85Var) throws JsonMappingException {
        y85 U0;
        pca f = bdaVar.f();
        fa0 J0 = f.J0(y85Var);
        gc5<?> S = S(bdaVar, J0.k());
        if (S != null) {
            return S;
        }
        ql i = f.i();
        boolean z = false;
        if (i == null) {
            U0 = y85Var;
        } else {
            try {
                U0 = i.U0(f, J0.k(), y85Var);
            } catch (JsonMappingException e) {
                return (gc5) bdaVar.Q0(J0, e.getMessage(), new Object[0]);
            }
        }
        if (U0 != y85Var) {
            if (!U0.K(y85Var.u())) {
                J0 = f.J0(U0);
            }
            z = true;
        }
        lw1<Object, Object> h = J0.h();
        if (h == null) {
            return b0(bdaVar, U0, J0, z);
        }
        y85 a = h.a(bdaVar.i());
        if (!a.K(U0.u())) {
            J0 = f.J0(a);
            S = S(bdaVar, J0.k());
        }
        if (S == null && !a.W()) {
            S = b0(bdaVar, a, J0, true);
        }
        return new wwa(h, a, S);
    }

    protected gc5<?> b0(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        gc5<?> gc5Var;
        pca f = bdaVar.f();
        gc5<?> gc5Var2 = null;
        if (y85Var.N()) {
            if (!z) {
                z = W(f, fa0Var, null);
            }
            gc5Var = n(bdaVar, y85Var, fa0Var, z);
            if (gc5Var != null) {
                return gc5Var;
            }
        } else {
            if (y85Var.c()) {
                gc5Var = L(bdaVar, (ga9) y85Var, fa0Var, z);
            } else {
                Iterator<cda> it = y().iterator();
                while (it.hasNext() && (gc5Var2 = it.next().d(f, y85Var, fa0Var)) == null) {
                }
                gc5Var = gc5Var2;
            }
            if (gc5Var == null) {
                gc5Var = N(bdaVar, y85Var, fa0Var);
            }
        }
        if (gc5Var == null && (gc5Var = P(y85Var, f, fa0Var, z)) == null && (gc5Var = Q(bdaVar, y85Var, fa0Var, z)) == null && (gc5Var = q0(bdaVar, y85Var, fa0Var, z)) == null) {
            gc5Var = bdaVar.E0(fa0Var.i());
        }
        if (gc5Var != null && this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                gc5Var = pa0Var.i(f, fa0Var, gc5Var);
            }
        }
        return gc5Var;
    }

    protected gc5<?> e0(bda bdaVar, y85 y85Var, fa0 fa0Var) throws JsonMappingException {
        String a = qa0.a(y85Var);
        if (a != null && bdaVar.f().a(y85Var.u()) == null) {
            return new lrb(y85Var, a);
        }
        return null;
    }

    protected boolean f0(bda bdaVar, y85 y85Var) {
        Class<?> u = y85Var.u();
        if (!f57.class.isAssignableFrom(u) && !g57.class.isAssignableFrom(u) && !l57.class.isAssignableFrom(u) && !om2.class.isAssignableFrom(u) && !sib.class.isAssignableFrom(u) && !ob5.class.isAssignableFrom(u) && !ua5.class.isAssignableFrom(u)) {
            return false;
        }
        return true;
    }

    protected gc5<Object> h0(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        List<ka0> J0;
        if (fa0Var.i() == Object.class) {
            return bdaVar.E0(Object.class);
        }
        gc5<?> e0 = e0(bdaVar, y85Var, fa0Var);
        if (e0 != null) {
            return e0;
        }
        if (f0(bdaVar, y85Var)) {
            return new phb(y85Var);
        }
        pca f = bdaVar.f();
        na0 j0 = j0(fa0Var);
        j0.j(f);
        List<ka0> r0 = r0(bdaVar, fa0Var, j0);
        if (r0 == null) {
            J0 = new ArrayList<>();
        } else {
            J0 = J0(bdaVar, fa0Var, j0, r0);
        }
        bdaVar.j0().d(f, fa0Var.k(), J0);
        if (this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                J0 = pa0Var.a(f, fa0Var, J0);
            }
        }
        List<ka0> o0 = o0(f, fa0Var, p0(f, fa0Var, J0));
        if (this.a.b()) {
            for (pa0 pa0Var2 : this.a.d()) {
                o0 = pa0Var2.j(f, fa0Var, o0);
            }
        }
        j0.m(m0(bdaVar, fa0Var, o0));
        j0.n(o0);
        j0.k(H(f, fa0Var));
        hl a = fa0Var.a();
        if (a != null) {
            y85 d2 = a.d();
            y85 m = d2.m();
            bob c = c(f, m);
            gc5<Object> S = S(bdaVar, a);
            if (S == null) {
                S = w66.W(null, d2, f.S(y76.USE_STATIC_TYPING), c, null, null, null);
            }
            j0.i(new vl(new ia0.b(vq8.a(a.getName()), m, null, a, uq8.i), a, S));
        }
        F0(f, j0);
        if (this.a.b()) {
            for (pa0 pa0Var3 : this.a.d()) {
                j0 = pa0Var3.k(f, fa0Var, j0);
            }
        }
        try {
            gc5<?> a2 = j0.a();
            if (a2 == null) {
                if (y85Var.e0()) {
                    return j0.b();
                }
                a2 = M(f, y85Var, fa0Var, z);
                if (a2 == null && fa0Var.n()) {
                    return j0.b();
                }
            }
            return a2;
        } catch (RuntimeException e) {
            return (gc5) bdaVar.Q0(fa0Var, "Failed to construct BeanSerializer for %s: (%s) %s", fa0Var.m(), e.getClass().getName(), e.getMessage());
        }
    }

    protected na0 j0(fa0 fa0Var) {
        return new na0(fa0Var);
    }

    protected ka0 l0(ka0 ka0Var, Class<?>[] clsArr) {
        return bv3.a(ka0Var, clsArr);
    }

    protected d57 m0(bda bdaVar, fa0 fa0Var, List<ka0> list) throws JsonMappingException {
        c57 l = fa0Var.l();
        if (l == null) {
            return null;
        }
        Class<? extends y47<?>> c = l.c();
        if (c == b57.class) {
            String c2 = l.d().c();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                ka0 ka0Var = list.get(i);
                if (c2.equals(ka0Var.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, ka0Var);
                    }
                    return d57.a(ka0Var.getType(), null, new rq8(l, ka0Var), l.b());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", q81.D(fa0Var.m()), q81.Q(c2)));
        }
        return d57.a(bdaVar.i().T(bdaVar.d(c), y47.class)[0], l.d(), bdaVar.j(fa0Var.k(), l), l.b());
    }

    protected sq8 n0(pca pcaVar, fa0 fa0Var) {
        return new sq8(pcaVar, fa0Var);
    }

    protected List<ka0> o0(pca pcaVar, fa0 fa0Var, List<ka0> list) {
        Set<String> set;
        ab5.a l0 = pcaVar.l0(fa0Var.i(), fa0Var.k());
        Set<String> set2 = null;
        if (l0 != null) {
            set = l0.i();
        } else {
            set = null;
        }
        db5.a n0 = pcaVar.n0(fa0Var.i(), fa0Var.k());
        if (n0 != null) {
            set2 = n0.e();
        }
        if (set2 != null || (set != null && !set.isEmpty())) {
            Iterator<ka0> it = list.iterator();
            while (it.hasNext()) {
                if (st4.b(it.next().getName(), set, set2)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List<ka0> p0(pca pcaVar, fa0 fa0Var, List<ka0> list) {
        if (fa0Var.m().f0(CharSequence.class) && list.size() == 1) {
            hl c = list.get(0).c();
            if ((c instanceof il) && "isEmpty".equals(c.getName()) && c.k() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public gc5<Object> q0(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        if (!E0(y85Var.u()) && !q81.H(y85Var.u())) {
            return null;
        }
        return h0(bdaVar, y85Var, fa0Var, z);
    }

    protected List<ka0> r0(bda bdaVar, fa0 fa0Var, na0 na0Var) throws JsonMappingException {
        List<ja0> f = fa0Var.f();
        pca f2 = bdaVar.f();
        I0(f2, fa0Var, f);
        if (f2.S(y76.REQUIRE_SETTERS_FOR_GETTERS)) {
            K0(f2, fa0Var, f);
        }
        if (f.isEmpty()) {
            return null;
        }
        boolean W = W(f2, fa0Var, null);
        sq8 n0 = n0(f2, fa0Var);
        ArrayList arrayList = new ArrayList(f.size());
        for (ja0 ja0Var : f) {
            hl k = ja0Var.k();
            if (ja0Var.C()) {
                if (k != null) {
                    na0Var.o(k);
                }
            } else {
                ql.a h = ja0Var.h();
                if (h == null || !h.b()) {
                    if (k instanceof il) {
                        arrayList.add(Z(bdaVar, ja0Var, n0, W, (il) k));
                    } else {
                        arrayList.add(Z(bdaVar, ja0Var, n0, W, (fl) k));
                    }
                }
            }
        }
        return arrayList;
    }

    public bob x0(y85 y85Var, pca pcaVar, hl hlVar) throws JsonMappingException {
        y85 m = y85Var.m();
        aob<?> K = pcaVar.i().K(pcaVar, hlVar, y85Var);
        if (K == null) {
            return c(pcaVar, m);
        }
        return K.e(pcaVar, m, pcaVar.q0().b(pcaVar, hlVar, m));
    }

    @Override // defpackage.p90
    protected Iterable<cda> y() {
        return this.a.e();
    }

    public bob z0(y85 y85Var, pca pcaVar, hl hlVar) throws JsonMappingException {
        aob<?> W = pcaVar.i().W(pcaVar, hlVar, y85Var);
        if (W == null) {
            return c(pcaVar, y85Var);
        }
        return W.e(pcaVar, y85Var, pcaVar.q0().b(pcaVar, hlVar, y85Var));
    }
}
