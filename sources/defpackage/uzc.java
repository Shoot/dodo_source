package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: uzc  reason: default package */
/* loaded from: classes2.dex */
public final class uzc extends ilc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public uzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void T1(a2d a2dVar) throws RemoteException {
        Parcel x = x();
        itc.b(x, a2dVar);
        C(1, x);
    }
}
