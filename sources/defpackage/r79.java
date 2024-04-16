package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
/* compiled from: RealBufferedSink.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00103\u001a\u000201¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0014H\u0016J \u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010%\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0001H\u0016J\b\u0010'\u001a\u00020\u0001H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u000bH\u0016R\u0014\u00103\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u00102R\u0014\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0016\u00108\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lr79;", "Leh0;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "Llk0;", "byteString", "d0", "", "string", "a0", "", "beginIndex", "endIndex", "k0", "codePoint", "G", "", "v0", "offset", "p1", "Ljava/nio/ByteBuffer;", "write", "Lpqa;", "a1", "b", "V0", Image.TYPE_SMALL, "P0", "i", "J", "a", "v", "C0", "u1", "U", "F", "Ljava/io/OutputStream;", "S1", "flush", "", "isOpen", "close", "Lxgb;", "timeout", "toString", "Lzma;", "Lzma;", "sink", "Lyg0;", "bufferField", c.a, "Z", "closed", DateTokenConverter.CONVERTER_KEY, "()Lyg0;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lzma;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: r79  reason: default package */
/* loaded from: classes3.dex */
public final class r79 implements eh0 {
    public final zma a;
    public final yg0 b;
    public boolean c;

    public r79(zma zmaVar) {
        z65.h(zmaVar, "sink");
        this.a = zmaVar;
        this.b = new yg0();
    }

    @Override // defpackage.eh0
    public eh0 C0(long j) {
        if (!this.c) {
            this.b.C0(j);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 F() {
        if (!this.c) {
            long P = this.b.P();
            if (P > 0) {
                this.a.r1(this.b, P);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 G(int i) {
        if (!this.c) {
            this.b.G(i);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 J(int i) {
        if (!this.c) {
            this.b.J(i);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 P0(int i) {
        if (!this.c) {
            this.b.P0(i);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public OutputStream S1() {
        return new a();
    }

    @Override // defpackage.eh0
    public eh0 U() {
        if (!this.c) {
            long e = this.b.e();
            if (e > 0) {
                this.a.r1(this.b, e);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 V0(int i) {
        if (!this.c) {
            this.b.V0(i);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public eh0 a(int i) {
        if (!this.c) {
            this.b.r0(i);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 a0(String str) {
        z65.h(str, "string");
        if (!this.c) {
            this.b.a0(str);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public long a1(pqa pqaVar) {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        long j = 0;
        while (true) {
            long read = pqaVar.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE);
            if (read != -1) {
                j += read;
                U();
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            try {
                if (this.b.P() > 0) {
                    zma zmaVar = this.a;
                    yg0 yg0Var = this.b;
                    zmaVar.r1(yg0Var, yg0Var.P());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.eh0
    public yg0 d() {
        return this.b;
    }

    @Override // defpackage.eh0
    public eh0 d0(lk0 lk0Var) {
        z65.h(lk0Var, "byteString");
        if (!this.c) {
            this.b.d0(lk0Var);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0, defpackage.zma, java.io.Flushable
    public void flush() {
        if (!this.c) {
            if (this.b.P() > 0) {
                zma zmaVar = this.a;
                yg0 yg0Var = this.b;
                zmaVar.r1(yg0Var, yg0Var.P());
            }
            this.a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.eh0
    public eh0 k0(String str, int i, int i2) {
        z65.h(str, "string");
        if (!this.c) {
            this.b.k0(str, i, i2);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 p1(byte[] bArr, int i, int i2) {
        z65.h(bArr, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (!this.c) {
            this.b.p1(bArr, i, i2);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (!this.c) {
            this.b.r1(yg0Var, j);
            U();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "buffer(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.eh0
    public eh0 u1(long j) {
        if (!this.c) {
            this.b.u1(j);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.eh0
    public eh0 v0(byte[] bArr) {
        z65.h(bArr, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (!this.c) {
            this.b.v0(bArr);
            return U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        z65.h(byteBuffer, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            U();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* compiled from: RealBufferedSink.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"r79$a", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r79$a */
    /* loaded from: classes3.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r79.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            r79 r79Var = r79.this;
            if (!r79Var.c) {
                r79Var.flush();
            }
        }

        public String toString() {
            return r79.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            r79 r79Var = r79.this;
            if (!r79Var.c) {
                r79Var.b.V0((byte) i);
                r79.this.U();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            z65.h(bArr, "data");
            r79 r79Var = r79.this;
            if (!r79Var.c) {
                r79Var.b.p1(bArr, i, i2);
                r79.this.U();
                return;
            }
            throw new IOException("closed");
        }
    }
}
