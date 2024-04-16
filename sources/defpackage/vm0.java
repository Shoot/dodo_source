package defpackage;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: vm0  reason: default package */
/* loaded from: classes2.dex */
public final class vm0 {
    private static hr4 a;

    @NonNull
    public static um0 a(@NonNull LatLngBounds latLngBounds, int i) {
        gh8.k(latLngBounds, "bounds must not be null");
        try {
            return new um0(f().E(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public static um0 b(@NonNull LatLng latLng, float f) {
        gh8.k(latLng, "latLng must not be null");
        try {
            return new um0(f().D0(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public static um0 c() {
        try {
            return new um0(f().r());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public static um0 d() {
        try {
            return new um0(f().B());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static void e(@NonNull hr4 hr4Var) {
        a = (hr4) gh8.j(hr4Var);
    }

    private static hr4 f() {
        return (hr4) gh8.k(a, "CameraUpdateFactory is not initialized");
    }
}
