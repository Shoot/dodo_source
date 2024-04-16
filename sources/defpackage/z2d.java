package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: z2d  reason: default package */
/* loaded from: classes2.dex */
public final class z2d extends olc implements cs4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z2d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // defpackage.cs4
    public final void I1(ns4 ns4Var, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        tsc.d(C, googleMapOptions);
        tsc.d(C, bundle);
        T1(2, C);
    }

    @Override // defpackage.cs4
    public final void g() throws RemoteException {
        T1(16, C());
    }

    @Override // defpackage.cs4
    public final void o() throws RemoteException {
        T1(5, C());
    }

    @Override // defpackage.cs4
    public final void onDestroy() throws RemoteException {
        T1(8, C());
    }

    @Override // defpackage.cs4
    public final void onLowMemory() throws RemoteException {
        T1(9, C());
    }

    @Override // defpackage.cs4
    public final void onPause() throws RemoteException {
        T1(6, C());
    }

    @Override // defpackage.cs4
    public final void onStart() throws RemoteException {
        T1(15, C());
    }

    @Override // defpackage.cs4
    public final void p(Bundle bundle) throws RemoteException {
        Parcel C = C();
        tsc.d(C, bundle);
        Parcel x = x(10, C);
        if (x.readInt() != 0) {
            bundle.readFromParcel(x);
        }
        x.recycle();
    }

    @Override // defpackage.cs4
    public final void u() throws RemoteException {
        T1(7, C());
    }

    @Override // defpackage.cs4
    public final void w(Bundle bundle) throws RemoteException {
        Parcel C = C();
        tsc.d(C, bundle);
        T1(3, C);
    }

    @Override // defpackage.cs4
    public final ns4 x0(ns4 ns4Var, ns4 ns4Var2, Bundle bundle) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        tsc.e(C, ns4Var2);
        tsc.d(C, bundle);
        Parcel x = x(4, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    @Override // defpackage.cs4
    public final void y0(fpc fpcVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, fpcVar);
        T1(12, C);
    }
}
