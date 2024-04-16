package defpackage;
/* compiled from: FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.java */
/* renamed from: fx3  reason: default package */
/* loaded from: classes2.dex */
public final class fx3 implements no3<bs8<xlb>> {
    private final yw3 a;

    public fx3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static fx3 a(yw3 yw3Var) {
        return new fx3(yw3Var);
    }

    public static bs8<xlb> c(yw3 yw3Var) {
        return (bs8) jh8.c(yw3Var.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bs8<xlb> get() {
        return c(this.a);
    }
}
