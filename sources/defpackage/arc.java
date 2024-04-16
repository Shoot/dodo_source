package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: arc  reason: default package */
/* loaded from: classes2.dex */
public interface arc extends IInterface {
    void P0(LocationResult locationResult) throws RemoteException;

    void a0(LocationAvailability locationAvailability) throws RemoteException;
}
