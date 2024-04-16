package defpackage;

import com.dodopizza.loyalty.menu.LoyaltyPresenter;
import kotlin.Metadata;
/* compiled from: LoyaltyModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lw16;", "", "Le06;", "loyaltyData", "Ls06;", "loyaltyInteractor", "Lf63;", "router", "Lgc;", "analytics", "Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "a", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w16  reason: default package */
/* loaded from: classes2.dex */
public final class w16 {
    public static final w16 a = new w16();

    private w16() {
    }

    public final LoyaltyPresenter a(e06 e06Var, s06 s06Var, f63 f63Var, gc gcVar) {
        z65.h(e06Var, "loyaltyData");
        z65.h(s06Var, "loyaltyInteractor");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        return new LoyaltyPresenter(e06Var, s06Var, f63Var, gcVar, null, 16, null);
    }
}
