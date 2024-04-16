package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: t0d  reason: default package */
/* loaded from: classes2.dex */
public abstract class t0d extends vqc implements a2d {
    public t0d() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // defpackage.vqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            v0((Status) itc.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
