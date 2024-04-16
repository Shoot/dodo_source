package ru.dodopizza.backend.domain.controlling.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: RatingTagsWithRatingValueDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/RatingTagsWithRatingValueDto;", "", "rating", "", "tags", "", "Lru/dodopizza/backend/domain/controlling/dto/RatingTagDto;", "(ILjava/util/List;)V", "getRating", "()I", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingTagsWithRatingValueDto {
    @uca("rating")
    private final int rating;
    @uca("tags")
    private final List<RatingTagDto> tags;

    public RatingTagsWithRatingValueDto(int i, List<RatingTagDto> list) {
        z65.h(list, "tags");
        this.rating = i;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingTagsWithRatingValueDto copy$default(RatingTagsWithRatingValueDto ratingTagsWithRatingValueDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ratingTagsWithRatingValueDto.rating;
        }
        if ((i2 & 2) != 0) {
            list = ratingTagsWithRatingValueDto.tags;
        }
        return ratingTagsWithRatingValueDto.copy(i, list);
    }

    public final int component1() {
        return this.rating;
    }

    public final List<RatingTagDto> component2() {
        return this.tags;
    }

    public final RatingTagsWithRatingValueDto copy(int i, List<RatingTagDto> list) {
        z65.h(list, "tags");
        return new RatingTagsWithRatingValueDto(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingTagsWithRatingValueDto)) {
            return false;
        }
        RatingTagsWithRatingValueDto ratingTagsWithRatingValueDto = (RatingTagsWithRatingValueDto) obj;
        if (this.rating == ratingTagsWithRatingValueDto.rating && z65.c(this.tags, ratingTagsWithRatingValueDto.tags)) {
            return true;
        }
        return false;
    }

    public final int getRating() {
        return this.rating;
    }

    public final List<RatingTagDto> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (this.rating * 31) + this.tags.hashCode();
    }

    public String toString() {
        int i = this.rating;
        List<RatingTagDto> list = this.tags;
        return "RatingTagsWithRatingValueDto(rating=" + i + ", tags=" + list + ")";
    }
}
