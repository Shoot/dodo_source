package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0080\u0001B\t¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020'H\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020/H\u0016J\b\u00102\u001a\u000201H\u0016J\u0010\u00103\u001a\u0002012\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00106\u001a\u0002012\u0006\u00105\u001a\u000204H\u0016J\u0018\u00107\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016J\b\u00108\u001a\u000201H\u0016J\u0010\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\b\u0010=\u001a\u00020<H\u0016J\u0010\u0010>\u001a\u00020<2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020<H\u0016J \u0010@\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020AH\u0016J\u0006\u0010B\u001a\u00020\u000eJ\u0010\u0010C\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020'H\u0016J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u000201H\u0016J \u0010J\u001a\u00020\u00002\u0006\u0010F\u001a\u0002012\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001fH\u0016J\u0010\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u001fH\u0016J\u0018\u0010M\u001a\u00020\u00002\u0006\u0010F\u001a\u0002012\u0006\u00105\u001a\u000204H\u0016J(\u0010N\u001a\u00020\u00002\u0006\u0010F\u001a\u0002012\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001f2\u0006\u00105\u001a\u000204H\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020<H\u0016J \u0010Q\u001a\u00020\u00002\u0006\u0010O\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020AH\u0016J\u0010\u0010T\u001a\u00020\f2\u0006\u0010O\u001a\u00020SH\u0016J\u0018\u0010U\u001a\u00020\u00002\u0006\u0010O\u001a\u00020S2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u001fH\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001fH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001fH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0010\u0010_\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\fH\u0016J\u0017\u0010b\u001a\u00020a2\u0006\u0010`\u001a\u00020\u001fH\u0000¢\u0006\u0004\bb\u0010cJ\u0018\u0010d\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010@\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010g\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u00182\u0006\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020\fH\u0016J\u0010\u0010i\u001a\u00020\f2\u0006\u0010h\u001a\u00020'H\u0016J\u0018\u0010j\u001a\u00020\f2\u0006\u0010h\u001a\u00020'2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010l\u001a\u00020\f2\u0006\u0010k\u001a\u00020'H\u0016J\u0018\u0010m\u001a\u00020\f2\u0006\u0010k\u001a\u00020'2\u0006\u0010e\u001a\u00020\fH\u0016J\u0018\u0010n\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010h\u001a\u00020'H\u0016J(\u0010W\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010h\u001a\u00020'2\u0006\u0010o\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\b\u0010p\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020\nH\u0016J\b\u0010r\u001a\u00020\u000eH\u0016J\b\u0010t\u001a\u00020sH\u0016J\u0013\u0010w\u001a\u00020\n2\b\u0010v\u001a\u0004\u0018\u00010uH\u0096\u0002J\b\u0010x\u001a\u00020\u001fH\u0016J\b\u0010y\u001a\u000201H\u0016J\u0006\u0010Y\u001a\u00020\u0000J\b\u0010z\u001a\u00020\u0000H\u0016J\u0006\u0010{\u001a\u00020'J\u000e\u0010|\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u001fJ\u0012\u0010\u007f\u001a\u00020}2\b\b\u0002\u0010~\u001a\u00020}H\u0007R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R1\u0010\u0089\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0017\n\u0005\bB\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008f\u0001"}, d2 = {"Lyg0;", "Lfh0;", "Leh0;", "", "Ljava/nio/channels/ByteChannel;", "D", "Ljava/io/OutputStream;", "S1", Image.TYPE_MEDIUM, "l", "", "U0", "", "byteCount", "", "B0", "w", "peek", "Ljava/io/InputStream;", "z", "out", "offset", "j", e.a, "", "readByte", "pos", "n", "(J)B", "", "readShort", "", "readInt", "readLong", "w0", "C1", "y0", "b1", "T1", "Llk0;", "v1", "J0", "Lzb7;", "options", "W0", "sink", "c0", "Lzma;", "k1", "", "L", "G0", "Ljava/nio/charset/Charset;", "charset", "n1", "K", "s0", "limit", "V", "M", "", "T0", "u0", "readFully", "read", "Ljava/nio/ByteBuffer;", "b", "skip", "byteString", "b0", "string", "K0", "beginIndex", "endIndex", "M0", "codePoint", "N0", "F0", "E0", KustoStorage.KustoTable.COLUMN_SOURCE, "f0", "j0", "write", "Lpqa;", "a1", "e0", "l0", Image.TYPE_SMALL, "z0", "i", "p0", "r0", "v", "x0", "m0", "o0", "minimumCapacity", "Lr3a;", "T", "(I)Lr3a;", "r1", "fromIndex", "toIndex", "o", "bytes", "h0", "q", "targetBytes", "O1", "r", "L1", "bytesOffset", "flush", "isOpen", "close", "Lxgb;", "timeout", "", "other", "equals", "hashCode", "toString", com.huawei.hms.opendevice.c.a, "Q", "S", "Lyg0$a;", "unsafeCursor", "y", "a", "Lr3a;", "head", "<set-?>", "J", "P", "()J", "N", "(J)V", "size", DateTokenConverter.CONVERTER_KEY, "()Lyg0;", "buffer", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: yg0  reason: default package */
/* loaded from: classes3.dex */
public final class yg0 implements fh0, eh0, Cloneable, ByteChannel {
    public r3a a;
    private long b;

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lyg0$a;", "Ljava/io/Closeable;", "", "b", "", "offset", e.a, "newSize", com.huawei.hms.opendevice.c.a, "", "close", "Lyg0;", "a", "Lyg0;", "buffer", "", "Z", "readWrite", "Lr3a;", "Lr3a;", "()Lr3a;", "i", "(Lr3a;)V", tmb.g.SEGMENT_JSON_NAME, DateTokenConverter.CONVERTER_KEY, "J", "", "[B", "data", "f", "I", "start", "g", "end", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yg0$a */
    /* loaded from: classes3.dex */
    public static final class a implements Closeable {
        public yg0 a;
        public boolean b;
        private r3a c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int g = -1;

        public final r3a a() {
            return this.c;
        }

        public final int b() {
            long j;
            long j2 = this.d;
            yg0 yg0Var = this.a;
            z65.e(yg0Var);
            if (j2 != yg0Var.P()) {
                long j3 = this.d;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (this.g - this.f);
                }
                return e(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long c(long j) {
            yg0 yg0Var = this.a;
            if (yg0Var != null) {
                if (this.b) {
                    long P = yg0Var.P();
                    int i = (j > P ? 1 : (j == P ? 0 : -1));
                    if (i <= 0) {
                        if (j >= 0) {
                            long j2 = P - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                r3a r3aVar = yg0Var.a;
                                z65.e(r3aVar);
                                r3a r3aVar2 = r3aVar.g;
                                z65.e(r3aVar2);
                                int i2 = r3aVar2.c;
                                long j3 = i2 - r3aVar2.b;
                                if (j3 <= j2) {
                                    yg0Var.a = r3aVar2.b();
                                    t3a.b(r3aVar2);
                                    j2 -= j3;
                                } else {
                                    r3aVar2.c = i2 - ((int) j2);
                                    break;
                                }
                            }
                            i(null);
                            this.d = j;
                            this.e = null;
                            this.f = -1;
                            this.g = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                        }
                    } else if (i > 0) {
                        long j4 = j - P;
                        boolean z = true;
                        for (long j5 = 0; j4 > j5; j5 = 0) {
                            r3a T = yg0Var.T(1);
                            int min = (int) Math.min(j4, 8192 - T.c);
                            T.c += min;
                            j4 -= min;
                            if (z) {
                                i(T);
                                this.d = P;
                                this.e = T.a;
                                int i3 = T.c;
                                this.f = i3 - min;
                                this.g = i3;
                                z = false;
                            }
                        }
                    }
                    yg0Var.N(j);
                    return P;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.a != null) {
                this.a = null;
                i(null);
                this.d = -1L;
                this.e = null;
                this.f = -1;
                this.g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int e(long j) {
            r3a r3aVar;
            yg0 yg0Var = this.a;
            if (yg0Var != null) {
                int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i >= 0 && j <= yg0Var.P()) {
                    if (i != 0 && j != yg0Var.P()) {
                        long P = yg0Var.P();
                        r3a r3aVar2 = yg0Var.a;
                        long j2 = 0;
                        if (a() != null) {
                            long j3 = this.d;
                            int i2 = this.f;
                            r3a a = a();
                            z65.e(a);
                            long j4 = j3 - (i2 - a.b);
                            if (j4 > j) {
                                r3aVar = r3aVar2;
                                r3aVar2 = a();
                                P = j4;
                            } else {
                                r3aVar = a();
                                j2 = j4;
                            }
                        } else {
                            r3aVar = r3aVar2;
                        }
                        if (P - j > j - j2) {
                            while (true) {
                                z65.e(r3aVar);
                                int i3 = r3aVar.c;
                                int i4 = r3aVar.b;
                                if (j < (i3 - i4) + j2) {
                                    break;
                                }
                                j2 += i3 - i4;
                                r3aVar = r3aVar.f;
                            }
                        } else {
                            while (P > j) {
                                z65.e(r3aVar2);
                                r3aVar2 = r3aVar2.g;
                                z65.e(r3aVar2);
                                P -= r3aVar2.c - r3aVar2.b;
                            }
                            j2 = P;
                            r3aVar = r3aVar2;
                        }
                        if (this.b) {
                            z65.e(r3aVar);
                            if (r3aVar.d) {
                                r3a f = r3aVar.f();
                                if (yg0Var.a == r3aVar) {
                                    yg0Var.a = f;
                                }
                                r3aVar = r3aVar.c(f);
                                r3a r3aVar3 = r3aVar.g;
                                z65.e(r3aVar3);
                                r3aVar3.b();
                            }
                        }
                        i(r3aVar);
                        this.d = j;
                        z65.e(r3aVar);
                        this.e = r3aVar.a;
                        int i5 = r3aVar.b + ((int) (j - j2));
                        this.f = i5;
                        int i6 = r3aVar.c;
                        this.g = i6;
                        return i6 - i5;
                    }
                    i(null);
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + yg0Var.P());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void i(r3a r3aVar) {
            this.c = r3aVar;
        }
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"yg0$c", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yg0$c */
    /* loaded from: classes3.dex */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return yg0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            yg0.this.V0(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            z65.h(bArr, "data");
            yg0.this.p1(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a H(yg0 yg0Var, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = i.d();
        }
        return yg0Var.y(aVar);
    }

    @Override // defpackage.fh0
    public void B0(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.fh0
    public int C1() throws EOFException {
        return i.h(readInt());
    }

    public yg0 E0(String str, int i, int i2, Charset charset) {
        z65.h(str, "string");
        z65.h(charset, "charset");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (z65.c(charset, rw0.b)) {
                        return k0(str, i, i2);
                    }
                    String substring = str.substring(i, i2);
                    z65.g(substring, "substring(...)");
                    byte[] bytes = substring.getBytes(charset);
                    z65.g(bytes, "getBytes(...)");
                    return p1(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public yg0 F0(String str, Charset charset) {
        z65.h(str, "string");
        z65.h(charset, "charset");
        return E0(str, 0, str.length(), charset);
    }

    @Override // defpackage.fh0
    public String G0(long j) throws EOFException {
        return K(j, rw0.b);
    }

    @Override // defpackage.fh0
    public lk0 J0(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (P() >= j) {
                if (j >= 4096) {
                    lk0 S = S((int) j);
                    skip(j);
                    return S;
                }
                return new lk0(u0(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    public String K(long j, Charset charset) throws EOFException {
        z65.h(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (i == 0) {
                    return "";
                }
                r3a r3aVar = this.a;
                z65.e(r3aVar);
                int i2 = r3aVar.b;
                if (i2 + j > r3aVar.c) {
                    return new String(u0(j), charset);
                }
                int i3 = (int) j;
                String str = new String(r3aVar.a, i2, i3, charset);
                int i4 = r3aVar.b + i3;
                r3aVar.b = i4;
                this.b -= j;
                if (i4 == r3aVar.c) {
                    this.a = r3aVar.b();
                    t3a.b(r3aVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // defpackage.eh0
    /* renamed from: K0 */
    public yg0 a0(String str) {
        z65.h(str, "string");
        return k0(str, 0, str.length());
    }

    public String L() {
        return K(this.b, rw0.b);
    }

    @Override // defpackage.fh0
    public boolean L1(long j, lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        return s(j, lk0Var, 0, lk0Var.n0());
    }

    public int M() throws EOFException {
        int i;
        int i2;
        int i3;
        if (P() != 0) {
            byte n = n(0L);
            if ((n & 128) == 0) {
                i = n & Byte.MAX_VALUE;
                i2 = 1;
                i3 = 0;
            } else if ((n & 224) == 192) {
                i = n & 31;
                i2 = 2;
                i3 = 128;
            } else if ((n & 240) == 224) {
                i = n & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((n & 248) == 240) {
                i = n & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (P() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte n2 = n(j2);
                    if ((n2 & 192) == 128) {
                        i = (i << 6) | (n2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && i < 57344) || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + P() + " (to read code point prefixed 0x" + i.k(n) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        throw new EOFException();
    }

    @Override // defpackage.eh0
    /* renamed from: M0 */
    public yg0 k0(String str, int i, int i2) {
        char charAt;
        char c2;
        z65.h(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            r3a T = T(1);
                            byte[] bArr = T.a;
                            int i3 = T.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = T.c;
                            int i6 = (i3 + i) - i5;
                            T.c = i5 + i6;
                            N(P() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                r3a T2 = T(2);
                                byte[] bArr2 = T2.a;
                                int i7 = T2.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                T2.c = i7 + 2;
                                N(P() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c2 = str.charAt(i8);
                                } else {
                                    c2 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c2 && c2 < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c2 & 1023)) + 65536;
                                    r3a T3 = T(4);
                                    byte[] bArr3 = T3.a;
                                    int i10 = T3.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    T3.c = i10 + 4;
                                    N(P() + 4);
                                    i += 2;
                                } else {
                                    V0(63);
                                    i = i8;
                                }
                            } else {
                                r3a T4 = T(3);
                                byte[] bArr4 = T4.a;
                                int i11 = T4.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                T4.c = i11 + 3;
                                N(P() + 3);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public final void N(long j) {
        this.b = j;
    }

    @Override // defpackage.eh0
    /* renamed from: N0 */
    public yg0 G(int i) {
        if (i < 128) {
            V0(i);
        } else if (i < 2048) {
            r3a T = T(2);
            byte[] bArr = T.a;
            int i2 = T.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            T.c = i2 + 2;
            N(P() + 2);
        } else if (55296 <= i && i < 57344) {
            V0(63);
        } else if (i < 65536) {
            r3a T2 = T(3);
            byte[] bArr2 = T2.a;
            int i3 = T2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            T2.c = i3 + 3;
            N(P() + 3);
        } else if (i <= 1114111) {
            r3a T3 = T(4);
            byte[] bArr3 = T3.a;
            int i4 = T3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            T3.c = i4 + 4;
            N(P() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + i.l(i));
        }
        return this;
    }

    @Override // defpackage.fh0
    public long O1(lk0 lk0Var) {
        z65.h(lk0Var, "targetBytes");
        return r(lk0Var, 0L);
    }

    public final long P() {
        return this.b;
    }

    public final lk0 Q() {
        if (P() <= 2147483647L) {
            return S((int) P());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + P()).toString());
    }

    public final lk0 S(int i) {
        if (i == 0) {
            return lk0.e;
        }
        i.b(P(), 0L, i);
        r3a r3aVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            z65.e(r3aVar);
            int i5 = r3aVar.c;
            int i6 = r3aVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                r3aVar = r3aVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        r3a r3aVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            z65.e(r3aVar2);
            bArr[i7] = r3aVar2.a;
            i2 += r3aVar2.c - r3aVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = r3aVar2.b;
            r3aVar2.d = true;
            i7++;
            r3aVar2 = r3aVar2.f;
        }
        return new d4a(bArr, iArr);
    }

    @Override // defpackage.eh0
    public OutputStream S1() {
        return new c();
    }

    public final r3a T(int i) {
        if (i >= 1 && i <= 8192) {
            r3a r3aVar = this.a;
            if (r3aVar == null) {
                r3a c2 = t3a.c();
                this.a = c2;
                c2.g = c2;
                c2.f = c2;
                return c2;
            }
            z65.e(r3aVar);
            r3a r3aVar2 = r3aVar.g;
            z65.e(r3aVar2);
            if (r3aVar2.c + i <= 8192 && r3aVar2.e) {
                return r3aVar2;
            }
            return r3aVar2.c(t3a.c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // defpackage.fh0
    public byte[] T0() {
        return u0(P());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[EDGE_INSN: B:42:0x00a7->B:37:0x00a7 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.fh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long T1() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.P()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb1
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            r3a r6 = r15.a
            defpackage.z65.e(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            yg0 r0 = new yg0
            r0.<init>()
            yg0 r0 = r0.u1(r4)
            yg0 r0 = r0.V0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.L()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = defpackage.i.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            r3a r7 = r6.b()
            r15.a = r7
            defpackage.t3a.b(r6)
            goto La1
        L9f:
            r6.b = r8
        La1:
            if (r1 != 0) goto La7
            r3a r6 = r15.a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r15.P()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.N(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg0.T1():long");
    }

    @Override // defpackage.fh0
    public boolean U0() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fh0
    public String V(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long o = o((byte) 10, 0L, j2);
            if (o != -1) {
                return d.d(this, o);
            }
            if (j2 < P() && n(j2 - 1) == 13 && n(j2) == 10) {
                return d.d(this, j2);
            }
            yg0 yg0Var = new yg0();
            j(yg0Var, 0L, Math.min(32, P()));
            throw new EOFException("\\n not found: limit=" + Math.min(P(), j) + " content=" + yg0Var.v1().G() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // defpackage.fh0
    public int W0(zb7 zb7Var) {
        z65.h(zb7Var, "options");
        int f = d.f(this, zb7Var, false, 2, null);
        if (f == -1) {
            return -1;
        }
        skip(zb7Var.x()[f].n0());
        return f;
    }

    @Override // defpackage.eh0
    public long a1(pqa pqaVar) throws IOException {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        long j = 0;
        while (true) {
            long read = pqaVar.read(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    public final void b() {
        skip(P());
    }

    @Override // defpackage.eh0
    /* renamed from: b0 */
    public yg0 d0(lk0 lk0Var) {
        z65.h(lk0Var, "byteString");
        lk0Var.E0(this, 0, lk0Var.n0());
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        N(P() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r2 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
        if (P() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + defpackage.i.k(n(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (r2 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return r8;
     */
    @Override // defpackage.fh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b1() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg0.b1():long");
    }

    /* renamed from: c */
    public yg0 clone() {
        return i();
    }

    @Override // defpackage.fh0
    public void c0(yg0 yg0Var, long j) throws EOFException {
        z65.h(yg0Var, "sink");
        if (P() >= j) {
            yg0Var.r1(this, j);
        } else {
            yg0Var.r1(this, P());
            throw new EOFException();
        }
    }

    public final long e() {
        long P = P();
        if (P == 0) {
            return 0L;
        }
        r3a r3aVar = this.a;
        z65.e(r3aVar);
        r3a r3aVar2 = r3aVar.g;
        z65.e(r3aVar2);
        int i = r3aVar2.c;
        if (i < 8192 && r3aVar2.e) {
            P -= i - r3aVar2.b;
        }
        return P;
    }

    public yg0 e0(pqa pqaVar, long j) throws IOException {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        while (j > 0) {
            long read = pqaVar.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yg0) {
            yg0 yg0Var = (yg0) obj;
            if (P() == yg0Var.P()) {
                if (P() == 0) {
                    return true;
                }
                r3a r3aVar = this.a;
                z65.e(r3aVar);
                r3a r3aVar2 = yg0Var.a;
                z65.e(r3aVar2);
                int i = r3aVar.b;
                int i2 = r3aVar2.b;
                long j = 0;
                while (j < P()) {
                    long min = Math.min(r3aVar.c - i, r3aVar2.c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (r3aVar.a[i] == r3aVar2.a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == r3aVar.c) {
                        r3aVar = r3aVar.f;
                        z65.e(r3aVar);
                        i = r3aVar.b;
                    }
                    if (i2 == r3aVar2.c) {
                        r3aVar2 = r3aVar2.f;
                        z65.e(r3aVar2);
                        i2 = r3aVar2.b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eh0
    /* renamed from: f0 */
    public yg0 v0(byte[] bArr) {
        z65.h(bArr, KustoStorage.KustoTable.COLUMN_SOURCE);
        return p1(bArr, 0, bArr.length);
    }

    @Override // defpackage.fh0
    public long h0(lk0 lk0Var) throws IOException {
        z65.h(lk0Var, "bytes");
        return q(lk0Var, 0L);
    }

    public int hashCode() {
        r3a r3aVar = this.a;
        if (r3aVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = r3aVar.c;
            for (int i3 = r3aVar.b; i3 < i2; i3++) {
                i = (i * 31) + r3aVar.a[i3];
            }
            r3aVar = r3aVar.f;
            z65.e(r3aVar);
        } while (r3aVar != this.a);
        return i;
    }

    public final yg0 i() {
        yg0 yg0Var = new yg0();
        if (P() != 0) {
            r3a r3aVar = this.a;
            z65.e(r3aVar);
            r3a d = r3aVar.d();
            yg0Var.a = d;
            d.g = d;
            d.f = d;
            for (r3a r3aVar2 = r3aVar.f; r3aVar2 != r3aVar; r3aVar2 = r3aVar2.f) {
                r3a r3aVar3 = d.g;
                z65.e(r3aVar3);
                z65.e(r3aVar2);
                r3aVar3.c(r3aVar2.d());
            }
            yg0Var.N(P());
        }
        return yg0Var;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final yg0 j(yg0 yg0Var, long j, long j2) {
        z65.h(yg0Var, "out");
        i.b(P(), j, j2);
        if (j2 != 0) {
            yg0Var.N(yg0Var.P() + j2);
            r3a r3aVar = this.a;
            while (true) {
                z65.e(r3aVar);
                int i = r3aVar.c;
                int i2 = r3aVar.b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                r3aVar = r3aVar.f;
            }
            while (j2 > 0) {
                z65.e(r3aVar);
                r3a d = r3aVar.d();
                int i3 = d.b + ((int) j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                r3a r3aVar2 = yg0Var.a;
                if (r3aVar2 == null) {
                    d.g = d;
                    d.f = d;
                    yg0Var.a = d;
                } else {
                    z65.e(r3aVar2);
                    r3a r3aVar3 = r3aVar2.g;
                    z65.e(r3aVar3);
                    r3aVar3.c(d);
                }
                j2 -= d.c - d.b;
                r3aVar = r3aVar.f;
                j = 0;
            }
        }
        return this;
    }

    @Override // defpackage.eh0
    /* renamed from: j0 */
    public yg0 p1(byte[] bArr, int i, int i2) {
        z65.h(bArr, KustoStorage.KustoTable.COLUMN_SOURCE);
        long j = i2;
        i.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            r3a T = T(1);
            int min = Math.min(i3 - i, 8192 - T.c);
            int i4 = i + min;
            ur.d(bArr, T.a, T.c, i, i4);
            T.c += min;
            i = i4;
        }
        N(P() + j);
        return this;
    }

    @Override // defpackage.fh0
    public long k1(zma zmaVar) throws IOException {
        z65.h(zmaVar, "sink");
        long P = P();
        if (P > 0) {
            zmaVar.r1(this, P);
        }
        return P;
    }

    @Override // defpackage.eh0
    /* renamed from: l0 */
    public yg0 V0(int i) {
        r3a T = T(1);
        byte[] bArr = T.a;
        int i2 = T.c;
        T.c = i2 + 1;
        bArr[i2] = (byte) i;
        N(P() + 1);
        return this;
    }

    @Override // defpackage.eh0
    /* renamed from: m0 */
    public yg0 C0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return V0(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return a0("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < AbstractComponentTracker.LINGERING_TIMEOUT) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        r3a T = T(i2);
        byte[] bArr = T.a;
        int i3 = T.c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = d.b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        T.c += i2;
        N(P() + i2);
        return this;
    }

    public final byte n(long j) {
        i.b(P(), j, 1L);
        r3a r3aVar = this.a;
        if (r3aVar != null) {
            if (P() - j < j) {
                long P = P();
                while (P > j) {
                    r3aVar = r3aVar.g;
                    z65.e(r3aVar);
                    P -= r3aVar.c - r3aVar.b;
                }
                z65.e(r3aVar);
                return r3aVar.a[(int) ((r3aVar.b + j) - P)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (r3aVar.c - r3aVar.b) + j2;
                if (j3 <= j) {
                    r3aVar = r3aVar.f;
                    z65.e(r3aVar);
                    j2 = j3;
                } else {
                    z65.e(r3aVar);
                    return r3aVar.a[(int) ((r3aVar.b + j) - j2)];
                }
            }
        } else {
            z65.e(null);
            throw null;
        }
    }

    @Override // defpackage.fh0
    public String n1(Charset charset) {
        z65.h(charset, "charset");
        return K(this.b, charset);
    }

    public long o(byte b2, long j, long j2) {
        r3a r3aVar;
        int i;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            if (j2 > P()) {
                j2 = P();
            }
            if (j == j2 || (r3aVar = this.a) == null) {
                return -1L;
            }
            if (P() - j < j) {
                j3 = P();
                while (j3 > j) {
                    r3aVar = r3aVar.g;
                    z65.e(r3aVar);
                    j3 -= r3aVar.c - r3aVar.b;
                }
                while (j3 < j2) {
                    byte[] bArr = r3aVar.a;
                    int min = (int) Math.min(r3aVar.c, (r3aVar.b + j2) - j3);
                    i = (int) ((r3aVar.b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += r3aVar.c - r3aVar.b;
                    r3aVar = r3aVar.f;
                    z65.e(r3aVar);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (r3aVar.c - r3aVar.b) + j3;
                if (j4 > j) {
                    break;
                }
                r3aVar = r3aVar.f;
                z65.e(r3aVar);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = r3aVar.a;
                int min2 = (int) Math.min(r3aVar.c, (r3aVar.b + j2) - j3);
                i = (int) ((r3aVar.b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i++;
                    }
                }
                j3 += r3aVar.c - r3aVar.b;
                r3aVar = r3aVar.f;
                z65.e(r3aVar);
                j = j3;
            }
            return -1L;
            return (i - r3aVar.b) + j3;
        }
        throw new IllegalArgumentException(("size=" + P() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @Override // defpackage.eh0
    /* renamed from: o0 */
    public yg0 u1(long j) {
        if (j == 0) {
            return V0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        r3a T = T(i);
        byte[] bArr = T.a;
        int i2 = T.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = d.b()[(int) (15 & j)];
            j >>>= 4;
        }
        T.c += i;
        N(P() + i);
        return this;
    }

    @Override // defpackage.eh0
    /* renamed from: p0 */
    public yg0 J(int i) {
        r3a T = T(4);
        byte[] bArr = T.a;
        int i2 = T.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        T.c = i2 + 4;
        N(P() + 4);
        return this;
    }

    @Override // defpackage.fh0
    public fh0 peek() {
        return c77.c(new jx7(this));
    }

    public long q(lk0 lk0Var, long j) throws IOException {
        int i;
        long j2 = j;
        z65.h(lk0Var, "bytes");
        if (lk0Var.n0() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                r3a r3aVar = this.a;
                if (r3aVar != null) {
                    if (P() - j2 < j2) {
                        j3 = P();
                        while (j3 > j2) {
                            r3aVar = r3aVar.g;
                            z65.e(r3aVar);
                            j3 -= r3aVar.c - r3aVar.b;
                        }
                        byte[] M = lk0Var.M();
                        byte b2 = M[0];
                        int n0 = lk0Var.n0();
                        long P = (P() - n0) + 1;
                        while (j3 < P) {
                            byte[] bArr = r3aVar.a;
                            long j4 = P;
                            int min = (int) Math.min(r3aVar.c, (r3aVar.b + P) - j3);
                            i = (int) ((r3aVar.b + j2) - j3);
                            while (i < min) {
                                if (bArr[i] == b2 && d.c(r3aVar, i + 1, M, 1, n0)) {
                                    return (i - r3aVar.b) + j3;
                                }
                                i++;
                            }
                            j3 += r3aVar.c - r3aVar.b;
                            r3aVar = r3aVar.f;
                            z65.e(r3aVar);
                            j2 = j3;
                            P = j4;
                        }
                    } else {
                        while (true) {
                            long j5 = (r3aVar.c - r3aVar.b) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            r3aVar = r3aVar.f;
                            z65.e(r3aVar);
                            j3 = j5;
                        }
                        byte[] M2 = lk0Var.M();
                        byte b3 = M2[0];
                        int n02 = lk0Var.n0();
                        long P2 = (P() - n02) + 1;
                        while (j3 < P2) {
                            byte[] bArr2 = r3aVar.a;
                            long j6 = P2;
                            int min2 = (int) Math.min(r3aVar.c, (r3aVar.b + P2) - j3);
                            i = (int) ((r3aVar.b + j2) - j3);
                            while (i < min2) {
                                if (bArr2[i] == b3 && d.c(r3aVar, i + 1, M2, 1, n02)) {
                                    return (i - r3aVar.b) + j3;
                                }
                                i++;
                            }
                            j3 += r3aVar.c - r3aVar.b;
                            r3aVar = r3aVar.f;
                            z65.e(r3aVar);
                            j2 = j3;
                            P2 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public long r(lk0 lk0Var, long j) {
        int i;
        int i2;
        z65.h(lk0Var, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            r3a r3aVar = this.a;
            if (r3aVar == null) {
                return -1L;
            }
            if (P() - j < j) {
                j2 = P();
                while (j2 > j) {
                    r3aVar = r3aVar.g;
                    z65.e(r3aVar);
                    j2 -= r3aVar.c - r3aVar.b;
                }
                if (lk0Var.n0() == 2) {
                    byte s = lk0Var.s(0);
                    byte s2 = lk0Var.s(1);
                    while (j2 < P()) {
                        byte[] bArr = r3aVar.a;
                        i = (int) ((r3aVar.b + j) - j2);
                        int i3 = r3aVar.c;
                        while (i < i3) {
                            byte b2 = bArr[i];
                            if (b2 != s && b2 != s2) {
                                i++;
                            }
                            i2 = r3aVar.b;
                        }
                        j2 += r3aVar.c - r3aVar.b;
                        r3aVar = r3aVar.f;
                        z65.e(r3aVar);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] M = lk0Var.M();
                while (j2 < P()) {
                    byte[] bArr2 = r3aVar.a;
                    i = (int) ((r3aVar.b + j) - j2);
                    int i4 = r3aVar.c;
                    while (i < i4) {
                        byte b3 = bArr2[i];
                        for (byte b4 : M) {
                            if (b3 == b4) {
                                i2 = r3aVar.b;
                            }
                        }
                        i++;
                    }
                    j2 += r3aVar.c - r3aVar.b;
                    r3aVar = r3aVar.f;
                    z65.e(r3aVar);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (r3aVar.c - r3aVar.b) + j2;
                if (j3 > j) {
                    break;
                }
                r3aVar = r3aVar.f;
                z65.e(r3aVar);
                j2 = j3;
            }
            if (lk0Var.n0() == 2) {
                byte s3 = lk0Var.s(0);
                byte s4 = lk0Var.s(1);
                while (j2 < P()) {
                    byte[] bArr3 = r3aVar.a;
                    i = (int) ((r3aVar.b + j) - j2);
                    int i5 = r3aVar.c;
                    while (i < i5) {
                        byte b5 = bArr3[i];
                        if (b5 != s3 && b5 != s4) {
                            i++;
                        }
                        i2 = r3aVar.b;
                    }
                    j2 += r3aVar.c - r3aVar.b;
                    r3aVar = r3aVar.f;
                    z65.e(r3aVar);
                    j = j2;
                }
                return -1L;
            }
            byte[] M2 = lk0Var.M();
            while (j2 < P()) {
                byte[] bArr4 = r3aVar.a;
                i = (int) ((r3aVar.b + j) - j2);
                int i6 = r3aVar.c;
                while (i < i6) {
                    byte b6 = bArr4[i];
                    for (byte b7 : M2) {
                        if (b6 == b7) {
                            i2 = r3aVar.b;
                        }
                    }
                    i++;
                }
                j2 += r3aVar.c - r3aVar.b;
                r3aVar = r3aVar.f;
                z65.e(r3aVar);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    public yg0 r0(int i) {
        return J(i.h(i));
    }

    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) {
        r3a r3aVar;
        r3a r3aVar2;
        int i;
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (yg0Var != this) {
            i.b(yg0Var.P(), 0L, j);
            while (j > 0) {
                r3a r3aVar3 = yg0Var.a;
                z65.e(r3aVar3);
                int i2 = r3aVar3.c;
                z65.e(yg0Var.a);
                if (j < i2 - r3aVar.b) {
                    r3a r3aVar4 = this.a;
                    if (r3aVar4 != null) {
                        z65.e(r3aVar4);
                        r3aVar2 = r3aVar4.g;
                    } else {
                        r3aVar2 = null;
                    }
                    if (r3aVar2 != null && r3aVar2.e) {
                        long j2 = r3aVar2.c + j;
                        if (r3aVar2.d) {
                            i = 0;
                        } else {
                            i = r3aVar2.b;
                        }
                        if (j2 - i <= FileAppender.DEFAULT_BUFFER_SIZE) {
                            r3a r3aVar5 = yg0Var.a;
                            z65.e(r3aVar5);
                            r3aVar5.g(r3aVar2, (int) j);
                            yg0Var.N(yg0Var.P() - j);
                            N(P() + j);
                            return;
                        }
                    }
                    r3a r3aVar6 = yg0Var.a;
                    z65.e(r3aVar6);
                    yg0Var.a = r3aVar6.e((int) j);
                }
                r3a r3aVar7 = yg0Var.a;
                z65.e(r3aVar7);
                long j3 = r3aVar7.c - r3aVar7.b;
                yg0Var.a = r3aVar7.b();
                r3a r3aVar8 = this.a;
                if (r3aVar8 == null) {
                    this.a = r3aVar7;
                    r3aVar7.g = r3aVar7;
                    r3aVar7.f = r3aVar7;
                } else {
                    z65.e(r3aVar8);
                    r3a r3aVar9 = r3aVar8.g;
                    z65.e(r3aVar9);
                    r3aVar9.c(r3aVar7).a();
                }
                yg0Var.N(yg0Var.P() - j3);
                N(P() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        z65.h(byteBuffer, "sink");
        r3a r3aVar = this.a;
        if (r3aVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), r3aVar.c - r3aVar.b);
        byteBuffer.put(r3aVar.a, r3aVar.b, min);
        int i = r3aVar.b + min;
        r3aVar.b = i;
        this.b -= min;
        if (i == r3aVar.c) {
            this.a = r3aVar.b();
            t3a.b(r3aVar);
        }
        return min;
    }

    @Override // defpackage.fh0
    public byte readByte() throws EOFException {
        if (P() != 0) {
            r3a r3aVar = this.a;
            z65.e(r3aVar);
            int i = r3aVar.b;
            int i2 = r3aVar.c;
            int i3 = i + 1;
            byte b2 = r3aVar.a[i];
            N(P() - 1);
            if (i3 == i2) {
                this.a = r3aVar.b();
                t3a.b(r3aVar);
            } else {
                r3aVar.b = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // defpackage.fh0
    public void readFully(byte[] bArr) throws EOFException {
        z65.h(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.fh0
    public int readInt() throws EOFException {
        if (P() >= 4) {
            r3a r3aVar = this.a;
            z65.e(r3aVar);
            int i = r3aVar.b;
            int i2 = r3aVar.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = r3aVar.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            N(P() - 4);
            if (i5 == i2) {
                this.a = r3aVar.b();
                t3a.b(r3aVar);
            } else {
                r3aVar.b = i5;
            }
            return i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.fh0
    public long readLong() throws EOFException {
        if (P() >= 8) {
            r3a r3aVar = this.a;
            z65.e(r3aVar);
            int i = r3aVar.b;
            int i2 = r3aVar.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = r3aVar.a;
            long j = ((bArr[i + 3] & 255) << 32) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40);
            int i3 = i + 7;
            int i4 = i + 8;
            long j2 = j | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            N(P() - 8);
            if (i4 == i2) {
                this.a = r3aVar.b();
                t3a.b(r3aVar);
            } else {
                r3aVar.b = i4;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // defpackage.fh0
    public short readShort() throws EOFException {
        if (P() >= 2) {
            r3a r3aVar = this.a;
            z65.e(r3aVar);
            int i = r3aVar.b;
            int i2 = r3aVar.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = r3aVar.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            N(P() - 2);
            if (i4 == i2) {
                this.a = r3aVar.b();
                t3a.b(r3aVar);
            } else {
                r3aVar.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    public boolean s(long j, lk0 lk0Var, int i, int i2) {
        z65.h(lk0Var, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || P() - j < i2 || lk0Var.n0() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (n(i3 + j) != lk0Var.s(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.fh0
    public String s0() throws EOFException {
        return V(Long.MAX_VALUE);
    }

    @Override // defpackage.fh0
    public void skip(long j) throws EOFException {
        while (j > 0) {
            r3a r3aVar = this.a;
            if (r3aVar != null) {
                int min = (int) Math.min(j, r3aVar.c - r3aVar.b);
                long j2 = min;
                N(P() - j2);
                j -= j2;
                int i = r3aVar.b + min;
                r3aVar.b = i;
                if (i == r3aVar.c) {
                    this.a = r3aVar.b();
                    t3a.b(r3aVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.pqa
    public xgb timeout() {
        return xgb.e;
    }

    public String toString() {
        return Q().toString();
    }

    @Override // defpackage.fh0
    public byte[] u0(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (P() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // defpackage.fh0
    public lk0 v1() {
        return J0(P());
    }

    @Override // defpackage.fh0
    public boolean w(long j) {
        if (this.b >= j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fh0
    public short w0() throws EOFException {
        return i.j(readShort());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        z65.h(byteBuffer, KustoStorage.KustoTable.COLUMN_SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            r3a T = T(1);
            int min = Math.min(i, 8192 - T.c);
            byteBuffer.get(T.a, T.c, min);
            i -= min;
            T.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public yg0 x0(long j) {
        r3a T = T(8);
        byte[] bArr = T.a;
        int i = T.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        T.c = i + 8;
        N(P() + 8);
        return this;
    }

    public final a y(a aVar) {
        z65.h(aVar, "unsafeCursor");
        return d.a(this, aVar);
    }

    @Override // defpackage.fh0
    public long y0() throws EOFException {
        return i.i(readLong());
    }

    @Override // defpackage.fh0
    public InputStream z() {
        return new b();
    }

    @Override // defpackage.eh0
    /* renamed from: z0 */
    public yg0 P0(int i) {
        r3a T = T(2);
        byte[] bArr = T.a;
        int i2 = T.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        T.c = i2 + 2;
        N(P() + 2);
        return this;
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"yg0$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yg0$b */
    /* loaded from: classes3.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(yg0.this.P(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (yg0.this.P() > 0) {
                return yg0.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return yg0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            z65.h(bArr, "sink");
            return yg0.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        z65.h(bArr, "sink");
        i.b(bArr.length, i, i2);
        r3a r3aVar = this.a;
        if (r3aVar == null) {
            return -1;
        }
        int min = Math.min(i2, r3aVar.c - r3aVar.b);
        byte[] bArr2 = r3aVar.a;
        int i3 = r3aVar.b;
        ur.d(bArr2, bArr, i, i3, i3 + min);
        r3aVar.b += min;
        N(P() - min);
        if (r3aVar.b == r3aVar.c) {
            this.a = r3aVar.b();
            t3a.b(r3aVar);
        }
        return min;
    }

    @Override // defpackage.pqa
    public long read(yg0 yg0Var, long j) {
        z65.h(yg0Var, "sink");
        if (j >= 0) {
            if (P() == 0) {
                return -1L;
            }
            if (j > P()) {
                j = P();
            }
            yg0Var.r1(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // defpackage.fh0
    public yg0 D() {
        return this;
    }

    @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.fh0
    public yg0 d() {
        return this;
    }

    @Override // defpackage.eh0, defpackage.zma, java.io.Flushable
    public void flush() {
    }

    @Override // defpackage.eh0
    /* renamed from: l */
    public yg0 F() {
        return this;
    }

    @Override // defpackage.eh0
    /* renamed from: m */
    public yg0 U() {
        return this;
    }
}
