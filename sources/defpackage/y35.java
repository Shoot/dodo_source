package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ly35;", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "", "close", "Lxgb;", "timeout", "", "toString", "Ljava/io/InputStream;", "a", "Ljava/io/InputStream;", "input", "b", "Lxgb;", "<init>", "(Ljava/io/InputStream;Lxgb;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: y35  reason: default package */
/* loaded from: classes3.dex */
public class y35 implements pqa {
    private final InputStream a;
    private final xgb b;

    public y35(InputStream inputStream, xgb xgbVar) {
        z65.h(inputStream, "input");
        z65.h(xgbVar, "timeout");
        this.a = inputStream;
        this.b = xgbVar;
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.b.f();
                r3a T = yg0Var.T(1);
                int read = this.a.read(T.a, T.c, (int) Math.min(j, 8192 - T.c));
                if (read == -1) {
                    if (T.b == T.c) {
                        yg0Var.a = T.b();
                        t3a.b(T);
                        return -1L;
                    }
                    return -1L;
                }
                T.c += read;
                long j2 = read;
                yg0Var.N(yg0Var.P() + j2);
                return j2;
            } catch (AssertionError e) {
                if (c77.d(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.b;
    }

    public String toString() {
        return "source(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
