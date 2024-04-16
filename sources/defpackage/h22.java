package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.order.dto.CreateOrderRequestDto;
import ru.dodopizza.backend.domain.order.dto.OrderDetailsDto;
import ru.dodopizza.backend.domain.order.dto.OrderPersonalization;
/* compiled from: CreateOrderRequestConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lh22;", "Lg22;", "Ls51;", "checkoutRequest", "Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "orderPersonalization", "Lru/dodopizza/backend/domain/order/dto/CreateOrderRequestDto;", "a", "Ljgb;", "Ljgb;", "timeFormatter", "Lw13;", "b", "Lw13;", "deviceInfoForOrderCreator", "<init>", "(Ljgb;Lw13;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h22  reason: default package */
/* loaded from: classes4.dex */
public final class h22 implements g22 {
    private final jgb a;
    private final w13 b;

    public h22(jgb jgbVar, w13 w13Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(w13Var, "deviceInfoForOrderCreator");
        this.a = jgbVar;
        this.b = w13Var;
    }

    @Override // defpackage.g22
    public CreateOrderRequestDto a(s51 s51Var, OrderPersonalization orderPersonalization) {
        z65.h(s51Var, "checkoutRequest");
        z65.h(orderPersonalization, "orderPersonalization");
        return new CreateOrderRequestDto(s51Var.d(), new OrderDetailsDto(kg7.b(s51Var.b(), this.a), kg7.c(s51Var.c()), s51Var.a(), kg7.a(this.b.a())), orderPersonalization);
    }
}
