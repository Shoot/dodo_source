package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PeekSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Ljx7;", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "Lxgb;", "timeout", "", "close", "Lfh0;", "a", "Lfh0;", "upstream", "b", "Lyg0;", "buffer", "Lr3a;", c.a, "Lr3a;", "expectedSegment", "", DateTokenConverter.CONVERTER_KEY, "I", "expectedPos", "", e.a, "Z", "closed", "f", "J", "pos", "<init>", "(Lfh0;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: jx7  reason: default package */
/* loaded from: classes3.dex */
public final class jx7 implements pqa {
    private final fh0 a;
    private final yg0 b;
    private r3a c;
    private int d;
    private boolean e;
    private long f;

    public jx7(fh0 fh0Var) {
        int i;
        z65.h(fh0Var, "upstream");
        this.a = fh0Var;
        yg0 d = fh0Var.d();
        this.b = d;
        r3a r3aVar = d.a;
        this.c = r3aVar;
        if (r3aVar != null) {
            i = r3aVar.b;
        } else {
            i = -1;
        }
        this.d = i;
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r3 == r4.b) goto L14;
     */
    @Override // defpackage.pqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(defpackage.yg0 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            defpackage.z65.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L7f
            boolean r3 = r8.e
            r3 = r3 ^ 1
            if (r3 == 0) goto L73
            r3a r3 = r8.c
            if (r3 == 0) goto L31
            yg0 r4 = r8.b
            r3a r4 = r4.a
            if (r3 != r4) goto L25
            int r3 = r8.d
            defpackage.z65.e(r4)
            int r4 = r4.b
            if (r3 != r4) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            fh0 r0 = r8.a
            long r1 = r8.f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.w(r1)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            r3a r0 = r8.c
            if (r0 != 0) goto L57
            yg0 r0 = r8.b
            r3a r0 = r0.a
            if (r0 == 0) goto L57
            r8.c = r0
            defpackage.z65.e(r0)
            int r0 = r0.b
            r8.d = r0
        L57:
            yg0 r0 = r8.b
            long r0 = r0.P()
            long r2 = r8.f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            yg0 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r6 = r10
            r2.j(r3, r4, r6)
            long r0 = r8.f
            long r0 = r0 + r10
            r8.f = r0
            return r10
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx7.read(yg0, long):long");
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.a.timeout();
    }
}
