package defpackage;

import java.util.Collection;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: RemoveIngredientsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u000e"}, d2 = {"Lzd9;", "Lmoxy/MvpView;", "Lvl8;", "ingredient", "", "K0", "Gb", "i8", "close", "Qd", "", "", "removedIngredientsIds", "Kf", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zd9  reason: default package */
/* loaded from: classes2.dex */
public interface zd9 extends MvpView {
    void Gb();

    void K0(vl8 vl8Var);

    void Kf(Collection<String> collection);

    void Qd();

    void close();

    void i8();
}
