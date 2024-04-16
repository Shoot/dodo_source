package defpackage;
/* compiled from: InstanceFactory.java */
/* renamed from: z45  reason: default package */
/* loaded from: classes3.dex */
public final class z45<T> implements no3<T> {
    private static final z45<Object> b = new z45<>(null);
    private final T a;

    private z45(T t) {
        this.a = t;
    }

    public static <T> no3<T> a(T t) {
        return new z45(jh8.c(t, "instance cannot be null"));
    }

    public static <T> no3<T> b(T t) {
        if (t == null) {
            return c();
        }
        return new z45(t);
    }

    private static <T> z45<T> c() {
        return (z45<T>) b;
    }

    @Override // defpackage.as8
    public T get() {
        return this.a;
    }
}
