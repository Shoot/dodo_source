package defpackage;

import java.io.Serializable;
/* compiled from: Equivalence.java */
/* renamed from: dk3  reason: default package */
/* loaded from: classes2.dex */
public abstract class dk3<T> {

    /* compiled from: Equivalence.java */
    /* renamed from: dk3$a */
    /* loaded from: classes2.dex */
    static final class a extends dk3<Object> implements Serializable {
        static final a a = new a();

        a() {
        }

        private Object readResolve() {
            return a;
        }

        @Override // defpackage.dk3
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // defpackage.dk3
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: dk3$b */
    /* loaded from: classes2.dex */
    static final class b extends dk3<Object> implements Serializable {
        static final b a = new b();

        b() {
        }

        private Object readResolve() {
            return a;
        }

        @Override // defpackage.dk3
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // defpackage.dk3
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected dk3() {
    }

    public static dk3<Object> c() {
        return a.a;
    }

    public static dk3<Object> f() {
        return b.a;
    }

    protected abstract boolean a(T t, T t2);

    protected abstract int b(T t);

    public final boolean d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return a(t, t2);
        }
        return false;
    }

    public final int e(T t) {
        if (t == null) {
            return 0;
        }
        return b(t);
    }
}
