package ru.dodopizza.backend.domain.menu.dto;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: FavoriteProductDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/FavoriteProductDto;", "", "menuItemId", "", "position", "", KustoStorage.KustoTable.COLUMN_SOURCE, "(Ljava/lang/String;II)V", "getMenuItemId", "()Ljava/lang/String;", "getPosition", "()I", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FavoriteProductDto {
    @uca("menuItemId")
    private final String menuItemId;
    @uca("position")
    private final int position;
    @uca("sourceType")
    private final int source;

    public FavoriteProductDto(String str, int i, int i2) {
        z65.h(str, "menuItemId");
        this.menuItemId = str;
        this.position = i;
        this.source = i2;
    }

    public static /* synthetic */ FavoriteProductDto copy$default(FavoriteProductDto favoriteProductDto, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = favoriteProductDto.menuItemId;
        }
        if ((i3 & 2) != 0) {
            i = favoriteProductDto.position;
        }
        if ((i3 & 4) != 0) {
            i2 = favoriteProductDto.source;
        }
        return favoriteProductDto.copy(str, i, i2);
    }

    public final String component1() {
        return this.menuItemId;
    }

    public final int component2() {
        return this.position;
    }

    public final int component3() {
        return this.source;
    }

    public final FavoriteProductDto copy(String str, int i, int i2) {
        z65.h(str, "menuItemId");
        return new FavoriteProductDto(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteProductDto)) {
            return false;
        }
        FavoriteProductDto favoriteProductDto = (FavoriteProductDto) obj;
        if (z65.c(this.menuItemId, favoriteProductDto.menuItemId) && this.position == favoriteProductDto.position && this.source == favoriteProductDto.source) {
            return true;
        }
        return false;
    }

    public final String getMenuItemId() {
        return this.menuItemId;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((this.menuItemId.hashCode() * 31) + this.position) * 31) + this.source;
    }

    public String toString() {
        String str = this.menuItemId;
        int i = this.position;
        int i2 = this.source;
        return "FavoriteProductDto(menuItemId=" + str + ", position=" + i + ", source=" + i2 + ")";
    }
}
