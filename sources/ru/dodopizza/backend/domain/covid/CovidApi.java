package ru.dodopizza.backend.domain.covid;

import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
/* compiled from: CovidApi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lru/dodopizza/backend/domain/covid/CovidApi;", "", "getCovidWarningInfo", "Lru/dodopizza/backend/domain/covid/CovidWarningInfoDto;", "localityId", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CovidApi {
    @GET("/api/v1/locality/covidwarning")
    CovidWarningInfoDto getCovidWarningInfo(@Query("localityId") String str);
}
