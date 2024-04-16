package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: juc  reason: default package */
/* loaded from: classes2.dex */
public final class juc extends jsc implements huc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public juc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.huc
    public final void q(Bundle bundle) throws RemoteException {
        Parcel x = x();
        lsc.d(x, bundle);
        T1(1, x);
    }
}
