package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderHistoryView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0002H'¨\u0006\u000b"}, d2 = {"Lwf7;", "Lmoxy/MvpView;", "", "b", "n0", "Fg", "", "Luf7;", "orderHistories", "x9", "U", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wf7  reason: default package */
/* loaded from: classes2.dex */
public interface wf7 extends MvpView {
    void Fg();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void U();

    void b();

    void n0();

    void x9(List<? extends uf7> list);
}
