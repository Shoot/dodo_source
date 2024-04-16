package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class y5 extends kxc {
    private final va a;
    private Boolean b;
    private String c;

    public y5(va vaVar) {
        this(vaVar, null);
    }

    private final void T1(Runnable runnable) {
        gh8.j(runnable);
        if (this.a.k().I()) {
            runnable.run();
        } else {
            this.a.k().C(runnable);
        }
    }

    private final void V1(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !cqb.a(this.a.zza(), Binder.getCallingUid()) && !com.google.android.gms.common.e.a(this.a.zza()).c(Binder.getCallingUid())) {
                            z2 = false;
                            this.b = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.n().F().b("Measurement Service called with invalid calling package. appId", k4.u(str));
                    throw e;
                }
            }
            if (this.c == null && com.google.android.gms.common.d.j(this.a.zza(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (str.equals(this.c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.a.n().F().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void X1(zzo zzoVar, boolean z) {
        gh8.j(zzoVar);
        gh8.f(zzoVar.a);
        V1(zzoVar.a, false);
        this.a.n0().j0(zzoVar.b, zzoVar.q);
    }

    private final void Z1(zzbe zzbeVar, zzo zzoVar) {
        this.a.o0();
        this.a.s(zzbeVar, zzoVar);
    }

    @Override // defpackage.lxc
    public final List<zznb> C0(zzo zzoVar, boolean z) {
        X1(zzoVar, false);
        String str = zzoVar.a;
        gh8.j(str);
        try {
            List<gb> list = (List) this.a.k().v(new p6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (gb gbVar : list) {
                if (!z && jb.G0(gbVar.c)) {
                }
                arrayList.add(new zznb(gbVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.a.n().F().c("Failed to get user properties. appId", k4.u(zzoVar.a), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.a.n().F().c("Failed to get user properties. appId", k4.u(zzoVar.a), e);
            return null;
        }
    }

    @Override // defpackage.lxc
    public final List<zznb> C1(String str, String str2, boolean z, zzo zzoVar) {
        X1(zzoVar, false);
        String str3 = zzoVar.a;
        gh8.j(str3);
        try {
            List<gb> list = (List) this.a.k().v(new d6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (gb gbVar : list) {
                if (!z && jb.G0(gbVar.c)) {
                }
                arrayList.add(new zznb(gbVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.a.n().F().c("Failed to query user properties. appId", k4.u(zzoVar.a), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.a.n().F().c("Failed to query user properties. appId", k4.u(zzoVar.a), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.lxc
    public final List<zzae> D(String str, String str2, zzo zzoVar) {
        X1(zzoVar, false);
        String str3 = zzoVar.a;
        gh8.j(str3);
        try {
            return (List) this.a.k().v(new f6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.n().F().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.lxc
    public final void I(zzbe zzbeVar, zzo zzoVar) {
        gh8.j(zzbeVar);
        X1(zzoVar, false);
        T1(new m6(this, zzbeVar, zzoVar));
    }

    @Override // defpackage.lxc
    public final void K0(zzo zzoVar) {
        gh8.f(zzoVar.a);
        V1(zzoVar.a, false);
        T1(new h6(this, zzoVar));
    }

    @Override // defpackage.lxc
    public final List<zznb> M(String str, String str2, String str3, boolean z) {
        V1(str, true);
        try {
            List<gb> list = (List) this.a.k().v(new g6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (gb gbVar : list) {
                if (!z && jb.G0(gbVar.c)) {
                }
                arrayList.add(new zznb(gbVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.a.n().F().c("Failed to get user properties as. appId", k4.u(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.a.n().F().c("Failed to get user properties as. appId", k4.u(str), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.lxc
    public final byte[] P(zzbe zzbeVar, String str) {
        gh8.f(str);
        gh8.j(zzbeVar);
        V1(str, true);
        this.a.n().E().b("Log and bundle. event", this.a.f0().c(zzbeVar.a));
        long a = this.a.b().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.k().A(new o6(this, zzbeVar, str)).get();
            if (bArr == null) {
                this.a.n().F().b("Log and bundle returned null. appId", k4.u(str));
                bArr = new byte[0];
            }
            this.a.n().E().d("Log and bundle processed. event, size, time_ms", this.a.f0().c(zzbeVar.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.b().a() / 1000000) - a));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.a.n().F().d("Failed to log and bundle. appId, event, error", k4.u(str), this.a.f0().c(zzbeVar.a), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.a.n().F().d("Failed to log and bundle. appId, event, error", k4.u(str), this.a.f0().c(zzbeVar.a), e);
            return null;
        }
    }

    @Override // defpackage.lxc
    public final void T0(zzo zzoVar) {
        gh8.f(zzoVar.a);
        gh8.j(zzoVar.v);
        k6 k6Var = new k6(this, zzoVar);
        gh8.j(k6Var);
        if (this.a.k().I()) {
            k6Var.run();
        } else {
            this.a.k().F(k6Var);
        }
    }

    @Override // defpackage.lxc
    public final void U0(final Bundle bundle, zzo zzoVar) {
        X1(zzoVar, false);
        final String str = zzoVar.a;
        gh8.j(str);
        T1(new Runnable() { // from class: com.google.android.gms.measurement.internal.x5
            @Override // java.lang.Runnable
            public final void run() {
                y5.this.U1(str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void U1(String str, Bundle bundle) {
        this.a.e0().g0(str, bundle);
    }

    @Override // defpackage.lxc
    public final void W0(zzo zzoVar) {
        X1(zzoVar, false);
        T1(new a6(this, zzoVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbe W1(zzbe zzbeVar, zzo zzoVar) {
        zzaz zzazVar;
        if ("_cmp".equals(zzbeVar.a) && (zzazVar = zzbeVar.b) != null && zzazVar.h() != 0) {
            String w = zzbeVar.b.w("_cis");
            if ("referrer broadcast".equals(w) || "referrer API".equals(w)) {
                this.a.n().I().b("Event has been filtered ", zzbeVar.toString());
                return new zzbe("_cmpx", zzbeVar.b, zzbeVar.c, zzbeVar.d);
            }
        }
        return zzbeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y1(zzbe zzbeVar, zzo zzoVar) {
        gqc d;
        if (!this.a.h0().V(zzoVar.a)) {
            Z1(zzbeVar, zzoVar);
            return;
        }
        this.a.n().J().b("EES config found for", zzoVar.a);
        g5 h0 = this.a.h0();
        String str = zzoVar.a;
        if (TextUtils.isEmpty(str)) {
            d = null;
        } else {
            d = h0.j.d(str);
        }
        if (d == null) {
            this.a.n().J().b("EES not loaded for", zzoVar.a);
            Z1(zzbeVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> O = this.a.m0().O(zzbeVar.b.t(), true);
            String a = d1d.a(zzbeVar.a);
            if (a == null) {
                a = zzbeVar.a;
            }
            if (d.d(new dnc(a, zzbeVar.d, O))) {
                if (d.g()) {
                    this.a.n().J().b("EES edited event", zzbeVar.a);
                    Z1(this.a.m0().F(d.a().d()), zzoVar);
                } else {
                    Z1(zzbeVar, zzoVar);
                }
                if (d.f()) {
                    for (dnc dncVar : d.a().f()) {
                        this.a.n().J().b("EES logging created event", dncVar.e());
                        Z1(this.a.m0().F(dncVar), zzoVar);
                    }
                    return;
                }
                return;
            }
        } catch (zzc unused) {
            this.a.n().F().c("EES error. appId, eventName", zzoVar.b, zzbeVar.a);
        }
        this.a.n().J().b("EES was not applied to event", zzbeVar.a);
        Z1(zzbeVar, zzoVar);
    }

    @Override // defpackage.lxc
    public final String b1(zzo zzoVar) {
        X1(zzoVar, false);
        return this.a.R(zzoVar);
    }

    @Override // defpackage.lxc
    public final void c0(zznb zznbVar, zzo zzoVar) {
        gh8.j(zznbVar);
        X1(zzoVar, false);
        T1(new n6(this, zznbVar, zzoVar));
    }

    @Override // defpackage.lxc
    public final void d1(zzbe zzbeVar, String str, String str2) {
        gh8.j(zzbeVar);
        gh8.f(str);
        V1(str, true);
        T1(new l6(this, zzbeVar, str));
    }

    @Override // defpackage.lxc
    public final void h0(long j, String str, String str2, String str3) {
        T1(new c6(this, str2, str3, str, j));
    }

    @Override // defpackage.lxc
    public final List<zzae> j0(String str, String str2, String str3) {
        V1(str, true);
        try {
            return (List) this.a.k().v(new i6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.n().F().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.lxc
    public final void j1(zzae zzaeVar, zzo zzoVar) {
        gh8.j(zzaeVar);
        gh8.j(zzaeVar.c);
        X1(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.a = zzoVar.a;
        T1(new b6(this, zzaeVar2, zzoVar));
    }

    @Override // defpackage.lxc
    public final void p1(zzo zzoVar) {
        X1(zzoVar, false);
        T1(new z5(this, zzoVar));
    }

    @Override // defpackage.lxc
    public final void q1(zzae zzaeVar) {
        gh8.j(zzaeVar);
        gh8.j(zzaeVar.c);
        gh8.f(zzaeVar.a);
        V1(zzaeVar.a, true);
        T1(new e6(this, new zzae(zzaeVar)));
    }

    @Override // defpackage.lxc
    public final zzaj s0(zzo zzoVar) {
        X1(zzoVar, false);
        gh8.f(zzoVar.a);
        if (y5d.a()) {
            try {
                return (zzaj) this.a.k().A(new j6(this, zzoVar)).get(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                this.a.n().F().c("Failed to get consent. appId", k4.u(zzoVar.a), e);
                return new zzaj(null);
            }
        }
        return new zzaj(null);
    }

    @Override // defpackage.lxc
    public final List<zzmh> z0(zzo zzoVar, Bundle bundle) {
        X1(zzoVar, false);
        gh8.j(zzoVar.a);
        try {
            return (List) this.a.k().v(new q6(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.n().F().c("Failed to get trigger URIs. appId", k4.u(zzoVar.a), e);
            return Collections.emptyList();
        }
    }

    private y5(va vaVar, String str) {
        gh8.j(vaVar);
        this.a = vaVar;
        this.c = null;
    }
}
