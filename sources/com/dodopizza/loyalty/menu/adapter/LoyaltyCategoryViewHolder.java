package com.dodopizza.loyalty.menu.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: LoyaltyCategoryViewHolder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001eR\u001b\u0010%\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0019¨\u0006*"}, d2 = {"Lcom/dodopizza/loyalty/menu/adapter/LoyaltyCategoryViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "imageUrl", "", "setImage", Action.NAME_ATTRIBUTE, "setName", "", "price", "setPrice", "showNotEnoughCoinsState", "showEnoughCoinsState", "Lkotlin/Function0;", "onClickListener", "setOnClickListener", "Landroid/view/ViewGroup;", "categoryContainer$delegate", "Lk79;", "getCategoryContainer", "()Landroid/view/ViewGroup;", "categoryContainer", "Landroid/widget/ImageView;", "categoryImage$delegate", "getCategoryImage", "()Landroid/widget/ImageView;", "categoryImage", "Landroid/widget/TextView;", "categoryName$delegate", "getCategoryName", "()Landroid/widget/TextView;", "categoryName", "categoryPrice$delegate", "getCategoryPrice", "categoryPrice", "categoryCoinIcon$delegate", "getCategoryCoinIcon", "categoryCoinIcon", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyCategoryViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyCategoryViewHolder.class, "categoryContainer", "getCategoryContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(LoyaltyCategoryViewHolder.class, "categoryImage", "getCategoryImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyCategoryViewHolder.class, "categoryName", "getCategoryName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyCategoryViewHolder.class, "categoryPrice", "getCategoryPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyCategoryViewHolder.class, "categoryCoinIcon", "getCategoryCoinIcon()Landroid/widget/ImageView;", 0))};
    private final k79 categoryCoinIcon$delegate;
    private final k79 categoryContainer$delegate;
    private final k79 categoryImage$delegate;
    private final k79 categoryName$delegate;
    private final k79 categoryPrice$delegate;

    /* compiled from: LoyaltyCategoryViewHolder.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCategoryViewHolder(kzb kzbVar) {
        super(kzbVar, ez8.item_loyalty_category);
        z65.h(kzbVar, "viewInflater");
        this.categoryContainer$delegate = kb0.g(this, ey8.loyalty_category_container);
        this.categoryImage$delegate = kb0.g(this, ey8.loyalty_category_image);
        this.categoryName$delegate = kb0.g(this, ey8.loyalty_category_name);
        this.categoryPrice$delegate = kb0.g(this, ey8.loyalty_category_price);
        this.categoryCoinIcon$delegate = kb0.g(this, ey8.loyalty_category_coin_icon);
    }

    private final ImageView getCategoryCoinIcon() {
        return (ImageView) this.categoryCoinIcon$delegate.a(this, $$delegatedProperties[4]);
    }

    private final ViewGroup getCategoryContainer() {
        return (ViewGroup) this.categoryContainer$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getCategoryImage() {
        return (ImageView) this.categoryImage$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getCategoryName() {
        return (TextView) this.categoryName$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getCategoryPrice() {
        return (TextView) this.categoryPrice$delegate.a(this, $$delegatedProperties[3]);
    }

    public final void setImage(String str) {
        z65.h(str, "imageUrl");
        b.u(getCategoryImage()).t(str).a0(zw8.f).G0(getCategoryImage());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getCategoryName().setText(str);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClickListener");
        oma.a(getCategoryContainer(), new a(function0));
    }

    public final void setPrice(double d) {
        getCategoryPrice().setText(eb1.a.a(d));
    }

    public final void showEnoughCoinsState() {
        getCategoryCoinIcon().setEnabled(true);
        getCategoryPrice().setEnabled(true);
    }

    public final void showNotEnoughCoinsState() {
        getCategoryCoinIcon().setEnabled(false);
        getCategoryPrice().setEnabled(false);
    }
}
