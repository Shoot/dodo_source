package defpackage;

import java.io.Serializable;
/* compiled from: PropertyName.java */
/* renamed from: vq8  reason: default package */
/* loaded from: classes2.dex */
public class vq8 implements Serializable {
    public static final vq8 d = new vq8("", null);
    public static final vq8 e = new vq8(new String(""), null);
    protected final String a;
    protected final String b;
    protected mca c;

    public vq8(String str) {
        this(str, null);
    }

    public static vq8 a(String str) {
        if (str != null && !str.isEmpty()) {
            return new vq8(n65.b.b(str), null);
        }
        return d;
    }

    public static vq8 b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return d;
        }
        return new vq8(n65.b.b(str), str2);
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return !this.a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        vq8 vq8Var = (vq8) obj;
        String str = this.a;
        if (str == null) {
            if (vq8Var.a != null) {
                return false;
            }
        } else if (!str.equals(vq8Var.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (vq8Var.b == null) {
                return true;
            }
            return false;
        }
        return str2.equals(vq8Var.b);
    }

    public boolean f(String str) {
        return this.a.equals(str);
    }

    public int hashCode() {
        String str = this.b;
        if (str == null) {
            return this.a.hashCode();
        }
        return str.hashCode() ^ this.a.hashCode();
    }

    public boolean i() {
        if (this.b == null && this.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public mca j(w76<?> w76Var) {
        mca d2;
        mca mcaVar = this.c;
        if (mcaVar == null) {
            if (w76Var == null) {
                d2 = new vca(this.a);
            } else {
                d2 = w76Var.d(this.a);
            }
            mcaVar = d2;
            this.c = mcaVar;
        }
        return mcaVar;
    }

    public vq8 k(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this.a)) {
            return this;
        }
        return new vq8(str, this.b);
    }

    protected Object readResolve() {
        String str;
        if (this.b == null && ((str = this.a) == null || "".equals(str))) {
            return d;
        }
        return this;
    }

    public String toString() {
        if (this.b == null) {
            return this.a;
        }
        return "{" + this.b + "}" + this.a;
    }

    public vq8(String str, String str2) {
        this.a = q81.S(str);
        this.b = str2;
    }
}
