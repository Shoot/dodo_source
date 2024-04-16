package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
/* compiled from: GzipSource.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006("}, d2 = {"Lzi4;", "Lpqa;", "", "b", c.a, "Lyg0;", "buffer", "", "offset", "byteCount", e.a, "", Action.NAME_ATTRIBUTE, "", "expected", "actual", "a", "sink", "read", "Lxgb;", "timeout", "close", "", "B", "section", "Ls79;", "Ls79;", KustoStorage.KustoTable.COLUMN_SOURCE, "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "La15;", DateTokenConverter.CONVERTER_KEY, "La15;", "inflaterSource", "Ljava/util/zip/CRC32;", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lpqa;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: zi4  reason: default package */
/* loaded from: classes3.dex */
public final class zi4 implements pqa {
    private byte a;
    private final s79 b;
    private final Inflater c;
    private final a15 d;
    private final CRC32 e;

    public zi4(pqa pqaVar) {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        s79 s79Var = new s79(pqaVar);
        this.b = s79Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new a15((fh0) s79Var, inflater);
        this.e = new CRC32();
    }

    private final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        z65.g(format, "format(...)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        boolean z;
        this.b.B0(10L);
        byte n = this.b.b.n(3L);
        if (((n >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e(this.b.b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.b.readShort());
        this.b.skip(8L);
        if (((n >> 2) & 1) == 1) {
            this.b.B0(2L);
            if (z) {
                e(this.b.b, 0L, 2L);
            }
            long w0 = this.b.b.w0() & 65535;
            this.b.B0(w0);
            if (z) {
                e(this.b.b, 0L, w0);
            }
            this.b.skip(w0);
        }
        if (((n >> 3) & 1) == 1) {
            long a = this.b.a((byte) 0);
            if (a != -1) {
                if (z) {
                    e(this.b.b, 0L, a + 1);
                }
                this.b.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((n >> 4) & 1) == 1) {
            long a2 = this.b.a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    e(this.b.b, 0L, a2 + 1);
                }
                this.b.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.b.w0(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private final void c() throws IOException {
        a("CRC", this.b.C1(), (int) this.e.getValue());
        a("ISIZE", this.b.C1(), (int) this.c.getBytesWritten());
    }

    private final void e(yg0 yg0Var, long j, long j2) {
        int i;
        r3a r3aVar = yg0Var.a;
        z65.e(r3aVar);
        while (true) {
            int i2 = r3aVar.c;
            int i3 = r3aVar.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            r3aVar = r3aVar.f;
            z65.e(r3aVar);
        }
        while (j2 > 0) {
            int min = (int) Math.min(r3aVar.c - i, j2);
            this.e.update(r3aVar.a, (int) (r3aVar.b + j), min);
            j2 -= min;
            r3aVar = r3aVar.f;
            z65.e(r3aVar);
            j = 0;
        }
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) throws IOException {
        z65.h(yg0Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.a == 0) {
                b();
                this.a = (byte) 1;
            }
            if (this.a == 1) {
                long P = yg0Var.P();
                long read = this.d.read(yg0Var, j);
                if (read != -1) {
                    e(yg0Var, P, read);
                    return read;
                }
                this.a = (byte) 2;
            }
            if (this.a == 2) {
                c();
                this.a = (byte) 3;
                if (!this.b.U0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.b.timeout();
    }
}
