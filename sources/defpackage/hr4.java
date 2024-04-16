package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: hr4  reason: default package */
/* loaded from: classes2.dex */
public interface hr4 extends IInterface {
    @NonNull
    ns4 B() throws RemoteException;

    @NonNull
    ns4 D0(@NonNull LatLng latLng, float f) throws RemoteException;

    @NonNull
    ns4 E(@NonNull LatLngBounds latLngBounds, int i) throws RemoteException;

    @NonNull
    ns4 r() throws RemoteException;
}
