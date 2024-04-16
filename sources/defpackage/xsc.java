package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: xsc  reason: default package */
/* loaded from: classes2.dex */
public abstract class xsc extends fqc implements puc {
    public xsc() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            b();
        } else {
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
