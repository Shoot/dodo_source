package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class b extends AppMeasurement.a {
    private final u2d a;

    public b(u2d u2dVar) {
        super();
        gh8.j(u2dVar);
        this.a = u2dVar;
    }

    @Override // defpackage.u2d
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.u2d
    public final void b(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final List<Bundle> c(String str, String str2) {
        return this.a.c(str, str2);
    }

    @Override // defpackage.u2d
    public final void d(String str, String str2, Bundle bundle) {
        this.a.d(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final void e(String str) {
        this.a.e(str);
    }

    @Override // defpackage.u2d
    public final Map<String, Object> f(String str, String str2, boolean z) {
        return this.a.f(str, str2, z);
    }

    @Override // defpackage.u2d
    public final String g() {
        return this.a.g();
    }

    @Override // defpackage.u2d
    public final String h() {
        return this.a.h();
    }

    @Override // defpackage.u2d
    public final String i() {
        return this.a.i();
    }

    @Override // defpackage.u2d
    public final int k(String str) {
        return this.a.k(str);
    }

    @Override // defpackage.u2d
    public final void p(String str) {
        this.a.p(str);
    }

    @Override // defpackage.u2d
    public final void q(Bundle bundle) {
        this.a.q(bundle);
    }

    @Override // defpackage.u2d
    public final long zza() {
        return this.a.zza();
    }
}
