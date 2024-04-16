package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
/* compiled from: GzipSink.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lyi4;", "Lzma;", "", "b", "Lyg0;", "buffer", "", "byteCount", "a", KustoStorage.KustoTable.COLUMN_SOURCE, "r1", "flush", "Lxgb;", "timeout", "close", "Lr79;", "Lr79;", "sink", "Ljava/util/zip/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lut2;", c.a, "Lut2;", "deflaterSink", "", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "Ljava/util/zip/CRC32;", e.a, "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lzma;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: yi4  reason: default package */
/* loaded from: classes3.dex */
public final class yi4 implements zma {
    private final r79 a;
    private final Deflater b;
    private final ut2 c;
    private boolean d;
    private final CRC32 e;

    public yi4(zma zmaVar) {
        z65.h(zmaVar, "sink");
        r79 r79Var = new r79(zmaVar);
        this.a = r79Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new ut2((eh0) r79Var, deflater);
        this.e = new CRC32();
        yg0 yg0Var = r79Var.b;
        yg0Var.P0(8075);
        yg0Var.V0(8);
        yg0Var.V0(0);
        yg0Var.J(0);
        yg0Var.V0(0);
        yg0Var.V0(0);
    }

    private final void a(yg0 yg0Var, long j) {
        r3a r3aVar = yg0Var.a;
        z65.e(r3aVar);
        while (j > 0) {
            int min = (int) Math.min(j, r3aVar.c - r3aVar.b);
            this.e.update(r3aVar.a, r3aVar.b, min);
            j -= min;
            r3aVar = r3aVar.f;
            z65.e(r3aVar);
        }
    }

    private final void b() {
        this.a.a((int) this.e.getValue());
        this.a.a((int) this.b.getBytesRead());
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        try {
            this.c.b();
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
        this.d = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // defpackage.zma, java.io.Flushable
    public void flush() throws IOException {
        this.c.flush();
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            a(yg0Var, j);
            this.c.r1(yg0Var, j);
            return;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return this.a.timeout();
    }
}
