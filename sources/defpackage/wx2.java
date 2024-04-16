package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationDetailsModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lwx2;", "", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Lml0;", "cacheInspector", "Ljy2;", "deliveryLocationFieldsRepository", "Lcy2;", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wx2  reason: default package */
/* loaded from: classes3.dex */
public final class wx2 {
    public static final wx2 a = new wx2();

    private wx2() {
    }

    public final jy2 a() {
        return new ky2();
    }

    public final cy2 b(GeoApi geoApi, ml0 ml0Var, jy2 jy2Var) {
        z65.h(geoApi, "geoApi");
        z65.h(ml0Var, "cacheInspector");
        z65.h(jy2Var, "deliveryLocationFieldsRepository");
        return new dy2(geoApi, ml0Var, jy2Var);
    }
}
