package defpackage;

import com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter;
import kotlin.Metadata;
/* compiled from: CompletedOrderInfoModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lol1;", "", "Lli7;", "orderService", "Lnl1;", "a", "Lll1;", "data", "interactor", "Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "b", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ol1  reason: default package */
/* loaded from: classes.dex */
public final class ol1 {
    public static final ol1 a = new ol1();

    private ol1() {
    }

    public final nl1 a(li7 li7Var) {
        z65.h(li7Var, "orderService");
        return new nl1(li7Var, null, 2, null);
    }

    public final CompletedOrderInfoPresenter b(ll1 ll1Var, nl1 nl1Var) {
        z65.h(ll1Var, "data");
        z65.h(nl1Var, "interactor");
        return new CompletedOrderInfoPresenter(ll1Var, nl1Var);
    }
}
