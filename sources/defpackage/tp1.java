package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
/* compiled from: ConfigGetParameterHandler.java */
/* renamed from: tp1  reason: default package */
/* loaded from: classes2.dex */
public class tp1 {
    public static final Charset e = Charset.forName("UTF-8");
    static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final Set<xa0<String, c>> a = new HashSet();
    private final Executor b;
    private final b c;
    private final b d;

    public tp1(Executor executor, b bVar, b bVar2) {
        this.b = executor;
        this.c = bVar;
        this.d = bVar2;
    }

    private void c(final String str, final c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final xa0<String, c> xa0Var : this.a) {
                    this.b.execute(new Runnable() { // from class: sp1
                        @Override // java.lang.Runnable
                        public final void run() {
                            xa0.this.a(str, cVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static c f(b bVar) {
        return bVar.f();
    }

    private static Set<String> g(b bVar) {
        HashSet hashSet = new HashSet();
        c f2 = f(bVar);
        if (f2 == null) {
            return hashSet;
        }
        Iterator<String> keys = f2.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String i(b bVar, String str) {
        c f2 = f(bVar);
        if (f2 == null) {
            return null;
        }
        try {
            return f2.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void l(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(xa0<String, c> xa0Var) {
        synchronized (this.a) {
            this.a.add(xa0Var);
        }
    }

    public Map<String, sx3> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(g(this.c));
        hashSet.addAll(g(this.d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, j(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String i = i(this.c, str);
        if (i != null) {
            if (f.matcher(i).matches()) {
                c(str, f(this.c));
                return true;
            } else if (g.matcher(i).matches()) {
                c(str, f(this.c));
                return false;
            }
        }
        String i2 = i(this.d, str);
        if (i2 != null) {
            if (f.matcher(i2).matches()) {
                return true;
            }
            if (g.matcher(i2).matches()) {
                return false;
            }
        }
        l(str, "Boolean");
        return false;
    }

    public String h(String str) {
        String i = i(this.c, str);
        if (i != null) {
            c(str, f(this.c));
            return i;
        }
        String i2 = i(this.d, str);
        if (i2 != null) {
            return i2;
        }
        l(str, "String");
        return "";
    }

    public sx3 j(String str) {
        String i = i(this.c, str);
        if (i != null) {
            c(str, f(this.c));
            return new tx3(i, 2);
        }
        String i2 = i(this.d, str);
        if (i2 != null) {
            return new tx3(i2, 1);
        }
        l(str, "FirebaseRemoteConfigValue");
        return new tx3("", 0);
    }
}
