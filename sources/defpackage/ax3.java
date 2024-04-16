package defpackage;
/* compiled from: FirebasePerformanceModule_ProvidesFirebaseAppFactory.java */
/* renamed from: ax3  reason: default package */
/* loaded from: classes2.dex */
public final class ax3 implements no3<qv3> {
    private final yw3 a;

    public ax3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static ax3 a(yw3 yw3Var) {
        return new ax3(yw3Var);
    }

    public static qv3 c(yw3 yw3Var) {
        return (qv3) jh8.c(yw3Var.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qv3 get() {
        return c(this.a);
    }
}
