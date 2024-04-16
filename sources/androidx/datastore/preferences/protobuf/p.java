package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
final class p extends o<v.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i1.b.values().length];
            a = iArr;
            try {
                iArr[i1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[i1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[i1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[i1.b.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[i1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[i1.b.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[i1.b.s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[i1.b.t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[i1.b.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[i1.b.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[i1.b.k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[i1.b.l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[i1.b.m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public int a(Map.Entry<?, ?> entry) {
        return ((v.d) entry.getKey()).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public Object b(n nVar, l0 l0Var, int i) {
        return nVar.a(l0Var, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public s<v.d> c(Object obj) {
        return ((v.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public s<v.d> d(Object obj) {
        return ((v.c) obj).K();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public boolean e(l0 l0Var) {
        return l0Var instanceof v.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public void f(Object obj) {
        c(obj).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public <UT, UB> UB g(w0 w0Var, Object obj, n nVar, s<v.d> sVar, UB ub, d1<UT, UB> d1Var) throws IOException {
        Object i;
        ArrayList arrayList;
        v.e eVar = (v.e) obj;
        int c = eVar.c();
        Object obj2 = null;
        if (eVar.b.j() && eVar.b.n()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    w0Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    w0Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    w0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    w0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    w0Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    w0Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    w0Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    w0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    w0Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    w0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    w0Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    w0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    w0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    w0Var.j(arrayList);
                    eVar.b.g();
                    ub = (UB) z0.z(c, arrayList, null, ub, d1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.l());
            }
            sVar.x(eVar.b, arrayList);
        } else if (eVar.a() != i1.b.p) {
            int[] iArr = a.a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                    obj2 = Double.valueOf(w0Var.readDouble());
                    break;
                case 2:
                    obj2 = Float.valueOf(w0Var.readFloat());
                    break;
                case 3:
                    obj2 = Long.valueOf(w0Var.H());
                    break;
                case 4:
                    obj2 = Long.valueOf(w0Var.s());
                    break;
                case 5:
                    obj2 = Integer.valueOf(w0Var.p());
                    break;
                case 6:
                    obj2 = Long.valueOf(w0Var.b());
                    break;
                case 7:
                    obj2 = Integer.valueOf(w0Var.u());
                    break;
                case 8:
                    obj2 = Boolean.valueOf(w0Var.e());
                    break;
                case 9:
                    obj2 = Integer.valueOf(w0Var.h());
                    break;
                case 10:
                    obj2 = Integer.valueOf(w0Var.E());
                    break;
                case 11:
                    obj2 = Long.valueOf(w0Var.f());
                    break;
                case 12:
                    obj2 = Integer.valueOf(w0Var.l());
                    break;
                case 13:
                    obj2 = Long.valueOf(w0Var.y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    obj2 = w0Var.o();
                    break;
                case 16:
                    obj2 = w0Var.z();
                    break;
                case 17:
                    obj2 = w0Var.N(eVar.b().getClass(), nVar);
                    break;
                case 18:
                    obj2 = w0Var.M(eVar.b().getClass(), nVar);
                    break;
            }
            if (eVar.d()) {
                sVar.a(eVar.b, obj2);
            } else {
                int i2 = iArr[eVar.a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = sVar.i(eVar.b)) != null) {
                    obj2 = x.h(i, obj2);
                }
                sVar.x(eVar.b, obj2);
            }
        } else {
            w0Var.p();
            eVar.b.g();
            throw null;
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public void h(w0 w0Var, Object obj, n nVar, s<v.d> sVar) throws IOException {
        v.e eVar = (v.e) obj;
        sVar.x(eVar.b, w0Var.M(eVar.b().getClass(), nVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public void i(g gVar, Object obj, n nVar, s<v.d> sVar) throws IOException {
        v.e eVar = (v.e) obj;
        l0 k = eVar.b().e().k();
        e Q = e.Q(ByteBuffer.wrap(gVar.h0()), true);
        t0.a().b(k, Q, nVar);
        sVar.x(eVar.b, k);
        if (Q.A() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.o
    public void j(j1 j1Var, Map.Entry<?, ?> entry) throws IOException {
        v.d dVar = (v.d) entry.getKey();
        if (dVar.j()) {
            switch (a.a[dVar.l().ordinal()]) {
                case 1:
                    z0.P(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 2:
                    z0.T(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 3:
                    z0.W(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 4:
                    z0.e0(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 5:
                    z0.V(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 6:
                    z0.S(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 7:
                    z0.R(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 8:
                    z0.N(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 9:
                    z0.d0(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 10:
                    z0.Y(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 11:
                    z0.Z(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 12:
                    z0.a0(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 13:
                    z0.b0(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 14:
                    z0.V(dVar.e(), (List) entry.getValue(), j1Var, dVar.n());
                    return;
                case 15:
                    z0.O(dVar.e(), (List) entry.getValue(), j1Var);
                    return;
                case 16:
                    z0.c0(dVar.e(), (List) entry.getValue(), j1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        z0.U(dVar.e(), (List) entry.getValue(), j1Var, t0.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        z0.X(dVar.e(), (List) entry.getValue(), j1Var, t0.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (a.a[dVar.l().ordinal()]) {
            case 1:
                j1Var.p(dVar.e(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                j1Var.B(dVar.e(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                j1Var.u(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                j1Var.f(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                j1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                j1Var.s(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                j1Var.c(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                j1Var.v(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                j1Var.o(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                j1Var.w(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                j1Var.i(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                j1Var.H(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                j1Var.m(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                j1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                j1Var.K(dVar.e(), (g) entry.getValue());
                return;
            case 16:
                j1Var.e(dVar.e(), (String) entry.getValue());
                return;
            case 17:
                j1Var.N(dVar.e(), entry.getValue(), t0.a().d(entry.getValue().getClass()));
                return;
            case 18:
                j1Var.L(dVar.e(), entry.getValue(), t0.a().d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
