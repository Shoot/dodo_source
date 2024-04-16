package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: ShoppingCartView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0004H'J\b\u0010\u001a\u001a\u00020\u0004H&J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&J,\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u001c2\b\b\u0001\u0010\"\u001a\u00020\u001cH&J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u0004H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002H&J,\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u001c2\b\b\u0001\u0010\"\u001a\u00020\u001cH&J\b\u0010(\u001a\u00020\u0004H'J\b\u0010)\u001a\u00020\u0004H'J\b\u0010*\u001a\u00020\u0004H'J\b\u0010+\u001a\u00020\u0004H'J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H&J\b\u0010/\u001a\u00020\u0004H&J\b\u00100\u001a\u00020\u0004H&J\u0010\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H&J\b\u00104\u001a\u00020\u0004H&J\b\u00105\u001a\u00020\u0004H&J\u0010\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H&J\b\u00109\u001a\u00020\u0004H&J\b\u0010:\u001a\u00020\u0004H&J\b\u0010;\u001a\u00020\u0004H&J\b\u0010<\u001a\u00020\u0004H&J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0002H&J\b\u0010?\u001a\u00020\u0004H&J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020,H&J\b\u0010B\u001a\u00020\u0004H&J\b\u0010C\u001a\u00020\u0004H&J\b\u0010D\u001a\u00020\u0004H&J(\u0010J\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020HH'J\b\u0010M\u001a\u00020\u0004H'J\u0010\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020,H&J\b\u0010P\u001a\u00020\u0004H'J\b\u0010Q\u001a\u00020\u0004H'J\b\u0010R\u001a\u00020\u0004H'J\b\u0010S\u001a\u00020\u0004H'J\b\u0010T\u001a\u00020\u0004H&J\b\u0010U\u001a\u00020\u0004H&J\b\u0010V\u001a\u00020\u0004H&J\u0016\u0010Y\u001a\u00020\u00042\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\bH&¨\u0006Z"}, d2 = {"Loja;", "Lmoxy/MvpView;", "Lhn6;", "total", "", "L0", "priceBelowMinDeliveryPrice", "dg", "", "Lor0;", "productVOs", "Wb", "showProgressBar", "se", "xc", "Lf", "Lce0;", "discountInfo", "T1", "Lop8;", "promoCode", "J6", "Lw18;", "personalPromoAction", "Z6", "S", "o0", "minDeliveryCost", "", "textTemplateResId", "Yg", "previousMinDeliveryPrice", "minDeliveryPrice", "highlightEndColor", "textTemplateStringId", "X2", "Je", "R8", "R3", "ld", "xg", "h8", "Eb", "C6", "", "containsGoods", "S4", "G5", "n0", "Llja;", "shoppingCartVO", "P6", "B5", "r5", "", "rewardSum", "oe", "v1", "Z2", "J", "Da", "deliveryFee", "e3", "yd", "alwaysFreeDelivery", "i4", "kc", "T4", "O9", "Llk8;", "prizotekaVO", "levelIndex", "", "progressDescription", "z8", "infoStoryId", "F", "Id", "visible", "w1", "ff", "Va", "L6", "Td", "e4", "s1", "da", "Llq3;", "levels", "He", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oja  reason: default package */
/* loaded from: classes2.dex */
public interface oja extends MvpView {
    void B5();

    @StateStrategyType(SkipStrategy.class)
    void C6();

    void Da();

    @StateStrategyType(SkipStrategy.class)
    void Eb();

    @StateStrategyType(SkipStrategy.class)
    void F(String str);

    void G5();

    void He(List<lq3> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Id();

    void J();

    void J6(op8 op8Var);

    void Je();

    void L0(hn6 hn6Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void L6();

    @StateStrategyType(SkipStrategy.class)
    void Lf();

    void O9();

    void P6(lja ljaVar);

    void R3(hn6 hn6Var);

    void R8();

    @StateStrategyType(SkipStrategy.class)
    void S();

    void S4(boolean z);

    @StateStrategyType(SkipStrategy.class)
    void T1(ce0 ce0Var);

    void T4();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Td();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Va();

    void Wb(List<? extends or0> list);

    void X2(hn6 hn6Var, hn6 hn6Var2, int i, int i2);

    void Yg(hn6 hn6Var, int i);

    void Z2();

    void Z6(w18 w18Var);

    void da();

    void dg(hn6 hn6Var);

    void e3(hn6 hn6Var);

    void e4();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void ff();

    @StateStrategyType(SkipStrategy.class)
    void h8();

    void i4(boolean z);

    void kc();

    void ld(hn6 hn6Var, hn6 hn6Var2, int i, int i2);

    void n0();

    void o0();

    void oe(long j);

    void r5();

    void s1();

    void se();

    void showProgressBar();

    void v1();

    void w1(boolean z);

    void xc();

    @StateStrategyType(SkipStrategy.class)
    void xg();

    void yd();

    void z8(lk8 lk8Var, int i, String str, hn6 hn6Var);
}
