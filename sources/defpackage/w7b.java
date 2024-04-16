package defpackage;

import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter;
/* compiled from: TaxPayerIdModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lw7b;", "", "", "taxPayerId", "Lf63;", "router", "Lb8b;", "validator", "Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", "a", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: w7b  reason: default package */
/* loaded from: classes3.dex */
public final class w7b {
    public static final w7b a = new w7b();

    private w7b() {
    }

    public final TaxPayerIdPresenter a(String str, f63 f63Var, b8b b8bVar) {
        z65.h(str, "taxPayerId");
        z65.h(f63Var, "router");
        z65.h(b8bVar, "validator");
        return new TaxPayerIdPresenter(str, f63Var, b8bVar);
    }

    public final b8b b(ay1 ay1Var) {
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        return c8b.a.a(ay1Var);
    }
}
