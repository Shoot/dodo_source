package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: hvc  reason: default package */
/* loaded from: classes2.dex */
public final class hvc extends jsc implements fvc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hvc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.fvc
    public final void u1(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.d(x, bundle);
        x.writeLong(j);
        T1(1, x);
    }

    @Override // defpackage.fvc
    public final int zza() throws RemoteException {
        Parcel C = C(2, x());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }
}
