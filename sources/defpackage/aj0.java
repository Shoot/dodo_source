package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.menu.BuyMoreAPI;
/* compiled from: BuyMoreModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0012"}, d2 = {"Laj0;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/menu/BuyMoreAPI;", "a", "Lml0;", "cacheInspector", "Lxi0;", "b", "buyMoreAPI", "buyMoreMenuRepository", "Ldt5;", "locality", "Lgj0;", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: aj0  reason: default package */
/* loaded from: classes3.dex */
public final class aj0 {
    public static final aj0 a = new aj0();

    private aj0() {
    }

    public final BuyMoreAPI a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (BuyMoreAPI) retrofit.create(BuyMoreAPI.class);
    }

    public final xi0 b(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new yi0(ml0Var);
    }

    public final gj0 c(BuyMoreAPI buyMoreAPI, xi0 xi0Var, dt5 dt5Var) {
        z65.h(buyMoreAPI, "buyMoreAPI");
        z65.h(xi0Var, "buyMoreMenuRepository");
        z65.h(dt5Var, "locality");
        return new hj0(buyMoreAPI, xi0Var, dt5Var);
    }
}
