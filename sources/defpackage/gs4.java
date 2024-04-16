package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.fs4;
/* compiled from: IMultiInstanceInvalidationService.java */
/* renamed from: gs4  reason: default package */
/* loaded from: classes.dex */
public interface gs4 extends IInterface {
    void E0(int i, String[] strArr) throws RemoteException;

    void E1(fs4 fs4Var, int i) throws RemoteException;

    int U(fs4 fs4Var, String str) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* renamed from: gs4$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements gs4 {

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: gs4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0340a implements gs4 {
            private IBinder a;

            C0340a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.gs4
            public void E0(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // defpackage.gs4
            public int U(fs4 fs4Var, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(fs4Var);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static gs4 x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof gs4)) {
                return (gs4) queryLocalInterface;
            }
            return new C0340a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        E0(parcel.readInt(), parcel.createStringArray());
                    } else {
                        E1(fs4.a.x(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    int U = U(fs4.a.x(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(U);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
