package ru.dodopizza.app.presentation.profile.adapter.activeorder;

import android.view.View;
import android.widget.TextView;
import com.dodopizza.activeorder.feature.orderstate.presentation.OrderStateView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: ActiveOrderViewHolder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J#\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0005J\u0014\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lru/dodopizza/app/presentation/profile/adapter/activeorder/ActiveOrderViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "resId", "formatArgs", "", "setOrderNumber", "Lahb;", "timerFormatter", "setTimerFormatter", "", "timeRemain", "setTimer", "hideAdditionalInfo", "titleRes", "", "", "timeArgs", "setTitle", "(I[Ljava/lang/String;)V", "subTitleRes", "setSubTitle", "value", "total", "setProgress", "setCheckMark", "Lkotlin/Function0;", "listener", "setOnClickListener", "Landroid/widget/TextView;", "orderNumber$delegate", "Lk79;", "getOrderNumber", "()Landroid/widget/TextView;", "orderNumber", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "orderStateView$delegate", "getOrderStateView", "()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "orderStateView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ActiveOrderViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ActiveOrderViewHolder.class, "orderNumber", "getOrderNumber()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ActiveOrderViewHolder.class, "orderStateView", "getOrderStateView()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", 0))};
    private final k79 orderNumber$delegate;
    private final k79 orderStateView$delegate;

    /* compiled from: ActiveOrderViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
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
    public ActiveOrderViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_active_order);
        z65.h(kzbVar, "viewInflater");
        this.orderNumber$delegate = kb0.g(this, R.id.order_number);
        this.orderStateView$delegate = kb0.g(this, R.id.order_state);
    }

    private final TextView getOrderNumber() {
        return (TextView) this.orderNumber$delegate.a(this, $$delegatedProperties[0]);
    }

    private final OrderStateView getOrderStateView() {
        return (OrderStateView) this.orderStateView$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void hideAdditionalInfo() {
        getOrderStateView().e();
    }

    public final void setCheckMark() {
        getOrderStateView().g();
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setOrderNumber(int i, int i2) {
        getOrderNumber().setText(this.itemView.getResources().getString(i, Integer.valueOf(i2)));
    }

    public final void setProgress(int i, int i2) {
        getOrderStateView().f(i, i2);
    }

    public final void setSubTitle(int i) {
        OrderStateView orderStateView = getOrderStateView();
        String string = this.itemView.getResources().getString(i);
        z65.g(string, "getString(...)");
        orderStateView.setSubTitle(string);
    }

    public final void setTimer(long j) {
        getOrderStateView().setTimer(j);
    }

    public final void setTimerFormatter(ahb ahbVar) {
        z65.h(ahbVar, "timerFormatter");
        getOrderStateView().setTimerFormatter(ahbVar);
    }

    public final void setTitle(int i, String[] strArr) {
        z65.h(strArr, "timeArgs");
        OrderStateView orderStateView = getOrderStateView();
        String string = this.itemView.getResources().getString(i, Arrays.copyOf(strArr, strArr.length));
        z65.g(string, "getString(...)");
        orderStateView.setTitle(string);
    }
}
