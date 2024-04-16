package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter;
/* compiled from: CatchAddressModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J4\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¨\u0006\u001b"}, d2 = {"Lnt0;", "", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Lx42;", "customerAddressService", "Lvg7;", "orderPizzeriaStateService", "Lgc;", "analytics", "Lh8;", "addressFormatter", "Llt0;", "a", "", "addressId", "", "isCarryout", "Lf63;", "dodoRouter", "interactor", "Li00;", "authorizationState", "Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nt0  reason: default package */
/* loaded from: classes3.dex */
public final class nt0 {
    public static final nt0 a = new nt0();

    private nt0() {
    }

    public final lt0 a(DodopizzaApi dodopizzaApi, x42 x42Var, vg7 vg7Var, gc gcVar, h8 h8Var) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(x42Var, "customerAddressService");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(gcVar, "analytics");
        z65.h(h8Var, "addressFormatter");
        return new mt0(dodopizzaApi, x42Var, gcVar, h8Var, vg7Var);
    }

    public final CatchAddressPresenter b(String str, boolean z, f63 f63Var, lt0 lt0Var, i00 i00Var) {
        z65.h(str, "addressId");
        z65.h(f63Var, "dodoRouter");
        z65.h(lt0Var, "interactor");
        z65.h(i00Var, "authorizationState");
        return new CatchAddressPresenter(z, str, f63Var, lt0Var, i00Var);
    }
}
