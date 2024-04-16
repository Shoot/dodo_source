package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rp4;
import im.threads.business.transport.MessageAttributes;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Http2Writer.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 C2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00104\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u00104\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u00106\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lfq4;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "", Image.TYPE_SMALL, "b", "Lwfa;", "peerSettings", "a", "promisedStreamId", "", "Ldn4;", "requestHeaders", "n", "flush", "Lfk3;", "errorCode", "o", "l", "", "outFinished", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, c.a, "flags", "buffer", e.a, "settings", "q", "ack", "payload1", "payload2", Image.TYPE_MEDIUM, "lastGoodStreamId", "", "debugData", "j", "windowSizeIncrement", "r", "length", MessageAttributes.TYPE, "i", "close", "headerBlock", "k", "Leh0;", "Leh0;", "sink", "Z", "client", "Lyg0;", "hpackBuffer", DateTokenConverter.CONVERTER_KEY, "I", "maxFrameSize", "closed", "Lrp4$b;", "f", "Lrp4$b;", "getHpackWriter", "()Lrp4$b;", "hpackWriter", "<init>", "(Leh0;Z)V", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: fq4  reason: default package */
/* loaded from: classes3.dex */
public final class fq4 implements Closeable {
    public static final a g = new a(null);
    private static final Logger h = Logger.getLogger(aq4.class.getName());
    private final eh0 a;
    private final boolean b;
    private final yg0 c;
    private int d;
    private boolean e;
    private final rp4.b f;

    /* compiled from: Http2Writer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lfq4$a;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fq4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fq4(eh0 eh0Var, boolean z) {
        z65.h(eh0Var, "sink");
        this.a = eh0Var;
        this.b = z;
        yg0 yg0Var = new yg0();
        this.c = yg0Var;
        this.d = 16384;
        this.f = new rp4.b(0, false, yg0Var, 3, null);
    }

    private final void s(int i, long j) throws IOException {
        int i2;
        while (j > 0) {
            long min = Math.min(this.d, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            i(i, i3, 9, i2);
            this.a.r1(this.c, min);
        }
    }

    public final synchronized void a(wfa wfaVar) throws IOException {
        try {
            z65.h(wfaVar, "peerSettings");
            if (!this.e) {
                this.d = wfaVar.e(this.d);
                if (wfaVar.b() != -1) {
                    this.f.e(wfaVar.b());
                }
                i(0, 0, 4, 1);
                this.a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() throws IOException {
        try {
            if (!this.e) {
                if (!this.b) {
                    return;
                }
                Logger logger = h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(cec.j(">> CONNECTION " + aq4.b.G(), new Object[0]));
                }
                this.a.d0(aq4.b);
                this.a.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, yg0 yg0Var, int i2) throws IOException {
        if (!this.e) {
            e(i, z ? 1 : 0, yg0Var, i2);
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.e = true;
        this.a.close();
    }

    public final void e(int i, int i2, yg0 yg0Var, int i3) throws IOException {
        i(i, i3, 0, i2);
        if (i3 > 0) {
            eh0 eh0Var = this.a;
            z65.e(yg0Var);
            eh0Var.r1(yg0Var, i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.e) {
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void i(int i, int i2, int i3, int i4) throws IOException {
        if (i3 != 8) {
            Logger logger = h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(aq4.a.c(false, i, i2, i3, i4));
            }
        }
        if (i2 <= this.d) {
            if ((Integer.MIN_VALUE & i) == 0) {
                zdc.L(this.a, i2);
                this.a.V0(i3 & 255);
                this.a.V0(i4 & 255);
                this.a.J(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + i2).toString());
    }

    public final synchronized void j(int i, fk3 fk3Var, byte[] bArr) throws IOException {
        try {
            z65.h(fk3Var, "errorCode");
            z65.h(bArr, "debugData");
            if (!this.e) {
                if (fk3Var.i() != -1) {
                    boolean z = false;
                    i(0, bArr.length + 8, 7, 0);
                    this.a.J(i);
                    this.a.J(fk3Var.i());
                    if (bArr.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        this.a.v0(bArr);
                    }
                    this.a.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(boolean z, int i, List<dn4> list) throws IOException {
        int i2;
        z65.h(list, "headerBlock");
        if (!this.e) {
            this.f.g(list);
            long P = this.c.P();
            long min = Math.min(this.d, P);
            int i3 = (P > min ? 1 : (P == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            i(i, (int) min, 1, i2);
            this.a.r1(this.c, min);
            if (i3 > 0) {
                s(i, P - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int l() {
        return this.d;
    }

    public final synchronized void m(boolean z, int i, int i2) throws IOException {
        if (!this.e) {
            i(0, 8, 6, z ? 1 : 0);
            this.a.J(i);
            this.a.J(i2);
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i, int i2, List<dn4> list) throws IOException {
        int i3;
        z65.h(list, "requestHeaders");
        if (!this.e) {
            this.f.g(list);
            long P = this.c.P();
            int min = (int) Math.min(this.d - 4, P);
            int i4 = min + 4;
            long j = min;
            int i5 = (P > j ? 1 : (P == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            i(i, i4, 5, i3);
            this.a.J(i2 & Integer.MAX_VALUE);
            this.a.r1(this.c, j);
            if (i5 > 0) {
                s(i, P - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i, fk3 fk3Var) throws IOException {
        z65.h(fk3Var, "errorCode");
        if (!this.e) {
            if (fk3Var.i() != -1) {
                i(i, 4, 3, 0);
                this.a.J(fk3Var.i());
                this.a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(wfa wfaVar) throws IOException {
        int i;
        try {
            z65.h(wfaVar, "settings");
            if (!this.e) {
                i(0, wfaVar.i() * 6, 4, 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (wfaVar.f(i2)) {
                        if (i2 != 4) {
                            if (i2 != 7) {
                                i = i2;
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                        this.a.P0(i);
                        this.a.J(wfaVar.a(i2));
                    }
                }
                this.a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void r(int i, long j) throws IOException {
        try {
            if (!this.e) {
                if (j != 0 && j <= 2147483647L) {
                    Logger logger = h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(aq4.a.d(false, i, 4, j));
                    }
                    i(i, 4, 8, 0);
                    this.a.J((int) j);
                    this.a.flush();
                } else {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
