package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PositionCourier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001c"}, d2 = {"Lwf8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "orderId", "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "lat", c.a, "lon", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "updateIntervalSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wf8  reason: default package */
/* loaded from: classes4.dex */
public final class wf8 {
    private final String a;
    private final Double b;
    private final Double c;
    private final Long d;

    public wf8(String str, Double d, Double d2, Long l) {
        z65.h(str, "orderId");
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = l;
    }

    public final Double a() {
        return this.b;
    }

    public final Double b() {
        return this.c;
    }

    public final Long c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf8)) {
            return false;
        }
        wf8 wf8Var = (wf8) obj;
        if (z65.c(this.a, wf8Var.a) && z65.c(this.b, wf8Var.b) && z65.c(this.c, wf8Var.c) && z65.c(this.d, wf8Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        Double d = this.b;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Double d2 = this.c;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.a;
        Double d = this.b;
        Double d2 = this.c;
        Long l = this.d;
        return "PositionCourier(orderId=" + str + ", lat=" + d + ", lon=" + d2 + ", updateIntervalSeconds=" + l + ")";
    }
}
