package defpackage;

import com.google.firebase.remoteconfig.c;
/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.java */
/* renamed from: cx3  reason: default package */
/* loaded from: classes2.dex */
public final class cx3 implements no3<bs8<c>> {
    private final yw3 a;

    public cx3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static cx3 a(yw3 yw3Var) {
        return new cx3(yw3Var);
    }

    public static bs8<c> c(yw3 yw3Var) {
        return (bs8) jh8.c(yw3Var.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bs8<c> get() {
        return c(this.a);
    }
}
