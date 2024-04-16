package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter;
/* compiled from: CashChargeModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J(\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001b\u001a\u00020\fH\u0007¨\u0006\u001e"}, d2 = {"Lqs0;", "", "Los0;", "cashChargeInteractor", "Lf63;", "router", "Ljn6;", "moneyFactory", "Lzs0;", "cashChargeViewBinder", "Lvn6;", "moneyValidator", "Lon6;", "moneyInputFilter", "Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", e.a, "Lt41;", "checkoutDetailsService", "Lfq0;", "cartContentService", "Lmn6;", "moneyFormatterProvider", "b", "a", "Lhq3;", "featureService", DateTokenConverter.CONVERTER_KEY, c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qs0  reason: default package */
/* loaded from: classes3.dex */
public final class qs0 {
    public static final qs0 a = new qs0();

    private qs0() {
    }

    public final zs0 a() {
        return new zs0();
    }

    public final os0 b(t41 t41Var, fq0 fq0Var, jn6 jn6Var, mn6 mn6Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(fq0Var, "cartContentService");
        z65.h(jn6Var, "moneyFactory");
        z65.h(mn6Var, "moneyFormatterProvider");
        return new ps0(t41Var, fq0Var, jn6Var, mn6Var);
    }

    public final on6 c() {
        return new pn6();
    }

    public final vn6 d(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        if (hq3Var.a(bq3.d)) {
            return new jz3();
        }
        return new qn6();
    }

    public final CashChargePresenter e(os0 os0Var, f63 f63Var, jn6 jn6Var, zs0 zs0Var, vn6 vn6Var, on6 on6Var) {
        z65.h(os0Var, "cashChargeInteractor");
        z65.h(f63Var, "router");
        z65.h(jn6Var, "moneyFactory");
        z65.h(zs0Var, "cashChargeViewBinder");
        z65.h(vn6Var, "moneyValidator");
        z65.h(on6Var, "moneyInputFilter");
        return new CashChargePresenter(os0Var, f63Var, jn6Var, zs0Var, vn6Var, on6Var);
    }
}
