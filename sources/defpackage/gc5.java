package defpackage;

import java.io.IOException;
/* compiled from: JsonSerializer.java */
/* renamed from: gc5  reason: default package */
/* loaded from: classes2.dex */
public abstract class gc5<T> {

    /* compiled from: JsonSerializer.java */
    /* renamed from: gc5$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends gc5<Object> {
    }

    public Class<T> c() {
        return null;
    }

    public boolean d(bda bdaVar, T t) {
        if (t == null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(T t, ua5 ua5Var, bda bdaVar) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        Class c = c();
        if (c == null) {
            c = t.getClass();
        }
        bdaVar.l(c, String.format("Type id handling not implemented for type %s (by serializer of type %s)", c.getName(), getClass().getName()));
    }

    public boolean k() {
        return false;
    }

    public gc5<T> j(ps6 ps6Var) {
        return this;
    }
}
