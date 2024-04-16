package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzdd;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public class u5 implements u6 {
    private static volatile u5 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    final long H;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final c f;
    private final g g;
    private final w4 h;
    private final k4 i;
    private final o5 j;
    private final ea k;
    private final jb l;
    private final j4 m;
    private final t91 n;
    private final o8 o;
    private final z6 p;
    private final x q;
    private final k8 r;
    private final String s;
    private i4 t;
    private x8 u;
    private w v;
    private f4 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger G = new AtomicInteger(0);

    private u5(y6 y6Var) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z = false;
        gh8.j(y6Var);
        c cVar = new c(y6Var.a);
        this.f = cVar;
        c4.a = cVar;
        Context context = y6Var.a;
        this.a = context;
        this.b = y6Var.b;
        this.c = y6Var.c;
        this.d = y6Var.d;
        this.e = y6Var.h;
        this.A = y6Var.e;
        this.s = y6Var.j;
        this.D = true;
        zzdd zzddVar = y6Var.g;
        if (zzddVar != null && (bundle = zzddVar.g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzddVar.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        izc.l(context);
        t91 c = jp2.c();
        this.n = c;
        Long l = y6Var.i;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = c.currentTimeMillis();
        }
        this.H = currentTimeMillis;
        this.g = new g(this);
        w4 w4Var = new w4(this);
        w4Var.p();
        this.h = w4Var;
        k4 k4Var = new k4(this);
        k4Var.p();
        this.i = k4Var;
        jb jbVar = new jb(this);
        jbVar.p();
        this.l = jbVar;
        this.m = new j4(new x6(y6Var, this));
        this.q = new x(this);
        o8 o8Var = new o8(this);
        o8Var.v();
        this.o = o8Var;
        z6 z6Var = new z6(this);
        z6Var.v();
        this.p = z6Var;
        ea eaVar = new ea(this);
        eaVar.v();
        this.k = eaVar;
        k8 k8Var = new k8(this);
        k8Var.p();
        this.r = k8Var;
        o5 o5Var = new o5(this);
        o5Var.p();
        this.j = o5Var;
        zzdd zzddVar2 = y6Var.g;
        if (zzddVar2 != null && zzddVar2.b != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            z6 G = G();
            if (G.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) G.zza().getApplicationContext();
                if (G.c == null) {
                    G.c = new f8(G);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(G.c);
                    application.registerActivityLifecycleCallbacks(G.c);
                    G.n().J().a("Registered activity lifecycle callback");
                }
            }
        } else {
            n().K().a("Application context is not an Application");
        }
        o5Var.C(new v5(this, y6Var));
    }

    public static u5 a(Context context, zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.e == null || zzddVar.f == null)) {
            zzddVar = new zzdd(zzddVar.a, zzddVar.b, zzddVar.c, zzddVar.d, null, null, zzddVar.g, null);
        }
        gh8.j(context);
        gh8.j(context.getApplicationContext());
        if (I == null) {
            synchronized (u5.class) {
                try {
                    if (I == null) {
                        I = new u5(new y6(context, zzddVar, l));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            gh8.j(I);
            I.j(zzddVar.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        gh8.j(I);
        return I;
    }

    private static void e(x2 x2Var) {
        if (x2Var != null) {
            if (x2Var.y()) {
                return;
            }
            String valueOf = String.valueOf(x2Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(u5 u5Var, y6 y6Var) {
        u5Var.k().l();
        w wVar = new w(u5Var);
        wVar.p();
        u5Var.v = wVar;
        f4 f4Var = new f4(u5Var, y6Var.f);
        f4Var.v();
        u5Var.w = f4Var;
        i4 i4Var = new i4(u5Var);
        i4Var.v();
        u5Var.t = i4Var;
        x8 x8Var = new x8(u5Var);
        x8Var.v();
        u5Var.u = x8Var;
        u5Var.l.q();
        u5Var.h.q();
        u5Var.w.w();
        u5Var.n().I().b("App measurement initialized, version", 84002L);
        u5Var.n().I().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String E = f4Var.E();
        if (TextUtils.isEmpty(u5Var.b)) {
            if (u5Var.K().E0(E)) {
                u5Var.n().I().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                m4 I2 = u5Var.n().I();
                I2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + E);
            }
        }
        u5Var.n().E().a("Debug-level message logging enabled");
        if (u5Var.E != u5Var.G.get()) {
            u5Var.n().F().c("Not all components initialized", Integer.valueOf(u5Var.E), Integer.valueOf(u5Var.G.get()));
        }
        u5Var.x = true;
    }

    private static void g(s6 s6Var) {
        if (s6Var != null) {
            if (s6Var.r()) {
                return;
            }
            String valueOf = String.valueOf(s6Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
        throw new IllegalStateException("Component not created");
    }

    private static void h(t6 t6Var) {
        if (t6Var != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private final k8 u() {
        g(this.r);
        return this.r;
    }

    public final f4 A() {
        e(this.w);
        return this.w;
    }

    public final i4 B() {
        e(this.t);
        return this.t;
    }

    public final j4 C() {
        return this.m;
    }

    public final k4 D() {
        k4 k4Var = this.i;
        if (k4Var != null && k4Var.r()) {
            return this.i;
        }
        return null;
    }

    public final w4 E() {
        h(this.h);
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o5 F() {
        return this.j;
    }

    public final z6 G() {
        e(this.p);
        return this.p;
    }

    public final o8 H() {
        e(this.o);
        return this.o;
    }

    public final x8 I() {
        e(this.u);
        return this.u;
    }

    public final ea J() {
        e(this.k);
        return this.k;
    }

    public final jb K() {
        h(this.l);
        return this.l;
    }

    public final String L() {
        return this.b;
    }

    public final String M() {
        return this.c;
    }

    public final String N() {
        return this.d;
    }

    public final String O() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q() {
        this.G.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    public final t91 b() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r1.z() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u5.c(com.google.android.gms.internal.measurement.zzdd):void");
    }

    @Override // com.google.android.gms.measurement.internal.u6
    public final c d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i == 200 || i == 204 || i == 304) && th == null) {
            E().v.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        n().E().a("Deferred Deep Link is empty.");
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (a7d.a() && this.g.s(b0.W0)) {
                        if (!K().J0(optString)) {
                            n().K().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                            return;
                        }
                        bundle.putString("gbraid", optString3);
                    } else if (!K().J0(optString)) {
                        n().K().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.p.B0("auto", "_cmp", bundle);
                    jb K = K();
                    if (!TextUtils.isEmpty(optString) && K.h0(optString, optDouble)) {
                        K.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    n().F().b("Failed to parse the Deferred Deep Link response. exception", e);
                    return;
                }
            }
            n().E().a("Deferred Deep Link response empty.");
            return;
        }
        n().K().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.measurement.internal.u6
    public final o5 k() {
        g(this.j);
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.E++;
    }

    public final boolean m() {
        if (this.A != null && this.A.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    public final k4 n() {
        g(this.i);
        return this.i;
    }

    public final boolean o() {
        if (w() == 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        k().l();
        return this.D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r() {
        boolean z;
        if (this.x) {
            k().l();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z2 = true;
                if (K().D0("android.permission.INTERNET") && K().D0("android.permission.ACCESS_NETWORK_STATE") && (t8c.a(this.a).f() || this.g.S() || (jb.c0(this.a) && jb.d0(this.a, false)))) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!K().j0(A().F(), A().D()) && TextUtils.isEmpty(A().D())) {
                        z2 = false;
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean s() {
        return this.e;
    }

    public final boolean t() {
        Bundle bundle;
        int i;
        String str;
        k().l();
        g(u());
        String E = A().E();
        Pair<String, Boolean> t = E().t(E);
        boolean z = false;
        if (this.g.P() && !((Boolean) t.second).booleanValue() && !TextUtils.isEmpty((CharSequence) t.first)) {
            if (!u().v()) {
                n().K().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            if (y5d.a() && this.g.s(b0.R0)) {
                x8 I2 = I();
                I2.l();
                I2.u();
                if (!I2.e0() || I2.h().F0() >= 234200) {
                    z6 G = G();
                    G.l();
                    zzaj U = G.s().U();
                    if (U != null) {
                        bundle = U.a;
                    } else {
                        bundle = null;
                    }
                    int i2 = 1;
                    if (bundle == null) {
                        int i3 = this.F;
                        this.F = i3 + 1;
                        if (i3 < 10) {
                            z = true;
                        }
                        m4 E2 = n().E();
                        if (z) {
                            str = "Retrying.";
                        } else {
                            str = "Skipping.";
                        }
                        E2.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.F));
                        return z;
                    }
                    w6 c = w6.c(bundle, 100);
                    sb.append("&gcs=");
                    sb.append(c.v());
                    t b = t.b(bundle, 100);
                    sb.append("&dma=");
                    if (b.g() == Boolean.FALSE) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    sb.append(i);
                    if (!TextUtils.isEmpty(b.h())) {
                        sb.append("&dma_cps=");
                        sb.append(b.h());
                    }
                    if (t.d(bundle) == Boolean.TRUE) {
                        i2 = 0;
                    }
                    sb.append("&npa=");
                    sb.append(i2);
                    n().J().b("Consent query parameters to Bow", sb);
                }
            }
            jb K = K();
            A();
            URL J = K.J(84002L, E, (String) t.first, E().w.a() - 1, sb.toString());
            if (J != null) {
                k8 u = u();
                j8 j8Var = new j8() { // from class: com.google.android.gms.measurement.internal.w5
                    @Override // com.google.android.gms.measurement.internal.j8
                    public final void a(String str2, int i4, Throwable th, byte[] bArr, Map map) {
                        u5.this.i(str2, i4, th, bArr, map);
                    }
                };
                u.l();
                u.o();
                gh8.j(J);
                gh8.j(j8Var);
                u.k().y(new m8(u, E, J, null, null, j8Var));
            }
            return false;
        }
        n().E().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final void v(boolean z) {
        k().l();
        this.D = z;
    }

    public final int w() {
        k().l();
        if (this.g.R()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!p()) {
            return 8;
        }
        Boolean N = E().N();
        if (N != null) {
            if (N.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean B = this.g.B("firebase_analytics_collection_enabled");
        if (B != null) {
            if (B.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.A == null || this.A.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    public final x x() {
        x xVar = this.q;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final g y() {
        return this.g;
    }

    public final w z() {
        g(this.v);
        return this.v;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    public final Context zza() {
        return this.a;
    }
}
