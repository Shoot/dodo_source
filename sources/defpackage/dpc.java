package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: dpc  reason: default package */
/* loaded from: classes2.dex */
public abstract class dpc extends fqc implements fpc {
    public dpc() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        yr4 gycVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                gycVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof yr4) {
                    gycVar = (yr4) queryLocalInterface;
                } else {
                    gycVar = new gyc(readStrongBinder);
                }
            }
            tsc.b(parcel);
            y1(gycVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
