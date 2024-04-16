package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzj;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: omc  reason: default package */
/* loaded from: classes2.dex */
public abstract class omc extends cqc implements wr4 {
    public omc() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.cqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                qsc.b(parcel);
                t1(parcel.readInt(), parcel.readStrongBinder(), (zzj) qsc.a(parcel, zzj.CREATOR));
            } else {
                qsc.b(parcel);
                c1(parcel.readInt(), (Bundle) qsc.a(parcel, Bundle.CREATOR));
            }
        } else {
            qsc.b(parcel);
            m0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) qsc.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
