package defpackage;

import android.os.Looper;
import io.realm.DynamicRealmObject;
import io.realm.d0;
import io.realm.j0;
import io.realm.k0;
import io.realm.m;
import io.realm.n0;
import io.realm.p0;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: RealmObservableFactory.java */
/* renamed from: s89  reason: default package */
/* loaded from: classes3.dex */
public class s89 implements up9 {
    private static final h60 e = h60.LATEST;
    private final boolean a;
    private ThreadLocal<h<p0>> b = new e();
    private ThreadLocal<h<k0>> c = new f();
    private ThreadLocal<h<o89>> d = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$a */
    /* loaded from: classes3.dex */
    public class a<E> implements h14<E> {
        final /* synthetic */ d0 a;
        final /* synthetic */ j0 b;
        final /* synthetic */ o89 c;

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0659a implements d89<E> {
            final /* synthetic */ t04 a;

            C0659a(t04 t04Var) {
                this.a = t04Var;
            }

            /* JADX WARN: Incorrect types in method signature: (TE;)V */
            @Override // defpackage.d89
            /* renamed from: b */
            public void a(o89 o89Var) {
                if (!this.a.isCancelled()) {
                    t04 t04Var = this.a;
                    if (s89.this.a) {
                        o89Var = n0.freeze(o89Var);
                    }
                    t04Var.d(o89Var);
                }
            }
        }

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$a$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            final /* synthetic */ d0 a;
            final /* synthetic */ d89 b;

