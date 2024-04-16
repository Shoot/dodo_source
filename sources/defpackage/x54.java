package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ForwardingSink.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lx54;", "Lzma;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "Lxgb;", "timeout", "close", "", "toString", "a", "Lzma;", "delegate", "()Lzma;", "<init>", "(Lzma;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: x54  reason: default package */
/* loaded from: classes3.dex */
public abstract class x54 implements zma {
    private final zma a;

    public x54(zma zmaVar) {
        z65.h(zmaVar, "delegate");
        this.a = zmaVar;
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.zma, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a.r1(yg0Var, j);
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
