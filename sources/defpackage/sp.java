package defpackage;
/* compiled from: ApplicationModule_ProvideGetDataAvailabilityInteractorFactory.java */
/* renamed from: sp  reason: default package */
/* loaded from: classes3.dex */
public final class sp implements no3<df4> {
    private final as8<vc6> a;

    public sp(as8<vc6> as8Var) {
        this.a = as8Var;
    }

    public static sp a(as8<vc6> as8Var) {
        return new sp(as8Var);
    }

    public static df4 c(vc6 vc6Var) {
        return (df4) jh8.e(pp.a.c(vc6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public df4 get() {
        return c(this.a.get());
    }
}
