package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.f;
/* compiled from: PaymentMethodListModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J0\u0010\u0019\u001a\u00020\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\u0012\u0010\u001b\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u001aH\u0007¨\u0006\u001e"}, d2 = {"Lqt7;", "", "Lt41;", "checkoutDetailsService", "Lew7;", "paymentService", "Lt52;", "customerService", "Lz7b;", "taxPayerIdService", "Lgc;", "analytics", "Lvg7;", "orderPizzeriaStateService", "Lot7;", "a", "Lcl2;", "Let7;", "dataSet", "interactor", "Lut7;", "router", "", "isCarryoutOrRestaurant", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "b", "Lf63;", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qt7  reason: default package */
/* loaded from: classes3.dex */
public final class qt7 {
    public static final qt7 a = new qt7();

    private qt7() {
    }

    public final ot7 a(t41 t41Var, ew7 ew7Var, t52 t52Var, z7b z7bVar, gc gcVar, vg7 vg7Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(ew7Var, "paymentService");
        z65.h(t52Var, "customerService");
        z65.h(z7bVar, "taxPayerIdService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        return new pt7(t41Var, ew7Var, t52Var, z7bVar, gcVar, vg7Var);
    }

    public final PaymentMethodListPresenter b(cl2<et7> cl2Var, ot7 ot7Var, ut7 ut7Var, boolean z) {
        z65.h(cl2Var, "dataSet");
        z65.h(ot7Var, "interactor");
        z65.h(ut7Var, "router");
        return new PaymentMethodListPresenter(cl2Var, ot7Var, ut7Var, z);
    }

    public final ut7 c(f63 f63Var) {
        z65.h(f63Var, "router");
        return new f(f63Var);
    }
}
