package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends fuc {
    u5 a = null;
    private final Map<Integer, h1d> b = new lr();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
    /* loaded from: classes2.dex */
    class a implements h1d {
        private fvc a;

        a(fvc fvcVar) {
            this.a = fvcVar;
        }

        @Override // defpackage.h1d
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.u1(str, str2, bundle, j);
            } catch (RemoteException e) {
                u5 u5Var = AppMeasurementDynamiteService.this.a;
                if (u5Var != null) {
                    u5Var.n().K().b("Event listener threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
    /* loaded from: classes2.dex */
    public class b implements i1d {
        private fvc a;

        b(fvc fvcVar) {
            this.a = fvcVar;
        }

        @Override // defpackage.i1d
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.u1(str, str2, bundle, j);
            } catch (RemoteException e) {
                u5 u5Var = AppMeasurementDynamiteService.this.a;
                if (u5Var != null) {
                    u5Var.n().K().b("Event interceptor threw exception", e);
                }
            }
        }
    }

    private final void C() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    private final void T1(huc hucVar, String str) {
        C();
        this.a.K().W(hucVar, str);
    }

    @Override // defpackage.guc
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        C();
        this.a.x().y(str, j);
    }

    @Override // defpackage.guc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        C();
        this.a.G().V(str, str2, bundle);
    }

    @Override // defpackage.guc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        C();
        this.a.G().P(null);
    }

    @Override // defpackage.guc
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        C();
        this.a.x().C(str, j);
    }

    @Override // defpackage.guc
    public void generateEventId(huc hucVar) throws RemoteException {
        C();
        long O0 = this.a.K().O0();
        C();
        this.a.K().U(hucVar, O0);
    }

    @Override // defpackage.guc
    public void getAppInstanceId(huc hucVar) throws RemoteException {
        C();
        this.a.k().C(new r6(this, hucVar));
    }

    @Override // defpackage.guc
    public void getCachedAppInstanceId(huc hucVar) throws RemoteException {
        C();
        T1(hucVar, this.a.G().i0());
    }

    @Override // defpackage.guc
    public void getConditionalUserProperties(String str, String str2, huc hucVar) throws RemoteException {
        C();
        this.a.k().C(new ga(this, hucVar, str, str2));
    }

    @Override // defpackage.guc
    public void getCurrentScreenClass(huc hucVar) throws RemoteException {
        C();
        T1(hucVar, this.a.G().j0());
    }

    @Override // defpackage.guc
    public void getCurrentScreenName(huc hucVar) throws RemoteException {
        C();
        T1(hucVar, this.a.G().k0());
    }

    @Override // defpackage.guc
    public void getGmpAppId(huc hucVar) throws RemoteException {
        C();
        T1(hucVar, this.a.G().l0());
    }

    @Override // defpackage.guc
    public void getMaxUserProperties(String str, huc hucVar) throws RemoteException {
        C();
        this.a.G();
        gh8.f(str);
        C();
        this.a.K().T(hucVar, 25);
    }

    @Override // defpackage.guc
    public void getSessionId(huc hucVar) throws RemoteException {
        C();
        z6 G = this.a.G();
        G.k().C(new y7(G, hucVar));
    }

    @Override // defpackage.guc
    public void getTestFlag(huc hucVar, int i) throws RemoteException {
        C();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.a.K().Y(hucVar, this.a.G().e0().booleanValue());
                            return;
                        }
                        return;
                    }
                    this.a.K().T(hucVar, this.a.G().g0().intValue());
                    return;
                }
                jb K = this.a.K();
                double doubleValue = this.a.G().f0().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    hucVar.q(bundle);
                    return;
                } catch (RemoteException e) {
                    K.a.n().K().b("Error returning double value to wrapper", e);
                    return;
                }
            }
            this.a.K().U(hucVar, this.a.G().h0().longValue());
            return;
        }
        this.a.K().W(hucVar, this.a.G().m0());
    }

    @Override // defpackage.guc
    public void getUserProperties(String str, String str2, boolean z, huc hucVar) throws RemoteException {
        C();
        this.a.k().C(new h8(this, hucVar, str, str2, z));
    }

    @Override // defpackage.guc
    public void initForTests(@NonNull Map map) throws RemoteException {
        C();
    }

    @Override // defpackage.guc
    public void initialize(ns4 ns4Var, zzdd zzddVar, long j) throws RemoteException {
        u5 u5Var = this.a;
        if (u5Var == null) {
            this.a = u5.a((Context) gh8.j((Context) k57.T1(ns4Var)), zzddVar, Long.valueOf(j));
        } else {
            u5Var.n().K().a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.guc
    public void isDataCollectionEnabled(huc hucVar) throws RemoteException {
        C();
        this.a.k().C(new g9(this, hucVar));
    }

    @Override // defpackage.guc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        C();
        this.a.G().X(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.guc
    public void logEventAndBundle(String str, String str2, Bundle bundle, huc hucVar, long j) throws RemoteException {
        Bundle bundle2;
        C();
        gh8.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.k().C(new q5(this, hucVar, new zzbe(str2, new zzaz(bundle), "app", j), str));
    }

    @Override // defpackage.guc
    public void logHealthData(int i, @NonNull String str, @NonNull ns4 ns4Var, @NonNull ns4 ns4Var2, @NonNull ns4 ns4Var3) throws RemoteException {
        Object T1;
        Object T12;
        C();
        Object obj = null;
        if (ns4Var == null) {
            T1 = null;
        } else {
            T1 = k57.T1(ns4Var);
        }
        if (ns4Var2 == null) {
            T12 = null;
        } else {
            T12 = k57.T1(ns4Var2);
        }
        if (ns4Var3 != null) {
            obj = k57.T1(ns4Var3);
        }
        this.a.n().y(i, true, false, str, T1, T12, obj);
    }

    @Override // defpackage.guc
    public void onActivityCreated(@NonNull ns4 ns4Var, @NonNull Bundle bundle, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityCreated((Activity) k57.T1(ns4Var), bundle);
        }
    }

    @Override // defpackage.guc
    public void onActivityDestroyed(@NonNull ns4 ns4Var, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityDestroyed((Activity) k57.T1(ns4Var));
        }
    }

    @Override // defpackage.guc
    public void onActivityPaused(@NonNull ns4 ns4Var, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityPaused((Activity) k57.T1(ns4Var));
        }
    }

    @Override // defpackage.guc
    public void onActivityResumed(@NonNull ns4 ns4Var, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityResumed((Activity) k57.T1(ns4Var));
        }
    }

    @Override // defpackage.guc
    public void onActivitySaveInstanceState(ns4 ns4Var, huc hucVar, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        Bundle bundle = new Bundle();
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivitySaveInstanceState((Activity) k57.T1(ns4Var), bundle);
        }
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.guc
    public void onActivityStarted(@NonNull ns4 ns4Var, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityStarted((Activity) k57.T1(ns4Var));
        }
    }

    @Override // defpackage.guc
    public void onActivityStopped(@NonNull ns4 ns4Var, long j) throws RemoteException {
        C();
        f8 f8Var = this.a.G().c;
        if (f8Var != null) {
            this.a.G().o0();
            f8Var.onActivityStopped((Activity) k57.T1(ns4Var));
        }
    }

    @Override // defpackage.guc
    public void performAction(Bundle bundle, huc hucVar, long j) throws RemoteException {
        C();
        hucVar.q(null);
    }

    @Override // defpackage.guc
    public void registerOnMeasurementEventListener(fvc fvcVar) throws RemoteException {
        h1d h1dVar;
        C();
        synchronized (this.b) {
            try {
                h1dVar = this.b.get(Integer.valueOf(fvcVar.zza()));
                if (h1dVar == null) {
                    h1dVar = new a(fvcVar);
                    this.b.put(Integer.valueOf(fvcVar.zza()), h1dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.G().c0(h1dVar);
    }

    @Override // defpackage.guc
    public void resetAnalyticsData(long j) throws RemoteException {
        C();
        z6 G = this.a.G();
        G.R(null);
        G.k().C(new r7(G, j));
    }

    @Override // defpackage.guc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        C();
        if (bundle == null) {
            this.a.n().F().a("Conditional user property must not be null");
        } else {
            this.a.G().H(bundle, j);
        }
    }

    @Override // defpackage.guc
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        C();
        final z6 G = this.a.G();
        G.k().F(new Runnable() { // from class: com.google.android.gms.measurement.internal.d7
            @Override // java.lang.Runnable
            public final void run() {
                z6 z6Var = z6.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(z6Var.o().F())) {
                    z6Var.G(bundle2, 0, j2);
                } else {
                    z6Var.n().L().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // defpackage.guc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        C();
        this.a.G().G(bundle, -20, j);
    }

    @Override // defpackage.guc
    public void setCurrentScreen(@NonNull ns4 ns4Var, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        C();
        this.a.H().G((Activity) k57.T1(ns4Var), str, str2);
    }

    @Override // defpackage.guc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        C();
        z6 G = this.a.G();
        G.u();
        G.k().C(new l7(G, z));
    }

    @Override // defpackage.guc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        final Bundle bundle2;
        C();
        final z6 G = this.a.G();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        G.k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.b7
            @Override // java.lang.Runnable
            public final void run() {
                z6.this.F(bundle2);
            }
        });
    }

    @Override // defpackage.guc
    public void setEventInterceptor(fvc fvcVar) throws RemoteException {
        C();
        b bVar = new b(fvcVar);
        if (this.a.k().I()) {
            this.a.G().d0(bVar);
        } else {
            this.a.k().C(new i7(this, bVar));
        }
    }

    @Override // defpackage.guc
    public void setInstanceIdProvider(gvc gvcVar) throws RemoteException {
        C();
    }

    @Override // defpackage.guc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        C();
        this.a.G().P(Boolean.valueOf(z));
    }

    @Override // defpackage.guc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        C();
    }

    @Override // defpackage.guc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        C();
        z6 G = this.a.G();
        G.k().C(new n7(G, j));
    }

    @Override // defpackage.guc
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        C();
        final z6 G = this.a.G();
        if (str != null && TextUtils.isEmpty(str)) {
            G.a.n().K().a("User ID must be non-empty or null");
            return;
        }
        G.k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.e7
            @Override // java.lang.Runnable
            public final void run() {
                z6 z6Var = z6.this;
                if (z6Var.o().J(str)) {
                    z6Var.o().H();
                }
            }
        });
        G.a0(null, "_id", str, true, j);
    }

    @Override // defpackage.guc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull ns4 ns4Var, boolean z, long j) throws RemoteException {
        C();
        this.a.G().a0(str, str2, k57.T1(ns4Var), z, j);
    }

    @Override // defpackage.guc
    public void unregisterOnMeasurementEventListener(fvc fvcVar) throws RemoteException {
        h1d remove;
        C();
        synchronized (this.b) {
            remove = this.b.remove(Integer.valueOf(fvcVar.zza()));
        }
        if (remove == null) {
            remove = new a(fvcVar);
        }
        this.a.G().A0(remove);
    }
}
