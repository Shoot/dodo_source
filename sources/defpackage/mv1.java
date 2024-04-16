package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.controlling.MysteryShopperCheckupApi;
import ru.dodopizza.backend.domain.controlling.OrderRatingAPI;
import ru.dodopizza.backend.domain.controlling.RnDigitalApi;
/* compiled from: ControllingDomainModule.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0013H\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020#2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u0010-\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002032\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u0010-\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u0002092\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020@2\u0006\u0010-\u001a\u00020?H\u0001¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020?2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u0010-\u001a\u00020EH\u0001¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020E2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\bI\u0010JJ'\u0010R\u001a\u00020Q2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020K2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\bT\u0010UJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010W\u001a\u00020VH\u0001¢\u0006\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lmv1;", "", "Lhs6;", "k", "()Lhs6;", "formInfoMapper", "Lbs6;", "i", "(Lhs6;)Lbs6;", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;", Image.TYPE_HIGH, "(Lretrofit2/Retrofit;)Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;", "mysteryShopperCheckupApi", "mysteryShopperCheckupMapper", "Les6;", "j", "(Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;Lbs6;)Les6;", "Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "n", "(Lretrofit2/Retrofit;)Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "Ljk2;", "daoFactory", "Lm69;", "t", "(Ljk2;)Lm69;", "orderRatingAPI", "ratingRepository", "Lo69;", "u", "(Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;Lm69;)Lo69;", "Ltz1;", "g", "(Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;)Ltz1;", "Lru/dodopizza/backend/domain/controlling/RnDigitalApi;", "v", "(Lretrofit2/Retrofit;)Lru/dodopizza/backend/domain/controlling/RnDigitalApi;", "rnDigitalApi", "Lhq3;", "featureService", "Len9;", "w", "(Lru/dodopizza/backend/domain/controlling/RnDigitalApi;Lhq3;)Len9;", "Llc7;", "provider", "Ljc7;", "l", "(Llc7;)Ljc7;", Image.TYPE_MEDIUM, "(Lhq3;)Llc7;", "Lch7;", "Lah7;", "o", "(Lch7;)Lah7;", "p", "(Lhq3;)Lch7;", "Lgb0;", "Leb0;", "a", "(Lgb0;)Leb0;", "b", "(Lhq3;)Lgb0;", "Lds1;", "Lcs1;", c.a, "(Lds1;)Lcs1;", DateTokenConverter.CONVERTER_KEY, "(Lhq3;)Lds1;", "Lrz1;", "Lpz1;", e.a, "(Lrz1;)Lpz1;", "f", "(Lhq3;)Lrz1;", "Lj69;", "photoRepository", "Lku3;", "fileUploader", "Lwo1;", "compressFactory", "Lk69;", Image.TYPE_SMALL, "(Lj69;Lku3;Lwo1;)Lk69;", "r", "(Ljk2;)Lj69;", "Lci8;", "preferencesAssetsDataSource", "Lx49;", "q", "(Lci8;)Lx49;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mv1  reason: default package */
/* loaded from: classes.dex */
public final class mv1 {
    public static final mv1 a = new mv1();

    private mv1() {
    }

    public final eb0 a(gb0 gb0Var) {
        z65.h(gb0Var, "provider");
        return gb0Var.a();
    }

    public final gb0 b(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new gb0(hq3Var);
    }

    public final cs1 c(ds1 ds1Var) {
        z65.h(ds1Var, "provider");
        return ds1Var.a();
    }

    public final ds1 d(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new ds1(hq3Var);
    }

    public final pz1 e(rz1 rz1Var) {
        z65.h(rz1Var, "provider");
        return rz1Var.a();
    }

    public final rz1 f(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new rz1(hq3Var);
    }

    public final tz1 g(OrderRatingAPI orderRatingAPI) {
        z65.h(orderRatingAPI, "orderRatingAPI");
        return new uz1(orderRatingAPI);
    }

    public final MysteryShopperCheckupApi h(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (MysteryShopperCheckupApi) retrofit.create(MysteryShopperCheckupApi.class);
    }

    public final bs6 i(hs6 hs6Var) {
        z65.h(hs6Var, "formInfoMapper");
        return new bs6(hs6Var);
    }

    public final es6 j(MysteryShopperCheckupApi mysteryShopperCheckupApi, bs6 bs6Var) {
        z65.h(mysteryShopperCheckupApi, "mysteryShopperCheckupApi");
        z65.h(bs6Var, "mysteryShopperCheckupMapper");
        return new fs6(mysteryShopperCheckupApi, bs6Var);
    }

    public final hs6 k() {
        return new hs6();
    }

    public final jc7 l(lc7 lc7Var) {
        z65.h(lc7Var, "provider");
        return lc7Var.a();
    }

    public final lc7 m(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new lc7(hq3Var);
    }

    public final OrderRatingAPI n(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (OrderRatingAPI) retrofit.create(OrderRatingAPI.class);
    }

    public final ah7 o(ch7 ch7Var) {
        z65.h(ch7Var, "provider");
        return ch7Var.a();
    }

    public final ch7 p(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new ch7(hq3Var);
    }

    public final x49 q(ci8 ci8Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        return new y49(ci8Var);
    }

    public final j69 r(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new j69(jk2Var);
    }

    public final k69 s(j69 j69Var, ku3 ku3Var, wo1 wo1Var) {
        z65.h(j69Var, "photoRepository");
        z65.h(ku3Var, "fileUploader");
        z65.h(wo1Var, "compressFactory");
        return new l69(j69Var, ku3Var, wo1Var);
    }

    public final m69 t(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new m69(jk2Var);
    }

    public final o69 u(OrderRatingAPI orderRatingAPI, m69 m69Var) {
        z65.h(orderRatingAPI, "orderRatingAPI");
        z65.h(m69Var, "ratingRepository");
        return new p69(orderRatingAPI, m69Var);
    }

    public final RnDigitalApi v(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (RnDigitalApi) retrofit.create(RnDigitalApi.class);
    }

    public final en9 w(RnDigitalApi rnDigitalApi, hq3 hq3Var) {
        z65.h(rnDigitalApi, "rnDigitalApi");
        z65.h(hq3Var, "featureService");
        return new fn9(rnDigitalApi, hq3Var);
    }
}
