package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: tb0  reason: default package */
/* loaded from: classes2.dex */
public final class tb0 {
    private static x0d a;

    @NonNull
    public static sb0 a() {
        try {
            return new sb0(d().d());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public static sb0 b(@NonNull Bitmap bitmap) {
        gh8.k(bitmap, "image must not be null");
        try {
            return new sb0(d().T(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static void c(x0d x0dVar) {
        if (a != null) {
            return;
        }
        a = (x0d) gh8.k(x0dVar, "delegate must not be null");
    }

    private static x0d d() {
        return (x0d) gh8.k(a, "IBitmapDescriptorFactory is not initialized");
    }
}
