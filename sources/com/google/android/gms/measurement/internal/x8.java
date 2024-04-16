package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class x8 extends x2 {
    private final q9 c;
    private lxc d;
    private volatile Boolean e;
    private final r f;
    private final oa g;
    private final List<Runnable> h;
    private final r i;

    /* JADX INFO: Access modifiers changed from: protected */
    public x8(u5 u5Var) {
        super(u5Var);
        this.h = new ArrayList();
        this.g = new oa(u5Var.b());
        this.c = new q9(this);
        this.f = new w8(this, u5Var);
        this.i = new j9(this, u5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F(x8 x8Var, ComponentName componentName) {
        x8Var.l();
        if (x8Var.d != null) {
            x8Var.d = null;
            x8Var.n().J().b("Disconnected from device MeasurementService", componentName);
            x8Var.l();
            x8Var.X();
        }
    }

    private final void I(Runnable runnable) throws IllegalStateException {
        l();
        if (b0()) {
            runnable.run();
        } else if (this.h.size() >= 1000) {
            n().F().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.b(60000L);
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        l();
        n().J().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                n().F().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        l();
        this.g.c();
        this.f.b(b0.L.a(null).longValue());
    }

    private final zzo i0(boolean z) {
        String str;
        f4 o = o();
        if (z) {
            str = n().N();
        } else {
            str = null;
        }
        return o.A(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k0(x8 x8Var) {
        x8Var.l();
        if (x8Var.b0()) {
            x8Var.n().J().a("Inactivity, disconnecting from the service");
            x8Var.Y();
        }
    }

    public final void B(Bundle bundle) {
        l();
        u();
        I(new f9(this, i0(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(zzae zzaeVar) {
        gh8.j(zzaeVar);
        l();
        u();
        I(new m9(this, true, i0(true), p().D(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(zzbe zzbeVar, String str) {
        gh8.j(zzbeVar);
        l();
        u();
        I(new n9(this, true, i0(true), p().E(zzbeVar), zzbeVar, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E(p8 p8Var) {
        l();
        u();
        I(new h9(this, p8Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(zznb zznbVar) {
        l();
        u();
        I(new z8(this, i0(true), p().F(zznbVar), zznbVar));
    }

    public final void J(AtomicReference<String> atomicReference) {
        l();
        u();
        I(new b9(this, atomicReference, i0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(AtomicReference<List<zzmh>> atomicReference, Bundle bundle) {
        l();
        u();
        I(new a9(this, atomicReference, i0(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        l();
        u();
        I(new p9(this, atomicReference, str, str2, str3, i0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(AtomicReference<List<zznb>> atomicReference, String str, String str2, String str3, boolean z) {
        l();
        u();
        I(new r9(this, atomicReference, str, str2, str3, i0(false), z));
    }

    public final void N(huc hucVar) {
        l();
        u();
        I(new e9(this, i0(false), hucVar));
    }

    public final void O(huc hucVar, zzbe zzbeVar, String str) {
        l();
        u();
        if (h().t(com.google.android.gms.common.d.a) != 0) {
            n().K().a("Not bundling data. Service unavailable or out of date");
            h().Z(hucVar, new byte[0]);
            return;
        }
        I(new i9(this, zzbeVar, str, hucVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(huc hucVar, String str, String str2) {
        l();
        u();
        I(new o9(this, str, str2, i0(false), hucVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q(huc hucVar, String str, String str2, boolean z) {
        l();
        u();
        I(new y8(this, str, str2, i0(false), z, hucVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(lxc lxcVar) {
        l();
        gh8.j(lxcVar);
        this.d = lxcVar;
        g0();
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(lxc lxcVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int i;
        l();
        u();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> B = p().B(100);
            if (B != null) {
                arrayList.addAll(B);
                i = B.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbe) {
                    try {
                        lxcVar.I((zzbe) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e) {
                        n().F().b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zznb) {
                    try {
                        lxcVar.c0((zznb) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e2) {
                        n().F().b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        lxcVar.j1((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e3) {
                        n().F().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    n().F().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(boolean z) {
        l();
        u();
        if (z) {
            p().G();
        }
        if (d0()) {
            I(new k9(this, i0(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaj U() {
        l();
        u();
        lxc lxcVar = this.d;
        if (lxcVar == null) {
            X();
            n().E().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo i0 = i0(false);
        gh8.j(i0);
        try {
            zzaj s0 = lxcVar.s0(i0);
            g0();
            return s0;
        } catch (RemoteException e) {
            n().F().b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean V() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void W() {
        l();
        u();
        zzo i0 = i0(true);
        p().H();
        I(new d9(this, i0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X() {
        l();
        u();
        if (b0()) {
            return;
        }
        if (e0()) {
            this.c.a();
        } else if (!a().S()) {
            List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.c.b(intent);
                return;
            }
            n().F().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    public final void Y() {
        l();
        u();
        this.c.d();
        try {
            uq1.b().c(zza(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Z() {
        l();
        u();
        zzo i0 = i0(false);
        p().G();
        I(new c9(this, i0));
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a0() {
        l();
        u();
        I(new l9(this, i0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    public final boolean b0() {
        l();
        u();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0() {
        l();
        u();
        if (!e0() || h().F0() >= 200900) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0() {
        l();
        u();
        if (!e0() || h().F0() >= b0.o0.a(null).intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0() {
        /*
            r5 = this;
            r5.l()
            r5.u()
            java.lang.Boolean r0 = r5.e
            if (r0 != 0) goto Lfd
            r5.l()
            r5.u()
            com.google.android.gms.measurement.internal.w4 r0 = r5.g()
            java.lang.Boolean r0 = r0.L()
            r1 = 1
            if (r0 == 0) goto L23
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L23
            goto Lf7
        L23:
            com.google.android.gms.measurement.internal.f4 r2 = r5.o()
            int r2 = r2.B()
            if (r2 != r1) goto L30
        L2d:
            r3 = 1
            goto Ld4
        L30:
            com.google.android.gms.measurement.internal.k4 r2 = r5.n()
            com.google.android.gms.measurement.internal.m4 r2 = r2.J()
            java.lang.String r3 = "Checking service availability"
            r2.a(r3)
            com.google.android.gms.measurement.internal.jb r2 = r5.h()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.t(r3)
            if (r2 == 0) goto Lc5
            r3 = 0
            if (r2 == r1) goto Lb7
            r4 = 2
            if (r2 == r4) goto L98
            r0 = 3
            if (r2 == r0) goto L8a
            r0 = 9
            if (r2 == r0) goto L7c
            r0 = 18
            if (r2 == r0) goto L6e
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.K()
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b(r1, r2)
        L6c:
            r1 = 0
            goto Ld4
        L6e:
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.K()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L2d
        L7c:
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.K()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L6c
        L8a:
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.K()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            goto L6c
        L98:
            com.google.android.gms.measurement.internal.k4 r2 = r5.n()
            com.google.android.gms.measurement.internal.m4 r2 = r2.E()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.jb r2 = r5.h()
            int r2 = r2.F0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto Lb4
        Lb1:
            r1 = 0
            goto L2d
        Lb4:
            if (r0 != 0) goto L6c
            goto Ld4
        Lb7:
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.J()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto Lb1
        Lc5:
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.J()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L2d
        Ld4:
            if (r1 != 0) goto Lee
            com.google.android.gms.measurement.internal.g r0 = r5.a()
            boolean r0 = r0.S()
            if (r0 == 0) goto Lee
            com.google.android.gms.measurement.internal.k4 r0 = r5.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.F()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto Lf7
        Lee:
            if (r3 == 0) goto Lf7
            com.google.android.gms.measurement.internal.w4 r0 = r5.g()
            r0.v(r1)
        Lf7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.e = r0
        Lfd:
            java.lang.Boolean r0 = r5.e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x8.e0():boolean");
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
