package ru.dodopizza.app.presentation.product.card.variable.topping;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.card.MaterialCardView;
import defpackage.h83;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: ToppingViewHolder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\b\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u000b\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/topping/ToppingViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "setChecked", "setUnChecked", "", "imageUrl", "setImage", "title", "setTitle", "Lhn6;", "price", "setPrice", "Lkotlin/Function0;", "onClickListener", "setOnCardClickListener", "disableCard", "enableCard", "Lcom/google/android/material/card/MaterialCardView;", "cardView$delegate", "Lk79;", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "cardView", "Landroid/widget/ImageView;", "imageView$delegate", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "price$delegate", "getPrice", "lastImageUrl", "Ljava/lang/String;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ToppingViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ToppingViewHolder.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(ToppingViewHolder.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ToppingViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ToppingViewHolder.class, "price", "getPrice()Landroid/widget/TextView;", 0))};
    private static final a Companion = new a(null);
    @Deprecated
    public static final float DISABLE_IMAGE_ALPHA = 0.2f;
    @Deprecated
    public static final float ENABLE_IMAGE_ALPHA = 1.0f;
    private final k79 cardView$delegate;
    private final k79 imageView$delegate;
    private String lastImageUrl;
    private final k79 price$delegate;
    private final k79 title$delegate;

    /* compiled from: ToppingViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/topping/ToppingViewHolder$a;", "", "", "DISABLE_IMAGE_ALPHA", "F", "ENABLE_IMAGE_ALPHA", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ToppingViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
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
    public ToppingViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.layout_topping_item);
        z65.h(kzbVar, "viewInflater");
        this.cardView$delegate = kb0.g(this, R.id.topping_card_view);
        this.imageView$delegate = kb0.g(this, R.id.topping_image);
        this.title$delegate = kb0.g(this, R.id.topping_title);
        this.price$delegate = kb0.g(this, R.id.topping_price);
    }

    private final MaterialCardView getCardView() {
        return (MaterialCardView) this.cardView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getPrice() {
        return (TextView) this.price$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void disableCard() {
        getCardView().setEnabled(false);
        getImageView().setAlpha(0.2f);
        un3.q(getImageView());
        getTitle().setEnabled(false);
        getPrice().setEnabled(false);
    }

    public final void enableCard() {
        getCardView().setEnabled(true);
        getImageView().setAlpha(1.0f);
        un3.p(getImageView());
        getTitle().setEnabled(true);
        getPrice().setEnabled(true);
    }

    public final void setChecked() {
        getCardView().setChecked(true);
    }

    public final void setImage(String str) {
        z65.h(str, "imageUrl");
        if (!z65.c(this.lastImageUrl, str)) {
            this.lastImageUrl = str;
            int dimensionPixelSize = getImageView().getContext().getResources().getDimensionPixelSize(R.dimen.topping_image_size);
            com.bumptech.glide.b.u(getImageView()).t(str).o0(new fj9(dimensionPixelSize, dimensionPixelSize)).a0(R.drawable.ic_product_placeholder).T0(o83.j(new h83.a().b(true).a())).G0(getImageView());
        }
    }

    public final void setOnCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClickListener");
        oma.a(getCardView(), new b(function0));
    }

    public final void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getPrice().setText(un6.b(hn6Var));
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }

    public final void setUnChecked() {
        getCardView().setChecked(false);
    }
}
