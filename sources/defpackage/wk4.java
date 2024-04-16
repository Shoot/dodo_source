package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: HalvesConstructorView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010\u0018\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0017\u001a\u00020\u0016H&J\u001e\u0010\u0019\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007H&J\b\u0010 \u001a\u00020\u0004H&J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007H&J\b\u0010%\u001a\u00020\u0004H&J\b\u0010&\u001a\u00020\u0004H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H'J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0004H'J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H&¨\u0006/"}, d2 = {"Lwk4;", "Lmoxy/MvpView;", "", "title", "", "rb", Action.NAME_ATTRIBUTE, "Lhn6;", "price", "L3", "u5", "Lxj4;", ProductEntity.TYPE_PIZZA, "", "Llm8;", "productTags", "ga", "Ab", "z5", "U2", "", "items", "Lb78;", "pizzaConcept", "ug", "Wa", "", "position", "s2", "bd", "cost", "e7", "Eg", "", "isStopped", "halvesTotalPrice", "je", "w", "showLoader", "E7", "j4", "Lwj4;", "data", "eb", "S7", "y8", "d2", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wk4  reason: default package */
/* loaded from: classes2.dex */
public interface wk4 extends MvpView {
    void Ab(xj4 xj4Var, List<lm8> list);

    void E7();

    void Eg();

    void L3(String str, hn6 hn6Var);

    void S7();

    void U2(xj4 xj4Var, List<lm8> list);

    void Wa(List<? extends Object> list, b78 b78Var);

    void bd(int i);

    void d2(hn6 hn6Var);

    void e7(hn6 hn6Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void eb(wj4 wj4Var);

    void ga(xj4 xj4Var, List<lm8> list);

    void j4();

    void je(boolean z, hn6 hn6Var);

    void rb(String str);

    void s2(int i);

    void showLoader();

    void u5(String str, hn6 hn6Var);

    void ug(List<? extends Object> list, b78 b78Var);

    void w();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void y8();

    void z5(String str, hn6 hn6Var);
}
