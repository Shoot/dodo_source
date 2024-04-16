package ru.dodopizza.app.presentation.product.card.combo;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.card.MaterialCardView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.product.card.combo.BuyMoreViewHolder;
/* compiled from: BuyMoreViewHolder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/BuyMoreViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "Lhn6;", "price", "setPrice", "Lkotlin/Function0;", "listener", "setClickListener", "imageUrl", "setImage", "", "selected", "setSelection", "Landroid/widget/TextView;", "name$delegate", "Lk79;", "getName", "()Landroid/widget/TextView;", "price$delegate", "getPrice", "Landroidx/appcompat/widget/AppCompatImageView;", "image$delegate", "getImage", "()Landroidx/appcompat/widget/AppCompatImageView;", ElementGenerator.TYPE_IMAGE, "Lcom/google/android/material/card/MaterialCardView;", "layout$delegate", "getLayout", "()Lcom/google/android/material/card/MaterialCardView;", "layout", "Lkzb;", "inflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BuyMoreViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(BuyMoreViewHolder.class, Action.NAME_ATTRIBUTE, "getName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(BuyMoreViewHolder.class, "price", "getPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(BuyMoreViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroidx/appcompat/widget/AppCompatImageView;", 0)), bc9.f(new ar8(BuyMoreViewHolder.class, "layout", "getLayout()Lcom/google/android/material/card/MaterialCardView;", 0))};
    private final k79 image$delegate;
    private final k79 layout$delegate;
    private final k79 name$delegate;
    private final k79 price$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyMoreViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_buy_more);
        z65.h(kzbVar, "inflater");
        this.name$delegate = kb0.g(this, R.id.buy_more_item_name);
        this.price$delegate = kb0.g(this, R.id.buy_more_item_price);
        this.image$delegate = kb0.g(this, R.id.buy_more_item_image);
        this.layout$delegate = kb0.g(this, R.id.container);
    }

    private final AppCompatImageView getImage() {
        return (AppCompatImageView) this.image$delegate.a(this, $$delegatedProperties[2]);
    }

    private final MaterialCardView getLayout() {
        return (MaterialCardView) this.layout$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getName() {
        return (TextView) this.name$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getPrice() {
        return (TextView) this.price$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$0(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final void setClickListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        getLayout().setOnClickListener(new View.OnClickListener() { // from class: kj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuyMoreViewHolder.setClickListener$lambda$0(Function0.this, view);
            }
        });
    }

    public final void setImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getImage()).t(str).a0(R.drawable.ic_product_placeholder).G0(getImage());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getName().setText(str);
    }

    public final void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getPrice().setText(un6.b(hn6Var));
    }

    public final void setSelection(boolean z) {
        getLayout().setChecked(z);
    }
}
