package im.threads.business.config;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.models.enums.ApiVersionEnum;
import im.threads.business.rest.config.RequestConfig;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BaseConfigBuilder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bm\u0010*J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0000H\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\fH\u0017J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\"H\u0016R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000e\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\b:\u00107\"\u0004\b;\u00109R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010<\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R$\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00102\"\u0004\bN\u00104R$\u0010O\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u0013\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b_\u00102\"\u0004\b`\u00104R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\ba\u00102\"\u0004\bb\u00104R\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010h\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bh\u00105\u001a\u0004\bi\u00107\"\u0004\bj\u00109R\u0014\u0010l\u001a\u00020\f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bk\u00107¨\u0006n"}, d2 = {"Lim/threads/business/config/BaseConfigBuilder;", "", "", "serverBaseUrl", "", "keepSocketActive", "datastoreUrl", "threadsGateUrl", "threadsGateProviderUid", "Lim/threads/business/core/UnreadMessagesCountListener;", "unreadMessagesCountListener", "isDebugLoggingEnabled", "", "historyLoadingCount", "surveyCompletionDelay", "Lim/threads/business/rest/config/RequestConfig;", "requestConfig", "", "trustedSSLCertificates", "allowUntrustedSSLCertificate", "allowUntrustedSSLCertificates", "Lk65;", "interceptor", "networkInterceptor", "setNewChatCenterApi", "Lim/threads/business/logger/LoggerConfig;", "config", "enableLogging", "importance", "setNotificationImportance", "Lim/threads/business/models/enums/ApiVersionEnum;", "apiVersion", "", "setApiVersion", "Lim/threads/business/config/BaseConfig;", "build", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lim/threads/business/core/UnreadMessagesCountListener;", "getUnreadMessagesCountListener$threads_release", "()Lim/threads/business/core/UnreadMessagesCountListener;", "setUnreadMessagesCountListener$threads_release", "(Lim/threads/business/core/UnreadMessagesCountListener;)V", "Z", "isDebugLoggingEnabled$threads_release", "()Z", "setDebugLoggingEnabled$threads_release", "(Z)V", "I", "getHistoryLoadingCount$threads_release", "()I", "setHistoryLoadingCount$threads_release", "(I)V", "getSurveyCompletionDelay$threads_release", "setSurveyCompletionDelay$threads_release", "Ljava/lang/String;", "getServerBaseUrl$threads_release", "()Ljava/lang/String;", "setServerBaseUrl$threads_release", "(Ljava/lang/String;)V", "getDatastoreUrl$threads_release", "setDatastoreUrl$threads_release", "getThreadsGateUrl$threads_release", "setThreadsGateUrl$threads_release", "getThreadsGateProviderUid$threads_release", "setThreadsGateProviderUid$threads_release", "Lk65;", "getNetworkInterceptor$threads_release", "()Lk65;", "setNetworkInterceptor$threads_release", "(Lk65;)V", "isNewChatCenterApi", "isNewChatCenterApi$threads_release", "setNewChatCenterApi$threads_release", "loggerConfig", "Lim/threads/business/logger/LoggerConfig;", "getLoggerConfig$threads_release", "()Lim/threads/business/logger/LoggerConfig;", "setLoggerConfig$threads_release", "(Lim/threads/business/logger/LoggerConfig;)V", "Lim/threads/business/rest/config/RequestConfig;", "getRequestConfig$threads_release", "()Lim/threads/business/rest/config/RequestConfig;", "setRequestConfig$threads_release", "(Lim/threads/business/rest/config/RequestConfig;)V", "Ljava/util/List;", "getTrustedSSLCertificates$threads_release", "()Ljava/util/List;", "setTrustedSSLCertificates$threads_release", "(Ljava/util/List;)V", "getAllowUntrustedSSLCertificate$threads_release", "setAllowUntrustedSSLCertificate$threads_release", "getKeepSocketActive$threads_release", "setKeepSocketActive$threads_release", "Lim/threads/business/models/enums/ApiVersionEnum;", "getApiVersion$threads_release", "()Lim/threads/business/models/enums/ApiVersionEnum;", "setApiVersion$threads_release", "(Lim/threads/business/models/enums/ApiVersionEnum;)V", "notificationImportance", "getNotificationImportance$threads_release", "setNotificationImportance$threads_release", "getNotificationLevel", "notificationLevel", "<init>", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class BaseConfigBuilder {
    private boolean allowUntrustedSSLCertificate;
    private ApiVersionEnum apiVersion;
    private Context context;
    private String datastoreUrl;
    private int historyLoadingCount;
    private boolean isDebugLoggingEnabled;
    private boolean isNewChatCenterApi;
    private boolean keepSocketActive;
    private LoggerConfig loggerConfig;
    private k65 networkInterceptor;
    private int notificationImportance;
    private RequestConfig requestConfig;
    private String serverBaseUrl;
    private int surveyCompletionDelay;
    private String threadsGateProviderUid;
    private String threadsGateUrl;
    private List<Integer> trustedSSLCertificates;
    private UnreadMessagesCountListener unreadMessagesCountListener;

    public BaseConfigBuilder(Context context) {
        List<Integer> l;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        this.historyLoadingCount = 50;
        this.surveyCompletionDelay = 2000;
        this.requestConfig = new RequestConfig();
        l = kc1.l();
        this.trustedSSLCertificates = l;
        this.apiVersion = ApiVersionEnum.Companion.getDefaultApiVersionEnum();
        this.notificationImportance = 3;
    }

    public BaseConfigBuilder allowUntrustedSSLCertificates(boolean z) {
        this.allowUntrustedSSLCertificate = z;
        return this;
    }

    public BaseConfig build() {
        return new BaseConfig(this.context, this.serverBaseUrl, this.datastoreUrl, this.threadsGateUrl, this.threadsGateProviderUid, this.isNewChatCenterApi, this.loggerConfig, this.unreadMessagesCountListener, this.networkInterceptor, this.isDebugLoggingEnabled, this.historyLoadingCount, this.surveyCompletionDelay, this.requestConfig, getNotificationLevel(), this.trustedSSLCertificates, this.allowUntrustedSSLCertificate, this.keepSocketActive, this.apiVersion);
    }

    public BaseConfigBuilder datastoreUrl(String str) {
        boolean y;
        boolean u;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                u = l0b.u(str, "/", false, 2, null);
                if (!u) {
                    this.datastoreUrl = str + "/";
                    return this;
                }
            }
        }
        this.datastoreUrl = str;
        return this;
    }

    public BaseConfigBuilder enableLogging(LoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
        return this;
    }

    public final boolean getAllowUntrustedSSLCertificate$threads_release() {
        return this.allowUntrustedSSLCertificate;
    }

    public final ApiVersionEnum getApiVersion$threads_release() {
        return this.apiVersion;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDatastoreUrl$threads_release() {
        return this.datastoreUrl;
    }

    public final int getHistoryLoadingCount$threads_release() {
        return this.historyLoadingCount;
    }

    public final boolean getKeepSocketActive$threads_release() {
        return this.keepSocketActive;
    }

    public final LoggerConfig getLoggerConfig$threads_release() {
        return this.loggerConfig;
    }

    public final k65 getNetworkInterceptor$threads_release() {
        return this.networkInterceptor;
    }

    public final int getNotificationImportance$threads_release() {
        return this.notificationImportance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getNotificationLevel() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.notificationImportance;
        }
        return 0;
    }

    public final RequestConfig getRequestConfig$threads_release() {
        return this.requestConfig;
    }

    public final String getServerBaseUrl$threads_release() {
        return this.serverBaseUrl;
    }

    public final int getSurveyCompletionDelay$threads_release() {
        return this.surveyCompletionDelay;
    }

    public final String getThreadsGateProviderUid$threads_release() {
        return this.threadsGateProviderUid;
    }

    public final String getThreadsGateUrl$threads_release() {
        return this.threadsGateUrl;
    }

    public final List<Integer> getTrustedSSLCertificates$threads_release() {
        return this.trustedSSLCertificates;
    }

    public final UnreadMessagesCountListener getUnreadMessagesCountListener$threads_release() {
        return this.unreadMessagesCountListener;
    }

    public BaseConfigBuilder historyLoadingCount(int i) {
        this.historyLoadingCount = i;
        return this;
    }

    public BaseConfigBuilder isDebugLoggingEnabled(boolean z) {
        this.isDebugLoggingEnabled = z;
        return this;
    }

    public final boolean isDebugLoggingEnabled$threads_release() {
        return this.isDebugLoggingEnabled;
    }

    public final boolean isNewChatCenterApi$threads_release() {
        return this.isNewChatCenterApi;
    }

    public BaseConfigBuilder keepSocketActive(boolean z) {
        this.keepSocketActive = z;
        return this;
    }

    public BaseConfigBuilder networkInterceptor(k65 k65Var) {
        this.networkInterceptor = k65Var;
        return this;
    }

    public BaseConfigBuilder requestConfig(RequestConfig requestConfig) {
        z65.h(requestConfig, "requestConfig");
        this.requestConfig = requestConfig;
        return this;
    }

    public BaseConfigBuilder serverBaseUrl(String str) {
        boolean y;
        boolean u;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                u = l0b.u(str, "/", false, 2, null);
                if (!u) {
                    this.serverBaseUrl = str + "/";
                    return this;
                }
            }
        }
        this.serverBaseUrl = str;
        return this;
    }

    public final void setAllowUntrustedSSLCertificate$threads_release(boolean z) {
        this.allowUntrustedSSLCertificate = z;
    }

    public void setApiVersion(ApiVersionEnum apiVersionEnum) {
        z65.h(apiVersionEnum, "apiVersion");
        this.apiVersion = apiVersionEnum;
    }

    public final void setApiVersion$threads_release(ApiVersionEnum apiVersionEnum) {
        z65.h(apiVersionEnum, "<set-?>");
        this.apiVersion = apiVersionEnum;
    }

    public final void setContext(Context context) {
        z65.h(context, "<set-?>");
        this.context = context;
    }

    public final void setDatastoreUrl$threads_release(String str) {
        this.datastoreUrl = str;
    }

    public final void setDebugLoggingEnabled$threads_release(boolean z) {
        this.isDebugLoggingEnabled = z;
    }

    public final void setHistoryLoadingCount$threads_release(int i) {
        this.historyLoadingCount = i;
    }

    public final void setKeepSocketActive$threads_release(boolean z) {
        this.keepSocketActive = z;
    }

    public final void setLoggerConfig$threads_release(LoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

    public final void setNetworkInterceptor$threads_release(k65 k65Var) {
        this.networkInterceptor = k65Var;
    }

    public BaseConfigBuilder setNewChatCenterApi() {
        this.isNewChatCenterApi = true;
        return this;
    }

    public final void setNewChatCenterApi$threads_release(boolean z) {
        this.isNewChatCenterApi = z;
    }

    public BaseConfigBuilder setNotificationImportance(int i) {
        this.notificationImportance = i;
        return this;
    }

    public final void setNotificationImportance$threads_release(int i) {
        this.notificationImportance = i;
    }

    public final void setRequestConfig$threads_release(RequestConfig requestConfig) {
        z65.h(requestConfig, "<set-?>");
        this.requestConfig = requestConfig;
    }

    public final void setServerBaseUrl$threads_release(String str) {
        this.serverBaseUrl = str;
    }

    public final void setSurveyCompletionDelay$threads_release(int i) {
        this.surveyCompletionDelay = i;
    }

    public final void setThreadsGateProviderUid$threads_release(String str) {
        this.threadsGateProviderUid = str;
    }

    public final void setThreadsGateUrl$threads_release(String str) {
        this.threadsGateUrl = str;
    }

    public final void setTrustedSSLCertificates$threads_release(List<Integer> list) {
        z65.h(list, "<set-?>");
        this.trustedSSLCertificates = list;
    }

    public final void setUnreadMessagesCountListener$threads_release(UnreadMessagesCountListener unreadMessagesCountListener) {
        this.unreadMessagesCountListener = unreadMessagesCountListener;
    }

    public BaseConfigBuilder surveyCompletionDelay(int i) {
        this.surveyCompletionDelay = i;
        return this;
    }

    public BaseConfigBuilder threadsGateProviderUid(String str) {
        this.threadsGateProviderUid = str;
        return this;
    }

    public BaseConfigBuilder threadsGateUrl(String str) {
        boolean y;
        boolean u;
        String U0;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                u = l0b.u(str, "/", false, 2, null);
                if (u) {
                    U0 = o0b.U0(str, 1);
                    this.threadsGateUrl = U0;
                    return this;
                }
            }
        }
        this.threadsGateUrl = str;
        return this;
    }

    public BaseConfigBuilder trustedSSLCertificates(List<Integer> list) {
        List<Integer> l;
        List<Integer> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            l = kc1.l();
            this.trustedSSLCertificates = l;
        } else {
            this.trustedSSLCertificates = list;
        }
        return this;
    }

    public BaseConfigBuilder unreadMessagesCountListener(UnreadMessagesCountListener unreadMessagesCountListener) {
        this.unreadMessagesCountListener = unreadMessagesCountListener;
        return this;
    }
}
