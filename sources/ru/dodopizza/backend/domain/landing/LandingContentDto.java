package ru.dodopizza.backend.domain.landing;

import kotlin.Metadata;
/* compiled from: LandingDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lru/dodopizza/backend/domain/landing/LandingContentDto;", "", "heading", "", "subheading", "promoText", "personalDataAgreementUrl", "termsOfServiceUrl", "actionButtonText", "pizzeriaAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionButtonText", "()Ljava/lang/String;", "getHeading", "getPersonalDataAgreementUrl", "getPizzeriaAddress", "getPromoText", "getSubheading", "getTermsOfServiceUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingContentDto {
    @uca("actionButtonText")
    private final String actionButtonText;
    @uca("heading")
    private final String heading;
    @uca("personalDataAgreementUrl")
    private final String personalDataAgreementUrl;
    @uca("pizzeriaAddress")
    private final String pizzeriaAddress;
    @uca("promoText")
    private final String promoText;
    @uca("subheading")
    private final String subheading;
    @uca("termsOfServiceUrl")
    private final String termsOfServiceUrl;

    public LandingContentDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        z65.h(str, "heading");
        z65.h(str2, "subheading");
        z65.h(str3, "promoText");
        z65.h(str4, "personalDataAgreementUrl");
        z65.h(str5, "termsOfServiceUrl");
        z65.h(str6, "actionButtonText");
        z65.h(str7, "pizzeriaAddress");
        this.heading = str;
        this.subheading = str2;
        this.promoText = str3;
        this.personalDataAgreementUrl = str4;
        this.termsOfServiceUrl = str5;
        this.actionButtonText = str6;
        this.pizzeriaAddress = str7;
    }

    public static /* synthetic */ LandingContentDto copy$default(LandingContentDto landingContentDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingContentDto.heading;
        }
        if ((i & 2) != 0) {
            str2 = landingContentDto.subheading;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = landingContentDto.promoText;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = landingContentDto.personalDataAgreementUrl;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = landingContentDto.termsOfServiceUrl;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = landingContentDto.actionButtonText;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = landingContentDto.pizzeriaAddress;
        }
        return landingContentDto.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.heading;
    }

    public final String component2() {
        return this.subheading;
    }

    public final String component3() {
        return this.promoText;
    }

    public final String component4() {
        return this.personalDataAgreementUrl;
    }

    public final String component5() {
        return this.termsOfServiceUrl;
    }

    public final String component6() {
        return this.actionButtonText;
    }

    public final String component7() {
        return this.pizzeriaAddress;
    }

    public final LandingContentDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        z65.h(str, "heading");
        z65.h(str2, "subheading");
        z65.h(str3, "promoText");
        z65.h(str4, "personalDataAgreementUrl");
        z65.h(str5, "termsOfServiceUrl");
        z65.h(str6, "actionButtonText");
        z65.h(str7, "pizzeriaAddress");
        return new LandingContentDto(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingContentDto)) {
            return false;
        }
        LandingContentDto landingContentDto = (LandingContentDto) obj;
        if (z65.c(this.heading, landingContentDto.heading) && z65.c(this.subheading, landingContentDto.subheading) && z65.c(this.promoText, landingContentDto.promoText) && z65.c(this.personalDataAgreementUrl, landingContentDto.personalDataAgreementUrl) && z65.c(this.termsOfServiceUrl, landingContentDto.termsOfServiceUrl) && z65.c(this.actionButtonText, landingContentDto.actionButtonText) && z65.c(this.pizzeriaAddress, landingContentDto.pizzeriaAddress)) {
            return true;
        }
        return false;
    }

    public final String getActionButtonText() {
        return this.actionButtonText;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getPersonalDataAgreementUrl() {
        return this.personalDataAgreementUrl;
    }

    public final String getPizzeriaAddress() {
        return this.pizzeriaAddress;
    }

    public final String getPromoText() {
        return this.promoText;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public final String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    public int hashCode() {
        return (((((((((((this.heading.hashCode() * 31) + this.subheading.hashCode()) * 31) + this.promoText.hashCode()) * 31) + this.personalDataAgreementUrl.hashCode()) * 31) + this.termsOfServiceUrl.hashCode()) * 31) + this.actionButtonText.hashCode()) * 31) + this.pizzeriaAddress.hashCode();
    }

    public String toString() {
        String str = this.heading;
        String str2 = this.subheading;
        String str3 = this.promoText;
        String str4 = this.personalDataAgreementUrl;
        String str5 = this.termsOfServiceUrl;
        String str6 = this.actionButtonText;
        String str7 = this.pizzeriaAddress;
        return "LandingContentDto(heading=" + str + ", subheading=" + str2 + ", promoText=" + str3 + ", personalDataAgreementUrl=" + str4 + ", termsOfServiceUrl=" + str5 + ", actionButtonText=" + str6 + ", pizzeriaAddress=" + str7 + ")";
    }
}
