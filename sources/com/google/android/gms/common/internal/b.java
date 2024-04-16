package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.huawei.hms.api.HuaweiApiClientImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class b<T extends IInterface> {
    private boolean A;
    private volatile zzj B;
    @NonNull
    protected AtomicInteger C;
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private volatile String f;
    w g;
    private final Context h;
    private final Looper i;
    private final com.google.android.gms.common.internal.d j;
    private final com.google.android.gms.common.b k;
    final Handler l;
    private final Object m;
    private final Object n;
    private xr4 o;
    @NonNull
    protected c p;
    private IInterface q;
    private final ArrayList r;
    private o s;
    private int t;
    private final a u;
    private final InterfaceC0220b v;
    private final int w;
    private final String x;
    private volatile String y;
    private ConnectionResult z;
    private static final Feature[] E = new Feature[0];
    @NonNull
    public static final String[] D = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface a {
        void onConnectionSuspended(int i);

        void x(Bundle bundle);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: com.google.android.gms.common.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0220b {
        void C(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface c {
        void a(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.u()) {
                b bVar = b.this;
                bVar.i(null, bVar.z());
            } else if (b.this.v != null) {
                b.this.v.C(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, com.google.android.gms.common.internal.b.a r13, com.google.android.gms.common.internal.b.InterfaceC0220b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.d r3 = com.google.android.gms.common.internal.d.b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.b.f()
            defpackage.gh8.j(r13)
            defpackage.gh8.j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void Z(b bVar, zzj zzjVar) {
        RootTelemetryConfiguration v;
        bVar.B = zzjVar;
        if (bVar.P()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.d;
            co9 b = co9.b();
            if (connectionTelemetryConfiguration == null) {
                v = null;
            } else {
                v = connectionTelemetryConfiguration.v();
            }
            b.c(v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a0(b bVar, int i) {
        int i2;
        int i3;
        synchronized (bVar.m) {
            i2 = bVar.t;
        }
        if (i2 == 3) {
            bVar.A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = bVar.l;
        handler.sendMessage(handler.obtainMessage(i3, bVar.C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean d0(b bVar, int i, int i2, IInterface iInterface) {
        synchronized (bVar.m) {
            try {
                if (bVar.t != i) {
                    return false;
                }
                bVar.f0(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean e0(com.google.android.gms.common.internal.b r2) {
        /*
            boolean r0 = r2.A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.y()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.B()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.e0(com.google.android.gms.common.internal.b):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        w wVar;
        w wVar2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        gh8.a(z3);
        synchronized (this.m) {
            try {
                this.t = i;
                this.q = iInterface;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            gh8.j(iInterface);
                            H(iInterface);
                        }
                    } else {
                        o oVar = this.s;
                        if (oVar != null && (wVar2 = this.g) != null) {
                            String c2 = wVar2.c();
                            String b = wVar2.b();
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c2 + " on " + b);
                            com.google.android.gms.common.internal.d dVar = this.j;
                            String c3 = this.g.c();
                            gh8.j(c3);
                            dVar.e(c3, this.g.b(), this.g.a(), oVar, U(), this.g.d());
                            this.C.incrementAndGet();
                        }
                        o oVar2 = new o(this, this.C.get());
                        this.s = oVar2;
                        if (this.t == 3 && y() != null) {
                            wVar = new w(v().getPackageName(), y(), true, com.google.android.gms.common.internal.d.a(), false);
                        } else {
                            wVar = new w(D(), C(), false, com.google.android.gms.common.internal.d.a(), F());
                        }
                        this.g = wVar;
                        if (wVar.d() && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.c())));
                        }
                        com.google.android.gms.common.internal.d dVar2 = this.j;
                        String c4 = this.g.c();
                        gh8.j(c4);
                        String b2 = this.g.b();
                        int a2 = this.g.a();
                        if (!dVar2.f(new y4d(c4, b2, a2, this.g.d()), oVar2, U(), t())) {
                            String c5 = this.g.c();
                            String b3 = this.g.b();
                            Log.w("GmsClient", "unable to connect to service: " + c5 + " on " + b3);
                            b0(16, null, this.C.get());
                        }
                    }
                } else {
                    o oVar3 = this.s;
                    if (oVar3 != null) {
                        com.google.android.gms.common.internal.d dVar3 = this.j;
                        String c6 = this.g.c();
                        gh8.j(c6);
                        dVar3.e(c6, this.g.b(), this.g.a(), oVar3, U(), this.g.d());
                        this.s = null;
                    }
                }
            } finally {
            }
        }
    }

    @NonNull
    public final T A() throws DeadObjectException {
        T t;
        synchronized (this.m) {
            try {
                if (this.t != 5) {
                    o();
                    t = (T) this.q;
                    gh8.k(t, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public abstract String B();

    @NonNull
    protected abstract String C();

    @NonNull
    protected String D() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration E() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.d;
    }

    protected boolean F() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    protected void H(@NonNull T t) {
        this.c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void I(@NonNull ConnectionResult connectionResult) {
        this.d = connectionResult.h();
        this.e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new p(this, i, iBinder, bundle)));
    }

    public boolean L() {
        return false;
    }

    public void M(@NonNull String str) {
        this.y = str;
    }

    public void N(int i) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i));
    }

    protected void O(@NonNull c cVar, int i, PendingIntent pendingIntent) {
        gh8.k(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i, pendingIntent));
    }

    public boolean P() {
        return false;
    }

    @NonNull
    protected final String U() {
        String str = this.x;
        if (str == null) {
            return this.h.getClass().getName();
        }
        return str;
    }

    public void b(@NonNull String str) {
        this.f = str;
        disconnect();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b0(int i, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new q(this, i, null)));
    }

    @NonNull
    public String c() {
        w wVar;
        if (isConnected() && (wVar = this.g) != null) {
            return wVar.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void d(@NonNull c cVar) {
        gh8.k(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        f0(2, null);
    }

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.r) {
            try {
                int size = this.r.size();
                for (int i = 0; i < size; i++) {
                    ((m) this.r.get(i)).d();
                }
                this.r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            this.o = null;
        }
        f0(1, null);
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public void i(com.google.android.gms.common.internal.e eVar, @NonNull Set<Scope> set) {
        Bundle x = x();
        int i = this.w;
        String str = this.y;
        int i2 = com.google.android.gms.common.b.a;
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.h.getPackageName();
        getServiceRequest.g = x;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            Account r = r();
            if (r == null) {
                r = new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.h = r;
            if (eVar != null) {
                getServiceRequest.e = eVar.asBinder();
            }
        } else if (L()) {
            getServiceRequest.h = r();
        }
        getServiceRequest.i = E;
        getServiceRequest.j = s();
        if (P()) {
            getServiceRequest.m = true;
        }
        try {
            synchronized (this.n) {
                try {
                    xr4 xr4Var = this.o;
                    if (xr4Var != null) {
                        xr4Var.k1(new n(this, this.C.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            N(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.C.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.C.get());
        }
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            if (this.t == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void j(@NonNull e eVar) {
        eVar.a();
    }

    public int k() {
        return com.google.android.gms.common.b.a;
    }

    public final Feature[] l() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.b;
    }

    public String m() {
        return this.f;
    }

    public void n() {
        int h = this.k.h(this.h, k());
        if (h != 0) {
            f0(1, null);
            O(new d(), h, null);
            return;
        }
        d(new d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        if (isConnected()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T p(@NonNull IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q() {
        return false;
    }

    public Account r() {
        return null;
    }

    @NonNull
    public Feature[] s() {
        return E;
    }

    protected Executor t() {
        return null;
    }

    public Bundle u() {
        return null;
    }

    @NonNull
    public final Context v() {
        return this.h;
    }

    public int w() {
        return this.w;
    }

    @NonNull
    protected Bundle x() {
        return new Bundle();
    }

    protected String y() {
        return null;
    }

    @NonNull
    protected Set<Scope> z() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(@NonNull Context context, @NonNull Looper looper, @NonNull com.google.android.gms.common.internal.d dVar, @NonNull com.google.android.gms.common.b bVar, int i, a aVar, InterfaceC0220b interfaceC0220b, String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        gh8.k(context, "Context must not be null");
        this.h = context;
        gh8.k(looper, "Looper must not be null");
        this.i = looper;
        gh8.k(dVar, "Supervisor must not be null");
        this.j = dVar;
        gh8.k(bVar, "API availability must not be null");
        this.k = bVar;
        this.l = new l(this, looper);
        this.w = i;
        this.u = aVar;
        this.v = interfaceC0220b;
        this.x = str;
    }
}
