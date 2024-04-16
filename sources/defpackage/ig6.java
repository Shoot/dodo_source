package defpackage;

import defpackage.qd6;
/* compiled from: MenuPersonalPriceModule_ProvideSimpleMenuItemCopyMakerFactory.java */
/* renamed from: ig6  reason: default package */
/* loaded from: classes3.dex */
public final class ig6 implements no3<xd6<qd6.e>> {
    private final as8<zf6> a;

    public ig6(as8<zf6> as8Var) {
        this.a = as8Var;
    }

    public static ig6 a(as8<zf6> as8Var) {
        return new ig6(as8Var);
    }

    public static xd6<qd6.e> c(zf6 zf6Var) {
        return (xd6) jh8.e(bg6.a.g(zf6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xd6<qd6.e> get() {
        return c(this.a.get());
    }
}
