package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import ru.dodopizza.app.domain.blockstore.LocalityBlockStoreDataSource;
import ru.dodopizza.app.domain.locality.LocalityServiceImpl;
/* compiled from: LocalityModule.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007J\b\u0010#\u001a\u00020\u0006H\u0007J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006'"}, d2 = {"Liu5;", "", "Ljk2;", "daoFactory", "Lci8;", "preferencesAssetsDataSource", "Lht5;", "localityIdConverter", "Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource;", "localityBlockStoreDataSource", "Lev5;", "localityRepositoryConverter", "Ldv5;", Image.TYPE_HIGH, "localityRepository", "Lot5;", "g", "localityInfoRepositoryConverter", "Lnt5;", "f", "Lru/dodopizza/app/domain/locality/LocalityServiceImpl;", "impl", "Ljv5;", "j", "Lry1;", DateTokenConverter.CONVERTER_KEY, "Li7;", "Lh7;", "a", "Lpy1;", c.a, "Lyhb;", "toggleService", "Lly1;", "b", e.a, "i", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: iu5  reason: default package */
/* loaded from: classes3.dex */
public final class iu5 {
    public static final iu5 a = new iu5();

    private iu5() {
    }

    public final h7 a(i7 i7Var) {
        z65.h(i7Var, "impl");
        return i7Var;
    }

    public final ly1 b(yhb yhbVar) {
        z65.h(yhbVar, "toggleService");
        return new my1(yhbVar);
    }

    public final py1 c() {
        return new qy1();
    }

    public final ry1 d(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new sy1(jk2Var);
    }

    public final ht5 e() {
        return new it5();
    }

    public final nt5 f(jk2 jk2Var, ot5 ot5Var) {
        z65.h(jk2Var, "daoFactory");
        z65.h(ot5Var, "localityInfoRepositoryConverter");
        return new qt5(jk2Var, ot5Var);
    }

    public final ot5 g(dv5 dv5Var) {
        z65.h(dv5Var, "localityRepository");
        return new pt5(dv5Var);
    }

    public final dv5 h(jk2 jk2Var, ci8 ci8Var, ht5 ht5Var, LocalityBlockStoreDataSource localityBlockStoreDataSource, ev5 ev5Var) {
        z65.h(jk2Var, "daoFactory");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(ht5Var, "localityIdConverter");
        z65.h(localityBlockStoreDataSource, "localityBlockStoreDataSource");
        z65.h(ev5Var, "localityRepositoryConverter");
        return new gv5(jk2Var, ci8Var, localityBlockStoreDataSource, ht5Var, ev5Var);
    }

    public final ev5 i(ht5 ht5Var) {
        z65.h(ht5Var, "localityIdConverter");
        return new fv5(ht5Var);
    }

    public final jv5 j(LocalityServiceImpl localityServiceImpl) {
        z65.h(localityServiceImpl, "impl");
        return localityServiceImpl;
    }
}
