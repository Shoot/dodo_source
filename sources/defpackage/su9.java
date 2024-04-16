package defpackage;

import com.dodopizza.order.feature.checkout.sbp.presentation.c;
import kotlin.Metadata;
/* compiled from: SbpBankListRouter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lsu9;", "", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/c;", "result", "", "a", "Lf63;", "Lf63;", "checkoutRouter", "", "b", "I", "resultSelectSbpBank", "<init>", "(Lf63;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: su9  reason: default package */
/* loaded from: classes2.dex */
public final class su9 {
    private final f63 a;
    private final int b;

    public su9(f63 f63Var) {
        z65.h(f63Var, "checkoutRouter");
        this.a = f63Var;
        this.b = gy8.select_sbp_bank_result;
    }

    public final void a(c cVar) {
        z65.h(cVar, "result");
        this.a.i(this.b, cVar);
    }
}
