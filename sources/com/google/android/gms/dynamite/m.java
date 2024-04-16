package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class m extends llc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int T1() throws RemoteException {
        Parcel x = x(6, C());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    public final int U1(ns4 ns4Var, String str, boolean z) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        qsc.c(C, z);
        Parcel x = x(3, C);
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    public final int V1(ns4 ns4Var, String str, boolean z) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        qsc.c(C, z);
        Parcel x = x(5, C);
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    public final ns4 W1(ns4 ns4Var, String str, int i) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        C.writeInt(i);
        Parcel x = x(2, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    public final ns4 X1(ns4 ns4Var, String str, int i, ns4 ns4Var2) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        C.writeInt(i);
        qsc.e(C, ns4Var2);
        Parcel x = x(8, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    public final ns4 Y1(ns4 ns4Var, String str, int i) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        C.writeInt(i);
        Parcel x = x(4, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    public final ns4 Z1(ns4 ns4Var, String str, boolean z, long j) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        qsc.c(C, z);
        C.writeLong(j);
        Parcel x = x(7, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }
}
