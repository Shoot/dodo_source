package com.dodopizza.ospayments.model;

import kotlin.Metadata;
/* compiled from: PaymentsOsToken.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dodopizza/ospayments/model/PaymentsOsToken;", "", "value", "", "cvv", "(Ljava/lang/String;Ljava/lang/String;)V", "getCvv", "()Ljava/lang/String;", "getValue", "ospayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentsOsToken {
    private final String cvv;
    private final String value;

    public PaymentsOsToken(String str, String str2) {
        z65.h(str, "value");
        z65.h(str2, "cvv");
        this.value = str;
        this.cvv = str2;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getValue() {
        return this.value;
    }
}
