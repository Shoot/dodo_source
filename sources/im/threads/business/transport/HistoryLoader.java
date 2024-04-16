package im.threads.business.transport;

import com.google.gson.Gson;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.rest.models.HistoryResponse;
import im.threads.business.rest.queries.BackendApi;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.utils.AppInfo;
import im.threads.business.utils.DateHelper;
import im.threads.business.utils.DemoModeProvider;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.Response;
/* compiled from: HistoryLoader.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010J-\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lim/threads/business/transport/HistoryLoader;", "", "demoModeProvider", "Lim/threads/business/utils/DemoModeProvider;", "appInfo", "Lim/threads/business/utils/AppInfo;", "(Lim/threads/business/utils/DemoModeProvider;Lim/threads/business/utils/AppInfo;)V", "lastLoadedTimestamp", "", "Ljava/lang/Long;", "getHistorySync", "Lim/threads/business/rest/models/HistoryResponse;", "count", "", "fromBeginning", "", "(Ljava/lang/Integer;Z)Lim/threads/business/rest/models/HistoryResponse;", "anchorTimestamp", "isAfterAnchor", "(Ljava/lang/Long;Ljava/lang/Integer;Z)Lim/threads/business/rest/models/HistoryResponse;", "setupLastItemIdFromHistory", "", StatisticManager.LIST, "", "Lim/threads/business/models/MessageFromHistory;", "HistoryLoadingCallback", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryLoader {
    private final AppInfo appInfo;
    private final DemoModeProvider demoModeProvider;
    private Long lastLoadedTimestamp;

    /* compiled from: HistoryLoader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lim/threads/business/transport/HistoryLoader$HistoryLoadingCallback;", "", "onLoaded", "", "items", "", "Lim/threads/business/models/ChatItem;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface HistoryLoadingCallback {
        void onLoaded(List<? extends ChatItem> list);
    }

    public HistoryLoader(DemoModeProvider demoModeProvider, AppInfo appInfo) {
        z65.h(demoModeProvider, "demoModeProvider");
        z65.h(appInfo, "appInfo");
        this.demoModeProvider = demoModeProvider;
        this.appInfo = appInfo;
    }

    public static /* synthetic */ HistoryResponse getHistorySync$default(HistoryLoader historyLoader, Long l, Integer num, boolean z, int i, Object obj) throws Exception {
        if ((i & 4) != 0) {
            z = false;
        }
        return historyLoader.getHistorySync(l, num, z);
    }

    public final HistoryResponse getHistorySync(Long l, Integer num, boolean z) throws Exception {
        Response execute;
        Response execute2;
        if (this.demoModeProvider.isDemoModeEnabled()) {
            return (HistoryResponse) new Gson().k(this.demoModeProvider.getHistoryMock(), HistoryResponse.class);
        }
        int intValue = num != null ? num.intValue() : BaseConfig.Companion.getInstance().getHistoryLoadingCount();
        String token = BaseConfig.Companion.getInstance().transport.getToken();
        if (token.length() > 0) {
            ThreadsApi threadsApi = BackendApi.Companion.get();
            String messageDateStringFromTimestamp = l == null ? null : DateHelper.INSTANCE.getMessageDateStringFromTimestamp(l.longValue());
            if (z && messageDateStringFromTimestamp != null) {
                Call history$default = ThreadsApi.history$default(threadsApi, token, null, messageDateStringFromTimestamp, Integer.valueOf(intValue), this.appInfo.getLibVersion(), 2, null);
                if (history$default == null || (execute2 = history$default.execute()) == null) {
                    return null;
                }
                return (HistoryResponse) execute2.body();
            }
            Call history$default2 = ThreadsApi.history$default(threadsApi, token, messageDateStringFromTimestamp, null, Integer.valueOf(intValue), this.appInfo.getLibVersion(), 4, null);
            if (history$default2 == null || (execute = history$default2.execute()) == null) {
                return null;
            }
            return (HistoryResponse) execute.body();
        }
        LoggerEdna.error(ThreadsApi.REST_TAG, "Error when loading history - token is empty!");
        throw new IOException();
    }

    public final void setupLastItemIdFromHistory(List<MessageFromHistory> list) {
        List<MessageFromHistory> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            this.lastLoadedTimestamp = Long.valueOf(list.get(0).getTimeStamp());
        }
    }

    public final HistoryResponse getHistorySync(Integer num, boolean z) throws Exception {
        return getHistorySync$default(this, z ? null : this.lastLoadedTimestamp, num, false, 4, null);
    }
}
