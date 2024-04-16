package ru.dodopizza.app.presentation.profile.adapter.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.view.custom.badgebackgroundtextview.BadgeBackgroundTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: PersonalWidgetViewHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0006\u0010\r\u001a\u00020\u0004R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u001f¨\u0006("}, d2 = {"Lru/dodopizza/app/presentation/profile/adapter/widgets/PersonalWidgetViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "text", "", "showBadgeTitle", "hideBadgeTitle", "setTitleText", "showSubtitleText", "hideSubtitleText", "Lkotlin/Function0;", "clickListener", "setCardClickListener", "showAttractAttentionAction", "Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "badge$delegate", "Lk79;", "getBadge", "()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "badge", "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "subtitle$delegate", "getSubtitle", "subtitle", "Landroid/view/View;", "widgetClickView$delegate", "getWidgetClickView", "()Landroid/view/View;", "widgetClickView", "widgetRootView$delegate", "getWidgetRootView", "widgetRootView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PersonalWidgetViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PersonalWidgetViewHolder.class, "badge", "getBadge()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", 0)), bc9.f(new ar8(PersonalWidgetViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalWidgetViewHolder.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalWidgetViewHolder.class, "widgetClickView", "getWidgetClickView()Landroid/view/View;", 0)), bc9.f(new ar8(PersonalWidgetViewHolder.class, "widgetRootView", "getWidgetRootView()Landroid/view/View;", 0))};
    private final k79 badge$delegate;
    private final k79 subtitle$delegate;
    private final k79 title$delegate;
    private final k79 widgetClickView$delegate;
    private final k79 widgetRootView$delegate;

    /* compiled from: PersonalWidgetViewHolder.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalWidgetViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_personal_widget);
        z65.h(kzbVar, "viewInflater");
        this.badge$delegate = kb0.g(this, R.id.personal_widget_badge);
        this.title$delegate = kb0.g(this, R.id.personal_widget_title);
        this.subtitle$delegate = kb0.g(this, R.id.personal_widget_subtitle);
        this.widgetClickView$delegate = kb0.g(this, R.id.personal_widget_click_view);
        this.widgetRootView$delegate = kb0.g(this, R.id.personal_widget_root);
    }

    private final BadgeBackgroundTextView getBadge() {
        return (BadgeBackgroundTextView) this.badge$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[1]);
    }

    private final View getWidgetClickView() {
        return (View) this.widgetClickView$delegate.a(this, $$delegatedProperties[3]);
    }

    private final View getWidgetRootView() {
        return (View) this.widgetRootView$delegate.a(this, $$delegatedProperties[4]);
    }

    public final void hideBadgeTitle() {
        un3.e(getBadge());
    }

    public final void hideSubtitleText() {
        un3.e(getSubtitle());
    }

    public final void setCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getWidgetClickView(), new a(function0));
    }

    public final void setTitleText(String str) {
        z65.h(str, "text");
        getTitle().setText(str);
    }

    public final void showAttractAttentionAction() {
        View widgetRootView = getWidgetRootView();
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(widgetRootView, property, kx9.a(-12));
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(tr7.a(0.25f, 1.0f, 0.5f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getWidgetRootView(), property, 0.0f);
        ofFloat2.setDuration(280L);
        ofFloat.setInterpolator(tr7.a(0.65f, 0.0f, 0.35f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat).before(ofFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet).before(animatorSet2);
        animatorSet3.setStartDelay(650L);
        animatorSet3.start();
    }

    public final void showBadgeTitle(String str) {
        z65.h(str, "text");
        getBadge().setText(str);
        un3.k(getBadge());
    }

    public final void showSubtitleText(String str) {
        z65.h(str, "text");
        un3.k(getSubtitle());
        getSubtitle().setText(str);
    }
}
