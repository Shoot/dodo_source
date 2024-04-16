package defpackage;

import com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter;
import kotlin.Metadata;
/* compiled from: SpecialOfferModule.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¨\u0006\u001b"}, d2 = {"Lnra;", "", "Ltra;", "specialOffer", "Lcq8;", "sender", "Lnfa;", "setPromoCodeInteractor", "Lkp8;", "router", "Li00;", "authorizationState", "Lgc;", "analytics", "Ljra;", "interactor", "Laub;", "urlValidator", "Lbq;", "applyedPromoOfferRepository", "Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", "b", "Lah6;", "menuService", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nra  reason: default package */
/* loaded from: classes2.dex */
public final class nra {
    public static final nra a = new nra();

    private nra() {
    }

    public final jra a(ah6 ah6Var) {
        z65.h(ah6Var, "menuService");
        return new kra(ah6Var);
    }

    public final SpecialOfferDialogPresenter b(tra traVar, cq8 cq8Var, nfa nfaVar, kp8 kp8Var, i00 i00Var, gc gcVar, jra jraVar, aub aubVar, bq bqVar) {
        z65.h(traVar, "specialOffer");
        z65.h(cq8Var, "sender");
        z65.h(nfaVar, "setPromoCodeInteractor");
        z65.h(kp8Var, "router");
        z65.h(i00Var, "authorizationState");
        z65.h(gcVar, "analytics");
        z65.h(jraVar, "interactor");
        z65.h(aubVar, "urlValidator");
        z65.h(bqVar, "applyedPromoOfferRepository");
        return new SpecialOfferDialogPresenter(traVar, cq8Var, nfaVar, i00Var, gcVar, jraVar, aubVar, bqVar, kp8Var);
    }
}
