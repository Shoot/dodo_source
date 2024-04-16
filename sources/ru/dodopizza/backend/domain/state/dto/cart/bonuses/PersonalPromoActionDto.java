package ru.dodopizza.backend.domain.state.dto.cart.bonuses;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalPromoActionDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;", "", "description", "", "id", "status", "", "title", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "getId", "getStatus", "()I", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalPromoActionDto {
    @uca("description")
    private final String description;
    @uca("errorMessage")
    private String errorMessage;
    @uca("id")
    private final String id;
    @uca("status")
    private final int status;
    @uca("title")
    private String title;

    public PersonalPromoActionDto() {
        this(null, null, 0, null, null, 31, null);
    }

    public static /* synthetic */ PersonalPromoActionDto copy$default(PersonalPromoActionDto personalPromoActionDto, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = personalPromoActionDto.description;
        }
        if ((i2 & 2) != 0) {
            str2 = personalPromoActionDto.id;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = personalPromoActionDto.status;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = personalPromoActionDto.title;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = personalPromoActionDto.errorMessage;
        }
        return personalPromoActionDto.copy(str, str5, i3, str6, str4);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.id;
    }

    public final int component3() {
        return this.status;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.errorMessage;
    }

    public final PersonalPromoActionDto copy(String str, String str2, int i, String str3, String str4) {
        return new PersonalPromoActionDto(str, str2, i, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalPromoActionDto)) {
            return false;
        }
        PersonalPromoActionDto personalPromoActionDto = (PersonalPromoActionDto) obj;
        if (z65.c(this.description, personalPromoActionDto.description) && z65.c(this.id, personalPromoActionDto.id) && this.status == personalPromoActionDto.status && z65.c(this.title, personalPromoActionDto.title) && z65.c(this.errorMessage, personalPromoActionDto.errorMessage)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getId() {
        return this.id;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.description;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.id;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.status) * 31;
        String str3 = this.title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.errorMessage;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        String str = this.description;
        String str2 = this.id;
        int i = this.status;
        String str3 = this.title;
        String str4 = this.errorMessage;
        return "PersonalPromoActionDto(description=" + str + ", id=" + str2 + ", status=" + i + ", title=" + str3 + ", errorMessage=" + str4 + ")";
    }

    public PersonalPromoActionDto(String str, String str2, int i, String str3, String str4) {
        this.description = str;
        this.id = str2;
        this.status = i;
        this.title = str3;
        this.errorMessage = str4;
    }

    public /* synthetic */ PersonalPromoActionDto(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
    }
}
