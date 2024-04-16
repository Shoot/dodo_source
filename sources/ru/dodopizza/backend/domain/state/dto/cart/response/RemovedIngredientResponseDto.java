package ru.dodopizza.backend.domain.state.dto.cart.response;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RemovedIngredientResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/RemovedIngredientResponseDto;", "", "id", "", Action.NAME_ATTRIBUTE, "oldId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getOldId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemovedIngredientResponseDto {
    @uca("id")
    private final String id;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("oldId")
    private final String oldId;

    public RemovedIngredientResponseDto(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.name = str2;
        this.oldId = str3;
    }

    public static /* synthetic */ RemovedIngredientResponseDto copy$default(RemovedIngredientResponseDto removedIngredientResponseDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removedIngredientResponseDto.id;
        }
        if ((i & 2) != 0) {
            str2 = removedIngredientResponseDto.name;
        }
        if ((i & 4) != 0) {
            str3 = removedIngredientResponseDto.oldId;
        }
        return removedIngredientResponseDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.oldId;
    }

    public final RemovedIngredientResponseDto copy(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new RemovedIngredientResponseDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemovedIngredientResponseDto)) {
            return false;
        }
        RemovedIngredientResponseDto removedIngredientResponseDto = (RemovedIngredientResponseDto) obj;
        if (z65.c(this.id, removedIngredientResponseDto.id) && z65.c(this.name, removedIngredientResponseDto.name) && z65.c(this.oldId, removedIngredientResponseDto.oldId)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOldId() {
        return this.oldId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.oldId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.oldId;
        return "RemovedIngredientResponseDto(id=" + str + ", name=" + str2 + ", oldId=" + str3 + ")";
    }

    public /* synthetic */ RemovedIngredientResponseDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
