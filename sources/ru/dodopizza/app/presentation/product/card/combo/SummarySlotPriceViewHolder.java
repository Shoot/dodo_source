package ru.dodopizza.app.presentation.product.card.combo;

import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: SummarySlotPriceViewHolder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/SummarySlotPriceViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "comboName", "", "setSlotName", "Lhn6;", "comboPrice", "setSlotPrice", "Landroid/widget/TextView;", "summarySlotName$delegate", "Lk79;", "getSummarySlotName", "()Landroid/widget/TextView;", "summarySlotName", "summarySlotPrice$delegate", "getSummarySlotPrice", "summarySlotPrice", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SummarySlotPriceViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SummarySlotPriceViewHolder.class, "summarySlotName", "getSummarySlotName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(SummarySlotPriceViewHolder.class, "summarySlotPrice", "getSummarySlotPrice()Landroid/widget/TextView;", 0))};
    private final k79 summarySlotName$delegate;
    private final k79 summarySlotPrice$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySlotPriceViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.combo_product_card_summary_slot_price);
        z65.h(kzbVar, "viewInflater");
        this.summarySlotName$delegate = kb0.g(this, R.id.slot_name);
        this.summarySlotPrice$delegate = kb0.g(this, R.id.slot_extra_price);
    }

    private final TextView getSummarySlotName() {
        return (TextView) this.summarySlotName$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSummarySlotPrice() {
        return (TextView) this.summarySlotPrice$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setSlotName(String str) {
        z65.h(str, "comboName");
        getSummarySlotName().setText(str);
    }

    public final void setSlotPrice(hn6 hn6Var) {
        z65.h(hn6Var, "comboPrice");
        getSummarySlotPrice().setText(getSummarySlotPrice().getContext().getString(R.string.plus_label_with_space, un6.b(hn6Var)));
    }
}
