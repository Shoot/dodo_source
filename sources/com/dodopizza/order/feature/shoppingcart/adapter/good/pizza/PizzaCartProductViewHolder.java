package com.dodopizza.order.feature.shoppingcart.adapter.good.pizza;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder;
import com.dodopizza.order.feature.shoppingcart.view.CartPersonalPriceBadgeView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PizzaCartProductViewHolder.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0014\u0010$\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"J\u0014\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\"J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'J\u0006\u0010*\u001a\u00020\u0004J\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020'J\u0016\u00101\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002J$\u00105\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\"J\u0006\u00106\u001a\u00020\u0004R\u001b\u0010<\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u001b\u0010D\u001a\u00020@8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010;R\u001b\u0010J\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bI\u0010;R\u001b\u0010O\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bR\u0010SR\u001b\u0010W\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bV\u0010;R\u001b\u0010Z\u001a\u00020P8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bX\u00109\u001a\u0004\bY\u0010SR\u001b\u0010]\u001a\u00020P8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\b\\\u0010SR\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u00109\u001a\u0004\b`\u0010aR\u001b\u0010e\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u00109\u001a\u0004\bd\u0010CR\u001b\u0010h\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u00109\u001a\u0004\bg\u0010;R\u001b\u0010k\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00109\u001a\u0004\bj\u0010;R\u001b\u0010n\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u00109\u001a\u0004\bm\u0010;R\u001b\u0010q\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u00109\u001a\u0004\bp\u0010CR\u001b\u0010t\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u00109\u001a\u0004\bs\u0010CR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u00109\u001a\u0004\bw\u0010xR\u001b\u0010|\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u00109\u001a\u0004\b{\u0010;R\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u00109\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/good/pizza/PizzaCartProductViewHolder;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/CartProductViewHolder;", "", "imageUrl", "", "showImage", "firstImageUrl", "secondImageUrl", "showHalvesImage", "Lb78;", "pizzaConcept", "prepareImageView", "doughDescription", "setDoughDescription", "toppings", "showAddedToppings", "hideToppings", "ingredients", "showRemovedIngredients", "hideRemovedIngredients", "showStop", "stopToppings", "showStopToppings", "stopHalves", "showStopHalves", "title", "setDiscountTitle", "setGiftTitle", "", "loyaltyCoinsUsed", "setLoyaltyGiftTitle", "hideGift", "showRemovedGift", "showAddedGift", "Lkotlin/Function0;", "discountClickListener", "setOnDiscountClickListener", "editButtonClickListener", "setOnEditButtonClickListener", "", "isVisible", "setEditButtonVisibility", "showPersonalPriceBadge", "hidePersonalPriceBadge", "isEnabled", "enablePersonalPriceBadge", "Lu18;", "formatter", "timeRemain", "setTimerInPersonalPriceBadge", "replacementText", "setTextInPersonalPriceBadge", "onTimerFinished", "launchPersonalPriceTimer", "releasePersonalPriceTimer", "Landroid/widget/TextView;", "productTitle$delegate", "Lk79;", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "stopDescription$delegate", "getStopDescription", "stopDescription", "Landroid/view/View;", "priceSector$delegate", "getPriceSector", "()Landroid/view/View;", "priceSector", "finalPrice$delegate", "getFinalPrice", "finalPrice", "rawPrice$delegate", "getRawPrice", "rawPrice", "Landroid/widget/ViewSwitcher;", "counterSwitcher$delegate", "getCounterSwitcher", "()Landroid/widget/ViewSwitcher;", "counterSwitcher", "Landroid/widget/Button;", "minusCounterButton$delegate", "getMinusCounterButton", "()Landroid/widget/Button;", "minusCounterButton", "counterLabel$delegate", "getCounterLabel", "counterLabel", "plusCounterButton$delegate", "getPlusCounterButton", "plusCounterButton", "removeButton$delegate", "getRemoveButton", "removeButton", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "productImage$delegate", "getProductImage", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "productImage", "contentSector$delegate", "getContentSector", "contentSector", "productSize$delegate", "getProductSize", "productSize", "toppingsDescription$delegate", "getToppingsDescription", "toppingsDescription", "removedIngredients$delegate", "getRemovedIngredients", "removedIngredients", "editButton$delegate", "getEditButton", "editButton", "discountSector$delegate", "getDiscountSector", "discountSector", "Landroid/widget/ImageView;", "discountIcon$delegate", "getDiscountIcon", "()Landroid/widget/ImageView;", "discountIcon", "discountTitle$delegate", "getDiscountTitle", "discountTitle", "Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", "personalPriceBadge$delegate", "getPersonalPriceBadge", "()Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", "personalPriceBadge", "Lt18;", "personalPriceTimer", "Lt18;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PizzaCartProductViewHolder extends CartProductViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PizzaCartProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "stopDescription", "getStopDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "priceSector", "getPriceSector()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "finalPrice", "getFinalPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "rawPrice", "getRawPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "counterSwitcher", "getCounterSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "minusCounterButton", "getMinusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "counterLabel", "getCounterLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "plusCounterButton", "getPlusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "removeButton", "getRemoveButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "productImage", "getProductImage()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "contentSector", "getContentSector()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "productSize", "getProductSize()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "toppingsDescription", "getToppingsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "removedIngredients", "getRemovedIngredients()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "editButton", "getEditButton()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "discountSector", "getDiscountSector()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "discountIcon", "getDiscountIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "discountTitle", "getDiscountTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzaCartProductViewHolder.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", 0))};
    public static final int $stable = 8;
    private final k79 contentSector$delegate;
    private final k79 counterLabel$delegate;
    private final k79 counterSwitcher$delegate;
    private final k79 discountIcon$delegate;
    private final k79 discountSector$delegate;
    private final k79 discountTitle$delegate;
    private final k79 editButton$delegate;
    private final k79 finalPrice$delegate;
    private final k79 minusCounterButton$delegate;
    private final k79 personalPriceBadge$delegate;
    private t18 personalPriceTimer;
    private final k79 plusCounterButton$delegate;
    private final k79 priceSector$delegate;
    private final k79 productImage$delegate;
    private final k79 productSize$delegate;
    private final k79 productTitle$delegate;
    private final k79 rawPrice$delegate;
    private final k79 removeButton$delegate;
    private final k79 removedIngredients$delegate;
    private final k79 stopDescription$delegate;
    private final k79 toppingsDescription$delegate;

    /* compiled from: PizzaCartProductViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b78.values().length];
            try {
                iArr[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PizzaCartProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", CrashHianalyticsData.TIME, "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<Long, Unit> {
        final /* synthetic */ u18 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u18 u18Var) {
            super(1);
            this.b = u18Var;
        }

        public final void a(long j) {
            CartPersonalPriceBadgeView personalPriceBadge = PizzaCartProductViewHolder.this.getPersonalPriceBadge();
            u18 u18Var = this.b;
            Context context = PizzaCartProductViewHolder.this.itemView.getContext();
            z65.g(context, "getContext(...)");
            personalPriceBadge.setTimeRemain(u18Var.a(context, j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* compiled from: PizzaCartProductViewHolder.kt */
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

    /* compiled from: PizzaCartProductViewHolder.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PizzaCartProductViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.shopping_cart_pizza_product_item);
        z65.h(kzbVar, "viewInflater");
        this.productTitle$delegate = kb0.g(this, gy8.shopping_product_pizza_title);
        this.stopDescription$delegate = kb0.g(this, gy8.shopping_product_pizza_stop);
        this.priceSector$delegate = kb0.g(this, gy8.shopping_product_pizza_price_sector);
        this.finalPrice$delegate = kb0.g(this, gy8.shopping_product_pizza_price);
        this.rawPrice$delegate = kb0.g(this, gy8.shopping_product_pizza_discount_price);
        this.counterSwitcher$delegate = kb0.g(this, gy8.shopping_cart_counter_button_switcher);
        this.minusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_minus_counter_button);
        this.counterLabel$delegate = kb0.g(this, gy8.shopping_cart_counter_label);
        this.plusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_plus_counter_button);
        this.removeButton$delegate = kb0.g(this, gy8.shopping_cart_remove_button);
        this.productImage$delegate = kb0.g(this, gy8.shopping_product_pizza_image);
        this.contentSector$delegate = kb0.g(this, gy8.shopping_product_pizza_content_sector);
        this.productSize$delegate = kb0.g(this, gy8.shopping_product_pizza_size_description);
        this.toppingsDescription$delegate = kb0.g(this, gy8.shopping_product_pizza_toppings);
        this.removedIngredients$delegate = kb0.g(this, gy8.shopping_product_pizza_removed_ingredients);
        this.editButton$delegate = kb0.g(this, gy8.shopping_product_pizza_edit_button);
        this.discountSector$delegate = kb0.g(this, gy8.shopping_product_pizza_discount_sector);
        this.discountIcon$delegate = kb0.g(this, gy8.shopping_product_pizza_discount_icon);
        this.discountTitle$delegate = kb0.g(this, gy8.shopping_product_pizza_discount);
        this.personalPriceBadge$delegate = kb0.g(this, gy8.shopping_product_pizza_personal_price_badge);
        this.personalPriceTimer = new v18();
    }

    private final View getContentSector() {
        return (View) this.contentSector$delegate.a(this, $$delegatedProperties[11]);
    }

    private final ImageView getDiscountIcon() {
        return (ImageView) this.discountIcon$delegate.a(this, $$delegatedProperties[17]);
    }

    private final View getDiscountSector() {
        return (View) this.discountSector$delegate.a(this, $$delegatedProperties[16]);
    }

    private final TextView getDiscountTitle() {
        return (TextView) this.discountTitle$delegate.a(this, $$delegatedProperties[18]);
    }

    private final View getEditButton() {
        return (View) this.editButton$delegate.a(this, $$delegatedProperties[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartPersonalPriceBadgeView getPersonalPriceBadge() {
        return (CartPersonalPriceBadgeView) this.personalPriceBadge$delegate.a(this, $$delegatedProperties[19]);
    }

    private final DoubleImageView getProductImage() {
        return (DoubleImageView) this.productImage$delegate.a(this, $$delegatedProperties[10]);
    }

    private final TextView getProductSize() {
        return (TextView) this.productSize$delegate.a(this, $$delegatedProperties[12]);
    }

    private final TextView getRemovedIngredients() {
        return (TextView) this.removedIngredients$delegate.a(this, $$delegatedProperties[14]);
    }

    private final TextView getToppingsDescription() {
        return (TextView) this.toppingsDescription$delegate.a(this, $$delegatedProperties[13]);
    }

    public final void enablePersonalPriceBadge(boolean z) {
        getPersonalPriceBadge().setEnabled(z);
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
        return (Button) this.removeButton$delegate.a(this, $$delegatedProperties[9]);
    }

    @Override // com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder
    protected TextView getStopDescription() {
        return (TextView) this.stopDescription$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void hideGift() {
        un3.e(getDiscountSector());
    }

    public final void hidePersonalPriceBadge() {
        un3.e(getPersonalPriceBadge());
    }

    public final void hideRemovedIngredients() {
        un3.e(getRemovedIngredients());
    }

    public final void hideToppings() {
        un3.e(getToppingsDescription());
    }

    public final void launchPersonalPriceTimer(u18 u18Var, long j, Function0<Unit> function0) {
        z65.h(u18Var, "formatter");
        z65.h(function0, "onTimerFinished");
        this.personalPriceTimer.a(j, new b(u18Var), function0);
    }

    public final void prepareImageView(b78 b78Var) {
        z65.h(b78Var, "pizzaConcept");
        int i = a.$EnumSwitchMapping$0[b78Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getProductImage().setHasOffset(false);
                return;
            }
            return;
        }
        getProductImage().setHasOffset(true);
    }

    public final void releasePersonalPriceTimer() {
        this.personalPriceTimer.release();
    }

    public final void setDiscountTitle(String str) {
        z65.h(str, "title");
        un3.k(getDiscountSector());
        getDiscountIcon().setImageResource(bx8.ic_discount_16dp);
        getDiscountTitle().setText(str);
    }

    public final void setDoughDescription(String str) {
        z65.h(str, "doughDescription");
        un3.k(getProductSize());
        getProductSize().setText(str);
    }

    public final void setEditButtonVisibility(boolean z) {
        un3.o(getEditButton(), z);
    }

    public final void setGiftTitle(String str) {
        z65.h(str, "title");
        un3.k(getDiscountSector());
        getDiscountIcon().setImageResource(bx8.ic_gift_16dp);
        getDiscountTitle().setText(str);
    }

    public final void setLoyaltyGiftTitle(long j) {
        un3.k(getDiscountSector());
        getDiscountIcon().setImageResource(bx8.ic_gift_16dp);
        getDiscountTitle().setText(getDiscountTitle().getContext().getResources().getQuantityString(e09.loyalty_cart_product_discount_title, (int) j, String.valueOf(j)));
    }

    public final void setOnDiscountClickListener(Function0<Unit> function0) {
        z65.h(function0, "discountClickListener");
        oma.a(getDiscountSector(), new c(function0));
    }

    public final void setOnEditButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "editButtonClickListener");
        oma.a(getEditButton(), new d(function0));
    }

    public final void setTextInPersonalPriceBadge(String str) {
        z65.h(str, "replacementText");
        getPersonalPriceBadge().setTimeRemain(str);
    }

    public final void setTimerInPersonalPriceBadge(u18 u18Var, long j) {
        z65.h(u18Var, "formatter");
        CartPersonalPriceBadgeView personalPriceBadge = getPersonalPriceBadge();
        Context context = this.itemView.getContext();
        z65.g(context, "getContext(...)");
        personalPriceBadge.setTimeRemain(u18Var.a(context, j));
    }

    public final void showAddedGift() {
        getContentSector().setAlpha(1.0f);
        getPriceSector().setAlpha(1.0f);
        getRemoveButton().setText(getRemoveButton().getContext().getString(r09.Y1));
    }

    public final void showAddedToppings(String str) {
        z65.h(str, "toppings");
        un3.k(getToppingsDescription());
        getToppingsDescription().setText(this.itemView.getContext().getString(r09.l, str));
    }

    public final void showHalvesImage(String str, String str2) {
        z65.h(str, "firstImageUrl");
        z65.h(str2, "secondImageUrl");
        getProductImage().j(false);
        t63.a.a(getProductImage(), str, str2, bx8.L);
    }

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        getProductImage().j(true);
        com.bumptech.glide.b.u(getProductImage()).t(str).d().a0(bx8.L).G0(getProductImage().getSingleImageView());
    }

    public final void showPersonalPriceBadge() {
        un3.k(getPersonalPriceBadge());
    }

    public final void showRemovedGift() {
        getContentSector().setAlpha(0.5f);
        getPriceSector().setAlpha(0.5f);
        getRemoveButton().setText(getRemoveButton().getContext().getString(r09.cart_item_return));
    }

    public final void showRemovedIngredients(String str) {
        z65.h(str, "ingredients");
        un3.k(getRemovedIngredients());
        getRemovedIngredients().setText(this.itemView.getContext().getString(r09.Z1, str));
    }

    public final void showStop() {
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(r09.cart_item_pizza_in_stop));
    }

    public final void showStopHalves(String str) {
        z65.h(str, "stopHalves");
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(r09.cart_item_component_in_stop, str));
    }

    public final void showStopToppings(String str) {
        z65.h(str, "stopToppings");
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(r09.cart_item_pizza_ingredient_in_stop, str));
    }
}
