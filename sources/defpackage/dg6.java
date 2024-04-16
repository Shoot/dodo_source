package defpackage;

import defpackage.qd6;
/* compiled from: MenuPersonalPriceModule_ProvideMenuItemEnricherFactory.java */
/* renamed from: dg6  reason: default package */
/* loaded from: classes3.dex */
public final class dg6 implements no3<be6<qd6>> {
    private final as8<be6<qd6.e>> a;
    private final as8<be6<qd6.f>> b;

    public dg6(as8<be6<qd6.e>> as8Var, as8<be6<qd6.f>> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static dg6 a(as8<be6<qd6.e>> as8Var, as8<be6<qd6.f>> as8Var2) {
        return new dg6(as8Var, as8Var2);
    }

    public static be6<qd6> c(be6<qd6.e> be6Var, be6<qd6.f> be6Var2) {
        return (be6) jh8.e(bg6.a.b(be6Var, be6Var2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public be6<qd6> get() {
        return c(this.a.get(), this.b.get());
    }
}
