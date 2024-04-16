package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import defpackage.hi9;
import defpackage.ik9;
import defpackage.k65;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.ConnectionShutdownException;
/* compiled from: RetryAndFollowUpInterceptor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001f"}, d2 = {"Lxl9;", "Lk65;", "Ljava/io/IOException;", e.a, "Lt79;", "call", "Lhi9;", "userRequest", "", "requestSendStarted", DateTokenConverter.CONVERTER_KEY, c.a, "Lik9;", "userResponse", "Lwl3;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lk65$a;", "chain", "intercept", "Lb77;", "Lb77;", "client", "<init>", "(Lb77;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xl9  reason: default package */
/* loaded from: classes3.dex */
public final class xl9 implements k65 {
    public static final a b = new a(null);
    private final b77 a;

    /* compiled from: RetryAndFollowUpInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxl9$a;", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xl9(b77 b77Var) {
        z65.h(b77Var, "client");
        this.a = b77Var;
    }

    private final hi9 a(ik9 ik9Var, String str) {
        String o;
        sq4 v;
        boolean z;
        ji9 ji9Var = null;
        if (!this.a.r() || (o = ik9.o(ik9Var, "Location", null, 2, null)) == null || (v = ik9Var.K().l().v(o)) == null) {
            return null;
        }
        if (!z65.c(v.w(), ik9Var.K().l().w()) && !this.a.s()) {
            return null;
        }
        hi9.a i = ik9Var.K().i();
        if (nq4.b(str)) {
            int j = ik9Var.j();
            nq4 nq4Var = nq4.a;
            if (!nq4Var.d(str) && j != 308 && j != 307) {
                z = false;
            } else {
                z = true;
            }
            if (nq4Var.c(str) && j != 308 && j != 307) {
                i.l(NetworkHandler.GET, null);
            } else {
                if (z) {
                    ji9Var = ik9Var.K().a();
                }
                i.l(str, ji9Var);
            }
            if (!z) {
                i.n("Transfer-Encoding");
                i.n("Content-Length");
                i.n("Content-Type");
            }
        }
        if (!cec.e(ik9Var.K().l(), v)) {
            i.n("Authorization");
        }
        return i.t(v).b();
    }

    private final hi9 b(ik9 ik9Var, wl3 wl3Var) throws IOException {
        qo9 qo9Var;
        u79 h;
        if (wl3Var != null && (h = wl3Var.h()) != null) {
            qo9Var = h.v();
        } else {
            qo9Var = null;
        }
        int j = ik9Var.j();
        String h2 = ik9Var.K().h();
        if (j != 307 && j != 308) {
            if (j != 401) {
                if (j != 421) {
                    if (j != 503) {
                        if (j != 407) {
                            if (j != 408) {
                                switch (j) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.a.H()) {
                                return null;
                            } else {
                                ji9 a2 = ik9Var.K().a();
                                if (a2 != null && a2.isOneShot()) {
                                    return null;
                                }
                                ik9 y = ik9Var.y();
                                if ((y != null && y.j() == 408) || f(ik9Var, 0) > 0) {
                                    return null;
                                }
                                return ik9Var.K();
                            }
                        } else {
                            z65.e(qo9Var);
                            if (qo9Var.b().type() == Proxy.Type.HTTP) {
                                return this.a.E().a(qo9Var, ik9Var);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        ik9 y2 = ik9Var.y();
                        if ((y2 != null && y2.j() == 503) || f(ik9Var, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return ik9Var.K();
                    }
                } else {
                    ji9 a3 = ik9Var.K().a();
                    if ((a3 != null && a3.isOneShot()) || wl3Var == null || !wl3Var.l()) {
                        return null;
                    }
                    wl3Var.h().u();
                    return ik9Var.K();
                }
            } else {
                return this.a.e().a(qo9Var, ik9Var);
            }
        }
        return a(ik9Var, h2);
    }

    private final boolean c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean d(IOException iOException, t79 t79Var, hi9 hi9Var, boolean z) {
        if (!this.a.H()) {
            return false;
        }
        if ((z && e(iOException, hi9Var)) || !c(iOException, z) || !t79Var.A()) {
            return false;
        }
        return true;
    }

    private final boolean e(IOException iOException, hi9 hi9Var) {
        ji9 a2 = hi9Var.a();
        if ((a2 != null && a2.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int f(ik9 ik9Var, int i) {
        String o = ik9.o(ik9Var, "Retry-After", null, 2, null);
        if (o == null) {
            return i;
        }
        if (new ec9("\\d+").f(o)) {
            Integer valueOf = Integer.valueOf(o);
            z65.g(valueOf, "valueOf(...)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        List l;
        ik9 ik9Var;
        wl3 p;
        hi9 b2;
        z65.h(aVar, "chain");
        w79 w79Var = (w79) aVar;
        hi9 j = w79Var.j();
        t79 g = w79Var.g();
        l = kc1.l();
        ik9 ik9Var2 = null;
        boolean z = true;
        int i = 0;
        while (true) {
            g.i(j, z, w79Var);
            try {
                if (!g.isCanceled()) {
                    try {
                        ik9.a r = w79Var.b(j).u().r(j);
                        if (ik9Var2 != null) {
                            ik9Var = ydc.v(ik9Var2);
                        } else {
                            ik9Var = null;
                        }
                        ik9Var2 = r.n(ik9Var).c();
                        p = g.p();
                        b2 = b(ik9Var2, p);
                    } catch (IOException e) {
                        if (d(e, g, j, !(e instanceof ConnectionShutdownException))) {
                            l = sc1.r0(l, e);
                            g.j(true);
                            z = false;
                        } else {
                            throw zdc.K(e, l);
                        }
                    }
                    if (b2 == null) {
                        if (p != null && p.m()) {
                            g.B();
                        }
                        g.j(false);
                        return ik9Var2;
                    }
                    ji9 a2 = b2.a();
                    if (a2 != null && a2.isOneShot()) {
                        g.j(false);
                        return ik9Var2;
                    }
                    zdc.f(ik9Var2.b());
                    i++;
                    if (i <= 20) {
                        g.j(true);
                        j = b2;
                        z = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th) {
                g.j(true);
                throw th;
            }
        }
    }
}
