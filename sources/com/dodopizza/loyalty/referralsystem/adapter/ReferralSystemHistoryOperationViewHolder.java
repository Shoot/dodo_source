package com.dodopizza.loyalty.referralsystem.adapter;

import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: ReferralSystemHistoryOperationViewHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/loyalty/referralsystem/adapter/ReferralSystemHistoryOperationViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "dateMillis", "", "setOperationDate", "amount", "setAmount", "Landroid/widget/TextView;", "operationDateTitle$delegate", "Lk79;", "getOperationDateTitle", "()Landroid/widget/TextView;", "operationDateTitle", "operationAmountTitle$delegate", "getOperationAmountTitle", "operationAmountTitle", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReferralSystemHistoryOperationViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ReferralSystemHistoryOperationViewHolder.class, "operationDateTitle", "getOperationDateTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ReferralSystemHistoryOperationViewHolder.class, "operationAmountTitle", "getOperationAmountTitle()Landroid/widget/TextView;", 0))};
    private final k79 operationAmountTitle$delegate;
    private final k79 operationDateTitle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralSystemHistoryOperationViewHolder(kzb kzbVar) {
        super(kzbVar, ez8.item_referrer_history);
        z65.h(kzbVar, "viewInflater");
        this.operationDateTitle$delegate = kb0.g(this, ey8.referrer_history_item_title);
        this.operationAmountTitle$delegate = kb0.g(this, ey8.referrer_history_item_amount);
    }

    private final TextView getOperationAmountTitle() {
        return (TextView) this.operationAmountTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getOperationDateTitle() {
        return (TextView) this.operationDateTitle$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setAmount(long j) {
        getOperationAmountTitle().setText(getOperationAmountTitle().getContext().getString(p09.x, String.valueOf(j)));
    }

    public final void setOperationDate(long j) {
        getOperationDateTitle().setText(chb.b(j));
    }
}
