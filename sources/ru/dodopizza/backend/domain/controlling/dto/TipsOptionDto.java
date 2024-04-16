package ru.dodopizza.backend.domain.controlling.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: TipsOptionDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/TipsOptionDto;", "", "isAvailable", "", "payTipsUrl", "", "successRedirectUrl", "failureRedirectUrl", "suggestedTips", "", "Lru/dodopizza/backend/domain/controlling/dto/SuggestedTipDto;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFailureRedirectUrl", "()Ljava/lang/String;", "()Z", "getPayTipsUrl", "getSuccessRedirectUrl", "getSuggestedTips", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TipsOptionDto {
    @uca("failureRedirectUrl")
    private final String failureRedirectUrl;
    @uca("isAvailable")
    private final boolean isAvailable;
    @uca("payTipsUrl")
    private final String payTipsUrl;
    @uca("successRedirectUrl")
    private final String successRedirectUrl;
    @uca("suggestedTips")
    private final List<SuggestedTipDto> suggestedTips;

    public TipsOptionDto(boolean z, String str, String str2, String str3, List<SuggestedTipDto> list) {
        z65.h(list, "suggestedTips");
        this.isAvailable = z;
        this.payTipsUrl = str;
        this.successRedirectUrl = str2;
        this.failureRedirectUrl = str3;
        this.suggestedTips = list;
    }

    public static /* synthetic */ TipsOptionDto copy$default(TipsOptionDto tipsOptionDto, boolean z, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tipsOptionDto.isAvailable;
        }
        if ((i & 2) != 0) {
            str = tipsOptionDto.payTipsUrl;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = tipsOptionDto.successRedirectUrl;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = tipsOptionDto.failureRedirectUrl;
        }
        String str6 = str3;
        List<SuggestedTipDto> list2 = list;
        if ((i & 16) != 0) {
            list2 = tipsOptionDto.suggestedTips;
        }
        return tipsOptionDto.copy(z, str4, str5, str6, list2);
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final String component2() {
        return this.payTipsUrl;
    }

    public final String component3() {
        return this.successRedirectUrl;
    }

    public final String component4() {
        return this.failureRedirectUrl;
    }

    public final List<SuggestedTipDto> component5() {
        return this.suggestedTips;
    }

    public final TipsOptionDto copy(boolean z, String str, String str2, String str3, List<SuggestedTipDto> list) {
        z65.h(list, "suggestedTips");
        return new TipsOptionDto(z, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipsOptionDto)) {
            return false;
        }
        TipsOptionDto tipsOptionDto = (TipsOptionDto) obj;
        if (this.isAvailable == tipsOptionDto.isAvailable && z65.c(this.payTipsUrl, tipsOptionDto.payTipsUrl) && z65.c(this.successRedirectUrl, tipsOptionDto.successRedirectUrl) && z65.c(this.failureRedirectUrl, tipsOptionDto.failureRedirectUrl) && z65.c(this.suggestedTips, tipsOptionDto.suggestedTips)) {
            return true;
        }
        return false;
    }

    public final String getFailureRedirectUrl() {
        return this.failureRedirectUrl;
    }

    public final String getPayTipsUrl() {
        return this.payTipsUrl;
    }

    public final String getSuccessRedirectUrl() {
        return this.successRedirectUrl;
    }

    public final List<SuggestedTipDto> getSuggestedTips() {
        return this.suggestedTips;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a = a91.a(this.isAvailable) * 31;
        String str = this.payTipsUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str2 = this.successRedirectUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.failureRedirectUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i3 + i) * 31) + this.suggestedTips.hashCode();
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        boolean z = this.isAvailable;
        String str = this.payTipsUrl;
        String str2 = this.successRedirectUrl;
        String str3 = this.failureRedirectUrl;
        List<SuggestedTipDto> list = this.suggestedTips;
        return "TipsOptionDto(isAvailable=" + z + ", payTipsUrl=" + str + ", successRedirectUrl=" + str2 + ", failureRedirectUrl=" + str3 + ", suggestedTips=" + list + ")";
    }
}
