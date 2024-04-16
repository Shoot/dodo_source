package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter;

import android.content.Context;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.nb6;
import kotlin.Metadata;
/* compiled from: SimpleOrderItemVH.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0003\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010$R\u001b\u0010*\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010$R\u001b\u0010-\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010$R\u001b\u00100\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010$R\u001b\u0010\u0014\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010$¨\u00067"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/SimpleOrderItemVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setTitle", "imageUrl", "", "placeholderResId", "setImageUrl", "sizeDesc", "setSizeDescription", "Lena;", "sizeDetails", "setProductSize", "toppings", "setToppings", "removedIngredients", "setRemovedIngredients", "Lhn6;", "price", "setPrice", "firstImageUrl", "secondImageUrl", "Lb78;", "pizzaConcept", "showHalvesImages", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "image$delegate", "Lk79;", "getImage", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "description$delegate", "getDescription", "description", "sizeDescription$delegate", "getSizeDescription", "sizeDescription", "toppingDescription$delegate", "getToppingDescription", "toppingDescription", "removedIngredientsDescription$delegate", "getRemovedIngredientsDescription", "removedIngredientsDescription", "price$delegate", "getPrice", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SimpleOrderItemVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SimpleOrderItemVH.class, ElementGenerator.TYPE_IMAGE, "getImage()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "description", "getDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "sizeDescription", "getSizeDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "toppingDescription", "getToppingDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "removedIngredientsDescription", "getRemovedIngredientsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SimpleOrderItemVH.class, "price", "getPrice()Landroid/widget/TextView;", 0))};
    private final k79 description$delegate;
    private final k79 image$delegate;
    private final k79 price$delegate;
    private final k79 removedIngredientsDescription$delegate;
    private final k79 sizeDescription$delegate;
    private final k79 title$delegate;
    private final k79 toppingDescription$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleOrderItemVH(kzb kzbVar) {
        super(kzbVar, hz8.h);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, hy8.j);
        this.title$delegate = kb0.g(this, hy8.l);
        this.description$delegate = kb0.g(this, hy8.h);
        this.sizeDescription$delegate = kb0.g(this, hy8.m);
        this.toppingDescription$delegate = kb0.g(this, hy8.I);
        this.removedIngredientsDescription$delegate = kb0.g(this, hy8.E);
        this.price$delegate = kb0.g(this, hy8.p);
        un3.o(getDescription(), false);
        un3.o(getToppingDescription(), false);
        un3.o(getRemovedIngredientsDescription(), false);
    }

    private final TextView getDescription() {
        return (TextView) this.description$delegate.a(this, $$delegatedProperties[2]);
    }

    private final DoubleImageView getImage() {
        return (DoubleImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getPrice() {
        return (TextView) this.price$delegate.a(this, $$delegatedProperties[6]);
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

    public final void setImageUrl(String str, int i) {
        z65.h(str, "imageUrl");
        getImage().j(true);
        b.u(this.itemView).t(str).a0(i).G0(getImage().getSingleImageView());
    }

    public final void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getPrice().setText(un6.b(hn6Var));
    }

    public final void setProductSize(ena enaVar) {
        Integer k;
        int i;
        z65.h(enaVar, "sizeDetails");
        nb6.a aVar = nb6.a;
        k = k0b.k(enaVar.b().a());
        if (k != null) {
            i = k.intValue();
        } else {
            i = -1;
        }
        nb6 a = aVar.a(i);
        km8 b = enaVar.b();
        if (a == nb6.g) {
            un3.o(getSizeDescription(), true);
            String value = b.getValue();
            Context context = getSizeDescription().getContext();
            z65.g(context, "getContext(...)");
            getSizeDescription().setText(ql8.d(value, context));
        } else if (a != nb6.h) {
            un3.o(getSizeDescription(), true);
            String value2 = b.getValue();
            String string = this.itemView.getContext().getResources().getString(pb6.a(a).a());
            getSizeDescription().setText(value2 + " " + string);
        } else {
            String c = enaVar.c();
            if (c != null && c.length() != 0) {
                un3.o(getSizeDescription(), true);
                getSizeDescription().setText(enaVar.c());
                return;
            }
            un3.o(getSizeDescription(), false);
        }
    }

    public final void setRemovedIngredients(String str) {
        z65.h(str, "removedIngredients");
        un3.o(getRemovedIngredientsDescription(), true);
        getRemovedIngredientsDescription().setText(this.itemView.getContext().getString(s09.l, str));
    }

    public final void setSizeDescription(String str) {
        z65.h(str, "sizeDesc");
        un3.o(getSizeDescription(), true);
        getSizeDescription().setText(str);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }

    public final void setToppings(String str) {
        z65.h(str, "toppings");
        un3.o(getToppingDescription(), true);
        getToppingDescription().setText(this.itemView.getContext().getString(s09.a, str));
    }

    public final void showHalvesImages(String str, String str2, b78 b78Var) {
        boolean z;
        z65.h(str, "firstImageUrl");
        z65.h(str2, "secondImageUrl");
        z65.h(b78Var, "pizzaConcept");
        DoubleImageView image = getImage();
        if (b78Var == b78.a) {
            z = true;
        } else {
            z = false;
        }
        image.setHasOffset(z);
        getImage().j(false);
        t63.a.a(getImage(), str, str2, ff4.a());
    }
}
