package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznb;
import com.google.android.gms.measurement.internal.zzo;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: lxc  reason: default package */
/* loaded from: classes2.dex */
public interface lxc extends IInterface {
    List<zznb> C0(zzo zzoVar, boolean z) throws RemoteException;

    List<zznb> C1(String str, String str2, boolean z, zzo zzoVar) throws RemoteException;

    List<zzae> D(String str, String str2, zzo zzoVar) throws RemoteException;

    void I(zzbe zzbeVar, zzo zzoVar) throws RemoteException;

    void K0(zzo zzoVar) throws RemoteException;

    List<zznb> M(String str, String str2, String str3, boolean z) throws RemoteException;

    byte[] P(zzbe zzbeVar, String str) throws RemoteException;

    void T0(zzo zzoVar) throws RemoteException;

    void U0(Bundle bundle, zzo zzoVar) throws RemoteException;

    void W0(zzo zzoVar) throws RemoteException;

    String b1(zzo zzoVar) throws RemoteException;

    void c0(zznb zznbVar, zzo zzoVar) throws RemoteException;

    void d1(zzbe zzbeVar, String str, String str2) throws RemoteException;

    void h0(long j, String str, String str2, String str3) throws RemoteException;

    List<zzae> j0(String str, String str2, String str3) throws RemoteException;

    void j1(zzae zzaeVar, zzo zzoVar) throws RemoteException;

    void p1(zzo zzoVar) throws RemoteException;

    void q1(zzae zzaeVar) throws RemoteException;

    zzaj s0(zzo zzoVar) throws RemoteException;

    List<zzmh> z0(zzo zzoVar, Bundle bundle) throws RemoteException;
}
