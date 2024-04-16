package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: Component.java */
/* renamed from: bm1  reason: default package */
/* loaded from: classes2.dex */
public final class bm1<T> {
    private final String a;
    private final Set<su8<? super T>> b;
    private final Set<d03> c;
    private final int d;
    private final int e;
    private final rm1<T> f;
    private final Set<Class<?>> g;

    public static <T> b<T> c(su8<T> su8Var) {
        return new b<>(su8Var, new su8[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(su8<T> su8Var, su8<? super T>... su8VarArr) {
        return new b<>(su8Var, su8VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> bm1<T> l(final T t, Class<T> cls) {
        return m(cls).f(new rm1() { // from class: zl1
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                Object q;
                q = bm1.q(t, im1Var);
                return q;
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    @SafeVarargs
    public static <T> bm1<T> s(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new rm1() { // from class: am1
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                Object r;
                r = bm1.r(t, im1Var);
                return r;
            }
        }).d();
    }

    public Set<d03> g() {
        return this.c;
    }

    public rm1<T> h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set<su8<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.g;
    }

    public boolean n() {
        if (this.d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public bm1<T> t(rm1<T> rm1Var) {
        return new bm1<>(this.a, this.b, this.c, this.d, this.e, rm1Var, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    /* renamed from: bm1$b */
    /* loaded from: classes2.dex */
    public static class b<T> {
        private String a;
        private final Set<su8<? super T>> b;
        private final Set<d03> c;
        private int d;
        private int e;
        private rm1<T> f;
        private final Set<Class<?>> g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.e = 1;
            return this;
        }

        private b<T> i(int i) {
            boolean z;
            if (this.d == 0) {
                z = true;
            } else {
                z = false;
            }
            ih8.d(z, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        private void j(su8<?> su8Var) {
            ih8.a(!this.b.contains(su8Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(d03 d03Var) {
            ih8.c(d03Var, "Null dependency");
            j(d03Var.c());
            this.c.add(d03Var);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public bm1<T> d() {
            boolean z;
            if (this.f != null) {
                z = true;
            } else {
                z = false;
            }
            ih8.d(z, "Missing required property: factory.");
            return new bm1<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(rm1<T> rm1Var) {
            this.f = (rm1) ih8.c(rm1Var, "Null factory");
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            ih8.c(cls, "Null interface");
            hashSet.add(su8.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                ih8.c(cls2, "Null interface");
                this.b.add(su8.b(cls2));
            }
        }

        @SafeVarargs
        private b(su8<T> su8Var, su8<? super T>... su8VarArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            ih8.c(su8Var, "Null interface");
            hashSet.add(su8Var);
            for (su8<? super T> su8Var2 : su8VarArr) {
                ih8.c(su8Var2, "Null interface");
            }
            Collections.addAll(this.b, su8VarArr);
        }
    }

    private bm1(String str, Set<su8<? super T>> set, Set<d03> set2, int i, int i2, rm1<T> rm1Var, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = rm1Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, im1 im1Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, im1 im1Var) {
        return obj;
    }
}
