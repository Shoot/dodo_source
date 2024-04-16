package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: ocd  reason: default package */
/* loaded from: classes2.dex */
public abstract class ocd extends fqc implements jmc {
    public static jmc C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof jmc) {
            return (jmc) queryLocalInterface;
        }
        return new hcd(iBinder);
    }
}
