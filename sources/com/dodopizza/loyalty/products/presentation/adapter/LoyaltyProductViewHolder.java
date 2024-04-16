package com.dodopizza.loyalty.products.presentation.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.loyalty.products.presentation.adapter.LoyaltyProductViewHolder;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: LoyaltyProductViewHolder.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/dodopizza/loyalty/products/presentation/adapter/LoyaltyProductViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "description", "setDescription", "", "price", "setPrice", "Lkotlin/Function0;", "listener", "setClickListener", "Ltl8;", "productImage", "setImage", "enableGetProductButton", "showNotAvailable", "showAvailable", "disableGetProductButton", "Landroid/widget/TextView;", "productNameTextView$delegate", "Lk79;", "getProductNameTextView", "()Landroid/widget/TextView;", "productNameTextView", "productDescriptionTextView$delegate", "getProductDescriptionTextView", "productDescriptionTextView", "Lcom/google/android/material/button/MaterialButton;", "loyaltyProductGetButton$delegate", "getLoyaltyProductGetButton", "()Lcom/google/android/material/button/MaterialButton;", "loyaltyProductGetButton", "Landroid/widget/ImageView;", "loyaltyProductImage$delegate", "getLoyaltyProductImage", "()Landroid/widget/ImageView;", "loyaltyProductImage", "Lkzb;", "inflater", "<init>", "(Lkzb;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyProductViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyProductViewHolder.class, "productNameTextView", "getProductNameTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyProductViewHolder.class, "productDescriptionTextView", "getProductDescriptionTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyProductViewHolder.class, "loyaltyProductGetButton", "getLoyaltyProductGetButton()Lcom/google/android/material/button/MaterialButton;", 0)), bc9.f(new ar8(LoyaltyProductViewHolder.class, "loyaltyProductImage", "getLoyaltyProductImage()Landroid/widget/ImageView;", 0))};
    private final k79 loyaltyProductGetButton$delegate;
    private final k79 loyaltyProductImage$delegate;
    private final k79 productDescriptionTextView$delegate;
    private final k79 productNameTextView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyProductViewHolder(kzb kzbVar) {
        super(kzbVar, ez8.item_loyalty_product_card);
        z65.h(kzbVar, "inflater");
        this.productNameTextView$delegate = kb0.g(this, ey8.loyalty_product_name);
        this.productDescriptionTextView$delegate = kb0.g(this, ey8.loyalty_product_description);
        this.loyaltyProductGetButton$delegate = kb0.g(this, ey8.loyalty_product_get_button);
        this.loyaltyProductImage$delegate = kb0.g(this, ey8.loyalty_product_image_view);
    }

    private final MaterialButton getLoyaltyProductGetButton() {
        return (MaterialButton) this.loyaltyProductGetButton$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getLoyaltyProductImage() {
        return (ImageView) this.loyaltyProductImage$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getProductDescriptionTextView() {
        return (TextView) this.productDescriptionTextView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getProductNameTextView() {
        return (TextView) this.productNameTextView$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$0(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final void disableGetProductButton() {
        getLoyaltyProductGetButton().setEnabled(false);
    }

    public final void enableGetProductButton() {
        getLoyaltyProductGetButton().setEnabled(true);
    }

    public final void setClickListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        getLoyaltyProductGetButton().setOnClickListener(new View.OnClickListener() { // from class: f26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyProductViewHolder.setClickListener$lambda$0(Function0.this, view);
            }
        });
    }

    public final void setDescription(String str) {
        z65.h(str, "description");
        getProductDescriptionTextView().setText(str);
    }

    public final void setImage(tl8 tl8Var) {
        z65.h(tl8Var, "productImage");
        b.u(getLoyaltyProductImage()).t(tl8Var.b()).a0(zw8.f).G0(getLoyaltyProductImage());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getProductNameTextView().setText(str);
    }

    public final void setPrice(double d) {
        getLoyaltyProductGetButton().setText(eb1.a.a(d));
    }

    public final void showAvailable(double d) {
        getLoyaltyProductGetButton().setEnabled(true);
        getLoyaltyProductGetButton().setIconResource(zw8.ic_coin_16);
        getLoyaltyProductGetButton().setText(eb1.a.a(d));
    }

    public final void showNotAvailable() {
        getLoyaltyProductGetButton().setEnabled(false);
        getLoyaltyProductGetButton().setIcon(null);
        getLoyaltyProductGetButton().setText(this.itemView.getResources().getString(p09.w));
    }
}
