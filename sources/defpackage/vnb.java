package defpackage;
/* compiled from: TypeKey.java */
/* renamed from: vnb  reason: default package */
/* loaded from: classes2.dex */
public class vnb {
    protected int a;
    protected Class<?> b;
    protected y85 c;
    protected boolean d;

    public vnb() {
    }

    public vnb(Class<?> cls, boolean z) {
        this.b = cls;
        this.c = null;
        this.d = z;
        this.a = z ? e(cls) : g(cls);
    }

    public static final int d(y85 y85Var) {
        return y85Var.hashCode() - 2;
    }

    public static final int e(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int f(y85 y85Var) {
        return y85Var.hashCode() - 1;
    }

    public static final int g(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public Class<?> a() {
        return this.b;
    }

    public y85 b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        vnb vnbVar = (vnb) obj;
        if (vnbVar.d != this.d) {
            return false;
        }
        Class<?> cls = this.b;
        if (cls != null) {
            if (vnbVar.b != cls) {
                return false;
            }
            return true;
        }
        return this.c.equals(vnbVar.c);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        if (this.b != null) {
            return "{class: " + this.b.getName() + ", typed? " + this.d + "}";
        }
        return "{type: " + this.c + ", typed? " + this.d + "}";
    }

    public vnb(y85 y85Var, boolean z) {
        this.c = y85Var;
        this.b = null;
        this.d = z;
        this.a = z ? d(y85Var) : f(y85Var);
    }
}
