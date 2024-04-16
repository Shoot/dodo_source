package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter;
/* compiled from: CardPaymentModule.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JB\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u0018"}, d2 = {"Lhp0;", "", "Lvo0;", "cardChargeService", "Lep0;", "a", "Lf63;", "flowRouter", "interactor", "Lava;", "stateProvider", "Lhq3;", "featureService", "Lj2c;", "vpnChecker", "Lgc;", "analytics", "Lnp0;", "router", "Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", c.a, "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hp0  reason: default package */
/* loaded from: classes3.dex */
public final class hp0 {
    public static final hp0 a = new hp0();

    private hp0() {
    }

    public final ep0 a(vo0 vo0Var) {
        z65.h(vo0Var, "cardChargeService");
        return new fp0(vo0Var);
    }

    public final np0 b(f63 f63Var) {
        z65.h(f63Var, "flowRouter");
        return new op0(f63Var);
    }

    public final CardPaymentPresenter c(f63 f63Var, ep0 ep0Var, ava avaVar, hq3 hq3Var, j2c j2cVar, gc gcVar, np0 np0Var) {
        z65.h(f63Var, "flowRouter");
        z65.h(ep0Var, "interactor");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(j2cVar, "vpnChecker");
        z65.h(gcVar, "analytics");
        z65.h(np0Var, "router");
        return new CardPaymentPresenter(f63Var, ep0Var, avaVar, hq3Var, j2cVar, gcVar, np0Var);
    }
}
