package defpackage;

import com.dodopizza.loyalty.history.adapter.LoyaltyHistoryOperationViewHolder;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryOperationBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lp06;", "Loyb;", "Lcom/dodopizza/loyalty/history/adapter/LoyaltyHistoryOperationViewHolder;", "Lr06;", "view", "data", "", "position", "", "f", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p06  reason: default package */
/* loaded from: classes2.dex */
public final class p06 extends oyb<LoyaltyHistoryOperationViewHolder, r06> {

    /* compiled from: LoyaltyHistoryOperationBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p06$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gb7.values().length];
            try {
                iArr[gb7.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gb7.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gb7.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(LoyaltyHistoryOperationViewHolder loyaltyHistoryOperationViewHolder, r06 r06Var, int i) {
        z65.h(loyaltyHistoryOperationViewHolder, "view");
        z65.h(r06Var, "data");
        loyaltyHistoryOperationViewHolder.setOperationTitle(r06Var.d().a());
        int i2 = a.$EnumSwitchMapping$0[r06Var.e().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                loyaltyHistoryOperationViewHolder.setMinusAmount(r06Var.a());
            }
        } else {
            loyaltyHistoryOperationViewHolder.setPlusAmount(r06Var.a());
        }
        loyaltyHistoryOperationViewHolder.setOperationDate(r06Var.b());
        if (r06Var.f()) {
            loyaltyHistoryOperationViewHolder.showExpirationDate(r06Var.c());
            loyaltyHistoryOperationViewHolder.showExtraCashBackOperation();
            return;
        }
        loyaltyHistoryOperationViewHolder.hideExpirationDate();
        loyaltyHistoryOperationViewHolder.hideExtraCashBackOperation();
    }
}
