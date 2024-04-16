package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zat;
import com.huawei.hms.api.HuaweiApiClientImpl;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class a extends com.google.android.gms.common.internal.c<c> implements ekc {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final n91 J;
    private final Bundle K;
    private final Integer L;

    public a(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull n91 n91Var, @NonNull Bundle bundle, @NonNull c.b bVar, @NonNull c.InterfaceC0218c interfaceC0218c) {
        super(context, looper, 44, n91Var, bVar, interfaceC0218c);
        this.I = true;
        this.J = n91Var;
        this.K = bundle;
        this.L = n91Var.j();
    }

    @NonNull
    public static Bundle j0(@NonNull n91 n91Var) {
        n91Var.i();
        Integer j = n91Var.j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", n91Var.b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.ekc
    public final void a(fkc fkcVar) {
        GoogleSignInAccount googleSignInAccount;
        gh8.k(fkcVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d = this.J.d();
            if (HuaweiApiClientImpl.DEFAULT_ACCOUNT.equals(d.name)) {
                googleSignInAccount = pxa.b(v()).c();
            } else {
                googleSignInAccount = null;
            }
            ((c) A()).U1(new zai(1, new zat(d, ((Integer) gh8.j(this.L)).intValue(), googleSignInAccount)), fkcVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fkcVar.Q(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean f() {
        return this.I;
    }

    @Override // defpackage.ekc
    public final void g() {
        d(new b.d());
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return com.google.android.gms.common.d.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @NonNull
    public final /* synthetic */ IInterface p(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    @NonNull
    protected final Bundle x() {
        if (!v().getPackageName().equals(this.J.g())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.g());
        }
        return this.K;
    }
}
