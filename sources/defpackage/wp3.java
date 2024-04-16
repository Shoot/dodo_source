package defpackage;
/* compiled from: FeatureAppModule_ProvideFeatureServiceFactory.java */
/* renamed from: wp3  reason: default package */
/* loaded from: classes3.dex */
public final class wp3 implements no3<hq3> {
    private final as8<iq3> a;

    public wp3(as8<iq3> as8Var) {
        this.a = as8Var;
    }

    public static wp3 a(as8<iq3> as8Var) {
        return new wp3(as8Var);
    }

    public static hq3 c(iq3 iq3Var) {
        return (hq3) jh8.e(up3.a.b(iq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hq3 get() {
        return c(this.a.get());
    }
}
