package defpackage;

import com.dodopizza.order.domain.halves.ProductTagsApi;
/* compiled from: ProductTagsService_Factory.java */
/* renamed from: rm8  reason: default package */
/* loaded from: classes2.dex */
public final class rm8 implements no3<qm8> {
    private final as8<ProductTagsApi> a;
    private final as8<ava> b;

    public rm8(as8<ProductTagsApi> as8Var, as8<ava> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static rm8 a(as8<ProductTagsApi> as8Var, as8<ava> as8Var2) {
        return new rm8(as8Var, as8Var2);
    }

    public static qm8 c(ProductTagsApi productTagsApi, ava avaVar) {
        return new qm8(productTagsApi, avaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qm8 get() {
        return c(this.a.get(), this.b.get());
    }
}
