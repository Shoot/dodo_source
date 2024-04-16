package com.dodopizza.payment.core.domain.method;

import com.dodopizza.payment.core.domain.method.PaymentMethod;
import com.dodopizza.payment.core.network.dto.PaymentMethodResponseDto;
import com.dodopizza.payment.core.network.dto.PaymentType;
import com.dodopizza.payment.core.network.dto.SavedCardDto;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PaymentMethodService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "response", "Lcom/dodopizza/payment/core/network/dto/PaymentMethodResponseDto;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
final class PaymentMethodService$paymentMethodFactory$1 extends ej5 implements Function1<PaymentMethodResponseDto, PaymentMethod> {
    public static final PaymentMethodService$paymentMethodFactory$1 INSTANCE = new PaymentMethodService$paymentMethodFactory$1();

    PaymentMethodService$paymentMethodFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PaymentMethod invoke(PaymentMethodResponseDto paymentMethodResponseDto) {
        z65.h(paymentMethodResponseDto, "response");
        String paymentType = paymentMethodResponseDto.getPaymentType();
        switch (paymentType.hashCode()) {
            case -2103713257:
                if (paymentType.equals(PaymentType.SavedCard)) {
                    SavedCardDto card = paymentMethodResponseDto.getCard();
                    if (card != null) {
                        return new PaymentMethod.TwoStepPaymentMethod.SavedCardPaymentMethod(paymentMethodResponseDto.getId(), paymentMethodResponseDto.getProviderName(), paymentMethodResponseDto.getProviderCode(), paymentMethodResponseDto.getProviderData(), new bw7(card.component1(), card.component2(), card.component3()), paymentMethodResponseDto.isDefault());
                    }
                    throw new IllegalStateException("payment card for SavedCardPaymentMethod[id = " + paymentMethodResponseDto.getId() + "] not found");
                }
                break;
            case -816503921:
                if (paymentType.equals(PaymentType.GooglePay)) {
                    return new PaymentMethod.TwoStepPaymentMethod.WalletPayPaymentMethod(paymentMethodResponseDto.getId(), paymentMethodResponseDto.getProviderName(), paymentMethodResponseDto.getProviderCode(), paymentMethodResponseDto.getProviderData(), paymentMethodResponseDto.getPaymentType(), paymentMethodResponseDto.isDefault());
                }
                break;
            case -785620816:
                if (paymentType.equals(PaymentType.NewCard)) {
                    return new PaymentMethod.TwoStepPaymentMethod.NewCardPaymentMethod(paymentMethodResponseDto.getId(), paymentMethodResponseDto.getProviderName(), paymentMethodResponseDto.getProviderCode(), paymentMethodResponseDto.getProviderData(), paymentMethodResponseDto.isDefault());
                }
                break;
            case -744197204:
                if (paymentType.equals(PaymentType.SberPay)) {
                    return new PaymentMethod.SberPayPaymentMethod(paymentMethodResponseDto.getId(), paymentMethodResponseDto.getProviderName(), paymentMethodResponseDto.getProviderCode(), paymentMethodResponseDto.getProviderData(), paymentMethodResponseDto.isDefault());
                }
                break;
            case -711500804:
                if (paymentType.equals(PaymentType.Redirect)) {
                    return new PaymentMethod.RedirectPaymentMethod(paymentMethodResponseDto.getId(), paymentMethodResponseDto.getProviderName(), paymentMethodResponseDto.getProviderCode(), paymentMethodResponseDto.getProviderData(), paymentMethodResponseDto.isDefault());
                }
                break;
        }
        return null;
    }
}
