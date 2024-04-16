package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class n extends llc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final ns4 T1(ns4 ns4Var, String str, int i, ns4 ns4Var2) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        C.writeInt(i);
        qsc.e(C, ns4Var2);
        Parcel x = x(2, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }

    public final ns4 U1(ns4 ns4Var, String str, int i, ns4 ns4Var2) throws RemoteException {
        Parcel C = C();
        qsc.e(C, ns4Var);
        C.writeString(str);
        C.writeInt(i);
        qsc.e(C, ns4Var2);
        Parcel x = x(3, C);
        ns4 C2 = ns4.a.C(x.readStrongBinder());
        x.recycle();
        return C2;
    }
}
