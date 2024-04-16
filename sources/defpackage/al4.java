package defpackage;

import com.dodopizza.order.domain.halves.ProductTagsApi;
import retrofit2.Retrofit;
/* compiled from: HalvesDomainModule_ProvideProductTagsApiFactory.java */
/* renamed from: al4  reason: default package */
/* loaded from: classes2.dex */
public final class al4 implements no3<ProductTagsApi> {
    private final as8<Retrofit> a;

    public al4(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static al4 a(as8<Retrofit> as8Var) {
        return new al4(as8Var);
    }

    public static ProductTagsApi c(Retrofit retrofit) {
        return (ProductTagsApi) jh8.e(zk4.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ProductTagsApi get() {
        return c(this.a.get());
    }
}
