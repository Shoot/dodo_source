package defpackage;

import ru.dodopizza.backend.domain.menu.MenuAPI;
/* compiled from: FoodMenuModule_ProvideFavoriteProductServiceFactory.java */
/* renamed from: g44  reason: default package */
/* loaded from: classes3.dex */
public final class g44 implements no3<lp3> {
    private final as8<MenuAPI> a;
    private final as8<jp3> b;
    private final as8<n52> c;

    public g44(as8<MenuAPI> as8Var, as8<jp3> as8Var2, as8<n52> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static g44 a(as8<MenuAPI> as8Var, as8<jp3> as8Var2, as8<n52> as8Var3) {
        return new g44(as8Var, as8Var2, as8Var3);
    }

    public static lp3 c(MenuAPI menuAPI, jp3 jp3Var, n52 n52Var) {
        return (lp3) jh8.e(f44.a.a(menuAPI, jp3Var, n52Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lp3 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
