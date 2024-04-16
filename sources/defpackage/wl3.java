package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ik9;
import defpackage.xl3;
import defpackage.z79;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
/* compiled from: Exchange.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002$\u001dB'\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00108\u001a\u000206¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J9\u0010$\u001a\u00028\u0000\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010&\u001a\u00020\u0004R\u001a\u0010+\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u001a\u00100\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00107R$\u0010=\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R$\u0010?\u001a\u00020\t2\u0006\u00109\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<¨\u0006H"}, d2 = {"Lwl3;", "", "Ljava/io/IOException;", e.a, "", "u", "Lhi9;", "request", "x", "", "duplex", "Lzma;", c.a, "f", "t", "expectContinue", "Lik9$a;", "r", "Lik9;", "response", Image.TYPE_SMALL, "Lkk9;", "q", "Lgn4;", "v", "Lz79$d;", "n", "w", "o", "b", DateTokenConverter.CONVERTER_KEY, "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "p", "Lt79;", "Lt79;", "g", "()Lt79;", "call", "Lxk3;", "Lxk3;", "i", "()Lxk3;", "eventListener", "Lyl3;", "Lyl3;", "j", "()Lyl3;", "finder", "Lxl3;", "Lxl3;", "codec", "<set-?>", "Z", Image.TYPE_MEDIUM, "()Z", "isDuplex", "k", "hasFailure", "Lu79;", Image.TYPE_HIGH, "()Lu79;", "connection", "l", "isCoalescedConnection", "<init>", "(Lt79;Lxk3;Lyl3;Lxl3;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: wl3  reason: default package */
/* loaded from: classes3.dex */
public final class wl3 {
    private final t79 a;
    private final xk3 b;
    private final yl3 c;
    private final xl3 d;
    private boolean e;
    private boolean f;

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u001d"}, d2 = {"Lwl3$a;", "Lx54;", "Ljava/io/IOException;", "E", e.a, "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "b", "J", "contentLength", "", c.a, "Z", "completed", DateTokenConverter.CONVERTER_KEY, "bytesReceived", "closed", "Lzma;", "delegate", "<init>", "(Lwl3;Lzma;J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wl3$a */
    /* loaded from: classes3.dex */
    private final class a extends x54 {
        private final long b;
        private boolean c;
        private long d;
        private boolean e;
        final /* synthetic */ wl3 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wl3 wl3Var, zma zmaVar, long j) {
            super(zmaVar);
            z65.h(zmaVar, "delegate");
            this.f = wl3Var;
            this.b = j;
        }

        private final <E extends IOException> E a(E e) {
            if (this.c) {
                return e;
            }
            this.c = true;
            return (E) this.f.a(this.d, false, true, e);
        }

