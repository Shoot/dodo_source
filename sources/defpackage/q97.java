package defpackage;
/* compiled from: OnboardingModule_ProvideFeatureRepositoryFactory.java */
/* renamed from: q97  reason: default package */
/* loaded from: classes3.dex */
public final class q97 implements no3<fq3> {
    private final as8<vz4> a;

    public q97(as8<vz4> as8Var) {
        this.a = as8Var;
    }

    public static q97 a(as8<vz4> as8Var) {
        return new q97(as8Var);
    }

    public static fq3 c(vz4 vz4Var) {
        return (fq3) jh8.e(m97.a.d(vz4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fq3 get() {
        return c(this.a.get());
    }
}
