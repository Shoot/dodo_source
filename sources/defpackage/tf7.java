package defpackage;

import com.dodopizza.orderhistory.domain.orderhistory.OrderHistoryAPI;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderHistoryServiceImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ltf7;", "Lsf7;", "", "Lae7;", "getHistory", "Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;", "a", "Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;", "orderHistoryAPI", "Lhf7;", "b", "Lhf7;", "orderHistoryMapper", "Lhq3;", c.a, "Lhq3;", "featureService", "<init>", "(Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;Lhf7;Lhq3;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tf7  reason: default package */
/* loaded from: classes2.dex */
public final class tf7 implements sf7 {
    private final OrderHistoryAPI a;
    private final hf7 b;
    private final hq3 c;

    public tf7(OrderHistoryAPI orderHistoryAPI, hf7 hf7Var, hq3 hq3Var) {
        z65.h(orderHistoryAPI, "orderHistoryAPI");
        z65.h(hf7Var, "orderHistoryMapper");
        z65.h(hq3Var, "featureService");
        this.a = orderHistoryAPI;
        this.b = hf7Var;
        this.c = hq3Var;
    }

    @Override // defpackage.sf7
    public Collection<ae7> getHistory() {
        int w;
        boolean a = this.c.a(bq3.j6);
        List<xe7> history = this.a.getHistory();
        w = lc1.w(history, 10);
        ArrayList arrayList = new ArrayList(w);
        for (xe7 xe7Var : history) {
            arrayList.add(this.b.a(xe7Var, a));
        }
        return arrayList;
    }
}
