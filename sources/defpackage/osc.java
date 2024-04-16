package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: osc  reason: default package */
/* loaded from: classes2.dex */
public final class osc extends olc implements dt4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public osc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // defpackage.dt4
    public final void p0(boolean z) throws RemoteException {
        Parcel C = C();
        tsc.c(C, z);
        T1(18, C);
    }

    @Override // defpackage.dt4
    public final void r0(boolean z) throws RemoteException {
        Parcel C = C();
        tsc.c(C, z);
        T1(8, C);
    }

    @Override // defpackage.dt4
    public final void r1(boolean z) throws RemoteException {
        Parcel C = C();
        tsc.c(C, z);
        T1(7, C);
    }
}
