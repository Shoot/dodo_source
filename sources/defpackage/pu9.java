package defpackage;

import com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
/* compiled from: SbpBankListModule.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, d2 = {"Lpu9;", "", "Lcl2;", "Lou9;", "dataSet", "Llu9;", "interactor", "Lsu9;", "router", "Lgc;", "analytics", "", "sbpUrl", "Lj2c;", "vpnChecker", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", "a", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankListAPI;", "sbpBankListApi", "Lxu9;", "b", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pu9  reason: default package */
/* loaded from: classes2.dex */
public final class pu9 {
    public static final pu9 a = new pu9();

    private pu9() {
    }

    public final SbpBankListPresenter a(cl2<ou9> cl2Var, lu9 lu9Var, su9 su9Var, gc gcVar, String str, j2c j2cVar) {
        z65.h(cl2Var, "dataSet");
        z65.h(lu9Var, "interactor");
        z65.h(su9Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(str, "sbpUrl");
        z65.h(j2cVar, "vpnChecker");
        return new SbpBankListPresenter(cl2Var, lu9Var, su9Var, gcVar, str, j2cVar);
    }

    public final xu9 b(SbpBankListAPI sbpBankListAPI) {
        z65.h(sbpBankListAPI, "sbpBankListApi");
        return new yu9(sbpBankListAPI);
    }
}
