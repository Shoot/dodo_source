package com.dodopizza.activeorder.feature.orderdetails.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import kotlin.Metadata;
/* compiled from: OrderGoodListAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0019R\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0019R\u001b\u0010)\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0019R\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0019R\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0019R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/GoodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lhd7;", "model", "", "setProductSize", "setCustomizations", "setSizeProductNotPizza", "Lb78;", "pizzaConcept", "prepareImageView", "showImage", "bindData", "Lcom/bumptech/glide/h;", "glide", "Lcom/bumptech/glide/h;", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "imageView", "Landroid/widget/TextView;", "labelTitle$delegate", "getLabelTitle", "()Landroid/widget/TextView;", "labelTitle", "labelSummary$delegate", "getLabelSummary", "labelSummary", "labelType$delegate", "getLabelType", "labelType", "numText$delegate", "getNumText", "numText", "giftLabel$delegate", "getGiftLabel", "giftLabel", "comboLabel$delegate", "getComboLabel", "comboLabel", "toppingsDescription$delegate", "getToppingsDescription", "toppingsDescription", "removedIngredientsDescription$delegate", "getRemovedIngredientsDescription", "removedIngredientsDescription", "goodModel", "Lhd7;", "getGoodModel", "()Lhd7;", "setGoodModel", "(Lhd7;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;Lcom/bumptech/glide/h;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GoodViewHolder extends RecyclerView.d0 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(GoodViewHolder.class, "imageView", "getImageView()Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "labelTitle", "getLabelTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "labelSummary", "getLabelSummary()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "labelType", "getLabelType()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "numText", "getNumText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "giftLabel", "getGiftLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "comboLabel", "getComboLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "toppingsDescription", "getToppingsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(GoodViewHolder.class, "removedIngredientsDescription", "getRemovedIngredientsDescription()Landroid/widget/TextView;", 0))};
    private final k79 comboLabel$delegate;
    private final k79 giftLabel$delegate;
    private final h glide;
    public hd7 goodModel;
    private final k79 imageView$delegate;
    private final k79 labelSummary$delegate;
    private final k79 labelTitle$delegate;
    private final k79 labelType$delegate;
    private final k79 numText$delegate;
    private final k79 removedIngredientsDescription$delegate;
    private final k79 toppingsDescription$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodViewHolder(View view, h hVar) {
        super(view);
        z65.h(view, "itemView");
        z65.h(hVar, "glide");
        this.glide = hVar;
        this.imageView$delegate = kb0.g(this, ux8.H);
        this.labelTitle$delegate = kb0.g(this, ux8.K);
        this.labelSummary$delegate = kb0.g(this, ux8.C);
        this.labelType$delegate = kb0.g(this, ux8.L);
        this.numText$delegate = kb0.g(this, ux8.T);
        this.giftLabel$delegate = kb0.g(this, ux8.gift_text);
        this.comboLabel$delegate = kb0.g(this, ux8.combo_label);
        this.toppingsDescription$delegate = kb0.g(this, ux8.p0);
        this.removedIngredientsDescription$delegate = kb0.g(this, ux8.e0);
    }

    private final TextView getComboLabel() {
        return (TextView) this.comboLabel$delegate.a(this, $$delegatedProperties[6]);
    }

    private final TextView getGiftLabel() {
        return (TextView) this.giftLabel$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getLabelSummary() {
        return (TextView) this.labelSummary$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getLabelTitle() {
        return (TextView) this.labelTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getLabelType() {
        return (TextView) this.labelType$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getNumText() {
        return (TextView) this.numText$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getRemovedIngredientsDescription() {
        return (TextView) this.removedIngredientsDescription$delegate.a(this, $$delegatedProperties[8]);
    }

    private final TextView getToppingsDescription() {
        return (TextView) this.toppingsDescription$delegate.a(this, $$delegatedProperties[7]);
    }

    private final void prepareImageView(b78 b78Var) {
        boolean z;
        DoubleImageView imageView = getImageView();
        if (b78Var == b78.a) {
            z = true;
        } else {
            z = false;
        }
        imageView.setHasOffset(z);
    }

    private final void setCustomizations(hd7 hd7Var) {
        String k = hd7Var.k();
        if (k != null && k.length() != 0) {
            un3.o(getToppingsDescription(), true);
            getToppingsDescription().setText(this.itemView.getContext().getString(d19.a, k));
        }
        String g = hd7Var.g();
        if (g != null && g.length() != 0) {
            un3.o(getRemovedIngredientsDescription(), true);
            getRemovedIngredientsDescription().setText(this.itemView.getContext().getString(d19.L, g));
        }
    }

    private final void setProductSize(hd7 hd7Var) {
        if (hd7Var.a() == kl8.b) {
            getLabelType().setText(hd7Var.i());
            getLabelType().setVisibility(0);
            return;
        }
        setSizeProductNotPizza(hd7Var);
    }

    private final void setSizeProductNotPizza(hd7 hd7Var) {
        if (hd7Var.d() == nb6.g) {
            un3.o(getLabelType(), true);
            String h = hd7Var.h();
            Context context = getLabelType().getContext();
            z65.g(context, "getContext(...)");
            getLabelType().setText(ql8.d(h, context));
        } else if (hd7Var.d() != nb6.h) {
            un3.o(getLabelType(), true);
            String string = this.itemView.getResources().getString(pb6.a(hd7Var.d()).a());
            z65.g(string, "getString(...)");
            getLabelType().setText(this.itemView.getResources().getString(d19.Q, hd7Var.h(), string));
        } else {
            getLabelType().setVisibility(8);
            un3.o(getLabelType(), false);
        }
    }

    private final void showImage() {
        xi9 b0 = new xi9().d().a0(ff4.a()).b0(yj8.HIGH);
        z65.g(b0, "priority(...)");
        g<Drawable> t = this.glide.t(getGoodModel().c());
        z65.g(t, "load(...)");
        t.b(b0).G0(getImageView().getSingleImageView());
    }

    public final void bindData(hd7 hd7Var) {
        Object Z;
        Object k0;
        z65.h(hd7Var, "model");
        setGoodModel(hd7Var);
        un3.o(getToppingsDescription(), false);
        un3.o(getRemovedIngredientsDescription(), false);
        getLabelTitle().setText(getGoodModel().j());
        getLabelSummary().setVisibility(8);
        setProductSize(hd7Var);
        setCustomizations(hd7Var);
        StringBuilder sb = new StringBuilder();
        sb.append(this.itemView.getContext().getString(d19.num_pieces, Integer.valueOf(getGoodModel().b())));
        if (getGoodModel().n()) {
            getGiftLabel().setVisibility(0);
        } else {
            getGiftLabel().setVisibility(8);
            sb.append(", ");
            sb.append(un6.b(getGoodModel().l()));
        }
        un3.o(getComboLabel(), getGoodModel().m());
        getNumText().setText(sb.toString());
        if (getGoodModel().f().isEmpty()) {
            showImage();
            return;
        }
        prepareImageView(getGoodModel().e());
        t63 t63Var = t63.a;
        DoubleImageView imageView = getImageView();
        Z = sc1.Z(getGoodModel().f());
        k0 = sc1.k0(getGoodModel().f());
        t63Var.a(imageView, (String) Z, (String) k0, ff4.a());
    }

    public final hd7 getGoodModel() {
        hd7 hd7Var = this.goodModel;
        if (hd7Var != null) {
            return hd7Var;
        }
        z65.z("goodModel");
        return null;
    }

    public final DoubleImageView getImageView() {
        return (DoubleImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setGoodModel(hd7 hd7Var) {
        z65.h(hd7Var, "<set-?>");
        this.goodModel = hd7Var;
    }
}
