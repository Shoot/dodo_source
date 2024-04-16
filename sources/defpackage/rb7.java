package defpackage;

import java.util.NoSuchElementException;
/* compiled from: Optional.java */
/* renamed from: rb7  reason: default package */
/* loaded from: classes.dex */
public class rb7<T> {
    private static final rb7<?> b = new rb7<>();
    private final T a;

    private rb7() {
        this.a = null;
    }

    public static <T> rb7<T> a() {
        return (rb7<T>) b;
    }

    public static <T> rb7<T> e(T t) {
        return new rb7<>(t);
    }

    public static <T> rb7<T> f(T t) {
        if (t == null) {
            return a();
        }
        return e(t);
    }

    public T b() {
        return g();
    }

    public boolean c() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb7)) {
            return false;
        }
        return o57.a(this.a, ((rb7) obj).a);
    }

    public T g() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return o57.b(this.a);
    }

    public String toString() {
        T t = this.a;
        if (t != null) {
            return String.format("Optional[%s]", t);
        }
        return "Optional.empty";
    }

    private rb7(T t) {
        this.a = (T) o57.c(t);
    }
}
