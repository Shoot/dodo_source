package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: gad  reason: default package */
/* loaded from: classes2.dex */
public final class gad extends mlc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsService");
    }

    public final void T1(x9d x9dVar) throws RemoteException {
        Parcel x = x();
        rsc.b(x, x9dVar);
        C(40, x);
    }
}
