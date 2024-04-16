package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: mlc  reason: default package */
/* loaded from: classes2.dex */
public class mlc implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.instantapps.internal.IInstantAppsService";

    /* JADX INFO: Access modifiers changed from: protected */
    public mlc(IBinder iBinder, String str) {
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
