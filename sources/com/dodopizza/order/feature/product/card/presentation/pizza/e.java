package com.dodopizza.order.feature.product.card.presentation.pizza;

import com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: PizzaProductCardView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001c\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u001c\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH&J2\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H&J2\u0010\u001b\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\u0016\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013H&J\b\u0010!\u001a\u00020\u0004H&J\b\u0010\"\u001a\u00020\u0004H&J$\u0010'\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0#H&J\u001e\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0013H'J\b\u0010,\u001a\u00020\u0004H&J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H&J \u00103\u001a\u00020\u00042\u0006\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u00102\u001a\u000201H&J\u0018\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u00102\u001a\u000201H&J\b\u00105\u001a\u00020\u0004H&J\b\u00106\u001a\u00020\u0004H&J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207H&J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H&J\b\u0010=\u001a\u00020\u0004H&J\b\u0010>\u001a\u00020\u0004H&J\u0016\u0010?\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H&J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\nH&J\b\u0010B\u001a\u00020\u0004H&J\b\u0010C\u001a\u00020\u0004H'¨\u0006D"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/e;", "Ljl8;", "Lx78;", "pizzaProductCardVO", "", "pa", "Lb78;", "pizzaConcept", "T0", "Vd", "", "sizeGroup", "dough", "ch", "", "", "names", "H0", "Ed", "", "availableSize", "discountForSize", "stopSize", "Q", "availableDough", "discountForDough", "stopDough", "t7", "va", "na", "Lkjb;", "toppingsVO", "C0", "O", "t", "", "Lul8;", "productIngredients", "removedIngredientsIds", "J5", "menuItemId", "Lvl8;", "ingredients", "T", "m0", "Lhn6;", "price", "i0", "rawPrice", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter$a;", "textOnButton", "n3", "X4", "p", "N", "", "isEnabled", "I", "", "timeRemain", "x", "G0", "E", "Xa", "sizeId", "R1", "Lg", "Ub", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface e extends jl8 {
    void C0(List<kjb> list);

    void E();

    void Ed(Map<Integer, String> map);

    void G0();

    void H0(Map<Integer, String> map);

    void I(boolean z);

    void J5(Collection<ul8> collection, Collection<String> collection2);

    void Lg();

    void N();

    void O();

    void Q(List<Integer> list, List<Integer> list2, List<Integer> list3);

    void R1(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void T(String str, List<vl8> list);

    void T0(b78 b78Var);

    @StateStrategyType(SkipStrategy.class)
    void Ub();

    void Vd(x78 x78Var);

    void X4(hn6 hn6Var, PizzaProductCardPresenter.a aVar);

    void Xa(List<Integer> list);

    void ch(int i, int i2);

    void i0(hn6 hn6Var);

    void m0();

    void n3(hn6 hn6Var, hn6 hn6Var2, PizzaProductCardPresenter.a aVar);

    void na();

    void p();

    void pa(x78 x78Var);

    void t();

    void t7(List<Integer> list, List<Integer> list2, List<Integer> list3);

    void va();

    void x(long j);
}
