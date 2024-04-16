package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: mtc  reason: default package */
/* loaded from: classes2.dex */
public final class mtc extends jsc implements nsc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mtc(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // defpackage.nsc
    public final Bundle q(Bundle bundle) throws RemoteException {
        Parcel x = x();
        lsc.d(x, bundle);
        Parcel C = C(1, x);
        Bundle bundle2 = (Bundle) lsc.a(C, Bundle.CREATOR);
        C.recycle();
        return bundle2;
    }
}
