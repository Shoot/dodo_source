package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: kbd  reason: default package */
/* loaded from: classes2.dex */
public final class kbd extends cad {
    private final Context a;

    public kbd(Context context) {
        this.a = context;
    }

    private final void C() {
        if (cqb.a(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // defpackage.q7d
    public final void y() {
        C();
        pxa b = pxa.b(this.a);
        GoogleSignInAccount c = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.l;
        if (c != null) {
            googleSignInOptions = b.d();
        }
        b a = a.a(this.a, googleSignInOptions);
        if (c != null) {
            a.y();
        } else {
            a.z();
        }
    }

    @Override // defpackage.q7d
    public final void z() {
        C();
        z8d.c(this.a).a();
    }
}
