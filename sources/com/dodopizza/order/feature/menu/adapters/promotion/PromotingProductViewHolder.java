package com.dodopizza.order.feature.menu.adapters.promotion;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.nb6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PromotingProductViewHolder.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J\u0014\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0014\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004J \u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010*R\u001b\u00106\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010*¨\u0006;"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/promotion/PromotingProductViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "priceText", "", "isNewDesign", "", "configureProductPrice", "imageUrl", "showImage", "title", "setTitle", "Lkotlin/Function0;", "itemClickListener", "setOnItemClickListener", "buttonClickListener", "setOnButtonClickListener", "sizeDesc", "showSizeDescription", "Lkm8;", "productSize", "showProductSize", "getProductSize", "Lhn6;", "price", "newDesign", "setPriceViewTitle", "setRangePriceViewTitle", "setBuildPizzaText", "setupAssistantStartButton", Action.NAME_ATTRIBUTE, "doughTypeName", "setTitleWithPortionDescription", "Landroid/widget/ImageView;", "productImage$delegate", "Lk79;", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "Landroid/widget/TextView;", "productTitle$delegate", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "Landroid/widget/Button;", "productButton$delegate", "getProductButton", "()Landroid/widget/Button;", "productButton", "promotingProductPrice$delegate", "getPromotingProductPrice", "promotingProductPrice", "productSizeDescription$delegate", "getProductSizeDescription", "productSizeDescription", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PromotingProductViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PromotingProductViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PromotingProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PromotingProductViewHolder.class, "productButton", "getProductButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(PromotingProductViewHolder.class, "promotingProductPrice", "getPromotingProductPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PromotingProductViewHolder.class, "productSizeDescription", "getProductSizeDescription()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;
    private final k79 productButton$delegate;
    private final k79 productImage$delegate;
    private final k79 productSizeDescription$delegate;
    private final k79 productTitle$delegate;
    private final k79 promotingProductPrice$delegate;

    /* compiled from: PromotingProductViewHolder.kt */
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

    /* compiled from: PromotingProductViewHolder.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotingProductViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.promoting_product_item);
        z65.h(kzbVar, "viewInflater");
        this.productImage$delegate = kb0.g(this, gy8.promoting_product_image);
        this.productTitle$delegate = kb0.g(this, gy8.promoting_product_title);
        this.productButton$delegate = kb0.g(this, gy8.promoting_product_button);
        this.promotingProductPrice$delegate = kb0.g(this, gy8.promoting_product_price);
        this.productSizeDescription$delegate = kb0.g(this, gy8.promo_product_size_description);
    }

    private final void configureProductPrice(String str, boolean z) {
        if (z) {
            getPromotingProductPrice().setText(str);
            un3.k(getPromotingProductPrice());
            un3.e(getProductButton());
            return;
        }
        getProductButton().setText(str);
        un3.k(getProductButton());
        un3.e(getPromotingProductPrice());
    }

    private final Button getProductButton() {
        return (Button) this.productButton$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getProductSizeDescription() {
        return (TextView) this.productSizeDescription$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getProductTitle() {
        return (TextView) this.productTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getPromotingProductPrice() {
        return (TextView) this.promotingProductPrice$delegate.a(this, $$delegatedProperties[3]);
    }

    public final String getProductSize(km8 km8Var) {
        Integer k;
        int i;
        z65.h(km8Var, "productSize");
        nb6.a aVar = nb6.a;
        k = k0b.k(km8Var.a());
        if (k != null) {
            i = k.intValue();
        } else {
            i = -1;
        }
        nb6 a2 = aVar.a(i);
        Context context = getProductSizeDescription().getContext();
        if (a2 == nb6.g) {
            String value = km8Var.getValue();
            z65.e(context);
            return ql8.d(value, context);
        } else if (a2 != nb6.h) {
            String string = context.getString(pb6.a(a2).a());
            z65.g(string, "getString(...)");
            String value2 = km8Var.getValue();
            return value2 + " " + string;
        } else {
            return null;
        }
    }

    public final void setBuildPizzaText(boolean z) {
        String string = this.itemView.getContext().getString(r09.build_pizza);
        z65.g(string, "getString(...)");
        configureProductPrice(string, z);
    }

    public final void setOnButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "buttonClickListener");
        oma.a(getProductButton(), new a(function0));
    }

    public final void setOnItemClickListener(Function0<Unit> function0) {
        z65.h(function0, "itemClickListener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new b(function0));
    }

    public final void setPriceViewTitle(hn6 hn6Var, boolean z) {
        z65.h(hn6Var, "price");
        configureProductPrice(un6.b(hn6Var), z);
    }

    public final void setRangePriceViewTitle(hn6 hn6Var, boolean z) {
        z65.h(hn6Var, "price");
        String string = this.itemView.getContext().getString(r09.variable_menu_item_price_title, un6.b(hn6Var));
        z65.g(string, "getString(...)");
        configureProductPrice(string, z);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getProductTitle().setText(str);
    }

    public final void setTitleWithPortionDescription(String str, km8 km8Var, String str2) {
        List q;
        String i0;
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(km8Var, "productSize");
        q = kc1.q(getProductSize(km8Var), str2);
        i0 = sc1.i0(q, ",", null, null, 0, null, null, 62, null);
        setTitle(str + " " + i0);
    }

    public final void setupAssistantStartButton(boolean z) {
        String string = this.itemView.getContext().getString(r09.assistant_menu_card_start_button);
        z65.g(string, "getString(...)");
        configureProductPrice(string, z);
    }

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getProductImage()).t(str).a0(bx8.L).G0(getProductImage());
    }

    public final void showProductSize(km8 km8Var) {
        boolean y;
        z65.h(km8Var, "productSize");
        String productSize = getProductSize(km8Var);
        if (productSize != null) {
            y = l0b.y(productSize);
            if (!y) {
                un3.e(getProductSizeDescription());
                return;
            }
        }
        un3.k(getProductSizeDescription());
        getProductSizeDescription().setText(productSize);
    }

    public final void showSizeDescription(String str) {
        z65.h(str, "sizeDesc");
        un3.o(getProductSizeDescription(), true);
        getProductSizeDescription().setText(str);
    }
}
