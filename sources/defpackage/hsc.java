package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: hsc  reason: default package */
/* loaded from: classes2.dex */
public final class hsc extends olc implements ps4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hsc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // defpackage.ps4
    public final VisibleRegion f0() throws RemoteException {
        Parcel x = x(3, C());
        VisibleRegion visibleRegion = (VisibleRegion) tsc.a(x, VisibleRegion.CREATOR);
        x.recycle();
        return visibleRegion;
    }
}
