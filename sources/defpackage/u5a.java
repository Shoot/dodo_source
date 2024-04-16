package defpackage;

import com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.b;
import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SelectDeliveryLocationResultListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "result", "", "withCandidate", "", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: u5a  reason: default package */
/* loaded from: classes2.dex */
public final class u5a {
    public static final void a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter, c.a aVar, boolean z) {
        z65.h(orderTypeSwitcherPresenter, "<this>");
        z65.h(aVar, "result");
        if (aVar instanceof c.a.C0186a) {
            if (z) {
                orderTypeSwitcherPresenter.w(new b.f(((c.a.C0186a) aVar).a()));
            }
        } else if (aVar instanceof c.a.C0187c) {
            orderTypeSwitcherPresenter.w(b.i.a);
        } else if (aVar instanceof c.a.b) {
            orderTypeSwitcherPresenter.w(new b.g(((c.a.b) aVar).a()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
