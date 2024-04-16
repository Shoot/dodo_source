package defpackage;

import defpackage.qd6;
/* compiled from: MenuPersonalPriceModule_ProvideVariableMenuItemCopyMakerFactory.java */
/* renamed from: kg6  reason: default package */
/* loaded from: classes3.dex */
public final class kg6 implements no3<xd6<qd6.f>> {
    private final as8<hq3> a;
    private final as8<zf6> b;

    public kg6(as8<hq3> as8Var, as8<zf6> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static kg6 a(as8<hq3> as8Var, as8<zf6> as8Var2) {
        return new kg6(as8Var, as8Var2);
    }

    public static xd6<qd6.f> c(hq3 hq3Var, zf6 zf6Var) {
        return (xd6) jh8.e(bg6.a.i(hq3Var, zf6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xd6<qd6.f> get() {
        return c(this.a.get(), this.b.get());
    }
}
