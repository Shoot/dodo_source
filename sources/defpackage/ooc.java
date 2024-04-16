package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: ooc  reason: default package */
/* loaded from: classes2.dex */
public abstract class ooc extends eqc implements toc {
    public ooc() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // defpackage.eqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            S((LocationSettingsResult) ssc.b(parcel, LocationSettingsResult.CREATOR));
            return true;
        }
        return false;
    }
}
