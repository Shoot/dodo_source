package ru.dodopizza.app.presentation.profile.adapter.widgets;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: LoyaltyWidgetViewHolder.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0010\u001a\u00020\u0002J\u0014\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\"R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lru/dodopizza/app/presentation/profile/adapter/widgets/LoyaltyWidgetViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "showAttentionIcon", "hideAttentionIcon", "", "text", "setTitleText", "showBalanceTitle", "hideBalanceTitle", "showSubtitle", "hideSubtitle", "", "", "icons", "showParallaxIcon", "hideParallaxIcon", "Lkotlin/Function0;", "clickListener", "setCardClickListener", "Landroid/view/View;", "profileWidget$delegate", "Lk79;", "getProfileWidget", "()Landroid/view/View;", "profileWidget", "Landroid/widget/ImageView;", "attentionIcon$delegate", "getAttentionIcon", "()Landroid/widget/ImageView;", "attentionIcon", "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "balanceTitle$delegate", "getBalanceTitle", "balanceTitle", "subtitle$delegate", "getSubtitle", "subtitle", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "parallaxView$delegate", "getParallaxView", "()Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "parallaxView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoyaltyWidgetViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "profileWidget", "getProfileWidget()Landroid/view/View;", 0)), bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "attentionIcon", "getAttentionIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "balanceTitle", "getBalanceTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyWidgetViewHolder.class, "parallaxView", "getParallaxView()Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", 0))};
    private final k79 attentionIcon$delegate;
    private final k79 balanceTitle$delegate;
    private final k79 parallaxView$delegate;
    private final k79 profileWidget$delegate;
    private final k79 subtitle$delegate;
    private final k79 title$delegate;

    /* compiled from: LoyaltyWidgetViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
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

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ ImageView b;

        public b(View view, ImageView imageView) {
            this.a = view;
            this.b = imageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Matrix matrix = new Matrix();
            Drawable drawable = this.b.getDrawable();
            float a = jx9.a.a(12);
            matrix.setRectToRect(new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), new RectF(0.0f, 0.0f, this.b.getWidth() + a, this.b.getHeight() + a), Matrix.ScaleToFit.CENTER);
            this.b.setScaleType(ImageView.ScaleType.MATRIX);
            this.b.setImageMatrix(matrix);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyWidgetViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_loyalty_widget);
        z65.h(kzbVar, "viewInflater");
        this.profileWidget$delegate = kb0.g(this, R.id.profile_widget);
        this.attentionIcon$delegate = kb0.g(this, R.id.loyalty_widget_attention_icon);
        this.title$delegate = kb0.g(this, R.id.loyalty_widget_title);
        this.balanceTitle$delegate = kb0.g(this, R.id.loyalty_widget_balance_title);
        this.subtitle$delegate = kb0.g(this, R.id.loyalty_widget_subtitle);
        this.parallaxView$delegate = kb0.g(this, R.id.loyalty_widget_parallax_layout);
    }

    private final ImageView getAttentionIcon() {
        return (ImageView) this.attentionIcon$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getBalanceTitle() {
        return (TextView) this.balanceTitle$delegate.a(this, $$delegatedProperties[3]);
    }

    private final ParallaxLayerLayout getParallaxView() {
        return (ParallaxLayerLayout) this.parallaxView$delegate.a(this, $$delegatedProperties[5]);
    }

    private final View getProfileWidget() {
        return (View) this.profileWidget$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void hideAttentionIcon() {
        un3.e(getAttentionIcon());
    }

    public final void hideBalanceTitle() {
        un3.e(getBalanceTitle());
    }

    public final void hideParallaxIcon() {
        un3.e(getParallaxView());
    }

    public final void hideSubtitle() {
        un3.e(getSubtitle());
    }

    public final void setCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getProfileWidget(), new a(function0));
    }

    public final void setTitleText(String str) {
        z65.h(str, "text");
        getTitle().setText(str);
    }

    public final void showAttentionIcon() {
        un3.k(getAttentionIcon());
    }

    public final void showBalanceTitle(String str) {
        z65.h(str, "text");
        un3.k(getBalanceTitle());
        getBalanceTitle().setText(str);
    }

    public final void showParallaxIcon(List<Integer> list) {
        z65.h(list, "icons");
        un3.k(getParallaxView());
        getParallaxView().removeAllViews();
        for (Number number : list) {
            int intValue = number.intValue();
            ImageView imageView = new ImageView(getParallaxView().getContext());
            imageView.setImageResource(intValue);
            z65.g(z97.a(imageView, new b(imageView, imageView)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
            getParallaxView().addView(imageView);
        }
        Context context = getParallaxView().getContext();
        z65.g(context, "getContext(...)");
        com.dodopizza.android.view.custom.parallaxlayout.a aVar = new com.dodopizza.android.view.custom.parallaxlayout.a(context);
        getParallaxView().setTranslationUpdater(aVar);
        aVar.e();
    }

    public final void showSubtitle(String str) {
        z65.h(str, "text");
        un3.k(getSubtitle());
        getSubtitle().setText(str);
    }
}
