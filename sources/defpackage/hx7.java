package defpackage;

import defpackage.hi9;
import defpackage.k65;
import kotlin.Metadata;
/* compiled from: PaymentsOsInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lhx7;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "Lp80;", "a", "Lp80;", "baseUrlProvider", "Lutb;", "b", "Lutb;", "urlChecker", "<init>", "(Lp80;Lutb;)V", "ospayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: hx7  reason: default package */
/* loaded from: classes2.dex */
public final class hx7 implements k65 {
    private final p80 a;
    private final utb b;

    public hx7(p80 p80Var, utb utbVar) {
        z65.h(p80Var, "baseUrlProvider");
        z65.h(utbVar, "urlChecker");
        this.a = p80Var;
        this.b = utbVar;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        String str;
        z65.h(aVar, "chain");
        hi9.a i = aVar.request().i();
        i.j("api-version", "1.3.0");
        if (this.b.d(this.a.a())) {
            str = "live";
        } else {
            str = "test";
        }
        i.j("x-payments-os-env", str);
        return aVar.b(i.b());
    }
}
