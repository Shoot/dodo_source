package defpackage;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: m86  reason: default package */
/* loaded from: classes2.dex */
public final class m86 {
    private final jmc a;

    public m86(jmc jmcVar) {
        this.a = (jmc) gh8.j(jmcVar);
    }

    @NonNull
    public LatLng a() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String b() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public Object c() {
        try {
            return k57.T1(this.a.h());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String d() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean e() {
        try {
            return this.a.G();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m86)) {
            return false;
        }
        try {
            return this.a.J(((m86) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void f() {
        try {
            this.a.A();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void g(sb0 sb0Var) {
        try {
            if (sb0Var == null) {
                this.a.i1(null);
                return;
            }
            this.a.i1(sb0Var.a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void h(@NonNull LatLng latLng) {
        if (latLng != null) {
            try {
                this.a.F0(latLng);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public int hashCode() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void i(float f) {
        try {
            this.a.L(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void j(String str) {
        try {
            this.a.g1(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void k(Object obj) {
        try {
            this.a.Q1(k57.U1(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void l(String str) {
        try {
            this.a.v1(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void m() {
        try {
            this.a.w1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
