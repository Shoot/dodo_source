package com.dodopizza.activeorder.feature.ordersummary.presentation;

import android.content.Context;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import kotlin.Metadata;
/* compiled from: OrderSummaryGoodViewHolder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\"¨\u0006."}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryGoodViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Leg7;", "data", "", "setTitle", "", "sizeValue", "Lnb6;", "measure", "showProductSize", "showPortion", "sizeTitle", "setSizeTitle", "hideProductSize", "showComboLabel", "hideComboLabel", "imageUrl", "showSingleImage", "firstImageUrl", "secondImageUrl", "showDoubleImage", "Lb78;", "pizzaConcept", "prepareImageView", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView", "Landroid/widget/TextView;", "labelTitle$delegate", "getLabelTitle", "()Landroid/widget/TextView;", "labelTitle", "sizeAndNumTitle$delegate", "getSizeAndNumTitle", "sizeAndNumTitle", "comboLabel$delegate", "getComboLabel", "comboLabel", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderSummaryGoodViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(OrderSummaryGoodViewHolder.class, "imageView", "getImageView()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(OrderSummaryGoodViewHolder.class, "labelTitle", "getLabelTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderSummaryGoodViewHolder.class, "sizeAndNumTitle", "getSizeAndNumTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderSummaryGoodViewHolder.class, "comboLabel", "getComboLabel()Landroid/widget/TextView;", 0))};
    private final k79 comboLabel$delegate;
    private final k79 imageView$delegate;
    private final k79 labelTitle$delegate;
    private final k79 sizeAndNumTitle$delegate;

    /* compiled from: OrderSummaryGoodViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b78.values().length];
            try {
                iArr[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryGoodViewHolder(kzb kzbVar) {
        super(kzbVar, rz8.order_status_good);
        z65.h(kzbVar, "viewInflater");
        this.imageView$delegate = kb0.g(this, ux8.H);
        this.labelTitle$delegate = kb0.g(this, ux8.K);
        this.sizeAndNumTitle$delegate = kb0.g(this, ux8.size_and_num_title);
        this.comboLabel$delegate = kb0.g(this, ux8.combo_label);
    }

    private final TextView getComboLabel() {
        return (TextView) this.comboLabel$delegate.a(this, $$delegatedProperties[3]);
    }

    private final DoubleImageView getImageView() {
        return (DoubleImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getLabelTitle() {
        return (TextView) this.labelTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getSizeAndNumTitle() {
        return (TextView) this.sizeAndNumTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void hideComboLabel() {
        un3.e(getComboLabel());
    }

    public final void hideProductSize() {
        un3.e(getSizeAndNumTitle());
    }

    public final void prepareImageView(b78 b78Var) {
        z65.h(b78Var, "pizzaConcept");
        int i = a.$EnumSwitchMapping$0[b78Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getImageView().setHasOffset(false);
                return;
            }
            return;
        }
        getImageView().setHasOffset(true);
    }

    public final void setSizeTitle(String str) {
        z65.h(str, "sizeTitle");
        un3.k(getSizeAndNumTitle());
        getSizeAndNumTitle().setText(str);
    }

    public final void setTitle(eg7 eg7Var) {
        z65.h(eg7Var, "data");
        getLabelTitle().setText(eg7Var.h());
    }

    public final void showComboLabel() {
        un3.k(getComboLabel());
    }

    public final void showDoubleImage(String str, String str2) {
        z65.h(str, "firstImageUrl");
        z65.h(str2, "secondImageUrl");
        getImageView().j(false);
        t63.a.a(getImageView(), str, str2, jx8.g);
    }

    public final void showPortion(String str) {
        z65.h(str, "sizeValue");
        un3.k(getSizeAndNumTitle());
        TextView sizeAndNumTitle = getSizeAndNumTitle();
        Context context = getSizeAndNumTitle().getContext();
        z65.g(context, "getContext(...)");
        sizeAndNumTitle.setText(ql8.d(str, context));
    }

    public final void showProductSize(String str, nb6 nb6Var) {
        z65.h(str, "sizeValue");
        z65.h(nb6Var, "measure");
        un3.k(getSizeAndNumTitle());
        String string = getSizeAndNumTitle().getContext().getString(pb6.a(nb6Var).a());
        getSizeAndNumTitle().setText(str + " " + string);
    }

    public final void showSingleImage(String str) {
        z65.h(str, "imageUrl");
        getImageView().j(true);
        com.bumptech.glide.b.u(getImageView()).t(str).d().a0(jx8.g).G0(getImageView().getSingleImageView());
    }
}
