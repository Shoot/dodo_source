package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: FoodMenuView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0007H'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H'J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH'J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0004H&J\b\u0010\u001f\u001a\u00020\u0004H&J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0017H&J\u0016\u0010'\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%H'J\u001e\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)H'J\b\u0010,\u001a\u00020\u0004H'J\b\u0010-\u001a\u00020\u0004H&J\u0010\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H&J\u0016\u00102\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H&J\u0010\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000bH'J\b\u00105\u001a\u00020\u0004H&J\b\u00106\u001a\u00020\u0004H&J\b\u00107\u001a\u00020\u0004H&J\b\u00108\u001a\u00020\u0004H&J\b\u00109\u001a\u00020\u0004H&J\b\u0010:\u001a\u00020\u0004H&J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H&J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H&J\b\u0010A\u001a\u00020\u0004H&J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0017H&J\b\u0010D\u001a\u00020\u0004H&J\b\u0010E\u001a\u00020\u0004H&J\b\u0010F\u001a\u00020\u0004H&J\b\u0010G\u001a\u00020\u0004H&J\b\u0010H\u001a\u00020\u0004H&¨\u0006I"}, d2 = {"Ls44;", "Lmoxy/MvpView;", "", "visible", "", "o8", "", "Lce0;", "data", "O3", "Ee", "", "cityName", "F0", "isError", "L", "isLoading", "ae", "Lvy4;", "inAppNotificationModel", "xb", "bonusAction", "j9", "", "menuCategoryIndex", "t9", "clickUrl", "Za", "z1", "Pf", "od", "V9", "Lnh6;", "menuVO", "md", "position", "H7", "", "imageUrls", "w5", "targetPosition", "Lkotlin/Function0;", "showAnimation", "qf", "n6", "s9", "Lnq8;", "promotionProducts", "D1", "tags", "Zc", "infoStoryId", "F", "A9", "showSearch", "M4", "Ld", "Qb", "Lc", "Lhn6;", "priceBelowMinPrice", "kg", "", "balance", "tf", "cf", "count", Image.TYPE_HIGH, "i", "Af", "p9", "eg", "k9", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s44  reason: default package */
/* loaded from: classes2.dex */
public interface s44 extends MvpView {
    void A9();

    void Af();

    void D1(nq8 nq8Var);

    void Ee();

    @StateStrategyType(SkipStrategy.class)
    void F(String str);

    void F0(String str);

    void H7(nh6 nh6Var, int i);

    @StateStrategyType(SkipStrategy.class)
    void L(boolean z);

    void Lc();

    void Ld();

    void M4();

    void O3(Collection<ce0> collection);

    void Pf();

    void Qb();

    void V9();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Za(String str);

    void Zc(Collection<String> collection);

    void ae(boolean z);

    void cf();

    void eg();

    void h(int i);

    void i();

    @StateStrategyType(SkipStrategy.class)
    void j9(ce0 ce0Var);

    void k9();

    void kg(hn6 hn6Var);

    void md(nh6 nh6Var);

    @StateStrategyType(SkipStrategy.class)
    void n6();

    void o8(boolean z);

    void od();

    void p9();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void qf(int i, Function0<Unit> function0);

    void s9();

    void showSearch();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void t9(int i);

    void tf(double d);

    @StateStrategyType(SkipStrategy.class)
    void w5(List<String> list);

    void xb(vy4 vy4Var);

    void z1();
}
