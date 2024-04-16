package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderTypeSwitcherView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0002H&J\b\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0017\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\u0002H&J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0004H&J\b\u0010 \u001a\u00020\u0002H&J\b\u0010!\u001a\u00020\u0002H&J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0004H&J\b\u0010$\u001a\u00020\u0002H&J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H'J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020(H'J\b\u0010*\u001a\u00020\u0002H'J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0004H'J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H'J\b\u00100\u001a\u00020\u0002H'J\b\u00101\u001a\u00020\u0002H&J\u0010\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u000202H'J,\u00108\u001a\u00020\u00022\u0006\u00105\u001a\u0002022\u0006\u00103\u001a\u0002022\b\b\u0001\u00106\u001a\u00020-2\b\b\u0001\u00107\u001a\u00020-H'J\u0010\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0004H'¨\u0006;"}, d2 = {"Ltl7;", "Lmoxy/MvpView;", "", "Y0", "", "address", "A0", "r6", "z7", "t4", "N9", "x7", "", "isEnabled", "r1", "Mg", "ge", "Jb", "e9", "c9", "af", "K3", "showLoader", "c4", "W1", "wb", "Mf", "z9", "openTime", "S1", "errorMessage", "c7", "N3", "n8", "discount", "P0", "W", "Ld88;", "pizzeria", "t1", "Le91;", "F6", "k", "description", "O1", "", "averageDeliveryTime", "j8", "j3", "fg", "Lhn6;", "minDeliveryPrice", "Ia", "previousMinDeliveryPrice", "highlightEndColor", "textTemplateStringId", "P4", "feeText", "bh", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tl7  reason: default package */
/* loaded from: classes2.dex */
public interface tl7 extends MvpView {
    void A0(String str);

    @StateStrategyType(SkipStrategy.class)
    void F6(e91 e91Var);

    @StateStrategyType(AddToEndSingleStrategy.class)
    void Ia(hn6 hn6Var);

    void Jb();

    void K3();

    void Mf();

    void Mg();

    void N3();

    void N9();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void O1(String str);

    void P0(String str);

    @StateStrategyType(AddToEndSingleStrategy.class)
    void P4(hn6 hn6Var, hn6 hn6Var2, int i, int i2);

    void S1(String str);

    void W();

    void W1();

    void Y0();

    void af();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void bh(String str);

    void c4();

    void c7(String str);

    void c9();

    void e9();

    void fg();

    void ge();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void j3();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void j8(int i);

    @StateStrategyType(SkipStrategy.class)
    void k();

    void n8();

    void r1(boolean z);

    void r6();

    void showLoader();

    @StateStrategyType(SkipStrategy.class)
    void t1(d88 d88Var);

    void t4();

    void wb();

    void x7();

    void z7();

    void z9();
}
