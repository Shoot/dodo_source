package com.huawei.hms.hatool;
/* loaded from: classes3.dex */
public abstract class a {
    public static String a(String str, String str2) {
        j c = c(str, str2);
        if (c != null) {
            return c.a();
        }
        return "";
    }

    public static boolean b(String str, String str2) {
        j c = c(str, str2);
        if (c != null && c.e()) {
            return true;
        }
        return false;
    }

    public static j c(String str, String str2) {
        k a;
        m a2 = i.c().a(str);
        if (a2 != null && (a = a2.a(str2)) != null) {
            return a.j();
        }
        return null;
    }

    public static String d(String str, String str2) {
        j c = c(str, str2);
        if (c != null) {
            return c.b();
        }
        return "";
    }

    public static boolean e(String str, String str2) {
        j c = c(str, str2);
        if (c != null && c.f()) {
            return true;
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        k a;
        m a2 = i.c().a(str);
        if (a2 != null && (a = a2.a(str2)) != null) {
            return a.c();
        }
        return false;
    }

    public static String g(String str, String str2) {
        j c = c(str, str2);
        if (c != null) {
            return c.d();
        }
        return "";
    }

    public static boolean h(String str, String str2) {
        j c = c(str, str2);
        if (c != null && c.g()) {
            return true;
        }
        return false;
    }

    public static boolean i(String str, String str2) {
        k a;
        m a2 = i.c().a(str);
        if (a2 != null && (a = a2.a(str2)) != null) {
            return a.e();
        }
        return false;
    }

    public static String j(String str, String str2) {
        j c = c(str, str2);
        if (c != null) {
            return c.c();
        }
        return "";
    }

    public static boolean k(String str, String str2) {
        j c = c(str, str2);
        if (c != null && c.h()) {
            return true;
        }
        return false;
    }
}
