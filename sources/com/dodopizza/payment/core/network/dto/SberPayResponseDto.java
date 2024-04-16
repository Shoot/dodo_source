package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: SberPayResponseDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/SberPayResponseDto;", "", "isSuccess", "", "sbolDeepLink", "", "(ZLjava/lang/String;)V", "()Z", "getSbolDeepLink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SberPayResponseDto {
    private final boolean isSuccess;
    private final String sbolDeepLink;

    public SberPayResponseDto(boolean z, String str) {
        z65.h(str, "sbolDeepLink");
        this.isSuccess = z;
        this.sbolDeepLink = str;
    }

    public static /* synthetic */ SberPayResponseDto copy$default(SberPayResponseDto sberPayResponseDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sberPayResponseDto.isSuccess;
        }
        if ((i & 2) != 0) {
            str = sberPayResponseDto.sbolDeepLink;
        }
        return sberPayResponseDto.copy(z, str);
    }

    public final boolean component1() {
        return this.isSuccess;
    }

    public final String component2() {
        return this.sbolDeepLink;
    }

    public final SberPayResponseDto copy(boolean z, String str) {
        z65.h(str, "sbolDeepLink");
        return new SberPayResponseDto(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SberPayResponseDto)) {
            return false;
        }
        SberPayResponseDto sberPayResponseDto = (SberPayResponseDto) obj;
        if (this.isSuccess == sberPayResponseDto.isSuccess && z65.c(this.sbolDeepLink, sberPayResponseDto.sbolDeepLink)) {
            return true;
        }
        return false;
    }

    public final String getSbolDeepLink() {
        return this.sbolDeepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.sbolDeepLink.hashCode();
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return "SberPayResponseDto(isSuccess=" + this.isSuccess + ", sbolDeepLink=" + this.sbolDeepLink + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
