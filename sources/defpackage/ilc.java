package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: ilc  reason: default package */
/* loaded from: classes2.dex */
public class ilc implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    /* JADX INFO: Access modifiers changed from: protected */
    public ilc(IBinder iBinder, String str) {
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
