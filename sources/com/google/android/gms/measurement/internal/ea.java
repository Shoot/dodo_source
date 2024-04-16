package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class ea extends x2 {
    private Handler c;
    private boolean d;
    protected final na e;
    protected final la f;
    private final fa g;

    public ea(u5 u5Var) {
        super(u5Var);
        this.d = true;
        this.e = new na(this);
        this.f = new la(this);
        this.g = new fa(this);
    }

    public static /* synthetic */ void B(ea eaVar, long j) {
        eaVar.l();
        eaVar.F();
        eaVar.n().J().b("Activity paused, time", Long.valueOf(j));
        eaVar.g.b(j);
        if (eaVar.a().Q()) {
            eaVar.f.e(j);
        }
    }

    public final void F() {
        l();
        if (this.c == null) {
            this.c = new cuc(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void H(ea eaVar, long j) {
        eaVar.l();
        eaVar.F();
        eaVar.n().J().b("Activity resumed, time", Long.valueOf(j));
        if (eaVar.a().s(b0.N0)) {
            if (eaVar.a().Q() || eaVar.d) {
                eaVar.f.f(j);
            }
        } else if (eaVar.a().Q() || eaVar.g().u.b()) {
            eaVar.f.f(j);
        }
        eaVar.g.a();
        na naVar = eaVar.e;
        naVar.a.l();
        if (naVar.a.a.o()) {
            naVar.b(naVar.a.b().currentTimeMillis(), false);
        }
    }

    public final void C(boolean z) {
        l();
        this.d = z;
    }

    public final boolean D(boolean z, boolean z2, long j) {
        return this.f.d(z, z2, j);
    }

    public final boolean E() {
        l();
        return this.d;
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

    @Override // com.google.android.gms.measurement.internal.x2
    protected final boolean z() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
