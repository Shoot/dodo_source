package im.threads.business.rest.config;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RequestConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lim/threads/business/rest/config/SocketClientSettings;", "", "resendIntervalMillis", "", "resendPingIntervalMillis", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "sendIntervalMillis", "(JJJJJJ)V", "getConnectTimeoutMillis", "()J", "setConnectTimeoutMillis", "(J)V", "getReadTimeoutMillis", "setReadTimeoutMillis", "getResendIntervalMillis", "setResendIntervalMillis", "getResendPingIntervalMillis", "setResendPingIntervalMillis", "getSendIntervalMillis", "setSendIntervalMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocketClientSettings {
    private long connectTimeoutMillis;
    private long readTimeoutMillis;
    private long resendIntervalMillis;
    private long resendPingIntervalMillis;
    private long sendIntervalMillis;
    private long writeTimeoutMillis;

    public SocketClientSettings() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 63, null);
    }

    public static /* synthetic */ SocketClientSettings copy$default(SocketClientSettings socketClientSettings, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i & 1) != 0) {
            j7 = socketClientSettings.resendIntervalMillis;
        } else {
            j7 = j;
        }
        if ((i & 2) != 0) {
            j8 = socketClientSettings.resendPingIntervalMillis;
        } else {
            j8 = j2;
        }
        if ((i & 4) != 0) {
            j9 = socketClientSettings.connectTimeoutMillis;
        } else {
            j9 = j3;
        }
        if ((i & 8) != 0) {
            j10 = socketClientSettings.readTimeoutMillis;
        } else {
            j10 = j4;
        }
        if ((i & 16) != 0) {
            j11 = socketClientSettings.writeTimeoutMillis;
        } else {
            j11 = j5;
        }
        if ((i & 32) != 0) {
            j12 = socketClientSettings.sendIntervalMillis;
        } else {
            j12 = j6;
        }
        return socketClientSettings.copy(j7, j8, j9, j10, j11, j12);
    }

    public final long component1() {
        return this.resendIntervalMillis;
    }

    public final long component2() {
        return this.resendPingIntervalMillis;
    }

    public final long component3() {
        return this.connectTimeoutMillis;
    }

    public final long component4() {
        return this.readTimeoutMillis;
    }

    public final long component5() {
        return this.writeTimeoutMillis;
    }

    public final long component6() {
        return this.sendIntervalMillis;
    }

    public final SocketClientSettings copy(long j, long j2, long j3, long j4, long j5, long j6) {
        return new SocketClientSettings(j, j2, j3, j4, j5, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocketClientSettings)) {
            return false;
        }
        SocketClientSettings socketClientSettings = (SocketClientSettings) obj;
        if (this.resendIntervalMillis == socketClientSettings.resendIntervalMillis && this.resendPingIntervalMillis == socketClientSettings.resendPingIntervalMillis && this.connectTimeoutMillis == socketClientSettings.connectTimeoutMillis && this.readTimeoutMillis == socketClientSettings.readTimeoutMillis && this.writeTimeoutMillis == socketClientSettings.writeTimeoutMillis && this.sendIntervalMillis == socketClientSettings.sendIntervalMillis) {
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

    public final long getResendIntervalMillis() {
        return this.resendIntervalMillis;
    }

    public final long getResendPingIntervalMillis() {
        return this.resendPingIntervalMillis;
    }

    public final long getSendIntervalMillis() {
        return this.sendIntervalMillis;
    }

    public final long getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public int hashCode() {
        return (((((((((ax1.a(this.resendIntervalMillis) * 31) + ax1.a(this.resendPingIntervalMillis)) * 31) + ax1.a(this.connectTimeoutMillis)) * 31) + ax1.a(this.readTimeoutMillis)) * 31) + ax1.a(this.writeTimeoutMillis)) * 31) + ax1.a(this.sendIntervalMillis);
    }

    public final void setConnectTimeoutMillis(long j) {
        this.connectTimeoutMillis = j;
    }

    public final void setReadTimeoutMillis(long j) {
        this.readTimeoutMillis = j;
    }

    public final void setResendIntervalMillis(long j) {
        this.resendIntervalMillis = j;
    }

    public final void setResendPingIntervalMillis(long j) {
        this.resendPingIntervalMillis = j;
    }

    public final void setSendIntervalMillis(long j) {
        this.sendIntervalMillis = j;
    }

    public final void setWriteTimeoutMillis(long j) {
        this.writeTimeoutMillis = j;
    }

    public String toString() {
        long j = this.resendIntervalMillis;
        long j2 = this.resendPingIntervalMillis;
        long j3 = this.connectTimeoutMillis;
        long j4 = this.readTimeoutMillis;
        long j5 = this.writeTimeoutMillis;
        long j6 = this.sendIntervalMillis;
        return "SocketClientSettings(resendIntervalMillis=" + j + ", resendPingIntervalMillis=" + j2 + ", connectTimeoutMillis=" + j3 + ", readTimeoutMillis=" + j4 + ", writeTimeoutMillis=" + j5 + ", sendIntervalMillis=" + j6 + ")";
    }

    public SocketClientSettings(long j, long j2, long j3, long j4, long j5, long j6) {
        this.resendIntervalMillis = j;
        this.resendPingIntervalMillis = j2;
        this.connectTimeoutMillis = j3;
        this.readTimeoutMillis = j4;
        this.writeTimeoutMillis = j5;
        this.sendIntervalMillis = j6;
    }

    public /* synthetic */ SocketClientSettings(long j, long j2, long j3, long j4, long j5, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? 3000L : j2, (i & 4) != 0 ? 10000L : j3, (i & 8) != 0 ? 10000L : j4, (i & 16) == 0 ? j5 : AbstractComponentTracker.LINGERING_TIMEOUT, (i & 32) != 0 ? 40000L : j6);
    }
}
