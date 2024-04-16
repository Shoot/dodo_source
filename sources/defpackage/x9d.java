package defpackage;

import android.content.pm.PackageInfo;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.internal.instantapps.zzaj;
import com.google.android.gms.internal.instantapps.zzam;
import com.google.android.gms.internal.instantapps.zzav;
import com.google.android.gms.internal.instantapps.zzn;
import com.google.android.gms.internal.instantapps.zzt;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: x9d  reason: default package */
/* loaded from: classes2.dex */
public interface x9d extends IInterface {
    void A1(Status status, boolean z) throws RemoteException;

    void F(Status status, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void G0(Status status, BitmapTeleporter bitmapTeleporter) throws RemoteException;

    void M0(Status status, zzam zzamVar) throws RemoteException;

    void R(Status status, PackageInfo packageInfo) throws RemoteException;

    void S0(Status status, zzn zznVar) throws RemoteException;

    void W(Status status, zzt zztVar) throws RemoteException;

    void g0(Status status, LaunchData launchData) throws RemoteException;

    void l(Status status, boolean z) throws RemoteException;

    void m(int i) throws RemoteException;

    void m1(Status status, List<zzav> list) throws RemoteException;

    void n0(Status status, zzaj zzajVar) throws RemoteException;
}
