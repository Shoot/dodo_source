package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: kuc  reason: default package */
/* loaded from: classes2.dex */
public abstract class kuc extends msc implements huc {
    public kuc() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.msc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            lsc.f(parcel);
            q((Bundle) lsc.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
