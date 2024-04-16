package ru.dodopizza.backend.domain.payment.dto.sbp;

import kotlin.Metadata;
/* compiled from: SbpBankUnitResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankUnitResponse;", "", "bankName", "", "logoURL", "schema", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getLogoURL", "getPackageName", "getSchema", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SbpBankUnitResponse {
    @uca("bankName")
    private final String bankName;
    @uca("logoURL")
    private final String logoURL;
    @uca("package_name")
    private final String packageName;
    @uca("schema")
    private final String schema;

    public SbpBankUnitResponse(String str, String str2, String str3, String str4) {
        this.bankName = str;
        this.logoURL = str2;
        this.schema = str3;
        this.packageName = str4;
    }

    public static /* synthetic */ SbpBankUnitResponse copy$default(SbpBankUnitResponse sbpBankUnitResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sbpBankUnitResponse.bankName;
        }
        if ((i & 2) != 0) {
            str2 = sbpBankUnitResponse.logoURL;
        }
        if ((i & 4) != 0) {
            str3 = sbpBankUnitResponse.schema;
        }
        if ((i & 8) != 0) {
            str4 = sbpBankUnitResponse.packageName;
        }
        return sbpBankUnitResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.bankName;
    }

    public final String component2() {
        return this.logoURL;
    }

    public final String component3() {
        return this.schema;
    }

    public final String component4() {
        return this.packageName;
    }

    public final SbpBankUnitResponse copy(String str, String str2, String str3, String str4) {
        return new SbpBankUnitResponse(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbpBankUnitResponse)) {
            return false;
        }
        SbpBankUnitResponse sbpBankUnitResponse = (SbpBankUnitResponse) obj;
        if (z65.c(this.bankName, sbpBankUnitResponse.bankName) && z65.c(this.logoURL, sbpBankUnitResponse.logoURL) && z65.c(this.schema, sbpBankUnitResponse.schema) && z65.c(this.packageName, sbpBankUnitResponse.packageName)) {
            return true;
        }
        return false;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getLogoURL() {
        return this.logoURL;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSchema() {
        return this.schema;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.bankName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.logoURL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.schema;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.packageName;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.bankName;
        String str2 = this.logoURL;
        String str3 = this.schema;
        String str4 = this.packageName;
        return "SbpBankUnitResponse(bankName=" + str + ", logoURL=" + str2 + ", schema=" + str3 + ", packageName=" + str4 + ")";
    }
}
