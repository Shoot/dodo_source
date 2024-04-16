package defpackage;
/* compiled from: OnboardingModule_ProvideFeatureServiceFactory.java */
/* renamed from: r97  reason: default package */
/* loaded from: classes3.dex */
public final class r97 implements no3<hq3> {
    private final as8<h97> a;
    private final as8<hq3> b;
    private final as8<iq3> c;

    public r97(as8<h97> as8Var, as8<hq3> as8Var2, as8<iq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static r97 a(as8<h97> as8Var, as8<hq3> as8Var2, as8<iq3> as8Var3) {
        return new r97(as8Var, as8Var2, as8Var3);
    }

    public static hq3 c(h97 h97Var, hq3 hq3Var, iq3 iq3Var) {
        return (hq3) jh8.e(m97.a.e(h97Var, hq3Var, iq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hq3 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
