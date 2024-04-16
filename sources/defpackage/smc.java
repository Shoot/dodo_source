package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: smc  reason: default package */
/* loaded from: classes2.dex */
public final class smc extends c<iad> {
    private final Context I;
    private final int J;
    private final String K;
    private final int L;
    private final boolean M;

    public smc(Context context, Looper looper, n91 n91Var, c.b bVar, c.InterfaceC0218c interfaceC0218c, int i, int i2, boolean z) {
        super(context, looper, 4, n91Var, bVar, interfaceC0218c);
        String str;
        this.I = context;
        this.J = i;
        Account b = n91Var.b();
        if (b != null) {
            str = b.name;
        } else {
            str = null;
        }
        this.K = str;
        this.L = i2;
        this.M = z;
    }

    private final Bundle l0() {
        int i = this.J;
        String packageName = this.I.getPackageName();
        String str = this.K;
        int i2 = this.L;
        boolean z = this.M;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean L() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean P() {
        return true;
    }

    public final void j0(IsReadyToPayRequest isReadyToPayRequest, a7b<Boolean> a7bVar) throws RemoteException {
        jcd jcdVar = new jcd(a7bVar);
        try {
            ((iad) A()).T1(isReadyToPayRequest, l0(), jcdVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            jcdVar.Q0(Status.i, false, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12600000;
    }

    public final void k0(PaymentDataRequest paymentDataRequest, a7b<PaymentData> a7bVar) {
        Bundle l0 = l0();
        l0.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        lmc lmcVar = new lmc(a7bVar);
        try {
            ((iad) A()).U1(paymentDataRequest, l0, lmcVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            lmcVar.u0(Status.i, null, Bundle.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* bridge */ /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof iad) {
            return (iad) queryLocalInterface;
        }
        return new iad(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return w1d.g;
    }
}
