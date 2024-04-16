package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: FeedbackView.kt */
@StateStrategyType(SkipStrategy.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lbs3;", "Lmoxy/MvpView;", "", "d5", "r8", "", "show", "M", "tc", "q2", "sd", "lf", "a6", "contacts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bs3  reason: default package */
/* loaded from: classes.dex */
public interface bs3 extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void M(boolean z);

    void a6();

    void d5();

    void lf();

    void q2();

    void r8();

    void sd();

    void tc();
}
