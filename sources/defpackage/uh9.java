package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
/* compiled from: RepositoryModule_ProvideShoppingInfoDaoFactory.java */
/* renamed from: uh9  reason: default package */
/* loaded from: classes3.dex */
public final class uh9 implements no3<gk2<ShoppingInfoEntity>> {
    private final tg9 a;
    private final as8<jk2> b;

    public uh9(tg9 tg9Var, as8<jk2> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static uh9 a(tg9 tg9Var, as8<jk2> as8Var) {
        return new uh9(tg9Var, as8Var);
    }

    public static gk2<ShoppingInfoEntity> c(tg9 tg9Var, jk2 jk2Var) {
        return (gk2) jh8.e(tg9Var.A(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<ShoppingInfoEntity> get() {
        return c(this.a, this.b.get());
    }
}
