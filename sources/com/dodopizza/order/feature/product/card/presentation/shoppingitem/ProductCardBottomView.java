package com.dodopizza.order.feature.product.card.presentation.shoppingitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductCardBottomView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0002J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0004J\u0014\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b \u0010!R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b#\u0010!R\u001b\u0010(\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "Landroid/widget/LinearLayout;", "Landroid/util/AttributeSet;", "attrs", "", "setup", "", "backgroundColor", "rippleColor", "b", "", "price", "discountPrice", "buttonText", e.a, DateTokenConverter.CONVERTER_KEY, "g", Image.TYPE_HIGH, "", "text", c.a, "f", "Lkotlin/Function0;", "listener", "a", "I", "layoutId", "Lk79;", "getPricesContainer", "()Landroid/widget/LinearLayout;", "pricesContainer", "Landroid/widget/TextView;", "getDiscountPriceView", "()Landroid/widget/TextView;", "discountPriceView", "getPriceView", "priceView", "Lcom/google/android/material/button/MaterialButton;", "getAddToCartButton", "()Lcom/google/android/material/button/MaterialButton;", "addToCartButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ProductCardBottomView extends LinearLayout {
    private int a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(ProductCardBottomView.class, "pricesContainer", "getPricesContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(ProductCardBottomView.class, "discountPriceView", "getDiscountPriceView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ProductCardBottomView.class, "priceView", "getPriceView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ProductCardBottomView.class, "addToCartButton", "getAddToCartButton()Lcom/google/android/material/button/MaterialButton;", 0))};
    public static final a f = new a(null);
    public static final int h = 8;
    private static final int i = gz8.product_card_bottom_view;

    /* compiled from: ProductCardBottomView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView$a;", "", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ProductCardBottomView.kt */
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductCardBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final void b(int i2, int i3) {
        getAddToCartButton().setBackgroundTintList(iu1.d(getContext(), i2));
        getAddToCartButton().setRippleColor(iu1.d(getContext(), i3));
    }

    private final TextView getDiscountPriceView() {
        return (TextView) this.c.a(this, g[1]);
    }

    private final TextView getPriceView() {
        return (TextView) this.d.a(this, g[2]);
    }

    private final LinearLayout getPricesContainer() {
        return (LinearLayout) this.b.a(this, g[0]);
    }

    private final void setup(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w19.W1, 0, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.a = obtainStyledAttributes.getResourceId(w19.X1, i);
        obtainStyledAttributes.recycle();
    }

    public final void a(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getAddToCartButton(), new b(function0));
    }

    public final void c(CharSequence charSequence) {
        z65.h(charSequence, "text");
        un3.e(getPricesContainer());
        getAddToCartButton().setText(charSequence);
    }

    public final void d(String str, String str2) {
        z65.h(str, "price");
        z65.h(str2, "buttonText");
        un3.k(getPricesContainer());
        un3.e(getDiscountPriceView());
        gdb.a.b(getPriceView(), pv8.a);
        getPriceView().setText(str);
        getAddToCartButton().setText(str2);
    }

    public final void e(String str, String str2, String str3) {
        z65.h(str, "price");
        z65.h(str2, "discountPrice");
        z65.h(str3, "buttonText");
        un3.k(getPricesContainer());
        gdb.a.c(getPriceView(), str);
        getDiscountPriceView().setText(str2);
        getAddToCartButton().setText(str3);
    }

    public final void f() {
        un3.e(getPricesContainer());
        getAddToCartButton().setText(getContext().getString(r09.l1));
        getAddToCartButton().setEnabled(false);
    }

    public final void g() {
        b(ew8.primary_loyality_button_background_color, ew8.surfaceLoyaltySecondaryColor);
    }

    public final MaterialButton getAddToCartButton() {
        return (MaterialButton) this.e.a(this, g[3]);
    }

    public final void h() {
        b(ew8.primary_button_background_color, ew8.s);
    }

    public /* synthetic */ ProductCardBottomView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCardBottomView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = i;
        setup(attributeSet);
        View.inflate(context, this.a, this);
        this.b = kb0.d(this, gy8.bottom_shopping_bar_cost_container);
        this.c = kb0.d(this, gy8.bottom_shopping_bar_discount_price_value);
        this.d = kb0.d(this, gy8.bottom_shopping_bar_full_price_value);
        this.e = kb0.d(this, gy8.bottom_shopping_bar_add_to_cart_button);
    }
}
