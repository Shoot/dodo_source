package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dPresenter;
/* compiled from: Secure3dModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lg3a;", "", "Lf63;", "dodoRouter", "Lj2c;", "vpnChecker", "Lgc;", "analytics", "Lrs7;", "authorizationParams", "Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: g3a  reason: default package */
/* loaded from: classes3.dex */
public final class g3a {
    public static final g3a a = new g3a();

    private g3a() {
    }

    public final Secure3dPresenter a(f63 f63Var, j2c j2cVar, gc gcVar, rs7 rs7Var) {
        z65.h(f63Var, "dodoRouter");
        z65.h(j2cVar, "vpnChecker");
        z65.h(gcVar, "analytics");
        z65.h(rs7Var, "authorizationParams");
        return new Secure3dPresenter(rs7Var, j2cVar, gcVar, f63Var);
    }
}
