package ru.dodopizza.backend.domain.servertime;

import kotlin.Metadata;
import retrofit2.http.GET;
import ru.dodopizza.backend.domain.servertime.dto.ServerTimeDto;
/* compiled from: ServerTimeApi.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Lru/dodopizza/backend/domain/servertime/ServerTimeApi;", "", "getServerTime", "Lru/dodopizza/backend/domain/servertime/dto/ServerTimeDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ServerTimeApi {
    @GET("/api/utcnow")
    ServerTimeDto getServerTime();
}
