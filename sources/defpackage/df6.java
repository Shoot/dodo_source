package defpackage;
/* compiled from: MenuItemVOConverterModule_ProvideDrinksTwoColumnCheckerFactory.java */
/* renamed from: df6  reason: default package */
/* loaded from: classes3.dex */
public final class df6 implements no3<z83> {
    private final as8<hq3> a;
    private final as8<gy3> b;

    public df6(as8<hq3> as8Var, as8<gy3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static df6 a(as8<hq3> as8Var, as8<gy3> as8Var2) {
        return new df6(as8Var, as8Var2);
    }

    public static z83 c(hq3 hq3Var, gy3 gy3Var) {
        return (z83) jh8.e(cf6.a.a(hq3Var, gy3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public z83 get() {
        return c(this.a.get(), this.b.get());
    }
}
