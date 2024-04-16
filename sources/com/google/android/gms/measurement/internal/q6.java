package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class q6 implements Callable<List<zzmh>> {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(y5 y5Var, zzo zzoVar, Bundle bundle) {
        this.a = zzoVar;
        this.b = bundle;
        this.c = y5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzmh> call() throws Exception {
        va vaVar;
        va vaVar2;
        vaVar = this.c.a;
        vaVar.o0();
        vaVar2 = this.c.a;
        zzo zzoVar = this.a;
        Bundle bundle = this.b;
        vaVar2.k().l();
        if (g8d.a() && vaVar2.c0().C(zzoVar.a, b0.H0) && zzoVar.a != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i = 0; i < intArray.length; i++) {
                            k e0 = vaVar2.e0();
                            String str = zzoVar.a;
                            int i2 = intArray[i];
                            long j = longArray[i];
                            gh8.f(str);
                            e0.l();
                            e0.t();
                            try {
                                int delete = e0.A().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                m4 J = e0.n().J();
                                J.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e0.n().F().c("Error pruning trigger URIs. appId", k4.u(str), e);
                            }
                        }
                    } else {
                        vaVar2.n().F().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return vaVar2.e0().J0(zzoVar.a);
        }
        return new ArrayList();
    }
}
