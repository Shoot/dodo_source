package com.dodopizza.order.feature.shoppingcart.adapter.good.snack;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.dodopizza.order.feature.shoppingcart.adapter.good.CartProductViewHolder;
import com.dodopizza.order.feature.shoppingcart.view.CartPersonalPriceBadgeView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SnackCartProductViewHolder.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0004\b}\u0010~J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u0014\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0014J$\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0002J\u0006\u0010*\u001a\u00020\u0004J\u0014\u0010,\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ\u000e\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u001fJ\u000e\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0002J\u0006\u00101\u001a\u00020\u0004R\u001b\u00107\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u001b\u0010?\u001a\u00020;8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u00106R\u001b\u0010E\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u001b\u0010J\u001a\u00020F8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u0010NR\u001b\u0010R\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bQ\u00106R\u001b\u0010U\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bS\u00104\u001a\u0004\bT\u0010NR\u001b\u0010X\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u0010NR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00104\u001a\u0004\b[\u0010\\R\u001b\u0010`\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00104\u001a\u0004\b_\u0010>R\u001b\u0010c\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u00104\u001a\u0004\bb\u00106R\u001b\u0010f\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u00104\u001a\u0004\be\u00106R\u001b\u0010i\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u00104\u001a\u0004\bh\u0010>R\u001b\u0010l\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u00104\u001a\u0004\bk\u0010\\R\u001b\u0010o\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u00104\u001a\u0004\bn\u00106R\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u00104\u001a\u0004\br\u0010sR\u001b\u0010w\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u00104\u001a\u0004\bv\u0010>R\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010z¨\u0006\u007f"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/good/snack/SnackCartProductViewHolder;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/CartProductViewHolder;", "", "imageUrl", "", "showImage", "description", "showProductSizeDescription", "Lnb6;", "measure", "sizeValue", "showProductSize", "showPortion", "hideProductSize", "Lkl8;", "category", "showStop", "title", "setDiscountTitle", "setGiftTitle", "", "loyaltyCoinsUsed", "setLoyaltyGiftTitle", "hideGift", "showRemovedGift", "showAddedGift", "Lkotlin/Function0;", "discountClickListener", "setOnDiscountClickListener", "showPersonalPriceBadge", "hidePersonalPriceBadge", "", "isEnabled", "enablePersonalPriceBadge", "Lu18;", "formatter", "timeRemain", "setTimerInPersonalPriceBadge", "onTimerFinished", "launchPersonalPriceTimer", "replacementText", "setTextInPersonalPriceBadge", "releasePersonalPriceTimer", "editButtonClickListener", "setOnEditButtonClickListener", "isVisible", "setEditButtonVisibility", "toppings", "showAddedToppings", "hideToppings", "Landroid/widget/TextView;", "productTitle$delegate", "Lk79;", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "stopDescription$delegate", "getStopDescription", "stopDescription", "Landroid/view/View;", "priceSector$delegate", "getPriceSector", "()Landroid/view/View;", "priceSector", "finalPrice$delegate", "getFinalPrice", "finalPrice", "rawPrice$delegate", "getRawPrice", "rawPrice", "Landroid/widget/ViewSwitcher;", "counterSwitcher$delegate", "getCounterSwitcher", "()Landroid/widget/ViewSwitcher;", "counterSwitcher", "Landroid/widget/Button;", "minusCounterButton$delegate", "getMinusCounterButton", "()Landroid/widget/Button;", "minusCounterButton", "counterLabel$delegate", "getCounterLabel", "counterLabel", "plusCounterButton$delegate", "getPlusCounterButton", "plusCounterButton", "removeButton$delegate", "getRemoveButton", "removeButton", "Landroid/widget/ImageView;", "productImage$delegate", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "contentSector$delegate", "getContentSector", "contentSector", "sizeTitle$delegate", "getSizeTitle", "sizeTitle", "toppingsDescription$delegate", "getToppingsDescription", "toppingsDescription", "discountSector$delegate", "getDiscountSector", "discountSector", "discountIcon$delegate", "getDiscountIcon", "discountIcon", "discountTitle$delegate", "getDiscountTitle", "discountTitle", "Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", "personalPriceBadge$delegate", "getPersonalPriceBadge", "()Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", "personalPriceBadge", "editButton$delegate", "getEditButton", "editButton", "Lt18;", "personalPriceTimer", "Lt18;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SnackCartProductViewHolder extends CartProductViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SnackCartProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "stopDescription", "getStopDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "priceSector", "getPriceSector()Landroid/view/View;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "finalPrice", "getFinalPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "rawPrice", "getRawPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "counterSwitcher", "getCounterSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "minusCounterButton", "getMinusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "counterLabel", "getCounterLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "plusCounterButton", "getPlusCounterButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "removeButton", "getRemoveButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "contentSector", "getContentSector()Landroid/view/View;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "sizeTitle", "getSizeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "toppingsDescription", "getToppingsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "discountSector", "getDiscountSector()Landroid/view/View;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "discountIcon", "getDiscountIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "discountTitle", "getDiscountTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", 0)), bc9.f(new ar8(SnackCartProductViewHolder.class, "editButton", "getEditButton()Landroid/view/View;", 0))};
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
    private final k79 productTitle$delegate;
    private final k79 rawPrice$delegate;
    private final k79 removeButton$delegate;
    private final k79 sizeTitle$delegate;
    private final k79 stopDescription$delegate;
    private final k79 toppingsDescription$delegate;

    /* compiled from: SnackCartProductViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl8.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SnackCartProductViewHolder.kt */
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
            CartPersonalPriceBadgeView personalPriceBadge = SnackCartProductViewHolder.this.getPersonalPriceBadge();
            u18 u18Var = this.b;
            Context context = SnackCartProductViewHolder.this.itemView.getContext();
            z65.g(context, "getContext(...)");
            personalPriceBadge.setTimeRemain(u18Var.a(context, j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* compiled from: SnackCartProductViewHolder.kt */
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

    /* compiled from: SnackCartProductViewHolder.kt */
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
    public SnackCartProductViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.shopping_cart_snack_product_item);
        z65.h(kzbVar, "viewInflater");
        this.productTitle$delegate = kb0.g(this, gy8.shopping_product_snack_title);
        this.stopDescription$delegate = kb0.g(this, gy8.shopping_product_snack_stop);
        this.priceSector$delegate = kb0.g(this, gy8.shopping_product_snack_price_sector);
        this.finalPrice$delegate = kb0.g(this, gy8.shopping_product_snack_price);
        this.rawPrice$delegate = kb0.g(this, gy8.shopping_product_snack_discount_price);
        this.counterSwitcher$delegate = kb0.g(this, gy8.shopping_cart_counter_button_switcher);
        this.minusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_minus_counter_button);
        this.counterLabel$delegate = kb0.g(this, gy8.shopping_cart_counter_label);
        this.plusCounterButton$delegate = kb0.g(this, gy8.shopping_cart_plus_counter_button);
        this.removeButton$delegate = kb0.g(this, gy8.shopping_cart_remove_button);
        this.productImage$delegate = kb0.g(this, gy8.shopping_product_snack_image);
        this.contentSector$delegate = kb0.g(this, gy8.shopping_product_snack_content_sector);
        this.sizeTitle$delegate = kb0.g(this, gy8.shopping_product_snack_size_description);
        this.toppingsDescription$delegate = kb0.g(this, gy8.shopping_product_snack_toppings);
        this.discountSector$delegate = kb0.g(this, gy8.shopping_product_snack_discount_sector);
        this.discountIcon$delegate = kb0.g(this, gy8.shopping_product_snack_discount_icon);
        this.discountTitle$delegate = kb0.g(this, gy8.shopping_product_snack_discount);
        this.personalPriceBadge$delegate = kb0.g(this, gy8.shopping_product_snack_personal_price_badge);
        this.editButton$delegate = kb0.g(this, gy8.shopping_product_snack_edit_button);
        this.personalPriceTimer = new v18();
    }

    private final View getContentSector() {
        return (View) this.contentSector$delegate.a(this, $$delegatedProperties[11]);
    }

    private final ImageView getDiscountIcon() {
        return (ImageView) this.discountIcon$delegate.a(this, $$delegatedProperties[15]);
    }

    private final View getDiscountSector() {
        return (View) this.discountSector$delegate.a(this, $$delegatedProperties[14]);
    }

    private final TextView getDiscountTitle() {
        return (TextView) this.discountTitle$delegate.a(this, $$delegatedProperties[16]);
    }

    private final View getEditButton() {
        return (View) this.editButton$delegate.a(this, $$delegatedProperties[18]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartPersonalPriceBadgeView getPersonalPriceBadge() {
        return (CartPersonalPriceBadgeView) this.personalPriceBadge$delegate.a(this, $$delegatedProperties[17]);
    }

    private final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[10]);
    }

    private final TextView getSizeTitle() {
        return (TextView) this.sizeTitle$delegate.a(this, $$delegatedProperties[12]);
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

    public final void hideProductSize() {
        un3.e(getSizeTitle());
    }

    public final void hideToppings() {
        un3.e(getToppingsDescription());
    }

    public final void launchPersonalPriceTimer(u18 u18Var, long j, Function0<Unit> function0) {
        z65.h(u18Var, "formatter");
        z65.h(function0, "onTimerFinished");
        this.personalPriceTimer.a(j, new b(u18Var), function0);
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

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getProductImage()).t(str).d().a0(bx8.L).G0(getProductImage());
    }

    public final void showPersonalPriceBadge() {
        un3.k(getPersonalPriceBadge());
    }

    public final void showPortion(String str) {
        z65.h(str, "sizeValue");
        un3.k(getSizeTitle());
        TextView sizeTitle = getSizeTitle();
        Context context = getSizeTitle().getContext();
        z65.g(context, "getContext(...)");
        sizeTitle.setText(ql8.d(str, context));
    }

    public final void showProductSize(nb6 nb6Var, String str) {
        z65.h(nb6Var, "measure");
        z65.h(str, "sizeValue");
        un3.k(getSizeTitle());
        String string = getSizeTitle().getContext().getString(pb6.a(nb6Var).a());
        getSizeTitle().setText(str + " " + string);
    }

    public final void showProductSizeDescription(String str) {
        z65.h(str, "description");
        un3.k(getSizeTitle());
        getSizeTitle().setText(str);
    }

    public final void showRemovedGift() {
        getContentSector().setAlpha(0.5f);
        getPriceSector().setAlpha(0.5f);
        getRemoveButton().setText(getRemoveButton().getContext().getString(r09.cart_item_return));
    }

    public final void showStop(kl8 kl8Var) {
        int i;
        z65.h(kl8Var, "category");
        int i2 = a.$EnumSwitchMapping$0[kl8Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    i = r09.cart_item_stuff_in_stop;
                } else {
                    i = r09.cart_item_drink_in_stop;
                }
            } else {
                i = r09.cart_item_desert_in_stop;
            }
        } else {
            i = r09.cart_item_snack_in_stop;
        }
        un3.k(getStopDescription());
        getStopDescription().setText(getStopDescription().getContext().getString(i));
    }
}
