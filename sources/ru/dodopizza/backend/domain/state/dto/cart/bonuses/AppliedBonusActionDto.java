package ru.dodopizza.backend.domain.state.dto.cart.bonuses;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppliedBonusActionDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedBonusActionDto;", "", "id", "", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppliedBonusActionDto {
    @uca("description")
    private final String description;
    @uca("id")
    private final String id;
    @uca("title")
    private final String title;

    public AppliedBonusActionDto() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AppliedBonusActionDto copy$default(AppliedBonusActionDto appliedBonusActionDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appliedBonusActionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = appliedBonusActionDto.title;
        }
        if ((i & 4) != 0) {
            str3 = appliedBonusActionDto.description;
        }
        return appliedBonusActionDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final AppliedBonusActionDto copy(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        return new AppliedBonusActionDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedBonusActionDto)) {
            return false;
        }
        AppliedBonusActionDto appliedBonusActionDto = (AppliedBonusActionDto) obj;
        if (z65.c(this.id, appliedBonusActionDto.id) && z65.c(this.title, appliedBonusActionDto.title) && z65.c(this.description, appliedBonusActionDto.description)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        return "AppliedBonusActionDto(id=" + str + ", title=" + str2 + ", description=" + str3 + ")";
    }

    public AppliedBonusActionDto(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        this.id = str;
        this.title = str2;
        this.description = str3;
    }

    public /* synthetic */ AppliedBonusActionDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
