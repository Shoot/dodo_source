package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: kqc  reason: default package */
/* loaded from: classes2.dex */
public final class kqc extends olc implements hr4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public kqc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // defpackage.hr4
    public final ns4 B() throws RemoteException {
        Parcel x = x(2, C());
        ns4 C = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C;
    }

    @Override // defpackage.hr4
    public final ns4 D0(LatLng latLng, float f) throws RemoteException {
        Parcel C = C();
        tsc.d(C, latLng);
        C.writeFloat(f);
        Parcel x = x(9, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    @Override // defpackage.hr4
    public final ns4 E(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel C = C();
        tsc.d(C, latLngBounds);
        C.writeInt(i);
        Parcel x = x(10, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    @Override // defpackage.hr4
    public final ns4 r() throws RemoteException {
        Parcel x = x(1, C());
        ns4 C = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C;
    }
}
