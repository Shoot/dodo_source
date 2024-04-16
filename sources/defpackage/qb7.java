package defpackage;

import java.util.NoSuchElementException;
/* compiled from: Optional.java */
/* renamed from: qb7  reason: default package */
/* loaded from: classes2.dex */
public final class qb7<T> {
    private final T a;

    private qb7() {
        this.a = null;
    }

    public static <T> qb7<T> a() {
        return new qb7<>();
    }

    public static <T> qb7<T> b(T t) {
        if (t == null) {
            return a();
        }
        return e(t);
    }

    public static <T> qb7<T> e(T t) {
        return new qb7<>(t);
    }

    public T c() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    private qb7(T t) {
        if (t == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.a = t;
    }
}
