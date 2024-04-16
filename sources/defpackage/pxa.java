package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: pxa  reason: default package */
/* loaded from: classes2.dex */
public class pxa {
    private static final Lock c = new ReentrantLock();
    private static pxa d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    pxa(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    public static pxa b(@NonNull Context context) {
        gh8.j(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new pxa(context.getApplicationContext());
            }
            pxa pxaVar = d;
            lock.unlock();
            return pxaVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.B(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = g(i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.z(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        gh8.j(googleSignInAccount);
        gh8.j(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.C());
        gh8.j(googleSignInAccount);
        gh8.j(googleSignInOptions);
        String C = googleSignInAccount.C();
        h(i("googleSignInAccount", C), googleSignInAccount.D());
        h(i("googleSignInOptions", C), googleSignInOptions.D());
    }

    protected final String g(@NonNull String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    protected final void h(@NonNull String str, @NonNull String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
