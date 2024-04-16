package defpackage;
/* compiled from: LottieValueCallback.java */
/* renamed from: b06  reason: default package */
/* loaded from: classes.dex */
public class b06<T> {
    private final qz5<T> a;
    private t70<?, ?> b;
    protected T c;

    public b06() {
        this.a = new qz5<>();
        this.c = null;
    }

    public T a(qz5<T> qz5Var) {
        return this.c;
    }

    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.a.h(f, f2, t, t2, f3, f4, f5));
    }

    public final void c(t70<?, ?> t70Var) {
        this.b = t70Var;
    }

    public b06(T t) {
        this.a = new qz5<>();
        this.c = t;
    }
}
