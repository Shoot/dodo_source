package defpackage;
/* compiled from: FeatureAppModule_ProvideFeatureRepositoryFactory.java */
/* renamed from: vp3  reason: default package */
/* loaded from: classes3.dex */
public final class vp3 implements no3<fq3> {
    private final as8<jk2> a;

    public vp3(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static vp3 a(as8<jk2> as8Var) {
        return new vp3(as8Var);
    }

    public static fq3 c(jk2 jk2Var) {
        return (fq3) jh8.e(up3.a.a(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fq3 get() {
        return c(this.a.get());
    }
}
