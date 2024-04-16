package defpackage;

import com.google.firebase.perf.config.a;
/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory.java */
/* renamed from: zw3  reason: default package */
/* loaded from: classes2.dex */
public final class zw3 implements no3<a> {
    private final yw3 a;

    public zw3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static zw3 a(yw3 yw3Var) {
        return new zw3(yw3Var);
    }

    public static a c(yw3 yw3Var) {
        return (a) jh8.c(yw3Var.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a);
    }
}
