package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: f4d  reason: default package */
/* loaded from: classes2.dex */
public abstract class f4d extends wqc implements z4d {
    public f4d() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // defpackage.wqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            jtc.b(parcel);
            H0((Status) jtc.a(parcel, Status.CREATOR), readInt);
            return true;
        }
        return false;
    }
}
