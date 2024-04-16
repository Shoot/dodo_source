package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OrderHistoryDetailsInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\"\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0013"}, d2 = {"Lle7;", "", "", "orderId", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "b", "orderNumber", "orderUUID", "", "positionInList", c.a, "Lae7;", "orderHistory", "a", "", "Lz21;", "getChecks", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: le7  reason: default package */
/* loaded from: classes2.dex */
public interface le7 {
    wx<Unit> a(ae7 ae7Var, int i);

    wx<Unit> b(String str);

    wx<Unit> c(String str, String str2, int i);

    wx<List<z21>> getChecks(String str);
}
