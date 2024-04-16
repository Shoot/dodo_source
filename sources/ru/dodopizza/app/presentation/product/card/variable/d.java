package ru.dodopizza.app.presentation.product.card.variable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter;
/* compiled from: VariableProductCardView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u001c\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH&J2\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH&J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH&J\b\u0010\u0016\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0004H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH&J\u001e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eH&J\b\u0010\u001e\u001a\u00020\u0004H&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J \u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H&J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H&J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H&J\b\u0010/\u001a\u00020\u0004H&J\b\u00100\u001a\u00020\u0004H&J\b\u00101\u001a\u00020\u0004H&¨\u00062"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/d;", "Ljl8;", "Laxb;", "variableProductCardVO", "", "E5", "Qa", "", "sizeGroup", "ob", "", "", "names", "H0", "", "availableSize", "discountForSize", "stopSize", "Q", "Ljjb;", "toppingsVO", "C0", "O", "t", "description", "W4", "menuItemId", "Lvl8;", "ingredients", "T", "m0", "Lhn6;", "price", "i0", "rawPrice", "Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter$a;", "textOnButton", "Ua", "E9", "p", "N", "", "isEnabled", "I", "", "timeRemain", "x", "G0", "E", "w3", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface d extends jl8 {
    void C0(List<jjb> list);

    void E();

    void E5(axb axbVar);

    void E9(hn6 hn6Var, VariableProductCardPresenter.a aVar);

    void G0();

    void H0(Map<Integer, String> map);

    void I(boolean z);

    void N();

    void O();

    void Q(List<Integer> list, List<Integer> list2, List<Integer> list3);

    void Qa(axb axbVar);

    void T(String str, List<vl8> list);

    void Ua(hn6 hn6Var, hn6 hn6Var2, VariableProductCardPresenter.a aVar);

    void W4(String str);

    void i0(hn6 hn6Var);

    void m0();

    void ob(int i);

    void p();

    void t();

    void w3();

    void x(long j);
}
