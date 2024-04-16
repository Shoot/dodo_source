package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: wad  reason: default package */
/* loaded from: classes2.dex */
public interface wad extends IInterface {
    void L1(int i, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void Q0(Status status, boolean z, Bundle bundle) throws RemoteException;

    void b0(int i, boolean z, Bundle bundle) throws RemoteException;

    void i0(int i, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void u0(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    void w0(int i, Bundle bundle) throws RemoteException;
}
