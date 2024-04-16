package im.threads.ui.config;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.config.BaseConfigBuilder;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.rest.config.RequestConfig;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.ChatActivity;
import im.threads.ui.core.PendingIntentCreator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ConfigBuilder.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001e\u001a\u00020\u0000J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000eH\u0017J\u0012\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010,¨\u00061"}, d2 = {"Lim/threads/ui/config/ConfigBuilder;", "Lim/threads/business/config/BaseConfigBuilder;", "Lim/threads/ui/core/PendingIntentCreator;", "pendingIntentCreator", "", "keepSocketActive", "", "serverBaseUrl", "datastoreUrl", "threadsGateUrl", "threadsGateProviderUid", "Lim/threads/business/core/UnreadMessagesCountListener;", "unreadMessagesCountListener", "isDebugLoggingEnabled", "", "historyLoadingCount", "surveyCompletionDelay", "Lim/threads/business/rest/config/RequestConfig;", "requestConfig", "", "trustedSSLCertificates", "Lk65;", "interceptor", "networkInterceptor", "setNewChatCenterApi", "Lim/threads/ui/ChatStyle;", "lightTheme", "applyLightTheme", "darkTheme", "applyDarkTheme", "showAttachmentsButton", "importance", "setNotificationImportance", "Lim/threads/business/logger/LoggerConfig;", "config", "enableLogging", "Lim/threads/ui/config/Config;", "build", "toString", "isAttachmentsEnabled", "Ljava/lang/Boolean;", "Lim/threads/ui/ChatStyle;", "isCustomPendingIntentCreatorInstalled", "Z", "Lim/threads/ui/core/PendingIntentCreator;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConfigBuilder extends BaseConfigBuilder {
    private ChatStyle darkTheme;
    private Boolean isAttachmentsEnabled;
    private boolean isCustomPendingIntentCreatorInstalled;
    private ChatStyle lightTheme;
    private PendingIntentCreator pendingIntentCreator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigBuilder(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.pendingIntentCreator = new PendingIntentCreator() { // from class: im.threads.ui.config.ConfigBuilder$pendingIntentCreator$1
            @Override // im.threads.ui.core.PendingIntentCreator
            public PendingIntent create(Context context2, String str) {
                int i;
                z65.h(context2, CoreConstants.CONTEXT_SCOPE_VALUE);
                Intent intent = new Intent(context2, ChatActivity.class);
                intent.setFlags(603979776);
                if (Build.VERSION.SDK_INT >= 23) {
                    i = 335544320;
                } else {
                    i = 268435456;
                }
                return PendingIntent.getActivity(context2, 0, intent, i);
            }
        };
    }

    public final ConfigBuilder applyDarkTheme(ChatStyle chatStyle) {
        this.darkTheme = chatStyle;
        return this;
    }

    public final ConfigBuilder applyLightTheme(ChatStyle chatStyle) {
        this.lightTheme = chatStyle;
        return this;
    }

    public final ConfigBuilder pendingIntentCreator(PendingIntentCreator pendingIntentCreator) {
        z65.h(pendingIntentCreator, "pendingIntentCreator");
        this.pendingIntentCreator = pendingIntentCreator;
        this.isCustomPendingIntentCreatorInstalled = true;
        return this;
    }

    public final ConfigBuilder showAttachmentsButton() {
        this.isAttachmentsEnabled = Boolean.TRUE;
        return this;
    }

    public String toString() {
        boolean z;
        Boolean bool = this.isAttachmentsEnabled;
        boolean z2 = this.isCustomPendingIntentCreatorInstalled;
        String serverBaseUrl$threads_release = getServerBaseUrl$threads_release();
        String datastoreUrl$threads_release = getDatastoreUrl$threads_release();
        String threadsGateUrl$threads_release = getThreadsGateUrl$threads_release();
        String threadsGateProviderUid$threads_release = getThreadsGateProviderUid$threads_release();
        boolean isNewChatCenterApi$threads_release = isNewChatCenterApi$threads_release();
        String name = getApiVersion$threads_release().name();
        LoggerConfig loggerConfig$threads_release = getLoggerConfig$threads_release();
        boolean z3 = false;
        if (getUnreadMessagesCountListener$threads_release() != null) {
            z = true;
        } else {
            z = false;
        }
        if (getNetworkInterceptor$threads_release() != null) {
            z3 = true;
        }
        boolean isDebugLoggingEnabled$threads_release = isDebugLoggingEnabled$threads_release();
        int historyLoadingCount$threads_release = getHistoryLoadingCount$threads_release();
        int surveyCompletionDelay$threads_release = getSurveyCompletionDelay$threads_release();
        RequestConfig requestConfig$threads_release = getRequestConfig$threads_release();
        int notificationLevel = getNotificationLevel();
        Boolean bool2 = this.isAttachmentsEnabled;
        int size = getTrustedSSLCertificates$threads_release().size();
        boolean keepSocketActive$threads_release = getKeepSocketActive$threads_release();
        ChatStyle chatStyle = this.lightTheme;
        ChatStyle chatStyle2 = this.darkTheme;
        return "Config. isAttachmentsEnabled: " + bool + " | is custom pending intent creator installed: " + z2 + " | serverBaseUrl: " + serverBaseUrl$threads_release + " | datastoreUrl: " + datastoreUrl$threads_release + " | threadsGateUrl: " + threadsGateUrl$threads_release + " | threadsGateProviderUid: " + threadsGateProviderUid$threads_release + " | isNewChatCenterApi: " + isNewChatCenterApi$threads_release + "\napiVersion: " + name + "\n" + loggerConfig$threads_release + "\nunreadMessagesCountListener is installed: " + z + " | networkInterceptor is installed: " + z3 + " | isDebugLoggingEnabled: " + isDebugLoggingEnabled$threads_release + " | historyLoadingCount: " + historyLoadingCount$threads_release + " | surveyCompletionDelay: " + surveyCompletionDelay$threads_release + "\n" + requestConfig$threads_release + "\nnotificationLevel: " + notificationLevel + " | isAttachmentsEnabled: " + bool2 + " | trustedSSLCertificates count: " + size + "\nkeepSocketActive: " + keepSocketActive$threads_release + "\nlightTheme: " + chatStyle + "\ndarkTheme: " + chatStyle2;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public /* bridge */ /* synthetic */ BaseConfigBuilder trustedSSLCertificates(List list) {
        return trustedSSLCertificates((List<Integer>) list);
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public Config build() {
        return new Config(getContext(), getServerBaseUrl$threads_release(), getDatastoreUrl$threads_release(), getThreadsGateUrl$threads_release(), getThreadsGateProviderUid$threads_release(), isNewChatCenterApi$threads_release(), getApiVersion$threads_release(), getLoggerConfig$threads_release(), this.pendingIntentCreator, getUnreadMessagesCountListener$threads_release(), getNetworkInterceptor$threads_release(), this.lightTheme, this.darkTheme, isDebugLoggingEnabled$threads_release(), getHistoryLoadingCount$threads_release(), getSurveyCompletionDelay$threads_release(), getRequestConfig$threads_release(), getTrustedSSLCertificates$threads_release(), getAllowUntrustedSSLCertificate$threads_release(), getKeepSocketActive$threads_release(), getNotificationLevel(), this.isAttachmentsEnabled);
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder datastoreUrl(String str) {
        super.datastoreUrl(str);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder enableLogging(LoggerConfig loggerConfig) {
        super.setLoggerConfig$threads_release(loggerConfig);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder historyLoadingCount(int i) {
        super.historyLoadingCount(i);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder isDebugLoggingEnabled(boolean z) {
        super.isDebugLoggingEnabled(z);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder keepSocketActive(boolean z) {
        super.keepSocketActive(z);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder networkInterceptor(k65 k65Var) {
        super.networkInterceptor(k65Var);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder requestConfig(RequestConfig requestConfig) {
        z65.h(requestConfig, "requestConfig");
        super.requestConfig(requestConfig);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder serverBaseUrl(String str) {
        super.serverBaseUrl(str);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder setNewChatCenterApi() {
        super.setNewChatCenterApi$threads_release(true);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder setNotificationImportance(int i) {
        super.setNotificationImportance(i);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder surveyCompletionDelay(int i) {
        super.surveyCompletionDelay(i);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder threadsGateProviderUid(String str) {
        super.threadsGateProviderUid(str);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder threadsGateUrl(String str) {
        super.threadsGateUrl(str);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder trustedSSLCertificates(List<Integer> list) {
        super.trustedSSLCertificates(list);
        return this;
    }

    @Override // im.threads.business.config.BaseConfigBuilder
    public ConfigBuilder unreadMessagesCountListener(UnreadMessagesCountListener unreadMessagesCountListener) {
        super.unreadMessagesCountListener(unreadMessagesCountListener);
        return this;
    }
}
