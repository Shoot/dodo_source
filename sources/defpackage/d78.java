package defpackage;
/* compiled from: PizzaConceptModule_ProvidePizzaConceptServiceFactory.java */
/* renamed from: d78  reason: default package */
/* loaded from: classes3.dex */
public final class d78 implements no3<e78> {
    private final as8<hq3> a;

    public d78(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static d78 a(as8<hq3> as8Var) {
        return new d78(as8Var);
    }

    public static e78 c(hq3 hq3Var) {
        return (e78) jh8.e(c78.a.a(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e78 get() {
        return c(this.a.get());
    }
}
