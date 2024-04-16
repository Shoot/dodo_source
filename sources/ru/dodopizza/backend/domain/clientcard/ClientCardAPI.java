package ru.dodopizza.backend.domain.clientcard;

import com.facebook.flipper.BuildConfig;
import com.inappstory.sdk.network.NetworkHandler;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import ru.dodopizza.backend.domain.clientcard.dto.RemoveCardRequestDto;
/* compiled from: ClientCardAPI.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;", "", "removeCard", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "request", "Lru/dodopizza/backend/domain/clientcard/dto/RemoveCardRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ClientCardAPI {
    @HTTP(hasBody = BuildConfig.IS_INTERNAL_BUILD, method = NetworkHandler.DELETE, path = "/api/v1/client/card")
    Response<Void> removeCard(@Body RemoveCardRequestDto removeCardRequestDto);
}
