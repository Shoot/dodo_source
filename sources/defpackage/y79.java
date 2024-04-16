package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hi9;
import defpackage.ik9;
import defpackage.vo9;
import defpackage.wo9;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RealRoutePlanner.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b>\u0010?J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J/\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u00100\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b&\u0010<¨\u0006@"}, d2 = {"Ly79;", "Lvo9;", "Lcm9;", "j", "Lmq1;", "g", "Lqo9;", "route", "Lhi9;", "f", "Lu79;", "connection", Image.TYPE_MEDIUM, "", "isCanceled", "Lvo9$b;", DateTokenConverter.CONVERTER_KEY, "planToReplace", "", "routes", "k", "(Lmq1;Ljava/util/List;)Lcm9;", Image.TYPE_HIGH, "(Lqo9;Ljava/util/List;)Lmq1;", "failedConnection", "a", "Lsq4;", RemoteMessageConst.Notification.URL, e.a, "Lb77;", "Lb77;", "client", "Lx6;", "b", "Lx6;", "()Lx6;", "address", "Lt79;", c.a, "Lt79;", "call", "Lw79;", "Lw79;", "chain", "Lqq1;", "Lqq1;", "connectionListener", "Z", "doExtensiveHealthChecks", "Lwo9$b;", "Lwo9$b;", "routeSelection", "Lwo9;", "Lwo9;", "routeSelector", "i", "Lqo9;", "nextRouteToTry", "Lgr;", "Lgr;", "()Lgr;", "deferredPlans", "<init>", "(Lb77;Lx6;Lt79;Lw79;Lqq1;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: y79  reason: default package */
/* loaded from: classes3.dex */
public final class y79 implements vo9 {
    private final b77 a;
    private final x6 b;
    private final t79 c;
    private final w79 d;
    private final qq1 e;
    private final boolean f;
    private wo9.b g;
    private wo9 h;
    private qo9 i;
    private final gr<vo9.b> j;

    public y79(b77 b77Var, x6 x6Var, t79 t79Var, w79 w79Var, qq1 qq1Var) {
        z65.h(b77Var, "client");
        z65.h(x6Var, "address");
        z65.h(t79Var, "call");
        z65.h(w79Var, "chain");
        z65.h(qq1Var, "connectionListener");
        this.a = b77Var;
        this.b = x6Var;
        this.c = t79Var;
        this.d = w79Var;
        this.e = qq1Var;
        this.f = !z65.c(w79Var.j().h(), NetworkHandler.GET);
        this.j = new gr<>();
    }

    private final hi9 f(qo9 qo9Var) throws IOException {
        hi9 b = new hi9.a().t(qo9Var.a().l()).l("CONNECT", null).j("Host", cec.w(qo9Var.a().l(), true)).j("Proxy-Connection", "Keep-Alive").j("User-Agent", "okhttp/5.0.0-alpha.12").b();
        hi9 a = qo9Var.a().h().a(qo9Var, new ik9.a().r(b).o(vr8.d).e(407).l("Preemptive Authenticate").s(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        if (a != null) {
            return a;
        }
        return b;
    }

    private final mq1 g() throws IOException {
        qo9 qo9Var = this.i;
        if (qo9Var != null) {
            this.i = null;
            return i(this, qo9Var, null, 2, null);
        }
        wo9.b bVar = this.g;
        if (bVar != null && bVar.b()) {
            return i(this, bVar.c(), null, 2, null);
        }
        wo9 wo9Var = this.h;
        if (wo9Var == null) {
            wo9Var = new wo9(b(), this.c.l().t(), this.c, this.a.q(), this.c.n());
            this.h = wo9Var;
        }
        if (wo9Var.a()) {
            wo9.b c = wo9Var.c();
            this.g = c;
            if (!this.c.isCanceled()) {
                return h(c.c(), c.a());
            }
            throw new IOException("Canceled");
        }
        throw new IOException("exhausted all routes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mq1 i(y79 y79Var, qo9 qo9Var, List list, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            list = null;
        }
        return y79Var.h(qo9Var, list);
    }

    private final cm9 j() {
        Socket z;
        boolean z2;
        u79 m = this.c.m();
        if (m == null) {
            return null;
        }
        boolean q = m.q(this.f);
        synchronized (m) {
            try {
                if (!q) {
                    z2 = !m.l();
                    m.y(true);
                    z = this.c.z();
                } else {
                    if (!m.l() && e(m.v().a().l())) {
                        z = null;
                        z2 = false;
                    }
                    z = this.c.z();
                    z2 = false;
                }
            } finally {
            }
        }
        if (this.c.m() != null) {
            if (z == null) {
                return new cm9(m);
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z != null) {
            cec.h(z);
        }
        this.c.n().l(this.c, m);
        m.j().g(m, this.c);
        if (z != null) {
            m.j().f(m);
        } else if (z2) {
            m.j().h(m);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cm9 l(y79 y79Var, mq1 mq1Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            mq1Var = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return y79Var.k(mq1Var, list);
    }

    private final qo9 m(u79 u79Var) {
        qo9 qo9Var;
        synchronized (u79Var) {
            qo9Var = null;
            if (u79Var.m() == 0 && u79Var.l() && cec.e(u79Var.v().a().l(), b().l())) {
                qo9Var = u79Var.v();
            }
        }
        return qo9Var;
    }

    @Override // defpackage.vo9
    public boolean a(u79 u79Var) {
        wo9 wo9Var;
        qo9 m;
        if ((!c().isEmpty()) || this.i != null) {
            return true;
        }
        if (u79Var != null && (m = m(u79Var)) != null) {
            this.i = m;
            return true;
        }
        wo9.b bVar = this.g;
        if ((bVar != null && bVar.b()) || (wo9Var = this.h) == null) {
            return true;
        }
        return wo9Var.a();
    }

    @Override // defpackage.vo9
    public x6 b() {
        return this.b;
    }

    @Override // defpackage.vo9
    public gr<vo9.b> c() {
        return this.j;
    }

    @Override // defpackage.vo9
    public vo9.b d() throws IOException {
        cm9 j = j();
        if (j != null) {
            return j;
        }
        cm9 l = l(this, null, null, 3, null);
        if (l != null) {
            return l;
        }
        if (!c().isEmpty()) {
            return c().Z();
        }
        mq1 g = g();
        cm9 k = k(g, g.p());
        if (k != null) {
            return k;
        }
        return g;
    }

    @Override // defpackage.vo9
    public boolean e(sq4 sq4Var) {
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        sq4 l = b().l();
        if (sq4Var.r() == l.r() && z65.c(sq4Var.k(), l.k())) {
            return true;
        }
        return false;
    }

    public final mq1 h(qo9 qo9Var, List<qo9> list) throws IOException {
        hi9 hi9Var;
        z65.h(qo9Var, "route");
        if (qo9Var.a().k() == null) {
            if (qo9Var.a().b().contains(sq1.k)) {
                String k = qo9Var.a().l().k();
                if (!xb8.a.g().j(k)) {
                    throw new UnknownServiceException("CLEARTEXT communication to " + k + " not permitted by network security policy");
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (qo9Var.a().f().contains(vr8.g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (qo9Var.c()) {
            hi9Var = f(qo9Var);
        } else {
            hi9Var = null;
        }
        return new mq1(this.a, this.c, this.d, this, qo9Var, list, 0, hi9Var, -1, false, this.e);
    }

    @Override // defpackage.vo9
    public boolean isCanceled() {
        return this.c.isCanceled();
    }

    public final cm9 k(mq1 mq1Var, List<qo9> list) {
        boolean z;
        v79 b = this.a.k().b();
        boolean z2 = this.f;
        x6 b2 = b();
        t79 t79Var = this.c;
        if (mq1Var != null && mq1Var.g()) {
            z = true;
        } else {
            z = false;
        }
        u79 a = b.a(z2, b2, t79Var, list, z);
        if (a == null) {
            return null;
        }
        if (mq1Var != null) {
            this.i = mq1Var.e();
            mq1Var.i();
        }
        this.c.n().k(this.c, a);
        a.j().e(a, this.c);
        return new cm9(a);
    }
}
