package ru.dodopizza.backend.domain.loyalty.dto.mission;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: LoyaltyMissionDto.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u000bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00062"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionDto;", "Ljava/io/Serializable;", "id", "", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "title", "description", "rewardAmount", "", MessageAttributes.TYPE, "", "status", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;", "answerMaxLimit", "answerMinLength", "endDateTimeUtc", "(Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Ljava/lang/String;Ljava/lang/String;JILru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;IILjava/lang/String;)V", "getAnswerMaxLimit", "()I", "getAnswerMinLength", "getDescription", "()Ljava/lang/String;", "getEndDateTimeUtc", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getRewardAmount", "()J", "getStatus", "()Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;", "getTitle", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMissionDto implements Serializable {
    @uca("answerLimit")
    private final int answerMaxLimit;
    @uca("answerMinLength")
    private final int answerMinLength;
    @uca("description")
    private final String description;
    @uca("endDateTimeUtc")
    private final String endDateTimeUtc;
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca("rewardAmount")
    private final long rewardAmount;
    @uca("missionStatus")
    private final LoyaltyMissionStatusDto status;
    @uca("title")
    private final String title;
    @uca("missionType")
    private final int type;

    public LoyaltyMissionDto() {
        this(null, null, null, null, 0L, 0, null, 0, 0, null, 1023, null);
    }

    public static /* synthetic */ LoyaltyMissionDto copy$default(LoyaltyMissionDto loyaltyMissionDto, String str, ProductImageDto productImageDto, String str2, String str3, long j, int i, LoyaltyMissionStatusDto loyaltyMissionStatusDto, int i2, int i3, String str4, int i4, Object obj) {
        String str5;
        ProductImageDto productImageDto2;
        String str6;
        String str7;
        long j2;
        int i5;
        LoyaltyMissionStatusDto loyaltyMissionStatusDto2;
        int i6;
        int i7;
        String str8;
        if ((i4 & 1) != 0) {
            str5 = loyaltyMissionDto.id;
        } else {
            str5 = str;
        }
        if ((i4 & 2) != 0) {
            productImageDto2 = loyaltyMissionDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i4 & 4) != 0) {
            str6 = loyaltyMissionDto.title;
        } else {
            str6 = str2;
        }
        if ((i4 & 8) != 0) {
            str7 = loyaltyMissionDto.description;
        } else {
            str7 = str3;
        }
        if ((i4 & 16) != 0) {
            j2 = loyaltyMissionDto.rewardAmount;
        } else {
            j2 = j;
        }
        if ((i4 & 32) != 0) {
            i5 = loyaltyMissionDto.type;
        } else {
            i5 = i;
        }
        if ((i4 & 64) != 0) {
            loyaltyMissionStatusDto2 = loyaltyMissionDto.status;
        } else {
            loyaltyMissionStatusDto2 = loyaltyMissionStatusDto;
        }
        if ((i4 & 128) != 0) {
            i6 = loyaltyMissionDto.answerMaxLimit;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            i7 = loyaltyMissionDto.answerMinLength;
        } else {
            i7 = i3;
        }
        if ((i4 & 512) != 0) {
            str8 = loyaltyMissionDto.endDateTimeUtc;
        } else {
            str8 = str4;
        }
        return loyaltyMissionDto.copy(str5, productImageDto2, str6, str7, j2, i5, loyaltyMissionStatusDto2, i6, i7, str8);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.endDateTimeUtc;
    }

    public final ProductImageDto component2() {
        return this.image;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final long component5() {
        return this.rewardAmount;
    }

    public final int component6() {
        return this.type;
    }

    public final LoyaltyMissionStatusDto component7() {
        return this.status;
    }

    public final int component8() {
        return this.answerMaxLimit;
    }

    public final int component9() {
        return this.answerMinLength;
    }

    public final LoyaltyMissionDto copy(String str, ProductImageDto productImageDto, String str2, String str3, long j, int i, LoyaltyMissionStatusDto loyaltyMissionStatusDto, int i2, int i3, String str4) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(loyaltyMissionStatusDto, "status");
        return new LoyaltyMissionDto(str, productImageDto, str2, str3, j, i, loyaltyMissionStatusDto, i2, i3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMissionDto)) {
            return false;
        }
        LoyaltyMissionDto loyaltyMissionDto = (LoyaltyMissionDto) obj;
        if (z65.c(this.id, loyaltyMissionDto.id) && z65.c(this.image, loyaltyMissionDto.image) && z65.c(this.title, loyaltyMissionDto.title) && z65.c(this.description, loyaltyMissionDto.description) && this.rewardAmount == loyaltyMissionDto.rewardAmount && this.type == loyaltyMissionDto.type && z65.c(this.status, loyaltyMissionDto.status) && this.answerMaxLimit == loyaltyMissionDto.answerMaxLimit && this.answerMinLength == loyaltyMissionDto.answerMinLength && z65.c(this.endDateTimeUtc, loyaltyMissionDto.endDateTimeUtc)) {
            return true;
        }
        return false;
    }

    public final int getAnswerMaxLimit() {
        return this.answerMaxLimit;
    }

    public final int getAnswerMinLength() {
        return this.answerMinLength;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEndDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductImageDto getImage() {
        return this.image;
    }

    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    public final LoyaltyMissionStatusDto getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        ProductImageDto productImageDto = this.image;
        int i = 0;
        if (productImageDto == null) {
            hashCode = 0;
        } else {
            hashCode = productImageDto.hashCode();
        }
        int hashCode3 = (((((((((((((((hashCode2 + hashCode) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + ax1.a(this.rewardAmount)) * 31) + this.type) * 31) + this.status.hashCode()) * 31) + this.answerMaxLimit) * 31) + this.answerMinLength) * 31;
        String str = this.endDateTimeUtc;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.id;
        ProductImageDto productImageDto = this.image;
        String str2 = this.title;
        String str3 = this.description;
        long j = this.rewardAmount;
        int i = this.type;
        LoyaltyMissionStatusDto loyaltyMissionStatusDto = this.status;
        int i2 = this.answerMaxLimit;
        int i3 = this.answerMinLength;
        String str4 = this.endDateTimeUtc;
        return "LoyaltyMissionDto(id=" + str + ", image=" + productImageDto + ", title=" + str2 + ", description=" + str3 + ", rewardAmount=" + j + ", type=" + i + ", status=" + loyaltyMissionStatusDto + ", answerMaxLimit=" + i2 + ", answerMinLength=" + i3 + ", endDateTimeUtc=" + str4 + ")";
    }

    public LoyaltyMissionDto(String str, ProductImageDto productImageDto, String str2, String str3, long j, int i, LoyaltyMissionStatusDto loyaltyMissionStatusDto, int i2, int i3, String str4) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(loyaltyMissionStatusDto, "status");
        this.id = str;
        this.image = productImageDto;
        this.title = str2;
        this.description = str3;
        this.rewardAmount = j;
        this.type = i;
        this.status = loyaltyMissionStatusDto;
        this.answerMaxLimit = i2;
        this.answerMinLength = i3;
        this.endDateTimeUtc = str4;
    }

    public /* synthetic */ LoyaltyMissionDto(String str, ProductImageDto productImageDto, String str2, String str3, long j, int i, LoyaltyMissionStatusDto loyaltyMissionStatusDto, int i2, int i3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : productImageDto, (i4 & 4) != 0 ? "" : str2, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? new LoyaltyMissionStatusDto(0, null, null, null, null, 31, null) : loyaltyMissionStatusDto, (i4 & 128) != 0 ? 500 : i2, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) == 0 ? str4 : null);
    }
}
