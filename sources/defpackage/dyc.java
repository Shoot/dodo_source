package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: dyc  reason: default package */
/* loaded from: classes2.dex */
public final class dyc extends olc implements x0d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public dyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // defpackage.x0d
    public final ns4 T(Bitmap bitmap) throws RemoteException {
        Parcel C = C();
        tsc.d(C, bitmap);
        Parcel x = x(6, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    @Override // defpackage.x0d
    public final ns4 d() throws RemoteException {
        Parcel x = x(4, C());
        ns4 C = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C;
    }
}
