package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: n6d  reason: default package */
/* loaded from: classes2.dex */
public abstract class n6d extends fqc implements w7d {
    public n6d() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
