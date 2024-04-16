package ru.dodopizza.backend.domain.customer.dto;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: PersonalPromoActionDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J²\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\bHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\r\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006?"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/PersonalPromoActionDto;", "", "id", "", "offerImageUrl", "offerName", "offerConditions", "offerApplyingType", "", "offerType", "beginDateUtc", "endDateUtc", "promocode", "isCollaboration", "", "collaborationForwardLink", "orderTypes", "", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "secretAction", "Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/dodopizza/backend/domain/common/ImageUrls;Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;)V", "getBeginDateUtc", "()Ljava/lang/String;", "getCollaborationForwardLink", "getEndDateUtc", "getId", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOfferApplyingType", "()I", "getOfferConditions", "getOfferImageUrl", "getOfferName", "getOfferType", "getOrderTypes", "()Ljava/util/List;", "getPromocode", "getSecretAction", "()Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/dodopizza/backend/domain/common/ImageUrls;Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;)Lru/dodopizza/backend/domain/customer/dto/PersonalPromoActionDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalPromoActionDto {
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
    @uca("description")
    private final String offerConditions;
    @uca("imageUrl")
    private final String offerImageUrl;
    @uca(Action.NAME_ATTRIBUTE)
    private final String offerName;
    @uca("resultType")
    private final int offerType;
    @uca("orderTypes")
    private final List<Integer> orderTypes;
    @uca("promocode")
    private final String promocode;
    @uca("secretAction")
    private final SecretActionDto secretAction;

    public PersonalPromoActionDto() {
        this(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, 16383, null);
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

    public final List<Integer> component12() {
        return this.orderTypes;
    }

    public final ImageUrls component13() {
        return this.imageUrls;
    }

    public final SecretActionDto component14() {
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

    public final PersonalPromoActionDto copy(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, List<Integer> list, ImageUrls imageUrls, SecretActionDto secretActionDto) {
        z65.h(str, "id");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        return new PersonalPromoActionDto(str, str2, str3, str4, i, i2, str5, str6, str7, bool, str8, list, imageUrls, secretActionDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalPromoActionDto)) {
            return false;
        }
        PersonalPromoActionDto personalPromoActionDto = (PersonalPromoActionDto) obj;
        if (z65.c(this.id, personalPromoActionDto.id) && z65.c(this.offerImageUrl, personalPromoActionDto.offerImageUrl) && z65.c(this.offerName, personalPromoActionDto.offerName) && z65.c(this.offerConditions, personalPromoActionDto.offerConditions) && this.offerApplyingType == personalPromoActionDto.offerApplyingType && this.offerType == personalPromoActionDto.offerType && z65.c(this.beginDateUtc, personalPromoActionDto.beginDateUtc) && z65.c(this.endDateUtc, personalPromoActionDto.endDateUtc) && z65.c(this.promocode, personalPromoActionDto.promocode) && z65.c(this.isCollaboration, personalPromoActionDto.isCollaboration) && z65.c(this.collaborationForwardLink, personalPromoActionDto.collaborationForwardLink) && z65.c(this.orderTypes, personalPromoActionDto.orderTypes) && z65.c(this.imageUrls, personalPromoActionDto.imageUrls) && z65.c(this.secretAction, personalPromoActionDto.secretAction)) {
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

    public final List<Integer> getOrderTypes() {
        return this.orderTypes;
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
        int hashCode8;
        int hashCode9 = this.id.hashCode() * 31;
        String str = this.offerImageUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode10 = (((((((((hashCode9 + hashCode) * 31) + this.offerName.hashCode()) * 31) + this.offerConditions.hashCode()) * 31) + this.offerApplyingType) * 31) + this.offerType) * 31;
        String str2 = this.beginDateUtc;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode10 + hashCode2) * 31;
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
        List<Integer> list = this.orderTypes;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        ImageUrls imageUrls = this.imageUrls;
        if (imageUrls == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = imageUrls.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        SecretActionDto secretActionDto = this.secretAction;
        if (secretActionDto != null) {
            i = secretActionDto.hashCode();
        }
        return i8 + i;
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
        List<Integer> list = this.orderTypes;
        ImageUrls imageUrls = this.imageUrls;
        SecretActionDto secretActionDto = this.secretAction;
        return "PersonalPromoActionDto(id=" + str + ", offerImageUrl=" + str2 + ", offerName=" + str3 + ", offerConditions=" + str4 + ", offerApplyingType=" + i + ", offerType=" + i2 + ", beginDateUtc=" + str5 + ", endDateUtc=" + str6 + ", promocode=" + str7 + ", isCollaboration=" + bool + ", collaborationForwardLink=" + str8 + ", orderTypes=" + list + ", imageUrls=" + imageUrls + ", secretAction=" + secretActionDto + ")";
    }

    public PersonalPromoActionDto(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, List<Integer> list, ImageUrls imageUrls, SecretActionDto secretActionDto) {
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
        this.orderTypes = list;
        this.imageUrls = imageUrls;
        this.secretAction = secretActionDto;
    }

    public /* synthetic */ PersonalPromoActionDto(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, Boolean bool, String str8, List list, ImageUrls imageUrls, SecretActionDto secretActionDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) == 0 ? str4 : "", (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? Boolean.FALSE : bool, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : list, (i3 & 4096) != 0 ? null : imageUrls, (i3 & 8192) == 0 ? secretActionDto : null);
    }
}
