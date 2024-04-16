package defpackage;

import com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter;
import kotlin.Metadata;
/* compiled from: PromoCodeModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0010"}, d2 = {"Lvp8;", "", "Lnfa;", "promoCodeInteractor", "Lhq3;", "featureService", "Lgc;", "analytics", "Lcq8;", "promoCodeSender", "Laq8;", "router", "Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vp8  reason: default package */
/* loaded from: classes2.dex */
public final class vp8 {
    public static final vp8 a = new vp8();

    private vp8() {
    }

    public final PromoCodePresenter a(nfa nfaVar, hq3 hq3Var, gc gcVar, cq8 cq8Var, aq8 aq8Var) {
        z65.h(nfaVar, "promoCodeInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(cq8Var, "promoCodeSender");
        z65.h(aq8Var, "router");
        return new PromoCodePresenter(nfaVar, hq3Var, gcVar, cq8Var, aq8Var);
    }
}
