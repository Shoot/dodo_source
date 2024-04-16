package im.threads.business.rest.queries;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.fq6;
import im.threads.business.UserInfoBuilder;
import im.threads.business.config.BaseConfig;
import im.threads.business.models.FileUploadResponse;
import im.threads.business.rest.models.ConfigResponse;
import im.threads.business.rest.models.HistoryResponse;
import im.threads.business.rest.models.SearchResponse;
import im.threads.business.rest.models.VersionsModel;
import im.threads.business.rest.queries.NewThreadsBackendApi;
import im.threads.business.rest.queries.OldThreadsBackendApi;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.StringExtensionsKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Call;
/* compiled from: ThreadsApi.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00012B+\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b0\u00101J \u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006J\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006JM\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\rJ\"\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00062\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0017J,\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lim/threads/business/rest/queries/ThreadsApi;", "", "", "token", "", "getHeadersMap", "Lretrofit2/Call;", "Lim/threads/business/rest/models/VersionsModel;", "versions", "Lim/threads/business/rest/models/ConfigResponse;", "config", "beforeDate", "afterDate", "", "count", "version", "Lim/threads/business/rest/models/HistoryResponse;", "history", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;", "searchString", "page", "Lim/threads/business/rest/models/SearchResponse;", "search", "", "ids", "Ljava/lang/Void;", "markMessageAsRead", "Lfq6$c;", Action.FILE_ATTRIBUTE, "Lji9;", "agent", "Lim/threads/business/models/FileUploadResponse;", "upload", "Lim/threads/business/rest/queries/OldThreadsBackendApi;", "oldThreadsApi", "Lim/threads/business/rest/queries/OldThreadsBackendApi;", "Lim/threads/business/rest/queries/NewThreadsBackendApi;", "newThreadsApi", "Lim/threads/business/rest/queries/NewThreadsBackendApi;", "Lim/threads/business/rest/queries/ThreadsDatastoreApi;", "datastoreApi", "Lim/threads/business/rest/queries/ThreadsDatastoreApi;", "Lim/threads/business/utils/ClientUseCase;", "clientInfo$delegate", "Lrn5;", "getClientInfo", "()Lim/threads/business/utils/ClientUseCase;", "clientInfo", "<init>", "(Lim/threads/business/rest/queries/OldThreadsBackendApi;Lim/threads/business/rest/queries/NewThreadsBackendApi;Lim/threads/business/rest/queries/ThreadsDatastoreApi;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ThreadsApi {
    public static final Companion Companion = new Companion(null);
    public static final String REST_TAG = "RestQuery";
    private static final String SIGNATURE_STRING = "edna_79e621ac_a76a_4d36_b490_6758c43fa3d1:";
    private final rn5 clientInfo$delegate;
    private final ThreadsDatastoreApi datastoreApi;
    private final NewThreadsBackendApi newThreadsApi;
    private final OldThreadsBackendApi oldThreadsApi;

    /* compiled from: ThreadsApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lim/threads/business/rest/queries/ThreadsApi$Companion;", "", "()V", "REST_TAG", "", "SIGNATURE_STRING", "getApiVersion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApiVersion() {
            return BaseConfig.Companion.getInstance().getApiVersion().toString();
        }
    }

    public ThreadsApi() {
        this(null, null, null, 7, null);
    }

    public static final String getApiVersion() {
        return Companion.getApiVersion();
    }

    private final ClientUseCase getClientInfo() {
        return (ClientUseCase) this.clientInfo$delegate.getValue();
    }

    private final Map<String, String> getHeadersMap(String str) {
        String str2;
        Map<String, String> k;
        Map<String, String> f;
        UserInfoBuilder userInfo = getClientInfo().getUserInfo();
        if (userInfo != null && userInfo.getClientIdEncrypted()) {
            f = f86.f(new Pair("X-Client-Token", str));
            return f;
        }
        Pair[] pairArr = new Pair[2];
        if (str != null) {
            str2 = StringExtensionsKt.encodeUrl(str);
        } else {
            str2 = null;
        }
        pairArr[0] = new Pair("X-Client-Token", str2);
        pairArr[1] = new Pair("X-Header-Encoding", RemoteMessageConst.Notification.URL);
        k = g86.k(pairArr);
        return k;
    }

    public static /* synthetic */ Call history$default(ThreadsApi threadsApi, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        String str5;
        String str6;
        if ((i & 2) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        return threadsApi.history(str, str5, str6, num, str4);
    }

    public static /* synthetic */ Call search$default(ThreadsApi threadsApi, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return threadsApi.search(str, str2, i);
    }

    public final Call<ConfigResponse> config() {
        if (BaseConfig.Companion.getInstance().isNewChatCenterApi()) {
            NewThreadsBackendApi newThreadsBackendApi = this.newThreadsApi;
            if (newThreadsBackendApi == null) {
                return null;
            }
            return newThreadsBackendApi.config(Companion.getApiVersion());
        }
        OldThreadsBackendApi oldThreadsBackendApi = this.oldThreadsApi;
        if (oldThreadsBackendApi == null) {
            return null;
        }
        return oldThreadsBackendApi.config(Companion.getApiVersion());
    }

    public final Call<HistoryResponse> history(String str, String str2, String str3, Integer num, String str4) {
        if (BaseConfig.Companion.getInstance().isNewChatCenterApi()) {
            NewThreadsBackendApi newThreadsBackendApi = this.newThreadsApi;
            if (newThreadsBackendApi == null) {
                return null;
            }
            return NewThreadsBackendApi.DefaultImpls.history$default(newThreadsBackendApi, getHeadersMap(str), str2, str3, num, str4, null, 32, null);
        }
        OldThreadsBackendApi oldThreadsBackendApi = this.oldThreadsApi;
        if (oldThreadsBackendApi == null) {
            return null;
        }
        return oldThreadsBackendApi.history(getHeadersMap(str), str2, str3, num, str4, Companion.getApiVersion());
    }

    public final Call<Void> markMessageAsRead(List<String> list) {
        if (BaseConfig.Companion.getInstance().isNewChatCenterApi()) {
            NewThreadsBackendApi newThreadsBackendApi = this.newThreadsApi;
            if (newThreadsBackendApi == null) {
                return null;
            }
            return newThreadsBackendApi.markMessageAsRead(list);
        }
        OldThreadsBackendApi oldThreadsBackendApi = this.oldThreadsApi;
        if (oldThreadsBackendApi == null) {
            return null;
        }
        return oldThreadsBackendApi.markMessageAsRead(list);
    }

    public final Call<SearchResponse> search(String str, String str2, int i) {
        if (str2 == null) {
            return null;
        }
        if (BaseConfig.Companion.getInstance().isNewChatCenterApi()) {
            NewThreadsBackendApi newThreadsBackendApi = this.newThreadsApi;
            if (newThreadsBackendApi == null) {
                return null;
            }
            return NewThreadsBackendApi.DefaultImpls.search$default(newThreadsBackendApi, getHeadersMap(str), str2, i, null, 8, null);
        }
        OldThreadsBackendApi oldThreadsBackendApi = this.oldThreadsApi;
        if (oldThreadsBackendApi == null) {
            return null;
        }
        return OldThreadsBackendApi.DefaultImpls.search$default(oldThreadsBackendApi, getHeadersMap(str), str2, i, null, 8, null);
    }

    public final Call<FileUploadResponse> upload(fq6.c cVar, ji9 ji9Var, String str) {
        z65.h(str, "token");
        ThreadsDatastoreApi threadsDatastoreApi = this.datastoreApi;
        if (threadsDatastoreApi != null) {
            return threadsDatastoreApi.upload(cVar, ji9Var, StringExtensionsKt.encodeUrl(SIGNATURE_STRING + str));
        }
        return null;
    }

    public final Call<VersionsModel> versions() {
        if (BaseConfig.Companion.getInstance().isNewChatCenterApi()) {
            NewThreadsBackendApi newThreadsBackendApi = this.newThreadsApi;
            if (newThreadsBackendApi == null) {
                return null;
            }
            return newThreadsBackendApi.versions();
        }
        OldThreadsBackendApi oldThreadsBackendApi = this.oldThreadsApi;
        if (oldThreadsBackendApi == null) {
            return null;
        }
        return oldThreadsBackendApi.versions();
    }

    public ThreadsApi(OldThreadsBackendApi oldThreadsBackendApi, NewThreadsBackendApi newThreadsBackendApi, ThreadsDatastoreApi threadsDatastoreApi) {
        rn5 b;
        this.oldThreadsApi = oldThreadsBackendApi;
        this.newThreadsApi = newThreadsBackendApi;
        this.datastoreApi = threadsDatastoreApi;
        b = yn5.b(ThreadsApi$special$$inlined$inject$1.INSTANCE);
        this.clientInfo$delegate = b;
    }

    public /* synthetic */ ThreadsApi(OldThreadsBackendApi oldThreadsBackendApi, NewThreadsBackendApi newThreadsBackendApi, ThreadsDatastoreApi threadsDatastoreApi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oldThreadsBackendApi, (i & 2) != 0 ? null : newThreadsBackendApi, (i & 4) != 0 ? null : threadsDatastoreApi);
    }
}
