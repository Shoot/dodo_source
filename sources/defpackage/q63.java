package defpackage;
/* compiled from: DoubleCheck.java */
/* renamed from: q63  reason: default package */
/* loaded from: classes2.dex */
public final class q63<T> implements as8<T> {
    private static final Object c = new Object();
    private volatile as8<T> a;
    private volatile Object b = c;

    private q63(as8<T> as8Var) {
        this.a = as8Var;
    }

    public static <P extends as8<T>, T> as8<T> a(P p) {
        fh8.b(p);
        if (p instanceof q63) {
            return p;
        }
        return new q63(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // defpackage.as8
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.b;
                    if (t == obj) {
                        t = this.a.get();
                        this.b = b(this.b, t);
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
