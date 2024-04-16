package ru.dodopizza.backend.domain.loyalty.dto.mission;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyMissionStatusDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000b¨\u0006 "}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;", "Ljava/io/Serializable;", "statusType", "", "moderatorResponse", "", "currentProgress", "totalProgress", "currentUserAnswer", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCurrentProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentUserAnswer", "()Ljava/lang/String;", "getModeratorResponse", "getStatusType", "()I", "getTotalProgress", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;", "equals", "", "other", "", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMissionStatusDto implements Serializable {
    @uca("currentProgress")
    private final Integer currentProgress;
    @uca("answer")
    private final String currentUserAnswer;
    @uca("response")
    private final String moderatorResponse;
    @uca("status")
    private final int statusType;
    @uca("totalProgress")
    private final Integer totalProgress;

    public LoyaltyMissionStatusDto() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LoyaltyMissionStatusDto copy$default(LoyaltyMissionStatusDto loyaltyMissionStatusDto, int i, String str, Integer num, Integer num2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loyaltyMissionStatusDto.statusType;
        }
        if ((i2 & 2) != 0) {
            str = loyaltyMissionStatusDto.moderatorResponse;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            num = loyaltyMissionStatusDto.currentProgress;
        }
        Integer num3 = num;
        if ((i2 & 8) != 0) {
            num2 = loyaltyMissionStatusDto.totalProgress;
        }
        Integer num4 = num2;
        if ((i2 & 16) != 0) {
            str2 = loyaltyMissionStatusDto.currentUserAnswer;
        }
        return loyaltyMissionStatusDto.copy(i, str3, num3, num4, str2);
    }

    public final int component1() {
        return this.statusType;
    }

    public final String component2() {
        return this.moderatorResponse;
    }

    public final Integer component3() {
        return this.currentProgress;
    }

    public final Integer component4() {
        return this.totalProgress;
    }

    public final String component5() {
        return this.currentUserAnswer;
    }

    public final LoyaltyMissionStatusDto copy(int i, String str, Integer num, Integer num2, String str2) {
        return new LoyaltyMissionStatusDto(i, str, num, num2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMissionStatusDto)) {
            return false;
        }
        LoyaltyMissionStatusDto loyaltyMissionStatusDto = (LoyaltyMissionStatusDto) obj;
        if (this.statusType == loyaltyMissionStatusDto.statusType && z65.c(this.moderatorResponse, loyaltyMissionStatusDto.moderatorResponse) && z65.c(this.currentProgress, loyaltyMissionStatusDto.currentProgress) && z65.c(this.totalProgress, loyaltyMissionStatusDto.totalProgress) && z65.c(this.currentUserAnswer, loyaltyMissionStatusDto.currentUserAnswer)) {
            return true;
        }
        return false;
    }

    public final Integer getCurrentProgress() {
        return this.currentProgress;
    }

    public final String getCurrentUserAnswer() {
        return this.currentUserAnswer;
    }

    public final String getModeratorResponse() {
        return this.moderatorResponse;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final Integer getTotalProgress() {
        return this.totalProgress;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.statusType * 31;
        String str = this.moderatorResponse;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num = this.currentProgress;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Integer num2 = this.totalProgress;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str2 = this.currentUserAnswer;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i5 + i2;
    }

    public String toString() {
        int i = this.statusType;
        String str = this.moderatorResponse;
        Integer num = this.currentProgress;
        Integer num2 = this.totalProgress;
        String str2 = this.currentUserAnswer;
        return "LoyaltyMissionStatusDto(statusType=" + i + ", moderatorResponse=" + str + ", currentProgress=" + num + ", totalProgress=" + num2 + ", currentUserAnswer=" + str2 + ")";
    }

    public LoyaltyMissionStatusDto(int i, String str, Integer num, Integer num2, String str2) {
        this.statusType = i;
        this.moderatorResponse = str;
        this.currentProgress = num;
        this.totalProgress = num2;
        this.currentUserAnswer = str2;
    }

    public /* synthetic */ LoyaltyMissionStatusDto(int i, String str, Integer num, Integer num2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) == 0 ? str2 : null);
    }
}
