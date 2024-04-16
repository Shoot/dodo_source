package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: hcd  reason: default package */
/* loaded from: classes2.dex */
public final class hcd extends olc implements jmc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // defpackage.jmc
    public final void A() throws RemoteException {
        T1(1, C());
    }

    @Override // defpackage.jmc
    public final void F0(LatLng latLng) throws RemoteException {
        Parcel C = C();
        tsc.d(C, latLng);
        T1(3, C);
    }

    @Override // defpackage.jmc
    public final boolean G() throws RemoteException {
        Parcel x = x(13, C());
        boolean f = tsc.f(x);
        x.recycle();
        return f;
    }

    @Override // defpackage.jmc
    public final boolean J(jmc jmcVar) throws RemoteException {
        Parcel C = C();
        tsc.e(C, jmcVar);
        Parcel x = x(16, C);
        boolean f = tsc.f(x);
        x.recycle();
        return f;
    }

    @Override // defpackage.jmc
    public final void L(float f) throws RemoteException {
        Parcel C = C();
        C.writeFloat(f);
        T1(22, C);
    }

    @Override // defpackage.jmc
    public final void Q1(ns4 ns4Var) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        T1(29, C);
    }

    @Override // defpackage.jmc
    public final int a() throws RemoteException {
        Parcel x = x(17, C());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    @Override // defpackage.jmc
    public final void g1(String str) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        T1(7, C);
    }

    @Override // defpackage.jmc
    public final ns4 h() throws RemoteException {
        Parcel x = x(30, C());
        ns4 C = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C;
    }

    @Override // defpackage.jmc
    public final LatLng i() throws RemoteException {
        Parcel x = x(4, C());
        LatLng latLng = (LatLng) tsc.a(x, LatLng.CREATOR);
        x.recycle();
        return latLng;
    }

    @Override // defpackage.jmc
    public final void i1(ns4 ns4Var) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        T1(18, C);
    }

    @Override // defpackage.jmc
    public final String k() throws RemoteException {
        Parcel x = x(6, C());
        String readString = x.readString();
        x.recycle();
        return readString;
    }

    @Override // defpackage.jmc
    public final String v() throws RemoteException {
        Parcel x = x(8, C());
        String readString = x.readString();
        x.recycle();
        return readString;
    }

    @Override // defpackage.jmc
    public final void v1(String str) throws RemoteException {
        Parcel C = C();
        C.writeString(str);
        T1(5, C);
    }

    @Override // defpackage.jmc
    public final void w1() throws RemoteException {
        T1(11, C());
    }
}
