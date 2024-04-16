package defpackage;

import java.util.concurrent.Callable;
/* compiled from: Schedulers.java */
/* renamed from: dw9  reason: default package */
/* loaded from: classes3.dex */
public final class dw9 {
    static final xv9 a = tp9.i(new h());
    static final xv9 b = tp9.f(new b());
    static final xv9 c = tp9.g(new c());
    static final xv9 d = ekb.g();
    static final xv9 e = tp9.h(new f());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: dw9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final xv9 a = new cp1();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: dw9$b */
    /* loaded from: classes3.dex */
    static final class b implements Callable<xv9> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public xv9 call() throws Exception {
            return a.a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: dw9$c */
    /* loaded from: classes3.dex */
    static final class c implements Callable<xv9> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public xv9 call() throws Exception {
            return d.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: dw9$d */
    /* loaded from: classes3.dex */
    public static final class d {
        static final xv9 a = new q75();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: dw9$e */
    /* loaded from: classes3.dex */
    public static final class e {
        static final xv9 a = new tx6();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: dw9$f */
    /* loaded from: classes3.dex */
    static final class f implements Callable<xv9> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public xv9 call() throws Exception {
            return e.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: dw9$g */
    /* loaded from: classes3.dex */
    public static final class g {
        static final xv9 a = new sma();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: dw9$h */
    /* loaded from: classes3.dex */
    static final class h implements Callable<xv9> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public xv9 call() throws Exception {
            return g.a;
        }
    }

    public static xv9 a() {
        return tp9.p(b);
    }

    public static xv9 b() {
        return tp9.r(c);
    }
}
