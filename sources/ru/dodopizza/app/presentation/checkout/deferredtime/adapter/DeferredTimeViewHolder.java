package ru.dodopizza.app.presentation.checkout.deferredtime.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: DeferredTimeViewHolder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010#¨\u0006/"}, d2 = {"Lru/dodopizza/app/presentation/checkout/deferredtime/adapter/DeferredTimeViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "setDisabled", "setEnabled", "setSelected", "setUnSelected", "showASAPTitle", "", CrashHianalyticsData.TIME, "setTimeTitle", "showTooMuchTitle", "hideTooMuchTitle", "Lkotlin/Function0;", "listener", "setOnItemClickListener", "", "minutes", "showExpectedMinutesToReceiveForASAP", "hideExpectedMinutesToReceiveForASAP", "showNextDayText", "Lcom/google/android/material/card/MaterialCardView;", "cardView$delegate", "Lk79;", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "cardView", "Landroid/widget/ImageView;", "checkedIcon$delegate", "getCheckedIcon", "()Landroid/widget/ImageView;", "checkedIcon", "Landroid/widget/TextView;", "timeTitle$delegate", "getTimeTitle", "()Landroid/widget/TextView;", "timeTitle", "tooMuchTitle$delegate", "getTooMuchTitle", "tooMuchTitle", "expectedMinutesToReceiveForASAP$delegate", "getExpectedMinutesToReceiveForASAP", "expectedMinutesToReceiveForASAP", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeferredTimeViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeferredTimeViewHolder.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "checkedIcon", "getCheckedIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "timeTitle", "getTimeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "tooMuchTitle", "getTooMuchTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "expectedMinutesToReceiveForASAP", "getExpectedMinutesToReceiveForASAP()Landroid/widget/TextView;", 0))};
    private final k79 cardView$delegate;
    private final k79 checkedIcon$delegate;
    private final k79 expectedMinutesToReceiveForASAP$delegate;
    private final k79 timeTitle$delegate;
    private final k79 tooMuchTitle$delegate;

    /* compiled from: DeferredTimeViewHolder.kt */
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
    public DeferredTimeViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.deferred_time_item);
        z65.h(kzbVar, "viewInflater");
        this.cardView$delegate = kb0.g(this, R.id.deferred_time_card_view);
        this.checkedIcon$delegate = kb0.g(this, R.id.deferred_time_checked_icon);
        this.timeTitle$delegate = kb0.g(this, R.id.deferred_time_title);
        this.tooMuchTitle$delegate = kb0.g(this, R.id.deferred_time_workload_title);
        this.expectedMinutesToReceiveForASAP$delegate = kb0.g(this, R.id.expected_minutes_to_receive_for_asap);
    }

    private final MaterialCardView getCardView() {
        return (MaterialCardView) this.cardView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getCheckedIcon() {
        return (ImageView) this.checkedIcon$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getExpectedMinutesToReceiveForASAP() {
        return (TextView) this.expectedMinutesToReceiveForASAP$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getTimeTitle() {
        return (TextView) this.timeTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getTooMuchTitle() {
        return (TextView) this.tooMuchTitle$delegate.a(this, $$delegatedProperties[3]);
    }

    public final void hideExpectedMinutesToReceiveForASAP() {
        un3.e(getExpectedMinutesToReceiveForASAP());
    }

    public final void hideTooMuchTitle() {
        un3.e(getTooMuchTitle());
    }

    public final void setDisabled() {
        getCardView().setEnabled(false);
        getTimeTitle().setTextColor(iu1.c(getTimeTitle().getContext(), R.color.textIconTertiaryColor));
        getTooMuchTitle().setTextColor(iu1.c(getTimeTitle().getContext(), R.color.textIconTertiaryColor));
    }

    public final void setEnabled() {
        getCardView().setEnabled(true);
        getTimeTitle().setTextColor(iu1.c(getTimeTitle().getContext(), R.color.textIconPrimaryColor));
        getTooMuchTitle().setTextColor(iu1.c(getTimeTitle().getContext(), R.color.textIconSecondaryColor));
    }

    public final void setOnItemClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getCardView(), new a(function0));
    }

    public final void setSelected() {
        getCardView().setChecked(true);
        un3.k(getCheckedIcon());
    }

    public final void setTimeTitle(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        getTimeTitle().setText(str);
    }

    public final void setUnSelected() {
        getCardView().setChecked(false);
        un3.e(getCheckedIcon());
    }

    public final void showASAPTitle() {
        getTimeTitle().setText(getTimeTitle().getResources().getString(R.string.checkout_deferred_time_faster));
    }

    public final void showExpectedMinutesToReceiveForASAP(int i) {
        getExpectedMinutesToReceiveForASAP().setText(getExpectedMinutesToReceiveForASAP().getResources().getQuantityString(R.plurals.expected_minutes_to_receive_for_asap_plural, i, Integer.valueOf(i)));
        un3.k(getExpectedMinutesToReceiveForASAP());
    }

    public final void showNextDayText() {
        getTimeTitle().setText(jzb.a(this, R.string.deferred_time_next_day_stub_title));
    }

    public final void showTooMuchTitle() {
        un3.k(getTooMuchTitle());
    }
}
