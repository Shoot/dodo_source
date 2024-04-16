package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import defpackage.k9a;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DeliveryAddressView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH'J\b\u0010\u0010\u001a\u00020\u0004H'¨\u0006\u0011"}, d2 = {"Lbx2;", "Lmoxy/MvpView;", "Liv0;", "changeLocationResult", "", "K9", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "deliveryLocationResult", "K2", "Gf", "La", "b", "C", "Lk9a$b;", "request", "q", "z2", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bx2  reason: default package */
/* loaded from: classes2.dex */
public interface bx2 extends MvpView {
    void C();

    void Gf();

    void K2(c.a.C0131a c0131a);

    void K9(iv0 iv0Var);

    void La();

    void b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void q(k9a.b bVar);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void z2();
}
