package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: roc  reason: default package */
/* loaded from: classes2.dex */
public abstract class roc extends fqc implements woc {
    public roc() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            b();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
