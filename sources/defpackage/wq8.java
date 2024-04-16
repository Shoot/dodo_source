package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* compiled from: PropertyNamingStrategy.java */
/* renamed from: wq8  reason: default package */
/* loaded from: classes2.dex */
public class wq8 implements Serializable {
    @Deprecated
    public static final wq8 a = new wq8();
    @Deprecated
    public static final wq8 b;
    @Deprecated
    public static final wq8 c;
    @Deprecated
    public static final wq8 d;
    @Deprecated
    public static final wq8 e;
    @Deprecated
    public static final wq8 f;
    @Deprecated
    public static final wq8 g;
    @Deprecated
    public static final wq8 h;

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$a */
    /* loaded from: classes2.dex */
    public static class a extends d {
        @Override // defpackage.wq8.d
        public String e(String str) {
            return d.f(str, CoreConstants.DASH_CHAR);
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$b */
    /* loaded from: classes2.dex */
    public static class b extends d {
        @Override // defpackage.wq8.d
        public String e(String str) {
            return str.toLowerCase();
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$c */
    /* loaded from: classes2.dex */
    public static class c extends d {
        @Override // defpackage.wq8.d
        public String e(String str) {
            return d.f(str, CoreConstants.DOT);
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$d */
    /* loaded from: classes2.dex */
    public static abstract class d extends wq8 {
        protected static String f(String str, char c) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            if (length == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }

        @Override // defpackage.wq8
        public String a(w76<?> w76Var, ll llVar, String str) {
            return e(str);
        }

        @Override // defpackage.wq8
        public String b(w76<?> w76Var, fl flVar, String str) {
            return e(str);
        }

        @Override // defpackage.wq8
        public String c(w76<?> w76Var, il ilVar, String str) {
            return e(str);
        }

        @Override // defpackage.wq8
        public String d(w76<?> w76Var, il ilVar, String str) {
            return e(str);
        }

        public abstract String e(String str);
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$e */
    /* loaded from: classes2.dex */
    public static class e extends d {
        @Override // defpackage.wq8.d
        public String e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            if (i > 0) {
                return sb.toString();
            }
            return str;
        }
    }

    /* compiled from: PropertyNamingStrategy.java */
    @Deprecated
    /* renamed from: wq8$f */
    /* loaded from: classes2.dex */
    public static class f extends d {
        @Override // defpackage.wq8.d
        public String e(String str) {
            if (str != null && !str.isEmpty()) {
                char charAt = str.charAt(0);
                char upperCase = Character.toUpperCase(charAt);
                if (charAt == upperCase) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(0, upperCase);
                return sb.toString();
            }
            return str;
        }
    }

    static {
        f fVar = new f();
        b = fVar;
        e eVar = new e();
        c = eVar;
        d = new b();
        e = new a();
        f = new c();
        g = eVar;
        h = fVar;
    }

    public String a(w76<?> w76Var, ll llVar, String str) {
        return str;
    }

    public String b(w76<?> w76Var, fl flVar, String str) {
        return str;
    }

    public String c(w76<?> w76Var, il ilVar, String str) {
        return str;
    }

    public String d(w76<?> w76Var, il ilVar, String str) {
        return str;
    }
}
