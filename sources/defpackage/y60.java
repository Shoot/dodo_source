package defpackage;

import kotlin.Metadata;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: BaseActivityView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0004H'J\b\u0010\t\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Ly60;", "", "", "statusBarColor", "", "c2", "navigationBarColor", "E1", "l0", "y", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y60  reason: default package */
/* loaded from: classes2.dex */
public interface y60 {
    void E1(int i);

    void c2(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void l0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void y();
}