            b(d0 d0Var, d89 d89Var) {
                this.a = d0Var;
                this.b = d89Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.a.isClosed()) {
                    n0.removeChangeListener(a.this.c, this.b);
                    this.a.close();
                }
                ((h) s89.this.d.get()).b(a.this.c);
            }
        }

        a(d0 d0Var, j0 j0Var, o89 o89Var) {
            this.a = d0Var;
            this.b = j0Var;
            this.c = o89Var;
        }

        @Override // defpackage.h14
        public void a(t04<E> t04Var) {
            o89 o89Var;
            if (this.a.isClosed()) {
                return;
            }
            d0 F0 = d0.F0(this.b);
            ((h) s89.this.d.get()).a(this.c);
            C0659a c0659a = new C0659a(t04Var);
            n0.addChangeListener(this.c, c0659a);
            t04Var.b(j43.c(new b(F0, c0659a)));
            if (s89.this.a) {
                o89Var = n0.freeze(this.c);
            } else {
                o89Var = this.c;
            }
            t04Var.d(o89Var);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$b */
    /* loaded from: classes3.dex */
    class b<E> implements z57<o47<E>> {
        final /* synthetic */ o89 a;
        final /* synthetic */ j0 b;

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$b$a */
        /* loaded from: classes3.dex */
        class a implements q89<E> {
            final /* synthetic */ u57 a;

            a(u57 u57Var) {
                this.a = u57Var;
            }

            /* JADX WARN: Incorrect types in method signature: (TE;Lp47;)V */
            @Override // defpackage.q89
            public void a(o89 o89Var, p47 p47Var) {
                if (!this.a.i()) {
                    u57 u57Var = this.a;
                    if (s89.this.a) {
                        o89Var = n0.freeze(o89Var);
                    }
                    u57Var.d(new o47(o89Var, p47Var));
                }
            }
        }

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0660b implements Runnable {
            final /* synthetic */ d0 a;
            final /* synthetic */ q89 b;

            RunnableC0660b(d0 d0Var, q89 q89Var) {
                this.a = d0Var;
                this.b = q89Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.a.isClosed()) {
                    n0.removeChangeListener(b.this.a, this.b);
                    this.a.close();
                }
                ((h) s89.this.d.get()).b(b.this.a);
            }
        }

        b(o89 o89Var, j0 j0Var) {
            this.a = o89Var;
            this.b = j0Var;
        }

        @Override // defpackage.z57
        public void a(u57<o47<E>> u57Var) {
            o89 o89Var;
            if (!n0.isValid(this.a)) {
                return;
            }
            d0 F0 = d0.F0(this.b);
            ((h) s89.this.d.get()).a(this.a);
            a aVar = new a(u57Var);
            n0.addChangeListener(this.a, aVar);
            u57Var.b(j43.c(new RunnableC0660b(F0, aVar)));
            if (s89.this.a) {
                o89Var = n0.freeze(this.a);
            } else {
                o89Var = this.a;
            }
            u57Var.d(new o47<>(o89Var, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$c */
    /* loaded from: classes3.dex */
    public class c implements h14<DynamicRealmObject> {
        final /* synthetic */ m a;
        final /* synthetic */ j0 b;
        final /* synthetic */ DynamicRealmObject c;

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$c$a */
        /* loaded from: classes3.dex */
        class a implements d89<DynamicRealmObject> {
            final /* synthetic */ t04 a;

            a(t04 t04Var) {
                this.a = t04Var;
            }

            @Override // defpackage.d89
            /* renamed from: b */
            public void a(DynamicRealmObject dynamicRealmObject) {
                if (!this.a.isCancelled()) {
                    t04 t04Var = this.a;
                    if (s89.this.a) {
                        dynamicRealmObject = (DynamicRealmObject) n0.freeze(dynamicRealmObject);
                    }
                    t04Var.d(dynamicRealmObject);
                }
            }
        }

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$c$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            final /* synthetic */ m a;
            final /* synthetic */ d89 b;

            b(m mVar, d89 d89Var) {
                this.a = mVar;
                this.b = d89Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.a.isClosed()) {
                    n0.removeChangeListener(c.this.c, this.b);
                    this.a.close();
                }
                ((h) s89.this.d.get()).b(c.this.c);
            }
        }

        c(m mVar, j0 j0Var, DynamicRealmObject dynamicRealmObject) {
            this.a = mVar;
            this.b = j0Var;
            this.c = dynamicRealmObject;
        }

        @Override // defpackage.h14
        public void a(t04<DynamicRealmObject> t04Var) {
            DynamicRealmObject dynamicRealmObject;
            if (this.a.isClosed()) {
                return;
            }
            m N = m.N(this.b);
            ((h) s89.this.d.get()).a(this.c);
            a aVar = new a(t04Var);
            n0.addChangeListener(this.c, aVar);
            t04Var.b(j43.c(new b(N, aVar)));
            if (s89.this.a) {
                dynamicRealmObject = (DynamicRealmObject) n0.freeze(this.c);
            } else {
                dynamicRealmObject = this.c;
            }
            t04Var.d(dynamicRealmObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$d */
    /* loaded from: classes3.dex */
    public class d implements z57<o47<DynamicRealmObject>> {
        final /* synthetic */ DynamicRealmObject a;
        final /* synthetic */ j0 b;

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$d$a */
        /* loaded from: classes3.dex */
        class a implements q89<DynamicRealmObject> {
            final /* synthetic */ u57 a;

            a(u57 u57Var) {
                this.a = u57Var;
            }

            @Override // defpackage.q89
            /* renamed from: b */
            public void a(DynamicRealmObject dynamicRealmObject, p47 p47Var) {
                if (!this.a.i()) {
                    u57 u57Var = this.a;
                    if (s89.this.a) {
                        dynamicRealmObject = (DynamicRealmObject) n0.freeze(dynamicRealmObject);
                    }
                    u57Var.d(new o47(dynamicRealmObject, p47Var));
                }
            }
        }

        /* compiled from: RealmObservableFactory.java */
        /* renamed from: s89$d$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            final /* synthetic */ m a;
            final /* synthetic */ q89 b;

            b(m mVar, q89 q89Var) {
                this.a = mVar;
                this.b = q89Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.a.isClosed()) {
                    n0.removeChangeListener(d.this.a, this.b);
                    this.a.close();
                }
                ((h) s89.this.d.get()).b(d.this.a);
            }
        }

        d(DynamicRealmObject dynamicRealmObject, j0 j0Var) {
            this.a = dynamicRealmObject;
            this.b = j0Var;
        }

        @Override // defpackage.z57
        public void a(u57<o47<DynamicRealmObject>> u57Var) {
            DynamicRealmObject dynamicRealmObject;
            if (!n0.isValid(this.a)) {
                return;
            }
            m N = m.N(this.b);
            ((h) s89.this.d.get()).a(this.a);
            a aVar = new a(u57Var);
            this.a.addChangeListener(aVar);
            u57Var.b(j43.c(new b(N, aVar)));
            if (s89.this.a) {
                dynamicRealmObject = (DynamicRealmObject) n0.freeze(this.a);
            } else {
                dynamicRealmObject = this.a;
            }
            u57Var.d(new o47<>(dynamicRealmObject, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$e */
    /* loaded from: classes3.dex */
    public class e extends ThreadLocal<h<p0>> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public h<p0> initialValue() {
            return new h<>(null);
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$f */
    /* loaded from: classes3.dex */
    class f extends ThreadLocal<h<k0>> {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public h<k0> initialValue() {
            return new h<>(null);
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$g */
    /* loaded from: classes3.dex */
    class g extends ThreadLocal<h<o89>> {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public h<o89> initialValue() {
            return new h<>(null);
        }
    }

    public s89(boolean z) {
        this.a = z;
    }

    private xv9 g() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return ti.a(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }

    @Override // defpackage.up9
    public <E extends o89> r57<o47<E>> a(d0 d0Var, E e2) {
        if (d0Var.E()) {
            return r57.l(new o47(e2, null));
        }
        j0 s = d0Var.s();
        xv9 g2 = g();
        return r57.i(new b(e2, s)).s(g2).x(g2);
    }

    @Override // defpackage.up9
    public <E extends o89> l04<E> b(d0 d0Var, E e2) {
        if (d0Var.E()) {
            return l04.F(e2);
        }
        j0 s = d0Var.s();
        xv9 g2 = g();
        return l04.i(new a(d0Var, s, e2), e).T(g2).b0(g2);
    }

    @Override // defpackage.up9
    public l04<DynamicRealmObject> c(m mVar, DynamicRealmObject dynamicRealmObject) {
        if (mVar.E()) {
            return l04.F(dynamicRealmObject);
        }
        j0 s = mVar.s();
        xv9 g2 = g();
        return l04.i(new c(mVar, s, dynamicRealmObject), e).T(g2).b0(g2);
    }

    @Override // defpackage.up9
    public r57<o47<DynamicRealmObject>> d(m mVar, DynamicRealmObject dynamicRealmObject) {
        if (mVar.E()) {
            return r57.l(new o47(dynamicRealmObject, null));
        }
        j0 s = mVar.s();
        xv9 g2 = g();
        return r57.i(new d(dynamicRealmObject, s)).s(g2).x(g2);
    }

    public boolean equals(Object obj) {
        return obj instanceof s89;
    }

    public int hashCode() {
        return 37;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: s89$h */
    /* loaded from: classes3.dex */
    public static class h<K> {
        private final Map<K, Integer> a;

        private h() {
            this.a = new IdentityHashMap();
        }

        public void a(K k) {
            Integer num = this.a.get(k);
            if (num == null) {
                this.a.put(k, 1);
            } else {
                this.a.put(k, Integer.valueOf(num.intValue() + 1));
            }
        }

        public void b(K k) {
            Integer num = this.a.get(k);
            if (num != null) {
                if (num.intValue() > 1) {
                    this.a.put(k, Integer.valueOf(num.intValue() - 1));
                    return;
                } else if (num.intValue() == 1) {
                    this.a.remove(k);
                    return;
                } else {
                    throw new IllegalStateException("Invalid reference count: " + num);
                }
            }
            throw new IllegalStateException("Object does not have any references: " + k);
        }

        /* synthetic */ h(e eVar) {
            this();
        }
    }
}
