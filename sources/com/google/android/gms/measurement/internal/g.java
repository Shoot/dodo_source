package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class g extends t6 {
    private Boolean b;
    private String c;
    private i d;
    private Boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(u5 u5Var) {
        super(u5Var);
        this.c = "";
        this.d = new i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.i
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static long H() {
        return b0.f.a(null).longValue();
    }

    public static long L() {
        return b0.F.a(null).longValue();
    }

    private final Bundle U() {
        try {
            if (zza().getPackageManager() == null) {
                n().F().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = t8c.a(zza()).c(zza().getPackageName(), 128);
            if (c == null) {
                n().F().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            n().F().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String c(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            gh8.j(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            n().F().b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            n().F().b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            n().F().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            n().F().b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final String A(String str, e4<String> e4Var) {
        if (str == null) {
            return e4Var.a(null);
        }
        return e4Var.a(this.d.c(str, e4Var.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean B(String str) {
        gh8.f(str);
        Bundle U = U();
        if (U == null) {
            n().F().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!U.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(U.getBoolean(str));
        }
    }

    public final boolean C(String str, e4<Boolean> e4Var) {
        return E(str, e4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D(String str) {
        return A(str, b0.N);
    }

    public final boolean E(String str, e4<Boolean> e4Var) {
        if (str == null) {
            return e4Var.a(null).booleanValue();
        }
        String c = this.d.c(str, e4Var.b());
        if (TextUtils.isEmpty(c)) {
            return e4Var.a(null).booleanValue();
        }
        return e4Var.a(Boolean.valueOf("1".equals(c))).booleanValue();
    }

    public final int F() {
        if (h().b0(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> G(java.lang.String r4) {
        /*
            r3 = this;
            defpackage.gh8.f(r4)
            android.os.Bundle r0 = r3.U()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.k4 r4 = r3.n()
            com.google.android.gms.measurement.internal.m4 r4 = r4.F()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.k4 r0 = r3.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.F()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.G(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(String str) {
        return E(str, b0.M);
    }

    public final boolean J(String str) {
        return "1".equals(this.d.c(str, "gaia_collection_enabled"));
    }

    public final boolean K(String str) {
        return "1".equals(this.d.c(str, "measurement.event_sampling_enabled"));
    }

    public final String M() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String N() {
        return c("debug.deferred.deeplink", "");
    }

    public final String O() {
        return this.c;
    }

    public final boolean P() {
        Boolean B = B("google_analytics_adid_collection_enabled");
        if (B != null && !B.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        Boolean B = B("google_analytics_automatic_screen_reporting_enabled");
        if (B != null && !B.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        Boolean B = B("firebase_analytics_collection_deactivated");
        if (B != null && B.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S() {
        if (this.b == null) {
            Boolean B = B("app_measurement_lite");
            this.b = B;
            if (B == null) {
                this.b = Boolean.FALSE;
            }
        }
        if (!this.b.booleanValue() && this.a.s()) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        boolean z;
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String a = xk8.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str != null && str.equals(a)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.e = Boolean.valueOf(z);
                        }
                        if (this.e == null) {
                            this.e = Boolean.TRUE;
                            n().F().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.e.booleanValue();
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

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final double m(String str, e4<Double> e4Var) {
        if (str == null) {
            return e4Var.a(null).doubleValue();
        }
        String c = this.d.c(str, e4Var.b());
        if (TextUtils.isEmpty(c)) {
            return e4Var.a(null).doubleValue();
        }
        try {
            return e4Var.a(Double.valueOf(Double.parseDouble(c))).doubleValue();
        } catch (NumberFormatException unused) {
            return e4Var.a(null).doubleValue();
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(String str) {
        return p(str, b0.J, 500, 2000);
    }

    public final int p(String str, e4<Integer> e4Var, int i, int i2) {
        return Math.max(Math.min(u(str, e4Var), i2), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int q(String str, boolean z) {
        if (!g7d.a() || !a().E(null, b0.Y0)) {
            return 100;
        }
        if (!z) {
            return 500;
        }
        return p(str, b0.T, 100, 500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(i iVar) {
        this.d = iVar;
    }

    public final boolean s(e4<Boolean> e4Var) {
        return E(null, e4Var);
    }

    public final int t(String str) {
        return p(str, b0.K, 25, 100);
    }

    public final int u(String str, e4<Integer> e4Var) {
        if (str == null) {
            return e4Var.a(null).intValue();
        }
        String c = this.d.c(str, e4Var.b());
        if (TextUtils.isEmpty(c)) {
            return e4Var.a(null).intValue();
        }
        try {
            return e4Var.a(Integer.valueOf(Integer.parseInt(c))).intValue();
        } catch (NumberFormatException unused) {
            return e4Var.a(null).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int v(String str, boolean z) {
        return Math.max(q(str, z), 256);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int w() {
        if (!l7d.a() || !a().E(null, b0.E0) || !h().b0(231100000, true)) {
            return 0;
        }
        return 35;
    }

    public final int x(String str) {
        return u(str, b0.q);
    }

    public final long y(String str, e4<Long> e4Var) {
        if (str == null) {
            return e4Var.a(null).longValue();
        }
        String c = this.d.c(str, e4Var.b());
        if (TextUtils.isEmpty(c)) {
            return e4Var.a(null).longValue();
        }
        try {
            return e4Var.a(Long.valueOf(Long.parseLong(c))).longValue();
        } catch (NumberFormatException unused) {
            return e4Var.a(null).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long z(String str) {
        return y(str, b0.c);
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
