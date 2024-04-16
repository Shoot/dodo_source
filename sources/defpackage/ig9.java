package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.xf7;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lig9;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "clientCity", "b", "clientUuid", c.a, "I", "positionInList", "Lae7;", DateTokenConverter.CONVERTER_KEY, "Lae7;", "orderHistory", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILae7;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ig9  reason: default package */
/* loaded from: classes2.dex */
public final class ig9 implements dc {
    private final String a;
    private final String b;
    private final int c;
    private final ae7 d;

    public ig9(String str, String str2, int i, ae7 ae7Var) {
        z65.h(str, "clientCity");
        z65.h(str2, "clientUuid");
        z65.h(ae7Var, "orderHistory");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = ae7Var;
    }

    @Override // defpackage.dc
    public qc a() {
        int w;
        int w2;
        Map k;
        Map f;
        bc A = vc.A(bc.e(bc.e(bc.e(bc.e(bc.e(new bc("repeat_order"), "clientCity", this.a, false, 4, null), MessageAttributes.CLIENT_ID, this.b, false, 4, null), "position", Integer.valueOf(this.c), false, 4, null), "orderNumber", this.d.e(), false, 4, null), "orderUUId", this.d.getId(), false, 4, null), "orderHistoryCard");
        List<xf7> f2 = this.d.f();
        w = lc1.w(f2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (xf7 xf7Var : f2) {
            if (xf7Var instanceof xf7.b) {
                k = f86.f(lnb.a(Action.NAME_ATTRIBUTE, xf7Var.getName()));
            } else if (xf7Var instanceof xf7.a) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = lnb.a(Action.NAME_ATTRIBUTE, xf7Var.getName());
                List<xg7> a = ((xf7.a) xf7Var).a();
                w2 = lc1.w(a, 10);
                ArrayList arrayList2 = new ArrayList(w2);
                for (xg7 xg7Var : a) {
                    f = f86.f(lnb.a(Action.NAME_ATTRIBUTE, xg7Var.getName()));
                    arrayList2.add(f);
                }
                pairArr[1] = lnb.a("products", arrayList2);
                k = g86.k(pairArr);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(k);
        }
        return bc.e(A, "items", arrayList, false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig9)) {
            return false;
        }
        ig9 ig9Var = (ig9) obj;
        if (z65.c(this.a, ig9Var.a) && z65.c(this.b, ig9Var.b) && this.c == ig9Var.c && z65.c(this.d, ig9Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        ae7 ae7Var = this.d;
        return "RepeatOrderFromOrderHistoryCard(clientCity=" + str + ", clientUuid=" + str2 + ", positionInList=" + i + ", orderHistory=" + ae7Var + ")";
    }
}
