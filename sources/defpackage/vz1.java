package defpackage;

import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.covid.CovidApi;
/* compiled from: CovidModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lvz1;", "", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/covid/CovidApi;", "a", "covidApi", "Ldt5;", "locality", "Lhq3;", "featureService", "Lyz1;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vz1  reason: default package */
/* loaded from: classes3.dex */
public final class vz1 {
    public static final vz1 a = new vz1();

    private vz1() {
    }

    public final CovidApi a(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (CovidApi) retrofit.create(CovidApi.class);
    }

    public final yz1 b(CovidApi covidApi, dt5 dt5Var, hq3 hq3Var) {
        z65.h(covidApi, "covidApi");
        z65.h(dt5Var, "locality");
        z65.h(hq3Var, "featureService");
        return new zz1(covidApi, dt5Var, hq3Var);
    }
}
