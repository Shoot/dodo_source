package ru.dodopizza.backend.domain.controlling.dto;

import kotlin.Metadata;
/* compiled from: RatingTagDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/RatingTagDto;", "", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingTagDto {
    @uca("uuId")
    private final String id;
    @uca("title")
    private final String title;

    public RatingTagDto(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, "title");
        this.id = str;
        this.title = str2;
    }

    public static /* synthetic */ RatingTagDto copy$default(RatingTagDto ratingTagDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ratingTagDto.id;
        }
        if ((i & 2) != 0) {
            str2 = ratingTagDto.title;
        }
        return ratingTagDto.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final RatingTagDto copy(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, "title");
        return new RatingTagDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingTagDto)) {
            return false;
        }
        RatingTagDto ratingTagDto = (RatingTagDto) obj;
        if (z65.c(this.id, ratingTagDto.id) && z65.c(this.title, ratingTagDto.title)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return "RatingTagDto(id=" + str + ", title=" + str2 + ")";
    }
}
