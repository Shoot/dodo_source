package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: AssistantWelcomeView.kt */
@StateStrategyType(OneExecutionStateStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lyw;", "Lmoxy/MvpView;", "Lww;", "welcomeVO", "", "Ae", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yw  reason: default package */
/* loaded from: classes2.dex */
public interface yw extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void Ae(ww wwVar);
}
