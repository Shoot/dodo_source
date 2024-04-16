package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.internal.location.i;
import com.google.android.gms.internal.location.m;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: ypc  reason: default package */
/* loaded from: classes2.dex */
public final class ypc extends m {
    private final i K;

    public ypc(Context context, Looper looper, c.b bVar, c.InterfaceC0218c interfaceC0218c, String str, n91 n91Var) {
        super(context, looper, bVar, interfaceC0218c, str, n91Var);
        this.K = new i(context, this.J);
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean P() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        synchronized (this.K) {
            if (isConnected()) {
                try {
                    this.K.f();
                    this.K.g();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public final void k0(zzba zzbaVar, d<pv5> dVar, ync yncVar) throws RemoteException {
        synchronized (this.K) {
            this.K.c(zzbaVar, dVar, yncVar);
        }
    }

    public final void l0(d.a<pv5> aVar, ync yncVar) throws RemoteException {
        this.K.d(aVar, yncVar);
    }

    public final void m0(LocationSettingsRequest locationSettingsRequest, p70<LocationSettingsResult> p70Var, String str) throws RemoteException {
        boolean z;
        o();
        boolean z2 = false;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        gh8.b(z, "locationSettingsRequest can't be null nor empty.");
        if (p70Var != null) {
            z2 = true;
        }
        gh8.b(z2, "listener can't be null.");
        ((moc) A()).J1(locationSettingsRequest, new xpc(p70Var), null);
    }

    public final Location n0(String str) throws RemoteException {
        if (sr.b(l(), xad.c)) {
            return this.K.a(str);
        }
        return this.K.b();
    }
}
