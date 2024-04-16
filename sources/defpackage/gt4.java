package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import defpackage.v45;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: IdManager.java */
/* renamed from: gt4  reason: default package */
/* loaded from: classes2.dex */
public class gt4 implements v45 {
    private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    private static final String h = Pattern.quote("/");
    private final x45 a;
    private final Context b;
    private final String c;
    private final ew3 d;
    private final ok2 e;
    private v45.a f;

    public gt4(Context context, String str, ew3 ew3Var, ok2 ok2Var) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = ew3Var;
                this.e = ok2Var;
                this.a = new x45();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    @NonNull
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = e(UUID.randomUUID().toString());
        rx5 f = rx5.f();
        f.i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(h, "");
    }

    private boolean n() {
        v45.a aVar = this.f;
        if (aVar != null && (aVar.d() != null || !this.e.d())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.v45
    @NonNull
    public synchronized v45.a a() {
        if (!n()) {
            return this.f;
        }
        rx5.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q = ek1.q(this.b);
        String string = q.getString("firebase.installation.id", null);
        rx5 f = rx5.f();
        f.i("Cached Firebase Installation ID: " + string);
        if (this.e.d()) {
            String d = d();
            rx5 f2 = rx5.f();
            f2.i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f = v45.a.a(l(q), d);
            } else {
                this.f = v45.a.a(b(d, q), d);
            }
        } else if (k(string)) {
            this.f = v45.a.b(l(q));
        } else {
            this.f = v45.a.b(b(c(), q));
        }
        rx5 f3 = rx5.f();
        f3.i("Install IDs: " + this.f);
        return this.f;
    }

    public String d() {
        try {
            return (String) gvb.f(this.d.getId());
        } catch (Exception e) {
            rx5.f().l("Failed to retrieve Firebase Installation ID.", e);
            return null;
        }
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
