package com.dodopizza.order.feature.halves.constructor.presentation.adapter.romanpizza;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: RomanHalfViewHolder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/romanpizza/RomanHalfViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "getMargin", "", RemoteMessageConst.Notification.URL, "", "setImage", "setLeftMargin", "setRightMargin", "setGravityStart", "setGravityEnd", "Landroid/widget/ImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "progress$delegate", "getProgress", "progress", "Landroid/widget/RelativeLayout;", "imageContainer$delegate", "getImageContainer", "()Landroid/widget/RelativeLayout;", "imageContainer", "Landroid/widget/LinearLayout$LayoutParams;", "getLayoutParams", "()Landroid/widget/LinearLayout$LayoutParams;", "layoutParams", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RomanHalfViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(RomanHalfViewHolder.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(RomanHalfViewHolder.class, "progress", "getProgress()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(RomanHalfViewHolder.class, "imageContainer", "getImageContainer()Landroid/widget/RelativeLayout;", 0))};
    public static final int $stable = 8;
    private final k79 imageContainer$delegate;
    private final k79 imageView$delegate;
    private final k79 progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomanHalfViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_roman_half_pizza);
        z65.h(kzbVar, "viewInflater");
        this.imageView$delegate = kb0.g(this, gy8.T0);
        this.progress$delegate = kb0.g(this, gy8.g3);
        this.imageContainer$delegate = kb0.g(this, gy8.image_container);
    }

    private final RelativeLayout getImageContainer() {
        return (RelativeLayout) this.imageContainer$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final LinearLayout.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getImageContainer().getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        return (LinearLayout.LayoutParams) layoutParams;
    }

    private final int getMargin() {
        return (int) this.itemView.getResources().getDimension(vw8.a);
    }

    private final ImageView getProgress() {
        return (ImageView) this.progress$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setGravityEnd() {
        View view = this.itemView;
        z65.f(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) view).setGravity(8388613);
    }

    public final void setGravityStart() {
        View view = this.itemView;
        z65.f(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) view).setGravity(8388611);
    }

    public final void setImage(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Drawable e = iu1.e(this.itemView.getContext(), bx8.constructor_halves_placeholder);
        z65.f(e, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) e;
        getProgress().setImageDrawable(animationDrawable);
        animationDrawable.start();
        b.t(this.itemView.getContext()).t(str).T0(o83.i()).G0(getImageView());
    }

    public final void setLeftMargin() {
        getLayoutParams().setMargins(-getMargin(), 0, 0, 0);
    }

    public final void setRightMargin() {
        getLayoutParams().setMargins(0, 0, -getMargin(), 0);
    }
}
