package defpackage;
/* compiled from: ApplicationModule_ProvideAppInitializationStateFactory.java */
/* renamed from: qp  reason: default package */
/* loaded from: classes3.dex */
public final class qp implements no3<bo> {
    private final as8<Cdo> a;

    public qp(as8<Cdo> as8Var) {
        this.a = as8Var;
    }

    public static qp a(as8<Cdo> as8Var) {
        return new qp(as8Var);
    }

    public static bo c(Cdo cdo) {
        return (bo) jh8.e(pp.a.a(cdo));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bo get() {
        return c(this.a.get());
    }
}
