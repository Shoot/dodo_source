package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: dwc  reason: default package */
/* loaded from: classes2.dex */
public final class dwc extends olc implements hxc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public dwc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // defpackage.hxc
    public final cs4 H1(ns4 ns4Var) throws RemoteException {
        cs4 z2dVar;
        Parcel C = C();
        tsc.e(C, ns4Var);
        Parcel x = x(2, C);
        IBinder readStrongBinder = x.readStrongBinder();
        if (readStrongBinder == null) {
            z2dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof cs4) {
                z2dVar = (cs4) queryLocalInterface;
            } else {
                z2dVar = new z2d(readStrongBinder);
            }
        }
        x.recycle();
        return z2dVar;
    }

    @Override // defpackage.hxc
    public final void O0(ns4 ns4Var, int i) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        C.writeInt(i);
        T1(10, C);
    }

    @Override // defpackage.hxc
    public final void a1(ns4 ns4Var, int i) throws RemoteException {
        Parcel C = C();
        tsc.e(C, ns4Var);
        C.writeInt(i);
        T1(6, C);
    }

    @Override // defpackage.hxc
    public final int d() throws RemoteException {
        Parcel x = x(9, C());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    @Override // defpackage.hxc
    public final hr4 f() throws RemoteException {
        hr4 kqcVar;
        Parcel x = x(4, C());
        IBinder readStrongBinder = x.readStrongBinder();
        if (readStrongBinder == null) {
            kqcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof hr4) {
                kqcVar = (hr4) queryLocalInterface;
            } else {
                kqcVar = new kqc(readStrongBinder);
            }
        }
        x.recycle();
        return kqcVar;
    }

    @Override // defpackage.hxc
    public final x0d n() throws RemoteException {
        Parcel x = x(5, C());
        x0d C = wzc.C(x.readStrongBinder());
        x.recycle();
        return C;
    }
}
