package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: tlc  reason: default package */
/* loaded from: classes2.dex */
public class tlc implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.wallet.internal.IOwService";

    /* JADX INFO: Access modifiers changed from: protected */
    public tlc(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(int i, Parcel parcel) throws RemoteException {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
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
