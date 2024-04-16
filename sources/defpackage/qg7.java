package defpackage;

import ru.dodopizza.backend.domain.order.OrderApi;
/* compiled from: OrderModule_ProvideCreateOrderWithApiLogicFactory.java */
/* renamed from: qg7  reason: default package */
/* loaded from: classes3.dex */
public final class qg7 implements no3<i22> {
    private final as8<OrderApi> a;
    private final as8<g22> b;

    public qg7(as8<OrderApi> as8Var, as8<g22> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static qg7 a(as8<OrderApi> as8Var, as8<g22> as8Var2) {
        return new qg7(as8Var, as8Var2);
    }

    public static i22 c(OrderApi orderApi, g22 g22Var) {
        return (i22) jh8.e(ng7.a.c(orderApi, g22Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i22 get() {
        return c(this.a.get(), this.b.get());
    }
}
