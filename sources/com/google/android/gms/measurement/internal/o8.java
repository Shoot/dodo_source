package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class o8 extends x2 {
    private volatile p8 c;
    private volatile p8 d;
    protected p8 e;
    private final Map<Activity, p8> f;
    private Activity g;
    private volatile boolean h;
    private volatile p8 i;
    private p8 j;
    private boolean k;
    private final Object l;

    public o8(u5 u5Var) {
        super(u5Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    private final String C(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > a().q(null, false)) {
            return str2.substring(0, a().q(null, false));
        }
        return str2;
    }

    private final void F(Activity activity, p8 p8Var, boolean z) {
        p8 p8Var2;
        p8 p8Var3;
        String str;
        if (this.c == null) {
            p8Var2 = this.d;
        } else {
            p8Var2 = this.c;
        }
        p8 p8Var4 = p8Var2;
        if (p8Var.b == null) {
            if (activity != null) {
                str = C(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            p8Var3 = new p8(p8Var.a, str, p8Var.c, p8Var.e, p8Var.f);
        } else {
            p8Var3 = p8Var;
        }
        this.d = this.c;
        this.c = p8Var3;
        k().C(new q8(this, p8Var3, p8Var4, b().b(), z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        o8Var.M(p8Var, p8Var2, j, true, o8Var.h().E(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [long, android.os.BaseBundle] */
    public final void M(p8 p8Var, p8 p8Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        l();
        boolean z3 = false;
        if (p8Var2 != null && p8Var2.c == p8Var.c && Objects.equals(p8Var2.b, p8Var.b) && Objects.equals(p8Var2.a, p8Var.a)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            jb.P(p8Var, bundle2, true);
            if (p8Var2 != null) {
                String str2 = p8Var2.a;
                if (str2 != null) {
                    "_pn".putString("_pn", str2);
                }
                String str3 = p8Var2.b;
                if (str3 != null) {
                    "_pc".putString("_pc", str3);
                }
                ?? r8 = p8Var2.c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z3) {
                long a = t().f.a(j);
                if (a > 0) {
                    h().L(null, a);
                }
            }
            if (!a().Q()) {
                r82.putLong("_mst", 1L);
            }
            if (p8Var.e) {
                str = "app";
            } else {
                str = "auto";
            }
            String str4 = str;
            long currentTimeMillis = b().currentTimeMillis();
            if (p8Var.e) {
                currentTimeMillis = p8Var.f;
                if (currentTimeMillis != 0) {
                    j2 = currentTimeMillis;
                    q().S(str4, "_vs", j2, null);
                }
            }
            j2 = currentTimeMillis;
            q().S(str4, "_vs", j2, null);
        }
        if (z3) {
            N(this.e, true, j);
        }
        this.e = p8Var;
        if (p8Var.e) {
            this.j = p8Var;
        }
        s().E(p8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(p8 p8Var, boolean z, long j) {
        boolean z2;
        m().u(b().b());
        if (p8Var != null && p8Var.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (t().D(z2, z, j) && p8Var != null) {
            p8Var.d = false;
        }
    }

    private final p8 S(@NonNull Activity activity) {
        gh8.j(activity);
        p8 p8Var = this.f.get(activity);
        if (p8Var == null) {
            p8 p8Var2 = new p8(null, C(activity.getClass(), "Activity"), h().O0());
            this.f.put(activity, p8Var2);
            p8Var = p8Var2;
        }
        if (this.i != null) {
            return this.i;
        }
        return p8Var;
    }

    public final p8 B(boolean z) {
        u();
        l();
        if (!z) {
            return this.e;
        }
        p8 p8Var = this.e;
        if (p8Var != null) {
            return p8Var;
        }
        return this.j;
    }

    public final void D(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!a().Q()) {
            return;
        }
        this.f.remove(activity);
    }

    public final void E(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!a().Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new p8(bundle2.getString(Action.NAME_ATTRIBUTE), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void G(@NonNull Activity activity, String str, String str2) {
        String str3;
        if (!a().Q()) {
            n().L().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        p8 p8Var = this.c;
        if (p8Var == null) {
            n().L().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            n().L().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = C(activity.getClass(), "Activity");
            }
            boolean equals = Objects.equals(p8Var.b, str2);
            boolean equals2 = Objects.equals(p8Var.a, str);
            if (equals && equals2) {
                n().L().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > a().q(null, false))) {
                n().L().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > a().q(null, false))) {
                n().L().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                m4 J = n().J();
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                J.c("Setting current screen to name, class", str3, str2);
                p8 p8Var2 = new p8(str, str2, h().O0());
                this.f.put(activity, p8Var2);
                F(activity, p8Var2, true);
            }
        }
    }

    public final void H(Bundle bundle, long j) {
        String str;
        String str2;
        String str3;
        p8 p8Var;
        synchronized (this.l) {
            try {
                if (!this.k) {
                    n().L().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str4 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > a().q(null, false))) {
                        n().L().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > a().q(null, false))) {
                        n().L().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        str4 = string2;
                    }
                } else {
                    str = null;
                }
                if (str4 == null) {
                    Activity activity = this.g;
                    if (activity != null) {
                        str4 = C(activity.getClass(), "Activity");
                    } else {
                        str4 = "Activity";
                    }
                }
                String str5 = str4;
                p8 p8Var2 = this.c;
                if (this.h && p8Var2 != null) {
                    this.h = false;
                    boolean equals = Objects.equals(p8Var2.b, str5);
                    boolean equals2 = Objects.equals(p8Var2.a, str);
                    if (equals && equals2) {
                        n().L().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                m4 J = n().J();
                if (str == null) {
                    str2 = "null";
                } else {
                    str2 = str;
                }
                if (str5 == null) {
                    str3 = "null";
                } else {
                    str3 = str5;
                }
                J.c("Logging screen view with name, class", str2, str3);
                if (this.c == null) {
                    p8Var = this.d;
                } else {
                    p8Var = this.c;
                }
                p8 p8Var3 = p8Var;
                p8 p8Var4 = new p8(str, str5, h().O0(), true, j);
                this.c = p8Var4;
                this.d = p8Var3;
                this.i = p8Var4;
                k().C(new r8(this, bundle, p8Var4, p8Var3, b().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p8 O() {
        return this.c;
    }

    public final void P(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long b = b().b();
        if (!a().Q()) {
            this.c = null;
            k().C(new s8(this, b));
            return;
        }
        p8 S = S(activity);
        this.d = this.c;
        this.c = null;
        k().C(new v8(this, S, b));
    }

    public final void Q(Activity activity, Bundle bundle) {
        p8 p8Var;
        if (!a().Q() || bundle == null || (p8Var = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", p8Var.c);
        bundle2.putString(Action.NAME_ATTRIBUTE, p8Var.a);
        bundle2.putString("referrer_name", p8Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void R(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (a().Q()) {
                    this.i = null;
                    k().C(new u8(this));
                }
            }
        }
        if (!a().Q()) {
            this.c = this.i;
            k().C(new t8(this));
            return;
        }
        F(activity, S(activity), false);
        x m = m();
        m.k().C(new v0(m, m.b().b()));
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
