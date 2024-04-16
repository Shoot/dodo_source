package ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.mw7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.PaymentMethodVH;
/* compiled from: PaymentMethodVH.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u0006\u0010\f\u001a\u00020\u0007J\u001a\u0010\u000f\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0007R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010#R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u00105¨\u0006;"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/PaymentMethodVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Ljw7;", "paymentWay", "", "isCarryoutOrRestaurant", "isSelected", "", "setPaymentWay", "Lkotlin/Function0;", "onClick", "setOnClickListener", "showCheckbox", "Lkotlin/Function1;", "onChecked", "setOnCheckedListener", "isChecked", "setChecked", "isCheckboxEnabled", "setCheckboxEnabled", "hideSavingCardOption", "Landroid/widget/CheckBox;", "checkbox$delegate", "Lk79;", "getCheckbox", "()Landroid/widget/CheckBox;", "checkbox", "Landroid/view/ViewGroup;", "iconsContainer$delegate", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "Landroid/view/View;", "selectionIcon$delegate", "getSelectionIcon", "()Landroid/view/View;", "selectionIcon", "Landroid/widget/TextView;", "paymentName$delegate", "getPaymentName", "()Landroid/widget/TextView;", "paymentName", "Landroid/widget/ImageView;", "paymentIcon$delegate", "getPaymentIcon", "()Landroid/widget/ImageView;", "paymentIcon", "divider$delegate", "getDivider", "divider", "Landroidx/appcompat/widget/SwitchCompat;", "saveRecurrentSwitcher$delegate", "getSaveRecurrentSwitcher", "()Landroidx/appcompat/widget/SwitchCompat;", "saveRecurrentSwitcher", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class PaymentMethodVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PaymentMethodVH.class, "checkbox", "getCheckbox()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "selectionIcon", "getSelectionIcon()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "paymentName", "getPaymentName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "paymentIcon", "getPaymentIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "divider", "getDivider()Landroid/view/View;", 0)), bc9.f(new ar8(PaymentMethodVH.class, "saveRecurrentSwitcher", "getSaveRecurrentSwitcher()Landroidx/appcompat/widget/SwitchCompat;", 0))};
    private final k79 checkbox$delegate;
    private final k79 divider$delegate;
    private final k79 iconsContainer$delegate;
    private final k79 paymentIcon$delegate;
    private final k79 paymentName$delegate;
    private final k79 saveRecurrentSwitcher$delegate;
    private final k79 selectionIcon$delegate;

    /* compiled from: PaymentMethodVH.kt */
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
    public PaymentMethodVH(kzb kzbVar) {
        super(kzbVar, R.layout.payment_method_layout);
        z65.h(kzbVar, "viewInflater");
        this.checkbox$delegate = kb0.g(this, R.id.checkbox);
        this.iconsContainer$delegate = kb0.g(this, R.id.icons_container);
        this.selectionIcon$delegate = kb0.g(this, R.id.selected_icon);
        this.paymentName$delegate = kb0.g(this, R.id.payment_method_name);
        this.paymentIcon$delegate = kb0.g(this, R.id.payment_method_icon);
        this.divider$delegate = kb0.g(this, R.id.payment_method_divider);
        this.saveRecurrentSwitcher$delegate = kb0.g(this, R.id.save_recurrent_switcher);
    }

    private final CheckBox getCheckbox() {
        return (CheckBox) this.checkbox$delegate.a(this, $$delegatedProperties[0]);
    }

    private final View getDivider() {
        return (View) this.divider$delegate.a(this, $$delegatedProperties[5]);
    }

    private final ViewGroup getIconsContainer() {
        return (ViewGroup) this.iconsContainer$delegate.a(this, $$delegatedProperties[1]);
    }

    private final ImageView getPaymentIcon() {
        return (ImageView) this.paymentIcon$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getPaymentName() {
        return (TextView) this.paymentName$delegate.a(this, $$delegatedProperties[3]);
    }

    private final SwitchCompat getSaveRecurrentSwitcher() {
        return (SwitchCompat) this.saveRecurrentSwitcher$delegate.a(this, $$delegatedProperties[6]);
    }

    private final View getSelectionIcon() {
        return (View) this.selectionIcon$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedListener$lambda$0(Function1 function1, CompoundButton compoundButton, boolean z) {
        z65.h(function1, "$onChecked");
        function1.invoke(Boolean.valueOf(z));
    }

    public final void hideSavingCardOption() {
        un3.e(getDivider());
        un3.e(getSaveRecurrentSwitcher());
    }

    public final void setCheckboxEnabled(boolean z) {
        getCheckbox().setEnabled(z);
    }

    public final void setChecked(boolean z) {
        getCheckbox().setChecked(z);
    }

    public final void setOnCheckedListener(final Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "onChecked");
        getCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: eu7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PaymentMethodVH.setOnCheckedListener$lambda$0(Function1.this, compoundButton, z);
            }
        });
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
        getPaymentName().setText(a2.d());
        getPaymentIcon().setImageResource(a2.a());
        getPaymentIcon().setVisibility(a2.c());
        Integer b = a2.b();
        if (b != null) {
            getPaymentIcon().setImageTintList(iu1.d(getPaymentIcon().getContext(), b.intValue()));
        } else {
            getPaymentIcon().setImageTintList(null);
        }
        n1c.c(getIconsContainer());
        if (z2) {
            n1c.e(getIconsContainer(), getSelectionIcon());
        }
    }

    public final void showCheckbox() {
        n1c.e(getIconsContainer(), getCheckbox());
    }
}
