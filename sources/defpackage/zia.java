package defpackage;
/* compiled from: ShoppingCartModule_ProvideCartButtonPositionFactory.java */
/* renamed from: zia  reason: default package */
/* loaded from: classes2.dex */
public final class zia implements no3<cq0> {
    private final as8<hq3> a;
    private final as8<gy3> b;

    public zia(as8<hq3> as8Var, as8<gy3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static zia a(as8<hq3> as8Var, as8<gy3> as8Var2) {
        return new zia(as8Var, as8Var2);
    }

    public static cq0 c(hq3 hq3Var, gy3 gy3Var) {
        return (cq0) jh8.e(yia.a.a(hq3Var, gy3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cq0 get() {
        return c(this.a.get(), this.b.get());
    }
}
