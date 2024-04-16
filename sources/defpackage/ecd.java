package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: ecd  reason: default package */
/* loaded from: classes2.dex */
public abstract class ecd extends cqc implements rcd {
    public ecd() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static rcd C(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof rcd) {
            return (rcd) queryLocalInterface;
        }
        return new ubd(iBinder);
    }

    @Override // defpackage.cqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        } else {
            ns4 d = d();
            parcel2.writeNoException();
            qsc.e(parcel2, d);
        }
        return true;
    }
}
