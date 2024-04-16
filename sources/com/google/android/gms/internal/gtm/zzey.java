package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzey extends zzas implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zzf(Map map, long j, String str, List<zzcp> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeMap(map);
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeTypedList(list);
        zzl(1, zza);
    }
}
