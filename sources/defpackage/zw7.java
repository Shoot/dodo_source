package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter;
/* compiled from: PaymentWorkflowBrokenModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\nH\u0007¨\u0006\u0011"}, d2 = {"Lzw7;", "", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "localityService", "Lrt5;", "localityInfoService", "Le98;", "pizzeriaService", "Lxw7;", "a", "interactor", "Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zw7  reason: default package */
/* loaded from: classes3.dex */
public final class zw7 {
    public static final zw7 a = new zw7();

    private zw7() {
    }

    public final xw7 a(CountryService countryService, jv5 jv5Var, rt5 rt5Var, e98 e98Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        z65.h(e98Var, "pizzeriaService");
        return new yw7(countryService, jv5Var, rt5Var, e98Var);
    }

    public final PaymentWorkflowBrokenPresenter b(xw7 xw7Var) {
        z65.h(xw7Var, "interactor");
        return new PaymentWorkflowBrokenPresenter(xw7Var);
    }
}
