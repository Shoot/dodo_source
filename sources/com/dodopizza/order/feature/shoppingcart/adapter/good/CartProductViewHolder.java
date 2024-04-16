package com.dodopizza.order.feature.shoppingcart.adapter.good;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: CartProductViewHolder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0001\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0014\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0014\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u0014\u0010\u001b\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011R\u0014\u0010\u001f\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8$X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010)\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0014\u0010-\u001a\u00020*8$X¤\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0014\u00105\u001a\u00020.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00100¨\u0006>"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/good/CartProductViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setTitle", "hideStop", "showPriceSector", "hidePriceSector", "price", "setFinalPrice", "showRawPrice", "hideRawPrice", "showCounterButton", "showRemoveButton", "enableMinusCounter", "disableMinusCounter", "Lkotlin/Function0;", "minusClickListener", "setOnMinusCounterClickListener", "count", "setCounter", "enablePlusCounter", "disablePlusCounter", "plusClickListener", "setOnPlusCounterClickListener", "removeClickListener", "setOnRemoveClickListener", "Landroid/widget/TextView;", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "getStopDescription", "stopDescription", "Landroid/view/View;", "getPriceSector", "()Landroid/view/View;", "priceSector", "getFinalPrice", "finalPrice", "getRawPrice", "rawPrice", "Landroid/widget/ViewSwitcher;", "getCounterSwitcher", "()Landroid/widget/ViewSwitcher;", "counterSwitcher", "Landroid/widget/Button;", "getMinusCounterButton", "()Landroid/widget/Button;", "minusCounterButton", "getCounterLabel", "counterLabel", "getPlusCounterButton", "plusCounterButton", "getRemoveButton", "removeButton", "Lkzb;", "viewInflater", "", "viewLayoutId", "<init>", "(Lkzb;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class CartProductViewHolder extends SelfInflatingViewHolder {
    public static final int $stable = 0;

    /* compiled from: CartProductViewHolder.kt */
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

    /* compiled from: CartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
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

    /* compiled from: CartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
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
    public CartProductViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
    }

    public final void disableMinusCounter() {
        getMinusCounterButton().setEnabled(false);
    }

    public final void disablePlusCounter() {
        getPlusCounterButton().setEnabled(false);
    }

    public final void enableMinusCounter() {
        getMinusCounterButton().setEnabled(true);
    }

    public final void enablePlusCounter() {
        getPlusCounterButton().setEnabled(true);
    }

    protected abstract TextView getCounterLabel();

    protected abstract ViewSwitcher getCounterSwitcher();

    protected abstract TextView getFinalPrice();

    protected abstract Button getMinusCounterButton();

    protected abstract Button getPlusCounterButton();

    protected abstract View getPriceSector();

    protected abstract TextView getProductTitle();

    protected abstract TextView getRawPrice();

    protected abstract Button getRemoveButton();

    protected abstract TextView getStopDescription();

    public final void hidePriceSector() {
        un3.e(getPriceSector());
    }

    public final void hideRawPrice() {
        un3.e(getRawPrice());
    }

    public final void hideStop() {
        un3.e(getStopDescription());
    }

    public final void setCounter(String str) {
        z65.h(str, "count");
        getCounterLabel().setText(str);
    }

    public final void setFinalPrice(String str) {
        z65.h(str, "price");
        getFinalPrice().setText(str);
    }

    public final void setOnMinusCounterClickListener(Function0<Unit> function0) {
        z65.h(function0, "minusClickListener");
        oma.a(getMinusCounterButton(), new a(function0));
    }

    public final void setOnPlusCounterClickListener(Function0<Unit> function0) {
        z65.h(function0, "plusClickListener");
        oma.a(getPlusCounterButton(), new b(function0));
    }

    public final void setOnRemoveClickListener(Function0<Unit> function0) {
        z65.h(function0, "removeClickListener");
        oma.a(getRemoveButton(), new c(function0));
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getProductTitle().setText(str);
    }

    public void showCounterButton() {
        getCounterSwitcher().setDisplayedChild(0);
    }

    public final void showPriceSector() {
        un3.k(getPriceSector());
    }

    public final void showRawPrice(String str) {
        z65.h(str, "price");
        un3.k(getRawPrice());
        getRawPrice().setText(str);
        gdb.a.a(getRawPrice());
    }

    public final void showRemoveButton() {
        getCounterSwitcher().setDisplayedChild(1);
    }
}
