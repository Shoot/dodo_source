package com.google.firebase.analytics;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes2.dex */
final class a implements u2d {
    private final /* synthetic */ jvc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(jvc jvcVar) {
        this.a = jvcVar;
    }

    @Override // defpackage.u2d
    public final String a() {
        return this.a.G();
    }

    @Override // defpackage.u2d
    public final void b(String str, String str2, Bundle bundle) {
        this.a.n(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final List<Bundle> c(String str, String str2) {
        return this.a.c(str, str2);
    }

    @Override // defpackage.u2d
    public final void d(String str, String str2, Bundle bundle) {
        this.a.A(str, str2, bundle);
    }

    @Override // defpackage.u2d
    public final void e(String str) {
        this.a.z(str);
    }

    @Override // defpackage.u2d
    public final Map<String, Object> f(String str, String str2, boolean z) {
        return this.a.d(str, str2, z);
    }

    @Override // defpackage.u2d
    public final String g() {
        return this.a.F();
    }

    @Override // defpackage.u2d
    public final String h() {
        return this.a.H();
    }

    @Override // defpackage.u2d
    public final String i() {
        return this.a.I();
    }

    @Override // defpackage.u2d
    public final int k(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.u2d
    public final void p(String str) {
        this.a.C(str);
    }

    @Override // defpackage.u2d
    public final void q(Bundle bundle) {
        this.a.k(bundle);
    }

    @Override // defpackage.u2d
    public final long zza() {
        return this.a.b();
    }
}
