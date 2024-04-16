package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: BuyMoreView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Ljj0;", "Lmoxy/MvpView;", "", "Lwi0;", "items", "", "c1", "Lhn6;", "price", "J0", "Ca", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jj0  reason: default package */
/* loaded from: classes4.dex */
public interface jj0 extends MvpView {
    void Ca();

    void J0(hn6 hn6Var);

    void c1(List<wi0> list);
}
