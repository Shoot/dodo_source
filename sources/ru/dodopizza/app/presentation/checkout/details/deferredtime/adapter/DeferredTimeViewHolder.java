package ru.dodopizza.app.presentation.checkout.details.deferredtime.adapter;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.details.deferredtime.adapter.DeferredTimeViewHolder;
/* compiled from: DeferredTimeViewHolder.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/deferredtime/adapter/DeferredTimeViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "setFasterText", "setAnotherTimeText", "", CrashHianalyticsData.TIME, "setTime", "Lkotlin/Function0;", "listener", "setOnClickListener", "", "isSelected", "setSelected", "isProgress", "setProgress", "Landroid/view/View;", "progress$delegate", "Lk79;", "getProgress", "()Landroid/view/View;", "progress", "Lcom/google/android/material/card/MaterialCardView;", "cardView$delegate", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "cardView", "Landroid/widget/TextView;", "text$delegate", "getText", "()Landroid/widget/TextView;", "text", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeferredTimeViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeferredTimeViewHolder.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(DeferredTimeViewHolder.class, "text", "getText()Landroid/widget/TextView;", 0))};
    public static final a Companion = new a(null);
    private static final float LOADING_STATE_ALPHA = 0.3f;
    private final k79 cardView$delegate;
    private final Handler handler;
    private final k79 progress$delegate;
    private final k79 text$delegate;

    /* compiled from: DeferredTimeViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/deferredtime/adapter/DeferredTimeViewHolder$a;", "", "", "LOADING_STATE_ALPHA", "F", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DeferredTimeViewHolder.kt */
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
    public DeferredTimeViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.checkout_deferred_time_item);
        z65.h(kzbVar, "viewInflater");
        this.progress$delegate = kb0.g(this, R.id.progress);
        this.cardView$delegate = kb0.g(this, R.id.card_view);
        this.text$delegate = kb0.g(this, R.id.deferred_time_value);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final MaterialCardView getCardView() {
        return (MaterialCardView) this.cardView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final View getProgress() {
        return (View) this.progress$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getText() {
        return (TextView) this.text$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$0(DeferredTimeViewHolder deferredTimeViewHolder) {
        z65.h(deferredTimeViewHolder, "this$0");
        un3.e(deferredTimeViewHolder.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$1(DeferredTimeViewHolder deferredTimeViewHolder) {
        z65.h(deferredTimeViewHolder, "this$0");
        un3.k(deferredTimeViewHolder.getProgress());
    }

    public final void setAnotherTimeText() {
        getText().setText(jzb.a(this, R.string.checkout_deferred_time_another));
    }

    public final void setFasterText() {
        getText().setText(jzb.a(this, R.string.checkout_deferred_time_faster));
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new b(function0));
    }

    public final void setProgress(boolean z) {
        if (z) {
            un3.k(getProgress());
            this.handler.post(new Runnable() { // from class: st2
                @Override // java.lang.Runnable
                public final void run() {
                    DeferredTimeViewHolder.setProgress$lambda$0(DeferredTimeViewHolder.this);
                }
            });
            this.handler.post(new Runnable() { // from class: tt2
                @Override // java.lang.Runnable
                public final void run() {
                    DeferredTimeViewHolder.setProgress$lambda$1(DeferredTimeViewHolder.this);
                }
            });
            getText().setAlpha(LOADING_STATE_ALPHA);
            return;
        }
        getText().setAlpha(1.0f);
        un3.e(getProgress());
    }

    public final void setSelected(boolean z) {
        getCardView().setChecked(z);
    }

    public final void setTime(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        getText().setText(str);
    }
}
