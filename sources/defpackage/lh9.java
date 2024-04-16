package defpackage;

import com.dodopizza.persistence.entity.menu.MenuItemEntity;
/* compiled from: RepositoryModule_ProvideMenuItemRepositoryFactory.java */
/* renamed from: lh9  reason: default package */
/* loaded from: classes3.dex */
public final class lh9 implements no3<ne6> {
    private final tg9 a;
    private final as8<gk2<MenuItemEntity>> b;
    private final as8<mxa> c;
    private final as8<me6> d;

    public lh9(tg9 tg9Var, as8<gk2<MenuItemEntity>> as8Var, as8<mxa> as8Var2, as8<me6> as8Var3) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
    }

    public static lh9 a(tg9 tg9Var, as8<gk2<MenuItemEntity>> as8Var, as8<mxa> as8Var2, as8<me6> as8Var3) {
        return new lh9(tg9Var, as8Var, as8Var2, as8Var3);
    }

    public static ne6 c(tg9 tg9Var, gk2<MenuItemEntity> gk2Var, mxa mxaVar, me6 me6Var) {
        return (ne6) jh8.e(tg9Var.r(gk2Var, mxaVar, me6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ne6 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
