package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq4;
import defpackage.qz3;
import defpackage.xl3;
import defpackage.z79;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
/* compiled from: RealConnection.kt */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@Bm\u0012\u0006\u0010G\u001a\u00020C\u0012\u0006\u0010L\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020\u0007\u0012\b\u0010Q\u001a\u0004\u0018\u00010)\u0012\b\u0010R\u001a\u0004\u0018\u00010)\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010V\u001a\u0004\u0018\u00010?\u0012\b\u0010Z\u001a\u0004\u0018\u00010W\u0012\b\u0010^\u001a\u0004\u0018\u00010[\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010g\u001a\u00020c¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0004J'\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u000e\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tJ\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016J\n\u00105\u001a\u0004\u0018\u00010\u000eH\u0016J'\u00109\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u000107H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020AH\u0016R\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010L\u001a\u00020H8\u0006¢\u0006\f\n\u0004\b4\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010M\u001a\u0004\b=\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010PR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bX\u0010fR\u0018\u0010i\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010hR\"\u0010n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010j\u001a\u0004\b`\u0010k\"\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010jR\"\u0010s\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010a\u001a\u0004\bd\u0010p\"\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010aR\u0016\u0010v\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010aR\u0016\u0010w\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010aR#\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0y0x8\u0006¢\u0006\f\n\u0004\b\u0012\u0010z\u001a\u0004\bT\u0010{R%\u0010\u0082\u0001\u001a\u00020}8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b'\u0010~\u001a\u0004\b\\\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0083\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010k¨\u0006\u0086\u0001"}, d2 = {"Lu79;", "Lbq4$d;", "Loq1;", "Lxl3$a;", "", "B", "", "Lqo9;", "candidates", "", "w", "Lsq4;", RemoteMessageConst.Notification.URL, "C", "Lkm4;", "handshake", "g", "b", "u", "()V", "o", "A", "Lx6;", "address", "routes", "p", "(Lx6;Ljava/util/List;)Z", "Lb77;", "client", "Lw79;", "chain", "Lxl3;", Image.TYPE_SMALL, "(Lb77;Lw79;)Lxl3;", "Lwl3;", "exchange", "Lz79$d;", "t", "(Lwl3;)Lz79$d;", "v", "cancel", "Ljava/net/Socket;", "z", "doExtensiveChecks", "q", "Leq4;", "stream", "f", "Lbq4;", "connection", "Lwfa;", "settings", DateTokenConverter.CONVERTER_KEY, "n", "failedRoute", "Ljava/io/IOException;", "failure", Image.TYPE_HIGH, "(Lb77;Lqo9;Ljava/io/IOException;)V", "Lt79;", "call", e.a, c.a, "Lvr8;", "a", "", "toString", "Lk7b;", "Lk7b;", "getTaskRunner", "()Lk7b;", "taskRunner", "Lv79;", "Lv79;", "getConnectionPool", "()Lv79;", "connectionPool", "Lqo9;", "()Lqo9;", "route", "Ljava/net/Socket;", "rawSocket", "socket", "Lkm4;", "i", "Lvr8;", "protocol", "Lfh0;", "j", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", "k", "Leh0;", "sink", "", "l", "I", "pingIntervalMillis", "Lqq1;", Image.TYPE_MEDIUM, "Lqq1;", "()Lqq1;", "connectionListener", "Lbq4;", "http2Connection", "Z", "()Z", "y", "(Z)V", "noNewExchanges", "noCoalescedConnections", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "r", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "x", "(J)V", "idleAtNs", "isMultiplexed", "<init>", "(Lk7b;Lv79;Lqo9;Ljava/net/Socket;Ljava/net/Socket;Lkm4;Lvr8;Lfh0;Leh0;ILqq1;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: u79  reason: default package */
/* loaded from: classes3.dex */
public final class u79 extends bq4.d implements oq1, xl3.a {
    public static final a w = new a(null);
    private final k7b c;
    private final v79 d;
    private final qo9 e;
    private Socket f;
    private Socket g;
    private km4 h;
    private vr8 i;
    private fh0 j;
    private eh0 k;
    private final int l;
    private final qq1 m;
    private bq4 n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final List<Reference<t79>> u;
    private long v;

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lu79$a;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u79$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"u79$b", "Lz79$d;", "", "close", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u79$b */
    /* loaded from: classes3.dex */
    public static final class b extends z79.d {
        final /* synthetic */ wl3 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fh0 fh0Var, eh0 eh0Var, wl3 wl3Var) {
            super(true, fh0Var, eh0Var);
            this.d = wl3Var;
        }

        @Override // defpackage.z79.d
        public void a() {
            this.d.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.d.a(-1L, true, true, null);
        }
    }

    public u79(k7b k7bVar, v79 v79Var, qo9 qo9Var, Socket socket, Socket socket2, km4 km4Var, vr8 vr8Var, fh0 fh0Var, eh0 eh0Var, int i, qq1 qq1Var) {
        z65.h(k7bVar, "taskRunner");
        z65.h(v79Var, "connectionPool");
        z65.h(qo9Var, "route");
        z65.h(qq1Var, "connectionListener");
        this.c = k7bVar;
        this.d = v79Var;
        this.e = qo9Var;
        this.f = socket;
        this.g = socket2;
        this.h = km4Var;
        this.i = vr8Var;
        this.j = fh0Var;
        this.k = eh0Var;
        this.l = i;
        this.m = qq1Var;
        this.t = 1;
        this.u = new ArrayList();
        this.v = Long.MAX_VALUE;
    }

    private final void B() throws IOException {
        qz3 qz3Var;
        Socket socket = this.g;
        z65.e(socket);
        fh0 fh0Var = this.j;
        z65.e(fh0Var);
        eh0 eh0Var = this.k;
        z65.e(eh0Var);
        socket.setSoTimeout(0);
        qq1 qq1Var = this.m;
        if (qq1Var instanceof qz3) {
            qz3Var = (qz3) qq1Var;
        } else {
            qz3Var = null;
        }
        if (qz3Var == null) {
            qz3Var = qz3.a.a;
        }
        bq4 a2 = new bq4.b(true, this.c).s(socket, e().a().l().k(), fh0Var, eh0Var).m(this).n(this.l).b(qz3Var).a();
        this.n = a2;
        this.t = bq4.I.a().d();
        bq4.N0(a2, false, 1, null);
    }

    private final boolean C(sq4 sq4Var) {
        km4 km4Var;
        if (cec.e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        sq4 l = e().a().l();
        if (sq4Var.r() != l.r()) {
            return false;
        }
        if (z65.c(sq4Var.k(), l.k())) {
            return true;
        }
        if (this.p || (km4Var = this.h) == null) {
            return false;
        }
        z65.e(km4Var);
        if (!g(sq4Var, km4Var)) {
            return false;
        }
        return true;
    }

    private final boolean g(sq4 sq4Var, km4 km4Var) {
        List<Certificate> d = km4Var.d();
        if (!d.isEmpty()) {
            z67 z67Var = z67.a;
            String k = sq4Var.k();
            Certificate certificate = d.get(0);
            z65.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (z67Var.e(k, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(List<qo9> list) {
        List<qo9> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (qo9 qo9Var : list2) {
            Proxy.Type type = qo9Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && e().b().type() == type2 && z65.c(e().d(), qo9Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final void A() throws IOException {
        this.v = System.nanoTime();
        vr8 vr8Var = this.i;
        if (vr8Var == vr8.f || vr8Var == vr8.g) {
            B();
        }
    }

    @Override // defpackage.oq1
    public vr8 a() {
        vr8 vr8Var = this.i;
        z65.e(vr8Var);
        return vr8Var;
    }

    @Override // defpackage.xl3.a
    public void b() {
        synchronized (this) {
            this.o = true;
            Unit unit = Unit.a;
        }
        this.m.h(this);
    }

    @Override // defpackage.xl3.a
    public void c(t79 t79Var, IOException iOException) {
        boolean z;
        z65.h(t79Var, "call");
        synchronized (this) {
            try {
                z = false;
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).a == fk3.j) {
                        int i = this.s + 1;
                        this.s = i;
                        if (i > 1) {
                            z = !this.o;
                            this.o = true;
                            this.q++;
                        }
                    } else if (((StreamResetException) iOException).a != fk3.k || !t79Var.isCanceled()) {
                        z = !this.o;
                        this.o = true;
                        this.q++;
                    }
                } else if (!r() || (iOException instanceof ConnectionShutdownException)) {
                    z = !this.o;
                    this.o = true;
                    if (this.r == 0) {
                        if (iOException != null) {
                            h(t79Var.l(), e(), iOException);
                        }
                        this.q++;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.m.h(this);
        }
    }

    @Override // defpackage.xl3.a
    public void cancel() {
        Socket socket = this.f;
        if (socket != null) {
            cec.h(socket);
        }
    }

    @Override // defpackage.bq4.d
    public synchronized void d(bq4 bq4Var, wfa wfaVar) {
        z65.h(bq4Var, "connection");
        z65.h(wfaVar, "settings");
        this.t = wfaVar.d();
    }

    @Override // defpackage.xl3.a
    public qo9 e() {
        return this.e;
    }

    @Override // defpackage.bq4.d
    public void f(eq4 eq4Var) throws IOException {
        z65.h(eq4Var, "stream");
        eq4Var.e(fk3.j, null);
    }

    public final void h(b77 b77Var, qo9 qo9Var, IOException iOException) {
        z65.h(b77Var, "client");
        z65.h(qo9Var, "failedRoute");
        z65.h(iOException, "failure");
        if (qo9Var.b().type() != Proxy.Type.DIRECT) {
            x6 a2 = qo9Var.a();
            a2.i().connectFailed(a2.l().x(), qo9Var.b().address(), iOException);
        }
        b77Var.t().b(qo9Var);
    }

    public final List<Reference<t79>> i() {
        return this.u;
    }

    public final qq1 j() {
        return this.m;
    }

    public final long k() {
        return this.v;
    }

    public final boolean l() {
        return this.o;
    }

    public final int m() {
        return this.q;
    }

    public km4 n() {
        return this.h;
    }

    public final synchronized void o() {
        this.r++;
    }

    public final boolean p(x6 x6Var, List<qo9> list) {
        z65.h(x6Var, "address");
        if (cec.e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.u.size() >= this.t || this.o || !e().a().d(x6Var)) {
            return false;
        } else {
            if (z65.c(x6Var.l().k(), v().a().l().k())) {
                return true;
            }
            if (this.n == null || list == null || !w(list) || x6Var.e() != z67.a || !C(x6Var.l())) {
                return false;
            }
            try {
                gu0 a2 = x6Var.a();
                z65.e(a2);
                String k = x6Var.l().k();
                km4 n = n();
                z65.e(n);
                a2.a(k, n.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean q(boolean z) {
        long j;
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f;
        z65.e(socket);
        Socket socket2 = this.g;
        z65.e(socket2);
        fh0 fh0Var = this.j;
        z65.e(fh0Var);
        if (!socket.isClosed() && !socket2.isClosed() && !socket2.isInputShutdown() && !socket2.isOutputShutdown()) {
            bq4 bq4Var = this.n;
            if (bq4Var != null) {
                return bq4Var.l0(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.v;
            }
            if (j >= 10000000000L && z) {
                return cec.m(socket2, fh0Var);
            }
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    public final xl3 s(b77 b77Var, w79 w79Var) throws SocketException {
        z65.h(b77Var, "client");
        z65.h(w79Var, "chain");
        Socket socket = this.g;
        z65.e(socket);
        fh0 fh0Var = this.j;
        z65.e(fh0Var);
        eh0 eh0Var = this.k;
        z65.e(eh0Var);
        bq4 bq4Var = this.n;
        if (bq4Var != null) {
            return new cq4(b77Var, this, w79Var, bq4Var);
        }
        socket.setSoTimeout(w79Var.a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fh0Var.timeout().g(w79Var.i(), timeUnit);
        eh0Var.timeout().g(w79Var.k(), timeUnit);
        return new zp4(b77Var, this, fh0Var, eh0Var);
    }

    public final z79.d t(wl3 wl3Var) throws SocketException {
        z65.h(wl3Var, "exchange");
        Socket socket = this.g;
        z65.e(socket);
        fh0 fh0Var = this.j;
        z65.e(fh0Var);
        eh0 eh0Var = this.k;
        z65.e(eh0Var);
        socket.setSoTimeout(0);
        b();
        return new b(fh0Var, eh0Var, wl3Var);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(e().a().l().k());
        sb.append(CoreConstants.COLON_CHAR);
        sb.append(e().a().l().r());
        sb.append(", proxy=");
        sb.append(e().b());
        sb.append(" hostAddress=");
        sb.append(e().d());
        sb.append(" cipherSuite=");
        km4 km4Var = this.h;
        sb.append((km4Var == null || (r1 = km4Var.a()) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.i);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public final synchronized void u() {
        this.p = true;
    }

    public qo9 v() {
        return e();
    }

    public final void x(long j) {
        this.v = j;
    }

    public final void y(boolean z) {
        this.o = z;
    }

    public Socket z() {
        Socket socket = this.g;
        z65.e(socket);
        return socket;
    }
}
