package com.dodopizza.checkout.model;

import ch.qos.logback.core.CoreConstants;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: TokenizeRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/checkout/model/BillingAddress;", "", "addressLine1", "", "addressLine2", tmb.a.CITY_JSON_NAME, "state", "zip", tmb.c.COUNTRY_JSON_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine1", "()Ljava/lang/String;", "getAddressLine2", "getCity", "getCountry", "getState", "getZip", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillingAddress {
    @uca("address_line1")
    private final String addressLine1;
    @uca("address_line2")
    private final String addressLine2;
    private final String city;
    private final String country;
    private final String state;
    private final String zip;

    public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        z65.h(str, "addressLine1");
        z65.h(str2, "addressLine2");
        z65.h(str3, tmb.a.CITY_JSON_NAME);
        z65.h(str4, "state");
        z65.h(str5, "zip");
        z65.h(str6, tmb.c.COUNTRY_JSON_NAME);
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.country = str6;
    }

    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingAddress.addressLine1;
        }
        if ((i & 2) != 0) {
            str2 = billingAddress.addressLine2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = billingAddress.city;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = billingAddress.state;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = billingAddress.zip;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = billingAddress.country;
        }
        return billingAddress.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.addressLine1;
    }

    public final String component2() {
        return this.addressLine2;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.zip;
    }

    public final String component6() {
        return this.country;
    }

    public final BillingAddress copy(String str, String str2, String str3, String str4, String str5, String str6) {
        z65.h(str, "addressLine1");
        z65.h(str2, "addressLine2");
        z65.h(str3, tmb.a.CITY_JSON_NAME);
        z65.h(str4, "state");
        z65.h(str5, "zip");
        z65.h(str6, tmb.c.COUNTRY_JSON_NAME);
        return new BillingAddress(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        if (z65.c(this.addressLine1, billingAddress.addressLine1) && z65.c(this.addressLine2, billingAddress.addressLine2) && z65.c(this.city, billingAddress.city) && z65.c(this.state, billingAddress.state) && z65.c(this.zip, billingAddress.zip) && z65.c(this.country, billingAddress.country)) {
            return true;
        }
        return false;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return (((((((((this.addressLine1.hashCode() * 31) + this.addressLine2.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.country.hashCode();
    }

    public String toString() {
        return "BillingAddress(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", country=" + this.country + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
