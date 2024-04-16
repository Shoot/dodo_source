package com.google.protobuf;

import com.google.protobuf.h1;
import com.google.protobuf.k0;
import com.google.protobuf.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
final class o extends n<u.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h1.b.values().length];
            a = iArr;
            try {
                iArr[h1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h1.b.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h1.b.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h1.b.s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h1.b.t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h1.b.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h1.b.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[h1.b.k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h1.b.l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[h1.b.m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public int a(Map.Entry<?, ?> entry) {
        return ((u.d) entry.getKey()).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public Object b(m mVar, k0 k0Var, int i) {
        return mVar.a(k0Var, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public r<u.d> c(Object obj) {
        return ((u.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public r<u.d> d(Object obj) {
        return ((u.c) obj).Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public boolean e(k0 k0Var) {
        return k0Var instanceof u.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public void f(Object obj) {
        c(obj).u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public <UT, UB> UB g(Object obj, v0 v0Var, Object obj2, m mVar, r<u.d> rVar, UB ub, c1<UT, UB> c1Var) throws IOException {
        Object valueOf;
        Object i;
        ArrayList arrayList;
        u.e eVar = (u.e) obj2;
        int c = eVar.c();
        if (eVar.b.j() && eVar.b.n()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    v0Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    v0Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    v0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    v0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    v0Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    v0Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    v0Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    v0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    v0Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    v0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    v0Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    v0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    v0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    v0Var.j(arrayList);
                    ub = (UB) y0.z(obj, c, arrayList, eVar.b.g(), ub, c1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.l());
            }
            rVar.y(eVar.b, arrayList);
        } else {
            if (eVar.a() == h1.b.p) {
                int p = v0Var.p();
                if (eVar.b.g().a(p) == null) {
                    return (UB) y0.L(obj, c, p, ub, c1Var);
                }
                valueOf = Integer.valueOf(p);
            } else {
                switch (a.a[eVar.a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(v0Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(v0Var.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(v0Var.H());
                        break;
                    case 4:
                        valueOf = Long.valueOf(v0Var.s());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(v0Var.p());
                        break;
                    case 6:
                        valueOf = Long.valueOf(v0Var.b());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(v0Var.u());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(v0Var.e());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(v0Var.h());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(v0Var.E());
                        break;
                    case 11:
                        valueOf = Long.valueOf(v0Var.f());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(v0Var.l());
                        break;
                    case 13:
                        valueOf = Long.valueOf(v0Var.y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = v0Var.o();
                        break;
                    case 16:
                        valueOf = v0Var.z();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object i2 = rVar.i(eVar.b);
                            if (i2 instanceof u) {
                                w0 d = s0.a().d(i2);
                                if (!((u) i2).N()) {
                                    Object e = d.e();
                                    d.a(e, i2);
                                    rVar.y(eVar.b, e);
                                    i2 = e;
                                }
                                v0Var.O(i2, d, mVar);
                                return ub;
                            }
                        }
                        valueOf = v0Var.L(eVar.b().getClass(), mVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object i3 = rVar.i(eVar.b);
                            if (i3 instanceof u) {
                                w0 d2 = s0.a().d(i3);
                                if (!((u) i3).N()) {
                                    Object e2 = d2.e();
                                    d2.a(e2, i3);
                                    rVar.y(eVar.b, e2);
                                    i3 = e2;
                                }
                                v0Var.P(i3, d2, mVar);
                                return ub;
                            }
                        }
                        valueOf = v0Var.N(eVar.b().getClass(), mVar);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (eVar.d()) {
                rVar.a(eVar.b, valueOf);
            } else {
                int i4 = a.a[eVar.a().ordinal()];
                if ((i4 == 17 || i4 == 18) && (i = rVar.i(eVar.b)) != null) {
                    valueOf = w.h(i, valueOf);
                }
                rVar.y(eVar.b, valueOf);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public void h(v0 v0Var, Object obj, m mVar, r<u.d> rVar) throws IOException {
        u.e eVar = (u.e) obj;
        rVar.y(eVar.b, v0Var.N(eVar.b().getClass(), mVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public void i(f fVar, Object obj, m mVar, r<u.d> rVar) throws IOException {
        u.e eVar = (u.e) obj;
        k0.a e = eVar.b().e();
        g Q = fVar.Q();
        e.q0(Q, mVar);
        rVar.y(eVar.b, e.k());
        Q.a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.n
    public void j(i1 i1Var, Map.Entry<?, ?> entry) throws IOException {
        u.d dVar = (u.d) entry.getKey();
        if (dVar.j()) {
            switch (a.a[dVar.l().ordinal()]) {
                case 1:
                    y0.P(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 2:
                    y0.T(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 3:
                    y0.W(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 4:
                    y0.e0(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 5:
                    y0.V(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 6:
                    y0.S(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 7:
                    y0.R(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 8:
                    y0.N(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 9:
                    y0.d0(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 10:
                    y0.Y(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 11:
                    y0.Z(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 12:
                    y0.a0(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 13:
                    y0.b0(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 14:
                    y0.V(dVar.e(), (List) entry.getValue(), i1Var, dVar.n());
                    return;
                case 15:
                    y0.O(dVar.e(), (List) entry.getValue(), i1Var);
                    return;
                case 16:
                    y0.c0(dVar.e(), (List) entry.getValue(), i1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        y0.U(dVar.e(), (List) entry.getValue(), i1Var, s0.a().c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        y0.X(dVar.e(), (List) entry.getValue(), i1Var, s0.a().c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (a.a[dVar.l().ordinal()]) {
            case 1:
                i1Var.p(dVar.e(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                i1Var.B(dVar.e(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                i1Var.u(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                i1Var.f(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                i1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                i1Var.s(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                i1Var.c(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                i1Var.v(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                i1Var.o(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                i1Var.w(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                i1Var.i(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                i1Var.H(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                i1Var.m(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                i1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                i1Var.L(dVar.e(), (f) entry.getValue());
                return;
            case 16:
                i1Var.e(dVar.e(), (String) entry.getValue());
                return;
            case 17:
                i1Var.K(dVar.e(), entry.getValue(), s0.a().c(entry.getValue().getClass()));
                return;
            case 18:
                i1Var.N(dVar.e(), entry.getValue(), s0.a().c(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
