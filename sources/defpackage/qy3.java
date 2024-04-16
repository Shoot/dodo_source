package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: FixedLengthSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0016"}, d2 = {"Lqy3;", "Ly54;", "Lyg0;", "", "newSize", "", "a", "sink", "byteCount", "read", "J", "size", "", "b", "Z", "truncate", c.a, "bytesReceived", "Lpqa;", "delegate", "<init>", "(Lpqa;JZ)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: qy3  reason: default package */
/* loaded from: classes3.dex */
public final class qy3 extends y54 {
    private final long a;
    private final boolean b;
    private long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy3(pqa pqaVar, long j, boolean z) {
        super(pqaVar);
        z65.h(pqaVar, "delegate");
        this.a = j;
        this.b = z;
    }

    private final void a(yg0 yg0Var, long j) {
        yg0 yg0Var2 = new yg0();
        yg0Var2.a1(yg0Var);
        yg0Var.r1(yg0Var2, j);
        yg0Var2.b();
    }

    @Override // defpackage.y54, defpackage.pqa
    public long read(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        long j2 = this.c;
        long j3 = this.a;
        if (j2 > j3) {
            j = 0;
        } else if (this.b) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(yg0Var, j);
        int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
        if (i != 0) {
            this.c += read;
        }
        long j5 = this.c;
        long j6 = this.a;
        if ((j5 < j6 && i == 0) || j5 > j6) {
            if (read > 0 && j5 > j6) {
                a(yg0Var, yg0Var.P() - (this.c - this.a));
            }
            throw new IOException("expected " + this.a + " bytes but got " + this.c);
        }
        return read;
    }
}
