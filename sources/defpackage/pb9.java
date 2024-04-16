package defpackage;

import com.dodopizza.loyalty.referralsystem.adapter.ReferralSystemHistoryOperationViewHolder;
import kotlin.Metadata;
/* compiled from: ReferralSystemHistoryOperationBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lpb9;", "Loyb;", "Lcom/dodopizza/loyalty/referralsystem/adapter/ReferralSystemHistoryOperationViewHolder;", "Lsa9;", "view", "data", "", "position", "", "f", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pb9  reason: default package */
/* loaded from: classes2.dex */
public final class pb9 extends oyb<ReferralSystemHistoryOperationViewHolder, sa9> {
    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(ReferralSystemHistoryOperationViewHolder referralSystemHistoryOperationViewHolder, sa9 sa9Var, int i) {
        z65.h(referralSystemHistoryOperationViewHolder, "view");
        z65.h(sa9Var, "data");
        referralSystemHistoryOperationViewHolder.setAmount(sa9Var.b());
        referralSystemHistoryOperationViewHolder.setOperationDate(sa9Var.a());
    }
}
