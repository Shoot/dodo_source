package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdd;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: iuc  reason: default package */
/* loaded from: classes2.dex */
public final class iuc extends jsc implements guc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public iuc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.guc
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeLong(j);
        T1(23, x);
    }

    @Override // defpackage.guc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.d(x, bundle);
        T1(9, x);
    }

    @Override // defpackage.guc
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeLong(j);
        T1(24, x);
    }

    @Override // defpackage.guc
    public final void generateEventId(huc hucVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, hucVar);
        T1(22, x);
    }

    @Override // defpackage.guc
    public final void getCachedAppInstanceId(huc hucVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, hucVar);
        T1(19, x);
    }

    @Override // defpackage.guc
    public final void getConditionalUserProperties(String str, String str2, huc hucVar) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.c(x, hucVar);
        T1(10, x);
    }

    @Override // defpackage.guc
    public final void getCurrentScreenClass(huc hucVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, hucVar);
        T1(17, x);
    }

    @Override // defpackage.guc
    public final void getCurrentScreenName(huc hucVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, hucVar);
        T1(16, x);
    }

    @Override // defpackage.guc
    public final void getGmpAppId(huc hucVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, hucVar);
        T1(21, x);
    }

    @Override // defpackage.guc
    public final void getMaxUserProperties(String str, huc hucVar) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        lsc.c(x, hucVar);
        T1(6, x);
    }

    @Override // defpackage.guc
    public final void getUserProperties(String str, String str2, boolean z, huc hucVar) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.e(x, z);
        lsc.c(x, hucVar);
        T1(5, x);
    }

    @Override // defpackage.guc
    public final void initialize(ns4 ns4Var, zzdd zzddVar, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        lsc.d(x, zzddVar);
        x.writeLong(j);
        T1(1, x);
    }

    @Override // defpackage.guc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.d(x, bundle);
        lsc.e(x, z);
        lsc.e(x, z2);
        x.writeLong(j);
        T1(2, x);
    }

    @Override // defpackage.guc
    public final void logHealthData(int i, String str, ns4 ns4Var, ns4 ns4Var2, ns4 ns4Var3) throws RemoteException {
        Parcel x = x();
        x.writeInt(i);
        x.writeString(str);
        lsc.c(x, ns4Var);
        lsc.c(x, ns4Var2);
        lsc.c(x, ns4Var3);
        T1(33, x);
    }

    @Override // defpackage.guc
    public final void onActivityCreated(ns4 ns4Var, Bundle bundle, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        lsc.d(x, bundle);
        x.writeLong(j);
        T1(27, x);
    }

    @Override // defpackage.guc
    public final void onActivityDestroyed(ns4 ns4Var, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeLong(j);
        T1(28, x);
    }

    @Override // defpackage.guc
    public final void onActivityPaused(ns4 ns4Var, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeLong(j);
        T1(29, x);
    }

    @Override // defpackage.guc
    public final void onActivityResumed(ns4 ns4Var, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeLong(j);
        T1(30, x);
    }

    @Override // defpackage.guc
    public final void onActivitySaveInstanceState(ns4 ns4Var, huc hucVar, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        lsc.c(x, hucVar);
        x.writeLong(j);
        T1(31, x);
    }

    @Override // defpackage.guc
    public final void onActivityStarted(ns4 ns4Var, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeLong(j);
        T1(25, x);
    }

    @Override // defpackage.guc
    public final void onActivityStopped(ns4 ns4Var, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeLong(j);
        T1(26, x);
    }

    @Override // defpackage.guc
    public final void registerOnMeasurementEventListener(fvc fvcVar) throws RemoteException {
        Parcel x = x();
        lsc.c(x, fvcVar);
        T1(35, x);
    }

    @Override // defpackage.guc
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel x = x();
        lsc.d(x, bundle);
        x.writeLong(j);
        T1(8, x);
    }

    @Override // defpackage.guc
    public final void setCurrentScreen(ns4 ns4Var, String str, String str2, long j) throws RemoteException {
        Parcel x = x();
        lsc.c(x, ns4Var);
        x.writeString(str);
        x.writeString(str2);
        x.writeLong(j);
        T1(15, x);
    }

    @Override // defpackage.guc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel x = x();
        lsc.e(x, z);
        T1(39, x);
    }

    @Override // defpackage.guc
    public final void setUserProperty(String str, String str2, ns4 ns4Var, boolean z, long j) throws RemoteException {
        Parcel x = x();
        x.writeString(str);
        x.writeString(str2);
        lsc.c(x, ns4Var);
        lsc.e(x, z);
        x.writeLong(j);
        T1(4, x);
    }
}
