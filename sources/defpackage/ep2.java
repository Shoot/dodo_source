package defpackage;

import defpackage.j4;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: DefaultAccessorNamingStrategy.java */
/* renamed from: ep2  reason: default package */
/* loaded from: classes2.dex */
public class ep2 extends j4 {
    protected final w76<?> a;
    protected final bl b;
    protected final boolean c;
    protected final String d;
    protected final String e;
    protected final String f;

    /* compiled from: DefaultAccessorNamingStrategy.java */
    /* renamed from: ep2$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: DefaultAccessorNamingStrategy.java */
    /* renamed from: ep2$b */
    /* loaded from: classes2.dex */
    public static class b extends j4.a implements Serializable {
        protected final String a;
        protected final String b;
        protected final String c;
        protected final String d;

        public b() {
            this("set", "with", "get", "is", null);
        }

        @Override // defpackage.j4.a
        public j4 a(w76<?> w76Var, bl blVar) {
            return new ep2(w76Var, blVar, this.a, this.c, this.d, null);
        }

        @Override // defpackage.j4.a
        public j4 b(w76<?> w76Var, bl blVar) {
            return new c(w76Var, blVar);
        }

        protected b(String str, String str2, String str3, String str4, a aVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    /* compiled from: DefaultAccessorNamingStrategy.java */
    /* renamed from: ep2$c */
    /* loaded from: classes2.dex */
    public static class c extends ep2 {
        protected final Set<String> g;

        public c(w76<?> w76Var, bl blVar) {
            super(w76Var, blVar, null, "get", "is", null);
            this.g = new HashSet();
            for (String str : f85.a(blVar.c())) {
                this.g.add(str);
            }
        }

        @Override // defpackage.ep2, defpackage.j4
        public String c(il ilVar, String str) {
            if (this.g.contains(str)) {
                return str;
            }
            return super.c(ilVar, str);
        }
    }

    protected ep2(w76<?> w76Var, bl blVar, String str, String str2, String str3, a aVar) {
        this.a = w76Var;
        this.b = blVar;
        this.c = w76Var.S(y76.USE_STD_BEAN_NAMING);
        this.f = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.j4
    public String a(il ilVar, String str) {
        if (this.e != null) {
            Class<?> c2 = ilVar.c();
            if ((c2 == Boolean.class || c2 == Boolean.TYPE) && str.startsWith(this.e)) {
                if (this.c) {
                    return h(str, 2);
                }
                return g(str, 2);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.j4
    public String b(il ilVar, String str) {
        String str2 = this.f;
        if (str2 != null && str.startsWith(str2)) {
            if (this.c) {
                return h(str, this.f.length());
            }
            return g(str, this.f.length());
        }
        return null;
    }

    @Override // defpackage.j4
    public String c(il ilVar, String str) {
        String str2 = this.d;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (e(ilVar)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && f(ilVar)) {
            return null;
        }
        if (this.c) {
            return h(str, this.d.length());
        }
        return g(str, this.d.length());
    }

    protected boolean e(il ilVar) {
        Class<?> c2 = ilVar.c();
        if (!c2.isArray()) {
            return false;
        }
        String name = c2.getComponentType().getName();
        if (!name.contains(".cglib")) {
            return false;
        }
        if (!name.startsWith("net.sf.cglib") && !name.startsWith("org.hibernate.repackage.cglib") && !name.startsWith("org.springframework.cglib")) {
            return false;
        }
        return true;
    }

    protected boolean f(il ilVar) {
        return ilVar.c().getName().startsWith("groovy.lang");
    }

    protected String g(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    protected String h(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }

    @Override // defpackage.j4
    public String d(fl flVar, String str) {
        return str;
    }
}
