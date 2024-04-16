package defpackage;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.inappstory.sdk.network.NetworkHandler;
import defpackage.fw6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: NetworkRequestMetricBuilder.java */
/* renamed from: gw6  reason: default package */
/* loaded from: classes2.dex */
public final class gw6 extends jp implements aea {
    private static final sh i = sh.e();
    private final List<PerfSession> a;
    private final GaugeManager b;
    private final jmb c;
    private final fw6.b d;
    private final WeakReference<aea> e;
    private String f;
    private boolean g;
    private boolean h;

    private gw6(jmb jmbVar) {
        this(jmbVar, gp.b(), GaugeManager.getInstance());
    }

    public static gw6 c(jmb jmbVar) {
        return new gw6(jmbVar);
    }

    private boolean g() {
        return this.d.L();
    }

    private boolean h() {
        return this.d.N();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aea
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (g() && !h()) {
            this.a.add(perfSession);
        }
    }

    public fw6 b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        zx7[] b = PerfSession.b(d());
        if (b != null) {
            this.d.I(Arrays.asList(b));
        }
        fw6 a = this.d.a();
        if (!hw6.c(this.f)) {
            i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return a;
        } else if (!this.g) {
            this.c.B(a, getAppState());
            this.g = true;
            return a;
        } else {
            if (this.h) {
                i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return a;
        }
    }

    List<PerfSession> d() {
        List<PerfSession> unmodifiableList;
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableList;
    }

    public long e() {
        return this.d.K();
    }

    public boolean f() {
        return this.d.M();
    }

    public gw6 j(String str) {
        fw6.d dVar;
        if (str != null) {
            fw6.d dVar2 = fw6.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals(NetworkHandler.GET)) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(NetworkHandler.PUT)) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals(NetworkHandler.HEAD)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals(NetworkHandler.POST)) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals(NetworkHandler.DELETE)) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    dVar = fw6.d.OPTIONS;
                    break;
                case 1:
                    dVar = fw6.d.GET;
                    break;
                case 2:
                    dVar = fw6.d.PUT;
                    break;
                case 3:
                    dVar = fw6.d.HEAD;
                    break;
                case 4:
                    dVar = fw6.d.POST;
                    break;
                case 5:
                    dVar = fw6.d.PATCH;
                    break;
                case 6:
                    dVar = fw6.d.TRACE;
                    break;
                case 7:
                    dVar = fw6.d.CONNECT;
                    break;
                case '\b':
                    dVar = fw6.d.DELETE;
                    break;
                default:
                    dVar = fw6.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.d.P(dVar);
        }
        return this;
    }

    public gw6 k(int i2) {
        this.d.Q(i2);
        return this;
    }

    public gw6 l() {
        this.d.R(fw6.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public gw6 m(long j) {
        this.d.S(j);
        return this;
    }

    public gw6 n(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        this.d.O(j);
        a(perfSession);
        if (perfSession.e()) {
            this.b.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public gw6 o(String str) {
        if (str == null) {
            this.d.J();
            return this;
        }
        if (i(str)) {
            this.d.T(str);
        } else {
            sh shVar = i;
            shVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public gw6 p(long j) {
        this.d.U(j);
        return this;
    }

    public gw6 q(long j) {
        this.d.V(j);
        return this;
    }

    public gw6 r(long j) {
        this.d.X(j);
        if (SessionManager.getInstance().perfSession().e()) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public gw6 s(long j) {
        this.d.Y(j);
        return this;
    }

    public gw6 t(String str) {
        if (str != null) {
            this.d.Z(hvb.e(hvb.d(str), 2000));
        }
        return this;
    }

    public gw6 u(String str) {
        this.f = str;
        return this;
    }

    public gw6(jmb jmbVar, gp gpVar, GaugeManager gaugeManager) {
        super(gpVar);
        this.d = fw6.M0();
        this.e = new WeakReference<>(this);
        this.c = jmbVar;
        this.b = gaugeManager;
        this.a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
