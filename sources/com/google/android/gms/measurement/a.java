package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.u5;
import com.google.android.gms.measurement.internal.z6;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class a extends AppMeasurement.a {
    private final u5 a;
    private final z6 b;

    public a(@NonNull u5 u5Var) {
        super();
        gh8.j(u5Var);
        this.a = u5Var;
        this.b = u5Var.G();
    }

    @Override // defpackage.u2d
    public final String a() {
        return this.b.j0();
    }

    @Override // defpackage.u2d
    public final void b(String str, String str2, Bundle bundle) {
        this.a.G().V(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final List<Bundle> c(String str, String str2) {
        return this.b.B(str, str2);
    }

    @Override // defpackage.u2d
    public final void d(String str, String str2, Bundle bundle) {
        this.b.z0(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final void e(String str) {
        this.a.x().y(str, this.a.b().b());
    }

    @Override // defpackage.u2d
    public final Map<String, Object> f(String str, String str2, boolean z) {
        return this.b.C(str, str2, z);
    }

    @Override // defpackage.u2d
    public final String g() {
        return this.b.i0();
    }

    @Override // defpackage.u2d
    public final String h() {
        return this.b.k0();
    }

    @Override // defpackage.u2d
    public final String i() {
        return this.b.i0();
    }

    @Override // defpackage.u2d
    public final int k(String str) {
        gh8.f(str);
        return 25;
    }

    @Override // defpackage.u2d
    public final void p(String str) {
        this.a.x().C(str, this.a.b().b());
    }

    @Override // defpackage.u2d
    public final void q(Bundle bundle) {
        this.b.w0(bundle);
    }

    @Override // defpackage.u2d
    public final long zza() {
        return this.a.K().O0();
    }
}
