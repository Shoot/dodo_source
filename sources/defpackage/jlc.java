package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: jlc  reason: default package */
/* loaded from: classes2.dex */
public class jlc implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";

    /* JADX INFO: Access modifiers changed from: protected */
    public jlc(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
}
