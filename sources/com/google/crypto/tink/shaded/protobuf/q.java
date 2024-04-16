package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes2.dex */
final class q extends p<w.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j1.b.values().length];
            a = iArr;
            try {
                iArr[j1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[j1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j1.b.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[j1.b.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[j1.b.s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[j1.b.t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[j1.b.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[j1.b.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[j1.b.k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[j1.b.l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[j1.b.m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public int a(Map.Entry<?, ?> entry) {
        return ((w.d) entry.getKey()).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public Object b(o oVar, m0 m0Var, int i) {
        return oVar.a(m0Var, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public t<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public t<w.d> d(Object obj) {
        return ((w.c) obj).L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public boolean e(m0 m0Var) {
        return m0Var instanceof w.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public void f(Object obj) {
        c(obj).s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public <UT, UB> UB g(x0 x0Var, Object obj, o oVar, t<w.d> tVar, UB ub, e1<UT, UB> e1Var) throws IOException {
        Object valueOf;
        Object i;
        ArrayList arrayList;
        w.e eVar = (w.e) obj;
        int c = eVar.c();
        if (eVar.b.j() && eVar.b.n()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    x0Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    x0Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    x0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    x0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    x0Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    x0Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    x0Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    x0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    x0Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    x0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    x0Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    x0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    x0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    x0Var.j(arrayList);
                    ub = (UB) a1.z(c, arrayList, eVar.b.g(), ub, e1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.l());
            }
            tVar.w(eVar.b, arrayList);
        } else {
            if (eVar.a() == j1.b.p) {
                int p = x0Var.p();
                if (eVar.b.g().a(p) == null) {
                    return (UB) a1.L(c, p, ub, e1Var);
                }
                valueOf = Integer.valueOf(p);
            } else {
                switch (a.a[eVar.a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(x0Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(x0Var.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(x0Var.H());
                        break;
                    case 4:
                        valueOf = Long.valueOf(x0Var.s());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(x0Var.p());
                        break;
                    case 6:
                        valueOf = Long.valueOf(x0Var.b());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(x0Var.u());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(x0Var.e());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(x0Var.h());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(x0Var.E());
                        break;
                    case 11:
                        valueOf = Long.valueOf(x0Var.f());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(x0Var.l());
                        break;
                    case 13:
                        valueOf = Long.valueOf(x0Var.y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = x0Var.o();
                        break;
                    case 16:
                        valueOf = x0Var.z();
                        break;
                    case 17:
                        valueOf = x0Var.K(eVar.b().getClass(), oVar);
                        break;
                    case 18:
                        valueOf = x0Var.O(eVar.b().getClass(), oVar);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (eVar.d()) {
                tVar.a(eVar.b, valueOf);
            } else {
                int i2 = a.a[eVar.a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = tVar.i(eVar.b)) != null) {
                    valueOf = y.h(i, valueOf);
                }
                tVar.w(eVar.b, valueOf);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public void h(x0 x0Var, Object obj, o oVar, t<w.d> tVar) throws IOException {
        w.e eVar = (w.e) obj;
        tVar.w(eVar.b, x0Var.O(eVar.b().getClass(), oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public void i(h hVar, Object obj, o oVar, t<w.d> tVar) throws IOException {
        w.e eVar = (w.e) obj;
        m0 k = eVar.b().e().k();
        f Q = f.Q(ByteBuffer.wrap(hVar.h0()), true);
        u0.a().b(k, Q, oVar);
        tVar.w(eVar.b, k);
        if (Q.A() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.p
    public void j(k1 k1Var, Map.Entry<?, ?> entry) throws IOException {
        w.d dVar = (w.d) entry.getKey();
        if (dVar.j()) {
            switch (a.a[dVar.l().ordinal()]) {
                case 1:
                    a1.P(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 2:
                    a1.T(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 3:
                    a1.W(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 4:
                    a1.e0(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 5:
                    a1.V(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 6:
                    a1.S(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 7:
                    a1.R(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 8:
                    a1.N(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 9:
                    a1.d0(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 10:
                    a1.Y(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 11:
                    a1.Z(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 12:
                    a1.a0(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 13:
                    a1.b0(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 14:
                    a1.V(dVar.e(), (List) entry.getValue(), k1Var, dVar.n());
                    return;
                case 15:
                    a1.O(dVar.e(), (List) entry.getValue(), k1Var);
                    return;
                case 16:
                    a1.c0(dVar.e(), (List) entry.getValue(), k1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        a1.U(dVar.e(), (List) entry.getValue(), k1Var, u0.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        a1.X(dVar.e(), (List) entry.getValue(), k1Var, u0.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (a.a[dVar.l().ordinal()]) {
            case 1:
                k1Var.p(dVar.e(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                k1Var.B(dVar.e(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                k1Var.u(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                k1Var.f(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                k1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                k1Var.s(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                k1Var.c(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                k1Var.v(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                k1Var.o(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                k1Var.w(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                k1Var.i(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                k1Var.H(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                k1Var.m(dVar.e(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                k1Var.h(dVar.e(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                k1Var.M(dVar.e(), (h) entry.getValue());
                return;
            case 16:
                k1Var.e(dVar.e(), (String) entry.getValue());
                return;
            case 17:
                k1Var.K(dVar.e(), entry.getValue(), u0.a().d(entry.getValue().getClass()));
                return;
            case 18:
                k1Var.N(dVar.e(), entry.getValue(), u0.a().d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
