package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: onc  reason: default package */
/* loaded from: classes2.dex */
public abstract class onc extends cqc implements snc {
    public static snc C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof snc) {
            return (snc) queryLocalInterface;
        }
        return new hnc(iBinder);
    }
}
