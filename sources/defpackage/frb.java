package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: -ResponseCommon.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lfrb;", "Lkk9;", "Lpqa;", "Lqc6;", "contentType", "", "contentLength", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lyg0;", "sink", "byteCount", "read", "Lxgb;", "timeout", "", "close", "a", "Lqc6;", "mediaType", "b", "J", "<init>", "(Lqc6;J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: frb  reason: default package */
/* loaded from: classes3.dex */
public final class frb extends kk9 implements pqa {
    private final qc6 a;
    private final long b;

    public frb(qc6 qc6Var, long j) {
        this.a = qc6Var;
        this.b = j;
    }

    @Override // defpackage.kk9
    public long contentLength() {
        return this.b;
    }

    @Override // defpackage.kk9
    public qc6 contentType() {
        return this.a;
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.kk9
    public fh0 source() {
        return c77.c(this);
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return xgb.e;
    }

    @Override // defpackage.kk9, java.io.Closeable, java.lang.AutoCloseable, defpackage.pqa
    public void close() {
    }
}
