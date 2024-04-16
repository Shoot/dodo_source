package ru.dodopizza.backend.domain.payment.dto.app2app;

import kotlin.Metadata;
/* compiled from: PayByApp2AppResponseDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/app2app/PayByApp2AppResponseDto;", "", "isSuccess", "", "deepLink", "", "(ZLjava/lang/String;)V", "getDeepLink", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayByApp2AppResponseDto {
    @uca("deepLink")
    private final String deepLink;
    @uca("isSuccess")
    private final boolean isSuccess;

    public PayByApp2AppResponseDto(boolean z, String str) {
        this.isSuccess = z;
        this.deepLink = str;
    }

    public static /* synthetic */ PayByApp2AppResponseDto copy$default(PayByApp2AppResponseDto payByApp2AppResponseDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = payByApp2AppResponseDto.isSuccess;
        }
        if ((i & 2) != 0) {
            str = payByApp2AppResponseDto.deepLink;
        }
        return payByApp2AppResponseDto.copy(z, str);
    }

    public final boolean component1() {
        return this.isSuccess;
    }

    public final String component2() {
        return this.deepLink;
    }

    public final PayByApp2AppResponseDto copy(boolean z, String str) {
        return new PayByApp2AppResponseDto(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByApp2AppResponseDto)) {
            return false;
        }
        PayByApp2AppResponseDto payByApp2AppResponseDto = (PayByApp2AppResponseDto) obj;
        if (this.isSuccess == payByApp2AppResponseDto.isSuccess && z65.c(this.deepLink, payByApp2AppResponseDto.deepLink)) {
            return true;
        }
        return false;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.isSuccess) * 31;
        String str = this.deepLink;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        boolean z = this.isSuccess;
        String str = this.deepLink;
        return "PayByApp2AppResponseDto(isSuccess=" + z + ", deepLink=" + str + ")";
    }
}
