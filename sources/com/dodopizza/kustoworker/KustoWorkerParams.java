package com.dodopizza.kustoworker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/kustoworker/KustoWorkerParams;", "", "maxBatchSize", "", "throttleInterval", "", "debug", "", "(IJZ)V", "getDebug", "()Z", "getMaxBatchSize", "()I", "getThrottleInterval", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoWorkerParams {
    private final boolean debug;
    private final int maxBatchSize;
    private final long throttleInterval;

    public KustoWorkerParams() {
        this(0, 0L, false, 7, null);
    }

    public static /* synthetic */ KustoWorkerParams copy$default(KustoWorkerParams kustoWorkerParams, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = kustoWorkerParams.maxBatchSize;
        }
        if ((i2 & 2) != 0) {
            j = kustoWorkerParams.throttleInterval;
        }
        if ((i2 & 4) != 0) {
            z = kustoWorkerParams.debug;
        }
        return kustoWorkerParams.copy(i, j, z);
    }

    public final int component1() {
        return this.maxBatchSize;
    }

    public final long component2() {
        return this.throttleInterval;
    }

    public final boolean component3() {
        return this.debug;
    }

    public final KustoWorkerParams copy(int i, long j, boolean z) {
        return new KustoWorkerParams(i, j, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KustoWorkerParams) {
                KustoWorkerParams kustoWorkerParams = (KustoWorkerParams) obj;
                if (this.maxBatchSize != kustoWorkerParams.maxBatchSize || this.throttleInterval != kustoWorkerParams.throttleInterval || this.debug != kustoWorkerParams.debug) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final int getMaxBatchSize() {
        return this.maxBatchSize;
    }

    public final long getThrottleInterval() {
        return this.throttleInterval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = ((this.maxBatchSize * 31) + ax1.a(this.throttleInterval)) * 31;
        boolean z = this.debug;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public String toString() {
        return "KustoWorkerParams(maxBatchSize=" + this.maxBatchSize + ", throttleInterval=" + this.throttleInterval + ", debug=" + this.debug + ")";
    }

    public KustoWorkerParams(int i, long j, boolean z) {
        this.maxBatchSize = i;
        this.throttleInterval = j;
        this.debug = z;
    }

    public /* synthetic */ KustoWorkerParams(int i, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? 1000L : j, (i2 & 4) != 0 ? false : z);
    }
}
