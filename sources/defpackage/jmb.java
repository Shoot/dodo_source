package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import defpackage.gp;
import defpackage.np;
import defpackage.wx7;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: TransportManager.java */
/* renamed from: jmb  reason: default package */
/* loaded from: classes2.dex */
public class jmb implements gp.b {
    private static final sh r = sh.e();
    private static final jmb s = new jmb();
    private final Map<String, Integer> a;
    private qv3 d;
    private vw3 e;
    private ew3 f;
    private bs8<xlb> g;
    private bz3 h;
    private Context j;
    private a k;
    private z49 l;
    private gp m;
    private np.b n;
    private String o;
    private String p;
    private final ConcurrentLinkedQueue<rx7> b = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private boolean q = false;
    private ExecutorService i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private jmb() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private wx7 D(wx7.b bVar, tp tpVar) {
        G();
        np.b M = this.n.M(tpVar);
        if (bVar.m() || bVar.i()) {
            M = M.clone().J(j());
        }
        return bVar.I(M).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Context k = this.d.k();
        this.j = k;
        this.o = k.getPackageName();
        this.k = a.g();
        this.l = new z49(this.j, new g49(100L, 1L, TimeUnit.MINUTES), 500L);
        this.m = gp.b();
        this.h = new bz3(this.g, this.k.a());
        h();
    }

