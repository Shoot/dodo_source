package com.dodopizza.checkout.model;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TokenizeRequestDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006)"}, d2 = {"Lcom/dodopizza/checkout/model/TokenizeRequestDto;", "", MessageAttributes.TYPE, "", "number", "expiryMonth", "", "expiryYear", "cvv", Action.NAME_ATTRIBUTE, "billingAddress", "Lcom/dodopizza/checkout/model/BillingAddress;", "phone", "Lcom/dodopizza/checkout/model/Phone;", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/dodopizza/checkout/model/BillingAddress;Lcom/dodopizza/checkout/model/Phone;)V", "getBillingAddress", "()Lcom/dodopizza/checkout/model/BillingAddress;", "getCvv", "()Ljava/lang/String;", "getExpiryMonth", "()I", "getExpiryYear", "getName", "getNumber", "getPhone", "()Lcom/dodopizza/checkout/model/Phone;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "checkout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TokenizeRequestDto {
    @uca("billing_address")
    private final BillingAddress billingAddress;
    private final String cvv;
    @uca("expiry_month")
    private final int expiryMonth;
    @uca("expiry_year")
    private final int expiryYear;
    private final String name;
    private final String number;
    private final Phone phone;
    private final String type;

    public TokenizeRequestDto(String str, String str2, int i, int i2, String str3, String str4, BillingAddress billingAddress, Phone phone) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(str2, "number");
        z65.h(str3, "cvv");
        z65.h(str4, Action.NAME_ATTRIBUTE);
        this.type = str;
        this.number = str2;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.cvv = str3;
        this.name = str4;
        this.billingAddress = billingAddress;
        this.phone = phone;
    }

    public static /* synthetic */ TokenizeRequestDto copy$default(TokenizeRequestDto tokenizeRequestDto, String str, String str2, int i, int i2, String str3, String str4, BillingAddress billingAddress, Phone phone, int i3, Object obj) {
        String str5;
        String str6;
        int i4;
        int i5;
        String str7;
        String str8;
        BillingAddress billingAddress2;
        Phone phone2;
        if ((i3 & 1) != 0) {
            str5 = tokenizeRequestDto.type;
        } else {
            str5 = str;
        }
        if ((i3 & 2) != 0) {
            str6 = tokenizeRequestDto.number;
        } else {
            str6 = str2;
        }
        if ((i3 & 4) != 0) {
            i4 = tokenizeRequestDto.expiryMonth;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            i5 = tokenizeRequestDto.expiryYear;
        } else {
            i5 = i2;
        }
        if ((i3 & 16) != 0) {
            str7 = tokenizeRequestDto.cvv;
        } else {
            str7 = str3;
        }
        if ((i3 & 32) != 0) {
            str8 = tokenizeRequestDto.name;
        } else {
            str8 = str4;
        }
        if ((i3 & 64) != 0) {
            billingAddress2 = tokenizeRequestDto.billingAddress;
        } else {
            billingAddress2 = billingAddress;
        }
        if ((i3 & 128) != 0) {
            phone2 = tokenizeRequestDto.phone;
        } else {
            phone2 = phone;
        }
        return tokenizeRequestDto.copy(str5, str6, i4, i5, str7, str8, billingAddress2, phone2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.number;
    }

    public final int component3() {
        return this.expiryMonth;
    }

    public final int component4() {
        return this.expiryYear;
    }

    public final String component5() {
        return this.cvv;
    }

    public final String component6() {
        return this.name;
    }

    public final BillingAddress component7() {
        return this.billingAddress;
    }

    public final Phone component8() {
        return this.phone;
    }

    public final TokenizeRequestDto copy(String str, String str2, int i, int i2, String str3, String str4, BillingAddress billingAddress, Phone phone) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(str2, "number");
        z65.h(str3, "cvv");
        z65.h(str4, Action.NAME_ATTRIBUTE);
        return new TokenizeRequestDto(str, str2, i, i2, str3, str4, billingAddress, phone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenizeRequestDto)) {
            return false;
        }
        TokenizeRequestDto tokenizeRequestDto = (TokenizeRequestDto) obj;
        if (z65.c(this.type, tokenizeRequestDto.type) && z65.c(this.number, tokenizeRequestDto.number) && this.expiryMonth == tokenizeRequestDto.expiryMonth && this.expiryYear == tokenizeRequestDto.expiryYear && z65.c(this.cvv, tokenizeRequestDto.cvv) && z65.c(this.name, tokenizeRequestDto.name) && z65.c(this.billingAddress, tokenizeRequestDto.billingAddress) && z65.c(this.phone, tokenizeRequestDto.phone)) {
            return true;
        }
        return false;
    }

    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.type.hashCode() * 31) + this.number.hashCode()) * 31) + this.expiryMonth) * 31) + this.expiryYear) * 31) + this.cvv.hashCode()) * 31) + this.name.hashCode()) * 31;
        BillingAddress billingAddress = this.billingAddress;
        int i = 0;
        if (billingAddress == null) {
            hashCode = 0;
        } else {
            hashCode = billingAddress.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Phone phone = this.phone;
        if (phone != null) {
            i = phone.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "TokenizeRequestDto(type=" + this.type + ", number=" + this.number + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", cvv=" + this.cvv + ", name=" + this.name + ", billingAddress=" + this.billingAddress + ", phone=" + this.phone + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ TokenizeRequestDto(String str, String str2, int i, int i2, String str3, String str4, BillingAddress billingAddress, Phone phone, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, str3, str4, (i3 & 64) != 0 ? null : billingAddress, (i3 & 128) != 0 ? null : phone);
    }
}
