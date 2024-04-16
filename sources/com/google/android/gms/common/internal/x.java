package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class x extends llc implements e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.e
    public final Account b() throws RemoteException {
        Parcel x = x(2, C());
        Account account = (Account) qsc.a(x, Account.CREATOR);
        x.recycle();
        return account;
    }
}
