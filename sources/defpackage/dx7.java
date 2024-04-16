package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: PaymentWorkflowBrokenView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Ldx7;", "Lmoxy/MvpView;", "", "phone", "", "G6", "u9", "dismiss", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dx7  reason: default package */
/* loaded from: classes4.dex */
public interface dx7 extends MvpView {
    void G6(String str);

    void dismiss();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void u9(String str);
}
