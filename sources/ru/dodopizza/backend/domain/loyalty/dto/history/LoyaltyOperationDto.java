package ru.dodopizza.backend.domain.loyalty.dto.history;

import com.dodopizza.kustoworker.KustoStorage;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LoyaltyOperationDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationDto;", "", MessageAttributes.TYPE, "", KustoStorage.KustoTable.COLUMN_SOURCE, "Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationSourceDto;", "amount", "", "date", "", "expirationDate", "isExtraCashBack", "", "(ILru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationSourceDto;DLjava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()D", "getDate", "()Ljava/lang/String;", "getExpirationDate", "()Z", "getSource", "()Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationSourceDto;", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyOperationDto {
    @uca("amount")
    private final double amount;
    @uca("date")
    private final String date;
    @uca("expirationDate")
    private final String expirationDate;
    @uca("isExtraCashback")
    private final boolean isExtraCashBack;
    @uca(KustoStorage.KustoTable.COLUMN_SOURCE)
    private final LoyaltyOperationSourceDto source;
    @uca(MessageAttributes.TYPE)
    private final int type;

    public LoyaltyOperationDto(int i, LoyaltyOperationSourceDto loyaltyOperationSourceDto, double d, String str, String str2, boolean z) {
        z65.h(loyaltyOperationSourceDto, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(str, "date");
        z65.h(str2, "expirationDate");
        this.type = i;
        this.source = loyaltyOperationSourceDto;
        this.amount = d;
        this.date = str;
        this.expirationDate = str2;
        this.isExtraCashBack = z;
    }

    public static /* synthetic */ LoyaltyOperationDto copy$default(LoyaltyOperationDto loyaltyOperationDto, int i, LoyaltyOperationSourceDto loyaltyOperationSourceDto, double d, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loyaltyOperationDto.type;
        }
        if ((i2 & 2) != 0) {
            loyaltyOperationSourceDto = loyaltyOperationDto.source;
        }
        LoyaltyOperationSourceDto loyaltyOperationSourceDto2 = loyaltyOperationSourceDto;
        if ((i2 & 4) != 0) {
            d = loyaltyOperationDto.amount;
        }
        double d2 = d;
        if ((i2 & 8) != 0) {
            str = loyaltyOperationDto.date;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            str2 = loyaltyOperationDto.expirationDate;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            z = loyaltyOperationDto.isExtraCashBack;
        }
        return loyaltyOperationDto.copy(i, loyaltyOperationSourceDto2, d2, str3, str4, z);
    }

    public final int component1() {
        return this.type;
    }

    public final LoyaltyOperationSourceDto component2() {
        return this.source;
    }

    public final double component3() {
        return this.amount;
    }

    public final String component4() {
        return this.date;
    }

    public final String component5() {
        return this.expirationDate;
    }

    public final boolean component6() {
        return this.isExtraCashBack;
    }

    public final LoyaltyOperationDto copy(int i, LoyaltyOperationSourceDto loyaltyOperationSourceDto, double d, String str, String str2, boolean z) {
        z65.h(loyaltyOperationSourceDto, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(str, "date");
        z65.h(str2, "expirationDate");
        return new LoyaltyOperationDto(i, loyaltyOperationSourceDto, d, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyOperationDto)) {
            return false;
        }
        LoyaltyOperationDto loyaltyOperationDto = (LoyaltyOperationDto) obj;
        if (this.type == loyaltyOperationDto.type && z65.c(this.source, loyaltyOperationDto.source) && Double.compare(this.amount, loyaltyOperationDto.amount) == 0 && z65.c(this.date, loyaltyOperationDto.date) && z65.c(this.expirationDate, loyaltyOperationDto.expirationDate) && this.isExtraCashBack == loyaltyOperationDto.isExtraCashBack) {
            return true;
        }
        return false;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final LoyaltyOperationSourceDto getSource() {
        return this.source;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type * 31) + this.source.hashCode()) * 31) + nkb.a(this.amount)) * 31) + this.date.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + a91.a(this.isExtraCashBack);
    }

    public final boolean isExtraCashBack() {
        return this.isExtraCashBack;
    }

    public String toString() {
        int i = this.type;
        LoyaltyOperationSourceDto loyaltyOperationSourceDto = this.source;
        double d = this.amount;
        String str = this.date;
        String str2 = this.expirationDate;
        boolean z = this.isExtraCashBack;
        return "LoyaltyOperationDto(type=" + i + ", source=" + loyaltyOperationSourceDto + ", amount=" + d + ", date=" + str + ", expirationDate=" + str2 + ", isExtraCashBack=" + z + ")";
    }
}
