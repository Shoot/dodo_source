package com.dodopizza.loyalty.history.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryOperationViewHolder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010(¨\u00061"}, d2 = {"Lcom/dodopizza/loyalty/history/adapter/LoyaltyHistoryOperationViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setOperationTitle", "", "dateMillis", "setOperationDate", "amount", "setPlusAmount", "setMinusAmount", "expirationDateMillis", "showExpirationDate", "hideExpirationDate", "showExtraCashBackOperation", "hideExtraCashBackOperation", "Landroid/widget/TextView;", "expirationDateTitle$delegate", "Lk79;", "getExpirationDateTitle", "()Landroid/widget/TextView;", "expirationDateTitle", "operationTitle$delegate", "getOperationTitle", "operationTitle", "operationDateTitle$delegate", "getOperationDateTitle", "operationDateTitle", "Landroidx/cardview/widget/CardView;", "amountContainer$delegate", "getAmountContainer", "()Landroidx/cardview/widget/CardView;", "amountContainer", "operationAmount$delegate", "getOperationAmount", "operationAmount", "Landroid/widget/ImageView;", "extraCashbackIcon$delegate", "getExtraCashbackIcon", "()Landroid/widget/ImageView;", "extraCashbackIcon", "amountIcon$delegate", "getAmountIcon", "amountIcon", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyHistoryOperationViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "expirationDateTitle", "getExpirationDateTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "operationTitle", "getOperationTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "operationDateTitle", "getOperationDateTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "amountContainer", "getAmountContainer()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "operationAmount", "getOperationAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "extraCashbackIcon", "getExtraCashbackIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyHistoryOperationViewHolder.class, "amountIcon", "getAmountIcon()Landroid/widget/ImageView;", 0))};
    private final k79 amountContainer$delegate;
    private final k79 amountIcon$delegate;
    private final k79 expirationDateTitle$delegate;
    private final k79 extraCashbackIcon$delegate;
    private final k79 operationAmount$delegate;
    private final k79 operationDateTitle$delegate;
    private final k79 operationTitle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyHistoryOperationViewHolder(kzb kzbVar) {
        super(kzbVar, ez8.item_loyalty_history);
        z65.h(kzbVar, "viewInflater");
        this.expirationDateTitle$delegate = kb0.g(this, ey8.loyalty_history_item_expiration_date);
        this.operationTitle$delegate = kb0.g(this, ey8.loyalty_history_item_title);
        this.operationDateTitle$delegate = kb0.g(this, ey8.loyalty_history_item_date);
        this.amountContainer$delegate = kb0.g(this, ey8.loyalty_history_item_amount_container);
        this.operationAmount$delegate = kb0.g(this, ey8.loyalty_history_item_amount);
        this.extraCashbackIcon$delegate = kb0.g(this, ey8.loyalty_history_item_extra_cashback_icon);
        this.amountIcon$delegate = kb0.g(this, ey8.loyalty_history_item_amount_icon);
    }

    private final CardView getAmountContainer() {
        return (CardView) this.amountContainer$delegate.a(this, $$delegatedProperties[3]);
    }

    private final ImageView getAmountIcon() {
        return (ImageView) this.amountIcon$delegate.a(this, $$delegatedProperties[6]);
    }

    private final TextView getExpirationDateTitle() {
        return (TextView) this.expirationDateTitle$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getExtraCashbackIcon() {
        return (ImageView) this.extraCashbackIcon$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getOperationAmount() {
        return (TextView) this.operationAmount$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getOperationDateTitle() {
        return (TextView) this.operationDateTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getOperationTitle() {
        return (TextView) this.operationTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void hideExpirationDate() {
        un3.e(getExpirationDateTitle());
    }

    public final void hideExtraCashBackOperation() {
        getAmountContainer().setCardBackgroundColor(0);
        un3.e(getExtraCashbackIcon());
        TextView operationAmount = getOperationAmount();
        Context context = getOperationAmount().getContext();
        int i = ow8.e;
        operationAmount.setTextColor(iu1.c(context, i));
        getAmountIcon().setImageTintList(iu1.d(getOperationAmount().getContext(), i));
    }

    public final void setMinusAmount(long j) {
        getOperationAmount().setText(getOperationAmount().getContext().getString(p09.minus_label, String.valueOf(j)));
    }

    public final void setOperationDate(long j) {
        getOperationDateTitle().setText(chb.b(j));
    }

    public final void setOperationTitle(String str) {
        z65.h(str, "title");
        getOperationTitle().setText(str);
    }

    public final void setPlusAmount(long j) {
        getOperationAmount().setText(getOperationAmount().getContext().getString(p09.x, String.valueOf(j)));
    }

    public final void showExpirationDate(long j) {
        String string = getExpirationDateTitle().getContext().getString(p09.loylaty_history_operation_expire_time, chb.a(j));
        z65.g(string, "getString(...)");
        getExpirationDateTitle().setText(string);
        un3.k(getExpirationDateTitle());
    }

    public final void showExtraCashBackOperation() {
        getAmountContainer().setCardBackgroundColor(iu1.d(getAmountContainer().getContext(), ow8.e));
        un3.k(getExtraCashbackIcon());
        TextView operationAmount = getOperationAmount();
        Context context = getOperationAmount().getContext();
        int i = ow8.o;
        operationAmount.setTextColor(iu1.c(context, i));
        getAmountIcon().setImageTintList(iu1.d(getOperationAmount().getContext(), i));
    }
}
