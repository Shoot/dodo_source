package defpackage;

import com.dodopizza.activeorder.feature.orderdetails.presentation.OrderSauceViewHolder;
import kotlin.Metadata;
/* compiled from: OrderSauceBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lki7;", "Loyb;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderSauceViewHolder;", "Ljd7;", "view", "data", "", "position", "", "f", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ki7  reason: default package */
/* loaded from: classes.dex */
public final class ki7 extends oyb<OrderSauceViewHolder, jd7> {
    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(OrderSauceViewHolder orderSauceViewHolder, jd7 jd7Var, int i) {
        z65.h(orderSauceViewHolder, "view");
        z65.h(jd7Var, "data");
        orderSauceViewHolder.setTitle(jd7Var.c());
        orderSauceViewHolder.setCount(jd7Var.a());
        orderSauceViewHolder.showImage(jd7Var.b());
    }
}
