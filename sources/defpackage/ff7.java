package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OrderHistoryInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001a\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t2\u0006\u0010\u0007\u001a\u00020\u0006H&J\"\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H&J\u001a\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lff7;", "", "Lwx;", "", "Luf7;", "getHistory", "", "ordersCount", "", "Lcom/dodopizza/async/AsyncJob;", c.a, "Lae7;", "orderHistory", "positionInList", "a", "", "orderId", "b", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ff7  reason: default package */
/* loaded from: classes2.dex */
public interface ff7 {
    wx<Unit> a(ae7 ae7Var, int i);

    wx<Unit> b(String str);

    wx<Unit> c(int i);

    wx<Collection<uf7>> getHistory();
}