    private void F(wx7.b bVar, tp tpVar) {
        if (!u()) {
            if (s(bVar)) {
                r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.b.add(new rx7(bVar, tpVar));
                return;
            }
            return;
        }
        wx7 D = D(bVar, tpVar);
        if (t(D)) {
            g(D);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.k
            boolean r0 = r0.K()
            if (r0 == 0) goto L72
            np$b r0 = r6.n
            boolean r0 = r0.I()
            if (r0 == 0) goto L15
            boolean r0 = r6.q
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            r1 = 1
            ew3 r2 = r6.f     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            y6b r2 = r2.getId()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = defpackage.o7b.b(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            goto L5f
        L29:
            r2 = move-exception
            goto L2f
        L2b:
            r2 = move-exception
            goto L3f
        L2d:
            r2 = move-exception
            goto L4f
        L2f:
            sh r3 = defpackage.jmb.r
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.d(r0, r1)
            goto L5e
        L3f:
            sh r3 = defpackage.jmb.r
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.d(r0, r1)
            goto L5e
        L4f:
            sh r3 = defpackage.jmb.r
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.d(r0, r1)
        L5e:
            r2 = 0
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6b
            np$b r0 = r6.n
            r0.L(r2)
            goto L72
        L6b:
            sh r0 = defpackage.jmb.r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmb.G():void");
    }

    private void H() {
        if (this.e == null && u()) {
            this.e = vw3.c();
        }
    }

    private void g(wx7 wx7Var) {
        if (wx7Var.m()) {
            r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(wx7Var), i(wx7Var.n()));
        } else {
            r.g("Logging %s", n(wx7Var));
        }
        this.h.b(wx7Var);
    }

    private void h() {
        this.m.k(new WeakReference<>(s));
        np.b o0 = np.o0();
        this.n = o0;
        o0.N(this.d.n().c()).K(ee.g0().I(this.o).J(ih0.b).K(p(this.j)));
        this.c.set(true);
        while (!this.b.isEmpty()) {
            final rx7 poll = this.b.poll();
            if (poll != null) {
                this.i.execute(new Runnable() { // from class: imb
                    @Override // java.lang.Runnable
                    public final void run() {
                        jmb.this.v(poll);
                    }
                });
            }
        }
    }

    private String i(wjb wjbVar) {
        String z0 = wjbVar.z0();
        if (z0.startsWith("_st_")) {
            return cr1.c(this.p, this.o, z0);
        }
        return cr1.a(this.p, this.o, z0);
    }

    private Map<String, String> j() {
        H();
        vw3 vw3Var = this.e;
        if (vw3Var != null) {
            return vw3Var.b();
        }
        return Collections.emptyMap();
    }

    public static jmb k() {
        return s;
    }

    private static String l(dd4 dd4Var) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(dd4Var.m0()), Integer.valueOf(dd4Var.j0()), Integer.valueOf(dd4Var.i0()));
    }

    private static String m(fw6 fw6Var) {
        long j;
        String str;
        if (fw6Var.K0()) {
            j = fw6Var.B0();
        } else {
            j = 0;
        }
        if (fw6Var.G0()) {
            str = String.valueOf(fw6Var.v0());
        } else {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", fw6Var.D0(), str, new DecimalFormat("#.####").format(j / 1000.0d));
    }

    private static String n(xx7 xx7Var) {
        if (xx7Var.m()) {
            return o(xx7Var.n());
        }
        if (xx7Var.i()) {
            return m(xx7Var.j());
        }
        if (xx7Var.h()) {
            return l(xx7Var.o());
        }
        return "log";
    }

    private static String o(wjb wjbVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", wjbVar.z0(), new DecimalFormat("#.####").format(wjbVar.w0() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(wx7 wx7Var) {
        if (wx7Var.m()) {
            this.m.d(dr1.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (wx7Var.i()) {
            this.m.d(dr1.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private boolean s(xx7 xx7Var) {
        int intValue = this.a.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (xx7Var.m() && intValue > 0) {
            this.a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (xx7Var.i() && intValue2 > 0) {
            this.a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (xx7Var.h() && intValue3 > 0) {
            this.a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(xx7Var), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    private boolean t(wx7 wx7Var) {
        if (!this.k.K()) {
            r.g("Performance collection is not enabled, dropping %s", n(wx7Var));
            return false;
        } else if (!wx7Var.e0().j0()) {
            r.k("App Instance ID is null or empty, dropping %s", n(wx7Var));
            return false;
        } else if (!yx7.b(wx7Var, this.j)) {
            r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(wx7Var));
            return false;
        } else if (!this.l.h(wx7Var)) {
            q(wx7Var);
            r.g("Event dropped due to device sampling - %s", n(wx7Var));
            return false;
        } else if (!this.l.g(wx7Var)) {
            return true;
        } else {
            q(wx7Var);
            r.g("Rate limited (per device) - %s", n(wx7Var));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(rx7 rx7Var) {
        F(rx7Var.a, rx7Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(wjb wjbVar, tp tpVar) {
        F(wx7.g0().L(wjbVar), tpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(fw6 fw6Var, tp tpVar) {
        F(wx7.g0().K(fw6Var), tpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(dd4 dd4Var, tp tpVar) {
        F(wx7.g0().J(dd4Var), tpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.l.a(this.q);
    }

    public void A(final dd4 dd4Var, final tp tpVar) {
        this.i.execute(new Runnable() { // from class: hmb
            @Override // java.lang.Runnable
            public final void run() {
                jmb.this.y(dd4Var, tpVar);
            }
        });
    }

    public void B(final fw6 fw6Var, final tp tpVar) {
        this.i.execute(new Runnable() { // from class: fmb
            @Override // java.lang.Runnable
            public final void run() {
                jmb.this.x(fw6Var, tpVar);
            }
        });
    }

    public void C(final wjb wjbVar, final tp tpVar) {
        this.i.execute(new Runnable() { // from class: dmb
            @Override // java.lang.Runnable
            public final void run() {
                jmb.this.w(wjbVar, tpVar);
            }
        });
    }

    @Override // defpackage.gp.b
    public void onUpdateAppState(tp tpVar) {
        boolean z;
        if (tpVar == tp.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.q = z;
        if (u()) {
            this.i.execute(new Runnable() { // from class: gmb
                @Override // java.lang.Runnable
                public final void run() {
                    jmb.this.z();
                }
            });
        }
    }

    public void r(@NonNull qv3 qv3Var, @NonNull ew3 ew3Var, @NonNull bs8<xlb> bs8Var) {
        this.d = qv3Var;
        this.p = qv3Var.n().e();
        this.f = ew3Var;
        this.g = bs8Var;
        this.i.execute(new Runnable() { // from class: emb
            @Override // java.lang.Runnable
            public final void run() {
                jmb.this.E();
            }
        });
    }

    public boolean u() {
        return this.c.get();
    }
}
