package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class ta extends ra {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ta(va vaVar) {
        super(vaVar);
    }

    private final String v(String str) {
        String P = q().P(str);
        if (!TextUtils.isEmpty(P)) {
            Uri parse = Uri.parse(b0.s.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(P + "." + authority);
            return buildUpon.build().toString();
        }
        return b0.s.a(null);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Uri.Builder t(String str) {
        String P = q().P(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(a().A(str, b0.Y));
        if (!TextUtils.isEmpty(P)) {
            String A = a().A(str, b0.Z);
            builder.authority(P + "." + A);
        } else {
            builder.authority(a().A(str, b0.Z));
        }
        builder.path(a().A(str, b0.a0));
        return builder;
    }

    public final wa u(String str) {
        String str2;
        if (i9d.a() && a().s(b0.v0)) {
            n().J().a("sgtm feature flag enabled.");
            u4 C0 = p().C0(str);
            if (C0 == null) {
                return new wa(v(str));
            }
            wa waVar = null;
            if (C0.u()) {
                n().J().a("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.p K = q().K(C0.v0());
                if (K != null && K.c0()) {
                    String K2 = K.R().K();
                    if (!TextUtils.isEmpty(K2)) {
                        String J = K.R().J();
                        m4 J2 = n().J();
                        if (TextUtils.isEmpty(J)) {
                            str2 = "Y";
                        } else {
                            str2 = "N";
                        }
                        J2.c("sgtm configured with upload_url, server_info", K2, str2);
                        if (TextUtils.isEmpty(J)) {
                            waVar = new wa(K2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", J);
                            waVar = new wa(K2, hashMap);
                        }
                    }
                }
            }
            if (waVar != null) {
                return waVar;
            }
        }
        return new wa(v(str));
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
