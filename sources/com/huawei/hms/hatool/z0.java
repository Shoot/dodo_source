package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import im.threads.business.transport.MessageAttributes;
import java.util.UUID;
/* loaded from: classes3.dex */
public class z0 {
    public static z0 b;
    public Context a;

    /* loaded from: classes3.dex */
    public static class a extends a1 {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.a1
        public String a() {
            return com.huawei.hms.hatool.a.d(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.a1
        public String b() {
            return com.huawei.hms.hatool.a.g(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.a1
        public String c() {
            return com.huawei.hms.hatool.a.j(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.a1
        public int d() {
            int i;
            int i2 = 0;
            if (com.huawei.hms.hatool.a.k(this.a, this.b)) {
                i = 4;
            } else {
                i = 0;
            }
            if (com.huawei.hms.hatool.a.e(this.a, this.b)) {
                i2 = 2;
            }
            return i | i2 | (com.huawei.hms.hatool.a.h(this.a, this.b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.a1
        public String a(String str) {
            return iq9.b(str);
        }
    }

    public static z0 a() {
        z0 z0Var;
        synchronized (z0.class) {
            try {
                if (b == null) {
                    b = new z0();
                }
                z0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z0Var;
    }

    public String b(String str, String str2) {
        return g.b(this.a, str, str2);
    }

    public x0 c(String str, String str2) {
        return new a(str, str2).a(this.a);
    }

    public String d(String str, String str2) {
        return c1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (com.huawei.hms.hatool.a.f(str, str2)) {
            String p = i.c().b().p();
            String q = i.c().b().q();
            if (!TextUtils.isEmpty(p) && !TextUtils.isEmpty(q)) {
                return new Pair<>(p, q);
            }
            Pair<String, String> e = b1.e(this.a);
            i.c().b().k((String) e.first);
            i.c().b().l((String) e.second);
            return e;
        }
        return new Pair<>("", "");
    }

    public String f(String str, String str2) {
        return c1.a(str, str2);
    }

    public String a(String str, String str2) {
        return g.a(this.a, str, str2);
    }

    public String a(boolean z) {
        if (z) {
            String e = b.e();
            if (TextUtils.isEmpty(e)) {
                e = g0.a(this.a, "global_v2", MessageAttributes.UUID, "");
                if (TextUtils.isEmpty(e)) {
                    e = UUID.randomUUID().toString().replace("-", "");
                    g0.b(this.a, "global_v2", MessageAttributes.UUID, e);
                }
                b.h(e);
            }
            return e;
        }
        return "";
    }

    public void a(Context context) {
        if (this.a == null) {
            this.a = context;
        }
    }
}
