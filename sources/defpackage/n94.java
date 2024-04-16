package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;
/* compiled from: Functions.java */
/* renamed from: n94  reason: default package */
/* loaded from: classes3.dex */
public final class n94 {
    static final z84<Object, Object> a = new h();
    public static final Runnable b = new e();
    public static final t4 c = new b();
    static final wr1<Object> d = new c();
    public static final wr1<Throwable> e = new f();
    public static final wr1<Throwable> f = new m();
    public static final jy5 g = new d();
    static final oh8<Object> h = new n();
    static final oh8<Object> i = new g();
    static final Callable<Object> j = new l();
    static final Comparator<Object> k = new k();
    public static final wr1<k1b> l = new j();

    /* compiled from: Functions.java */
    /* renamed from: n94$a */
    /* loaded from: classes3.dex */
    static final class a<T1, T2, R> implements z84<Object[], R> {
        final ya0<? super T1, ? super T2, ? extends R> a;

        a(ya0<? super T1, ? super T2, ? extends R> ya0Var) {
            this.a = ya0Var;
        }

        @Override // defpackage.z84
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.a.a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$d */
    /* loaded from: classes3.dex */
    static final class d implements jy5 {
        d() {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$f */
    /* loaded from: classes3.dex */
    static final class f implements wr1<Throwable> {
        f() {
        }

        @Override // defpackage.wr1
        /* renamed from: a */
        public void accept(Throwable th) {
            tp9.q(th);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$g */
    /* loaded from: classes3.dex */
    static final class g implements oh8<Object> {
        g() {
        }

        @Override // defpackage.oh8
        public boolean b(Object obj) {
            return false;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$i */
    /* loaded from: classes3.dex */
    static final class i<T, U> implements Callable<U>, z84<T, U> {
        final U a;

        i(U u) {
            this.a = u;
        }

        @Override // defpackage.z84
        public U apply(T t) throws Exception {
            return this.a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.a;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$j */
    /* loaded from: classes3.dex */
    static final class j implements wr1<k1b> {
        j() {
        }

        @Override // defpackage.wr1
        /* renamed from: a */
        public void accept(k1b k1bVar) throws Exception {
            k1bVar.w(Long.MAX_VALUE);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$k */
    /* loaded from: classes3.dex */
    static final class k implements Comparator<Object> {
        k() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$l */
    /* loaded from: classes3.dex */
    static final class l implements Callable<Object> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$m */
    /* loaded from: classes3.dex */
    static final class m implements wr1<Throwable> {
        m() {
        }

        @Override // defpackage.wr1
        /* renamed from: a */
        public void accept(Throwable th) {
            tp9.q(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$n */
    /* loaded from: classes3.dex */
    static final class n implements oh8<Object> {
        n() {
        }

        @Override // defpackage.oh8
        public boolean b(Object obj) {
            return true;
        }
    }

    public static <T> wr1<T> a() {
        return (wr1<T>) d;
    }

    public static <T> z84<T, T> b() {
        return (z84<T, T>) a;
    }

    public static <T, U> z84<T, U> c(U u) {
        return new i(u);
    }

    public static <T1, T2, R> z84<Object[], R> d(ya0<? super T1, ? super T2, ? extends R> ya0Var) {
        x47.e(ya0Var, "f is null");
        return new a(ya0Var);
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$b */
    /* loaded from: classes3.dex */
    static final class b implements t4 {
        b() {
        }

        public String toString() {
            return "EmptyAction";
        }

        @Override // defpackage.t4
        public void run() {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$e */
    /* loaded from: classes3.dex */
    static final class e implements Runnable {
        e() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$c */
    /* loaded from: classes3.dex */
    static final class c implements wr1<Object> {
        c() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        @Override // defpackage.wr1
        public void accept(Object obj) {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: n94$h */
    /* loaded from: classes3.dex */
    static final class h implements z84<Object, Object> {
        h() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        @Override // defpackage.z84
        public Object apply(Object obj) {
            return obj;
        }
    }
}
