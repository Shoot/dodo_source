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
/* compiled from: DeferredTimeIntervalViewHolder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0014\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u001f¨\u0006("}, d2 = {"Lru/dodopizza/app/presentation/checkout/deferredtime/adapter/DeferredTimeIntervalViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "setDisabled", "setEnabled", "setSelected", "setUnselected", "", CrashHianalyticsData.TIME, "setIntervalTitle", "comment", "setIntervalComment", "showIntervalComment", "hideIntervalComment", "Lkotlin/Function0;", "listener", "setOnItemClickListener", "Lcom/google/android/material/card/MaterialCardView;", "cardView$delegate", "Lk79;", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "cardView", "Landroid/widget/ImageView;", "checkedIcon$delegate", "getCheckedIcon", "()Landroid/widget/ImageView;", "checkedIcon", "Landroid/widget/TextView;", "intervalTitle$delegate", "getIntervalTitle", "()Landroid/widget/TextView;", "intervalTitle", "intervalComment$delegate", "getIntervalComment", "intervalComment", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeferredTimeIntervalViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeferredTimeIntervalViewHolder.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(DeferredTimeIntervalViewHolder.class, "checkedIcon", "getCheckedIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DeferredTimeIntervalViewHolder.class, "intervalTitle", "getIntervalTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeferredTimeIntervalViewHolder.class, "intervalComment", "getIntervalComment()Landroid/widget/TextView;", 0))};
    private final k79 cardView$delegate;
    private final k79 checkedIcon$delegate;
    private final k79 intervalComment$delegate;
    private final k79 intervalTitle$delegate;

    /* compiled from: DeferredTimeIntervalViewHolder.kt */
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
    public DeferredTimeIntervalViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.deferred_time_interval_item);
        z65.h(kzbVar, "viewInflater");
        this.cardView$delegate = kb0.g(this, R.id.deferred_time_card_view);
        this.checkedIcon$delegate = kb0.g(this, R.id.deferred_time_checked_icon);
        this.intervalTitle$delegate = kb0.g(this, R.id.deferred_time_title);
        this.intervalComment$delegate = kb0.g(this, R.id.deferred_time_comment_text);
    }

    private final MaterialCardView getCardView() {
        return (MaterialCardView) this.cardView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getCheckedIcon() {
        return (ImageView) this.checkedIcon$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getIntervalComment() {
        return (TextView) this.intervalComment$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getIntervalTitle() {
        return (TextView) this.intervalTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void hideIntervalComment() {
        un3.e(getIntervalComment());
    }

    public final void setDisabled() {
        getCardView().setEnabled(false);
        getIntervalTitle().setTextColor(iu1.c(getIntervalTitle().getContext(), R.color.textIconTertiaryColor));
        getIntervalComment().setTextColor(iu1.c(getIntervalComment().getContext(), R.color.textIconTertiaryColor));
    }

    public final void setEnabled() {
        getCardView().setEnabled(true);
        getIntervalTitle().setTextColor(iu1.c(getIntervalTitle().getContext(), R.color.textIconPrimaryColor));
        getIntervalComment().setTextColor(iu1.c(getIntervalComment().getContext(), R.color.textIconSecondaryColor));
    }

    public final void setIntervalComment(String str) {
        z65.h(str, "comment");
        getIntervalComment().setText(str);
    }

    public final void setIntervalTitle(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        getIntervalTitle().setText(str);
    }

    public final void setOnItemClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getCardView(), new a(function0));
    }

    public final void setSelected() {
        getCardView().setChecked(true);
        un3.k(getCheckedIcon());
    }

    public final void setUnselected() {
        getCardView().setChecked(false);
        un3.e(getCheckedIcon());
    }

    public final void showIntervalComment() {
        un3.k(getIntervalComment());
    }
}
