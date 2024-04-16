package defpackage;

import com.dodopizza.persistence.entity.menu.MenuItemEntity;
/* compiled from: RepositoryModule_ProvideMenuItemDaoFactory.java */
/* renamed from: kh9  reason: default package */
/* loaded from: classes3.dex */
public final class kh9 implements no3<gk2<MenuItemEntity>> {
    private final tg9 a;
    private final as8<jk2> b;

    public kh9(tg9 tg9Var, as8<jk2> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static kh9 a(tg9 tg9Var, as8<jk2> as8Var) {
        return new kh9(tg9Var, as8Var);
    }

    public static gk2<MenuItemEntity> c(tg9 tg9Var, jk2 jk2Var) {
        return (gk2) jh8.e(tg9Var.q(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<MenuItemEntity> get() {
        return c(this.a, this.b.get());
    }
}
