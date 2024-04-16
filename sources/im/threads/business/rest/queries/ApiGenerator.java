package im.threads.business.rest.queries;

import com.google.gson.Gson;
import com.google.gson.a;
import defpackage.b77;
import defpackage.k65;
import defpackage.mq4;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.NetworkLoggerInterceptor;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.rest.config.HttpClientSettings;
import im.threads.business.rest.queries.ApiGenerator;
import im.threads.business.transport.AuthInterceptor;
import im.threads.business.utils.AppInfo;
import im.threads.business.utils.DeviceInfo;
import im.threads.business.utils.SSLCertificateInterceptor;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: ApiGenerator.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lim/threads/business/rest/queries/ApiGenerator;", "", "Lb77;", "createOkHttpClient", "", "init", "createThreadsApi", "Lim/threads/business/config/BaseConfig;", "config", "Lim/threads/business/config/BaseConfig;", "", "isDatastoreApi", "Z", "Lim/threads/business/rest/queries/ThreadsApi;", "threadsApi", "Lim/threads/business/rest/queries/ThreadsApi;", "getThreadsApi", "()Lim/threads/business/rest/queries/ThreadsApi;", "setThreadsApi", "(Lim/threads/business/rest/queries/ThreadsApi;)V", "Lretrofit2/Retrofit;", "apiBuild", "Lretrofit2/Retrofit;", "getApiBuild", "()Lretrofit2/Retrofit;", "setApiBuild", "(Lretrofit2/Retrofit;)V", "datastoreBuild", "getDatastoreBuild", "setDatastoreBuild", "Lim/threads/business/transport/AuthInterceptor;", "authInterceptor$delegate", "Lrn5;", "getAuthInterceptor", "()Lim/threads/business/transport/AuthInterceptor;", "authInterceptor", "Lim/threads/business/utils/AppInfo;", "appInfo$delegate", "getAppInfo", "()Lim/threads/business/utils/AppInfo;", "appInfo", "Lim/threads/business/utils/DeviceInfo;", "deviceInfo$delegate", "getDeviceInfo", "()Lim/threads/business/utils/DeviceInfo;", "deviceInfo", "", "getUserAgent", "()Ljava/lang/String;", "userAgent", "<init>", "(Lim/threads/business/config/BaseConfig;Z)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class ApiGenerator {
    public static final Companion Companion = new Companion(null);
    private static final String USER_AGENT_HEADER = "User-Agent";
    protected Retrofit apiBuild;
    private final rn5 appInfo$delegate;
    private final rn5 authInterceptor$delegate;
    private final BaseConfig config;
    protected Retrofit datastoreBuild;
    private final rn5 deviceInfo$delegate;
    private final boolean isDatastoreApi;
    protected ThreadsApi threadsApi;

    /* compiled from: ApiGenerator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lim/threads/business/rest/queries/ApiGenerator$Companion;", "", "()V", "USER_AGENT_HEADER", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ApiGenerator(BaseConfig baseConfig, boolean z) {
        rn5 b;
        rn5 b2;
        rn5 b3;
        z65.h(baseConfig, "config");
        this.config = baseConfig;
        this.isDatastoreApi = z;
        b = yn5.b(ApiGenerator$special$$inlined$inject$1.INSTANCE);
        this.authInterceptor$delegate = b;
        b2 = yn5.b(ApiGenerator$special$$inlined$inject$2.INSTANCE);
        this.appInfo$delegate = b2;
        b3 = yn5.b(ApiGenerator$special$$inlined$inject$3.INSTANCE);
        this.deviceInfo$delegate = b3;
        init();
    }

    private final b77 createOkHttpClient() {
        HttpClientSettings threadsApiHttpClientSettings = this.config.getRequestConfig().getThreadsApiHttpClientSettings();
        long component1 = threadsApiHttpClientSettings.component1();
        long component2 = threadsApiHttpClientSettings.component2();
        long component3 = threadsApiHttpClientSettings.component3();
        b77.a a = new b77.a().a(new k65() { // from class: km
            @Override // defpackage.k65
            public final ik9 intercept(k65.a aVar) {
                ik9 createOkHttpClient$lambda$0;
                createOkHttpClient$lambda$0 = ApiGenerator.createOkHttpClient$lambda$0(ApiGenerator.this, aVar);
                return createOkHttpClient$lambda$0;
            }
        }).a(getAuthInterceptor());
        k65 networkInterceptor = this.config.getNetworkInterceptor();
        if (networkInterceptor != null) {
            a.a(networkInterceptor);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b77.a V = a.e(component1, timeUnit).S(component2, timeUnit).V(component3, timeUnit);
        if (this.config.isDebugLoggingEnabled()) {
            new mq4(null, 1, null).c(mq4.a.BODY);
        }
        SslSocketFactoryConfig sslSocketFactoryConfig = this.config.getSslSocketFactoryConfig();
        if (sslSocketFactoryConfig != null) {
            if (this.config.isDebugLoggingEnabled()) {
                V.a(new SSLCertificateInterceptor());
            }
            V.U(sslSocketFactoryConfig.getSslSocketFactory(), sslSocketFactoryConfig.getTrustManager());
            V.N(new HostnameVerifier() { // from class: lm
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    boolean createOkHttpClient$lambda$3;
                    createOkHttpClient$lambda$3 = ApiGenerator.createOkHttpClient$lambda$3(str, sSLSession);
                    return createOkHttpClient$lambda$3;
                }
            });
        }
        V.a(new NetworkLoggerInterceptor(false, 1, null));
        return V.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ik9 createOkHttpClient$lambda$0(ApiGenerator apiGenerator, k65.a aVar) {
        z65.h(apiGenerator, "this$0");
        z65.h(aVar, "chain");
        return aVar.b(aVar.request().i().j(USER_AGENT_HEADER, apiGenerator.getUserAgent()).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createOkHttpClient$lambda$3(String str, SSLSession sSLSession) {
        return true;
    }

    private final AppInfo getAppInfo() {
        return (AppInfo) this.appInfo$delegate.getValue();
    }

    private final AuthInterceptor getAuthInterceptor() {
        return (AuthInterceptor) this.authInterceptor$delegate.getValue();
    }

    private final DeviceInfo getDeviceInfo() {
        return (DeviceInfo) this.deviceInfo$delegate.getValue();
    }

    private final String getUserAgent() {
        pza pzaVar = pza.a;
        String string = this.config.context.getResources().getString(R.string.threads_user_agent);
        z65.g(string, "config.context.resources…tring.threads_user_agent)");
        String format = String.format(string, Arrays.copyOf(new Object[]{getDeviceInfo().getOsVersion(), getDeviceInfo().getDeviceName(), getDeviceInfo().getIpAddress(), getAppInfo().getAppVersion(), getAppInfo().getAppId(), getAppInfo().getLibVersion()}, 6));
        z65.g(format, "format(format, *args)");
        return format;
    }

    private final void init() {
        Gson b = new a().i().b();
        z65.g(b, "GsonBuilder()\n          …t()\n            .create()");
        Retrofit.Builder builder = new Retrofit.Builder();
        BaseConfig.Companion companion = BaseConfig.Companion;
        Retrofit build = builder.baseUrl(companion.getInstance().getServerBaseUrl()).addConverterFactory(GsonConverterFactory.create(b)).client(createOkHttpClient()).build();
        z65.g(build, "Builder()\n            .b…t())\n            .build()");
        setApiBuild(build);
        Retrofit build2 = new Retrofit.Builder().baseUrl(companion.getInstance().getDatastoreUrl()).addConverterFactory(GsonConverterFactory.create(b)).client(createOkHttpClient()).build();
        z65.g(build2, "Builder()\n            .b…t())\n            .build()");
        setDatastoreBuild(build2);
        createThreadsApi();
    }

    public abstract void createThreadsApi();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Retrofit getApiBuild() {
        Retrofit retrofit = this.apiBuild;
        if (retrofit != null) {
            return retrofit;
        }
        z65.z("apiBuild");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Retrofit getDatastoreBuild() {
        Retrofit retrofit = this.datastoreBuild;
        if (retrofit != null) {
            return retrofit;
        }
        z65.z("datastoreBuild");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ThreadsApi getThreadsApi() {
        ThreadsApi threadsApi = this.threadsApi;
        if (threadsApi != null) {
            return threadsApi;
        }
        z65.z("threadsApi");
        return null;
    }

    protected final void setApiBuild(Retrofit retrofit) {
        z65.h(retrofit, "<set-?>");
        this.apiBuild = retrofit;
    }

    protected final void setDatastoreBuild(Retrofit retrofit) {
        z65.h(retrofit, "<set-?>");
        this.datastoreBuild = retrofit;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setThreadsApi(ThreadsApi threadsApi) {
        z65.h(threadsApi, "<set-?>");
        this.threadsApi = threadsApi;
    }
}
