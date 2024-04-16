package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: sjc  reason: default package */
/* loaded from: classes2.dex */
public final class sjc extends gjc implements c.b, c.InterfaceC0218c {
    private static final a.AbstractC0215a h = zjc.c;
    private final Context a;
    private final Handler b;
    private final a.AbstractC0215a c;
    private final Set d;
    private final n91 e;
    private ekc f;
    private rjc g;

    public sjc(Context context, Handler handler, @NonNull n91 n91Var) {
        a.AbstractC0215a abstractC0215a = h;
        this.a = context;
        this.b = handler;
        this.e = (n91) gh8.k(n91Var, "ClientSettings must not be null");
        this.d = n91Var.h();
        this.c = abstractC0215a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void V1(sjc sjcVar, zak zakVar) {
        ConnectionResult h2 = zakVar.h();
        if (h2.u()) {
            zav zavVar = (zav) gh8.j(zakVar.k());
            ConnectionResult h3 = zavVar.h();
            if (!h3.u()) {
                String valueOf = String.valueOf(h3);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                sjcVar.g.c(h3);
                sjcVar.f.disconnect();
                return;
            }
            sjcVar.g.b(zavVar.k(), sjcVar.d);
        } else {
            sjcVar.g.c(h2);
        }
        sjcVar.f.disconnect();
    }

    @Override // defpackage.q77
    public final void C(@NonNull ConnectionResult connectionResult) {
        this.g.c(connectionResult);
    }

    @Override // defpackage.fkc
    public final void Q(zak zakVar) {
        this.b.post(new qjc(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, ekc] */
    public final void W1(rjc rjcVar) {
        ekc ekcVar = this.f;
        if (ekcVar != null) {
            ekcVar.disconnect();
        }
        this.e.l(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0215a abstractC0215a = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        n91 n91Var = this.e;
        this.f = abstractC0215a.b(context, looper, n91Var, n91Var.i(), this, this);
        this.g = rjcVar;
        Set set = this.d;
        if (set != null && !set.isEmpty()) {
            this.f.g();
        } else {
            this.b.post(new pjc(this));
        }
    }

    public final void X1() {
        ekc ekcVar = this.f;
        if (ekcVar != null) {
            ekcVar.disconnect();
        }
    }

    @Override // defpackage.pq1
    public final void onConnectionSuspended(int i) {
        this.f.disconnect();
    }

    @Override // defpackage.pq1
    public final void x(Bundle bundle) {
        this.f.a(this);
    }
}
