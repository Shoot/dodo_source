package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.StreamResetException;
/* compiled from: Http2Stream.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 P2\u00020\u0001:\u0004&#\u001f$B3\b\u0000\u0012\u0006\u0010*\u001a\u00020\u0018\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u0010c\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bd\u0010eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u001f\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!J\u000f\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010 R\u0017\u0010*\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b2\u00103R*\u0010;\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010>\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u001e\u0010\u0017\u001a\u00060DR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010L\u001a\u00060HR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010R\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010U\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010QR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010V\u001a\u0004\bN\u0010W\"\u0004\bX\u0010YR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010Z\u001a\u0004\bS\u0010[\"\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\ba\u0010_¨\u0006f"}, d2 = {"Leq4;", "", "Lfk3;", "errorCode", "Ljava/io/IOException;", "errorException", "", "f", Image.TYPE_HIGH, "callerIsIdle", "Lgn4;", "B", "C", "Lxgb;", "w", "E", "Lzma;", "o", "rstStatusCode", "", e.a, "g", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "length", "x", "headers", "inFinished", "y", "z", com.huawei.hms.opendevice.c.a, "()V", "", "delta", "b", DateTokenConverter.CONVERTER_KEY, "D", "a", "I", "l", "()I", "id", "Lbq4;", "Lbq4;", "i", "()Lbq4;", "connection", "Lx4c;", "Lx4c;", Image.TYPE_MEDIUM, "()Lx4c;", "readBytes", "<set-?>", "J", Image.TYPE_SMALL, "()J", "A", "(J)V", "writeBytesTotal", "r", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Leq4$c;", "Leq4$c;", "q", "()Leq4$c;", "Leq4$b;", "Leq4$b;", "p", "()Leq4$b;", "sink", "Leq4$d;", "j", "Leq4$d;", "n", "()Leq4$d;", "readTimeout", "k", "t", "writeTimeout", "Lfk3;", "()Lfk3;", "setErrorCode$okhttp", "(Lfk3;)V", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "v", "()Z", "isOpen", "u", "isLocallyInitiated", "outFinished", "<init>", "(ILbq4;ZZLgn4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: eq4  reason: default package */
/* loaded from: classes3.dex */
public final class eq4 {
    public static final a n = new a(null);
    private final int a;
    private final bq4 b;
    private final x4c c;
    private long d;
    private long e;
    private final ArrayDeque<gn4> f;
    private boolean g;
    private final c h;
    private final b i;
    private final d j;
    private final d k;
    private fk3 l;
    private IOException m;

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Leq4$a;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eq4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Leq4$b;", "Lzma;", "", "outFinishedOnLastFrame", "", "a", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "r1", "flush", "Lxgb;", "timeout", "close", "Z", com.huawei.hms.opendevice.c.a, "()Z", "setFinished", "(Z)V", "finished", "b", "Lyg0;", "sendBuffer", "Lgn4;", "Lgn4;", "getTrailers", "()Lgn4;", "setTrailers", "(Lgn4;)V", "trailers", DateTokenConverter.CONVERTER_KEY, "setClosed", "closed", "<init>", "(Leq4;Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eq4$b */
    /* loaded from: classes3.dex */
    public final class b implements zma {
        private boolean a;
        private final yg0 b = new yg0();
        private gn4 c;
        private boolean d;

        public b(boolean z) {
            this.a = z;
        }

        private final void a(boolean z) throws IOException {
            long min;
            boolean z2;
            eq4 eq4Var = eq4.this;
            synchronized (eq4Var) {
                try {
                    eq4Var.t().v();
                    while (eq4Var.s() >= eq4Var.r() && !this.a && !this.d && eq4Var.j() == null) {
                        eq4Var.D();
                    }
                    eq4Var.t().C();
                    eq4Var.d();
                    min = Math.min(eq4Var.r() - eq4Var.s(), this.b.P());
                    eq4Var.A(eq4Var.s() + min);
                    if (z && min == this.b.P()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            eq4.this.t().v();
            try {
                eq4.this.i().Q0(eq4.this.l(), z2, this.b, min);
            } finally {
                eq4.this.t().C();
            }
        }

        public final boolean b() {
            return this.d;
        }

        public final boolean c() {
            return this.a;
        }

        @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z;
            boolean z2;
            eq4 eq4Var = eq4.this;
            if (cec.e && Thread.holdsLock(eq4Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + eq4Var);
            }
            eq4 eq4Var2 = eq4.this;
            synchronized (eq4Var2) {
                if (this.d) {
                    return;
                }
                if (eq4Var2.j() == null) {
                    z = true;
                } else {
                    z = false;
                }
                Unit unit = Unit.a;
                if (!eq4.this.p().a) {
                    if (this.b.P() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.c != null) {
                        while (this.b.P() > 0) {
                            a(false);
                        }
                        bq4 i = eq4.this.i();
                        int l = eq4.this.l();
                        gn4 gn4Var = this.c;
                        z65.e(gn4Var);
                        i.S0(l, z, cec.s(gn4Var));
                    } else if (z2) {
                        while (this.b.P() > 0) {
                            a(true);
                        }
                    } else if (z) {
                        eq4.this.i().Q0(eq4.this.l(), true, null, 0L);
                    }
                }
                eq4 eq4Var3 = eq4.this;
                synchronized (eq4Var3) {
                    this.d = true;
                    z65.f(eq4Var3, "null cannot be cast to non-null type java.lang.Object");
                    eq4Var3.notifyAll();
                    Unit unit2 = Unit.a;
                }
                eq4.this.i().flush();
                eq4.this.c();
            }
        }

        @Override // defpackage.zma, java.io.Flushable
        public void flush() throws IOException {
            eq4 eq4Var = eq4.this;
            if (cec.e && Thread.holdsLock(eq4Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + eq4Var);
            }
            eq4 eq4Var2 = eq4.this;
            synchronized (eq4Var2) {
                eq4Var2.d();
                Unit unit = Unit.a;
            }
            while (this.b.P() > 0) {
                a(false);
                eq4.this.i().flush();
            }
        }

        @Override // defpackage.zma
        public void r1(yg0 yg0Var, long j) throws IOException {
            z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            eq4 eq4Var = eq4.this;
            if (cec.e && Thread.holdsLock(eq4Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + eq4Var);
            }
            this.b.r1(yg0Var, j);
            while (this.b.P() >= 16384) {
                a(false);
            }
        }

        @Override // defpackage.zma
        public xgb timeout() {
            return eq4.this.t();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR$\u0010'\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Leq4$c;", "Lpqa;", "", "read", "", Image.TYPE_MEDIUM, "Lyg0;", "sink", "byteCount", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "j", "(Lfh0;J)V", "Lxgb;", "timeout", "close", "a", "J", "maxByteCount", "", "b", "Z", "()Z", "k", "(Z)V", "finished", com.huawei.hms.opendevice.c.a, "Lyg0;", e.a, "()Lyg0;", "receiveBuffer", DateTokenConverter.CONVERTER_KEY, "readBuffer", "Lgn4;", "Lgn4;", "i", "()Lgn4;", "l", "(Lgn4;)V", "trailers", "f", "setClosed$okhttp", "closed", "<init>", "(Leq4;JZ)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eq4$c */
    /* loaded from: classes3.dex */
    public final class c implements pqa {
        private final long a;
        private boolean b;
        private final yg0 c = new yg0();
        private final yg0 d = new yg0();
        private gn4 e;
        private boolean f;

        public c(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        private final void m(long j) {
            eq4 eq4Var = eq4.this;
            if (cec.e && Thread.holdsLock(eq4Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + eq4Var);
            }
            eq4.this.i().O0(j);
        }

        public final boolean a() {
            return this.f;
        }

        public final boolean b() {
            return this.b;
        }

        public final yg0 c() {
            return this.d;
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long P;
            eq4 eq4Var = eq4.this;
            synchronized (eq4Var) {
                this.f = true;
                P = this.d.P();
                this.d.b();
                z65.f(eq4Var, "null cannot be cast to non-null type java.lang.Object");
                eq4Var.notifyAll();
                Unit unit = Unit.a;
            }
            if (P > 0) {
                m(P);
            }
            eq4.this.c();
        }

        public final yg0 e() {
            return this.c;
        }

        public final gn4 i() {
            return this.e;
        }

        public final void j(fh0 fh0Var, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            eq4 eq4Var = eq4.this;
            if (cec.e && Thread.holdsLock(eq4Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + eq4Var);
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (eq4.this) {
                    z = this.b;
                    z2 = false;
                    if (this.d.P() + j2 > this.a) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Unit unit = Unit.a;
                }
                if (z3) {
                    fh0Var.skip(j2);
                    eq4.this.g(fk3.f);
                    return;
                } else if (z) {
                    fh0Var.skip(j2);
                    return;
                } else {
                    long read = fh0Var.read(this.c, j2);
                    if (read != -1) {
                        j2 -= read;
                        eq4 eq4Var2 = eq4.this;
                        synchronized (eq4Var2) {
                            try {
                                if (this.f) {
                                    this.c.b();
                                } else {
                                    if (this.d.P() == 0) {
                                        z2 = true;
                                    }
                                    this.d.a1(this.c);
                                    if (z2) {
                                        z65.f(eq4Var2, "null cannot be cast to non-null type java.lang.Object");
                                        eq4Var2.notifyAll();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            m(j);
            eq4.this.i().N().b(eq4.this.l(), eq4.this.m(), this.d.P());
        }

        public final void k(boolean z) {
            this.b = z;
        }

        public final void l(gn4 gn4Var) {
            this.e = gn4Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // defpackage.pqa
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(defpackage.yg0 r24, long r25) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eq4.c.read(yg0, long):long");
        }

        @Override // defpackage.pqa
        public xgb timeout() {
            return eq4.this.n();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Leq4$d;", "Lky;", "", "B", "Ljava/io/IOException;", "cause", "x", "C", "<init>", "(Leq4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eq4$d */
    /* loaded from: classes3.dex */
    public final class d extends ky {
        public d() {
        }

        @Override // defpackage.ky
        protected void B() {
            eq4.this.g(fk3.k);
            eq4.this.i().E0();
        }

        public final void C() throws IOException {
            if (!w()) {
                return;
            }
            throw x(null);
        }

        @Override // defpackage.ky
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public eq4(int i, bq4 bq4Var, boolean z, boolean z2, gn4 gn4Var) {
        z65.h(bq4Var, "connection");
        this.a = i;
        this.b = bq4Var;
        this.c = new x4c(i);
        this.e = bq4Var.W().c();
        ArrayDeque<gn4> arrayDeque = new ArrayDeque<>();
        this.f = arrayDeque;
        this.h = new c(bq4Var.T().c(), z2);
        this.i = new b(z);
        this.j = new d();
        this.k = new d();
        if (gn4Var != null) {
            if (!u()) {
                arrayDeque.add(gn4Var);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (u()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean f(fk3 fk3Var, IOException iOException) {
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            this.l = fk3Var;
            this.m = iOException;
            z65.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.h.b() && this.i.c()) {
                return false;
            }
            Unit unit = Unit.a;
            this.b.z0(this.a);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.b.L() && !this.i.b() && !this.i.c()) {
            return false;
        }
        return true;
    }

    public final void A(long j) {
        this.d = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.j.v();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.gn4 B(boolean r3) throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
        L1:
            java.util.ArrayDeque<gn4> r0 = r2.f     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L19
            r1 = 1
            if (r0 == 0) goto L36
            fk3 r0 = r2.l     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L36
            if (r3 != 0) goto L1b
            boolean r0 = r2.h()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L17
            goto L1b
        L17:
            r1 = 0
            goto L1b
        L19:
            r3 = move-exception
            goto L5e
        L1b:
            if (r1 == 0) goto L22
            eq4$d r0 = r2.j     // Catch: java.lang.Throwable -> L19
            r0.v()     // Catch: java.lang.Throwable -> L19
        L22:
            r2.D()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L1
            eq4$d r0 = r2.j     // Catch: java.lang.Throwable -> L19
            r0.C()     // Catch: java.lang.Throwable -> L19
            goto L1
        L2d:
            r3 = move-exception
            if (r1 == 0) goto L35
            eq4$d r0 = r2.j     // Catch: java.lang.Throwable -> L19
            r0.C()     // Catch: java.lang.Throwable -> L19
        L35:
            throw r3     // Catch: java.lang.Throwable -> L19
        L36:
            java.util.ArrayDeque<gn4> r3 = r2.f     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L19
            r3 = r3 ^ r1
            if (r3 == 0) goto L4e
            java.util.ArrayDeque<gn4> r3 = r2.f     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.removeFirst()     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "removeFirst(...)"
            defpackage.z65.g(r3, r0)     // Catch: java.lang.Throwable -> L19
            gn4 r3 = (defpackage.gn4) r3     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        L4e:
            java.io.IOException r3 = r2.m     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L53
            goto L5d
        L53:
            okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L19
            fk3 r0 = r2.l     // Catch: java.lang.Throwable -> L19
            defpackage.z65.e(r0)     // Catch: java.lang.Throwable -> L19
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L19
        L5d:
            throw r3     // Catch: java.lang.Throwable -> L19
        L5e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq4.B(boolean):gn4");
    }

    public final synchronized gn4 C() throws IOException {
        gn4 i;
        if (this.h.b() && this.h.e().U0() && this.h.c().U0()) {
            i = this.h.i();
            if (i == null) {
                i = cec.a;
            }
        } else if (this.l != null) {
            IOException iOException = this.m;
            if (iOException == null) {
                fk3 fk3Var = this.l;
                z65.e(fk3Var);
                throw new StreamResetException(fk3Var);
            }
            throw iOException;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return i;
    }

    public final void D() throws InterruptedIOException {
        try {
            z65.f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final xgb E() {
        return this.k;
    }

    public final void b(long j) {
        this.e += j;
        if (j > 0) {
            z65.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void c() throws IOException {
        boolean z;
        boolean v;
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.h.b() || !this.h.a() || (!this.i.c() && !this.i.b())) {
                    z = false;
                    v = v();
                    Unit unit = Unit.a;
                }
                z = true;
                v = v();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(fk3.k, null);
        } else if (!v) {
            this.b.z0(this.a);
        }
    }

    public final void d() throws IOException {
        if (!this.i.b()) {
            if (!this.i.c()) {
                if (this.l != null) {
                    IOException iOException = this.m;
                    if (iOException == null) {
                        fk3 fk3Var = this.l;
                        z65.e(fk3Var);
                        throw new StreamResetException(fk3Var);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void e(fk3 fk3Var, IOException iOException) throws IOException {
        z65.h(fk3Var, "rstStatusCode");
        if (!f(fk3Var, iOException)) {
            return;
        }
        this.b.Z0(this.a, fk3Var);
    }

    public final void g(fk3 fk3Var) {
        z65.h(fk3Var, "errorCode");
        if (!f(fk3Var, null)) {
            return;
        }
        this.b.e1(this.a, fk3Var);
    }

    public final bq4 i() {
        return this.b;
    }

    public final synchronized fk3 j() {
        return this.l;
    }

    public final IOException k() {
        return this.m;
    }

    public final int l() {
        return this.a;
    }

    public final x4c m() {
        return this.c;
    }

    public final d n() {
        return this.j;
    }

    public final zma o() {
        synchronized (this) {
            try {
                if (!this.g && !u()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.i;
    }

    public final b p() {
        return this.i;
    }

    public final c q() {
        return this.h;
    }

    public final long r() {
        return this.e;
    }

    public final long s() {
        return this.d;
    }

    public final d t() {
        return this.k;
    }

    public final boolean u() {
        boolean z;
        if ((this.a & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.b.L() == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean v() {
        try {
            if (this.l != null) {
                return false;
            }
            if (!this.h.b()) {
                if (this.h.a()) {
                }
                return true;
            }
            if (this.i.c() || this.i.b()) {
                if (this.g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final xgb w() {
        return this.j;
    }

    public final void x(fh0 fh0Var, int i) throws IOException {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.h.j(fh0Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:10:0x0038, B:12:0x003d, B:14:0x0045, B:17:0x004e, B:22:0x005f, B:23:0x0064, B:20:0x0056), top: B:30:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.gn4 r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            defpackage.z65.h(r3, r0)
            boolean r0 = defpackage.cec.e
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.g     // Catch: java.lang.Throwable -> L54
            r1 = 1
            if (r0 == 0) goto L56
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.d(r0)     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L56
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.d(r0)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L4e
            goto L56
        L4e:
            eq4$c r0 = r2.h     // Catch: java.lang.Throwable -> L54
            r0.l(r3)     // Catch: java.lang.Throwable -> L54
            goto L5d
        L54:
            r3 = move-exception
            goto L7d
        L56:
            r2.g = r1     // Catch: java.lang.Throwable -> L54
            java.util.ArrayDeque<gn4> r0 = r2.f     // Catch: java.lang.Throwable -> L54
            r0.add(r3)     // Catch: java.lang.Throwable -> L54
        L5d:
            if (r4 == 0) goto L64
            eq4$c r3 = r2.h     // Catch: java.lang.Throwable -> L54
            r3.k(r1)     // Catch: java.lang.Throwable -> L54
        L64:
            boolean r3 = r2.v()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            defpackage.z65.f(r2, r4)     // Catch: java.lang.Throwable -> L54
            r2.notifyAll()     // Catch: java.lang.Throwable -> L54
            kotlin.Unit r4 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)
            if (r3 != 0) goto L7c
            bq4 r3 = r2.b
            int r4 = r2.a
            r3.z0(r4)
        L7c:
            return
        L7d:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq4.y(gn4, boolean):void");
    }

    public final synchronized void z(fk3 fk3Var) {
        z65.h(fk3Var, "errorCode");
        if (this.l == null) {
            this.l = fk3Var;
            z65.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
