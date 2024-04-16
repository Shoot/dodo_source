package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class c extends mic implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void U1(zai zaiVar, fkc fkcVar) throws RemoteException {
        Parcel x = x();
        ejc.c(x, zaiVar);
        ejc.d(x, fkcVar);
        C(12, x);
    }
}
