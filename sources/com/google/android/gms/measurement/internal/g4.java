package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class g4 extends jsc implements lxc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.lxc
    public final List<zznb> C1(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.e(x, z);
        lsc.d(x, zzoVar);
        Parcel C = C(14, x);
        ArrayList createTypedArrayList = C.createTypedArrayList(zznb.CREATOR);
        C.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lxc
    public final List<zzae> D(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.d(x, zzoVar);
        Parcel C = C(16, x);
        ArrayList createTypedArrayList = C.createTypedArrayList(zzae.CREATOR);
        C.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lxc
    public final void I(zzbe zzbeVar, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzbeVar);
        lsc.d(x, zzoVar);
        T1(1, x);
    }

    @Override // defpackage.lxc
    public final void K0(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        T1(18, x);
    }

    @Override // defpackage.lxc
    public final List<zznb> M(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        x.writeString(str3);
        lsc.e(x, z);
        Parcel C = C(15, x);
        ArrayList createTypedArrayList = C.createTypedArrayList(zznb.CREATOR);
        C.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lxc
    public final byte[] P(zzbe zzbeVar, String str) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzbeVar);
        x.writeString(str);
        Parcel C = C(9, x);
        byte[] createByteArray = C.createByteArray();
        C.recycle();
        return createByteArray;
    }

    @Override // defpackage.lxc
    public final void T0(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        T1(20, x);
    }

    @Override // defpackage.lxc
    public final void U0(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, bundle);
        lsc.d(x, zzoVar);
        T1(19, x);
    }

    @Override // defpackage.lxc
    public final void W0(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        T1(6, x);
    }

    @Override // defpackage.lxc
    public final String b1(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        Parcel C = C(11, x);
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // defpackage.lxc
    public final void c0(zznb zznbVar, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zznbVar);
        lsc.d(x, zzoVar);
        T1(2, x);
    }

    @Override // defpackage.lxc
    public final void d1(zzbe zzbeVar, String str, String str2) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzbeVar);
        x.writeString(str);
        x.writeString(str2);
        T1(5, x);
    }

    @Override // defpackage.lxc
    public final void h0(long j, String str, String str2, String str3) throws RemoteException {
        Parcel x = x();
        x.writeLong(j);
        x.writeString(str);
        x.writeString(str2);
        x.writeString(str3);
        T1(10, x);
    }

    @Override // defpackage.lxc
    public final List<zzae> j0(String str, String str2, String str3) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        x.writeString(str3);
        Parcel C = C(17, x);
        ArrayList createTypedArrayList = C.createTypedArrayList(zzae.CREATOR);
        C.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lxc
    public final void j1(zzae zzaeVar, zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzaeVar);
        lsc.d(x, zzoVar);
        T1(12, x);
    }

    @Override // defpackage.lxc
    public final void p1(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        T1(4, x);
    }

    @Override // defpackage.lxc
    public final void q1(zzae zzaeVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzaeVar);
        T1(13, x);
    }

    @Override // defpackage.lxc
    public final zzaj s0(zzo zzoVar) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        Parcel C = C(21, x);
        zzaj zzajVar = (zzaj) lsc.a(C, zzaj.CREATOR);
        C.recycle();
        return zzajVar;
    }

    @Override // defpackage.lxc
    public final List<zzmh> z0(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel x = x();
        lsc.d(x, zzoVar);
        lsc.d(x, bundle);
        Parcel C = C(24, x);
        ArrayList createTypedArrayList = C.createTypedArrayList(zzmh.CREATOR);
        C.recycle();
        return createTypedArrayList;
    }
}
