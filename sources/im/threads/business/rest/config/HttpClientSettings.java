package im.threads.business.rest.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RequestConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lim/threads/business/rest/config/HttpClientSettings;", "", "connectTimeoutMillis", "", "readTimeoutMillis", "writeTimeoutMillis", "(JJJ)V", "getConnectTimeoutMillis", "()J", "setConnectTimeoutMillis", "(J)V", "getReadTimeoutMillis", "setReadTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientSettings {
    private long connectTimeoutMillis;
    private long readTimeoutMillis;
    private long writeTimeoutMillis;

    public HttpClientSettings() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ HttpClientSettings copy$default(HttpClientSettings httpClientSettings, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = httpClientSettings.connectTimeoutMillis;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = httpClientSettings.readTimeoutMillis;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = httpClientSettings.writeTimeoutMillis;
        }
        return httpClientSettings.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.connectTimeoutMillis;
    }

    public final long component2() {
        return this.readTimeoutMillis;
    }

    public final long component3() {
        return this.writeTimeoutMillis;
    }

    public final HttpClientSettings copy(long j, long j2, long j3) {
        return new HttpClientSettings(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpClientSettings)) {
            return false;
        }
        HttpClientSettings httpClientSettings = (HttpClientSettings) obj;
        if (this.connectTimeoutMillis == httpClientSettings.connectTimeoutMillis && this.readTimeoutMillis == httpClientSettings.readTimeoutMillis && this.writeTimeoutMillis == httpClientSettings.writeTimeoutMillis) {
            return true;
        }
        return false;
    }

    public final long getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final long getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final long getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public int hashCode() {
        return (((ax1.a(this.connectTimeoutMillis) * 31) + ax1.a(this.readTimeoutMillis)) * 31) + ax1.a(this.writeTimeoutMillis);
    }

    public final void setConnectTimeoutMillis(long j) {
        this.connectTimeoutMillis = j;
    }

    public final void setReadTimeoutMillis(long j) {
        this.readTimeoutMillis = j;
    }

    public final void setWriteTimeoutMillis(long j) {
        this.writeTimeoutMillis = j;
    }

    public String toString() {
        long j = this.connectTimeoutMillis;
        long j2 = this.readTimeoutMillis;
        long j3 = this.writeTimeoutMillis;
        return "HttpClientSettings(connectTimeoutMillis=" + j + ", readTimeoutMillis=" + j2 + ", writeTimeoutMillis=" + j3 + ")";
    }

    public HttpClientSettings(long j, long j2, long j3) {
        this.connectTimeoutMillis = j;
        this.readTimeoutMillis = j2;
        this.writeTimeoutMillis = j3;
    }

    public /* synthetic */ HttpClientSettings(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? 10000L : j2, (i & 4) != 0 ? 10000L : j3);
    }
}
