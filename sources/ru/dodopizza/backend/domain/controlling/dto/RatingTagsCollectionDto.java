package ru.dodopizza.backend.domain.controlling.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: RatingTagsCollectionDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/RatingTagsCollectionDto;", "", "deliveryOrCarryout", "", "Lru/dodopizza/backend/domain/controlling/dto/RatingTagsWithRatingValueDto;", "restaurant", "(Ljava/util/List;Ljava/util/List;)V", "getDeliveryOrCarryout", "()Ljava/util/List;", "getRestaurant", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingTagsCollectionDto {
    @uca("deliveryOrCarryout")
    private final List<RatingTagsWithRatingValueDto> deliveryOrCarryout;
    @uca("restaurant")
    private final List<RatingTagsWithRatingValueDto> restaurant;

    public RatingTagsCollectionDto(List<RatingTagsWithRatingValueDto> list, List<RatingTagsWithRatingValueDto> list2) {
        z65.h(list, "deliveryOrCarryout");
        z65.h(list2, "restaurant");
        this.deliveryOrCarryout = list;
        this.restaurant = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingTagsCollectionDto copy$default(RatingTagsCollectionDto ratingTagsCollectionDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ratingTagsCollectionDto.deliveryOrCarryout;
        }
        if ((i & 2) != 0) {
            list2 = ratingTagsCollectionDto.restaurant;
        }
        return ratingTagsCollectionDto.copy(list, list2);
    }

    public final List<RatingTagsWithRatingValueDto> component1() {
        return this.deliveryOrCarryout;
    }

    public final List<RatingTagsWithRatingValueDto> component2() {
        return this.restaurant;
    }

    public final RatingTagsCollectionDto copy(List<RatingTagsWithRatingValueDto> list, List<RatingTagsWithRatingValueDto> list2) {
        z65.h(list, "deliveryOrCarryout");
        z65.h(list2, "restaurant");
        return new RatingTagsCollectionDto(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingTagsCollectionDto)) {
            return false;
        }
        RatingTagsCollectionDto ratingTagsCollectionDto = (RatingTagsCollectionDto) obj;
        if (z65.c(this.deliveryOrCarryout, ratingTagsCollectionDto.deliveryOrCarryout) && z65.c(this.restaurant, ratingTagsCollectionDto.restaurant)) {
            return true;
        }
        return false;
    }

    public final List<RatingTagsWithRatingValueDto> getDeliveryOrCarryout() {
        return this.deliveryOrCarryout;
    }

    public final List<RatingTagsWithRatingValueDto> getRestaurant() {
        return this.restaurant;
    }

    public int hashCode() {
        return (this.deliveryOrCarryout.hashCode() * 31) + this.restaurant.hashCode();
    }

    public String toString() {
        List<RatingTagsWithRatingValueDto> list = this.deliveryOrCarryout;
        List<RatingTagsWithRatingValueDto> list2 = this.restaurant;
        return "RatingTagsCollectionDto(deliveryOrCarryout=" + list + ", restaurant=" + list2 + ")";
    }
}
