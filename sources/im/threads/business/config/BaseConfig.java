package im.threads.business.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import com.google.gson.a;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.business.exceptions.MetaConfigurationException;
import im.threads.business.imageLoading.ImageLoaderOkHttpProvider;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.models.enums.ApiVersionEnum;
import im.threads.business.rest.config.RequestConfig;
import im.threads.business.rest.config.SocketClientSettings;
import im.threads.business.transport.Transport;
import im.threads.business.transport.threadsGate.ThreadsGateTransport;
import im.threads.business.utils.TlsConfigurationUtils;
import im.threads.business.utils.gson.UriDeserializer;
import im.threads.business.utils.gson.UriSerializer;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BaseConfig.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 o2\u00020\u0001:\u0001oB¯\u0001\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00106\u001a\u00020!\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010I\u001a\u00020!\u0012\u0006\u0010L\u001a\u00020!\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bm\u0010nJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J$\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J/\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b6\u0010$R\u0017\u00107\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010#\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\"\u0010L\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010#\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&R\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010Y\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b\u0006\u0010[\"\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020!0`8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010e\u001a\n d*\u0004\u0018\u00010c0c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k¨\u0006p"}, d2 = {"Lim/threads/business/config/BaseConfig;", "", "", "", "trustedSSLCertificates", "Lim/threads/business/models/SslSocketFactoryConfig;", "getSslSocketFactoryConfig", "", "providedThreadsGateUrl", "providedThreadsGateProviderUid", "Lim/threads/business/rest/config/SocketClientSettings;", "socketClientSettings", "Lim/threads/business/transport/Transport;", "getTransport", "threadsGateUrl", "threadsGateProviderUid", "", "updateTransport$threads_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "updateTransport", "serverBaseUrl", "Ljava/lang/String;", "getServerBaseUrl", "()Ljava/lang/String;", "setServerBaseUrl", "(Ljava/lang/String;)V", "datastoreUrl", "getDatastoreUrl", "setDatastoreUrl", "getThreadsGateUrl", "setThreadsGateUrl", "getThreadsGateProviderUid", "setThreadsGateProviderUid", "", "isNewChatCenterApi", "Z", "()Z", "setNewChatCenterApi", "(Z)V", "Lim/threads/business/logger/LoggerConfig;", "loggerConfig", "Lim/threads/business/logger/LoggerConfig;", "getLoggerConfig", "()Lim/threads/business/logger/LoggerConfig;", "Lim/threads/business/core/UnreadMessagesCountListener;", "unreadMessagesCountListener", "Lim/threads/business/core/UnreadMessagesCountListener;", "getUnreadMessagesCountListener", "()Lim/threads/business/core/UnreadMessagesCountListener;", "Lk65;", "networkInterceptor", "Lk65;", "getNetworkInterceptor", "()Lk65;", "isDebugLoggingEnabled", "historyLoadingCount", "I", "getHistoryLoadingCount", "()I", "surveyCompletionDelay", "getSurveyCompletionDelay", "Lim/threads/business/rest/config/RequestConfig;", "requestConfig", "Lim/threads/business/rest/config/RequestConfig;", "getRequestConfig", "()Lim/threads/business/rest/config/RequestConfig;", "notificationImportance", "getNotificationImportance", "Ljava/util/List;", "getTrustedSSLCertificates", "()Ljava/util/List;", "setTrustedSSLCertificates", "(Ljava/util/List;)V", "allowUntrustedSSLCertificate", "getAllowUntrustedSSLCertificate", "setAllowUntrustedSSLCertificate", "keepSocketActive", "getKeepSocketActive", "setKeepSocketActive", "Lim/threads/business/models/enums/ApiVersionEnum;", "apiVersion", "Lim/threads/business/models/enums/ApiVersionEnum;", "getApiVersion", "()Lim/threads/business/models/enums/ApiVersionEnum;", "setApiVersion", "(Lim/threads/business/models/enums/ApiVersionEnum;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "sslSocketFactoryConfig", "Lim/threads/business/models/SslSocketFactoryConfig;", "()Lim/threads/business/models/SslSocketFactoryConfig;", "setSslSocketFactoryConfig", "(Lim/threads/business/models/SslSocketFactoryConfig;)V", "transport", "Lim/threads/business/transport/Transport;", "Lcr6;", "disabledUserInput", "Lcr6;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Lim/threads/business/imageLoading/ImageLoaderOkHttpProvider;", "imageLoaderOkHttpProvider$delegate", "Lrn5;", "getImageLoaderOkHttpProvider", "()Lim/threads/business/imageLoading/ImageLoaderOkHttpProvider;", "imageLoaderOkHttpProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLim/threads/business/logger/LoggerConfig;Lim/threads/business/core/UnreadMessagesCountListener;Lk65;ZIILim/threads/business/rest/config/RequestConfig;ILjava/util/List;ZZLim/threads/business/models/enums/ApiVersionEnum;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class BaseConfig {
    public static final Companion Companion = new Companion(null);
    @SuppressLint({"StaticFieldLeak"})
    private static BaseConfig baseInstance;
    private boolean allowUntrustedSSLCertificate;
    private ApiVersionEnum apiVersion;
    public final Context context;
    private String datastoreUrl;
    public cr6<Boolean> disabledUserInput;
    public final Gson gson;
    private final int historyLoadingCount;
    private final rn5 imageLoaderOkHttpProvider$delegate;
    private final boolean isDebugLoggingEnabled;
    private boolean isNewChatCenterApi;
    private boolean keepSocketActive;
    private final LoggerConfig loggerConfig;
    private final k65 networkInterceptor;
    private final int notificationImportance;
    private final RequestConfig requestConfig;
    private String serverBaseUrl;
    private SslSocketFactoryConfig sslSocketFactoryConfig;
    private final int surveyCompletionDelay;
    private String threadsGateProviderUid;
    private String threadsGateUrl;
    public Transport transport;
    private List<Integer> trustedSSLCertificates;
    private final UnreadMessagesCountListener unreadMessagesCountListener;

    /* compiled from: BaseConfig.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lim/threads/business/config/BaseConfig$Companion;", "", "()V", "baseInstance", "Lim/threads/business/config/BaseConfig;", "getInstance", "setInstance", "", "instance", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BaseConfig getInstance() {
            BaseConfig baseConfig = BaseConfig.baseInstance;
            z65.e(baseConfig);
            return baseConfig;
        }

        public final void setInstance(BaseConfig baseConfig) {
            z65.h(baseConfig, "instance");
            BaseConfig.baseInstance = baseConfig;
        }
    }

    public BaseConfig(Context context, String str, String str2, String str3, String str4, boolean z, LoggerConfig loggerConfig, UnreadMessagesCountListener unreadMessagesCountListener, k65 k65Var, boolean z2, int i, int i2, RequestConfig requestConfig, int i3, List<Integer> list, boolean z3, boolean z4, ApiVersionEnum apiVersionEnum) {
        rn5 b;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(requestConfig, "requestConfig");
        z65.h(apiVersionEnum, "apiVersion");
        this.serverBaseUrl = str;
        this.datastoreUrl = str2;
        this.threadsGateUrl = str3;
        this.threadsGateProviderUid = str4;
        this.isNewChatCenterApi = z;
        this.loggerConfig = loggerConfig;
        this.unreadMessagesCountListener = unreadMessagesCountListener;
        this.networkInterceptor = k65Var;
        this.isDebugLoggingEnabled = z2;
        this.historyLoadingCount = i;
        this.surveyCompletionDelay = i2;
        this.requestConfig = requestConfig;
        this.notificationImportance = i3;
        this.trustedSSLCertificates = list;
        this.allowUntrustedSSLCertificate = z3;
        this.keepSocketActive = z4;
        this.apiVersion = apiVersionEnum;
        this.disabledUserInput = uha.b(1, 0, zg0.DROP_OLDEST, 2, null);
        this.gson = new a().c(Uri.class, new UriSerializer()).c(Uri.class, new UriDeserializer()).b();
        b = yn5.b(BaseConfig$special$$inlined$inject$1.INSTANCE);
        this.imageLoaderOkHttpProvider$delegate = b;
        Context applicationContext = context.getApplicationContext();
        z65.g(applicationContext, "context.applicationContext");
        this.context = applicationContext;
        this.transport = getTransport(this.threadsGateUrl, this.threadsGateProviderUid, requestConfig.getSocketClientSettings());
        this.sslSocketFactoryConfig = getSslSocketFactoryConfig(this.trustedSSLCertificates);
        getImageLoaderOkHttpProvider().createOkHttpClient(requestConfig.getPicassoHttpClientSettings(), this.sslSocketFactoryConfig);
    }

    private final ImageLoaderOkHttpProvider getImageLoaderOkHttpProvider() {
        return (ImageLoaderOkHttpProvider) this.imageLoaderOkHttpProvider$delegate.getValue();
    }

    private final Transport getTransport(String str, String str2, SocketClientSettings socketClientSettings) {
        boolean y;
        boolean y2;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                if (str2 != null) {
                    y2 = l0b.y(str2);
                    if (!y2) {
                        return new ThreadsGateTransport(str, str2, this.isDebugLoggingEnabled, socketClientSettings, this.sslSocketFactoryConfig, this.networkInterceptor, this.context);
                    }
                }
                throw new MetaConfigurationException("Threads gate provider uid is not set");
            }
        }
        throw new MetaConfigurationException("Threads gate url is not set");
    }

    public final boolean getAllowUntrustedSSLCertificate() {
        return this.allowUntrustedSSLCertificate;
    }

    public final ApiVersionEnum getApiVersion() {
        return this.apiVersion;
    }

    public final String getDatastoreUrl() {
        return this.datastoreUrl;
    }

    public final int getHistoryLoadingCount() {
        return this.historyLoadingCount;
    }

    public final boolean getKeepSocketActive() {
        return this.keepSocketActive;
    }

    public final LoggerConfig getLoggerConfig() {
        return this.loggerConfig;
    }

    public final k65 getNetworkInterceptor() {
        return this.networkInterceptor;
    }

    public final int getNotificationImportance() {
        return this.notificationImportance;
    }

    public final RequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public final String getServerBaseUrl() {
        return this.serverBaseUrl;
    }

    public final SslSocketFactoryConfig getSslSocketFactoryConfig() {
        return this.sslSocketFactoryConfig;
    }

    public final int getSurveyCompletionDelay() {
        return this.surveyCompletionDelay;
    }

    public final String getThreadsGateProviderUid() {
        return this.threadsGateProviderUid;
    }

    public final String getThreadsGateUrl() {
        return this.threadsGateUrl;
    }

    public final List<Integer> getTrustedSSLCertificates() {
        return this.trustedSSLCertificates;
    }

    public final UnreadMessagesCountListener getUnreadMessagesCountListener() {
        return this.unreadMessagesCountListener;
    }

    public final boolean isDebugLoggingEnabled() {
        return this.isDebugLoggingEnabled;
    }

    public final boolean isNewChatCenterApi() {
        return this.isNewChatCenterApi;
    }

    public final void setAllowUntrustedSSLCertificate(boolean z) {
        this.allowUntrustedSSLCertificate = z;
    }

    public final void setApiVersion(ApiVersionEnum apiVersionEnum) {
        z65.h(apiVersionEnum, "<set-?>");
        this.apiVersion = apiVersionEnum;
    }

    public final void setDatastoreUrl(String str) {
        this.datastoreUrl = str;
    }

    public final void setKeepSocketActive(boolean z) {
        this.keepSocketActive = z;
    }

    public final void setNewChatCenterApi(boolean z) {
        this.isNewChatCenterApi = z;
    }

    public final void setServerBaseUrl(String str) {
        this.serverBaseUrl = str;
    }

    public final void setSslSocketFactoryConfig(SslSocketFactoryConfig sslSocketFactoryConfig) {
        this.sslSocketFactoryConfig = sslSocketFactoryConfig;
    }

    public final void setThreadsGateProviderUid(String str) {
        this.threadsGateProviderUid = str;
    }

    public final void setThreadsGateUrl(String str) {
        this.threadsGateUrl = str;
    }

    public final void setTrustedSSLCertificates(List<Integer> list) {
        this.trustedSSLCertificates = list;
    }

    public final void updateTransport$threads_release(String str, String str2, List<Integer> list) {
        z65.h(str, "threadsGateUrl");
        z65.h(str2, "threadsGateProviderUid");
        this.trustedSSLCertificates = list;
        this.sslSocketFactoryConfig = getSslSocketFactoryConfig(list);
        getImageLoaderOkHttpProvider().createOkHttpClient(this.requestConfig.getPicassoHttpClientSettings(), this.sslSocketFactoryConfig);
        this.transport = getTransport(str, str2, this.requestConfig.getSocketClientSettings());
    }

    private final SslSocketFactoryConfig getSslSocketFactoryConfig(List<Integer> list) {
        List<Integer> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (this.allowUntrustedSSLCertificate) {
                return TlsConfigurationUtils.createSslSocketFactoryConfig(new TrustManager[]{new X509TrustManager() { // from class: im.threads.business.config.BaseConfig$getSslSocketFactoryConfig$trustManagers$1
                    @Override // javax.net.ssl.X509TrustManager
                    @SuppressLint({"TrustAllX509TrustManager"})
                    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                        z65.h(x509CertificateArr, "chain");
                        z65.h(str, "authType");
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    @SuppressLint({"TrustAllX509TrustManager"})
                    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                        z65.h(x509CertificateArr, "chain");
                        z65.h(str, "authType");
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                }});
            }
            return null;
        }
        Resources resources = this.context.getResources();
        z65.g(resources, "context.resources");
        return TlsConfigurationUtils.createSslSocketFactoryConfig(TlsConfigurationUtils.getTrustManagers(TlsConfigurationUtils.createTlsPinningKeyStore(resources, list)));
    }

    public /* synthetic */ BaseConfig(Context context, String str, String str2, String str3, String str4, boolean z, LoggerConfig loggerConfig, UnreadMessagesCountListener unreadMessagesCountListener, k65 k65Var, boolean z2, int i, int i2, RequestConfig requestConfig, int i3, List list, boolean z3, boolean z4, ApiVersionEnum apiVersionEnum, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, (i4 & 32) != 0 ? false : z, loggerConfig, unreadMessagesCountListener, k65Var, z2, i, i2, requestConfig, i3, list, z3, z4, apiVersionEnum);
    }
}
