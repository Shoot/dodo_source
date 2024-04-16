package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: w2d  reason: default package */
/* loaded from: classes2.dex */
public abstract class w2d extends wqc implements m3d {
    public w2d() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // defpackage.wqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            jtc.b(parcel);
            l1((Status) jtc.a(parcel, Status.CREATOR), (RetrieveBytesResponse) jtc.a(parcel, RetrieveBytesResponse.CREATOR));
        } else {
            byte[] createByteArray = parcel.createByteArray();
            jtc.b(parcel);
            B0((Status) jtc.a(parcel, Status.CREATOR), createByteArray);
        }
        return true;
    }
}
