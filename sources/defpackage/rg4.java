package defpackage;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: rg4  reason: default package */
/* loaded from: classes2.dex */
public class rg4 {
    private final yr4 a;
    private final HashMap b = new HashMap();
    private aqb c;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$b */
    /* loaded from: classes2.dex */
    public interface b {
        View b(@NonNull m86 m86Var);

        View f(@NonNull m86 m86Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$c */
    /* loaded from: classes2.dex */
    public interface c {
        void b();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(int i);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$e */
    /* loaded from: classes2.dex */
    public interface e {
        void g(@NonNull m86 m86Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$f */
    /* loaded from: classes2.dex */
    public interface f {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$g */
    /* loaded from: classes2.dex */
    public interface g {
        boolean a(@NonNull m86 m86Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: rg4$h */
    /* loaded from: classes2.dex */
    public interface h {
        void c(@NonNull m86 m86Var);

        void d(@NonNull m86 m86Var);

        void e(@NonNull m86 m86Var);
    }

    public rg4(@NonNull yr4 yr4Var) {
        this.a = (yr4) gh8.j(yr4Var);
    }

    public final m86 a(@NonNull MarkerOptions markerOptions) {
        try {
            gh8.k(markerOptions, "MarkerOptions must not be null.");
            jmc I0 = this.a.I0(markerOptions);
            if (I0 != null) {
                return new m86(I0);
            }
            return null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void b(@NonNull um0 um0Var) {
        try {
            gh8.k(um0Var, "CameraUpdate must not be null.");
            this.a.Z0(um0Var.a());
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void c(@NonNull um0 um0Var, int i, a aVar) {
        mmc mmcVar;
        try {
            gh8.k(um0Var, "CameraUpdate must not be null.");
            yr4 yr4Var = this.a;
            ns4 a2 = um0Var.a();
            if (aVar == null) {
                mmcVar = null;
            } else {
                mmcVar = new mmc(aVar);
            }
            yr4Var.S1(a2, i, mmcVar);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void d() {
        try {
            this.a.clear();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final CameraPosition e() {
        try {
            return this.a.X();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float f() {
        try {
            return this.a.A0();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float g() {
        try {
            return this.a.L0();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final gp8 h() {
        try {
            return new gp8(this.a.t0());
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final aqb i() {
        try {
            if (this.c == null) {
                this.c = new aqb(this.a.x1());
            }
            return this.c;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j(@NonNull um0 um0Var) {
        try {
            gh8.k(um0Var, "CameraUpdate must not be null.");
            this.a.o0(um0Var.a());
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void k(b bVar) {
        try {
            if (bVar == null) {
                this.a.d0(null);
            } else {
                this.a.d0(new gxc(this, bVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean l(MapStyleOptions mapStyleOptions) {
        try {
            return this.a.f1(mapStyleOptions);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void m(c cVar) {
        try {
            if (cVar == null) {
                this.a.R0(null);
            } else {
                this.a.R0(new ccd(this, cVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n(d dVar) {
        try {
            if (dVar == null) {
                this.a.J0(null);
            } else {
                this.a.J0(new yad(this, dVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o(e eVar) {
        try {
            if (eVar == null) {
                this.a.P1(null);
            } else {
                this.a.P1(new wsc(this, eVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void p(f fVar) {
        try {
            if (fVar == null) {
                this.a.D1(null);
            } else {
                this.a.D1(new e2d(this, fVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q(g gVar) {
        try {
            if (gVar == null) {
                this.a.G1(null);
            } else {
                this.a.G1(new ulc(this, gVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void r(h hVar) {
        try {
            if (hVar == null) {
                this.a.e1(null);
            } else {
                this.a.e1(new jqc(this, hVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        try {
            this.a.Y0(i, i2, i3, i4);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
