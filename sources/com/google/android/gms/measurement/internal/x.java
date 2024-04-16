package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class x extends y3 {
    private final Map<String, Long> b;
    private final Map<String, Integer> c;
    private long d;

    public x(u5 u5Var) {
        super(u5Var);
        this.c = new lr();
        this.b = new lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void B(x xVar, String str, long j) {
        xVar.l();
        gh8.f(str);
        Integer num = xVar.c.get(str);
        if (num != null) {
            p8 B = xVar.r().B(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                xVar.c.remove(str);
                Long l = xVar.b.get(str);
                if (l == null) {
                    xVar.n().F().a("First ad unit exposure time was never set");
                } else {
                    xVar.b.remove(str);
                    xVar.z(str, j - l.longValue(), B);
                }
                if (xVar.c.isEmpty()) {
                    long j2 = xVar.d;
                    if (j2 == 0) {
                        xVar.n().F().a("First ad exposure time was never set");
                        return;
                    }
                    xVar.v(j - j2, B);
                    xVar.d = 0L;
                    return;
                }
                return;
            }
            xVar.c.put(str, Integer.valueOf(intValue));
            return;
        }
        xVar.n().F().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void v(long j, p8 p8Var) {
        if (p8Var == null) {
            n().J().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            n().J().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            jb.P(p8Var, bundle, true);
            q().B0("am", "_xa", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void x(x xVar, String str, long j) {
        xVar.l();
        gh8.f(str);
        if (xVar.c.isEmpty()) {
            xVar.d = j;
        }
        Integer num = xVar.c.get(str);
        if (num != null) {
            xVar.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (xVar.c.size() >= 100) {
            xVar.n().K().a("Too many ads visible");
        } else {
            xVar.c.put(str, 1);
            xVar.b.put(str, Long.valueOf(j));
        }
    }

    private final void z(String str, long j, p8 p8Var) {
        if (p8Var == null) {
            n().J().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            n().J().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            jb.P(p8Var, bundle, true);
            q().B0("am", "_xu", bundle);
        }
    }

    public final void C(String str, long j) {
        if (str != null && str.length() != 0) {
            k().C(new w1(this, str, j));
        } else {
            n().F().a("Ad unit id must be a non-empty string");
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ f4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ i4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ z6 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ o8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x8 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ ea t() {
        return super.t();
    }

    public final void u(long j) {
        p8 B = r().B(false);
        for (String str : this.b.keySet()) {
            z(str, j - this.b.get(str).longValue(), B);
        }
        if (!this.b.isEmpty()) {
            v(j - this.d, B);
        }
        A(j);
    }

    public final void y(String str, long j) {
        if (str != null && str.length() != 0) {
            k().C(new a(this, str, j));
        } else {
            n().F().a("Ad unit id must be a non-empty string");
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
