package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: ipc  reason: default package */
/* loaded from: classes2.dex */
public abstract class ipc extends fqc implements kpc {
    public ipc() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            jmc C = ocd.C(parcel.readStrongBinder());
            tsc.b(parcel);
            boolean e = e(C);
            parcel2.writeNoException();
            tsc.c(parcel2, e);
            return true;
        }
        return false;
    }
}
