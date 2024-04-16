package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: cad  reason: default package */
/* loaded from: classes2.dex */
public abstract class cad extends htc implements q7d {
    public cad() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // defpackage.htc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            z();
        } else {
            y();
        }
        return true;
    }
}
