package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzaa;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: vnc  reason: default package */
/* loaded from: classes2.dex */
public abstract class vnc extends eqc implements ync {
    public vnc() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.eqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            c();
        } else {
            M1((zzaa) ssc.b(parcel, zzaa.CREATOR));
        }
        return true;
    }
}
