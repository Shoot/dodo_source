package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: CardPaymentView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lrp0;", "Lmoxy/MvpView;", "", "e2", "", "errorDescResId", "l4", "f", "g", "", "acquirerName", "v7", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rp0  reason: default package */
/* loaded from: classes4.dex */
public interface rp0 extends MvpView {
    void e2();

    void f();

    void g();

    void l4(int i);

    void v7(String str);
}
