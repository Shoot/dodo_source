package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: qpc  reason: default package */
/* loaded from: classes2.dex */
public class qpc extends eqc implements tpc {
    public static tpc C(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof tpc) {
            return (tpc) queryLocalInterface;
        }
        return new mpc(iBinder);
    }

    @Override // defpackage.eqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
