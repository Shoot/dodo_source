package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: PaymentInfoDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/PaymentInfoDto;", "", "paymentType", "", "cardId", "", "clientNotes", "", "(ILjava/lang/String;Ljava/lang/Double;)V", "getCardId", "()Ljava/lang/String;", "getClientNotes", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPaymentType", "()I", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentInfoDto {
    @uca("cardId")
    private final String cardId;
    @uca("clientNotes")
    private final Double clientNotes;
    @uca("paymentType")
    private final int paymentType;

    public PaymentInfoDto(int i, String str, Double d) {
        this.paymentType = i;
        this.cardId = str;
        this.clientNotes = d;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final Double getClientNotes() {
        return this.clientNotes;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }
}
