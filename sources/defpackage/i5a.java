package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressPresenter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SelectDeliveryAddressModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006!"}, d2 = {"Li5a;", "", "Lf63;", e.a, "Ldv6;", DateTokenConverter.CONVERTER_KEY, "geoRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "appRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "a", "Lpd3;", c.a, "Ljz2;", "b", "Lhq3;", "featureService", "args", "Lgc;", "analytics", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/c;", "selectDeliveryAddressRouter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", "f", "router", "g", "Lr71;", "Lr71;", "cicerone", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i5a  reason: default package */
/* loaded from: classes2.dex */
public final class i5a {
    public static final i5a a = new i5a();
    private static final r71<f63> b = r71.b.a(new f63());

    private i5a() {
    }

    public final com.dodopizza.geo.feature.deliveryaddresslist.presentation.c a(f63 f63Var, a aVar, b bVar) {
        z65.h(f63Var, "geoRouter");
        z65.h(aVar, "appRouter");
        z65.h(bVar, "data");
        return new aw2(f63Var, aVar, bVar);
    }

    public final jz2 b(f63 f63Var) {
        z65.h(f63Var, "geoRouter");
        return new lz2(f63Var);
    }

    public final pd3 c(f63 f63Var, a aVar, b bVar) {
        z65.h(f63Var, "geoRouter");
        z65.h(aVar, "appRouter");
        z65.h(bVar, "data");
        return new sd3(f63Var, aVar, bVar);
    }

    public final dv6 d() {
        return b.a();
    }

    public final f63 e() {
        return b.b();
    }

    public final SelectDeliveryAddressPresenter f(hq3 hq3Var, b bVar, gc gcVar, com.dodopizza.geo.feature.selectdeliveryaddress.c cVar, a aVar) {
        z65.h(hq3Var, "featureService");
        z65.h(bVar, "args");
        z65.h(gcVar, "analytics");
        z65.h(cVar, "selectDeliveryAddressRouter");
        z65.h(aVar, "appRouter");
        return new SelectDeliveryAddressPresenter(hq3Var, bVar, gcVar, cVar, aVar);
    }

    public final com.dodopizza.geo.feature.selectdeliveryaddress.c g(f63 f63Var, b bVar) {
        z65.h(f63Var, "router");
        z65.h(bVar, "data");
        return new com.dodopizza.geo.feature.selectdeliveryaddress.c(f63Var, bVar);
    }
}
