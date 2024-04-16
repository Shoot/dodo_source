package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: wzc  reason: default package */
/* loaded from: classes2.dex */
public abstract class wzc extends fqc implements x0d {
    public static x0d C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof x0d) {
            return (x0d) queryLocalInterface;
        }
        return new dyc(iBinder);
    }
}
