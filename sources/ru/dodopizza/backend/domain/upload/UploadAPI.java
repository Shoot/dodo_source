package ru.dodopizza.backend.domain.upload;

import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.dodopizza.backend.domain.upload.dto.UploadDto;
import ru.dodopizza.backend.domain.upload.dto.UploadSizeDto;
/* compiled from: UploadAPI.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\f"}, d2 = {"Lru/dodopizza/backend/domain/upload/UploadAPI;", "", "Lru/dodopizza/backend/domain/upload/dto/UploadDto;", "createUploadId", "", "uploadId", "Lji9;", "body", "Lkk9;", "uploadImage", "Lru/dodopizza/backend/domain/upload/dto/UploadSizeDto;", "getUploadSize", "backend"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface UploadAPI {
    @Headers({"Content-Type: image/jpeg"})
    @POST("/api/uploads")
    UploadDto createUploadId();

    @Headers({"Content-Type: image/jpeg"})
    @GET("/api/uploads/{id}/size")
    UploadSizeDto getUploadSize(@Path("id") String str);

    @Headers({"Content-Type: image/jpeg"})
    @POST("/api/uploads/{id}")
    kk9 uploadImage(@Path("id") String str, @Body ji9 ji9Var);
}
