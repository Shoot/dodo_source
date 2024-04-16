package defpackage;

import java.lang.annotation.Annotation;
/* compiled from: Qualified.java */
/* renamed from: su8  reason: default package */
/* loaded from: classes2.dex */
public final class su8<T> {
    private final Class<? extends Annotation> a;
    private final Class<T> b;

    /* compiled from: Qualified.java */
    /* renamed from: su8$a */
    /* loaded from: classes2.dex */
    private @interface a {
    }

    public su8(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> su8<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new su8<>(cls, cls2);
    }

    public static <T> su8<T> b(Class<T> cls) {
        return new su8<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || su8.class != obj.getClass()) {
            return false;
        }
        su8 su8Var = (su8) obj;
        if (!this.b.equals(su8Var.b)) {
            return false;
        }
        return this.a.equals(su8Var.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
