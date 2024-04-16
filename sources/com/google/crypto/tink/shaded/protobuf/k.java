package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.k1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes2.dex */
public final class k implements k1 {
    private final CodedOutputStream a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j1.b.values().length];
            a = iArr;
            try {
                iArr[j1.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j1.b.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j1.b.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j1.b.q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j1.b.s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j1.b.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j1.b.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[j1.b.e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j1.b.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j1.b.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[j1.b.f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[j1.b.k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) y.b(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.a = this;
    }

    public static k P(CodedOutputStream codedOutputStream) {
        k kVar = codedOutputStream.a;
        if (kVar != null) {
            return kVar;
        }
        return new k(codedOutputStream);
    }

    private <K, V> void Q(int i, f0.a<K, V> aVar, Map<K, V> map) throws IOException {
        int[] iArr = a.a;
        throw null;
    }

    private void R(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.L0(i, (String) obj);
        } else {
            this.a.j0(i, (h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.e(list.get(i4).booleanValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.i0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void B(int i, float f) throws IOException {
        this.a.s0(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void C(int i) throws IOException {
        this.a.M0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.P(list.get(i4).intValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.I0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.H0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void E(int i, int i2) throws IOException {
        this.a.m0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.y(list.get(i4).longValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.z0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.y0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void G(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.j(list.get(i4).doubleValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.l0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void H(int i, int i2) throws IOException {
        this.a.H0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void I(int i, List<h> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.j0(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public <K, V> void J(int i, f0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.a.c0()) {
            Q(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.M0(i, 2);
            this.a.O0(f0.b(aVar, entry.getKey(), entry.getValue()));
            f0.d(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void K(int i, Object obj, y0 y0Var) throws IOException {
        this.a.u0(i, (m0) obj, y0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void L(int i, List<?> list, y0 y0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), y0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void M(int i, h hVar) throws IOException {
        this.a.j0(i, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void N(int i, Object obj, y0 y0Var) throws IOException {
        this.a.A0(i, (m0) obj, y0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void O(int i, List<?> list, y0 y0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), y0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.r(list.get(i4).floatValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.t0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof h) {
            this.a.C0(i, (h) obj);
        } else {
            this.a.B0(i, (m0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void c(int i, int i2) throws IOException {
        this.a.o0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void d(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof co5) {
            co5 co5Var = (co5) list;
            while (i2 < list.size()) {
                R(i, co5Var.s(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.L0(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void e(int i, String str) throws IOException {
        this.a.L0(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void f(int i, long j) throws IOException {
        this.a.P0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.w(list.get(i4).intValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.w0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void h(int i, int i2) throws IOException {
        this.a.w0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void i(int i, long j) throws IOException {
        this.a.F0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.n(list.get(i4).intValue());
            }
            this.a.O0(i3);
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

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.W(list.get(i4).intValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.O0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.R(list.get(i4).longValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.K0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void m(int i, long j) throws IOException {
        this.a.J0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.l(list.get(i4).intValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.n0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void o(int i, int i2) throws IOException {
        this.a.N0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void p(int i, double d) throws IOException {
        this.a.k0(i, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.N(list.get(i4).longValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.G0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.F0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.Y(list.get(i4).longValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.Q0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void s(int i, long j) throws IOException {
        this.a.q0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public k1.a t() {
        return k1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void u(int i, long j) throws IOException {
        this.a.y0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void v(int i, boolean z) throws IOException {
        this.a.h0(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void w(int i, int i2) throws IOException {
        this.a.D0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void x(int i) throws IOException {
        this.a.M0(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).longValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.q0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k1
    public void z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.L(list.get(i4).intValue());
            }
            this.a.O0(i3);
            while (i2 < list.size()) {
                this.a.E0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.D0(i, list.get(i2).intValue());
            i2++;
        }
    }
}
