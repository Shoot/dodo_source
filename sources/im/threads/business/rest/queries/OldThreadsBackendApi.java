package im.threads.business.rest.queries;

import im.threads.business.rest.models.ConfigResponse;
import im.threads.business.rest.models.HistoryResponse;
import im.threads.business.rest.models.SearchResponse;
import im.threads.business.rest.models.VersionsModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: OldThreadsBackendApi.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'Jk\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00032\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00032\u0012\b\u0001\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0014H'JF\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00032\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u000e2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0003H'¨\u0006\u001b"}, d2 = {"Lim/threads/business/rest/queries/OldThreadsBackendApi;", "", "config", "Lretrofit2/Call;", "Lim/threads/business/rest/models/ConfigResponse;", "chatApiVersion", "", "history", "Lim/threads/business/rest/models/HistoryResponse;", "headerMap", "", "beforeDate", "afterDate", "count", "", "version", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "markMessageAsRead", "Ljava/lang/Void;", "ids", "", "search", "Lim/threads/business/rest/models/SearchResponse;", "searchString", "page", "versions", "Lim/threads/business/rest/models/VersionsModel;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OldThreadsBackendApi {

    /* compiled from: OldThreadsBackendApi.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Call search$default(OldThreadsBackendApi oldThreadsBackendApi, Map map, String str, int i, String str2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    str2 = ThreadsApi.Companion.getApiVersion();
                }
                return oldThreadsBackendApi.search(map, str, i, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
        }
    }

    @GET("/api/chat/config?channelType=MOBILE&auth=true")
    Call<ConfigResponse> config(@Query("chatApiVersion") String str);

    @GET("history")
    Call<HistoryResponse> history(@HeaderMap Map<String, String> map, @Query("before") String str, @Query("after") String str2, @Query("count") Integer num, @Query("libVersion") String str3, @Query("chatApiVersion") String str4);

    @POST("messages/read")
    Call<Void> markMessageAsRead(@Body List<String> list);

    @GET("api/client/search")
    Call<SearchResponse> search(@HeaderMap Map<String, String> map, @Query("term") String str, @Query("page") int i, @Query("chatApiVersion") String str2);

    @GET("api/versions")
    Call<VersionsModel> versions();
}
