package defpackage;
/* compiled from: MenuPersonalPriceModule_ProvideRealMenuItemWithPersonalPriceCreatorFactory.java */
/* renamed from: hg6  reason: default package */
/* loaded from: classes3.dex */
public final class hg6 implements no3<je6> {
    private final as8<be6<qd6>> a;
    private final as8<xd6<qd6>> b;

    public hg6(as8<be6<qd6>> as8Var, as8<xd6<qd6>> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static hg6 a(as8<be6<qd6>> as8Var, as8<xd6<qd6>> as8Var2) {
        return new hg6(as8Var, as8Var2);
    }

    public static je6 c(be6<qd6> be6Var, xd6<qd6> xd6Var) {
        return (je6) jh8.e(bg6.a.f(be6Var, xd6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public je6 get() {
        return c(this.a.get(), this.b.get());
    }
}
