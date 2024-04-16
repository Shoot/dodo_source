package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class w9 extends ua {
    private final Map<String, z9> d;
    public final b5 e;
    public final b5 f;
    public final b5 g;
    public final b5 h;
    public final b5 i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w9(va vaVar) {
        super(vaVar);
        this.d = new HashMap();
        w4 g = g();
        Objects.requireNonNull(g);
        this.e = new b5(g, "last_delete_stale", 0L);
        w4 g2 = g();
        Objects.requireNonNull(g2);
        this.f = new b5(g2, "backoff", 0L);
        w4 g3 = g();
        Objects.requireNonNull(g3);
        this.g = new b5(g3, "last_upload", 0L);
        w4 g4 = g();
        Objects.requireNonNull(g4);
        this.h = new b5(g4, "last_upload_attempt", 0L);
        w4 g5 = g();
        Objects.requireNonNull(g5);
        this.i = new b5(g5, "midnight_offset", 0L);
    }

    @Deprecated
    private final Pair<String, Boolean> x(String str) {
        z9 z9Var;
        AdvertisingIdClient.Info info;
        l();
        long b = b().b();
        z9 z9Var2 = this.d.get(str);
        if (z9Var2 != null && b < z9Var2.c) {
            return new Pair<>(z9Var2.a, Boolean.valueOf(z9Var2.b));
        }
        AdvertisingIdClient.a(true);
        long z = a().z(str) + b;
        try {
            long y = a().y(str, b0.d);
            if (y > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (z9Var2 != null && b < z9Var2.c + y) {
                        return new Pair<>(z9Var2.a, Boolean.valueOf(z9Var2.b));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            }
        } catch (Exception e) {
            n().E().b("Unable to get advertising id", e);
            z9Var = new z9("", false, z);
        }
        if (info == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        if (id != null) {
            z9Var = new z9(id, info.isLimitAdTrackingEnabled(), z);
        } else {
            z9Var = new z9("", info.isLimitAdTrackingEnabled(), z);
        }
        this.d.put(str, z9Var);
        AdvertisingIdClient.a(false);
        return new Pair<>(z9Var.a, Boolean.valueOf(z9Var.b));
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

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ob o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ k p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ g5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ w9 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> y(String str, w6 w6Var) {
        if (w6Var.x()) {
            return x(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String z(String str, boolean z) {
        String str2;
        l();
        if (z) {
            str2 = (String) x(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest S0 = jb.S0();
        if (S0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, S0.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
