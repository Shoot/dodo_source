package ru.dodopizza.backend.domain.state.dto.cart.response;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddedIngredientResponseDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/AddedIngredientResponseDto;", "", "id", "", "count", "", Action.NAME_ATTRIBUTE, "price", "", "errorCode", "(Ljava/lang/String;ILjava/lang/String;DI)V", "getCount", "()I", "getErrorCode", "getId", "()Ljava/lang/String;", "getName", "getPrice", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddedIngredientResponseDto {
    @uca("count")
    private final int count;
    @uca("errorCode")
    private final int errorCode;
    @uca("id")
    private final String id;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("price")
    private final double price;

    public AddedIngredientResponseDto() {
        this(null, 0, null, 0.0d, 0, 31, null);
    }

    public static /* synthetic */ AddedIngredientResponseDto copy$default(AddedIngredientResponseDto addedIngredientResponseDto, String str, int i, String str2, double d, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = addedIngredientResponseDto.id;
        }
        if ((i3 & 2) != 0) {
            i = addedIngredientResponseDto.count;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = addedIngredientResponseDto.name;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            d = addedIngredientResponseDto.price;
        }
        double d2 = d;
        if ((i3 & 16) != 0) {
            i2 = addedIngredientResponseDto.errorCode;
        }
        return addedIngredientResponseDto.copy(str, i4, str3, d2, i2);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.count;
    }

    public final String component3() {
        return this.name;
    }

    public final double component4() {
        return this.price;
    }

    public final int component5() {
        return this.errorCode;
    }

    public final AddedIngredientResponseDto copy(String str, int i, String str2, double d, int i2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new AddedIngredientResponseDto(str, i, str2, d, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedIngredientResponseDto)) {
            return false;
        }
        AddedIngredientResponseDto addedIngredientResponseDto = (AddedIngredientResponseDto) obj;
        if (z65.c(this.id, addedIngredientResponseDto.id) && this.count == addedIngredientResponseDto.count && z65.c(this.name, addedIngredientResponseDto.name) && Double.compare(this.price, addedIngredientResponseDto.price) == 0 && this.errorCode == addedIngredientResponseDto.errorCode) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.count) * 31) + this.name.hashCode()) * 31) + nkb.a(this.price)) * 31) + this.errorCode;
    }

    public String toString() {
        String str = this.id;
        int i = this.count;
        String str2 = this.name;
        double d = this.price;
        int i2 = this.errorCode;
        return "AddedIngredientResponseDto(id=" + str + ", count=" + i + ", name=" + str2 + ", price=" + d + ", errorCode=" + i2 + ")";
    }

    public AddedIngredientResponseDto(String str, int i, String str2, double d, int i2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.count = i;
        this.name = str2;
        this.price = d;
        this.errorCode = i2;
    }

    public /* synthetic */ AddedIngredientResponseDto(String str, int i, String str2, double d, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0.0d : d, (i3 & 16) != 0 ? 0 : i2);
    }
}
