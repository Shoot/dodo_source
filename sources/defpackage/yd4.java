package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: GeoDependenciesModule.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u0017"}, d2 = {"Lyd4;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/geo/GeoApi;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Lpd3;", c.a, "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "a", "geoApi", "Lre4;", e.a, "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "f", "Ljz2;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "g", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yd4  reason: default package */
/* loaded from: classes3.dex */
public final class yd4 {
    public static final yd4 a = new yd4();

    private yd4() {
    }

    public final com.dodopizza.geo.feature.deliveryaddresslist.presentation.c a(f63 f63Var) {
        z65.h(f63Var, "router");
        return new bw2(f63Var);
    }

    public final jz2 b(f63 f63Var) {
        z65.h(f63Var, "router");
        return new kz2(f63Var);
    }

    public final pd3 c(f63 f63Var) {
        z65.h(f63Var, "router");
        return new td3(f63Var);
    }

    public final GeoApi d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (GeoApi) retrofit.create(GeoApi.class);
    }

    public final re4 e(GeoApi geoApi) {
        z65.h(geoApi, "geoApi");
        return new se4(geoApi);
    }

    public final d f() {
        return new u77();
    }

    public final a g(f63 f63Var) {
        z65.h(f63Var, "router");
        return new d5a(f63Var);
    }
}
