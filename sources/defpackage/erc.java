package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: erc  reason: default package */
/* loaded from: classes2.dex */
public abstract class erc extends eqc implements grc {
    public static grc C(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof grc) {
            return (grc) queryLocalInterface;
        }
        return new crc(iBinder);
    }

    @Override // defpackage.eqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            H((Location) ssc.b(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
