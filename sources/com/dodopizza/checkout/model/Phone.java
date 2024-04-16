package com.dodopizza.checkout.model;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: TokenizeRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/checkout/model/Phone;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "number", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Phone {
    @uca("country_code")
    private final String countryCode;
    private final String number;

    public Phone(String str, String str2) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "number");
        this.countryCode = str;
        this.number = str2;
    }

    public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = phone.number;
        }
        return phone.copy(str, str2);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final String component2() {
        return this.number;
    }

    public final Phone copy(String str, String str2) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "number");
        return new Phone(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        if (z65.c(this.countryCode, phone.countryCode) && z65.c(this.number, phone.number)) {
            return true;
        }
        return false;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return (this.countryCode.hashCode() * 31) + this.number.hashCode();
    }

    public String toString() {
        return "Phone(countryCode=" + this.countryCode + ", number=" + this.number + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
