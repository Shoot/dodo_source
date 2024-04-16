package defpackage;
/* compiled from: OnboardingModule_ProvideAnalyticsFactory.java */
/* renamed from: n97  reason: default package */
/* loaded from: classes3.dex */
public final class n97 implements no3<gc> {
    private final as8<wc> a;
    private final as8<hq3> b;

    public n97(as8<wc> as8Var, as8<hq3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static n97 a(as8<wc> as8Var, as8<hq3> as8Var2) {
        return new n97(as8Var, as8Var2);
    }

    public static gc c(wc wcVar, hq3 hq3Var) {
        return (gc) jh8.e(m97.a.a(wcVar, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gc get() {
        return c(this.a.get(), this.b.get());
    }
}
