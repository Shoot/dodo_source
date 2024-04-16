package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
/* compiled from: AccountDeletionInfoDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/AccountDeletionInfoDto;", "", "isProcessing", "", "deletingDateUtc", "", "(ZLjava/lang/String;)V", "getDeletingDateUtc", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountDeletionInfoDto {
    @uca("deletionDate")
    private final String deletingDateUtc;
    @uca("isProcessing")
    private final boolean isProcessing;

    public AccountDeletionInfoDto(boolean z, String str) {
        this.isProcessing = z;
        this.deletingDateUtc = str;
    }

    public static /* synthetic */ AccountDeletionInfoDto copy$default(AccountDeletionInfoDto accountDeletionInfoDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountDeletionInfoDto.isProcessing;
        }
        if ((i & 2) != 0) {
            str = accountDeletionInfoDto.deletingDateUtc;
        }
        return accountDeletionInfoDto.copy(z, str);
    }

    public final boolean component1() {
        return this.isProcessing;
    }

    public final String component2() {
        return this.deletingDateUtc;
    }

    public final AccountDeletionInfoDto copy(boolean z, String str) {
        return new AccountDeletionInfoDto(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDeletionInfoDto)) {
            return false;
        }
        AccountDeletionInfoDto accountDeletionInfoDto = (AccountDeletionInfoDto) obj;
        if (this.isProcessing == accountDeletionInfoDto.isProcessing && z65.c(this.deletingDateUtc, accountDeletionInfoDto.deletingDateUtc)) {
            return true;
        }
        return false;
    }

    public final String getDeletingDateUtc() {
        return this.deletingDateUtc;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.isProcessing) * 31;
        String str = this.deletingDateUtc;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public String toString() {
        boolean z = this.isProcessing;
        String str = this.deletingDateUtc;
        return "AccountDeletionInfoDto(isProcessing=" + z + ", deletingDateUtc=" + str + ")";
    }
}
