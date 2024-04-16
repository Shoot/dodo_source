package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: z8d  reason: default package */
/* loaded from: classes2.dex */
public final class z8d {
    private static z8d d;
    private pxa a;
    private GoogleSignInAccount b;
    private GoogleSignInOptions c;

    private z8d(Context context) {
        pxa b = pxa.b(context);
        this.a = b;
        this.b = b.c();
        this.c = this.a.d();
    }

    public static synchronized z8d c(@NonNull Context context) {
        z8d d2;
        synchronized (z8d.class) {
            d2 = d(context.getApplicationContext());
        }
        return d2;
    }

    private static synchronized z8d d(Context context) {
        synchronized (z8d.class) {
            z8d z8dVar = d;
            if (z8dVar != null) {
                return z8dVar;
            }
            z8d z8dVar2 = new z8d(context);
            d = z8dVar2;
            return z8dVar2;
        }
    }

    public final synchronized void a() {
        this.a.a();
        this.b = null;
        this.c = null;
    }

    public final synchronized void b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }
}
