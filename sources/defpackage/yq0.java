package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.cart.CartAPI;
/* compiled from: CartModule.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\b\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0007J\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0007J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0007J\u0010\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0007¨\u00067"}, d2 = {"Lyq0;", "", "Las0;", "cartQueueService", "Lkq0;", c.a, "La98;", "pizzeriaRepository", "Lfs0;", "k", "Luja;", "shoppingItemRepository", "Lsq0;", DateTokenConverter.CONVERTER_KEY, "cartEditService", "Lfq0;", "cartContentService", "Lds0;", "j", "Lija;", "shoppingCartRepository", "Lrr0;", "cartQueueItemRepository", "b", "Ljk2;", "daoFactory", "Lsr0;", "converter", e.a, "Lx23;", "discountConverter", "f", Image.TYPE_MEDIUM, "Lk63;", "domainEvents", "i", "Lvr0;", "impl", "Lur0;", "g", "cartQueueItemSender", "Lxr0;", Image.TYPE_HIGH, "Lcs0;", "cartRepository", "Lhq3;", "featureService", "Lej6;", "l", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/cart/CartAPI;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yq0  reason: default package */
/* loaded from: classes3.dex */
public final class yq0 {
    public static final yq0 a = new yq0();

    private yq0() {
    }

    public final CartAPI a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        Object create = retrofit.create(CartAPI.class);
        z65.g(create, "create(...)");
        return (CartAPI) create;
    }

    public final fq0 b(ija ijaVar, rr0 rr0Var) {
        z65.h(ijaVar, "shoppingCartRepository");
        z65.h(rr0Var, "cartQueueItemRepository");
        return new gq0(ijaVar, rr0Var);
    }

    public final kq0 c(as0 as0Var) {
        z65.h(as0Var, "cartQueueService");
        return new lq0(as0Var);
    }

    public final sq0 d(uja ujaVar) {
        z65.h(ujaVar, "shoppingItemRepository");
        return new tq0(ujaVar);
    }

    public final rr0 e(jk2 jk2Var, sr0 sr0Var) {
        z65.h(jk2Var, "daoFactory");
        z65.h(sr0Var, "converter");
        return new tr0(jk2Var, sr0Var);
    }

    public final sr0 f(x23 x23Var) {
        z65.h(x23Var, "discountConverter");
        return new sr0(x23Var);
    }

    public final ur0 g(vr0 vr0Var) {
        z65.h(vr0Var, "impl");
        return vr0Var;
    }

    public final xr0 h(ur0 ur0Var, as0 as0Var) {
        z65.h(ur0Var, "cartQueueItemSender");
        z65.h(as0Var, "cartQueueService");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        z65.g(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new zr0(newSingleThreadExecutor, ur0Var, as0Var);
    }

    public final as0 i(rr0 rr0Var, k63 k63Var) {
        z65.h(rr0Var, "cartQueueItemRepository");
        z65.h(k63Var, "domainEvents");
        return new bs0(new pr0(null, 1, null), rr0Var, (u53) k63Var);
    }

    public final ds0 j(kq0 kq0Var, fq0 fq0Var) {
        z65.h(kq0Var, "cartEditService");
        z65.h(fq0Var, "cartContentService");
        return new es0(kq0Var, fq0Var);
    }

    public final fs0 k(a98 a98Var) {
        z65.h(a98Var, "pizzeriaRepository");
        return new gs0(a98Var);
    }

    public final ej6 l(cs0 cs0Var, fq0 fq0Var, hq3 hq3Var) {
        z65.h(cs0Var, "cartRepository");
        z65.h(fq0Var, "cartContentService");
        z65.h(hq3Var, "featureService");
        return new ej6(cs0Var, fq0Var, hq3Var);
    }

    public final ija m() {
        return new jja();
    }
}
