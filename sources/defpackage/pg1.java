package defpackage;

import defpackage.tmb;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: CombinedSelectionMapView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0004\u001a\u00020\u0002H'J\b\u0010\u0005\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\b\u0010\t\u001a\u00020\u0002H'J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H'J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H'J\b\u0010\u0017\u001a\u00020\u0002H&J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH'J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001aH'J\b\u0010!\u001a\u00020\u0002H&J\b\u0010\"\u001a\u00020\u0002H&J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH&¨\u0006&"}, d2 = {"Lpg1;", "Lmoxy/MvpView;", "", "Oe", "V1", "C3", "", "isFromSuggestions", "Y5", "q4", "Ls88;", "filterVO", "c5", "L9", "n1", "Ld88;", "pizzeria", "", "position", "Y7", "Lt88;", "pizzeriaInfo", "tb", "D9", "Le91;", "clientDeliveryLocation", "", "localityId", "pd", "l6", "Wf", "phoneNumber", "K", "x5", "T8", tmb.c.COUNTRY_JSON_NAME, "flag", "qg", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pg1  reason: default package */
/* loaded from: classes2.dex */
public interface pg1 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void C3();

    void D9();

    @StateStrategyType(SkipStrategy.class)
    void K(String str);

    void L9();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Oe();

    void T8();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void V1();

    void Wf();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Y5(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Y7(d88 d88Var, int i);

    void c5(s88 s88Var);

    void l6();

    void n1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void pd(e91 e91Var, String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void q4();

    void qg(String str, String str2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void tb(t88 t88Var);

    void x5();
}
