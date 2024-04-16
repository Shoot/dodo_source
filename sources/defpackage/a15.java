package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
/* compiled from: InflaterSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"La15;", "Lpqa;", "", c.a, "Lyg0;", "sink", "", "byteCount", "read", "a", "", "b", "Lxgb;", "timeout", "close", "Lfh0;", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "", "I", "bufferBytesHeldByInflater", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "<init>", "(Lfh0;Ljava/util/zip/Inflater;)V", "(Lpqa;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: a15  reason: default package */
/* loaded from: classes3.dex */
public final class a15 implements pqa {
    private final fh0 a;
    private final Inflater b;
    private int c;
    private boolean d;

    public a15(fh0 fh0Var, Inflater inflater) {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(inflater, "inflater");
        this.a = fh0Var;
        this.b = inflater;
    }

    private final void c() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    public final long a(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.d) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    r3a T = yg0Var.T(1);
                    int min = (int) Math.min(j, 8192 - T.c);
                    b();
                    int inflate = this.b.inflate(T.a, T.c, min);
                    c();
                    if (inflate > 0) {
                        T.c += inflate;
                        long j2 = inflate;
                        yg0Var.N(yg0Var.P() + j2);
                        return j2;
                    }
                    if (T.b == T.c) {
                        yg0Var.a = T.b();
                        t3a.b(T);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public final boolean b() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        if (this.a.U0()) {
            return true;
        }
        r3a r3aVar = this.a.d().a;
        z65.e(r3aVar);
        int i = r3aVar.c;
        int i2 = r3aVar.b;
        int i3 = i - i2;
        this.c = i3;
        this.b.setInput(r3aVar.a, i2, i3);
        return false;
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, "sink");
        do {
            long a = a(yg0Var, j);
            if (a > 0) {
                return a;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.U0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a15(pqa pqaVar, Inflater inflater) {
        this(c77.c(pqaVar), inflater);
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(inflater, "inflater");
    }
}
