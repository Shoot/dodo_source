package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: iad  reason: default package */
/* loaded from: classes2.dex */
public final class iad extends tlc implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public iad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void T1(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, wad wadVar) throws RemoteException {
        Parcel x = x();
        vsc.b(x, isReadyToPayRequest);
        vsc.b(x, bundle);
        vsc.c(x, wadVar);
        C(14, x);
    }

    public final void U1(PaymentDataRequest paymentDataRequest, Bundle bundle, wad wadVar) throws RemoteException {
        Parcel x = x();
        vsc.b(x, paymentDataRequest);
        vsc.b(x, bundle);
        vsc.c(x, wadVar);
        C(19, x);
    }
}
