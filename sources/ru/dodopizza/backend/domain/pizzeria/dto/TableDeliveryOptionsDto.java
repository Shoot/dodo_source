package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
/* compiled from: TableDeliveryOptionsDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/TableDeliveryOptionsDto;", "", "tableDeliverySupported", "", "(Z)V", "getTableDeliverySupported", "()Z", "setTableDeliverySupported", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TableDeliveryOptionsDto {
    @uca("tableDeliverySupported")
    private boolean tableDeliverySupported;

    public TableDeliveryOptionsDto(boolean z) {
        this.tableDeliverySupported = z;
    }

    public static /* synthetic */ TableDeliveryOptionsDto copy$default(TableDeliveryOptionsDto tableDeliveryOptionsDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tableDeliveryOptionsDto.tableDeliverySupported;
        }
        return tableDeliveryOptionsDto.copy(z);
    }

    public final boolean component1() {
        return this.tableDeliverySupported;
    }

    public final TableDeliveryOptionsDto copy(boolean z) {
        return new TableDeliveryOptionsDto(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TableDeliveryOptionsDto) && this.tableDeliverySupported == ((TableDeliveryOptionsDto) obj).tableDeliverySupported) {
            return true;
        }
        return false;
    }

    public final boolean getTableDeliverySupported() {
        return this.tableDeliverySupported;
    }

    public int hashCode() {
        return a91.a(this.tableDeliverySupported);
    }

    public final void setTableDeliverySupported(boolean z) {
        this.tableDeliverySupported = z;
    }

    public String toString() {
        boolean z = this.tableDeliverySupported;
        return "TableDeliveryOptionsDto(tableDeliverySupported=" + z + ")";
    }
}
