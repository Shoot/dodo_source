package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public class g {
    private Context a;
    private SharedPreferences c;
    private SharedPreferences.Editor d;
    private boolean e;
    private String f;
    private int g;
    private PreferenceScreen i;
    private c j;
    private a k;
    private b l;
    private long b = 0;
    private int h = 0;

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void of(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void L7(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean ig(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public static abstract class d {
    }

    public g(Context context) {
        this.a = context;
        s(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void n(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.d) != null) {
            editor.apply();
        }
        this.e = z;
    }

    public <T extends Preference> T a(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.i;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.S0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SharedPreferences.Editor e() {
        if (this.e) {
            if (this.d == null) {
                this.d = l().edit();
            }
            return this.d;
        }
        return l().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        long j;
        synchronized (this) {
            j = this.b;
            this.b = 1 + j;
        }
        return j;
    }

    public b g() {
        return this.l;
    }

    public c h() {
        return this.j;
    }

    public d i() {
        return null;
    }

    public uh8 j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.i;
    }

    public SharedPreferences l() {
        Context b2;
        j();
        if (this.c == null) {
            if (this.h != 1) {
                b2 = this.a;
            } else {
                b2 = iu1.b(this.a);
            }
            this.c = b2.getSharedPreferences(this.f, this.g);
        }
        return this.c;
    }

    public PreferenceScreen m(Context context, int i, PreferenceScreen preferenceScreen) {
        n(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new f(context, this).d(i, preferenceScreen);
        preferenceScreen2.a0(this);
        n(false);
        return preferenceScreen2;
    }

    public void o(a aVar) {
        this.k = aVar;
    }

    public void p(b bVar) {
        this.l = bVar;
    }

    public void q(c cVar) {
        this.j = cVar;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.i;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.f0();
            }
            this.i = preferenceScreen;
            return true;
        }
        return false;
    }

    public void s(String str) {
        this.f = str;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return !this.e;
    }

    public void u(Preference preference) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.of(preference);
        }
    }
}
