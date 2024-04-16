package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: cxc  reason: default package */
/* loaded from: classes2.dex */
public final class cxc extends jlc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public cxc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void T1(vzc vzcVar, DeleteBytesRequest deleteBytesRequest) throws RemoteException {
        Parcel x = x();
        jtc.d(x, vzcVar);
        jtc.c(x, deleteBytesRequest);
        C(13, x);
    }

    public final void U1(b2d b2dVar) throws RemoteException {
        Parcel x = x();
        jtc.d(x, b2dVar);
        C(11, x);
    }

    public final void V1(m3d m3dVar, RetrieveBytesRequest retrieveBytesRequest) throws RemoteException {
        Parcel x = x();
        jtc.d(x, m3dVar);
        jtc.c(x, retrieveBytesRequest);
        C(12, x);
    }

    public final void W1(z4d z4dVar, StoreBytesData storeBytesData) throws RemoteException {
        Parcel x = x();
        jtc.d(x, z4dVar);
        jtc.c(x, storeBytesData);
        C(10, x);
    }
}
