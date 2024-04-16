package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsRequest;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class b extends nlc implements moc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // defpackage.moc
    public final void J1(LocationSettingsRequest locationSettingsRequest, toc tocVar, String str) throws RemoteException {
        Parcel x = x();
        ssc.c(x, locationSettingsRequest);
        ssc.d(x, tocVar);
        x.writeString(null);
        T1(63, x);
    }

    @Override // defpackage.moc
    public final void K(zzbc zzbcVar) throws RemoteException {
        Parcel x = x();
        ssc.c(x, zzbcVar);
        T1(59, x);
    }

    @Override // defpackage.moc
    public final void R1(boolean z) throws RemoteException {
        Parcel x = x();
        ssc.a(x, z);
        T1(12, x);
    }

    @Override // defpackage.moc
    public final Location e0(String str) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        Parcel C = C(80, x);
        Location location = (Location) ssc.b(C, Location.CREATOR);
        C.recycle();
        return location;
    }

    @Override // defpackage.moc
    public final void l0(zzl zzlVar) throws RemoteException {
        Parcel x = x();
        ssc.c(x, zzlVar);
        T1(75, x);
    }

    @Override // defpackage.moc
    public final Location t() throws RemoteException {
        Parcel C = C(7, x());
        Location location = (Location) ssc.b(C, Location.CREATOR);
        C.recycle();
        return location;
    }
}
