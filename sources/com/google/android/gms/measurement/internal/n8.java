package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.m0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class n8 extends ua {
    public n8(va vaVar) {
        super(vaVar);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    public final byte[] x(@NonNull zzbe zzbeVar, String str) {
        gb gbVar;
        i0.a aVar;
        Bundle bundle;
        u4 u4Var;
        h0.a aVar2;
        byte[] bArr;
        long j;
        y a;
        l();
        this.a.P();
        gh8.j(zzbeVar);
        gh8.f(str);
        if (!a().C(str, b0.f0)) {
            n().E().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzbeVar.a) && !"_iapx".equals(zzbeVar.a)) {
            n().E().c("Generating a payload for this event is not available. package_name, event_name", str, zzbeVar.a);
            return null;
        } else {
            h0.a K = com.google.android.gms.internal.measurement.h0.K();
            p().P0();
            try {
                u4 C0 = p().C0(str);
                if (C0 == null) {
                    n().E().b("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!C0.s()) {
                    n().E().b("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    i0.a V0 = com.google.android.gms.internal.measurement.i0.D3().s0(1).V0("android");
                    if (!TextUtils.isEmpty(C0.v0())) {
                        V0.R(C0.v0());
                    }
                    if (!TextUtils.isEmpty(C0.x0())) {
                        V0.e0((String) gh8.j(C0.x0()));
                    }
                    if (!TextUtils.isEmpty(C0.h())) {
                        V0.k0((String) gh8.j(C0.h()));
                    }
                    if (C0.A() != -2147483648L) {
                        V0.h0((int) C0.A());
                    }
                    V0.o0(C0.i0()).c0(C0.e0());
                    String j2 = C0.j();
                    String t0 = C0.t0();
                    if (!TextUtils.isEmpty(j2)) {
                        V0.P0(j2);
                    } else if (!TextUtils.isEmpty(t0)) {
                        V0.H(t0);
                    }
                    V0.E0(C0.r0());
                    w6 Q = this.b.Q(str);
                    V0.V(C0.c0());
                    if (this.a.o() && a().J(V0.c1()) && Q.x() && !TextUtils.isEmpty(null)) {
                        V0.F0(null);
                    }
                    V0.u0(Q.v());
                    if (Q.x() && C0.r()) {
                        Pair<String, Boolean> y = r().y(C0.v0(), Q);
                        if (C0.r() && y != null && !TextUtils.isEmpty((CharSequence) y.first)) {
                            V0.X0(c((String) y.first, Long.toString(zzbeVar.d)));
                            Object obj = y.second;
                            if (obj != null) {
                                V0.Z(((Boolean) obj).booleanValue());
                            }
                        }
                    }
                    e().o();
                    i0.a C02 = V0.C0(Build.MODEL);
                    e().o();
                    C02.T0(Build.VERSION.RELEASE).A0((int) e().u()).b1(e().v());
                    if (Q.y() && C0.w0() != null) {
                        V0.Y(c((String) gh8.j(C0.w0()), Long.toString(zzbeVar.d)));
                    }
                    if (!TextUtils.isEmpty(C0.i())) {
                        V0.N0((String) gh8.j(C0.i()));
                    }
                    String v0 = C0.v0();
                    List<gb> L0 = p().L0(v0);
                    Iterator<gb> it = L0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            gbVar = it.next();
                            if ("_lte".equals(gbVar.c)) {
                                break;
                            }
                        } else {
                            gbVar = null;
                            break;
                        }
                    }
                    if (gbVar == null || gbVar.e == null) {
                        gb gbVar2 = new gb(v0, "auto", "_lte", b().currentTimeMillis(), 0L);
                        L0.add(gbVar2);
                        p().d0(gbVar2);
                    }
                    com.google.android.gms.internal.measurement.m0[] m0VarArr = new com.google.android.gms.internal.measurement.m0[L0.size()];
                    for (int i = 0; i < L0.size(); i++) {
                        m0.a z = com.google.android.gms.internal.measurement.m0.Z().w(L0.get(i).c).z(L0.get(i).d);
                        m().V(z, L0.get(i).e);
                        m0VarArr[i] = (com.google.android.gms.internal.measurement.m0) ((com.google.android.gms.internal.measurement.b2) z.u());
                    }
                    V0.j0(Arrays.asList(m0VarArr));
                    m().U(V0);
                    if (y5d.a() && a().s(b0.Q0)) {
                        this.b.u(C0, V0);
                    }
                    o4 b = o4.b(zzbeVar);
                    h().M(b.d, p().z0(str));
                    h().O(b, a().t(str));
                    Bundle bundle2 = b.d;
                    bundle2.putLong("_c", 1L);
                    n().E().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzbeVar.c);
                    if (h().E0(V0.c1())) {
                        h().N(bundle2, "_dbg", 1L);
                        h().N(bundle2, "_r", 1L);
                    }
                    y B0 = p().B0(str, zzbeVar.a);
                    if (B0 == null) {
                        aVar = V0;
                        bundle = bundle2;
                        u4Var = C0;
                        aVar2 = K;
                        bArr = null;
                        a = new y(str, zzbeVar.a, 0L, 0L, zzbeVar.d, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        aVar = V0;
                        bundle = bundle2;
                        u4Var = C0;
                        aVar2 = K;
                        bArr = null;
                        j = B0.f;
                        a = B0.a(zzbeVar.d);
                    }
                    p().T(a);
                    v vVar = new v(this.a, zzbeVar.c, str, zzbeVar.a, zzbeVar.d, j, bundle);
                    d0.a y2 = com.google.android.gms.internal.measurement.d0.b0().F(vVar.d).C(vVar.b).y(vVar.e);
                    Iterator<String> it2 = vVar.f.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        f0.a z2 = com.google.android.gms.internal.measurement.f0.b0().z(next);
                        Object v = vVar.f.v(next);
                        if (v != null) {
                            m().T(z2, v);
                            y2.z(z2);
                        }
                    }
                    i0.a aVar3 = aVar;
                    aVar3.B(y2).C(com.google.android.gms.internal.measurement.j0.H().s(com.google.android.gms.internal.measurement.e0.H().s(a.c).t(zzbeVar.a)));
                    aVar3.G(o().y(u4Var.v0(), Collections.emptyList(), aVar3.K(), Long.valueOf(y2.H()), Long.valueOf(y2.H())));
                    if (y2.L()) {
                        aVar3.B0(y2.H()).i0(y2.H());
                    }
                    long k0 = u4Var.k0();
                    int i2 = (k0 > 0L ? 1 : (k0 == 0L ? 0 : -1));
                    if (i2 != 0) {
                        aVar3.t0(k0);
                    }
                    long o0 = u4Var.o0();
                    if (o0 != 0) {
                        aVar3.x0(o0);
                    } else if (i2 != 0) {
                        aVar3.x0(k0);
                    }
                    String m = u4Var.m();
                    if (s8d.a() && a().C(str, b0.t0) && m != null) {
                        aVar3.Z0(m);
                    }
                    u4Var.q();
                    aVar3.m0((int) u4Var.m0()).M0(84002L).J0(b().currentTimeMillis()).f0(true);
                    if (a().s(b0.y0)) {
                        this.b.A(aVar3.c1(), aVar3);
                    }
                    h0.a aVar4 = aVar2;
                    aVar4.t(aVar3);
                    u4 u4Var2 = u4Var;
                    u4Var2.l0(aVar3.l0());
                    u4Var2.h0(aVar3.g0());
                    p().U(u4Var2);
                    p().S0();
                    try {
                        return m().i0(((com.google.android.gms.internal.measurement.h0) ((com.google.android.gms.internal.measurement.b2) aVar4.u())).k());
                    } catch (IOException e) {
                        n().F().c("Data loss. Failed to bundle and serialize. appId", k4.u(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                n().E().b("Resettable device id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                n().E().b("app instance id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                p().Q0();
            }
        }
    }
}
