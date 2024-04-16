package defpackage;

import com.dodopizza.order.feature.checkout.presentation.OrderReceivingTypeHolder;
import com.huawei.hms.opendevice.c;
import defpackage.ei7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: OrderReceivingTypeBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0014"}, d2 = {"Ldi7;", "Loyb;", "Lcom/dodopizza/order/feature/checkout/presentation/OrderReceivingTypeHolder;", "Lei7;", "view", "data", "", "position", "", "f", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "onPickUpClick", "b", "onTakeawayClick", c.a, "onDeliveryToTableClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: di7  reason: default package */
/* loaded from: classes2.dex */
public final class di7 extends oyb<OrderReceivingTypeHolder, ei7> {
    private final Function0<Unit> a;
    private final Function0<Unit> b;
    private final Function0<Unit> c;

    public di7(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        z65.h(function0, "onPickUpClick");
        z65.h(function02, "onTakeawayClick");
        z65.h(function03, "onDeliveryToTableClick");
        this.a = function0;
        this.b = function02;
        this.c = function03;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(OrderReceivingTypeHolder orderReceivingTypeHolder, ei7 ei7Var, int i) {
        z65.h(orderReceivingTypeHolder, "view");
        z65.h(ei7Var, "data");
        orderReceivingTypeHolder.setSelected(ei7Var.g());
        if (ei7Var instanceof ei7.b) {
            orderReceivingTypeHolder.setText(jzb.a(orderReceivingTypeHolder, r09.order_receiving_type_dine_in));
            orderReceivingTypeHolder.setImage(bx8.ic_cashier_large);
            orderReceivingTypeHolder.setClickListener(this.a);
        } else if (ei7Var instanceof ei7.c) {
            orderReceivingTypeHolder.setText(jzb.a(orderReceivingTypeHolder, r09.order_receiving_type_takeaway));
            orderReceivingTypeHolder.setImage(bx8.ic_takeaway_large);
            orderReceivingTypeHolder.setClickListener(this.b);
        } else if (ei7Var instanceof ei7.a) {
            orderReceivingTypeHolder.setImage(bx8.ic_delivery_to_table_large);
            orderReceivingTypeHolder.setClickListener(this.c);
            String a = jzb.a(orderReceivingTypeHolder, r09.order_receiving_type_table_delivery);
            ei7.a aVar = (ei7.a) ei7Var;
            if (aVar instanceof ei7.a.C0304a) {
                orderReceivingTypeHolder.setText(a);
            } else if (aVar instanceof ei7.a.b) {
                int a2 = ((ei7.a.b) ei7Var).a();
                orderReceivingTypeHolder.setText(a + " " + a2);
            }
        }
    }
}
