package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.order.OrderApi;
/* compiled from: OrderModule_ProvideOrderApiFactory.java */
/* renamed from: sg7  reason: default package */
/* loaded from: classes3.dex */
public final class sg7 implements no3<OrderApi> {
    private final as8<Retrofit> a;

    public sg7(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static sg7 a(as8<Retrofit> as8Var) {
        return new sg7(as8Var);
    }

    public static OrderApi c(Retrofit retrofit) {
        return (OrderApi) jh8.e(ng7.a.e(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderApi get() {
        return c(this.a.get());
    }
}
