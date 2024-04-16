package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ik9;
import defpackage.k65;
import defpackage.km4;
import defpackage.vo9;
import defpackage.xl3;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConnectPlan.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001\u001eBi\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00105\u001a\u000202\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010F\u001a\u00020B¢\u0006\u0004\be\u0010fJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u0001H\u0016J\u0006\u0010'\u001a\u00020\u000bR\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100R\u001a\u00105\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00103\u001a\u0004\b\"\u00104R\"\u00109\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010;\u001a\u0004\b=\u0010>R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010F\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010?R\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010S\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010M\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010A¨\u0006h"}, d2 = {"Lmq1;", "Lvo9$b;", "Lxl3$a;", "", "attempt", "Lhi9;", "tunnelRequest", "connectionSpecIndex", "", "isTlsFallback", Image.TYPE_MEDIUM, "", "j", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lsq1;", "connectionSpec", "k", "o", "Lvo9$a;", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "l", "()Lvo9$a;", "", "connectionSpecs", "r", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmq1;", "q", "Lu79;", "a", "Lt79;", "call", "Ljava/io/IOException;", e.a, com.huawei.hms.opendevice.c.a, "b", "cancel", "f", "i", "Lb77;", "Lb77;", "client", "Lt79;", "Lk65$a;", "Lk65$a;", "chain", "Ly79;", "Ly79;", "routePlanner", "Lqo9;", "Lqo9;", "()Lqo9;", "route", "Ljava/util/List;", "p", "()Ljava/util/List;", "routes", "g", "I", "Lhi9;", "getConnectionSpecIndex$okhttp", "()I", "Z", "isTlsFallback$okhttp", "()Z", "Lqq1;", "Lqq1;", "getConnectionListener$okhttp", "()Lqq1;", "connectionListener", "Lxk3;", "Lxk3;", "eventListener", "canceled", "Ljava/net/Socket;", "n", "Ljava/net/Socket;", "rawSocket", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "socket", "Lkm4;", "Lkm4;", "handshake", "Lvr8;", "Lvr8;", "protocol", "Lfh0;", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", Image.TYPE_SMALL, "Leh0;", "sink", "t", "Lu79;", "connection", "isReady", "<init>", "(Lb77;Lt79;Lk65$a;Ly79;Lqo9;Ljava/util/List;ILhi9;IZLqq1;)V", "u", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: mq1  reason: default package */
/* loaded from: classes3.dex */
public final class mq1 implements vo9.b, xl3.a {
    public static final a u = new a(null);
    private final b77 a;
    private final t79 b;
    private final k65.a c;
    private final y79 d;
    private final qo9 e;
    private final List<qo9> f;
    private final int g;
    private final hi9 h;
    private final int i;
    private final boolean j;
    private final qq1 k;
    private final xk3 l;
    private volatile boolean m;
    private Socket n;
    private Socket o;
    private km4 p;
    private vr8 q;
    private fh0 r;
    private eh0 s;
    private u79 t;

