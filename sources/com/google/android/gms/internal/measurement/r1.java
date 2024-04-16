package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class r1 implements k4 {
    private final zzio a;

    private r1(zzio zzioVar) {
        zzio zzioVar2 = (zzio) d2.f(zzioVar, "output");
        this.a = zzioVar2;
        zzioVar2.a = this;
    }

    public static r1 a(zzio zzioVar) {
        r1 r1Var = zzioVar.a;
        if (r1Var != null) {
            return r1Var;
        }
        return new r1(zzioVar);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void A(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.z0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.Y(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void B(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof t2d) {
            t2d t2dVar = (t2d) list;
            while (i2 < list.size()) {
                Object j = t2dVar.j(i2);
                if (j instanceof String) {
                    this.a.q(i, (String) j);
                } else {
                    this.a.p(i, (d1) j);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.q(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void C(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void D(int i, long j) throws IOException {
        this.a.u0(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void E(int i, int i2) throws IOException {
        this.a.C0(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void F(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void G(int i, List<d1> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.p(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.o0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void I(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.e0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.n0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.u0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void K(int i, String str) throws IOException {
        this.a.q(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void L(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.j0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.o(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void M(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.s0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.C0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void N(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.W(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.o(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void O(int i, d1 d1Var) throws IOException {
        this.a.p(i, d1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void P(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.g0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void Q(int i, List<?> list, j3 j3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            V(i, list.get(i2), j3Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void R(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.k0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void S(int i, Object obj, j3 j3Var) throws IOException {
        zzio zzioVar = this.a;
        zzioVar.Z(i, 3);
        j3Var.h((h3d) obj, zzioVar.a);
        zzioVar.Z(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void T(int i, List<?> list, j3 j3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            S(i, list.get(i2), j3Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void U(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.d(list.get(i4).floatValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.K(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void V(int i, Object obj, j3 j3Var) throws IOException {
        this.a.s(i, (h3d) obj, j3Var);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    @Deprecated
    public final void e(int i) throws IOException {
        this.a.Z(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    @Deprecated
    public final void j(int i) throws IOException {
        this.a.Z(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void k(int i, boolean z) throws IOException {
        this.a.t(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void l(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void m(int i, int i2) throws IOException {
        this.a.n(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.j(list.get(i4).booleanValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.t(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void o(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void p(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void q(int i, Object obj) throws IOException {
        if (obj instanceof d1) {
            this.a.Q(i, (d1) obj);
        } else {
            this.a.r(i, (h3d) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void r(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.b0(list.get(i4).intValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void s(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.c(list.get(i4).doubleValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.J(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.M(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void t(int i, int i2) throws IOException {
        this.a.O(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void u(int i, long j) throws IOException {
        this.a.o(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void v(int i, double d) throws IOException {
        this.a.M(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void w(int i, float f) throws IOException {
        this.a.N(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final <K, V> void x(int i, t2<K, V> t2Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.Z(i, 2);
            this.a.Y(q2.a(t2Var, entry.getKey(), entry.getValue()));
            q2.b(this.a, t2Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void y(int i, int i2) throws IOException {
        this.a.f0(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.Z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzio.r0(list.get(i4).longValue());
            }
            this.a.Y(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final int zza() {
        return n5d.a;
    }
}
