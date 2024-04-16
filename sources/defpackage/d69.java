package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: RatingCommentView.kt */
@StateStrategyType(OneExecutionStateStrategy.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0015"}, d2 = {"Ld69;", "Lmoxy/MvpView;", "", "comment", "", "dc", "", "visible", "yf", "U6", "Lnr3;", "data", "U7", "highlightButton", "f4", "", "failedPhotosNumber", "ah", "Lb69;", "stateToSave", "g3", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d69  reason: default package */
/* loaded from: classes.dex */
public interface d69 extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void U6(boolean z);

    void U7(nr3 nr3Var);

    void ah(int i);

    void dc(String str);

    void f4(boolean z);

    void g3(b69 b69Var);

    @StateStrategyType(AddToEndSingleStrategy.class)
    void yf(boolean z);
}
