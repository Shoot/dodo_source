package com.dodopizza.order.feature.personaloffer.presentantion.adapter.failstate;

import android.view.View;
import android.widget.Button;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PersonalOffersFailStateViewHolder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/failstate/PersonalOffersFailStateViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkotlin/Function0;", "", "listener", "setOnRetryClickListener", "Landroid/widget/Button;", "retryButton$delegate", "Lk79;", "getRetryButton", "()Landroid/widget/Button;", "retryButton", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PersonalOffersFailStateViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PersonalOffersFailStateViewHolder.class, "retryButton", "getRetryButton()Landroid/widget/Button;", 0))};
    public static final int $stable = 8;
    private final k79 retryButton$delegate;

    /* compiled from: PersonalOffersFailStateViewHolder.kt */
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
    public PersonalOffersFailStateViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_personal_offer_fail_state);
        z65.h(kzbVar, "viewInflater");
        this.retryButton$delegate = kb0.g(this, gy8.profile_retry_personal_offer_loading_button);
    }

    private final Button getRetryButton() {
        return (Button) this.retryButton$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setOnRetryClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getRetryButton(), new a(function0));
    }
}
