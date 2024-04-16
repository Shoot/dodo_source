package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter;

import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: ComboProductViewHolder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0006\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u001eR\u001b\u0010\f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001eR\u001b\u0010\u000f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u001eR\u001b\u0010\u0012\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u001eR\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/ComboProductViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "hideDescription", "hideFooter", "", "title", "setTitle", "imageUrl", "", "placeholderResId", "showImage", "sizeDescription", "showSizeDescription", "hideSizeDescription", "toppingDescription", "showToppingDescription", "hideToppingDescription", "removedIngredientsDescription", "showRemovedIngredient", "hideRemovedIngredient", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "image$delegate", "Lk79;", "getImage", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "description$delegate", "getDescription", "description", "sizeDescription$delegate", "getSizeDescription", "toppingDescription$delegate", "getToppingDescription", "removedIngredientsDescription$delegate", "getRemovedIngredientsDescription", "Landroid/view/View;", "footer$delegate", "getFooter", "()Landroid/view/View;", "footer", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ComboProductViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ComboProductViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "description", "getDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "sizeDescription", "getSizeDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "toppingDescription", "getToppingDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "removedIngredientsDescription", "getRemovedIngredientsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboProductViewHolder.class, "footer", "getFooter()Landroid/view/View;", 0))};
    private final k79 description$delegate;
    private final k79 footer$delegate;
    private final k79 image$delegate;
    private final k79 removedIngredientsDescription$delegate;
    private final k79 sizeDescription$delegate;
    private final k79 title$delegate;
    private final k79 toppingDescription$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboProductViewHolder(kzb kzbVar) {
        super(kzbVar, hz8.h);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, hy8.j);
        this.title$delegate = kb0.g(this, hy8.l);
        this.description$delegate = kb0.g(this, hy8.h);
        this.sizeDescription$delegate = kb0.g(this, hy8.m);
        this.toppingDescription$delegate = kb0.g(this, hy8.I);
        this.removedIngredientsDescription$delegate = kb0.g(this, hy8.E);
        this.footer$delegate = kb0.g(this, hy8.footer);
    }

    private final TextView getDescription() {
        return (TextView) this.description$delegate.a(this, $$delegatedProperties[2]);
    }

    private final View getFooter() {
        return (View) this.footer$delegate.a(this, $$delegatedProperties[6]);
    }

    private final DoubleImageView getImage() {
        return (DoubleImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getRemovedIngredientsDescription() {
        return (TextView) this.removedIngredientsDescription$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getSizeDescription() {
        return (TextView) this.sizeDescription$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getToppingDescription() {
        return (TextView) this.toppingDescription$delegate.a(this, $$delegatedProperties[4]);
    }

    public final void hideDescription() {
        un3.e(getDescription());
    }

    public final void hideFooter() {
        un3.e(getFooter());
    }

    public final void hideRemovedIngredient() {
        un3.e(getRemovedIngredientsDescription());
    }

    public final void hideSizeDescription() {
        un3.e(getSizeDescription());
    }

    public final void hideToppingDescription() {
        un3.e(getToppingDescription());
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }

    public final void showImage(String str, int i) {
        z65.h(str, "imageUrl");
        b.u(this.itemView).t(str).a0(i).G0(getImage().getSingleImageView());
    }

    public final void showRemovedIngredient(String str) {
        z65.h(str, "removedIngredientsDescription");
        getRemovedIngredientsDescription().setText(str);
        un3.k(getRemovedIngredientsDescription());
    }

    public final void showSizeDescription(String str) {
        z65.h(str, "sizeDescription");
        getSizeDescription().setText(str);
        un3.k(getSizeDescription());
    }

    public final void showToppingDescription(String str) {
        z65.h(str, "toppingDescription");
        getToppingDescription().setText(str);
        un3.k(getToppingDescription());
    }
}
