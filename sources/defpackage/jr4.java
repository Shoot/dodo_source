package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ICustomTabsCallback.java */
/* renamed from: jr4  reason: default package */
/* loaded from: classes.dex */
public interface jr4 extends IInterface {
    void B1(int i, Bundle bundle) throws RemoteException;

    void K1(String str, Bundle bundle) throws RemoteException;

    void N1(Bundle bundle) throws RemoteException;

    void O1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    Bundle Y(String str, Bundle bundle) throws RemoteException;

    void q0(String str, Bundle bundle) throws RemoteException;

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: jr4$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements jr4 {
        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Uri uri;
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        B1(readInt, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        q0(readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        N1(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        K1(readString2, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        O1(readInt2, uri, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle Y = Y(readString3, bundle);
                        parcel2.writeNoException();
                        if (Y != null) {
                            parcel2.writeInt(1);
                            Y.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
