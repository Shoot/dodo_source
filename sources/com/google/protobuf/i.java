package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.h1;
import com.google.protobuf.i1;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class i implements i1 {
    private final CodedOutputStream a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h1.b.values().length];
            a = iArr;
            try {
                iArr[h1.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h1.b.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h1.b.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h1.b.q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h1.b.s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h1.b.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h1.b.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h1.b.e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h1.b.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h1.b.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h1.b.f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h1.b.k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) w.b(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.a = this;
    }

    public static i P(CodedOutputStream codedOutputStream) {
        i iVar = codedOutputStream.a;
        if (iVar != null) {
            return iVar;
        }
        return new i(codedOutputStream);
    }

    private <V> void Q(int i, boolean z, V v, d0.a<Boolean, V> aVar) throws IOException {
        this.a.S0(i, 2);
        this.a.U0(d0.b(aVar, Boolean.valueOf(z), v));
        d0.e(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void R(int i, d0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.a.S0(i, 2);
            this.a.U0(d0.b(aVar, Integer.valueOf(i4), v));
            d0.e(this.a, aVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void S(int i, d0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long l : map.keySet()) {
            jArr[i2] = l.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.a.S0(i, 2);
            this.a.U0(d0.b(aVar, Long.valueOf(j), v));
            d0.e(this.a, aVar, Long.valueOf(j), v);
        }
    }

    private <K, V> void T(int i, d0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void U(int i, d0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.a.S0(i, 2);
            this.a.U0(d0.b(aVar, str2, v));
            d0.e(this.a, aVar, str2, v);
        }
    }

    private void V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.Q0(i, (String) obj);
        } else {
            this.a.k0(i, (f) obj);
        }
    }

    @Override // com.google.protobuf.i1
    public void A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.e(list.get(i4).booleanValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.h0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void B(int i, float f) throws IOException {
        this.a.u0(i, f);
    }

    @Override // com.google.protobuf.i1
    @Deprecated
    public void C(int i) throws IOException {
        this.a.S0(i, 4);
    }

    @Override // com.google.protobuf.i1
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.O(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.N0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.M0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void E(int i, int i2) throws IOException {
        this.a.o0(i, i2);
    }

    @Override // com.google.protobuf.i1
    public void F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.y(list.get(i4).longValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.D0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.C0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void G(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.j(list.get(i4).doubleValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.n0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void H(int i, int i2) throws IOException {
        this.a.M0(i, i2);
    }

    @Override // com.google.protobuf.i1
    public void I(int i, List<f> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k0(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.i1
    public void J(int i, List<?> list, w0 w0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), w0Var);
        }
    }

    @Override // com.google.protobuf.i1
    public void K(int i, Object obj, w0 w0Var) throws IOException {
        this.a.x0(i, (k0) obj, w0Var);
    }

    @Override // com.google.protobuf.i1
    public void L(int i, f fVar) throws IOException {
        this.a.k0(i, fVar);
    }

    @Override // com.google.protobuf.i1
    public void M(int i, List<?> list, w0 w0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), w0Var);
        }
    }

    @Override // com.google.protobuf.i1
    public void N(int i, Object obj, w0 w0Var) throws IOException {
        this.a.E0(i, (k0) obj, w0Var);
    }

    @Override // com.google.protobuf.i1
    public <K, V> void O(int i, d0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.a.b0()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.S0(i, 2);
            this.a.U0(d0.b(aVar, entry.getKey(), entry.getValue()));
            d0.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.i1
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.r(list.get(i4).floatValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.v0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.u0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof f) {
            this.a.H0(i, (f) obj);
        } else {
            this.a.G0(i, (k0) obj);
        }
    }

    @Override // com.google.protobuf.i1
    public void c(int i, int i2) throws IOException {
        this.a.q0(i, i2);
    }

    @Override // com.google.protobuf.i1
    public void d(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof do5) {
            do5 do5Var = (do5) list;
            while (i2 < list.size()) {
                V(i, do5Var.s(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Q0(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void e(int i, String str) throws IOException {
        this.a.Q0(i, str);
    }

    @Override // com.google.protobuf.i1
    public void f(int i, long j) throws IOException {
        this.a.V0(i, j);
    }

    @Override // com.google.protobuf.i1
    public void g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.w(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.A0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void h(int i, int i2) throws IOException {
        this.a.A0(i, i2);
    }

    @Override // com.google.protobuf.i1
    public void i(int i, long j) throws IOException {
        this.a.K0(i, j);
    }

    @Override // com.google.protobuf.i1
    public void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.n(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.V(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.U0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.T0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.Q(list.get(i4).longValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.P0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void m(int i, long j) throws IOException {
        this.a.O0(i, j);
    }

    @Override // com.google.protobuf.i1
    public void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.l(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.p0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.o0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void o(int i, int i2) throws IOException {
        this.a.T0(i, i2);
    }

    @Override // com.google.protobuf.i1
    public void p(int i, double d) throws IOException {
        this.a.m0(i, d);
    }

    @Override // com.google.protobuf.i1
    public void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.M(list.get(i4).longValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.L0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.K0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.X(list.get(i4).longValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.W0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.V0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void s(int i, long j) throws IOException {
        this.a.s0(i, j);
    }

    @Override // com.google.protobuf.i1
    public i1.a t() {
        return i1.a.ASCENDING;
    }

    @Override // com.google.protobuf.i1
    public void u(int i, long j) throws IOException {
        this.a.C0(i, j);
    }

    @Override // com.google.protobuf.i1
    public void v(int i, boolean z) throws IOException {
        this.a.g0(i, z);
    }

    @Override // com.google.protobuf.i1
    public void w(int i, int i2) throws IOException {
        this.a.I0(i, i2);
    }

    @Override // com.google.protobuf.i1
    @Deprecated
    public void x(int i) throws IOException {
        this.a.S0(i, 3);
    }

    @Override // com.google.protobuf.i1
    public void y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).longValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.t0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.i1
    public void z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.K(list.get(i4).intValue());
            }
            this.a.U0(i3);
            while (i2 < list.size()) {
                this.a.J0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.I0(i, list.get(i2).intValue());
            i2++;
        }
    }
}