    /* compiled from: ConnectPlan.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lmq1$a;", "", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mq1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ConnectPlan.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConnectPlan.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq1$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function0<List<? extends X509Certificate>> {
        final /* synthetic */ km4 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(km4 km4Var) {
            super(0);
            this.a = km4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            int w;
            List<Certificate> d = this.a.d();
            w = lc1.w(d, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Certificate certificate : d) {
                z65.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConnectPlan.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq1$d */
    /* loaded from: classes3.dex */
    public static final class d extends ej5 implements Function0<List<? extends Certificate>> {
        final /* synthetic */ gu0 a;
        final /* synthetic */ km4 b;
        final /* synthetic */ x6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gu0 gu0Var, km4 km4Var, x6 x6Var) {
            super(0);
            this.a = gu0Var;
            this.b = km4Var;
            this.c = x6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            eu0 d = this.a.d();
            z65.e(d);
            return d.a(this.b.d(), this.c.l().k());
        }
    }

    public mq1(b77 b77Var, t79 t79Var, k65.a aVar, y79 y79Var, qo9 qo9Var, List<qo9> list, int i, hi9 hi9Var, int i2, boolean z, qq1 qq1Var) {
        z65.h(b77Var, "client");
        z65.h(t79Var, "call");
        z65.h(aVar, "chain");
        z65.h(y79Var, "routePlanner");
        z65.h(qo9Var, "route");
        z65.h(qq1Var, "connectionListener");
        this.a = b77Var;
        this.b = t79Var;
        this.c = aVar;
        this.d = y79Var;
        this.e = qo9Var;
        this.f = list;
        this.g = i;
        this.h = hi9Var;
        this.i = i2;
        this.j = z;
        this.k = qq1Var;
        this.l = t79Var.n();
    }

    private final void j() throws IOException {
        int i;
        Socket createSocket;
        Proxy.Type type = e().b().type();
        if (type == null) {
            i = -1;
        } else {
            i = b.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1 && i != 2) {
            createSocket = new Socket(e().b());
        } else {
            createSocket = e().a().j().createSocket();
            z65.e(createSocket);
        }
        this.n = createSocket;
        if (!this.m) {
            createSocket.setSoTimeout(this.c.a());
            try {
                xb8.a.g().f(createSocket, e().d(), this.c.d());
                try {
                    this.r = c77.c(c77.k(createSocket));
                    this.s = c77.b(c77.g(createSocket));
                    return;
                } catch (NullPointerException e) {
                    if (!z65.c(e.getMessage(), "throw with null exception")) {
                        return;
                    }
                    throw new IOException(e);
                }
            } catch (ConnectException e2) {
                ConnectException connectException = new ConnectException("Failed to connect to " + e().d());
                connectException.initCause(e2);
                throw connectException;
            }
        }
        throw new IOException("canceled");
    }

    private final void k(SSLSocket sSLSocket, sq1 sq1Var) throws IOException {
        vr8 vr8Var;
        String h;
        x6 a2 = e().a();
        try {
            if (sq1Var.h()) {
                xb8.a.g().e(sSLSocket, a2.l().k(), a2.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            km4.a aVar = km4.e;
            z65.e(session);
            km4 b2 = aVar.b(session);
            HostnameVerifier e = a2.e();
            z65.e(e);
            boolean verify = e.verify(a2.l().k(), session);
            String str = null;
            if (!verify) {
                List<Certificate> d2 = b2.d();
                if (!d2.isEmpty()) {
                    Certificate certificate = d2.get(0);
                    z65.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    h = e0b.h("\n            |Hostname " + a2.l().k() + " not verified:\n            |    certificate: " + gu0.c.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + z67.a.a(x509Certificate) + "\n            ", null, 1, null);
                    throw new SSLPeerUnverifiedException(h);
                }
                throw new SSLPeerUnverifiedException("Hostname " + a2.l().k() + " not verified (no certificates)");
            }
            gu0 a3 = a2.a();
            z65.e(a3);
            km4 km4Var = new km4(b2.e(), b2.a(), b2.c(), new d(a3, b2, a2));
            this.p = km4Var;
            a3.b(a2.l().k(), new c(km4Var));
            if (sq1Var.h()) {
                str = xb8.a.g().h(sSLSocket);
            }
            this.o = sSLSocket;
            this.r = c77.c(c77.k(sSLSocket));
            this.s = c77.b(c77.g(sSLSocket));
            if (str != null) {
                vr8Var = vr8.b.a(str);
            } else {
                vr8Var = vr8.d;
            }
            this.q = vr8Var;
            xb8.a.g().b(sSLSocket);
        } catch (Throwable th) {
            xb8.a.g().b(sSLSocket);
            cec.h(sSLSocket);
            throw th;
        }
    }

    private final mq1 m(int i, hi9 hi9Var, int i2, boolean z) {
        return new mq1(this.a, this.b, this.c, this.d, e(), this.f, i, hi9Var, i2, z, this.k);
    }

    static /* synthetic */ mq1 n(mq1 mq1Var, int i, hi9 hi9Var, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mq1Var.g;
        }
        if ((i3 & 2) != 0) {
            hi9Var = mq1Var.h;
        }
        if ((i3 & 4) != 0) {
            i2 = mq1Var.i;
        }
        if ((i3 & 8) != 0) {
            z = mq1Var.j;
        }
        return mq1Var.m(i, hi9Var, i2, z);
    }

    private final hi9 o() throws IOException {
        boolean v;
        hi9 hi9Var = this.h;
        z65.e(hi9Var);
        sq4 l = e().a().l();
        String str = "CONNECT " + cec.w(l, true) + " HTTP/1.1";
        while (true) {
            fh0 fh0Var = this.r;
            z65.e(fh0Var);
            eh0 eh0Var = this.s;
            z65.e(eh0Var);
            zp4 zp4Var = new zp4(null, this, fh0Var, eh0Var);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fh0Var.timeout().g(this.a.G(), timeUnit);
            eh0Var.timeout().g(this.a.L(), timeUnit);
            zp4Var.B(hi9Var.e(), str);
            zp4Var.b();
            ik9.a f = zp4Var.f(false);
            z65.e(f);
            ik9 c2 = f.r(hi9Var).c();
            zp4Var.A(c2);
            int j = c2.j();
            if (j == 200) {
                return null;
            }
            if (j == 407) {
                hi9 a2 = e().a().h().a(e(), c2);
                if (a2 != null) {
                    v = l0b.v("close", ik9.o(c2, "Connection", null, 2, null), true);
                    if (v) {
                        return a2;
                    }
                    hi9Var = a2;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + c2.j());
            }
        }
    }

    @Override // defpackage.vo9.b
    public u79 a() {
        this.b.l().t().a(e());
        u79 u79Var = this.t;
        z65.e(u79Var);
        this.k.b(u79Var, e(), this.b);
        cm9 k = this.d.k(this, this.f);
        if (k != null) {
            return k.i();
        }
        synchronized (u79Var) {
            this.a.k().b().f(u79Var);
            this.b.d(u79Var);
            Unit unit = Unit.a;
        }
        this.l.k(this.b, u79Var);
        u79Var.j().e(u79Var, this.b);
        return u79Var;
    }

    @Override // defpackage.xl3.a
    public void c(t79 t79Var, IOException iOException) {
        z65.h(t79Var, "call");
    }

    @Override // defpackage.vo9.b
    public void cancel() {
        this.m = true;
        Socket socket = this.n;
        if (socket != null) {
            cec.h(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:55:0x0174, B:64:0x0193, B:66:0x01bf, B:70:0x01c7), top: B:95:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    @Override // defpackage.vo9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.vo9.a d() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq1.d():vo9$a");
    }

    @Override // defpackage.xl3.a
    public qo9 e() {
        return this.e;
    }

    @Override // defpackage.vo9.b
    public vo9.b f() {
        return new mq1(this.a, this.b, this.c, this.d, e(), this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.vo9.b
    public boolean g() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vo9.b
    public vo9.a h() {
        Socket socket;
        Socket socket2;
        if (this.n == null) {
            this.b.r().add(this);
            boolean z = false;
            try {
                try {
                    this.l.j(this.b, e().d(), e().b());
                    this.k.d(e(), this.b);
                    j();
                    z = true;
                    vo9.a aVar = new vo9.a(this, null, null, 6, null);
                    this.b.r().remove(this);
                    return aVar;
                } catch (IOException e) {
                    this.l.i(this.b, e().d(), e().b(), null, e);
                    this.k.c(e(), this.b, e);
                    vo9.a aVar2 = new vo9.a(this, null, e, 2, null);
                    this.b.r().remove(this);
                    if (!z && (socket = this.n) != null) {
                        cec.h(socket);
                    }
                    return aVar2;
                }
            } catch (Throwable th) {
                this.b.r().remove(this);
                if (!z && (socket2 = this.n) != null) {
                    cec.h(socket2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("TCP already connected".toString());
    }

    public final void i() {
        Socket socket = this.o;
        if (socket != null) {
            cec.h(socket);
        }
    }

    public final vo9.a l() throws IOException {
        hi9 o = o();
        if (o == null) {
            return new vo9.a(this, null, null, 6, null);
        }
        Socket socket = this.n;
        if (socket != null) {
            cec.h(socket);
        }
        int i = this.g + 1;
        if (i < 21) {
            this.l.h(this.b, e().d(), e().b(), null);
            return new vo9.a(this, n(this, i, o, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.l.i(this.b, e().d(), e().b(), null, protocolException);
        this.k.c(e(), this.b, protocolException);
        return new vo9.a(this, null, protocolException, 2, null);
    }

    public final List<qo9> p() {
        return this.f;
    }

    public final mq1 q(List<sq1> list, SSLSocket sSLSocket) {
        boolean z;
        z65.h(list, "connectionSpecs");
        z65.h(sSLSocket, "sslSocket");
        int size = list.size();
        for (int i = this.i + 1; i < size; i++) {
            if (list.get(i).e(sSLSocket)) {
                if (this.i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return n(this, 0, null, i, z, 3, null);
            }
        }
        return null;
    }

    public final mq1 r(List<sq1> list, SSLSocket sSLSocket) throws IOException {
        z65.h(list, "connectionSpecs");
        z65.h(sSLSocket, "sslSocket");
        if (this.i != -1) {
            return this;
        }
        mq1 q = q(list, sSLSocket);
        if (q != null) {
            return q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.j);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        z65.e(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        z65.g(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.xl3.a
    public void b() {
    }
}
