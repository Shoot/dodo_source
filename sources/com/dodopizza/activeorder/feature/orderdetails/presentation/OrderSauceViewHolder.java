package com.dodopizza.activeorder.feature.orderdetails.presentation;

import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: OrderSauceViewHolder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderSauceViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "imageUrl", "", "showImage", "title", "setTitle", "", "count", "setCount", "Landroid/widget/ImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "labelTitle$delegate", "getLabelTitle", "()Landroid/widget/TextView;", "labelTitle", "numText$delegate", "getNumText", "numText", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderSauceViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(OrderSauceViewHolder.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(OrderSauceViewHolder.class, "labelTitle", "getLabelTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderSauceViewHolder.class, "numText", "getNumText()Landroid/widget/TextView;", 0))};
    private final k79 imageView$delegate;
    private final k79 labelTitle$delegate;
    private final k79 numText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSauceViewHolder(kzb kzbVar) {
        super(kzbVar, rz8.sauce_order_card_item);
        z65.h(kzbVar, "viewInflater");
        this.imageView$delegate = kb0.g(this, ux8.H);
        this.labelTitle$delegate = kb0.g(this, ux8.K);
        this.numText$delegate = kb0.g(this, ux8.step_text);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getLabelTitle() {
        return (TextView) this.labelTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getNumText() {
        return (TextView) this.numText$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void setCount(int i) {
        getNumText().setText(this.itemView.getContext().getString(d19.num_pieces, Integer.valueOf(i)));
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getLabelTitle().setText(str);
    }

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getImageView()).t(str).a0(ff4.a()).i(ff4.a()).d().b0(yj8.HIGH).G0(getImageView());
    }
}
