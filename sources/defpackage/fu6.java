package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: NativeChatView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH'¨\u0006\f"}, d2 = {"Lfu6;", "Lmoxy/MvpView;", "Lvt6;", "stateToSave", "", "w6", "R4", "f5", "Ug", "Lqd;", "sender", "X", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fu6  reason: default package */
/* loaded from: classes.dex */
public interface fu6 extends MvpView {
    void R4();

    @StateStrategyType(SkipStrategy.class)
    void Ug();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void X(qd qdVar);

    void f5();

    void w6(vt6 vt6Var);
}
