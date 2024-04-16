package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
/* compiled from: RepositoryModule_ProvideShoppingItemRepositoryFactory.java */
/* renamed from: vh9  reason: default package */
/* loaded from: classes3.dex */
public final class vh9 implements no3<uja> {
    private final tg9 a;
    private final as8<gk2<ShoppingInfoEntity>> b;
    private final as8<yl8> c;
    private final as8<ne6> d;
    private final as8<mxa> e;
    private final as8<zf6> f;

    public vh9(tg9 tg9Var, as8<gk2<ShoppingInfoEntity>> as8Var, as8<yl8> as8Var2, as8<ne6> as8Var3, as8<mxa> as8Var4, as8<zf6> as8Var5) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
    }

    public static vh9 a(tg9 tg9Var, as8<gk2<ShoppingInfoEntity>> as8Var, as8<yl8> as8Var2, as8<ne6> as8Var3, as8<mxa> as8Var4, as8<zf6> as8Var5) {
        return new vh9(tg9Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static uja c(tg9 tg9Var, gk2<ShoppingInfoEntity> gk2Var, yl8 yl8Var, ne6 ne6Var, mxa mxaVar, zf6 zf6Var) {
        return (uja) jh8.e(tg9Var.B(gk2Var, yl8Var, ne6Var, mxaVar, zf6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public uja get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
