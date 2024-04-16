package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class t implements c.b, c.InterfaceC0218c {
    private final a.f b;
    private final mm c;
    private final l d;
    private final int g;
    private final sjc h;
    private boolean i;
    final /* synthetic */ c m;
    private final Queue a = new LinkedList();
    private final Set e = new HashSet();
    private final Map f = new HashMap();
    private final List j = new ArrayList();
    private ConnectionResult k = null;
    private int l = 0;

    public t(c cVar, com.google.android.gms.common.api.b bVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.m = cVar;
        handler = cVar.n;
        a.f u = bVar.u(handler.getLooper(), this);
        this.b = u;
        this.c = bVar.o();
        this.d = new l();
        this.g = bVar.t();
        if (u.f()) {
            context = cVar.e;
            handler2 = cVar.n;
            this.h = bVar.v(context, handler2);
            return;
        }
        this.h = null;
    }

    public static /* bridge */ /* synthetic */ void A(t tVar, u uVar) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] g;
        if (tVar.j.remove(uVar)) {
            handler = tVar.m.n;
            handler.removeMessages(15, uVar);
            handler2 = tVar.m.n;
            handler2.removeMessages(16, uVar);
            feature = uVar.b;
            ArrayList arrayList = new ArrayList(tVar.a.size());
            for (j0 j0Var : tVar.a) {
                if ((j0Var instanceof hjc) && (g = ((hjc) j0Var).g(tVar)) != null && sr.b(g, feature)) {
                    arrayList.add(j0Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                j0 j0Var2 = (j0) arrayList.get(i);
                tVar.a.remove(j0Var2);
                j0Var2.b(new UnsupportedApiCallException(feature));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean M(t tVar, boolean z) {
        return tVar.n(false);
    }

    private final Feature b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] l = this.b.l();
            if (l == null) {
                l = new Feature[0];
            }
            lr lrVar = new lr(l.length);
            for (Feature feature : l) {
                lrVar.put(feature.h(), Long.valueOf(feature.k()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) lrVar.get(feature2.h());
                if (l2 == null || l2.longValue() < feature2.k()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void c(ConnectionResult connectionResult) {
        String str;
        for (skc skcVar : this.e) {
            if (m57.a(connectionResult, ConnectionResult.e)) {
                str = this.b.c();
            } else {
                str = null;
            }
            skcVar.b(this.c, connectionResult, str);
        }
        this.e.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z) {
        Handler handler;
        boolean z2;
        handler = this.m.n;
        gh8.d(handler);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (!z || j0Var.a == 2) {
                    if (status != null) {
                        j0Var.a(status);
                    } else {
                        j0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j0 j0Var = (j0) arrayList.get(i);
            if (this.b.isConnected()) {
                if (l(j0Var)) {
                    this.a.remove(j0Var);
                }
            } else {
                return;
            }
        }
    }

    public final void g() {
        B();
        c(ConnectionResult.e);
        k();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ljc ljcVar = (ljc) it.next();
            if (b(ljcVar.a.c()) != null) {
                it.remove();
            } else {
                try {
                    ljcVar.a.d(this.b, new a7b<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        i();
    }

    public final void h(int i) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        rkc rkcVar;
        B();
        this.i = true;
        this.d.e(i, this.b.m());
        c cVar = this.m;
        handler = cVar.n;
        handler2 = cVar.n;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
        c cVar2 = this.m;
        handler3 = cVar2.n;
        handler4 = cVar2.n;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, this.c), 120000L);
        rkcVar = this.m.g;
        rkcVar.c();
        for (ljc ljcVar : this.f.values()) {
            ljcVar.c.run();
        }
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.m.n;
        handler.removeMessages(12, this.c);
        c cVar = this.m;
        handler2 = cVar.n;
        handler3 = cVar.n;
        Message obtainMessage = handler3.obtainMessage(12, this.c);
        j = this.m.a;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    private final void j(j0 j0Var) {
        j0Var.d(this.d, O());
        try {
            j0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        Handler handler;
        Handler handler2;
        if (this.i) {
            handler = this.m.n;
            handler.removeMessages(11, this.c);
            handler2 = this.m.n;
            handler2.removeMessages(9, this.c);
            this.i = false;
        }
    }

    private final boolean l(j0 j0Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        if (!(j0Var instanceof hjc)) {
            j(j0Var);
            return true;
        }
        hjc hjcVar = (hjc) j0Var;
        Feature b = b(hjcVar.g(this));
        if (b == null) {
            j(j0Var);
            return true;
        }
        String name = this.b.getClass().getName();
        String h = b.h();
        long k = b.k();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + h + ", " + k + ").");
        z = this.m.o;
        if (z && hjcVar.f(this)) {
            u uVar = new u(this.c, b, null);
            int indexOf = this.j.indexOf(uVar);
            if (indexOf >= 0) {
                u uVar2 = (u) this.j.get(indexOf);
                handler5 = this.m.n;
                handler5.removeMessages(15, uVar2);
                c cVar = this.m;
                handler6 = cVar.n;
                handler7 = cVar.n;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, uVar2), 5000L);
                return false;
            }
            this.j.add(uVar);
            c cVar2 = this.m;
            handler = cVar2.n;
            handler2 = cVar2.n;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, uVar), 5000L);
            c cVar3 = this.m;
            handler3 = cVar3.n;
            handler4 = cVar3.n;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, uVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!m(connectionResult)) {
                this.m.f(connectionResult, this.g);
                return false;
            }
            return false;
        }
        hjcVar.b(new UnsupportedApiCallException(b));
        return true;
    }

    private final boolean m(@NonNull ConnectionResult connectionResult) {
        Object obj;
        m mVar;
        Set set;
        m mVar2;
        obj = c.r;
        synchronized (obj) {
            try {
                c cVar = this.m;
                mVar = cVar.k;
                if (mVar != null) {
                    set = cVar.l;
                    if (set.contains(this.c)) {
                        mVar2 = this.m.k;
                        mVar2.s(connectionResult, this.g);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n(boolean z) {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        if (!this.b.isConnected() || this.f.size() != 0) {
            return false;
        }
        if (this.d.g()) {
            if (z) {
                i();
            }
            return false;
        }
        this.b.b("Timing out service connection.");
        return true;
    }

    public static /* bridge */ /* synthetic */ mm t(t tVar) {
        return tVar.c;
    }

    public static /* bridge */ /* synthetic */ void v(t tVar, Status status) {
        tVar.d(status);
    }

    public static /* bridge */ /* synthetic */ void z(t tVar, u uVar) {
        if (tVar.j.contains(uVar) && !tVar.i) {
            if (!tVar.b.isConnected()) {
                tVar.D();
            } else {
                tVar.f();
            }
        }
    }

    public final void B() {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        this.k = null;
    }

    @Override // defpackage.q77
    public final void C(@NonNull ConnectionResult connectionResult) {
        G(connectionResult, null);
    }

    public final void D() {
        Handler handler;
        rkc rkcVar;
        Context context;
        handler = this.m.n;
        gh8.d(handler);
        if (!this.b.isConnected() && !this.b.isConnecting()) {
            try {
                c cVar = this.m;
                rkcVar = cVar.g;
                context = cVar.e;
                int b = rkcVar.b(context, this.b);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, null);
                    String name = this.b.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    G(connectionResult, null);
                    return;
                }
                c cVar2 = this.m;
                a.f fVar = this.b;
                w wVar = new w(cVar2, fVar, this.c);
                if (fVar.f()) {
                    ((sjc) gh8.j(this.h)).W1(wVar);
                }
                try {
                    this.b.d(wVar);
                } catch (SecurityException e) {
                    G(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                G(new ConnectionResult(10), e2);
            }
        }
    }

    public final void E(j0 j0Var) {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        if (this.b.isConnected()) {
            if (l(j0Var)) {
                i();
                return;
            } else {
                this.a.add(j0Var);
                return;
            }
        }
        this.a.add(j0Var);
        ConnectionResult connectionResult = this.k;
        if (connectionResult != null && connectionResult.t()) {
            G(this.k, null);
        } else {
            D();
        }
    }

    public final void F() {
        this.l++;
    }

    public final void G(@NonNull ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        rkc rkcVar;
        boolean z;
        Status g;
        Status g2;
        Status g3;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.m.n;
        gh8.d(handler);
        sjc sjcVar = this.h;
        if (sjcVar != null) {
            sjcVar.X1();
        }
        B();
        rkcVar = this.m.g;
        rkcVar.c();
        c(connectionResult);
        if ((this.b instanceof blc) && connectionResult.h() != 24) {
            this.m.b = true;
            c cVar = this.m;
            handler5 = cVar.n;
            handler6 = cVar.n;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.h() == 4) {
            status = c.q;
            d(status);
        } else if (this.a.isEmpty()) {
            this.k = connectionResult;
        } else if (exc != null) {
            handler4 = this.m.n;
            gh8.d(handler4);
            e(null, exc, false);
        } else {
            z = this.m.o;
            if (z) {
                g2 = c.g(this.c, connectionResult);
                e(g2, null, true);
                if (!this.a.isEmpty() && !m(connectionResult) && !this.m.f(connectionResult, this.g)) {
                    if (connectionResult.h() == 18) {
                        this.i = true;
                    }
                    if (!this.i) {
                        g3 = c.g(this.c, connectionResult);
                        d(g3);
                        return;
                    }
                    c cVar2 = this.m;
                    handler2 = cVar2.n;
                    handler3 = cVar2.n;
                    handler2.sendMessageDelayed(Message.obtain(handler3, 9, this.c), 5000L);
                    return;
                }
                return;
            }
            g = c.g(this.c, connectionResult);
            d(g);
        }
    }

    public final void H(@NonNull ConnectionResult connectionResult) {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        a.f fVar = this.b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.b("onSignInFailed for " + name + " with " + valueOf);
        G(connectionResult, null);
    }

    public final void I(skc skcVar) {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        this.e.add(skcVar);
    }

    public final void J() {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        if (this.i) {
            D();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        d(c.p);
        this.d.f();
        for (d.a aVar : (d.a[]) this.f.keySet().toArray(new d.a[0])) {
            E(new i0(aVar, new a7b()));
        }
        c(new ConnectionResult(4));
        if (this.b.isConnected()) {
            this.b.j(new s(this));
        }
    }

    public final void L() {
        Handler handler;
        com.google.android.gms.common.a aVar;
        Context context;
        Status status;
        handler = this.m.n;
        gh8.d(handler);
        if (this.i) {
            k();
            c cVar = this.m;
            aVar = cVar.f;
            context = cVar.e;
            if (aVar.g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.b.b("Timing out connection while resuming.");
        }
    }

    public final boolean N() {
        return this.b.isConnected();
    }

    public final boolean O() {
        return this.b.f();
    }

    @ResultIgnorabilityUnspecified
    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.g;
    }

    @Override // defpackage.pq1
    public final void onConnectionSuspended(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.m.n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.m.n;
            handler2.post(new q(this, i));
            return;
        }
        h(i);
    }

    public final int p() {
        return this.l;
    }

    public final ConnectionResult q() {
        Handler handler;
        handler = this.m.n;
        gh8.d(handler);
        return this.k;
    }

    public final a.f s() {
        return this.b;
    }

    public final Map u() {
        return this.f;
    }

    @Override // defpackage.pq1
    public final void x(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.m.n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.m.n;
            handler2.post(new p(this));
            return;
        }
        g();
    }
}
