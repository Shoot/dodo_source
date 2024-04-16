package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.payment.dto.sber.PayBySberPayRequestDto;
/* compiled from: SberPayPaymentService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lbu9;", "", "Los7;", "payment", "", "finishDeepLink", "Lzt9;", "a", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "paymentApi", "Lls7;", "b", "Lls7;", "responseDtoMapper", "<init>", "(Lru/dodopizza/backend/domain/payment/PaymentAPI;Lls7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bu9  reason: default package */
/* loaded from: classes2.dex */
public final class bu9 {
    private final PaymentAPI a;
    private final ls7 b;

    public bu9(PaymentAPI paymentAPI, ls7 ls7Var) {
        z65.h(paymentAPI, "paymentApi");
        z65.h(ls7Var, "responseDtoMapper");
        this.a = paymentAPI;
        this.b = ls7Var;
    }

    public final zt9 a(os7 os7Var, String str) {
        z65.h(os7Var, "payment");
        z65.h(str, "finishDeepLink");
        return this.b.a(this.a.payBySberPay(os7Var.a(), new PayBySberPayRequestDto(os7Var.e(), str)));
    }
}
