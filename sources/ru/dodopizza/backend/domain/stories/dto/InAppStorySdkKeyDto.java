package ru.dodopizza.backend.domain.stories.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppStorySdkKeyDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/stories/dto/InAppStorySdkKeyDto;", "", "sdkKey", "", "(Ljava/lang/String;)V", "getSdkKey", "()Ljava/lang/String;", "setSdkKey", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppStorySdkKeyDto {
    @uca("inAppStorySdkKey")
    private String sdkKey;

    public InAppStorySdkKeyDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ InAppStorySdkKeyDto copy$default(InAppStorySdkKeyDto inAppStorySdkKeyDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppStorySdkKeyDto.sdkKey;
        }
        return inAppStorySdkKeyDto.copy(str);
    }

    public final String component1() {
        return this.sdkKey;
    }

    public final InAppStorySdkKeyDto copy(String str) {
        return new InAppStorySdkKeyDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InAppStorySdkKeyDto) && z65.c(this.sdkKey, ((InAppStorySdkKeyDto) obj).sdkKey)) {
            return true;
        }
        return false;
    }

    public final String getSdkKey() {
        return this.sdkKey;
    }

    public int hashCode() {
        String str = this.sdkKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSdkKey(String str) {
        this.sdkKey = str;
    }

    public String toString() {
        String str = this.sdkKey;
        return "InAppStorySdkKeyDto(sdkKey=" + str + ")";
    }

    public InAppStorySdkKeyDto(String str) {
        this.sdkKey = str;
    }

    public /* synthetic */ InAppStorySdkKeyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
