package ru.dodopizza.backend.domain.bonus.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: BonusActionDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006,"}, d2 = {"Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "", "id", "", "imageUrl", "title", "description", "actionType", "", "actionValue", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getActionType", "()I", "setActionType", "(I)V", "getActionValue", "()Ljava/lang/String;", "setActionValue", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getId", "setId", "getImageUrl", "setImageUrl", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BonusActionDto {
    @uca("customerActionType")
    private int actionType;
    @uca("customerActionValue")
    private String actionValue;
    @uca("description")
    private String description;
    @uca("id")
    private String id;
    @uca("imageUrl")
    private String imageUrl;
    @uca("imageUrls")
    private final ImageUrls imageUrls;
    @uca("title")
    private String title;

    public BonusActionDto() {
        this(null, null, null, null, 0, null, null, 127, null);
    }

    public static /* synthetic */ BonusActionDto copy$default(BonusActionDto bonusActionDto, String str, String str2, String str3, String str4, int i, String str5, ImageUrls imageUrls, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bonusActionDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = bonusActionDto.imageUrl;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = bonusActionDto.title;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = bonusActionDto.description;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            i = bonusActionDto.actionType;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = bonusActionDto.actionValue;
        }
        String str9 = str5;
        if ((i2 & 64) != 0) {
            imageUrls = bonusActionDto.imageUrls;
        }
        return bonusActionDto.copy(str, str6, str7, str8, i3, str9, imageUrls);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.actionType;
    }

    public final String component6() {
        return this.actionValue;
    }

    public final ImageUrls component7() {
        return this.imageUrls;
    }

    public final BonusActionDto copy(String str, String str2, String str3, String str4, int i, String str5, ImageUrls imageUrls) {
        z65.h(str5, "actionValue");
        return new BonusActionDto(str, str2, str3, str4, i, str5, imageUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusActionDto)) {
            return false;
        }
        BonusActionDto bonusActionDto = (BonusActionDto) obj;
        if (z65.c(this.id, bonusActionDto.id) && z65.c(this.imageUrl, bonusActionDto.imageUrl) && z65.c(this.title, bonusActionDto.title) && z65.c(this.description, bonusActionDto.description) && this.actionType == bonusActionDto.actionType && z65.c(this.actionValue, bonusActionDto.actionValue) && z65.c(this.imageUrls, bonusActionDto.imageUrls)) {
            return true;
        }
        return false;
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getActionValue() {
        return this.actionValue;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.imageUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.description;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int hashCode5 = (((((i4 + hashCode4) * 31) + this.actionType) * 31) + this.actionValue.hashCode()) * 31;
        ImageUrls imageUrls = this.imageUrls;
        if (imageUrls != null) {
            i = imageUrls.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setActionType(int i) {
        this.actionType = i;
    }

    public final void setActionValue(String str) {
        z65.h(str, "<set-?>");
        this.actionValue = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.description;
        int i = this.actionType;
        String str5 = this.actionValue;
        ImageUrls imageUrls = this.imageUrls;
        return "BonusActionDto(id=" + str + ", imageUrl=" + str2 + ", title=" + str3 + ", description=" + str4 + ", actionType=" + i + ", actionValue=" + str5 + ", imageUrls=" + imageUrls + ")";
    }

    public BonusActionDto(String str, String str2, String str3, String str4, int i, String str5, ImageUrls imageUrls) {
        z65.h(str5, "actionValue");
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.description = str4;
        this.actionType = i;
        this.actionValue = str5;
        this.imageUrls = imageUrls;
    }

    public /* synthetic */ BonusActionDto(String str, String str2, String str3, String str4, int i, String str5, ImageUrls imageUrls, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? null : imageUrls);
    }
}
