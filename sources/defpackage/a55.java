package defpackage;
/* compiled from: InstanceFactory.java */
/* renamed from: a55  reason: default package */
/* loaded from: classes2.dex */
public final class a55<T> implements oo3<T> {
    private static final a55<Object> b = new a55<>(null);
    private final T a;

    private a55(T t) {
        this.a = t;
    }

    public static <T> oo3<T> a(T t) {
        return new a55(fh8.c(t, "instance cannot be null"));
    }

    @Override // defpackage.as8
    public T get() {
        return this.a;
    }
}
