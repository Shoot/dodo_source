package com.dodopizza.order.feature.shoppingcart.adapter.good.combo;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboCartProductViewHolder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VB\u000f\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J4\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0014\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0014\u0010\u0015\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0014\u0010\u0016\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0006\u0010\u0017\u001a\u00020\u0004J\u0014\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0014\u0010\u001a\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012R\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001b\u0010(\u001a\u00020$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001b\u0010.\u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001b\u00103\u001a\u00020/8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001fR\u001b\u0010>\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u00107R\u001b\u0010A\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b@\u00107R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001d\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001d\u001a\u0004\bH\u00107R\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u001d\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u0002048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u00107¨\u0006W"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/good/combo/ComboCartProductViewHolder;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/CartProductViewHolder;", "", "imageUrl", "", "showImage", "clearComboProductsInfo", Action.NAME_ATTRIBUTE, "sizeAndDough", "", "addedToppings", "removedIngredients", "showComboProductsInfo", "showDisabledState", "showStop", "productsInStopName", "showStopProducts", "showCounterButton", "Lkotlin/Function0;", "changeClickListener", "setContainerChangeListener", "setChangeButtonLeft", "setChangeButtonRight", "hideChangeButtonLeft", "removeClickListener", "setRemoveButtonLeft", "setRemoveButtonRight", "Landroid/widget/TextView;", "productTitle$delegate", "Lk79;", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "stopDescription$delegate", "getStopDescription", "stopDescription", "Landroid/view/View;", "priceSector$delegate", "getPriceSector", "()Landroid/view/View;", "priceSector", "finalPrice$delegate", "getFinalPrice", "finalPrice", "rawPrice$delegate", "getRawPrice", "rawPrice", "Landroid/widget/ViewSwitcher;", "counterSwitcher$delegate", "getCounterSwitcher", "()Landroid/widget/ViewSwitcher;", "counterSwitcher", "Landroid/widget/Button;", "minusCounterButton$delegate", "getMinusCounterButton", "()Landroid/widget/Button;", "minusCounterButton", "counterLabel$delegate", "getCounterLabel", "counterLabel", "plusCounterButton$delegate", "getPlusCounterButton", "plusCounterButton", "leftActionButton$delegate", "getLeftActionButton", "leftActionButton", "Landroid/widget/ImageView;", "productImage$delegate", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "rightActionButton$delegate", "getRightActionButton", "rightActionButton", "Landroid/widget/LinearLayout;", "comboProductsInfoContainer$delegate", "getComboProductsInfoContainer", "()Landroid/widget/LinearLayout;", "comboProductsInfoContainer", "getRemoveButton", "removeButton", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ComboCartProductViewHolder extends CartProductViewHolder {
    private static final float HALF_ALPHA = 0.5f;
    private final k79 comboProductsInfoContainer$delegate;
    private final k79 counterLabel$delegate;
    private final k79 counterSwitcher$delegate;
    private final k79 finalPrice$delegate;
    private final k79 leftActionButton$delegate;
    private final k79 minusCounterButton$delegate;
    private final k79 plusCounterButton$delegate;
    private final k79 priceSector$delegate;
    private final k79 productImage$delegate;
    private final k79 productTitle$delegate;
    private final k79 rawPrice$delegate;
    private final k79 rightActionButton$delegate;
    private final k79 stopDescription$delegate;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ComboCartProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "stopDescription", "getStopDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "priceSector", "getPriceSector()Landroid/view/View;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "finalPrice", "getFinalPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "rawPrice", "getRawPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "counterSwitcher", "getCounterSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "minusCounterButton", "getMinusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "counterLabel", "getCounterLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "plusCounterButton", "getPlusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "leftActionButton", "getLeftActionButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "rightActionButton", "getRightActionButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ComboCartProductViewHolder.class, "comboProductsInfoContainer", "getComboProductsInfoContainer()Landroid/widget/LinearLayout;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: ComboCartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/good/combo/ComboCartProductViewHolder$a;", "", "", "HALF_ALPHA", "F", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ComboCartProductViewHolder.kt */
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

    /* compiled from: ComboCartProductViewHolder.kt */
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

    /* compiled from: ComboCartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0) {
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

    /* compiled from: ComboCartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0) {
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

    /* compiled from: ComboCartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function0<Unit> function0) {
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
    public ComboCartProductViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.shopping_cart_combo_product_item);
        z65.h(kzbVar, "viewInflater");
        this.productTitle$delegate = kb0.g(this, gy8.shopping_product_combo_title);
        this.stopDescription$delegate = kb0.g(this, gy8.shopping_product_combo_stop);
        this.priceSector$delegate = kb0.g(this, gy8.shopping_product_combo_price_sector);
        this.finalPrice$delegate = kb0.g(this, gy8.shopping_product_combo_price);
        this.rawPrice$delegate = kb0.g(this, gy8.shopping_product_combo_discount_price);
        this.counterSwitcher$delegate = kb0.g(this, gy8.shopping_cart_counter_button_switcher);
        this.minusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_minus_counter_button);
        this.counterLabel$delegate = kb0.g(this, gy8.shopping_cart_counter_label);
        this.plusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_plus_counter_button);
        this.leftActionButton$delegate = kb0.g(this, gy8.left_action_button);
        this.productImage$delegate = kb0.g(this, gy8.shopping_product_combo_image);
        this.rightActionButton$delegate = kb0.g(this, gy8.right_action_button);
        this.comboProductsInfoContainer$delegate = kb0.g(this, gy8.combo_products_info_container);
    }

    private final LinearLayout getComboProductsInfoContainer() {
        return (LinearLayout) this.comboProductsInfoContainer$delegate.a(this, $$delegatedProperties[12]);
    }

    private final Button getLeftActionButton() {
        return (Button) this.leftActionButton$delegate.a(this, $$delegatedProperties[9]);
    }

    private final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[10]);
    }

    private final Button getRightActionButton() {
        return (Button) this.rightActionButton$delegate.a(this, $$delegatedProperties[11]);
    }

    public final void clearComboProductsInfo() {
        getComboProductsInfoContainer().removeAllViews();
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getCounterLabel() {
        return (TextView) this.counterLabel$delegate.a(this, $$delegatedProperties[7]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected ViewSwitcher getCounterSwitcher() {
        return (ViewSwitcher) this.counterSwitcher$delegate.a(this, $$delegatedProperties[5]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getFinalPrice() {
        return (TextView) this.finalPrice$delegate.a(this, $$delegatedProperties[3]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected Button getMinusCounterButton() {
        return (Button) this.minusCounterButton$delegate.a(this, $$delegatedProperties[6]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected Button getPlusCounterButton() {
        return (Button) this.plusCounterButton$delegate.a(this, $$delegatedProperties[8]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected View getPriceSector() {
        return (View) this.priceSector$delegate.a(this, $$delegatedProperties[2]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getProductTitle() {
        return (TextView) this.productTitle$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getRawPrice() {
        return (TextView) this.rawPrice$delegate.a(this, $$delegatedProperties[4]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected Button getRemoveButton() {
        throw new k07("An operation is not implemented: Not yet implemented");
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getStopDescription() {
        return (TextView) this.stopDescription$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void hideChangeButtonLeft() {
        getLeftActionButton().setVisibility(8);
    }

    public final void setChangeButtonLeft(Function0<Unit> function0) {
        z65.h(function0, "changeClickListener");
        getLeftActionButton().setVisibility(0);
        getLeftActionButton().setText(r09.btn_change_combo_title);
        getLeftActionButton().setTextColor(iu1.c(getLeftActionButton().getContext(), ew8.textIconAccentColor));
        oma.a(getLeftActionButton(), new b(function0));
    }

    public final void setChangeButtonRight(Function0<Unit> function0) {
        z65.h(function0, "changeClickListener");
        getLeftActionButton().setVisibility(0);
        getRightActionButton().setText(r09.btn_change_combo_title);
        getRightActionButton().setTextColor(iu1.c(getLeftActionButton().getContext(), ew8.textIconAccentColor));
        getCounterSwitcher().setDisplayedChild(1);
        getCounterSwitcher().setBackgroundTintList(iu1.d(getCounterSwitcher().getContext(), ew8.t));
        oma.a(getRightActionButton(), new c(function0));
    }

    public final void setContainerChangeListener(Function0<Unit> function0) {
        z65.h(function0, "changeClickListener");
        oma.a(getComboProductsInfoContainer(), new d(function0));
    }

    public final void setRemoveButtonLeft(Function0<Unit> function0) {
        z65.h(function0, "removeClickListener");
        getLeftActionButton().setText(r09.Y1);
        getLeftActionButton().setTextColor(iu1.c(getLeftActionButton().getContext(), ew8.B));
        oma.a(getLeftActionButton(), new e(function0));
    }

    public final void setRemoveButtonRight(Function0<Unit> function0) {
        z65.h(function0, "removeClickListener");
        getRightActionButton().setText(r09.Y1);
        getRightActionButton().setTextColor(iu1.c(getLeftActionButton().getContext(), ew8.textIconAccentColor));
        getCounterSwitcher().setDisplayedChild(1);
        getCounterSwitcher().setBackgroundTintList(iu1.d(getCounterSwitcher().getContext(), ew8.t));
        oma.a(getRightActionButton(), new f(function0));
    }

    public final void showComboProductsInfo(String str, String str2, List<String> list, List<String> list2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "addedToppings");
        z65.h(list2, "removedIngredients");
        Context context = getComboProductsInfoContainer().getContext();
        z65.g(context, "getContext(...)");
        bi1 bi1Var = new bi1(context, null, 0, 6, null);
        bi1Var.setName(str);
        if (str2 != null && str2.length() != 0) {
            bi1Var.b();
            bi1Var.setSizeAndDough(str2);
        }
        if (!list.isEmpty()) {
            bi1Var.c();
            bi1Var.setToppings(list);
        }
        if (!list2.isEmpty()) {
            bi1Var.a();
            bi1Var.setRemovedIngredients(list2);
        }
        getComboProductsInfoContainer().addView(bi1Var);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    public void showCounterButton() {
        super.showCounterButton();
        getCounterSwitcher().setBackgroundTintList(iu1.d(getCounterSwitcher().getContext(), ew8.w));
    }

    public final void showDisabledState() {
        getProductTitle().setAlpha(0.5f);
        getProductImage().setAlpha(0.5f);
    }

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getProductImage()).t(str).d().a0(bx8.L).G0(getProductImage());
    }

    public final void showStop() {
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(r09.cart_item_combo_in_stop));
    }

    public final void showStopProducts(String str) {
        z65.h(str, "productsInStopName");
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(r09.cart_item_component_in_stop, str));
    }
}
