package com.dodopizza.order.feature.checkout.presentation;

import android.view.View;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.SelectableOrderTypeView;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderReceivingTypeHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/order/feature/checkout/presentation/OrderReceivingTypeHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "isEnabled", "", "setEnabled", "isSelected", "setSelected", "", "text", "setText", "", "imageId", "setImage", "Lkotlin/Function0;", "onClick", "setClickListener", "Lcom/dodopizza/android/view/custom/SelectableOrderTypeView;", "type$delegate", "Lk79;", "getType", "()Lcom/dodopizza/android/view/custom/SelectableOrderTypeView;", MessageAttributes.TYPE, "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OrderReceivingTypeHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(OrderReceivingTypeHolder.class, MessageAttributes.TYPE, "getType()Lcom/dodopizza/android/view/custom/SelectableOrderTypeView;", 0))};
    public static final int $stable = 8;
    private final k79 type$delegate;

    /* compiled from: OrderReceivingTypeHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderReceivingTypeHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_order_receiving_type);
        z65.h(kzbVar, "viewInflater");
        this.type$delegate = kb0.g(this, gy8.order_receiving_type);
    }

    private final SelectableOrderTypeView getType() {
        return (SelectableOrderTypeView) this.type$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        oma.a(getType(), new a(function0));
    }

    public final void setEnabled(boolean z) {
        getType().setEnabled(z);
    }

    public final void setImage(int i) {
        getType().setImage(i);
    }

    public final void setSelected(boolean z) {
        getType().setSelected(z);
    }

    public final void setText(String str) {
        z65.h(str, "text");
        getType().setText(str);
    }
}
