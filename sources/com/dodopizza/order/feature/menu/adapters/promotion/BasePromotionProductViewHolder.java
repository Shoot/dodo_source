package com.dodopizza.order.feature.menu.adapters.promotion;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.nb6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: BasePromotionProductViewHolder.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0001\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0014\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010%¨\u00065"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/promotion/BasePromotionProductViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkm8;", "productSize", "", "getProductSize", "priceText", "", "isNewDesign", "", "configureProductPrice", "imageUrl", "showImage", "title", "setTitle", "Lkotlin/Function0;", "itemClickListener", "setOnItemClickListener", "buttonClickListener", "setOnButtonClickListener", "showProductSize", "Lhn6;", "price", "newDesign", "setPriceViewTitle", Action.NAME_ATTRIBUTE, "doughTypeName", "setTitleWithPortionDescription", "Landroid/widget/ImageView;", "productImage$delegate", "Lk79;", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "Landroid/widget/TextView;", "productTitle$delegate", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "Landroid/widget/Button;", "productButton$delegate", "getProductButton", "()Landroid/widget/Button;", "productButton", "productSizeDescription$delegate", "getProductSizeDescription", "productSizeDescription", "Lkzb;", "viewInflater", "", "layoutResId", "<init>", "(Lkzb;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BasePromotionProductViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(BasePromotionProductViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(BasePromotionProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(BasePromotionProductViewHolder.class, "productButton", "getProductButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(BasePromotionProductViewHolder.class, "productSizeDescription", "getProductSizeDescription()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;
    private final k79 productButton$delegate;
    private final k79 productImage$delegate;
    private final k79 productSizeDescription$delegate;
    private final k79 productTitle$delegate;

    /* compiled from: BasePromotionProductViewHolder.kt */
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

    /* compiled from: BasePromotionProductViewHolder.kt */
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
    public BasePromotionProductViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        this.productImage$delegate = kb0.g(this, gy8.promoting_product_image);
        this.productTitle$delegate = kb0.g(this, gy8.promoting_product_title);
        this.productButton$delegate = kb0.g(this, gy8.promoting_product_button);
        this.productSizeDescription$delegate = kb0.g(this, gy8.promo_product_size_description);
    }

    private final void configureProductPrice(String str, boolean z) {
        if (z) {
            un3.e(getProductButton());
            return;
        }
        getProductButton().setText(str);
        un3.k(getProductButton());
    }

    private final Button getProductButton() {
        return (Button) this.productButton$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[0]);
    }

    private final String getProductSize(km8 km8Var) {
        Integer k;
        int i;
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

    private final TextView getProductSizeDescription() {
        return (TextView) this.productSizeDescription$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getProductTitle() {
        return (TextView) this.productTitle$delegate.a(this, $$delegatedProperties[1]);
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

    public final void setTitle(String str) {
        z65.h(str, "title");
        getProductTitle().setText(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r5 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTitleWithPortionDescription(java.lang.String r3, defpackage.km8 r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "name"
            defpackage.z65.h(r3, r0)
            java.lang.String r0 = "productSize"
            defpackage.z65.h(r4, r0)
            android.widget.TextView r0 = r2.getProductTitle()
            r0.setText(r3)
            android.widget.TextView r3 = r2.getProductSizeDescription()
            defpackage.un3.k(r3)
            android.widget.TextView r3 = r2.getProductSizeDescription()
            if (r5 == 0) goto L39
            java.lang.String r0 = r2.getProductSize(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ", "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            if (r5 == 0) goto L39
            goto L3d
        L39:
            java.lang.String r5 = r2.getProductSize(r4)
        L3d:
            r3.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.menu.adapters.promotion.BasePromotionProductViewHolder.setTitleWithPortionDescription(java.lang.String, km8, java.lang.String):void");
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
}
