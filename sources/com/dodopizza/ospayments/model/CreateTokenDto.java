package com.dodopizza.ospayments.model;

import kotlin.Metadata;
/* compiled from: CreateTokenDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/ospayments/model/CreateTokenDto;", "", "holderName", "", "cardNumber", "expirationDate", "cvv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCvv", "getExpirationDate", "getHolderName", "token_type", "getToken_type", "ospayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateTokenDto {
    @uca("card_number")
    private final String cardNumber;
    @uca("credit_card_cvv")
    private final String cvv;
    @uca("expiration_date")
    private final String expirationDate;
    @uca("holder_name")
    private final String holderName;
    @uca("token_type")
    private final String token_type;

    public CreateTokenDto(String str, String str2, String str3, String str4) {
        z65.h(str, "holderName");
        z65.h(str2, "cardNumber");
        z65.h(str3, "expirationDate");
        z65.h(str4, "cvv");
        this.holderName = str;
        this.cardNumber = str2;
        this.expirationDate = str3;
        this.cvv = str4;
        this.token_type = "credit_card";
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getHolderName() {
        return this.holderName;
    }

    public final String getToken_type() {
        return this.token_type;
    }
}
