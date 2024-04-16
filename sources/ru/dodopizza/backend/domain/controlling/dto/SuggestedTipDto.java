package ru.dodopizza.backend.domain.controlling.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: SuggestedTipDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/SuggestedTipDto;", "", "amount", "", "predefinedUrl", "", "(ILjava/lang/String;)V", "getAmount", "()I", "getPredefinedUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedTipDto {
    @uca("amount")
    private final int amount;
    @uca(RemoteMessageConst.Notification.URL)
    private final String predefinedUrl;

    public SuggestedTipDto(int i, String str) {
        z65.h(str, "predefinedUrl");
        this.amount = i;
        this.predefinedUrl = str;
    }

    public static /* synthetic */ SuggestedTipDto copy$default(SuggestedTipDto suggestedTipDto, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = suggestedTipDto.amount;
        }
        if ((i2 & 2) != 0) {
            str = suggestedTipDto.predefinedUrl;
        }
        return suggestedTipDto.copy(i, str);
    }

    public final int component1() {
        return this.amount;
    }

    public final String component2() {
        return this.predefinedUrl;
    }

    public final SuggestedTipDto copy(int i, String str) {
        z65.h(str, "predefinedUrl");
        return new SuggestedTipDto(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedTipDto)) {
            return false;
        }
        SuggestedTipDto suggestedTipDto = (SuggestedTipDto) obj;
        if (this.amount == suggestedTipDto.amount && z65.c(this.predefinedUrl, suggestedTipDto.predefinedUrl)) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getPredefinedUrl() {
        return this.predefinedUrl;
    }

    public int hashCode() {
        return (this.amount * 31) + this.predefinedUrl.hashCode();
    }

    public String toString() {
        int i = this.amount;
        String str = this.predefinedUrl;
        return "SuggestedTipDto(amount=" + i + ", predefinedUrl=" + str + ")";
    }
}
