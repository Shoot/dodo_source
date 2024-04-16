package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.deliveryaddressform.DeliveryAddressPresenter;
/* compiled from: AddressFormModule.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u0018"}, d2 = {"Ld8;", "", "", "isFromNewCheckout", "Lf63;", "dodoRouter", "Lr6;", "addAddressInteractor", "Ldt9;", "saveAddressInteractor", "Lgc;", "analytics", "Ls6;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lru/dodopizza/app/presentation/deliveryaddressform/DeliveryAddressPresenter;", "b", "Ldza;", "streetAutocompleteInteractor", "Lnp4;", "houseAutocompleteInteractor", "Lt7;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d8  reason: default package */
/* loaded from: classes3.dex */
public final class d8 {
    public static final d8 a = new d8();

    private d8() {
    }

    public final t7 a(dza dzaVar, np4 np4Var) {
        z65.h(dzaVar, "streetAutocompleteInteractor");
        z65.h(np4Var, "houseAutocompleteInteractor");
        return new t7(dzaVar, np4Var);
    }

    public final DeliveryAddressPresenter b(boolean z, f63 f63Var, r6 r6Var, dt9 dt9Var, gc gcVar, s6 s6Var) {
        z65.h(f63Var, "dodoRouter");
        z65.h(r6Var, "addAddressInteractor");
        z65.h(dt9Var, "saveAddressInteractor");
        z65.h(gcVar, "analytics");
        z65.h(s6Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        return new DeliveryAddressPresenter(z, f63Var, r6Var, dt9Var, gcVar, s6Var);
    }
}
