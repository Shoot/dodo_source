package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: gyc  reason: default package */
/* loaded from: classes2.dex */
public final class gyc extends olc implements yr4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // defpackage.yr4
    public final float A0() throws RemoteException {
        Parcel x = x(2, C());
        float readFloat = x.readFloat();
        x.recycle();
        return readFloat;
    }

    @Override // defpackage.yr4
    public final void D1(woc wocVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, wocVar);
        T1(42, C);
    }

    @Override // defpackage.yr4
    public final void G1(kpc kpcVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, kpcVar);
        T1(30, C);
    }

    @Override // defpackage.yr4
    public final jmc I0(MarkerOptions markerOptions) throws RemoteException {
        Parcel C = C();
        tsc.d(C, markerOptions);
        Parcel x = x(11, C);
        jmc C2 = ocd.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    @Override // defpackage.yr4
    public final void J0(ibd ibdVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ibdVar);
        T1(96, C);
    }

    @Override // defpackage.yr4
    public final float L0() throws RemoteException {
        Parcel x = x(3, C());
        float readFloat = x.readFloat();
        x.recycle();
        return readFloat;
    }

    @Override // defpackage.yr4
    public final void P1(enc encVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, encVar);
        T1(32, C);
    }

    @Override // defpackage.yr4
    public final void R0(w7d w7dVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, w7dVar);
        T1(99, C);
    }

    @Override // defpackage.yr4
    public final void S1(ns4 ns4Var, int i, puc pucVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        C.writeInt(i);
        tsc.e(C, pucVar);
        T1(7, C);
    }

    @Override // defpackage.yr4
    public final CameraPosition X() throws RemoteException {
        Parcel x = x(1, C());
        CameraPosition cameraPosition = (CameraPosition) tsc.a(x, CameraPosition.CREATOR);
        x.recycle();
        return cameraPosition;
    }

    @Override // defpackage.yr4
    public final void Y0(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel C = C();
        C.writeInt(i);
        C.writeInt(i2);
        C.writeInt(i3);
        C.writeInt(i4);
        T1(39, C);
    }

    @Override // defpackage.yr4
    public final void Z0(ns4 ns4Var) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        T1(5, C);
    }

    @Override // defpackage.yr4
    public final void clear() throws RemoteException {
        T1(14, C());
    }

    @Override // defpackage.yr4
    public final void d0(y0d y0dVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, y0dVar);
        T1(33, C);
    }

    @Override // defpackage.yr4
    public final void e1(rpc rpcVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, rpcVar);
        T1(31, C);
    }

    @Override // defpackage.yr4
    public final boolean f1(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel C = C();
        tsc.d(C, mapStyleOptions);
        Parcel x = x(91, C);
        boolean f = tsc.f(x);
        x.recycle();
        return f;
    }

    @Override // defpackage.yr4
    public final void o0(ns4 ns4Var) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        T1(4, C);
    }

    @Override // defpackage.yr4
    public final ps4 t0() throws RemoteException {
        ps4 hscVar;
        Parcel x = x(26, C());
        IBinder readStrongBinder = x.readStrongBinder();
        if (readStrongBinder == null) {
            hscVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof ps4) {
                hscVar = (ps4) queryLocalInterface;
            } else {
                hscVar = new hsc(readStrongBinder);
            }
        }
        x.recycle();
        return hscVar;
    }

    @Override // defpackage.yr4
    public final dt4 x1() throws RemoteException {
        dt4 oscVar;
        Parcel x = x(25, C());
        IBinder readStrongBinder = x.readStrongBinder();
        if (readStrongBinder == null) {
            oscVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof dt4) {
                oscVar = (dt4) queryLocalInterface;
            } else {
                oscVar = new osc(readStrongBinder);
            }
        }
        x.recycle();
        return oscVar;
    }
}
