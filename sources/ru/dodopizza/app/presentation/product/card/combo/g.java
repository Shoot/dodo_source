package ru.dodopizza.app.presentation.product.card.combo;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.combo.h;
/* compiled from: SummarySlotPriceBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/g;", "Loyb;", "Lru/dodopizza/app/presentation/product/card/combo/SummarySlotPriceViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/h$a;", "view", "data", "", "position", "", "f", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends oyb<SummarySlotPriceViewHolder, h.a> {
    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(SummarySlotPriceViewHolder summarySlotPriceViewHolder, h.a aVar, int i) {
        z65.h(summarySlotPriceViewHolder, "view");
        z65.h(aVar, "data");
        summarySlotPriceViewHolder.setSlotName(aVar.b());
        summarySlotPriceViewHolder.setSlotPrice(aVar.a());
    }
}
