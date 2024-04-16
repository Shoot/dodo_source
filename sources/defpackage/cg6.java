package defpackage;

import defpackage.qd6;
/* compiled from: MenuPersonalPriceModule_ProvideMenuItemCopyMakerFactory.java */
/* renamed from: cg6  reason: default package */
/* loaded from: classes3.dex */
public final class cg6 implements no3<xd6<qd6>> {
    private final as8<xd6<qd6.e>> a;
    private final as8<xd6<qd6.f>> b;

    public cg6(as8<xd6<qd6.e>> as8Var, as8<xd6<qd6.f>> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static cg6 a(as8<xd6<qd6.e>> as8Var, as8<xd6<qd6.f>> as8Var2) {
        return new cg6(as8Var, as8Var2);
    }

    public static xd6<qd6> c(xd6<qd6.e> xd6Var, xd6<qd6.f> xd6Var2) {
        return (xd6) jh8.e(bg6.a.a(xd6Var, xd6Var2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xd6<qd6> get() {
        return c(this.a.get(), this.b.get());
    }
}
