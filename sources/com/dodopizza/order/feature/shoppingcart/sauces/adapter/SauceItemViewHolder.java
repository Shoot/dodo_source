package com.dodopizza.order.feature.shoppingcart.sauces.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SauceItemViewHolder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/sauces/adapter/SauceItemViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkotlin/Function0;", "", "addToCartClickListener", "setOnAddToCartClickListener", "", "title", "setSauceTitle", "Lhn6;", "price", "setSauceCost", "showError", "hideError", "imageUrl", "showImage", "disableAddToCart", "enableAddToCart", "Landroid/widget/ImageView;", "sauceIcon$delegate", "Lk79;", "getSauceIcon", "()Landroid/widget/ImageView;", "sauceIcon", "Landroid/widget/TextView;", "sauceTitle$delegate", "getSauceTitle", "()Landroid/widget/TextView;", "sauceTitle", "sauceError$delegate", "getSauceError", "sauceError", "Landroid/widget/Button;", "addToCart$delegate", "getAddToCart", "()Landroid/widget/Button;", "addToCart", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SauceItemViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SauceItemViewHolder.class, "sauceIcon", "getSauceIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(SauceItemViewHolder.class, "sauceTitle", "getSauceTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SauceItemViewHolder.class, "sauceError", "getSauceError()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SauceItemViewHolder.class, "addToCart", "getAddToCart()Landroid/widget/Button;", 0))};
    public static final int $stable = 8;
    private final k79 addToCart$delegate;
    private final k79 sauceError$delegate;
    private final k79 sauceIcon$delegate;
    private final k79 sauceTitle$delegate;

    /* compiled from: SauceItemViewHolder.kt */
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
    public SauceItemViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_sauce);
        z65.h(kzbVar, "viewInflater");
        this.sauceIcon$delegate = kb0.g(this, gy8.sauce_icon);
        this.sauceTitle$delegate = kb0.g(this, gy8.sauce_title);
        this.sauceError$delegate = kb0.g(this, gy8.sauce_error);
        this.addToCart$delegate = kb0.g(this, gy8.add_to_cart);
    }

    private final Button getAddToCart() {
        return (Button) this.addToCart$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getSauceError() {
        return (TextView) this.sauceError$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getSauceIcon() {
        return (ImageView) this.sauceIcon$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSauceTitle() {
        return (TextView) this.sauceTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void disableAddToCart() {
        getAddToCart().setEnabled(false);
    }

    public final void enableAddToCart() {
        getAddToCart().setEnabled(true);
    }

    public final void hideError() {
        un3.e(getSauceError());
    }

    public final void setOnAddToCartClickListener(Function0<Unit> function0) {
        z65.h(function0, "addToCartClickListener");
        oma.a(getAddToCart(), new a(function0));
    }

    public final void setSauceCost(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getAddToCart().setText(getAddToCart().getContext().getString(r09.V0, un6.b(hn6Var)));
    }

    public final void setSauceTitle(String str) {
        z65.h(str, "title");
        getSauceTitle().setText(str);
    }

    public final void showError() {
        un3.k(getSauceError());
    }

    public final void showImage(String str) {
        z65.h(str, "imageUrl");
        b.u(getSauceIcon()).t(str).d().G0(getSauceIcon());
    }
}
