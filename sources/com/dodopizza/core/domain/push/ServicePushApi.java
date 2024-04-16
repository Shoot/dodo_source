package com.dodopizza.core.domain.push;

import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: ServicePushApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u001c\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H'J&\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000bH'¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/core/domain/push/ServicePushApi;", "", "Lpib;", "tokenDto", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "subscribeDevice", "unsubscribeDevice", "", "orderId", "Lcom/dodopizza/core/domain/push/ServicePushApi$b;", "body", "subscribeLiveActivity", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface ServicePushApi {

    /* compiled from: ServicePushApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Response a(ServicePushApi servicePushApi, String str, b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bVar = b.a;
                }
                return servicePushApi.subscribeLiveActivity(str, bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeLiveActivity");
        }
    }

    /* compiled from: ServicePushApi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/core/domain/push/ServicePushApi$b;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b {
        public static final b a = new b();

        private b() {
        }
    }

    @POST("/api/push/v1/subscribe")
    Response<Void> subscribeDevice(@Body pib pibVar);

    @POST("/api/push/v1/liveactivities/{orderId}")
    Response<Void> subscribeLiveActivity(@Path("orderId") String str, @Body b bVar);

    @DELETE("/api/push/v1/unsubscribe")
    Response<Void> unsubscribeDevice();
}
