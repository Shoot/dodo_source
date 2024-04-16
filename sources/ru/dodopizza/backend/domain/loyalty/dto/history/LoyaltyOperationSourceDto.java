package ru.dodopizza.backend.domain.loyalty.dto.history;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LoyaltyOperationSourceDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationSourceDto;", "", MessageAttributes.TYPE, "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyOperationSourceDto {
    @uca("description")
    private final String description;
    @uca(MessageAttributes.TYPE)
    private final int type;

    public LoyaltyOperationSourceDto(int i, String str) {
        z65.h(str, "description");
        this.type = i;
        this.description = str;
    }

    public static /* synthetic */ LoyaltyOperationSourceDto copy$default(LoyaltyOperationSourceDto loyaltyOperationSourceDto, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loyaltyOperationSourceDto.type;
        }
        if ((i2 & 2) != 0) {
            str = loyaltyOperationSourceDto.description;
        }
        return loyaltyOperationSourceDto.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.description;
    }

    public final LoyaltyOperationSourceDto copy(int i, String str) {
        z65.h(str, "description");
        return new LoyaltyOperationSourceDto(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyOperationSourceDto)) {
            return false;
        }
        LoyaltyOperationSourceDto loyaltyOperationSourceDto = (LoyaltyOperationSourceDto) obj;
        if (this.type == loyaltyOperationSourceDto.type && z65.c(this.description, loyaltyOperationSourceDto.description)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.description.hashCode();
    }

    public String toString() {
        int i = this.type;
        String str = this.description;
        return "LoyaltyOperationSourceDto(type=" + i + ", description=" + str + ")";
    }
}
