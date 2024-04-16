package ru.dodopizza.backend.domain.loyalty.dto.ordergame;

import kotlin.Metadata;
/* compiled from: StackGameAnimationsDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/ordergame/StackGameAnimationsDto;", "", "claimRewardAnimation", "Lru/dodopizza/backend/domain/loyalty/dto/ordergame/AnimationDto;", "maxRewardReachedAnimation", "(Lru/dodopizza/backend/domain/loyalty/dto/ordergame/AnimationDto;Lru/dodopizza/backend/domain/loyalty/dto/ordergame/AnimationDto;)V", "getClaimRewardAnimation", "()Lru/dodopizza/backend/domain/loyalty/dto/ordergame/AnimationDto;", "getMaxRewardReachedAnimation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StackGameAnimationsDto {
    @uca("claimReward")
    private final AnimationDto claimRewardAnimation;
    @uca("maxRewardReached")
    private final AnimationDto maxRewardReachedAnimation;

    public StackGameAnimationsDto(AnimationDto animationDto, AnimationDto animationDto2) {
        z65.h(animationDto, "claimRewardAnimation");
        z65.h(animationDto2, "maxRewardReachedAnimation");
        this.claimRewardAnimation = animationDto;
        this.maxRewardReachedAnimation = animationDto2;
    }

    public static /* synthetic */ StackGameAnimationsDto copy$default(StackGameAnimationsDto stackGameAnimationsDto, AnimationDto animationDto, AnimationDto animationDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            animationDto = stackGameAnimationsDto.claimRewardAnimation;
        }
        if ((i & 2) != 0) {
            animationDto2 = stackGameAnimationsDto.maxRewardReachedAnimation;
        }
        return stackGameAnimationsDto.copy(animationDto, animationDto2);
    }

    public final AnimationDto component1() {
        return this.claimRewardAnimation;
    }

    public final AnimationDto component2() {
        return this.maxRewardReachedAnimation;
    }

    public final StackGameAnimationsDto copy(AnimationDto animationDto, AnimationDto animationDto2) {
        z65.h(animationDto, "claimRewardAnimation");
        z65.h(animationDto2, "maxRewardReachedAnimation");
        return new StackGameAnimationsDto(animationDto, animationDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackGameAnimationsDto)) {
            return false;
        }
        StackGameAnimationsDto stackGameAnimationsDto = (StackGameAnimationsDto) obj;
        if (z65.c(this.claimRewardAnimation, stackGameAnimationsDto.claimRewardAnimation) && z65.c(this.maxRewardReachedAnimation, stackGameAnimationsDto.maxRewardReachedAnimation)) {
            return true;
        }
        return false;
    }

    public final AnimationDto getClaimRewardAnimation() {
        return this.claimRewardAnimation;
    }

    public final AnimationDto getMaxRewardReachedAnimation() {
        return this.maxRewardReachedAnimation;
    }

    public int hashCode() {
        return (this.claimRewardAnimation.hashCode() * 31) + this.maxRewardReachedAnimation.hashCode();
    }

    public String toString() {
        AnimationDto animationDto = this.claimRewardAnimation;
        AnimationDto animationDto2 = this.maxRewardReachedAnimation;
        return "StackGameAnimationsDto(claimRewardAnimation=" + animationDto + ", maxRewardReachedAnimation=" + animationDto2 + ")";
    }
}
