package ru.dodopizza.backend.domain.customer.dto;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: PersonalOfferDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J \u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\r\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/PersonalOfferDto;", "", "id", "", "offerImageUrl", "offerName", "offerConditions", "offerApplyingType", "", "offerType", "beginDateUtc", "endDateUtc", "promocode", "isCollaboration", "", "collaborationForwardLink", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "secretAction", "Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;)V", "getBeginDateUtc", "()Ljava/lang/String;", "getCollaborationForwardLink", "getEndDateUtc", "getId", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOfferApplyingType", "()I", "getOfferConditions", "getOfferImageUrl", "getOfferName", "getOfferType", "getPromocode", "getSecretAction", "()Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;)Lru/dodopizza/backend/domain/customer/dto/PersonalOfferDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalOfferDto {
    @uca("beginDate")
    private final String beginDateUtc;
    @uca("collaborationForwardLink")
    private final String collaborationForwardLink;
    @uca("endDate")
    private final String endDateUtc;
    @uca("id")
    private final String id;
    @uca("imageUrls")
    private final ImageUrls imageUrls;
    @uca("isCollaboration")
    private final Boolean isCollaboration;
    @uca(MessageAttributes.TYPE)
    private final int offerApplyingType;
    @uca("descriptionForClient")
    private final String offerConditions;
    @uca("imageUrl")
    private final String offerImageUrl;
    @uca("nameForClient")
    private final String offerName;
    @uca("resultType")
    private final int offerType;
    @uca("promocode")
    private final String promocode;
    @uca("secretAction")
    private final SecretActionDto secretAction;

    public PersonalOfferDto() {
        this(null, null, null, null, 0, 0, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ PersonalOfferDto copy$default(PersonalOfferDto personalOfferDto, String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, ImageUrls imageUrls, SecretActionDto secretActionDto, int i3, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        int i4;
        int i5;
        String str13;
        String str14;
        String str15;
        Boolean bool2;
        String str16;
        ImageUrls imageUrls2;
        SecretActionDto secretActionDto2;
        if ((i3 & 1) != 0) {
            str9 = personalOfferDto.id;
        } else {
            str9 = str;
        }
        if ((i3 & 2) != 0) {
            str10 = personalOfferDto.offerImageUrl;
        } else {
            str10 = str2;
        }
        if ((i3 & 4) != 0) {
            str11 = personalOfferDto.offerName;
        } else {
            str11 = str3;
        }
        if ((i3 & 8) != 0) {
            str12 = personalOfferDto.offerConditions;
        } else {
            str12 = str4;
        }
        if ((i3 & 16) != 0) {
            i4 = personalOfferDto.offerApplyingType;
        } else {
            i4 = i;
        }
        if ((i3 & 32) != 0) {
            i5 = personalOfferDto.offerType;
        } else {
            i5 = i2;
        }
        if ((i3 & 64) != 0) {
            str13 = personalOfferDto.beginDateUtc;
        } else {
            str13 = str5;
        }
        if ((i3 & 128) != 0) {
            str14 = personalOfferDto.endDateUtc;
        } else {
            str14 = str6;
        }
        if ((i3 & 256) != 0) {
            str15 = personalOfferDto.promocode;
        } else {
            str15 = str7;
        }
        if ((i3 & 512) != 0) {
            bool2 = personalOfferDto.isCollaboration;
        } else {
            bool2 = bool;
        }
        if ((i3 & 1024) != 0) {
            str16 = personalOfferDto.collaborationForwardLink;
        } else {
            str16 = str8;
        }
        if ((i3 & 2048) != 0) {
            imageUrls2 = personalOfferDto.imageUrls;
        } else {
            imageUrls2 = imageUrls;
        }
        if ((i3 & 4096) != 0) {
            secretActionDto2 = personalOfferDto.secretAction;
        } else {
            secretActionDto2 = secretActionDto;
        }
        return personalOfferDto.copy(str9, str10, str11, str12, i4, i5, str13, str14, str15, bool2, str16, imageUrls2, secretActionDto2);
    }

    public final String component1() {
        return this.id;
    }

    public final Boolean component10() {
        return this.isCollaboration;
    }

    public final String component11() {
        return this.collaborationForwardLink;
    }

    public final ImageUrls component12() {
        return this.imageUrls;
    }

    public final SecretActionDto component13() {
        return this.secretAction;
    }

    public final String component2() {
        return this.offerImageUrl;
    }

    public final String component3() {
        return this.offerName;
    }

    public final String component4() {
        return this.offerConditions;
    }

    public final int component5() {
        return this.offerApplyingType;
    }

    public final int component6() {
        return this.offerType;
    }

    public final String component7() {
        return this.beginDateUtc;
    }

    public final String component8() {
        return this.endDateUtc;
    }

    public final String component9() {
        return this.promocode;
    }

    public final PersonalOfferDto copy(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, ImageUrls imageUrls, SecretActionDto secretActionDto) {
        z65.h(str, "id");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        return new PersonalOfferDto(str, str2, str3, str4, i, i2, str5, str6, str7, bool, str8, imageUrls, secretActionDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalOfferDto)) {
            return false;
        }
        PersonalOfferDto personalOfferDto = (PersonalOfferDto) obj;
        if (z65.c(this.id, personalOfferDto.id) && z65.c(this.offerImageUrl, personalOfferDto.offerImageUrl) && z65.c(this.offerName, personalOfferDto.offerName) && z65.c(this.offerConditions, personalOfferDto.offerConditions) && this.offerApplyingType == personalOfferDto.offerApplyingType && this.offerType == personalOfferDto.offerType && z65.c(this.beginDateUtc, personalOfferDto.beginDateUtc) && z65.c(this.endDateUtc, personalOfferDto.endDateUtc) && z65.c(this.promocode, personalOfferDto.promocode) && z65.c(this.isCollaboration, personalOfferDto.isCollaboration) && z65.c(this.collaborationForwardLink, personalOfferDto.collaborationForwardLink) && z65.c(this.imageUrls, personalOfferDto.imageUrls) && z65.c(this.secretAction, personalOfferDto.secretAction)) {
            return true;
        }
        return false;
    }

    public final String getBeginDateUtc() {
        return this.beginDateUtc;
    }

    public final String getCollaborationForwardLink() {
        return this.collaborationForwardLink;
    }

    public final String getEndDateUtc() {
        return this.endDateUtc;
    }

    public final String getId() {
        return this.id;
    }

    public final ImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public final int getOfferApplyingType() {
        return this.offerApplyingType;
    }

    public final String getOfferConditions() {
        return this.offerConditions;
    }

    public final String getOfferImageUrl() {
        return this.offerImageUrl;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final int getOfferType() {
        return this.offerType;
    }

    public final String getPromocode() {
        return this.promocode;
    }

    public final SecretActionDto getSecretAction() {
        return this.secretAction;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.id.hashCode() * 31;
        String str = this.offerImageUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode9 = (((((((((hashCode8 + hashCode) * 31) + this.offerName.hashCode()) * 31) + this.offerConditions.hashCode()) * 31) + this.offerApplyingType) * 31) + this.offerType) * 31;
        String str2 = this.beginDateUtc;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode9 + hashCode2) * 31;
        String str3 = this.endDateUtc;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.promocode;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Boolean bool = this.isCollaboration;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str5 = this.collaborationForwardLink;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        ImageUrls imageUrls = this.imageUrls;
        if (imageUrls == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = imageUrls.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        SecretActionDto secretActionDto = this.secretAction;
        if (secretActionDto != null) {
            i = secretActionDto.hashCode();
        }
        return i7 + i;
    }

    public final Boolean isCollaboration() {
        return this.isCollaboration;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.offerImageUrl;
        String str3 = this.offerName;
        String str4 = this.offerConditions;
        int i = this.offerApplyingType;
        int i2 = this.offerType;
        String str5 = this.beginDateUtc;
        String str6 = this.endDateUtc;
        String str7 = this.promocode;
        Boolean bool = this.isCollaboration;
        String str8 = this.collaborationForwardLink;
        ImageUrls imageUrls = this.imageUrls;
        SecretActionDto secretActionDto = this.secretAction;
        return "PersonalOfferDto(id=" + str + ", offerImageUrl=" + str2 + ", offerName=" + str3 + ", offerConditions=" + str4 + ", offerApplyingType=" + i + ", offerType=" + i2 + ", beginDateUtc=" + str5 + ", endDateUtc=" + str6 + ", promocode=" + str7 + ", isCollaboration=" + bool + ", collaborationForwardLink=" + str8 + ", imageUrls=" + imageUrls + ", secretAction=" + secretActionDto + ")";
    }

    public PersonalOfferDto(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, ImageUrls imageUrls, SecretActionDto secretActionDto) {
        z65.h(str, "id");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        this.id = str;
        this.offerImageUrl = str2;
        this.offerName = str3;
        this.offerConditions = str4;
        this.offerApplyingType = i;
        this.offerType = i2;
        this.beginDateUtc = str5;
        this.endDateUtc = str6;
        this.promocode = str7;
        this.isCollaboration = bool;
        this.collaborationForwardLink = str8;
        this.imageUrls = imageUrls;
        this.secretAction = secretActionDto;
    }

    public /* synthetic */ PersonalOfferDto(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, ImageUrls imageUrls, SecretActionDto secretActionDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) == 0 ? str4 : "", (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? Boolean.FALSE : bool, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : imageUrls, (i3 & 4096) == 0 ? secretActionDto : null);
    }
}