        @Override // defpackage.x54, defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            long j = this.b;
            if (j != -1 && this.d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.x54, defpackage.zma, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.x54, defpackage.zma
        public void r1(yg0 yg0Var, long j) throws IOException {
            z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            if (!this.e) {
                long j2 = this.b;
                if (j2 != -1 && this.d + j > j2) {
                    throw new ProtocolException("expected " + this.b + " bytes but received " + (this.d + j));
                }
                try {
                    super.r1(yg0Var, j);
                    this.d += j;
                    return;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u001d"}, d2 = {"Lwl3$b;", "Ly54;", "Lyg0;", "sink", "", "byteCount", "read", "", "close", "Ljava/io/IOException;", "E", e.a, "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "contentLength", "b", "bytesReceived", "", c.a, "Z", "invokeStartEvent", DateTokenConverter.CONVERTER_KEY, "completed", "closed", "Lpqa;", "delegate", "<init>", "(Lwl3;Lpqa;J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wl3$b */
    /* loaded from: classes3.dex */
    public final class b extends y54 {
        private final long a;
        private long b;
        private boolean c;
        private boolean d;
        private boolean e;
        final /* synthetic */ wl3 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wl3 wl3Var, pqa pqaVar, long j) {
            super(pqaVar);
            z65.h(pqaVar, "delegate");
            this.f = wl3Var;
            this.a = j;
            this.c = true;
            if (j == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.d) {
                return e;
            }
            this.d = true;
            if (e == null && this.c) {
                this.c = false;
                this.f.i().w(this.f.g());
            }
            return (E) this.f.a(this.b, true, false, e);
        }

        @Override // defpackage.y54, defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.y54, defpackage.pqa
        public long read(yg0 yg0Var, long j) throws IOException {
            z65.h(yg0Var, "sink");
            if (!this.e) {
                try {
                    long read = delegate().read(yg0Var, j);
                    if (this.c) {
                        this.c = false;
                        this.f.i().w(this.f.g());
                    }
                    if (read == -1) {
                        a(null);
                        return -1L;
                    }
                    long j2 = this.b + read;
                    long j3 = this.a;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.a + " bytes but received " + j2);
                    }
                    this.b = j2;
                    if (j2 == j3) {
                        a(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public wl3(t79 t79Var, xk3 xk3Var, yl3 yl3Var, xl3 xl3Var) {
        z65.h(t79Var, "call");
        z65.h(xk3Var, "eventListener");
        z65.h(yl3Var, "finder");
        z65.h(xl3Var, "codec");
        this.a = t79Var;
        this.b = xk3Var;
        this.c = yl3Var;
        this.d = xl3Var;
    }

    private final void u(IOException iOException) {
        this.f = true;
        this.d.h().c(this.a, iOException);
    }

    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            u(e);
        }
        if (z2) {
            if (e != null) {
                this.b.s(this.a, e);
            } else {
                this.b.q(this.a, j);
            }
        }
        if (z) {
            if (e != null) {
                this.b.x(this.a, e);
            } else {
                this.b.v(this.a, j);
            }
        }
        return (E) this.a.v(this, z2, z, e);
    }

    public final void b() {
        this.d.cancel();
    }

    public final zma c(hi9 hi9Var, boolean z) throws IOException {
        z65.h(hi9Var, "request");
        this.e = z;
        ji9 a2 = hi9Var.a();
        z65.e(a2);
        long contentLength = a2.contentLength();
        this.b.r(this.a);
        return new a(this, this.d.d(hi9Var, contentLength), contentLength);
    }

    public final void d() {
        this.d.cancel();
        this.a.v(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.d.b();
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }

    public final void f() throws IOException {
        try {
            this.d.g();
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }

    public final t79 g() {
        return this.a;
    }

    public final u79 h() {
        u79 u79Var;
        xl3.a h = this.d.h();
        if (h instanceof u79) {
            u79Var = (u79) h;
        } else {
            u79Var = null;
        }
        if (u79Var != null) {
            return u79Var;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels".toString());
    }

    public final xk3 i() {
        return this.b;
    }

    public final yl3 j() {
        return this.c;
    }

    public final boolean k() {
        return this.f;
    }

    public final boolean l() {
        return !z65.c(this.c.b().b().l().k(), this.d.h().e().a().l().k());
    }

    public final boolean m() {
        return this.e;
    }

    public final z79.d n() throws SocketException {
        this.a.B();
        xl3.a h = this.d.h();
        z65.f(h, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        return ((u79) h).t(this);
    }

    public final void o() {
        this.d.h().b();
    }

    public final void p() {
        this.a.v(this, true, false, null);
    }

    public final kk9 q(ik9 ik9Var) throws IOException {
        z65.h(ik9Var, "response");
        try {
            String o = ik9.o(ik9Var, "Content-Type", null, 2, null);
            long c = this.d.c(ik9Var);
            return new x79(o, c, c77.c(new b(this, this.d.a(ik9Var), c)));
        } catch (IOException e) {
            this.b.x(this.a, e);
            u(e);
            throw e;
        }
    }

    public final ik9.a r(boolean z) throws IOException {
        try {
            ik9.a f = this.d.f(z);
            if (f != null) {
                f.k(this);
            }
            return f;
        } catch (IOException e) {
            this.b.x(this.a, e);
            u(e);
            throw e;
        }
    }

    public final void s(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        this.b.y(this.a, ik9Var);
    }

    public final void t() {
        this.b.z(this.a);
    }

    public final gn4 v() throws IOException {
        return this.d.i();
    }

    public final void w() {
        a(-1L, true, true, null);
    }

    public final void x(hi9 hi9Var) throws IOException {
        z65.h(hi9Var, "request");
        try {
            this.b.u(this.a);
            this.d.e(hi9Var);
            this.b.t(this.a, hi9Var);
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }
}
