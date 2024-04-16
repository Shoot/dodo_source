package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: luc  reason: default package */
/* loaded from: classes2.dex */
public abstract class luc extends msc implements fvc {
    public luc() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.msc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        } else {
            long readLong = parcel.readLong();
            lsc.f(parcel);
            u1(parcel.readString(), parcel.readString(), (Bundle) lsc.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
