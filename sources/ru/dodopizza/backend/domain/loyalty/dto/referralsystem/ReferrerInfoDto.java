package ru.dodopizza.backend.domain.loyalty.dto.referralsystem;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ReferrerInfoDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J~\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00063"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerInfoDto;", "", MessageAttributes.UUID, "", "referralCode", "totalCoinsEarned", "", "totalInvitedFriend", "", "referrerReward", "referrerRewardDescription", "referralGift", "referralGiftDescription", "inviteLink", "inviteMessage", "maxReferrals", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getInviteLink", "()Ljava/lang/String;", "getInviteMessage", "getMaxReferrals", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReferralCode", "getReferralGift", "getReferralGiftDescription", "getReferrerReward", "getReferrerRewardDescription", "getTotalCoinsEarned", "()D", "getTotalInvitedFriend", "()I", "getUuid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerInfoDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferrerInfoDto {
    @uca("invitationLink")
    private final String inviteLink;
    @uca("invitationMessage")
    private final String inviteMessage;
    @uca("maxReferrals")
    private final Integer maxReferrals;
    @uca("referralCode")
    private final String referralCode;
    @uca("referralReward")
    private final String referralGift;
    @uca("referralRewardDescription")
    private final String referralGiftDescription;
    @uca("referrerReward")
    private final String referrerReward;
    @uca("referrerRewardDescription")
    private final String referrerRewardDescription;
    @uca("totalCoinsEarned")
    private final double totalCoinsEarned;
    @uca("totalReferrals")
    private final int totalInvitedFriend;
    @uca("id")
    private final String uuid;

    public ReferrerInfoDto(String str, String str2, double d, int i, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "referralCode");
        z65.h(str3, "referrerReward");
        z65.h(str4, "referrerRewardDescription");
        z65.h(str5, "referralGift");
        z65.h(str6, "referralGiftDescription");
        z65.h(str7, "inviteLink");
        z65.h(str8, "inviteMessage");
        this.uuid = str;
        this.referralCode = str2;
        this.totalCoinsEarned = d;
        this.totalInvitedFriend = i;
        this.referrerReward = str3;
        this.referrerRewardDescription = str4;
        this.referralGift = str5;
        this.referralGiftDescription = str6;
        this.inviteLink = str7;
        this.inviteMessage = str8;
        this.maxReferrals = num;
    }

    public static /* synthetic */ ReferrerInfoDto copy$default(ReferrerInfoDto referrerInfoDto, String str, String str2, double d, int i, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, int i2, Object obj) {
        String str9;
        String str10;
        double d2;
        int i3;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Integer num2;
        if ((i2 & 1) != 0) {
            str9 = referrerInfoDto.uuid;
        } else {
            str9 = str;
        }
        if ((i2 & 2) != 0) {
            str10 = referrerInfoDto.referralCode;
        } else {
            str10 = str2;
        }
        if ((i2 & 4) != 0) {
            d2 = referrerInfoDto.totalCoinsEarned;
        } else {
            d2 = d;
        }
        if ((i2 & 8) != 0) {
            i3 = referrerInfoDto.totalInvitedFriend;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            str11 = referrerInfoDto.referrerReward;
        } else {
            str11 = str3;
        }
        if ((i2 & 32) != 0) {
            str12 = referrerInfoDto.referrerRewardDescription;
        } else {
            str12 = str4;
        }
        if ((i2 & 64) != 0) {
            str13 = referrerInfoDto.referralGift;
        } else {
            str13 = str5;
        }
        if ((i2 & 128) != 0) {
            str14 = referrerInfoDto.referralGiftDescription;
        } else {
            str14 = str6;
        }
        if ((i2 & 256) != 0) {
            str15 = referrerInfoDto.inviteLink;
        } else {
            str15 = str7;
        }
        if ((i2 & 512) != 0) {
            str16 = referrerInfoDto.inviteMessage;
        } else {
            str16 = str8;
        }
        if ((i2 & 1024) != 0) {
            num2 = referrerInfoDto.maxReferrals;
        } else {
            num2 = num;
        }
        return referrerInfoDto.copy(str9, str10, d2, i3, str11, str12, str13, str14, str15, str16, num2);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component10() {
        return this.inviteMessage;
    }

    public final Integer component11() {
        return this.maxReferrals;
    }

    public final String component2() {
        return this.referralCode;
    }

    public final double component3() {
        return this.totalCoinsEarned;
    }

    public final int component4() {
        return this.totalInvitedFriend;
    }

    public final String component5() {
        return this.referrerReward;
    }

    public final String component6() {
        return this.referrerRewardDescription;
    }

    public final String component7() {
        return this.referralGift;
    }

    public final String component8() {
        return this.referralGiftDescription;
    }

    public final String component9() {
        return this.inviteLink;
    }

    public final ReferrerInfoDto copy(String str, String str2, double d, int i, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "referralCode");
        z65.h(str3, "referrerReward");
        z65.h(str4, "referrerRewardDescription");
        z65.h(str5, "referralGift");
        z65.h(str6, "referralGiftDescription");
        z65.h(str7, "inviteLink");
        z65.h(str8, "inviteMessage");
        return new ReferrerInfoDto(str, str2, d, i, str3, str4, str5, str6, str7, str8, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferrerInfoDto)) {
            return false;
        }
        ReferrerInfoDto referrerInfoDto = (ReferrerInfoDto) obj;
        if (z65.c(this.uuid, referrerInfoDto.uuid) && z65.c(this.referralCode, referrerInfoDto.referralCode) && Double.compare(this.totalCoinsEarned, referrerInfoDto.totalCoinsEarned) == 0 && this.totalInvitedFriend == referrerInfoDto.totalInvitedFriend && z65.c(this.referrerReward, referrerInfoDto.referrerReward) && z65.c(this.referrerRewardDescription, referrerInfoDto.referrerRewardDescription) && z65.c(this.referralGift, referrerInfoDto.referralGift) && z65.c(this.referralGiftDescription, referrerInfoDto.referralGiftDescription) && z65.c(this.inviteLink, referrerInfoDto.inviteLink) && z65.c(this.inviteMessage, referrerInfoDto.inviteMessage) && z65.c(this.maxReferrals, referrerInfoDto.maxReferrals)) {
            return true;
        }
        return false;
    }

    public final String getInviteLink() {
        return this.inviteLink;
    }

    public final String getInviteMessage() {
        return this.inviteMessage;
    }

    public final Integer getMaxReferrals() {
        return this.maxReferrals;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final String getReferralGift() {
        return this.referralGift;
    }

    public final String getReferralGiftDescription() {
        return this.referralGiftDescription;
    }

    public final String getReferrerReward() {
        return this.referrerReward;
    }

    public final String getReferrerRewardDescription() {
        return this.referrerRewardDescription;
    }

    public final double getTotalCoinsEarned() {
        return this.totalCoinsEarned;
    }

    public final int getTotalInvitedFriend() {
        return this.totalInvitedFriend;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((this.uuid.hashCode() * 31) + this.referralCode.hashCode()) * 31) + nkb.a(this.totalCoinsEarned)) * 31) + this.totalInvitedFriend) * 31) + this.referrerReward.hashCode()) * 31) + this.referrerRewardDescription.hashCode()) * 31) + this.referralGift.hashCode()) * 31) + this.referralGiftDescription.hashCode()) * 31) + this.inviteLink.hashCode()) * 31) + this.inviteMessage.hashCode()) * 31;
        Integer num = this.maxReferrals;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.referralCode;
        double d = this.totalCoinsEarned;
        int i = this.totalInvitedFriend;
        String str3 = this.referrerReward;
        String str4 = this.referrerRewardDescription;
        String str5 = this.referralGift;
        String str6 = this.referralGiftDescription;
        String str7 = this.inviteLink;
        String str8 = this.inviteMessage;
        Integer num = this.maxReferrals;
        return "ReferrerInfoDto(uuid=" + str + ", referralCode=" + str2 + ", totalCoinsEarned=" + d + ", totalInvitedFriend=" + i + ", referrerReward=" + str3 + ", referrerRewardDescription=" + str4 + ", referralGift=" + str5 + ", referralGiftDescription=" + str6 + ", inviteLink=" + str7 + ", inviteMessage=" + str8 + ", maxReferrals=" + num + ")";
    }
}
