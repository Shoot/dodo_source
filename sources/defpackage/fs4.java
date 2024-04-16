package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMultiInstanceInvalidationCallback.java */
/* renamed from: fs4  reason: default package */
/* loaded from: classes.dex */
public interface fs4 extends IInterface {
    void N(String[] strArr) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* renamed from: fs4$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements fs4 {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: fs4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0315a implements fs4 {
            private IBinder a;

            C0315a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.fs4
            public void N(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static fs4 x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof fs4)) {
                return (fs4) queryLocalInterface;
            }
            return new C0315a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                N(parcel.createStringArray());
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
