package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: WebViewCardPaymentView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Li4c;", "Lmoxy/MvpView;", "", "isError", "", "L", "show", "M", "gf", "Ke", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: i4c  reason: default package */
/* loaded from: classes4.dex */
public interface i4c extends MvpView {
    @StateStrategyType(SkipStrategy.class)
    void Ke();

    void L(boolean z);

    void M(boolean z);

    void gf();
}
