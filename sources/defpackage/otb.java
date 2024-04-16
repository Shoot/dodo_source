package defpackage;

import java.util.Collection;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: UpsellView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH'¨\u0006\r"}, d2 = {"Lotb;", "Lmoxy/MvpView;", "", "Latb;", "upsellProducts", "", "L1", "e8", "jg", "ud", "", "upsellProductId", "m2", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: otb  reason: default package */
/* loaded from: classes2.dex */
public interface otb extends MvpView {
    void L1(Collection<? extends atb> collection);

    void e8();

    void jg();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void m2(String str);

    void ud();
}
