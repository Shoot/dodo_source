package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: cyc  reason: default package */
/* loaded from: classes2.dex */
public abstract class cyc extends wqc implements vzc {
    public cyc() {
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
    }

    @Override // defpackage.wqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean e = jtc.e(parcel);
            jtc.b(parcel);
            l((Status) jtc.a(parcel, Status.CREATOR), e);
            return true;
        }
        return false;
    }
}
