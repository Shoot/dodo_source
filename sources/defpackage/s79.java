package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\rH\u0016J \u00100\u001a\u00020\u00052\u0006\u00100\u001a\u00020\r2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000fH\u0016J\u0018\u00109\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0005H\u0016J\u0018\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000fH\u0016J(\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\u0001H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020CH\u0016J\b\u0010E\u001a\u00020\u001eH\u0016R\u0014\u0010H\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010GR\u0014\u0010J\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010IR\u0016\u0010L\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010KR\u001b\u0010Q\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\bM\u0010N¨\u0006T"}, d2 = {"Ls79;", "Lfh0;", "Lyg0;", "D", "sink", "", "byteCount", "read", "", "U0", "", "B0", "w", "", "readByte", "Llk0;", "v1", "J0", "Lzb7;", "options", "", "W0", "", "T0", "u0", "readFully", "Ljava/nio/ByteBuffer;", "c0", "Lzma;", "k1", "", "G0", "Ljava/nio/charset/Charset;", "charset", "n1", "s0", "limit", "V", "", "readShort", "w0", "readInt", "C1", "readLong", "y0", "b1", "T1", "skip", "b", "a", "fromIndex", "toIndex", "bytes", "h0", c.a, "targetBytes", "O1", e.a, "offset", "L1", "bytesOffset", "i", "peek", "Ljava/io/InputStream;", "z", "isOpen", "close", "Lxgb;", "timeout", "toString", "Lpqa;", "Lpqa;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lyg0;", "bufferField", "Z", "closed", DateTokenConverter.CONVERTER_KEY, "()Lyg0;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lpqa;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: s79  reason: default package */
/* loaded from: classes3.dex */
public final class s79 implements fh0 {
    public final pqa a;
    public final yg0 b;
    public boolean c;

    public s79(pqa pqaVar) {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = pqaVar;
        this.b = new yg0();
    }

    @Override // defpackage.fh0
    public void B0(long j) {
        if (w(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.fh0
    public int C1() {
        B0(4L);
        return this.b.C1();
    }

    @Override // defpackage.fh0
    public yg0 D() {
        return this.b;
    }

    @Override // defpackage.fh0
    public String G0(long j) {
        B0(j);
        return this.b.G0(j);
    }

    @Override // defpackage.fh0
    public lk0 J0(long j) {
        B0(j);
        return this.b.J0(j);
    }

    @Override // defpackage.fh0
    public boolean L1(long j, lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        return i(j, lk0Var, 0, lk0Var.n0());
    }

    @Override // defpackage.fh0
    public long O1(lk0 lk0Var) {
        z65.h(lk0Var, "targetBytes");
        return e(lk0Var, 0L);
    }

    @Override // defpackage.fh0
    public byte[] T0() {
        this.b.a1(this.a);
        return this.b.T0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r3 = defpackage.nw0.a(16);
        r2 = java.lang.Integer.toString(r2, r3);
        defpackage.z65.g(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // defpackage.fh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long T1() {
        /*
            r5 = this;
            r0 = 1
            r5.B0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.w(r2)
            if (r2 == 0) goto L5a
            yg0 r2 = r5.b
            long r3 = (long) r0
            byte r2 = r2.n(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5a
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = defpackage.mw0.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(...)"
            defpackage.z65.g(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5a:
            yg0 r0 = r5.b
            long r0 = r0.T1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s79.T1():long");
    }

    @Override // defpackage.fh0
    public boolean U0() {
        if (!this.c) {
            if (this.b.U0() && this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.fh0
    public String V(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long b = b((byte) 10, 0L, j2);
            if (b != -1) {
                return d.d(this.b, b);
            }
            if (j2 < Long.MAX_VALUE && w(j2) && this.b.n(j2 - 1) == 13 && w(1 + j2) && this.b.n(j2) == 10) {
                return d.d(this.b, j2);
            }
            yg0 yg0Var = new yg0();
            yg0 yg0Var2 = this.b;
            yg0Var2.j(yg0Var, 0L, Math.min(32, yg0Var2.P()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.b.P(), j) + " content=" + yg0Var.v1().G() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // defpackage.fh0
    public int W0(zb7 zb7Var) {
        z65.h(zb7Var, "options");
        if (!this.c) {
            while (true) {
                int e = d.e(this.b, zb7Var, true);
                if (e != -2) {
                    if (e != -1) {
                        this.b.skip(zb7Var.x()[e].n0());
                        return e;
                    }
                } else if (this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    break;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long a(byte b) {
        return b(b, 0L, Long.MAX_VALUE);
    }

    public long b(byte b, long j, long j2) {
        if (!this.c) {
            if (0 <= j && j <= j2) {
                while (j < j2) {
                    long o = this.b.o(b, j, j2);
                    if (o != -1) {
                        return o;
                    }
                    long P = this.b.P();
                    if (P >= j2 || this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, P);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = defpackage.nw0.a(16);
        r2 = java.lang.Integer.toString(r8, r2);
        defpackage.z65.g(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // defpackage.fh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b1() {
        /*
            r10 = this;
            r0 = 1
            r10.B0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.w(r6)
            if (r8 == 0) goto L52
            yg0 r8 = r10.b
            byte r8 = r8.n(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r9 == 0) goto L2c
            goto L52
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = defpackage.mw0.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(...)"
            defpackage.z65.g(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L52:
            yg0 r0 = r10.b
            long r0 = r0.b1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s79.b1():long");
    }

    public long c(lk0 lk0Var, long j) {
        z65.h(lk0Var, "bytes");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long q = this.b.q(lk0Var, j);
            if (q == -1) {
                long P = this.b.P();
                if (this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j = Math.max(j, (P - lk0Var.n0()) + 1);
            } else {
                return q;
            }
        }
    }

    @Override // defpackage.fh0
    public void c0(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        try {
            B0(j);
            this.b.c0(yg0Var, j);
        } catch (EOFException e) {
            yg0Var.a1(this.b);
            throw e;
        }
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.b();
        }
    }

    @Override // defpackage.fh0
    public yg0 d() {
        return this.b;
    }

    public long e(lk0 lk0Var, long j) {
        z65.h(lk0Var, "targetBytes");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long r = this.b.r(lk0Var, j);
            if (r == -1) {
                long P = this.b.P();
                if (this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j = Math.max(j, P);
            } else {
                return r;
            }
        }
    }

    @Override // defpackage.fh0
    public long h0(lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        return c(lk0Var, 0L);
    }

    public boolean i(long j, lk0 lk0Var, int i, int i2) {
        z65.h(lk0Var, "bytes");
        if (!this.c) {
            if (j >= 0 && i >= 0 && i2 >= 0 && lk0Var.n0() - i >= i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    long j2 = i3 + j;
                    if (w(1 + j2) && this.b.n(j2) == lk0Var.s(i + i3)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.fh0
    public long k1(zma zmaVar) {
        z65.h(zmaVar, "sink");
        long j = 0;
        while (this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
            long e = this.b.e();
            if (e > 0) {
                j += e;
                zmaVar.r1(this.b, e);
            }
        }
        if (this.b.P() > 0) {
            long P = j + this.b.P();
            yg0 yg0Var = this.b;
            zmaVar.r1(yg0Var, yg0Var.P());
            return P;
        }
        return j;
    }

    @Override // defpackage.fh0
    public String n1(Charset charset) {
        z65.h(charset, "charset");
        this.b.a1(this.a);
        return this.b.n1(charset);
    }

    @Override // defpackage.fh0
    public fh0 peek() {
        return c77.c(new jx7(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        z65.h(byteBuffer, "sink");
        if (this.b.P() == 0 && this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.fh0
    public byte readByte() {
        B0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.fh0
    public void readFully(byte[] bArr) {
        z65.h(bArr, "sink");
        try {
            B0(bArr.length);
            this.b.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.b.P() > 0) {
                yg0 yg0Var = this.b;
                int read = yg0Var.read(bArr, i, (int) yg0Var.P());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // defpackage.fh0
    public int readInt() {
        B0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.fh0
    public long readLong() {
        B0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.fh0
    public short readShort() {
        B0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.fh0
    public String s0() {
        return V(Long.MAX_VALUE);
    }

    @Override // defpackage.fh0
    public void skip(long j) {
        if (!this.c) {
            while (j > 0) {
                if (this.b.P() == 0 && this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.b.P());
                this.b.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "buffer(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.fh0
    public byte[] u0(long j) {
        B0(j);
        return this.b.u0(j);
    }

    @Override // defpackage.fh0
    public lk0 v1() {
        this.b.a1(this.a);
        return this.b.v1();
    }

    @Override // defpackage.fh0
    public boolean w(long j) {
        if (j >= 0) {
            if (!this.c) {
                while (this.b.P() < j) {
                    if (this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // defpackage.fh0
    public short w0() {
        B0(2L);
        return this.b.w0();
    }

    @Override // defpackage.fh0
    public long y0() {
        B0(8L);
        return this.b.y0();
    }

    @Override // defpackage.fh0
    public InputStream z() {
        return new a();
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.c) {
            if (this.b.P() == 0 && this.a.read(this.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            return this.b.read(yg0Var, Math.min(j, this.b.P()));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: RealBufferedSource.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"s79$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s79$a */
    /* loaded from: classes3.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            s79 s79Var = s79.this;
            if (!s79Var.c) {
                return (int) Math.min(s79Var.b.P(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            s79.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            s79 s79Var = s79.this;
            if (!s79Var.c) {
                if (s79Var.b.P() == 0) {
                    s79 s79Var2 = s79.this;
                    if (s79Var2.a.read(s79Var2.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return s79.this.b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return s79.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            z65.h(bArr, "data");
            if (!s79.this.c) {
                i.b(bArr.length, i, i2);
                if (s79.this.b.P() == 0) {
                    s79 s79Var = s79.this;
                    if (s79Var.a.read(s79Var.b, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return s79.this.b.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
