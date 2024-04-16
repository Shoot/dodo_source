package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.cart.dto.OrderResponseDto;
import ru.dodopizza.backend.domain.order.OrderApi;
import ru.dodopizza.backend.domain.order.dto.OrderPersonalization;
/* compiled from: CreateOrderWithApiLogic.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lj22;", "Li22;", "Ls51;", "checkoutRequest", "Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "orderPersonalization", "Lru/dodopizza/backend/domain/cart/dto/OrderResponseDto;", "a", "Lru/dodopizza/backend/domain/order/OrderApi;", "Lru/dodopizza/backend/domain/order/OrderApi;", "orderApi", "Lg22;", "b", "Lg22;", "createOrderRequestConverter", "<init>", "(Lru/dodopizza/backend/domain/order/OrderApi;Lg22;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j22  reason: default package */
/* loaded from: classes4.dex */
public final class j22 implements i22 {
    private final OrderApi a;
    private final g22 b;

    public j22(OrderApi orderApi, g22 g22Var) {
        z65.h(orderApi, "orderApi");
        z65.h(g22Var, "createOrderRequestConverter");
        this.a = orderApi;
        this.b = g22Var;
    }

    @Override // defpackage.i22
    public OrderResponseDto a(s51 s51Var, OrderPersonalization orderPersonalization) {
        z65.h(s51Var, "checkoutRequest");
        z65.h(orderPersonalization, "orderPersonalization");
        return this.a.createOrderV5(this.b.a(s51Var, orderPersonalization));
    }
}
