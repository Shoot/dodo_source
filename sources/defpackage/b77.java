package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.util.FileSize;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cm0;
import defpackage.eu0;
import defpackage.xb8;
import defpackage.xk3;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OkHttpClient.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0002\b\u0015B\u0014\b\u0000\u0012\u0007\u0010\u0093\u0001\u001a\u00020\r¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0096\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8G¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148G¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010)\u001a\u00020$8G¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8G¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00102\u001a\u00020*8G¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0017\u00107\u001a\u0002038G¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106R\u0017\u0010:\u001a\u00020*8G¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010=\u001a\u00020*8G¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.R\u0017\u0010B\u001a\u00020>8G¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010G\u001a\u0004\u0018\u00010C8G¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b+\u0010FR\u0017\u0010L\u001a\u00020H8G¢\u0006\f\n\u0004\b@\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010Q\u001a\u0004\u0018\u00010M8G¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010V\u001a\u00020R8G¢\u0006\f\n\u0004\bJ\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010X\u001a\u0002038G¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\bW\u00106R\u0017\u0010]\u001a\u00020Y8G¢\u0006\f\n\u0004\b1\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u0004\u0018\u00010^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010_R\u0019\u0010e\u001a\u0004\u0018\u00010a8G¢\u0006\f\n\u0004\b<\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020f0\u001a8G¢\u0006\f\n\u0004\bg\u0010\u001d\u001a\u0004\bD\u0010\u001fR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020i0\u001a8G¢\u0006\f\n\u0004\bj\u0010\u001d\u001a\u0004\bk\u0010\u001fR\u0017\u0010q\u001a\u00020m8G¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bn\u0010pR\u0017\u0010u\u001a\u00020r8G¢\u0006\f\n\u0004\b\u001e\u0010s\u001a\u0004\b8\u0010tR\u0019\u0010z\u001a\u0004\u0018\u00010v8G¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\b4\u0010yR\u0017\u0010}\u001a\u00020{8G¢\u0006\f\n\u0004\b\"\u0010[\u001a\u0004\b0\u0010|R\u0017\u0010~\u001a\u00020{8G¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b;\u0010|R\u0018\u0010\u0080\u0001\u001a\u00020{8G¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\b\u007f\u0010|R\u001a\u0010\u0083\u0001\u001a\u00020{8G¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010[\u001a\u0005\b\u0082\u0001\u0010|R\u0019\u0010\u0084\u0001\u001a\u00020{8G¢\u0006\r\n\u0004\bk\u0010[\u001a\u0005\b\u0081\u0001\u0010|R\u001b\u0010\u0088\u0001\u001a\u00030\u0085\u00018G¢\u0006\u000e\n\u0005\bO\u0010\u0086\u0001\u001a\u0005\bw\u0010\u0087\u0001R\u001e\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bW\u0010\u008a\u0001\u001a\u0005\bg\u0010\u008b\u0001R\u001e\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bT\u0010\u008e\u0001\u001a\u0005\bj\u0010\u008f\u0001R\u0014\u0010\u0092\u0001\u001a\u00020^8G¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0091\u0001¨\u0006\u0097\u0001"}, d2 = {"Lb77;", "Lcm0$a;", "", "", "K", "Lhi9;", "request", "Lcm0;", "a", "Lu3c;", "listener", "Lo3c;", "A", "Lb77$a;", "z", "Lt33;", "Lt33;", "n", "()Lt33;", "dispatcher", "Lrq1;", "b", "Lrq1;", "k", "()Lrq1;", "connectionPool", "", "Lk65;", c.a, "Ljava/util/List;", "w", "()Ljava/util/List;", "interceptors", DateTokenConverter.CONVERTER_KEY, "y", "networkInterceptors", "Lxk3$c;", e.a, "Lxk3$c;", "p", "()Lxk3$c;", "eventListenerFactory", "", "f", "Z", "H", "()Z", "retryOnConnectionFailure", "g", "q", "fastFallback", "Lpz;", Image.TYPE_HIGH, "Lpz;", "()Lpz;", "authenticator", "i", "r", "followRedirects", "j", Image.TYPE_SMALL, "followSslRedirects", "Low1;", "Low1;", Image.TYPE_MEDIUM, "()Low1;", "cookieJar", "Lil0;", "l", "Lil0;", "()Lil0;", "cache", "Lf53;", "Lf53;", "o", "()Lf53;", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "D", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "F", "()Ljava/net/ProxySelector;", "proxySelector", "E", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "I", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "M", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lsq1;", "t", "connectionSpecs", "Lvr8;", "u", "C", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "v", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lgu0;", "Lgu0;", "()Lgu0;", "certificatePinner", "Leu0;", "x", "Leu0;", "()Leu0;", "certificateChainCleaner", "", "()I", "callTimeoutMillis", "connectTimeoutMillis", "G", "readTimeoutMillis", "B", "L", "writeTimeoutMillis", "pingIntervalMillis", "", "J", "()J", "minWebSocketMessageToCompress", "Lro9;", "Lro9;", "()Lro9;", "routeDatabase", "Lk7b;", "Lk7b;", "()Lk7b;", "taskRunner", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "builder", "<init>", "(Lb77$a;)V", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: b77  reason: default package */
/* loaded from: classes3.dex */
public class b77 implements cm0.a {
    public static final b G = new b(null);
    private static final List<vr8> H = cec.l(vr8.f, vr8.d);
    private static final List<sq1> I = cec.l(sq1.i, sq1.k);
    private final int A;
    private final int B;
    private final int C;
    private final long D;
    private final ro9 E;
    private final k7b F;
    private final t33 a;
    private final rq1 b;
    private final List<k65> c;
    private final List<k65> d;
    private final xk3.c e;
    private final boolean f;
    private final boolean g;
    private final pz h;
    private final boolean i;
    private final boolean j;
    private final ow1 k;
    private final il0 l;
    private final f53 m;
    private final Proxy n;
    private final ProxySelector o;
    private final pz p;
    private final SocketFactory q;
    private final SSLSocketFactory r;
    private final X509TrustManager s;
    private final List<sq1> t;
    private final List<vr8> u;
    private final HostnameVerifier v;
    private final gu0 w;
    private final eu0 x;
    private final int y;
    private final int z;

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lb77$b;", "", "", "Lvr8;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lsq1;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b77$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<sq1> a() {
            return b77.I;
        }

        public final List<vr8> b() {
            return b77.H;
        }
    }

    public b77(a aVar) {
        ProxySelector E;
        z65.h(aVar, "builder");
        this.a = aVar.q();
        this.b = aVar.n();
        this.c = cec.y(aVar.x());
        this.d = cec.y(aVar.z());
        this.e = aVar.s();
        this.f = aVar.G();
        this.g = aVar.t();
        this.h = aVar.h();
        this.i = aVar.u();
        this.j = aVar.v();
        this.k = aVar.p();
        this.l = aVar.i();
        this.m = aVar.r();
        this.n = aVar.C();
        if (aVar.C() != null) {
            E = r37.a;
        } else {
            E = aVar.E();
            E = E == null ? ProxySelector.getDefault() : E;
            if (E == null) {
                E = r37.a;
            }
        }
        this.o = E;
        this.p = aVar.D();
        this.q = aVar.I();
        List<sq1> o = aVar.o();
        this.t = o;
        this.u = aVar.B();
        this.v = aVar.w();
        this.y = aVar.j();
        this.z = aVar.m();
        this.A = aVar.F();
        this.B = aVar.L();
        this.C = aVar.A();
        this.D = aVar.y();
        ro9 H2 = aVar.H();
        this.E = H2 == null ? new ro9() : H2;
        k7b K = aVar.K();
        this.F = K == null ? k7b.m : K;
        List<sq1> list = o;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (sq1 sq1Var : list) {
                if (sq1Var.f()) {
                    if (aVar.J() != null) {
                        this.r = aVar.J();
                        eu0 k = aVar.k();
                        z65.e(k);
                        this.x = k;
                        X509TrustManager M = aVar.M();
                        z65.e(M);
                        this.s = M;
                        gu0 l = aVar.l();
                        z65.e(k);
                        this.w = l.e(k);
                    } else {
                        xb8.a aVar2 = xb8.a;
                        X509TrustManager p = aVar2.g().p();
                        this.s = p;
                        xb8 g = aVar2.g();
                        z65.e(p);
                        this.r = g.o(p);
                        eu0.a aVar3 = eu0.a;
                        z65.e(p);
                        eu0 a2 = aVar3.a(p);
                        this.x = a2;
                        gu0 l2 = aVar.l();
                        z65.e(a2);
                        this.w = l2.e(a2);
                    }
                    K();
                }
            }
        }
        this.r = null;
        this.x = null;
        this.s = null;
        this.w = gu0.d;
        K();
    }

    private final void K() {
        List<k65> list = this.c;
        z65.f(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            List<k65> list2 = this.d;
            z65.f(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<sq1> list3 = this.t;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (sq1 sq1Var : list3) {
                        if (sq1Var.f()) {
                            if (this.r != null) {
                                if (this.x != null) {
                                    if (this.s == null) {
                                        throw new IllegalStateException("x509TrustManager == null".toString());
                                    }
                                    return;
                                }
                                throw new IllegalStateException("certificateChainCleaner == null".toString());
                            }
                            throw new IllegalStateException("sslSocketFactory == null".toString());
                        }
                    }
                }
                if (this.r == null) {
                    if (this.x == null) {
                        if (this.s == null) {
                            if (z65.c(this.w, gu0.d)) {
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException(("Null network interceptor: " + this.d).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + this.c).toString());
    }

    public o3c A(hi9 hi9Var, u3c u3cVar) {
        z65.h(hi9Var, "request");
        z65.h(u3cVar, "listener");
        z79 z79Var = new z79(this.F, hi9Var, u3cVar, new Random(), this.C, null, this.D);
        z79Var.o(this);
        return z79Var;
    }

    public final int B() {
        return this.C;
    }

    public final List<vr8> C() {
        return this.u;
    }

    public final Proxy D() {
        return this.n;
    }

    public final pz E() {
        return this.p;
    }

    public final ProxySelector F() {
        return this.o;
    }

    public final int G() {
        return this.A;
    }

    public final boolean H() {
        return this.f;
    }

    public final SocketFactory I() {
        return this.q;
    }

    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.r;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int L() {
        return this.B;
    }

    public final X509TrustManager M() {
        return this.s;
    }

    @Override // defpackage.cm0.a
    public cm0 a(hi9 hi9Var) {
        z65.h(hi9Var, "request");
        return new t79(this, hi9Var, false);
    }

    public final pz e() {
        return this.h;
    }

    public final il0 f() {
        return this.l;
    }

    public final int g() {
        return this.y;
    }

    public final eu0 h() {
        return this.x;
    }

    public final gu0 i() {
        return this.w;
    }

    public final int j() {
        return this.z;
    }

    public final rq1 k() {
        return this.b;
    }

    public final List<sq1> l() {
        return this.t;
    }

    public final ow1 m() {
        return this.k;
    }

    public final t33 n() {
        return this.a;
    }

    public final f53 o() {
        return this.m;
    }

    public final xk3.c p() {
        return this.e;
    }

    public final boolean q() {
        return this.g;
    }

    public final boolean r() {
        return this.i;
    }

    public final boolean s() {
        return this.j;
    }

    public final ro9 t() {
        return this.E;
    }

    public final k7b u() {
        return this.F;
    }

    public final HostnameVerifier v() {
        return this.v;
    }

    public final List<k65> w() {
        return this.c;
    }

    public final long x() {
        return this.D;
    }

    public final List<k65> y() {
        return this.d;
    }

    public a z() {
        return new a(this);
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001B\u0014\b\u0010\u0012\u0007\u0010Õ\u0001\u001a\u00020*¢\u0006\u0006\bÓ\u0001\u0010Ö\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b)\u0010#J\u0006\u0010+\u001a\u00020*R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b<\u0010=R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b?\u0010=R\"\u0010G\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010Q\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\"\u0010X\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010K\"\u0004\b[\u0010MR\"\u0010`\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010I\u001a\u0004\b^\u0010K\"\u0004\b_\u0010MR\"\u0010h\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bY\u0010k\"\u0004\bl\u0010mR\"\u0010u\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010\u0085\u0001\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bd\u0010T\u001a\u0005\b\u0083\u0001\u0010U\"\u0005\b\u0084\u0001\u0010WR)\u0010\u008c\u0001\u001a\u00030\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bq\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bC\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bO\u0010;\u001a\u0004\b|\u0010=\"\u0006\b\u009a\u0001\u0010\u009b\u0001R+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bZ\u0010;\u001a\u0005\b\u009d\u0001\u0010=\"\u0006\b\u009e\u0001\u0010\u009b\u0001R'\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R)\u0010©\u0001\u001a\u00030¤\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¥\u0001\u001a\u0005\bi\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010¯\u0001\u001a\u0005\u0018\u00010ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b<\u0010«\u0001\u001a\u0005\bb\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R)\u0010µ\u0001\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010\u0088\u0001\u001a\u0005\b]\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R(\u0010·\u0001\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b?\u0010\u0088\u0001\u001a\u0005\bo\u0010²\u0001\"\u0006\b¶\u0001\u0010´\u0001R*\u0010»\u0001\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u0088\u0001\u001a\u0006\b¹\u0001\u0010²\u0001\"\u0006\bº\u0001\u0010´\u0001R*\u0010¾\u0001\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0088\u0001\u001a\u0006\b¼\u0001\u0010²\u0001\"\u0006\b½\u0001\u0010´\u0001R)\u0010À\u0001\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bw\u0010\u0088\u0001\u001a\u0006\b¸\u0001\u0010²\u0001\"\u0006\b¿\u0001\u0010´\u0001R)\u0010Ä\u0001\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u008e\u0001\u001a\u0006\b±\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R+\u0010Ë\u0001\u001a\u0005\u0018\u00010Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b~\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006×\u0001"}, d2 = {"Lb77$a;", "", "Lk65;", "interceptor", "a", "b", "Lxk3;", "eventListener", "g", "Lil0;", "cache", DateTokenConverter.CONVERTER_KEY, "Ljava/net/Proxy;", "proxy", "R", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "U", "", "Lvr8;", "protocols", "Q", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "N", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", e.a, "Lkotlin/time/a;", "duration", "f", "(J)Lb77$a;", "S", "T", "V", "interval", "O", "P", "Lb77;", c.a, "Lt33;", "Lt33;", "q", "()Lt33;", "setDispatcher$okhttp", "(Lt33;)V", "dispatcher", "Lrq1;", "Lrq1;", "n", "()Lrq1;", "setConnectionPool$okhttp", "(Lrq1;)V", "connectionPool", "", "Ljava/util/List;", "x", "()Ljava/util/List;", "interceptors", "z", "networkInterceptors", "Lxk3$c;", "Lxk3$c;", Image.TYPE_SMALL, "()Lxk3$c;", "setEventListenerFactory$okhttp", "(Lxk3$c;)V", "eventListenerFactory", "", "Z", "G", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "t", "setFastFallback$okhttp", "fastFallback", "Lpz;", Image.TYPE_HIGH, "Lpz;", "()Lpz;", "setAuthenticator$okhttp", "(Lpz;)V", "authenticator", "i", "u", "setFollowRedirects$okhttp", "followRedirects", "j", "v", "setFollowSslRedirects$okhttp", "followSslRedirects", "Low1;", "k", "Low1;", "p", "()Low1;", "setCookieJar$okhttp", "(Low1;)V", "cookieJar", "l", "Lil0;", "()Lil0;", "setCache$okhttp", "(Lil0;)V", "Lf53;", Image.TYPE_MEDIUM, "Lf53;", "r", "()Lf53;", "setDns$okhttp", "(Lf53;)V", "dns", "Ljava/net/Proxy;", "C", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "o", "Ljava/net/ProxySelector;", "E", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "D", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "I", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "J", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "M", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lsq1;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "B", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "w", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lgu0;", "Lgu0;", "()Lgu0;", "setCertificatePinner$okhttp", "(Lgu0;)V", "certificatePinner", "Leu0;", "Leu0;", "()Leu0;", "setCertificateChainCleaner$okhttp", "(Leu0;)V", "certificateChainCleaner", "", "y", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "A", "F", "setReadTimeout$okhttp", "readTimeout", "L", "setWriteTimeout$okhttp", "writeTimeout", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lro9;", "Lro9;", "H", "()Lro9;", "setRouteDatabase$okhttp", "(Lro9;)V", "routeDatabase", "Lk7b;", "Lk7b;", "K", "()Lk7b;", "setTaskRunner$okhttp", "(Lk7b;)V", "taskRunner", "<init>", "()V", "okHttpClient", "(Lb77;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b77$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private int A;
        private int B;
        private int C;
        private long D;
        private ro9 E;
        private k7b F;
        private t33 a;
        private rq1 b;
        private final List<k65> c;
        private final List<k65> d;
        private xk3.c e;
        private boolean f;
        private boolean g;
        private pz h;
        private boolean i;
        private boolean j;
        private ow1 k;
        private il0 l;
        private f53 m;
        private Proxy n;
        private ProxySelector o;
        private pz p;
        private SocketFactory q;
        private SSLSocketFactory r;
        private X509TrustManager s;
        private List<sq1> t;
        private List<? extends vr8> u;
        private HostnameVerifier v;
        private gu0 w;
        private eu0 x;
        private int y;
        private int z;

        public a() {
            this.a = new t33();
            this.b = new rq1();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = cec.c(xk3.b);
            this.f = true;
            this.g = true;
            pz pzVar = pz.b;
            this.h = pzVar;
            this.i = true;
            this.j = true;
            this.k = ow1.b;
            this.m = f53.b;
            this.p = pzVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            z65.g(socketFactory, "getDefault(...)");
            this.q = socketFactory;
            b bVar = b77.G;
            this.t = bVar.a();
            this.u = bVar.b();
            this.v = z67.a;
            this.w = gu0.d;
            this.z = 10000;
            this.A = 10000;
            this.B = 10000;
            this.D = FileSize.KB_COEFFICIENT;
        }

        public final int A() {
            return this.C;
        }

        public final List<vr8> B() {
            return this.u;
        }

        public final Proxy C() {
            return this.n;
        }

        public final pz D() {
            return this.p;
        }

        public final ProxySelector E() {
            return this.o;
        }

        public final int F() {
            return this.A;
        }

        public final boolean G() {
            return this.f;
        }

        public final ro9 H() {
            return this.E;
        }

        public final SocketFactory I() {
            return this.q;
        }

        public final SSLSocketFactory J() {
            return this.r;
        }

        public final k7b K() {
            return this.F;
        }

        public final int L() {
            return this.B;
        }

        public final X509TrustManager M() {
            return this.s;
        }

        public final a N(HostnameVerifier hostnameVerifier) {
            z65.h(hostnameVerifier, "hostnameVerifier");
            if (!z65.c(hostnameVerifier, this.v)) {
                this.E = null;
            }
            this.v = hostnameVerifier;
            return this;
        }

        public final a O(long j, TimeUnit timeUnit) {
            z65.h(timeUnit, "unit");
            this.C = cec.f("interval", j, timeUnit);
            return this;
        }

        public final a P(long j) {
            this.C = cec.g("duration", j);
            return this;
        }

        public final a Q(List<? extends vr8> list) {
            List I0;
            z65.h(list, "protocols");
            I0 = sc1.I0(list);
            vr8 vr8Var = vr8.g;
            if (!I0.contains(vr8Var) && !I0.contains(vr8.d)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + I0).toString());
            } else if (I0.contains(vr8Var) && I0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + I0).toString());
            } else if (!I0.contains(vr8.c)) {
                z65.f(I0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                if (true ^ I0.contains(null)) {
                    I0.remove(vr8.e);
                    if (!z65.c(I0, this.u)) {
                        this.E = null;
                    }
                    List<? extends vr8> unmodifiableList = Collections.unmodifiableList(I0);
                    z65.g(unmodifiableList, "unmodifiableList(...)");
                    this.u = unmodifiableList;
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null".toString());
            } else {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + I0).toString());
            }
        }

        public final a R(Proxy proxy) {
            if (!z65.c(proxy, this.n)) {
                this.E = null;
            }
            this.n = proxy;
            return this;
        }

        public final a S(long j, TimeUnit timeUnit) {
            z65.h(timeUnit, "unit");
            this.A = cec.f("timeout", j, timeUnit);
            return this;
        }

        public final a T(long j) {
            this.A = cec.g("duration", j);
            return this;
        }

        public final a U(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            z65.h(sSLSocketFactory, "sslSocketFactory");
            z65.h(x509TrustManager, "trustManager");
            if (!z65.c(sSLSocketFactory, this.r) || !z65.c(x509TrustManager, this.s)) {
                this.E = null;
            }
            this.r = sSLSocketFactory;
            this.x = eu0.a.a(x509TrustManager);
            this.s = x509TrustManager;
            return this;
        }

        public final a V(long j, TimeUnit timeUnit) {
            z65.h(timeUnit, "unit");
            this.B = cec.f("timeout", j, timeUnit);
            return this;
        }

        public final a a(k65 k65Var) {
            z65.h(k65Var, "interceptor");
            this.c.add(k65Var);
            return this;
        }

        public final a b(k65 k65Var) {
            z65.h(k65Var, "interceptor");
            this.d.add(k65Var);
            return this;
        }

        public final b77 c() {
            return new b77(this);
        }

        public final a d(il0 il0Var) {
            this.l = il0Var;
            return this;
        }

        public final a e(long j, TimeUnit timeUnit) {
            z65.h(timeUnit, "unit");
            this.z = cec.f("timeout", j, timeUnit);
            return this;
        }

        public final a f(long j) {
            this.z = cec.g("duration", j);
            return this;
        }

        public final a g(xk3 xk3Var) {
            z65.h(xk3Var, "eventListener");
            this.e = cec.c(xk3Var);
            return this;
        }

        public final pz h() {
            return this.h;
        }

        public final il0 i() {
            return this.l;
        }

        public final int j() {
            return this.y;
        }

        public final eu0 k() {
            return this.x;
        }

        public final gu0 l() {
            return this.w;
        }

        public final int m() {
            return this.z;
        }

        public final rq1 n() {
            return this.b;
        }

        public final List<sq1> o() {
            return this.t;
        }

        public final ow1 p() {
            return this.k;
        }

        public final t33 q() {
            return this.a;
        }

        public final f53 r() {
            return this.m;
        }

        public final xk3.c s() {
            return this.e;
        }

        public final boolean t() {
            return this.g;
        }

        public final boolean u() {
            return this.i;
        }

        public final boolean v() {
            return this.j;
        }

        public final HostnameVerifier w() {
            return this.v;
        }

        public final List<k65> x() {
            return this.c;
        }

        public final long y() {
            return this.D;
        }

        public final List<k65> z() {
            return this.d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b77 b77Var) {
            this();
            z65.h(b77Var, "okHttpClient");
            this.a = b77Var.n();
            this.b = b77Var.k();
            pc1.C(this.c, b77Var.w());
            pc1.C(this.d, b77Var.y());
            this.e = b77Var.p();
            this.f = b77Var.H();
            this.g = b77Var.q();
            this.h = b77Var.e();
            this.i = b77Var.r();
            this.j = b77Var.s();
            this.k = b77Var.m();
            this.l = b77Var.f();
            this.m = b77Var.o();
            this.n = b77Var.D();
            this.o = b77Var.F();
            this.p = b77Var.E();
            this.q = b77Var.I();
            this.r = b77Var.r;
            this.s = b77Var.M();
            this.t = b77Var.l();
            this.u = b77Var.C();
            this.v = b77Var.v();
            this.w = b77Var.i();
            this.x = b77Var.h();
            this.y = b77Var.g();
            this.z = b77Var.j();
            this.A = b77Var.G();
            this.B = b77Var.L();
            this.C = b77Var.B();
            this.D = b77Var.x();
            this.E = b77Var.t();
            this.F = b77Var.u();
        }
    }

    public b77() {
        this(new a());
    }
}
