package ru.dodopizza.backend.domain.inapp;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: InAppNotificationDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jz\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00062"}, d2 = {"Lru/dodopizza/backend/domain/inapp/InAppNotificationDto;", "", "id", "", MessageAttributes.TYPE, "", "typeDescription", "title", "description", "clickUrl", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "animatedImage", "Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;", "value", "theme", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;Ljava/lang/String;Ljava/lang/Integer;)V", "getAnimatedImage", "()Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;", "getClickUrl", "()Ljava/lang/String;", "getDescription", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getTheme", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getType", "()I", "getTypeDescription", "getValue", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;Ljava/lang/String;Ljava/lang/Integer;)Lru/dodopizza/backend/domain/inapp/InAppNotificationDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppNotificationDto {
    @uca("animatedImage")
    private final AnimatedImageDto animatedImage;
    @uca("clickUrl")
    private final String clickUrl;
    @uca("description")
    private final String description;
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca("theme")
    private final Integer theme;
    @uca("title")
    private final String title;
    @uca(MessageAttributes.TYPE)
    private final int type;
    @uca("typeDescription")
    private final String typeDescription;
    @uca("value")
    private final String value;

    public InAppNotificationDto(String str, int i, String str2, String str3, String str4, String str5, ProductImageDto productImageDto, AnimatedImageDto animatedImageDto, String str6, Integer num) {
        z65.h(str, "id");
        z65.h(str3, "title");
        z65.h(str5, "clickUrl");
        z65.h(productImageDto, ElementGenerator.TYPE_IMAGE);
        z65.h(str6, "value");
        this.id = str;
        this.type = i;
        this.typeDescription = str2;
        this.title = str3;
        this.description = str4;
        this.clickUrl = str5;
        this.image = productImageDto;
        this.animatedImage = animatedImageDto;
        this.value = str6;
        this.theme = num;
    }

    public static /* synthetic */ InAppNotificationDto copy$default(InAppNotificationDto inAppNotificationDto, String str, int i, String str2, String str3, String str4, String str5, ProductImageDto productImageDto, AnimatedImageDto animatedImageDto, String str6, Integer num, int i2, Object obj) {
        String str7;
        int i3;
        String str8;
        String str9;
        String str10;
        String str11;
        ProductImageDto productImageDto2;
        AnimatedImageDto animatedImageDto2;
        String str12;
        Integer num2;
        if ((i2 & 1) != 0) {
            str7 = inAppNotificationDto.id;
        } else {
            str7 = str;
        }
        if ((i2 & 2) != 0) {
            i3 = inAppNotificationDto.type;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            str8 = inAppNotificationDto.typeDescription;
        } else {
            str8 = str2;
        }
        if ((i2 & 8) != 0) {
            str9 = inAppNotificationDto.title;
        } else {
            str9 = str3;
        }
        if ((i2 & 16) != 0) {
            str10 = inAppNotificationDto.description;
        } else {
            str10 = str4;
        }
        if ((i2 & 32) != 0) {
            str11 = inAppNotificationDto.clickUrl;
        } else {
            str11 = str5;
        }
        if ((i2 & 64) != 0) {
            productImageDto2 = inAppNotificationDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i2 & 128) != 0) {
            animatedImageDto2 = inAppNotificationDto.animatedImage;
        } else {
            animatedImageDto2 = animatedImageDto;
        }
        if ((i2 & 256) != 0) {
            str12 = inAppNotificationDto.value;
        } else {
            str12 = str6;
        }
        if ((i2 & 512) != 0) {
            num2 = inAppNotificationDto.theme;
        } else {
            num2 = num;
        }
        return inAppNotificationDto.copy(str7, i3, str8, str9, str10, str11, productImageDto2, animatedImageDto2, str12, num2);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.theme;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.typeDescription;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.clickUrl;
    }

    public final ProductImageDto component7() {
        return this.image;
    }

    public final AnimatedImageDto component8() {
        return this.animatedImage;
    }

    public final String component9() {
        return this.value;
    }

    public final InAppNotificationDto copy(String str, int i, String str2, String str3, String str4, String str5, ProductImageDto productImageDto, AnimatedImageDto animatedImageDto, String str6, Integer num) {
        z65.h(str, "id");
        z65.h(str3, "title");
        z65.h(str5, "clickUrl");
        z65.h(productImageDto, ElementGenerator.TYPE_IMAGE);
        z65.h(str6, "value");
        return new InAppNotificationDto(str, i, str2, str3, str4, str5, productImageDto, animatedImageDto, str6, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationDto)) {
            return false;
        }
        InAppNotificationDto inAppNotificationDto = (InAppNotificationDto) obj;
        if (z65.c(this.id, inAppNotificationDto.id) && this.type == inAppNotificationDto.type && z65.c(this.typeDescription, inAppNotificationDto.typeDescription) && z65.c(this.title, inAppNotificationDto.title) && z65.c(this.description, inAppNotificationDto.description) && z65.c(this.clickUrl, inAppNotificationDto.clickUrl) && z65.c(this.image, inAppNotificationDto.image) && z65.c(this.animatedImage, inAppNotificationDto.animatedImage) && z65.c(this.value, inAppNotificationDto.value) && z65.c(this.theme, inAppNotificationDto.theme)) {
            return true;
        }
        return false;
    }

    public final AnimatedImageDto getAnimatedImage() {
        return this.animatedImage;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductImageDto getImage() {
        return this.image;
    }

    public final Integer getTheme() {
        return this.theme;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getTypeDescription() {
        return this.typeDescription;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.id.hashCode() * 31) + this.type) * 31;
        String str = this.typeDescription;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.title.hashCode()) * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((hashCode5 + hashCode2) * 31) + this.clickUrl.hashCode()) * 31) + this.image.hashCode()) * 31;
        AnimatedImageDto animatedImageDto = this.animatedImage;
        if (animatedImageDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = animatedImageDto.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode3) * 31) + this.value.hashCode()) * 31;
        Integer num = this.theme;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.id;
        int i = this.type;
        String str2 = this.typeDescription;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.clickUrl;
        ProductImageDto productImageDto = this.image;
        AnimatedImageDto animatedImageDto = this.animatedImage;
        String str6 = this.value;
        Integer num = this.theme;
        return "InAppNotificationDto(id=" + str + ", type=" + i + ", typeDescription=" + str2 + ", title=" + str3 + ", description=" + str4 + ", clickUrl=" + str5 + ", image=" + productImageDto + ", animatedImage=" + animatedImageDto + ", value=" + str6 + ", theme=" + num + ")";
    }
}
