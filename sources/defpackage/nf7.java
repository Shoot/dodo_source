package defpackage;

import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lnf7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "clientCity", "b", "clientUUID", c.a, "I", "ordersCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nf7  reason: default package */
/* loaded from: classes2.dex */
public final class nf7 implements dc {
    private final String a;
    private final String b;
    private final int c;

    public nf7(String str, String str2, int i) {
        z65.h(str, "clientCity");
        z65.h(str2, "clientUUID");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(bc.e(new bc("open_order_history"), "clientCity", this.a, false, 4, null), MessageAttributes.CLIENT_ID, this.b, false, 4, null), "ordersCount", Integer.valueOf(this.c), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf7)) {
            return false;
        }
        nf7 nf7Var = (nf7) obj;
        if (z65.c(this.a, nf7Var.a) && z65.c(this.b, nf7Var.b) && this.c == nf7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        return "OrderHistoryOpen(clientCity=" + str + ", clientUUID=" + str2 + ", ordersCount=" + i + ")";
    }
}
