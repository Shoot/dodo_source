package defpackage;

import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryGoodViewHolder;
import kotlin.Metadata;
/* compiled from: OrderSummaryGoodBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Llj7;", "Loyb;", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryGoodViewHolder;", "Leg7;", "data", "", "g", "view", "", "position", "f", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lj7  reason: default package */
/* loaded from: classes.dex */
public final class lj7 extends oyb<OrderSummaryGoodViewHolder, eg7> {
    private final void g(OrderSummaryGoodViewHolder orderSummaryGoodViewHolder, eg7 eg7Var) {
        if (eg7Var.b() == nb6.g) {
            orderSummaryGoodViewHolder.showPortion(eg7Var.f());
        } else if (eg7Var.b() != nb6.h) {
            orderSummaryGoodViewHolder.showProductSize(eg7Var.f(), eg7Var.b());
        } else {
            orderSummaryGoodViewHolder.hideProductSize();
        }
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(OrderSummaryGoodViewHolder orderSummaryGoodViewHolder, eg7 eg7Var, int i) {
        Object Z;
        Object k0;
        z65.h(orderSummaryGoodViewHolder, "view");
        z65.h(eg7Var, "data");
        orderSummaryGoodViewHolder.setTitle(eg7Var);
        if (eg7Var.e() == kl8.b) {
            orderSummaryGoodViewHolder.setSizeTitle(eg7Var.g());
        } else {
            g(orderSummaryGoodViewHolder, eg7Var);
        }
        if (eg7Var.i()) {
            orderSummaryGoodViewHolder.showComboLabel();
        } else {
            orderSummaryGoodViewHolder.hideComboLabel();
        }
        if (eg7Var.d().isEmpty()) {
            orderSummaryGoodViewHolder.showSingleImage(eg7Var.a());
            return;
        }
        orderSummaryGoodViewHolder.prepareImageView(eg7Var.c());
        Z = sc1.Z(eg7Var.d());
        k0 = sc1.k0(eg7Var.d());
        orderSummaryGoodViewHolder.showDoubleImage((String) Z, (String) k0);
    }
}
