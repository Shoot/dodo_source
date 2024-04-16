package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
/* compiled from: AnnotatedField.java */
/* renamed from: fl  reason: default package */
/* loaded from: classes2.dex */
public final class fl extends hl implements Serializable {
    protected final transient Field c;
    protected a d;

    /* compiled from: AnnotatedField.java */
    /* renamed from: fl$a */
    /* loaded from: classes2.dex */
    private static final class a implements Serializable {
        protected Class<?> a;
        protected String b;

        public a(Field field) {
            this.a = field.getDeclaringClass();
            this.b = field.getName();
        }
    }

    public fl(znb znbVar, Field field, rl rlVar) {
        super(znbVar, rlVar);
        this.c = field;
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.c.getType();
    }

    @Override // defpackage.al
    public y85 d() {
        return this.a.a(this.c.getGenericType());
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, fl.class)) {
            return false;
        }
        Field field = ((fl) obj).c;
        if (field == null) {
            if (this.c == null) {
                return true;
            }
            return false;
        }
        return field.equals(this.c);
    }

    @Override // defpackage.al
    public String getName() {
        return this.c.getName();
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.c.getName().hashCode();
    }

    @Override // defpackage.hl
    public Class<?> k() {
        return this.c.getDeclaringClass();
    }

    @Override // defpackage.hl
    public Member m() {
        return this.c;
    }

    @Override // defpackage.hl
    public Object n(Object obj) throws IllegalArgumentException {
        try {
            return this.c.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + l() + ": " + e.getMessage(), e);
        }
    }

    public Field q() {
        return this.c;
    }

    public int r() {
        return this.c.getModifiers();
    }

    Object readResolve() {
        a aVar = this.d;
        Class<?> cls = aVar.a;
        try {
            Field declaredField = cls.getDeclaredField(aVar.b);
            if (!declaredField.isAccessible()) {
                q81.g(declaredField, false);
            }
            return new fl(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.d.b + "' from Class '" + cls.getName());
        }
    }

    public boolean s() {
        return Modifier.isTransient(r());
    }

    public String toString() {
        return "[field " + l() + "]";
    }

    @Override // defpackage.hl
    /* renamed from: u */
    public fl o(rl rlVar) {
        return new fl(this.a, this.c, rlVar);
    }

    Object writeReplace() {
        return new fl(new a(this.c));
    }

    protected fl(a aVar) {
        super(null, null);
        this.c = null;
        this.d = aVar;
    }
}
