package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.c;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: zwc  reason: default package */
/* loaded from: classes2.dex */
public final class zwc extends c<kad> {
    private final GoogleSignInOptions I;

    public zwc(Context context, Looper looper, n91 n91Var, GoogleSignInOptions googleSignInOptions, c.b bVar, c.InterfaceC0218c interfaceC0218c) {
        super(context, looper, 91, n91Var, bVar, interfaceC0218c);
        GoogleSignInOptions.a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.a();
        }
        aVar.e(brc.a());
        if (!n91Var.e().isEmpty()) {
            for (Scope scope : n91Var.e()) {
                aVar.d(scope, new Scope[0]);
            }
        }
        this.I = aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final GoogleSignInOptions j0() {
        return this.I;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof kad) {
            return (kad) queryLocalInterface;
        }
        return new sbd(iBinder);
    }
}
