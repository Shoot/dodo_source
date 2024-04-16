package defpackage;
/* compiled from: MenuPersonalPriceModule_ProvideMenuPersonalPriceInfoRepositoryFactory.java */
/* renamed from: fg6  reason: default package */
/* loaded from: classes3.dex */
public final class fg6 implements no3<zf6> {
    private final as8<ava> a;
    private final as8<xf6> b;

    public fg6(as8<ava> as8Var, as8<xf6> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static fg6 a(as8<ava> as8Var, as8<xf6> as8Var2) {
        return new fg6(as8Var, as8Var2);
    }

    public static zf6 c(ava avaVar, xf6 xf6Var) {
        return (zf6) jh8.e(bg6.a.d(avaVar, xf6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zf6 get() {
        return c(this.a.get(), this.b.get());
    }
}
