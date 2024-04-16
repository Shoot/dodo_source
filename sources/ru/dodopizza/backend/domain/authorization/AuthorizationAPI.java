package ru.dodopizza.backend.domain.authorization;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import ru.dodopizza.backend.domain.authorization.dto.AuthorizeRequestDto;
import ru.dodopizza.backend.domain.authorization.dto.AuthorizeResponseDto;
/* compiled from: AuthorizationAPI.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J&\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH'J:\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\rH'¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "", "getToken", "Lru/dodopizza/backend/domain/authorization/dto/AuthorizeResponseDto;", "authorizeRequestDto", "Lru/dodopizza/backend/domain/authorization/dto/AuthorizeRequestDto;", "sendPin", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "request", "Lru/dodopizza/backend/domain/authorization/SendPinCodeRequestDto;", LocalityEntity.FIELD_COUNTRY_CODE, "", "sendPinWithLocalityId", "language", "localityId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AuthorizationAPI {
    @POST("api/v1/login/authorize")
    AuthorizeResponseDto getToken(@Body AuthorizeRequestDto authorizeRequestDto);

    @POST("api/v3/login/sendPinCode")
    Response<Void> sendPin(@Body SendPinCodeRequestDto sendPinCodeRequestDto, @Header("CountryCode") String str);

    @POST("api/v3/login/sendPinCode")
    Response<Void> sendPinWithLocalityId(@Body SendPinCodeRequestDto sendPinCodeRequestDto, @Header("Language") String str, @Header("CountryCode") String str2, @Header("LocalityId") String str3);
}
