package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DeferredTimeView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lrt2;", "Lmoxy/MvpView;", "", "position", "", "y5", "", "Lms2;", "dataSet", "Q6", "x6", "b", "C", "qe", "m3", "", "warning", "we", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rt2  reason: default package */
/* loaded from: classes4.dex */
public interface rt2 extends MvpView {
    void C();

    void Q6(List<ms2> list);

    void b();

    void m3();

    void qe();

    void we(String str);

    void x6();

    void y5(int i);
}
