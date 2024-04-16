package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
/* compiled from: TableDeliveryDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryDto;", "", "isEnabled", "", "isSupported", "(ZZ)V", "()Z", "setEnabled", "(Z)V", "setSupported", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TableDeliveryDto {
    @uca("isEnabled")
    private boolean isEnabled;
    @uca("isSupported")
    private boolean isSupported;

    public TableDeliveryDto(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isSupported = z2;
    }

    public static /* synthetic */ TableDeliveryDto copy$default(TableDeliveryDto tableDeliveryDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tableDeliveryDto.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = tableDeliveryDto.isSupported;
        }
        return tableDeliveryDto.copy(z, z2);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final boolean component2() {
        return this.isSupported;
    }

    public final TableDeliveryDto copy(boolean z, boolean z2) {
        return new TableDeliveryDto(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableDeliveryDto)) {
            return false;
        }
        TableDeliveryDto tableDeliveryDto = (TableDeliveryDto) obj;
        if (this.isEnabled == tableDeliveryDto.isEnabled && this.isSupported == tableDeliveryDto.isSupported) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a91.a(this.isEnabled) * 31) + a91.a(this.isSupported);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setSupported(boolean z) {
        this.isSupported = z;
    }

    public String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isSupported;
        return "TableDeliveryDto(isEnabled=" + z + ", isSupported=" + z2 + ")";
    }
}
