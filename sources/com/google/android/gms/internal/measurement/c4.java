package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class c4 extends b4<a4, a4> {
    private static void m(Object obj, a4 a4Var) {
        ((b2) obj).zzb = a4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ int a(a4 a4Var) {
        return a4Var.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ a4 b(a4 a4Var, a4 a4Var2) {
        a4 a4Var3 = a4Var;
        a4 a4Var4 = a4Var2;
        if (a4.k().equals(a4Var4)) {
            return a4Var3;
        }
        if (a4.k().equals(a4Var3)) {
            return a4.c(a4Var3, a4Var4);
        }
        return a4Var3.b(a4Var4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void c(a4 a4Var, int i, d1 d1Var) {
        a4Var.e((i << 3) | 2, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void d(a4 a4Var, k4 k4Var) throws IOException {
        a4Var.g(k4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ int e(a4 a4Var) {
        return a4Var.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void f(a4 a4Var, int i, long j) {
        a4Var.e(i << 3, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void g(a4 a4Var, k4 k4Var) throws IOException {
        a4Var.j(k4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void h(Object obj, a4 a4Var) {
        m(obj, a4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ a4 i(Object obj) {
        a4 a4Var = ((b2) obj).zzb;
        if (a4Var == a4.k()) {
            a4 l = a4.l();
            m(obj, l);
            return l;
        }
        return a4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ void j(Object obj, a4 a4Var) {
        m(obj, a4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final /* synthetic */ a4 k(Object obj) {
        return ((b2) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b4
    public final void l(Object obj) {
        ((b2) obj).zzb.m();
    }
}
