package defpackage;
/* compiled from: CheckoutModule_ProvideOrderStepFactoryFactory.java */
/* renamed from: k51  reason: default package */
/* loaded from: classes3.dex */
public final class k51 implements no3<vi7> {
    private final as8<hq3> a;

    public k51(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static k51 a(as8<hq3> as8Var) {
        return new k51(as8Var);
    }

    public static vi7 c(hq3 hq3Var) {
        return (vi7) jh8.e(d51.a.f(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vi7 get() {
        return c(this.a.get());
    }
}
