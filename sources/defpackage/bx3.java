package defpackage;
/* compiled from: FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.java */
/* renamed from: bx3  reason: default package */
/* loaded from: classes2.dex */
public final class bx3 implements no3<ew3> {
    private final yw3 a;

    public bx3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static bx3 a(yw3 yw3Var) {
        return new bx3(yw3Var);
    }

    public static ew3 c(yw3 yw3Var) {
        return (ew3) jh8.c(yw3Var.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ew3 get() {
        return c(this.a);
    }
}
