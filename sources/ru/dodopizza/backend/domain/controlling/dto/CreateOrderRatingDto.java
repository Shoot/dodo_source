package ru.dodopizza.backend.domain.controlling.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: CreateOrderRatingDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Jd\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006)"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/CreateOrderRatingDto;", "", "orderId", "", "rate", "", "binaryRatePositive", "", "comment", "tagIds", "", "imageFileIds", "contactType", "Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;)V", "getBinaryRatePositive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getComment", "()Ljava/lang/String;", "getContactType", "()Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;", "getImageFileIds", "()Ljava/util/List;", "getOrderId", "getRate", "()I", "getTagIds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;)Lru/dodopizza/backend/domain/controlling/dto/CreateOrderRatingDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateOrderRatingDto {
    @uca("binaryRatePositive")
    private final Boolean binaryRatePositive;
    @uca("comment")
    private final String comment;
    @uca("contactType")
    private final ContactTypeDto contactType;
    @uca("imageFileIds")
    private final List<String> imageFileIds;
    @uca("orderUUId")
    private final String orderId;
    @uca("rate")
    private final int rate;
    @uca("tagIds")
    private final List<String> tagIds;

    public CreateOrderRatingDto(String str, int i, Boolean bool, String str2, List<String> list, List<String> list2, ContactTypeDto contactTypeDto) {
        z65.h(str, "orderId");
        z65.h(str2, "comment");
        z65.h(list, "tagIds");
        z65.h(list2, "imageFileIds");
        this.orderId = str;
        this.rate = i;
        this.binaryRatePositive = bool;
        this.comment = str2;
        this.tagIds = list;
        this.imageFileIds = list2;
        this.contactType = contactTypeDto;
    }

    public static /* synthetic */ CreateOrderRatingDto copy$default(CreateOrderRatingDto createOrderRatingDto, String str, int i, Boolean bool, String str2, List list, List list2, ContactTypeDto contactTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createOrderRatingDto.orderId;
        }
        if ((i2 & 2) != 0) {
            i = createOrderRatingDto.rate;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bool = createOrderRatingDto.binaryRatePositive;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            str2 = createOrderRatingDto.comment;
        }
        String str3 = str2;
        List<String> list3 = list;
        if ((i2 & 16) != 0) {
            list3 = createOrderRatingDto.tagIds;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i2 & 32) != 0) {
            list5 = createOrderRatingDto.imageFileIds;
        }
        List list6 = list5;
        if ((i2 & 64) != 0) {
            contactTypeDto = createOrderRatingDto.contactType;
        }
        return createOrderRatingDto.copy(str, i3, bool2, str3, list4, list6, contactTypeDto);
    }

    public final String component1() {
        return this.orderId;
    }

    public final int component2() {
        return this.rate;
    }

    public final Boolean component3() {
        return this.binaryRatePositive;
    }

    public final String component4() {
        return this.comment;
    }

    public final List<String> component5() {
        return this.tagIds;
    }

    public final List<String> component6() {
        return this.imageFileIds;
    }

    public final ContactTypeDto component7() {
        return this.contactType;
    }

    public final CreateOrderRatingDto copy(String str, int i, Boolean bool, String str2, List<String> list, List<String> list2, ContactTypeDto contactTypeDto) {
        z65.h(str, "orderId");
        z65.h(str2, "comment");
        z65.h(list, "tagIds");
        z65.h(list2, "imageFileIds");
        return new CreateOrderRatingDto(str, i, bool, str2, list, list2, contactTypeDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderRatingDto)) {
            return false;
        }
        CreateOrderRatingDto createOrderRatingDto = (CreateOrderRatingDto) obj;
        if (z65.c(this.orderId, createOrderRatingDto.orderId) && this.rate == createOrderRatingDto.rate && z65.c(this.binaryRatePositive, createOrderRatingDto.binaryRatePositive) && z65.c(this.comment, createOrderRatingDto.comment) && z65.c(this.tagIds, createOrderRatingDto.tagIds) && z65.c(this.imageFileIds, createOrderRatingDto.imageFileIds) && this.contactType == createOrderRatingDto.contactType) {
            return true;
        }
        return false;
    }

    public final Boolean getBinaryRatePositive() {
        return this.binaryRatePositive;
    }

    public final String getComment() {
        return this.comment;
    }

    public final ContactTypeDto getContactType() {
        return this.contactType;
    }

    public final List<String> getImageFileIds() {
        return this.imageFileIds;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getRate() {
        return this.rate;
    }

    public final List<String> getTagIds() {
        return this.tagIds;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.orderId.hashCode() * 31) + this.rate) * 31;
        Boolean bool = this.binaryRatePositive;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.comment.hashCode()) * 31) + this.tagIds.hashCode()) * 31) + this.imageFileIds.hashCode()) * 31;
        ContactTypeDto contactTypeDto = this.contactType;
        if (contactTypeDto != null) {
            i = contactTypeDto.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.orderId;
        int i = this.rate;
        Boolean bool = this.binaryRatePositive;
        String str2 = this.comment;
        List<String> list = this.tagIds;
        List<String> list2 = this.imageFileIds;
        ContactTypeDto contactTypeDto = this.contactType;
        return "CreateOrderRatingDto(orderId=" + str + ", rate=" + i + ", binaryRatePositive=" + bool + ", comment=" + str2 + ", tagIds=" + list + ", imageFileIds=" + list2 + ", contactType=" + contactTypeDto + ")";
    }
}
