package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
/* compiled from: DeflaterSink.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lut2;", "Lzma;", "", "syncFlush", "", "a", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "r1", "flush", "b", "()V", "close", "Lxgb;", "timeout", "", "toString", "Leh0;", "Leh0;", "sink", "Ljava/util/zip/Deflater;", "Ljava/util/zip/Deflater;", "deflater", c.a, "Z", "closed", "<init>", "(Leh0;Ljava/util/zip/Deflater;)V", "(Lzma;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: ut2  reason: default package */
/* loaded from: classes3.dex */
public final class ut2 implements zma {
    private final eh0 a;
    private final Deflater b;
    private boolean c;

    public ut2(eh0 eh0Var, Deflater deflater) {
        z65.h(eh0Var, "sink");
        z65.h(deflater, "deflater");
        this.a = eh0Var;
        this.b = deflater;
    }

    private final void a(boolean z) {
        r3a T;
        int deflate;
        yg0 d = this.a.d();
        while (true) {
            T = d.T(1);
            if (z) {
                try {
                    Deflater deflater = this.b;
                    byte[] bArr = T.a;
                    int i = T.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = T.a;
                int i2 = T.c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                T.c += deflate;
                d.N(d.P() + deflate);
                this.a.U();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (T.b == T.c) {
            d.a = T.b();
            t3a.b(T);
        }
    }

    public final void b() {
        this.b.finish();
        a(false);
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // defpackage.zma, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.a.flush();
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        i.b(yg0Var.P(), 0L, j);
        while (j > 0) {
            r3a r3aVar = yg0Var.a;
            z65.e(r3aVar);
            int min = (int) Math.min(j, r3aVar.c - r3aVar.b);
            this.b.setInput(r3aVar.a, r3aVar.b, min);
            a(false);
            long j2 = min;
            yg0Var.N(yg0Var.P() - j2);
            int i = r3aVar.b + min;
            r3aVar.b = i;
            if (i == r3aVar.c) {
                yg0Var.a = r3aVar.b();
                t3a.b(r3aVar);
            }
            j -= j2;
        }
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ut2(zma zmaVar, Deflater deflater) {
        this(c77.b(zmaVar), deflater);
        z65.h(zmaVar, "sink");
        z65.h(deflater, "deflater");
    }
}
