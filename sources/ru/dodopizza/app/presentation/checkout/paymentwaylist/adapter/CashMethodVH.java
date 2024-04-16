package ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.mw7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: CashMethodVH.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/CashMethodVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Ljw7;", "paymentWay", "", "isCarryoutOrRestaurant", "isSelected", "", "setPaymentWay", "Lkotlin/Function0;", "onClick", "setOnClickListener", "Landroid/view/ViewGroup;", "iconsContainer$delegate", "Lk79;", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "Landroid/view/View;", "selectionIcon$delegate", "getSelectionIcon", "()Landroid/view/View;", "selectionIcon", "Landroid/widget/TextView;", "paymentName$delegate", "getPaymentName", "()Landroid/widget/TextView;", "paymentName", "Landroid/widget/ImageView;", "paymentIcon$delegate", "getPaymentIcon", "()Landroid/widget/ImageView;", "paymentIcon", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CashMethodVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(CashMethodVH.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(CashMethodVH.class, "selectionIcon", "getSelectionIcon()Landroid/view/View;", 0)), bc9.f(new ar8(CashMethodVH.class, "paymentName", "getPaymentName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(CashMethodVH.class, "paymentIcon", "getPaymentIcon()Landroid/widget/ImageView;", 0))};
    private final k79 iconsContainer$delegate;
    private final k79 paymentIcon$delegate;
    private final k79 paymentName$delegate;
    private final k79 selectionIcon$delegate;

    /* compiled from: CashMethodVH.kt */
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
    public CashMethodVH(kzb kzbVar) {
        super(kzbVar, R.layout.payment_method_layout);
        z65.h(kzbVar, "viewInflater");
        this.iconsContainer$delegate = kb0.g(this, R.id.icons_container);
        this.selectionIcon$delegate = kb0.g(this, R.id.selected_icon);
        this.paymentName$delegate = kb0.g(this, R.id.payment_method_name);
        this.paymentIcon$delegate = kb0.g(this, R.id.payment_method_icon);
    }

    private final ViewGroup getIconsContainer() {
        return (ViewGroup) this.iconsContainer$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getPaymentIcon() {
        return (ImageView) this.paymentIcon$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getPaymentName() {
        return (TextView) this.paymentName$delegate.a(this, $$delegatedProperties[2]);
    }

    private final View getSelectionIcon() {
        return (View) this.selectionIcon$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setPaymentWay(jw7 jw7Var, boolean z, boolean z2) {
        z65.h(jw7Var, "paymentWay");
        mw7 mw7Var = mw7.a;
        Context context = this.itemView.getContext();
        z65.g(context, "getContext(...)");
        mw7.a a2 = mw7Var.a(context, jw7Var, z);
        getPaymentIcon().setImageResource(a2.a());
        getPaymentIcon().setVisibility(a2.c());
        Integer b = a2.b();
        if (b != null) {
            getPaymentIcon().setImageTintList(iu1.d(getPaymentIcon().getContext(), b.intValue()));
        } else {
            getPaymentIcon().setImageTintList(null);
        }
        getPaymentName().setText(a2.d());
        n1c.c(getIconsContainer());
        if (z2) {
            n1c.e(getIconsContainer(), getSelectionIcon());
        }
    }
}
