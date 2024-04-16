package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.stories.StoriesApi;
/* compiled from: StoriesModule.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¨\u0006\""}, d2 = {"Lcya;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/stories/StoriesApi;", DateTokenConverter.CONVERTER_KEY, "Lf15;", "a", "storiesApi", "infoStoryRepository", "Lava;", "stateProvider", "Lkya;", "f", "storiesService", "Lhq3;", "featureService", "Lci8;", "preferencesAssetsDataSource", "Lnz4;", "inAppStoryStateProvider", "Lj15;", c.a, "Liz4;", "impl", "Lhz4;", "b", "infoStoryService", "Le98;", "pizzeriaService", "Lzxa;", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cya  reason: default package */
/* loaded from: classes3.dex */
public final class cya {
    public static final cya a = new cya();

    private cya() {
    }

    public final f15 a() {
        return new g15();
    }

    public final hz4 b(iz4 iz4Var) {
        z65.h(iz4Var, "impl");
        return iz4Var;
    }

    public final j15 c(kya kyaVar, hq3 hq3Var, ci8 ci8Var, nz4 nz4Var) {
        z65.h(kyaVar, "storiesService");
        z65.h(hq3Var, "featureService");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(nz4Var, "inAppStoryStateProvider");
        return new k15(kyaVar, hq3Var, ci8Var, nz4Var);
    }

    public final StoriesApi d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (StoriesApi) retrofit.create(StoriesApi.class);
    }

    public final zxa e(kya kyaVar, j15 j15Var, e98 e98Var) {
        z65.h(kyaVar, "storiesService");
        z65.h(j15Var, "infoStoryService");
        z65.h(e98Var, "pizzeriaService");
        return new aya(kyaVar, j15Var, e98Var);
    }

    public final kya f(StoriesApi storiesApi, f15 f15Var, ava avaVar) {
        z65.h(storiesApi, "storiesApi");
        z65.h(f15Var, "infoStoryRepository");
        z65.h(avaVar, "stateProvider");
        return new lya(storiesApi, f15Var, avaVar);
    }
}
