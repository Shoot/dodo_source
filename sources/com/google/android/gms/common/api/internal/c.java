package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class c implements Handler.Callback {
    @NonNull
    public static final Status p = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status q = new Status(4, "The user must be signed in to make this API call.");
    private static final Object r = new Object();
    private static c s;
    private TelemetryData c;
    private l8b d;
    private final Context e;
    private final com.google.android.gms.common.a f;
    private final rkc g;
    private final Handler n;
    private volatile boolean o;
    private long a = AbstractComponentTracker.LINGERING_TIMEOUT;
    private boolean b = false;
    private final AtomicInteger h = new AtomicInteger(1);
    private final AtomicInteger i = new AtomicInteger(0);
    private final Map j = new ConcurrentHashMap(5, 0.75f, 1);
    private m k = null;
    private final Set l = new qr();
    private final Set m = new qr();

    private c(Context context, Looper looper, com.google.android.gms.common.a aVar) {
        this.o = true;
        this.e = context;
        hlc hlcVar = new hlc(looper, this);
        this.n = hlcVar;
        this.f = aVar;
        this.g = new rkc(aVar);
        if (z13.a(context)) {
            this.o = false;
        }
        hlcVar.sendMessage(hlcVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (r) {
            try {
                c cVar = s;
                if (cVar != null) {
                    cVar.i.incrementAndGet();
                    Handler handler = cVar.n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(mm mmVar, ConnectionResult connectionResult) {
        String b = mmVar.b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b + " is not available on this device. Connection failed with: " + valueOf);
    }

    @ResultIgnorabilityUnspecified
    private final t h(com.google.android.gms.common.api.b bVar) {
        mm o = bVar.o();
        t tVar = (t) this.j.get(o);
        if (tVar == null) {
            tVar = new t(this, bVar);
            this.j.put(o, tVar);
        }
        if (tVar.O()) {
            this.m.add(o);
        }
        tVar.D();
        return tVar;
    }

    private final l8b i() {
        if (this.d == null) {
            this.d = k8b.a(this.e);
        }
        return this.d;
    }

    private final void j() {
        TelemetryData telemetryData = this.c;
        if (telemetryData != null) {
            if (telemetryData.h() > 0 || e()) {
                i().a(telemetryData);
            }
            this.c = null;
        }
    }

    private final void k(a7b a7bVar, int i, com.google.android.gms.common.api.b bVar) {
        y b;
        if (i != 0 && (b = y.b(this, i, bVar.o())) != null) {
            y6b a = a7bVar.a();
            final Handler handler = this.n;
            handler.getClass();
            a.d(new Executor() { // from class: xic
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b);
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static c u(@NonNull Context context) {
        c cVar;
        synchronized (r) {
            try {
                if (s == null) {
                    s = new c(context.getApplicationContext(), com.google.android.gms.common.internal.d.c().getLooper(), com.google.android.gms.common.a.m());
                }
                cVar = s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final void C(@NonNull com.google.android.gms.common.api.b bVar, int i, @NonNull b bVar2) {
        f0 f0Var = new f0(i, bVar2);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(4, new kjc(f0Var, this.i.get(), bVar)));
    }

    public final void D(@NonNull com.google.android.gms.common.api.b bVar, int i, @NonNull h hVar, @NonNull a7b a7bVar, @NonNull rwa rwaVar) {
        k(a7bVar, hVar.d(), bVar);
        h0 h0Var = new h0(i, hVar, a7bVar, rwaVar);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(4, new kjc(h0Var, this.i.get(), bVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(18, new z(methodInvocation, i, j, i2)));
    }

    public final void F(@NonNull ConnectionResult connectionResult, int i) {
        if (!f(connectionResult, i)) {
            Handler handler = this.n;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void G() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(@NonNull com.google.android.gms.common.api.b bVar) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final void b(@NonNull m mVar) {
        synchronized (r) {
            try {
                if (this.k != mVar) {
                    this.k = mVar;
                    this.l.clear();
                }
                this.l.addAll(mVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(@NonNull m mVar) {
        synchronized (r) {
            try {
                if (this.k == mVar) {
                    this.k = null;
                    this.l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration a = co9.b().a();
        if (a != null && !a.p()) {
            return false;
        }
        int a2 = this.g.a(this.e, 203400000);
        if (a2 != -1 && a2 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ResultIgnorabilityUnspecified
    public final boolean f(ConnectionResult connectionResult, int i) {
        return this.f.w(this.e, connectionResult, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        mm mmVar;
        mm mmVar2;
        mm mmVar3;
        mm mmVar4;
        int i = message.what;
        long j = 300000;
        t tVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = AbstractComponentTracker.LINGERING_TIMEOUT;
                }
                this.a = j;
                this.n.removeMessages(12);
                for (mm mmVar5 : this.j.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, mmVar5), this.a);
                }
                break;
            case 2:
                skc skcVar = (skc) message.obj;
                Iterator it = skcVar.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        mm mmVar6 = (mm) it.next();
                        t tVar2 = (t) this.j.get(mmVar6);
                        if (tVar2 == null) {
                            skcVar.b(mmVar6, new ConnectionResult(13), null);
                            break;
                        } else if (tVar2.N()) {
                            skcVar.b(mmVar6, ConnectionResult.e, tVar2.s().c());
                        } else {
                            ConnectionResult q2 = tVar2.q();
                            if (q2 != null) {
                                skcVar.b(mmVar6, q2, null);
                            } else {
                                tVar2.I(skcVar);
                                tVar2.D();
                            }
                        }
                    }
                }
            case 3:
                for (t tVar3 : this.j.values()) {
                    tVar3.B();
                    tVar3.D();
                }
                break;
            case 4:
            case 8:
            case 13:
                kjc kjcVar = (kjc) message.obj;
                t tVar4 = (t) this.j.get(kjcVar.c.o());
                if (tVar4 == null) {
                    tVar4 = h(kjcVar.c);
                }
                if (tVar4.O() && this.i.get() != kjcVar.b) {
                    kjcVar.a.a(p);
                    tVar4.K();
                    break;
                } else {
                    tVar4.E(kjcVar.a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        t tVar5 = (t) it2.next();
                        if (tVar5.o() == i2) {
                            tVar = tVar5;
                        }
                    }
                }
                if (tVar != null) {
                    if (connectionResult.h() == 13) {
                        String e = this.f.e(connectionResult.h());
                        String k = connectionResult.k();
                        t.v(tVar, new Status(17, "Error resolution was canceled by the user, original error message: " + e + ": " + k));
                        break;
                    } else {
                        t.v(tVar, g(t.t(tVar), connectionResult));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.e.getApplicationContext() instanceof Application) {
                    a.c((Application) this.e.getApplicationContext());
                    a.b().a(new o(this));
                    if (!a.b().e(true)) {
                        this.a = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                h((com.google.android.gms.common.api.b) message.obj);
                break;
            case 9:
                if (this.j.containsKey(message.obj)) {
                    ((t) this.j.get(message.obj)).J();
                    break;
                }
                break;
            case 10:
                for (mm mmVar7 : this.m) {
                    t tVar6 = (t) this.j.remove(mmVar7);
                    if (tVar6 != null) {
                        tVar6.K();
                    }
                }
                this.m.clear();
                break;
            case 11:
                if (this.j.containsKey(message.obj)) {
                    ((t) this.j.get(message.obj)).L();
                    break;
                }
                break;
            case 12:
                if (this.j.containsKey(message.obj)) {
                    ((t) this.j.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                n nVar = (n) message.obj;
                mm a = nVar.a();
                if (!this.j.containsKey(a)) {
                    nVar.b().c(Boolean.FALSE);
                    break;
                } else {
                    nVar.b().c(Boolean.valueOf(t.M((t) this.j.get(a), false)));
                    break;
                }
            case 15:
                u uVar = (u) message.obj;
                Map map = this.j;
                mmVar = uVar.a;
                if (map.containsKey(mmVar)) {
                    Map map2 = this.j;
                    mmVar2 = uVar.a;
                    t.z((t) map2.get(mmVar2), uVar);
                    break;
                }
                break;
            case 16:
                u uVar2 = (u) message.obj;
                Map map3 = this.j;
                mmVar3 = uVar2.a;
                if (map3.containsKey(mmVar3)) {
                    Map map4 = this.j;
                    mmVar4 = uVar2.a;
                    t.A((t) map4.get(mmVar4), uVar2);
                    break;
                }
                break;
            case 17:
                j();
                break;
            case 18:
                z zVar = (z) message.obj;
                if (zVar.c == 0) {
                    i().a(new TelemetryData(zVar.b, Arrays.asList(zVar.a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.c;
                    if (telemetryData != null) {
                        List k2 = telemetryData.k();
                        if (telemetryData.h() == zVar.b && (k2 == null || k2.size() < zVar.d)) {
                            this.c.p(zVar.a);
                        } else {
                            this.n.removeMessages(17);
                            j();
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zVar.a);
                        this.c = new TelemetryData(zVar.b, arrayList);
                        Handler handler2 = this.n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zVar.c);
                        break;
                    }
                }
                break;
            case 19:
                this.b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
        return true;
    }

    public final int l() {
        return this.h.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final t t(mm mmVar) {
        return (t) this.j.get(mmVar);
    }

    @NonNull
    public final y6b w(@NonNull com.google.android.gms.common.api.b bVar, @NonNull f fVar, @NonNull i iVar, @NonNull Runnable runnable) {
        a7b a7bVar = new a7b();
        k(a7bVar, fVar.e(), bVar);
        g0 g0Var = new g0(new ljc(fVar, iVar, runnable), a7bVar);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(8, new kjc(g0Var, this.i.get(), bVar)));
        return a7bVar.a();
    }

    @NonNull
    public final y6b x(@NonNull com.google.android.gms.common.api.b bVar, @NonNull d.a aVar, int i) {
        a7b a7bVar = new a7b();
        k(a7bVar, i, bVar);
        i0 i0Var = new i0(aVar, a7bVar);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(13, new kjc(i0Var, this.i.get(), bVar)));
        return a7bVar.a();
    }
}
