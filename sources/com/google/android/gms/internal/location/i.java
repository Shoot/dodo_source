package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.d;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class i {
    private final nrc<moc> a;
    private final Context b;
    private boolean c = false;
    private final Map<d.a<vv5>, h> d = new HashMap();
    private final Map<d.a, f> e = new HashMap();
    private final Map<d.a<pv5>, e> f = new HashMap();

    public i(Context context, nrc<moc> nrcVar) {
        this.b = context;
        this.a = nrcVar;
    }

    public final Location a(String str) throws RemoteException {
        m.j0(((l) this.a).a);
        return ((l) this.a).a().e0(str);
    }

    @Deprecated
    public final Location b() throws RemoteException {
        m.j0(((l) this.a).a);
        return ((l) this.a).a().t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(zzba zzbaVar, com.google.android.gms.common.api.internal.d<pv5> dVar, ync yncVar) throws RemoteException {
        e eVar;
        m.j0(((l) this.a).a);
        d.a<pv5> b = dVar.b();
        if (b == null) {
            eVar = null;
        } else {
            synchronized (this.f) {
                try {
                    e eVar2 = this.f.get(b);
                    if (eVar2 == null) {
                        eVar2 = new e(dVar);
                    }
                    eVar = eVar2;
                    this.f.put(b, eVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e eVar3 = eVar;
        if (eVar3 == null) {
            return;
        }
        ((l) this.a).a().K(new zzbc(1, zzbaVar, null, null, eVar3, yncVar));
    }

    public final void d(d.a<pv5> aVar, ync yncVar) throws RemoteException {
        m.j0(((l) this.a).a);
        gh8.k(aVar, "Invalid null listener key");
        synchronized (this.f) {
            try {
                e remove = this.f.remove(aVar);
                if (remove != null) {
                    remove.c();
                    ((l) this.a).a().K(zzbc.k(remove, yncVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z) throws RemoteException {
        m.j0(((l) this.a).a);
        ((l) this.a).a().R1(z);
        this.c = z;
    }

    public final void f() throws RemoteException {
        synchronized (this.d) {
            try {
                for (h hVar : this.d.values()) {
                    if (hVar != null) {
                        ((l) this.a).a().K(zzbc.h(hVar, null));
                    }
                }
                this.d.clear();
            } finally {
            }
        }
        synchronized (this.f) {
            try {
                for (e eVar : this.f.values()) {
                    if (eVar != null) {
                        ((l) this.a).a().K(zzbc.k(eVar, null));
                    }
                }
                this.f.clear();
            } finally {
            }
        }
        synchronized (this.e) {
            try {
                for (f fVar : this.e.values()) {
                    if (fVar != null) {
                        ((l) this.a).a().l0(new zzl(2, null, fVar, null));
                    }
                }
                this.e.clear();
            } finally {
            }
        }
    }

    public final void g() throws RemoteException {
        if (this.c) {
            e(false);
        }
    }
}
