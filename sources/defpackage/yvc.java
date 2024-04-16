package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: yvc  reason: default package */
/* loaded from: classes2.dex */
public abstract class yvc extends uqc implements axc {
    public static axc x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof axc) {
            return (axc) queryLocalInterface;
        }
        return new zuc(iBinder);
    }
}
