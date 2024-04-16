package defpackage;

import com.huawei.hms.push.e;
import defpackage.k9a;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DeliveryAddressListView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H'J\b\u0010\u0010\u001a\u00020\u0005H'J\b\u0010\u0011\u001a\u00020\u0005H'J\b\u0010\u0012\u001a\u00020\u0005H'J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H'¨\u0006\u0016"}, d2 = {"Lew2;", "Lmoxy/MvpView;", "", "Lgv2;", "addressList", "", "u3", "", "showAddAddressButton", "Zb", "Lou2;", "deliverablePlace", "Ig", "Pg", "Ef", "Dd", e.a, "f", "g", "Lk9a$b;", "request", "q", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ew2  reason: default package */
/* loaded from: classes2.dex */
public interface ew2 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void Dd();

    void Ef();

    void Ig(ou2 ou2Var);

    void Pg(ou2 ou2Var);

    void Zb(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void f();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void g();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void q(k9a.b bVar);

    void u3(List<? extends gv2> list);
}
