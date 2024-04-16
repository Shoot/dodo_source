package defpackage;

import com.dodopizza.persistence.entity.menu.ProductEntity;
/* compiled from: RepositoryModule_ProvideProductRepositoryFactory.java */
/* renamed from: rh9  reason: default package */
/* loaded from: classes3.dex */
public final class rh9 implements no3<yl8> {
    private final tg9 a;
    private final as8<gk2<ProductEntity>> b;

    public rh9(tg9 tg9Var, as8<gk2<ProductEntity>> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static rh9 a(tg9 tg9Var, as8<gk2<ProductEntity>> as8Var) {
        return new rh9(tg9Var, as8Var);
    }

    public static yl8 c(tg9 tg9Var, gk2<ProductEntity> gk2Var) {
        return (yl8) jh8.e(tg9Var.x(gk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yl8 get() {
        return c(this.a, this.b.get());
    }
}
