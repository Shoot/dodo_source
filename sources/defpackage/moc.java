package defpackage;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.location.LocationSettingsRequest;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: moc  reason: default package */
/* loaded from: classes2.dex */
public interface moc extends IInterface {
    void J1(LocationSettingsRequest locationSettingsRequest, toc tocVar, String str) throws RemoteException;

    void K(zzbc zzbcVar) throws RemoteException;

    void R1(boolean z) throws RemoteException;

    Location e0(String str) throws RemoteException;

    void l0(zzl zzlVar) throws RemoteException;

    @Deprecated
    Location t() throws RemoteException;
}
