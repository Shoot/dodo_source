package ru.dodopizza.app.presentation.addresslist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.hv0;
import defpackage.ou2;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: SelectedAddressHandler.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/dodopizza/app/presentation/addresslist/j;", "Lru/dodopizza/app/presentation/addresslist/i;", "Lou2$c;", "deliveryLocation", "", "isEmptyCart", "Lru/dodopizza/app/presentation/addresslist/i$a;", DateTokenConverter.CONVERTER_KEY, "Lqw1;", MessageAttributes.COORDINATES, "Ldt5;", com.huawei.hms.opendevice.c.a, "Lou2;", "newDeliverablePlace", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "", "b", "Lre4;", "Lre4;", "geocodeService", "Lk6a;", "Lk6a;", "selectLocationService", "Lhq3;", "Lhq3;", "featureService", "Ljv5;", "Ljv5;", "localityService", "Lt61;", com.huawei.hms.push.e.a, "Lt61;", "checkoutStateProvider", "f", "Ldt5;", "currentLocality", "<init>", "(Lre4;Lk6a;Lhq3;Ljv5;Lt61;Ldt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class j implements i {
    private final re4 a;
    private final k6a b;
    private final hq3 c;
    private final jv5 d;
    private final t61 e;
    private final dt5 f;

    public j(re4 re4Var, k6a k6aVar, hq3 hq3Var, jv5 jv5Var, t61 t61Var, dt5 dt5Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(hq3Var, "featureService");
        z65.h(jv5Var, "localityService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(dt5Var, "currentLocality");
        this.a = re4Var;
        this.b = k6aVar;
        this.c = hq3Var;
        this.d = jv5Var;
        this.e = t61Var;
        this.f = dt5Var;
    }

    private final dt5 c(qw1 qw1Var) {
        String b = this.a.b(qw1Var, this.f.a());
        if (b != null) {
            return this.d.b(this.f.a(), b);
        }
        return null;
    }

    private final i.a d(ou2.c cVar, boolean z) {
        e91 b = cVar.b();
        dt5 c = c(b.c().d());
        if (c == null) {
            return new i.a.b(cVar);
        }
        if (z65.c(c, this.f)) {
            return new i.a.e(cVar);
        }
        i.b bVar = new i.b(b, c);
        if (z) {
            return new i.a.c(bVar);
        }
        return new i.a.d(bVar);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.i
    public i.a a(ou2 ou2Var) {
        i.a.e eVar;
        z65.h(ou2Var, "newDeliverablePlace");
        b61 b61Var = this.e.get();
        if (z65.c(ou2Var, xk7.a(b61Var.k()))) {
            return i.a.C0514a.a;
        }
        if (this.c.a(bq3.d5)) {
            if (ou2Var instanceof ou2.c) {
                return d((ou2.c) ou2Var, b61Var.r());
            }
            if (ou2Var instanceof ou2.b) {
                eVar = new i.a.e(ou2Var);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            eVar = new i.a.e(ou2Var);
        }
        return eVar;
    }

    @Override // ru.dodopizza.app.presentation.addresslist.i
    public void b(i.b bVar) {
        z65.h(bVar, "request");
        this.b.b(new hv0.a(bVar.b(), bVar.a(), false, null, 8, null));
    }
}
