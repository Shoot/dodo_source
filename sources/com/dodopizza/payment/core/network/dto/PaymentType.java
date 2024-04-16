package com.dodopizza.payment.core.network.dto;

import kotlin.Metadata;
/* compiled from: PaymentMethodResponseDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PaymentType;", "", "()V", PaymentType.GooglePay, "", PaymentType.NewCard, PaymentType.Redirect, PaymentType.SavedCard, PaymentType.SberPay, "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentType {
    public static final String GooglePay = "GooglePay";
    public static final PaymentType INSTANCE = new PaymentType();
    public static final String NewCard = "NewCard";
    public static final String Redirect = "Redirect";
    public static final String SavedCard = "SavedCard";
    public static final String SberPay = "SberPay";

    private PaymentType() {
    }
}
