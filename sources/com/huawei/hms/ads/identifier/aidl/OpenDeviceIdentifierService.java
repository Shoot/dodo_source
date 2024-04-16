package com.huawei.hms.ads.identifier.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub {
        private static final String DESCRIPTOR = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
        static final int TRANSACTION_GETOAID = 1;
        static final int TRANSACTION_ISOAIDTRACKLIMITED = 2;

        /* loaded from: classes.dex */
        private static class Proxy implements OpenDeviceIdentifierService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(getInterfaceDescriptor());
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public boolean isOaidTrackLimited() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(getInterfaceDescriptor());
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

        public static OpenDeviceIdentifierService asInterface(IBinder iBinder) {
            return new Proxy(iBinder);
        }
    }

    String getOaid() throws RemoteException;

    boolean isOaidTrackLimited() throws RemoteException;
}
