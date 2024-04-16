package ru.dodopizza.backend.domain.menu.dtov5;

import kotlin.Metadata;
/* compiled from: SaleTimeDtoV5.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/SaleTimeDtoV5;", "", "start", "", "end", "(Ljava/lang/String;Ljava/lang/String;)V", "getEnd", "()Ljava/lang/String;", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaleTimeDtoV5 {
    @uca("end")
    private final String end;
    @uca("start")
    private final String start;

    public SaleTimeDtoV5(String str, String str2) {
        this.start = str;
        this.end = str2;
    }

    public static /* synthetic */ SaleTimeDtoV5 copy$default(SaleTimeDtoV5 saleTimeDtoV5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saleTimeDtoV5.start;
        }
        if ((i & 2) != 0) {
            str2 = saleTimeDtoV5.end;
        }
        return saleTimeDtoV5.copy(str, str2);
    }

    public final String component1() {
        return this.start;
    }

    public final String component2() {
        return this.end;
    }

    public final SaleTimeDtoV5 copy(String str, String str2) {
        return new SaleTimeDtoV5(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleTimeDtoV5)) {
            return false;
        }
        SaleTimeDtoV5 saleTimeDtoV5 = (SaleTimeDtoV5) obj;
        if (z65.c(this.start, saleTimeDtoV5.start) && z65.c(this.end, saleTimeDtoV5.end)) {
            return true;
        }
        return false;
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode;
        String str = this.start;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.end;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.start;
        String str2 = this.end;
        return "SaleTimeDtoV5(start=" + str + ", end=" + str2 + ")";
    }
}
