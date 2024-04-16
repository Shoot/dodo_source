package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import java.io.OutputStream;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lom7;", "Lzma;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "Lxgb;", "timeout", "", "toString", "Ljava/io/OutputStream;", "a", "Ljava/io/OutputStream;", "out", "b", "Lxgb;", "<init>", "(Ljava/io/OutputStream;Lxgb;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: om7  reason: default package */
/* loaded from: classes3.dex */
public final class om7 implements zma {
    private final OutputStream a;
    private final xgb b;

    public om7(OutputStream outputStream, xgb xgbVar) {
        z65.h(outputStream, "out");
        z65.h(xgbVar, "timeout");
        this.a = outputStream;
        this.b = xgbVar;
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.zma, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        i.b(yg0Var.P(), 0L, j);
        while (j > 0) {
            this.b.f();
            r3a r3aVar = yg0Var.a;
            z65.e(r3aVar);
            int min = (int) Math.min(j, r3aVar.c - r3aVar.b);
            this.a.write(r3aVar.a, r3aVar.b, min);
            r3aVar.b += min;
            long j2 = min;
            j -= j2;
            yg0Var.N(yg0Var.P() - j2);
            if (r3aVar.b == r3aVar.c) {
                yg0Var.a = r3aVar.b();
                t3a.b(r3aVar);
            }
        }
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return this.b;
    }

    public String toString() {
        return "sink(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
