package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: ozc  reason: default package */
/* loaded from: classes2.dex */
public abstract class ozc extends fqc implements y0d {
    public ozc() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            jmc C = ocd.C(parcel.readStrongBinder());
            tsc.b(parcel);
            ns4 e = e(C);
            parcel2.writeNoException();
            tsc.e(parcel2, e);
        } else {
            jmc C2 = ocd.C(parcel.readStrongBinder());
            tsc.b(parcel);
            ns4 s = s(C2);
            parcel2.writeNoException();
            tsc.e(parcel2, s);
        }
        return true;
    }
}
