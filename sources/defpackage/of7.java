package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lof7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "clientCity", "b", "clientUuid", c.a, "orderNumber", DateTokenConverter.CONVERTER_KEY, "orderUUID", e.a, "I", "positionInList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: of7  reason: default package */
/* loaded from: classes2.dex */
public final class of7 implements dc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;

    public of7(String str, String str2, String str3, String str4, int i) {
        z65.h(str, "clientCity");
        z65.h(str2, "clientUuid");
        z65.h(str3, "orderNumber");
        z65.h(str4, "orderUUID");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(bc.e(bc.e(bc.e(new bc("open_order_history_card"), "clientCity", this.a, false, 4, null), MessageAttributes.CLIENT_ID, this.b, false, 4, null), "orderNumber", this.c, false, 4, null), "orderUUId", this.d, false, 4, null), "position", Integer.valueOf(this.e), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of7)) {
            return false;
        }
        of7 of7Var = (of7) obj;
        if (z65.c(this.a, of7Var.a) && z65.c(this.b, of7Var.b) && z65.c(this.c, of7Var.c) && z65.c(this.d, of7Var.d) && this.e == of7Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        int i = this.e;
        return "OrderHistoryOpenCard(clientCity=" + str + ", clientUuid=" + str2 + ", orderNumber=" + str3 + ", orderUUID=" + str4 + ", positionInList=" + i + ")";
    }
}
