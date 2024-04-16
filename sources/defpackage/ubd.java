package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: ubd  reason: default package */
/* loaded from: classes2.dex */
public final class ubd extends llc implements rcd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ubd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.rcd
    public final int c() throws RemoteException {
        Parcel x = x(2, C());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    @Override // defpackage.rcd
    public final ns4 d() throws RemoteException {
        Parcel x = x(1, C());
        ns4 C = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C;
    }
}
