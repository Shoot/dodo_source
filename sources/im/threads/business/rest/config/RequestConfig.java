package im.threads.business.rest.config;

import kotlin.Metadata;
/* compiled from: RequestConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lim/threads/business/rest/config/RequestConfig;", "", "()V", "authHttpClientSettings", "Lim/threads/business/rest/config/HttpClientSettings;", "getAuthHttpClientSettings$annotations", "getAuthHttpClientSettings", "()Lim/threads/business/rest/config/HttpClientSettings;", "picassoHttpClientSettings", "getPicassoHttpClientSettings", "socketClientSettings", "Lim/threads/business/rest/config/SocketClientSettings;", "getSocketClientSettings", "()Lim/threads/business/rest/config/SocketClientSettings;", "threadsApiHttpClientSettings", "getThreadsApiHttpClientSettings", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestConfig {
    private final SocketClientSettings socketClientSettings = new SocketClientSettings(0, 0, 0, 0, 0, 0, 63, null);
    private final HttpClientSettings picassoHttpClientSettings = new HttpClientSettings(0, 0, 0, 7, null);
    private final HttpClientSettings authHttpClientSettings = new HttpClientSettings(2000, 0, 0, 6, null);
    private final HttpClientSettings threadsApiHttpClientSettings = new HttpClientSettings(60000, 0, 0, 6, null);

    public final HttpClientSettings getAuthHttpClientSettings() {
        return this.authHttpClientSettings;
    }

    public final HttpClientSettings getPicassoHttpClientSettings() {
        return this.picassoHttpClientSettings;
    }

    public final SocketClientSettings getSocketClientSettings() {
        return this.socketClientSettings;
    }

    public final HttpClientSettings getThreadsApiHttpClientSettings() {
        return this.threadsApiHttpClientSettings;
    }

    public String toString() {
        long resendIntervalMillis = this.socketClientSettings.getResendIntervalMillis();
        long resendPingIntervalMillis = this.socketClientSettings.getResendPingIntervalMillis();
        long connectTimeoutMillis = this.socketClientSettings.getConnectTimeoutMillis();
        long readTimeoutMillis = this.socketClientSettings.getReadTimeoutMillis();
        long writeTimeoutMillis = this.socketClientSettings.getWriteTimeoutMillis();
        long sendIntervalMillis = this.socketClientSettings.getSendIntervalMillis();
        long connectTimeoutMillis2 = this.picassoHttpClientSettings.getConnectTimeoutMillis();
        long readTimeoutMillis2 = this.picassoHttpClientSettings.getReadTimeoutMillis();
        long writeTimeoutMillis2 = this.picassoHttpClientSettings.getWriteTimeoutMillis();
        long connectTimeoutMillis3 = this.threadsApiHttpClientSettings.getConnectTimeoutMillis();
        long readTimeoutMillis3 = this.threadsApiHttpClientSettings.getReadTimeoutMillis();
        long writeTimeoutMillis3 = this.threadsApiHttpClientSettings.getWriteTimeoutMillis();
        return "Request config. SocketClientSettings. resendIntervalMillis: " + resendIntervalMillis + " | resendPingIntervalMillis: " + resendPingIntervalMillis + " | connectTimeoutMillis: " + connectTimeoutMillis + " | readTimeoutMillis: " + readTimeoutMillis + " | writeTimeoutMillis: " + writeTimeoutMillis + " | sendIntervalMillis: " + sendIntervalMillis + "\nPicassoHttpClientSettings. connectTimeoutMillis: " + connectTimeoutMillis2 + " | resendPingIntervalMillis: " + readTimeoutMillis2 + " | connectTimeoutMillis: " + writeTimeoutMillis2 + "\nThreadsHttpClientSettings. connectTimeoutMillis: " + connectTimeoutMillis3 + " | resendPingIntervalMillis: " + readTimeoutMillis3 + " | connectTimeoutMillis: " + writeTimeoutMillis3 + ",";
    }

    public static /* synthetic */ void getAuthHttpClientSettings$annotations() {
    }
}
