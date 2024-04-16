package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ICustomTabsService.java */
/* renamed from: kr4  reason: default package */
/* loaded from: classes.dex */
public interface kr4 extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* renamed from: kr4$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements kr4 {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ICustomTabsService.java */
        /* renamed from: kr4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0416a implements kr4 {
            public static kr4 b;
            private IBinder a;

            C0416a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.kr4
            public boolean Z(jr4 jr4Var) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (jr4Var != null) {
                        iBinder = jr4Var.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.a.transact(3, obtain, obtain2, 0) && a.C() != null) {
                        boolean Z = a.C().Z(jr4Var);
                        obtain2.recycle();
                        obtain.recycle();
                        return Z;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.kr4
            public boolean k0(jr4 jr4Var, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (jr4Var != null) {
                        iBinder = jr4Var.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(10, obtain, obtain2, 0) && a.C() != null) {
                        boolean k0 = a.C().k0(jr4Var, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return k0;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // defpackage.kr4
            public boolean n1(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.a.transact(2, obtain, obtain2, 0) && a.C() != null) {
                        return a.C().n1(j);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static kr4 C() {
            return C0416a.b;
        }

        public static kr4 x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof kr4)) {
                return (kr4) queryLocalInterface;
            }
            return new C0416a(iBinder);
        }
    }

    boolean Z(jr4 jr4Var) throws RemoteException;

    boolean k0(jr4 jr4Var, Bundle bundle) throws RemoteException;

    boolean n1(long j) throws RemoteException;
}
