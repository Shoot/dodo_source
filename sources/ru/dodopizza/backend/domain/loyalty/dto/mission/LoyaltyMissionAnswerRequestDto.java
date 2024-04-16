package ru.dodopizza.backend.domain.loyalty.dto.mission;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LoyaltyMissionAnswerRequestDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionAnswerRequestDto;", "Ljava/io/Serializable;", "missionId", "", "userAnswer", "(Ljava/lang/String;Ljava/lang/String;)V", "getMissionId", "()Ljava/lang/String;", "getUserAnswer", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMissionAnswerRequestDto implements Serializable {
    @uca("id")
    private final String missionId;
    @uca("answer")
    private final String userAnswer;

    public LoyaltyMissionAnswerRequestDto(String str, String str2) {
        z65.h(str, "missionId");
        z65.h(str2, "userAnswer");
        this.missionId = str;
        this.userAnswer = str2;
    }

    public static /* synthetic */ LoyaltyMissionAnswerRequestDto copy$default(LoyaltyMissionAnswerRequestDto loyaltyMissionAnswerRequestDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMissionAnswerRequestDto.missionId;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyMissionAnswerRequestDto.userAnswer;
        }
        return loyaltyMissionAnswerRequestDto.copy(str, str2);
    }

    public final String component1() {
        return this.missionId;
    }

    public final String component2() {
        return this.userAnswer;
    }

    public final LoyaltyMissionAnswerRequestDto copy(String str, String str2) {
        z65.h(str, "missionId");
        z65.h(str2, "userAnswer");
        return new LoyaltyMissionAnswerRequestDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMissionAnswerRequestDto)) {
            return false;
        }
        LoyaltyMissionAnswerRequestDto loyaltyMissionAnswerRequestDto = (LoyaltyMissionAnswerRequestDto) obj;
        if (z65.c(this.missionId, loyaltyMissionAnswerRequestDto.missionId) && z65.c(this.userAnswer, loyaltyMissionAnswerRequestDto.userAnswer)) {
            return true;
        }
        return false;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final String getUserAnswer() {
        return this.userAnswer;
    }

    public int hashCode() {
        return (this.missionId.hashCode() * 31) + this.userAnswer.hashCode();
    }

    public String toString() {
        String str = this.missionId;
        String str2 = this.userAnswer;
        return "LoyaltyMissionAnswerRequestDto(missionId=" + str + ", userAnswer=" + str2 + ")";
    }
}
