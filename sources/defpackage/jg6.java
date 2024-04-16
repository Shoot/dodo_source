package defpackage;

import defpackage.qd6;
/* compiled from: MenuPersonalPriceModule_ProvideSimpleMenuItemEnricherFactory.java */
/* renamed from: jg6  reason: default package */
/* loaded from: classes3.dex */
public final class jg6 implements no3<be6<qd6.e>> {
    private final as8<zf6> a;

    public jg6(as8<zf6> as8Var) {
        this.a = as8Var;
    }

    public static jg6 a(as8<zf6> as8Var) {
        return new jg6(as8Var);
    }

    public static be6<qd6.e> c(zf6 zf6Var) {
        return (be6) jh8.e(bg6.a.h(zf6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public be6<qd6.e> get() {
        return c(this.a.get());
    }
}
