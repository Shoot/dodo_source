package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PersonalOffersModule.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007JH\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\"\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0007J\b\u0010\u001c\u001a\u00020\u000eH\u0007¨\u0006\u001f"}, d2 = {"Lc18;", "", "Lkx1;", "a", "La18;", "interactor", "Lnfa;", "setPromoCodeInteractor", "Lgc;", "analytics", "Lo08;", "personalOffersData", "Lk63;", "domainEvents", "Ly18;", "personalToCollaborationVOConverter", "Li00;", "authorizationState", "Lhq3;", "featureService", "Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", c.a, "Lt52;", "customerService", "Ll08;", "personalOfferConverter", "ioDispatcher", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c18  reason: default package */
/* loaded from: classes2.dex */
public final class c18 {
    public static final c18 a = new c18();

    private c18() {
    }

    public final kx1 a() {
        return v33.b();
    }

    public final a18 b(t52 t52Var, l08 l08Var, kx1 kx1Var) {
        z65.h(t52Var, "customerService");
        z65.h(l08Var, "personalOfferConverter");
        z65.h(kx1Var, "ioDispatcher");
        return new b18(t52Var, l08Var, kx1Var);
    }

    public final PersonalOffersPresenter c(a18 a18Var, nfa nfaVar, gc gcVar, o08 o08Var, k63 k63Var, y18 y18Var, i00 i00Var, hq3 hq3Var) {
        z65.h(a18Var, "interactor");
        z65.h(nfaVar, "setPromoCodeInteractor");
        z65.h(gcVar, "analytics");
        z65.h(o08Var, "personalOffersData");
        z65.h(k63Var, "domainEvents");
        z65.h(y18Var, "personalToCollaborationVOConverter");
        z65.h(i00Var, "authorizationState");
        z65.h(hq3Var, "featureService");
        return new PersonalOffersPresenter(a18Var, nfaVar, gcVar, o08Var, k63Var, y18Var, i00Var, hq3Var, null, 256, null);
    }

    public final y18 d() {
        return new y18();
    }
}
