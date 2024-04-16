package ru.dodopizza.backend.domain.inapp;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
/* compiled from: InAppNotificationApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lru/dodopizza/backend/domain/inapp/InAppNotificationApi;", "", "getInAppNotification", "", "Lru/dodopizza/backend/domain/inapp/InAppNotificationDto;", "()[Lru/dodopizza/backend/domain/inapp/InAppNotificationDto;", "sendNotificationClosed", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", MessageAttributes.UUID, "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InAppNotificationApi {
    @GET("/api/v1/inappnotifications")
    InAppNotificationDto[] getInAppNotification();

    @DELETE("/api/v1/inappnotifications/{uuid}")
    Response<Void> sendNotificationClosed(@Path("uuid") String str);
}
