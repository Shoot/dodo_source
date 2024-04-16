package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: qkc  reason: default package */
/* loaded from: classes2.dex */
public final class qkc extends mic implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public qkc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void U1(TelemetryData telemetryData) throws RemoteException {
        Parcel x = x();
        ejc.c(x, telemetryData);
        T1(1, x);
    }
}
