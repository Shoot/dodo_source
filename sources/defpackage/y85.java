package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: JavaType.java */
/* renamed from: y85  reason: default package */
/* loaded from: classes2.dex */
public abstract class y85 extends lj9 implements Serializable, Type {
    protected final Class<?> a;
    protected final int b;
    protected final Object c;
    protected final Object d;
    protected final boolean e;

    /* JADX INFO: Access modifiers changed from: protected */
    public y85(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this.a = cls;
        this.b = cls.getName().hashCode() + i;
        this.c = obj;
        this.d = obj2;
        this.e = z;
    }

    public <T> T E() {
        return (T) this.c;
    }

    public boolean G() {
        if (i() > 0) {
            return true;
        }
        return false;
    }

    public boolean H() {
        if (this.d == null && this.c == null) {
            return false;
        }
        return true;
    }

    public final boolean K(Class<?> cls) {
        if (this.a == cls) {
            return true;
        }
        return false;
    }

    public boolean L() {
        return false;
    }

    public boolean M() {
        return false;
    }

    public abstract boolean N();

    public final boolean P() {
        if (q81.H(this.a) && this.a != Enum.class) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        return q81.H(this.a);
    }

    public final boolean S() {
        return Modifier.isFinal(this.a.getModifiers());
    }

    public final boolean T() {
        return this.a.isInterface();
    }

    public final boolean W() {
        if (this.a == Object.class) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        return false;
    }

    public final boolean b0() {
        return this.a.isPrimitive();
    }

    public final boolean e0() {
        return q81.O(this.a);
    }

    public abstract boolean equals(Object obj);

    public abstract y85 f(int i);

    public final boolean f0(Class<?> cls) {
        Class<?> cls2 = this.a;
        if (cls2 != cls && !cls.isAssignableFrom(cls2)) {
            return false;
        }
        return true;
    }

    public final boolean h0(Class<?> cls) {
        Class<?> cls2 = this.a;
        if (cls2 != cls && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public abstract int i();

    public y85 j(int i) {
        y85 f = f(i);
        if (f == null) {
            return rnb.b0();
        }
        return f;
    }

    public abstract y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr);

    public abstract y85 k(Class<?> cls);

    public abstract qnb l();

    public final boolean l0() {
        return this.e;
    }

    public y85 m() {
        return null;
    }

    public abstract y85 m0(y85 y85Var);

    public abstract StringBuilder n(StringBuilder sb);

    public abstract y85 n0(Object obj);

    public String o() {
        StringBuilder sb = new StringBuilder(40);
        q(sb);
        return sb.toString();
    }

    public y85 o0(y85 y85Var) {
        y85 y85Var2;
        Object y = y85Var.y();
        if (y != this.d) {
            y85Var2 = q0(y);
        } else {
            y85Var2 = this;
        }
        Object E = y85Var.E();
        if (E != this.c) {
            return y85Var2.r0(E);
        }
        return y85Var2;
    }

    public abstract y85 p0();

    public abstract StringBuilder q(StringBuilder sb);

    public abstract y85 q0(Object obj);

    public abstract List<y85> r();

    public abstract y85 r0(Object obj);

    public y85 s() {
        return null;
    }

    public final Class<?> u() {
        return this.a;
    }

    @Override // defpackage.lj9
    /* renamed from: w */
    public y85 b() {
        return null;
    }

    public abstract y85 x();

    public <T> T y() {
        return (T) this.d;
    }
}
