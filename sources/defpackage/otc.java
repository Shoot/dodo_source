package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: otc  reason: default package */
/* loaded from: classes2.dex */
public abstract class otc extends msc implements nsc {
    public static nsc C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof nsc) {
            return (nsc) queryLocalInterface;
        }
        return new mtc(iBinder);
    }
}
