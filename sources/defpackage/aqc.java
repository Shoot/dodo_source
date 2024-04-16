package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: aqc  reason: default package */
/* loaded from: classes2.dex */
public abstract class aqc extends eqc implements arc {
    public aqc() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static arc C(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof arc) {
            return (arc) queryLocalInterface;
        }
        return new wpc(iBinder);
    }

    @Override // defpackage.eqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            a0((LocationAvailability) ssc.b(parcel, LocationAvailability.CREATOR));
        } else {
            P0((LocationResult) ssc.b(parcel, LocationResult.CREATOR));
        }
        return true;
    }
}
