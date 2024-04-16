package defpackage;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* compiled from: AnnotatedMethod.java */
/* renamed from: il  reason: default package */
/* loaded from: classes2.dex */
public final class il extends ol implements Serializable {
    protected final transient Method d;
    protected Class<?>[] e;
    protected a f;

    /* compiled from: AnnotatedMethod.java */
    /* renamed from: il$a */
    /* loaded from: classes2.dex */
    private static final class a implements Serializable {
        protected Class<?> a;
        protected String b;
        protected Class<?>[] c;

        public a(Method method) {
            this.a = method.getDeclaringClass();
            this.b = method.getName();
            this.c = method.getParameterTypes();
        }
    }

    public il(znb znbVar, Method method, rl rlVar, rl[] rlVarArr) {
        super(znbVar, rlVar, rlVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.d = method;
    }

    public Class<?> E(int i) {
        Class<?>[] G = G();
        if (i >= G.length) {
            return null;
        }
        return G[i];
    }

    public Class<?>[] G() {
        if (this.e == null) {
            this.e = this.d.getParameterTypes();
        }
        return this.e;
    }

    public Class<?> H() {
        return this.d.getReturnType();
    }

    @Override // defpackage.hl
    /* renamed from: K */
    public il o(rl rlVar) {
        return new il(this.a, this.d, rlVar, this.c);
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.d.getReturnType();
    }

    @Override // defpackage.al
    public y85 d() {
        return this.a.a(this.d.getGenericReturnType());
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, il.class)) {
            return false;
        }
        Method method = ((il) obj).d;
        if (method == null) {
            if (this.d == null) {
                return true;
            }
            return false;
        }
        return method.equals(this.d);
    }

    @Override // defpackage.al
    public String getName() {
        return this.d.getName();
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.d.getName().hashCode();
    }

    @Override // defpackage.hl
    public Class<?> k() {
        return this.d.getDeclaringClass();
    }

    @Override // defpackage.hl
    public String l() {
        String l = super.l();
        int y = y();
        if (y != 0) {
            if (y != 1) {
                return String.format("%s(%d params)", super.l(), Integer.valueOf(y()));
            }
            return l + "(" + E(0).getName() + ")";
        }
        return l + "()";
    }

    @Override // defpackage.hl
    public Object n(Object obj) throws IllegalArgumentException {
        try {
            return this.d.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + l() + ": " + q81.n(e), e);
        }
    }

    Object readResolve() {
        a aVar = this.f;
        Class<?> cls = aVar.a;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aVar.b, aVar.c);
            if (!declaredMethod.isAccessible()) {
                q81.g(declaredMethod, false);
            }
            return new il(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.f.b + "' from Class '" + cls.getName());
        }
    }

    @Override // defpackage.ol
    public y85 s(int i) {
        Type[] genericParameterTypes = this.d.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.a.a(genericParameterTypes[i]);
    }

    public String toString() {
        return "[method " + l() + "]";
    }

    public Method w() {
        return this.d;
    }

    Object writeReplace() {
        return new il(new a(this.d));
    }

    @Override // defpackage.hl
    /* renamed from: x */
    public Method m() {
        return this.d;
    }

    public int y() {
        return G().length;
    }

    protected il(a aVar) {
        super(null, null, null);
        this.d = null;
        this.f = aVar;
    }
}
