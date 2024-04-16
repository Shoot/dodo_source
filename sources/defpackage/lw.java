package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: AssistantSharingView.kt */
@StateStrategyType(OneExecutionStateStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Llw;", "Lmoxy/MvpView;", "Ljw;", "sharingVO", "", "C9", "db", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lw  reason: default package */
/* loaded from: classes2.dex */
public interface lw extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void C9(jw jwVar);

    void db();
}
