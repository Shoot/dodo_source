package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
/* compiled from: Dependency.java */
/* renamed from: d03  reason: default package */
/* loaded from: classes2.dex */
public final class d03 {
    private final su8<?> a;
    private final int b;
    private final int c;

    private d03(Class<?> cls, int i, int i2) {
        this(su8.b(cls), i, i2);
    }

    public static d03 a(Class<?> cls) {
        return new d03(cls, 0, 2);
    }

    private static String b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return StatisticManager.DIRECT;
    }

    @Deprecated
    public static d03 h(Class<?> cls) {
        return new d03(cls, 0, 0);
    }

    public static d03 i(Class<?> cls) {
        return new d03(cls, 0, 1);
    }

    public static d03 j(su8<?> su8Var) {
        return new d03(su8Var, 1, 0);
    }

    public static d03 k(Class<?> cls) {
        return new d03(cls, 1, 0);
    }

    public static d03 l(su8<?> su8Var) {
        return new d03(su8Var, 1, 1);
    }

    public static d03 m(Class<?> cls) {
        return new d03(cls, 1, 1);
    }

    public static d03 n(Class<?> cls) {
        return new d03(cls, 2, 0);
    }

    public su8<?> c() {
        return this.a;
    }

    public boolean d() {
        if (this.c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03Var = (d03) obj;
        if (!this.a.equals(d03Var.a) || this.b != d03Var.b || this.c != d03Var.c) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }

    private d03(su8<?> su8Var, int i, int i2) {
        this.a = (su8) ih8.c(su8Var, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }
}
