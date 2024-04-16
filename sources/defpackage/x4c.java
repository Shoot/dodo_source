package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: WindowCounter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012¨\u0006\u0018"}, d2 = {"Lx4c;", "", "", "total", "acknowledged", "", "b", "", "toString", "", "a", "I", "getStreamId", "()I", "streamId", "<set-?>", "J", "getTotal", "()J", c.a, "getAcknowledged", "unacknowledged", "<init>", "(I)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x4c  reason: default package */
/* loaded from: classes3.dex */
public final class x4c {
    private final int a;
    private long b;
    private long c;

    public x4c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c(x4c x4cVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        x4cVar.b(j, j2);
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final synchronized void b(long j, long j2) {
        try {
            if (j >= 0) {
                if (j2 >= 0) {
                    long j3 = this.b + j;
                    this.b = j3;
                    long j4 = this.c + j2;
                    this.c = j4;
                    if (j4 > j3) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
