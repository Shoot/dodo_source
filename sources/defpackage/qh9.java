package defpackage;

import com.dodopizza.persistence.entity.menu.ProductEntity;
/* compiled from: RepositoryModule_ProvideProductDaoFactory.java */
/* renamed from: qh9  reason: default package */
/* loaded from: classes3.dex */
public final class qh9 implements no3<gk2<ProductEntity>> {
    private final tg9 a;
    private final as8<jk2> b;

    public qh9(tg9 tg9Var, as8<jk2> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static qh9 a(tg9 tg9Var, as8<jk2> as8Var) {
        return new qh9(tg9Var, as8Var);
    }

    public static gk2<ProductEntity> c(tg9 tg9Var, jk2 jk2Var) {
        return (gk2) jh8.e(tg9Var.w(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<ProductEntity> get() {
        return c(this.a, this.b.get());
    }
}
