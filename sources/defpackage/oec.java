package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.rb5;
import java.util.HashMap;
import java.util.Map;
/* renamed from: oec  reason: default package */
/* loaded from: classes.dex */
public class oec extends z {
    private final Context c;
    private final String d;
    private volatile shc e;
    private final Object f = new Object();
    private u g = u.b;
    private final Map<String, String> h = new HashMap();
    private volatile thc i;

    public oec(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    private static String f(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return '/' + str.substring(i);
    }

    private void g() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new hic(this.c, this.d);
                        this.i = new thc(this.e);
                    }
                    i();
                } finally {
                }
            }
        }
    }

    private String h(String str) {
        rb5.a aVar;
        Map<String, rb5.a> a = rb5.a();
        if (!a.containsKey(str) || (aVar = a.get(str)) == null) {
            return null;
        }
        return aVar.a(this);
    }

    private void i() {
        if (this.g == u.b) {
            if (this.e != null) {
                this.g = ivb.f(this.e.a("/region", null), this.e.a("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // defpackage.x
    public String a(String str) {
        return j(str, null);
    }

    @Override // defpackage.x
    public String b() {
        return "DEFAULT_INSTANCE";
    }

    @Override // defpackage.x
    public u c() {
        if (this.g == null) {
            this.g = u.b;
        }
        u uVar = this.g;
        u uVar2 = u.b;
        if (uVar == uVar2 && this.e == null) {
            g();
        }
        u uVar3 = this.g;
        if (uVar3 != null) {
            return uVar3;
        }
        return uVar2;
    }

    @Override // defpackage.x
    public Context getContext() {
        return this.c;
    }

    public String j(String str, String str2) {
        if (str != null) {
            if (this.e == null) {
                g();
            }
            String f = f(str);
            String str3 = this.h.get(f);
            if (str3 != null) {
                return str3;
            }
            String h = h(f);
            if (h != null) {
                return h;
            }
            String a = this.e.a(f, str2);
            if (thc.c(a)) {
                return this.i.a(a, str2);
            }
            return a;
        }
        throw new NullPointerException("path must not be null.");
    }
}
