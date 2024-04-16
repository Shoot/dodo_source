package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: guc  reason: default package */
/* loaded from: classes2.dex */
public interface guc extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(huc hucVar) throws RemoteException;

    void getAppInstanceId(huc hucVar) throws RemoteException;

    void getCachedAppInstanceId(huc hucVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, huc hucVar) throws RemoteException;

    void getCurrentScreenClass(huc hucVar) throws RemoteException;

    void getCurrentScreenName(huc hucVar) throws RemoteException;

    void getGmpAppId(huc hucVar) throws RemoteException;

    void getMaxUserProperties(String str, huc hucVar) throws RemoteException;

    void getSessionId(huc hucVar) throws RemoteException;

    void getTestFlag(huc hucVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, huc hucVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(ns4 ns4Var, zzdd zzddVar, long j) throws RemoteException;

    void isDataCollectionEnabled(huc hucVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, huc hucVar, long j) throws RemoteException;

    void logHealthData(int i, String str, ns4 ns4Var, ns4 ns4Var2, ns4 ns4Var3) throws RemoteException;

    void onActivityCreated(ns4 ns4Var, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(ns4 ns4Var, long j) throws RemoteException;

    void onActivityPaused(ns4 ns4Var, long j) throws RemoteException;

    void onActivityResumed(ns4 ns4Var, long j) throws RemoteException;

    void onActivitySaveInstanceState(ns4 ns4Var, huc hucVar, long j) throws RemoteException;

    void onActivityStarted(ns4 ns4Var, long j) throws RemoteException;

    void onActivityStopped(ns4 ns4Var, long j) throws RemoteException;

    void performAction(Bundle bundle, huc hucVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(fvc fvcVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(ns4 ns4Var, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(fvc fvcVar) throws RemoteException;

    void setInstanceIdProvider(gvc gvcVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, ns4 ns4Var, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(fvc fvcVar) throws RemoteException;
}
