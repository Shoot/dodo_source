package im.threads.business.imageLoading;

import defpackage.b77;
import defpackage.hi9;
import defpackage.k65;
import im.threads.business.UserInfoBuilder;
import im.threads.business.imageLoading.ImageLoaderOkHttpProvider;
import im.threads.business.logger.NetworkLoggerInterceptor;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.rest.config.HttpClientSettings;
import im.threads.business.transport.AuthHeadersProvider;
import im.threads.business.utils.ClientUseCase;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageLoaderOkHttpProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lim/threads/business/imageLoading/ImageLoaderOkHttpProvider;", "", "authHeadersProvider", "Lim/threads/business/transport/AuthHeadersProvider;", "clientUseCase", "Lim/threads/business/utils/ClientUseCase;", "(Lim/threads/business/transport/AuthHeadersProvider;Lim/threads/business/utils/ClientUseCase;)V", "createOkHttpClient", "", "httpClientSettings", "Lim/threads/business/rest/config/HttpClientSettings;", "sslSocketFactoryConfig", "Lim/threads/business/models/SslSocketFactoryConfig;", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoaderOkHttpProvider {
    public static final Companion Companion = new Companion(null);
    private static b77 okHttpClient;
    private final AuthHeadersProvider authHeadersProvider;
    private final ClientUseCase clientUseCase;

    /* compiled from: ImageLoaderOkHttpProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lim/threads/business/imageLoading/ImageLoaderOkHttpProvider$Companion;", "", "Lb77;", "okHttpClient", "Lb77;", "getOkHttpClient", "()Lb77;", "setOkHttpClient", "(Lb77;)V", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b77 getOkHttpClient() {
            return ImageLoaderOkHttpProvider.okHttpClient;
        }

        public final void setOkHttpClient(b77 b77Var) {
            ImageLoaderOkHttpProvider.okHttpClient = b77Var;
        }
    }

    public ImageLoaderOkHttpProvider(AuthHeadersProvider authHeadersProvider, ClientUseCase clientUseCase) {
        z65.h(authHeadersProvider, "authHeadersProvider");
        z65.h(clientUseCase, "clientUseCase");
        this.authHeadersProvider = authHeadersProvider;
        this.clientUseCase = clientUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createOkHttpClient$lambda$3(String str, SSLSession sSLSession) {
        z65.h(str, "<anonymous parameter 0>");
        z65.h(sSLSession, "<anonymous parameter 1>");
        return true;
    }

    public final void createOkHttpClient(HttpClientSettings httpClientSettings, SslSocketFactoryConfig sslSocketFactoryConfig) {
        z65.h(httpClientSettings, "httpClientSettings");
        b77.a a = new b77.a().a(new k65() { // from class: im.threads.business.imageLoading.ImageLoaderOkHttpProvider$createOkHttpClient$$inlined$-addInterceptor$1
            @Override // defpackage.k65
            public final ik9 intercept(k65.a aVar) {
                ClientUseCase clientUseCase;
                AuthHeadersProvider authHeadersProvider;
                String clientId;
                z65.h(aVar, "chain");
                clientUseCase = ImageLoaderOkHttpProvider.this.clientUseCase;
                UserInfoBuilder userInfo = clientUseCase.getUserInfo();
                hi9.a i = aVar.request().i();
                if (userInfo != null && (clientId = userInfo.getClientId()) != null) {
                    i.a("X-Ext-Client-ID", clientId);
                }
                authHeadersProvider = ImageLoaderOkHttpProvider.this.authHeadersProvider;
                return aVar.b(authHeadersProvider.getRequestWithHeaders(userInfo, i.b()));
            }
        });
        long connectTimeoutMillis = httpClientSettings.getConnectTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b77.a V = a.e(connectTimeoutMillis, timeUnit).S(httpClientSettings.getReadTimeoutMillis(), timeUnit).V(httpClientSettings.getWriteTimeoutMillis(), timeUnit);
        if (sslSocketFactoryConfig != null) {
            V.U(sslSocketFactoryConfig.getSslSocketFactory(), sslSocketFactoryConfig.getTrustManager());
            V.N(new HostnameVerifier() { // from class: wu4
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    boolean createOkHttpClient$lambda$3;
                    createOkHttpClient$lambda$3 = ImageLoaderOkHttpProvider.createOkHttpClient$lambda$3(str, sSLSession);
                    return createOkHttpClient$lambda$3;
                }
            });
        }
        V.a(new NetworkLoggerInterceptor(true));
        okHttpClient = V.c();
    }
}
