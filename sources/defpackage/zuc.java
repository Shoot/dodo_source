package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: zuc  reason: default package */
/* loaded from: classes2.dex */
public final class zuc extends fmc implements axc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zuc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // defpackage.axc
    public final boolean O(boolean z) throws RemoteException {
        Parcel x = x();
        gtc.a(x, true);
        Parcel C = C(2, x);
        boolean b = gtc.b(C);
        C.recycle();
        return b;
    }

    @Override // defpackage.axc
    public final String c() throws RemoteException {
        Parcel C = C(1, x());
        String readString = C.readString();
        C.recycle();
        return readString;
    }
}
