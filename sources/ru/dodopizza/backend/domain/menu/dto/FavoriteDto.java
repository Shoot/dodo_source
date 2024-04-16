package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: FavoriteDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/FavoriteDto;", "", "favorites", "", "Lru/dodopizza/backend/domain/menu/dto/FavoriteProductDto;", "maxCountToDisplay", "", "(Ljava/util/List;I)V", "getFavorites", "()Ljava/util/List;", "getMaxCountToDisplay", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FavoriteDto {
    @uca("favorites")
    private final List<FavoriteProductDto> favorites;
    @uca("maxCountToDisplay")
    private final int maxCountToDisplay;

    public FavoriteDto(List<FavoriteProductDto> list, int i) {
        z65.h(list, "favorites");
        this.favorites = list;
        this.maxCountToDisplay = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteDto copy$default(FavoriteDto favoriteDto, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = favoriteDto.favorites;
        }
        if ((i2 & 2) != 0) {
            i = favoriteDto.maxCountToDisplay;
        }
        return favoriteDto.copy(list, i);
    }

    public final List<FavoriteProductDto> component1() {
        return this.favorites;
    }

    public final int component2() {
        return this.maxCountToDisplay;
    }

    public final FavoriteDto copy(List<FavoriteProductDto> list, int i) {
        z65.h(list, "favorites");
        return new FavoriteDto(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteDto)) {
            return false;
        }
        FavoriteDto favoriteDto = (FavoriteDto) obj;
        if (z65.c(this.favorites, favoriteDto.favorites) && this.maxCountToDisplay == favoriteDto.maxCountToDisplay) {
            return true;
        }
        return false;
    }

    public final List<FavoriteProductDto> getFavorites() {
        return this.favorites;
    }

    public final int getMaxCountToDisplay() {
        return this.maxCountToDisplay;
    }

    public int hashCode() {
        return (this.favorites.hashCode() * 31) + this.maxCountToDisplay;
    }

    public String toString() {
        List<FavoriteProductDto> list = this.favorites;
        int i = this.maxCountToDisplay;
        return "FavoriteDto(favorites=" + list + ", maxCountToDisplay=" + i + ")";
    }
}
