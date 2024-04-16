package defpackage;
/* compiled from: TemporalQueries.java */
/* renamed from: v8b  reason: default package */
/* loaded from: classes3.dex */
public final class v8b {
    static final w8b<vcc> a = new a();
    static final w8b<p71> b = new b();
    static final w8b<x8b> c = new c();
    static final w8b<vcc> d = new d();
    static final w8b<wcc> e = new e();
    static final w8b<ds5> f = new f();
    static final w8b<gs5> g = new g();

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$a */
    /* loaded from: classes3.dex */
    class a implements w8b<vcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public vcc a(q8b q8bVar) {
            return (vcc) q8bVar.M(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$b */
    /* loaded from: classes3.dex */
    class b implements w8b<p71> {
        b() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public p71 a(q8b q8bVar) {
            return (p71) q8bVar.M(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$c */
    /* loaded from: classes3.dex */
    class c implements w8b<x8b> {
        c() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public x8b a(q8b q8bVar) {
            return (x8b) q8bVar.M(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$d */
    /* loaded from: classes3.dex */
    class d implements w8b<vcc> {
        d() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public vcc a(q8b q8bVar) {
            vcc vccVar = (vcc) q8bVar.M(v8b.a);
            if (vccVar == null) {
                return (vcc) q8bVar.M(v8b.e);
            }
            return vccVar;
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$e */
    /* loaded from: classes3.dex */
    class e implements w8b<wcc> {
        e() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public wcc a(q8b q8bVar) {
            h71 h71Var = h71.T4;
            if (q8bVar.G(h71Var)) {
                return wcc.h0(q8bVar.w(h71Var));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$f */
    /* loaded from: classes3.dex */
    class f implements w8b<ds5> {
        f() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public ds5 a(q8b q8bVar) {
            h71 h71Var = h71.y;
            if (q8bVar.G(h71Var)) {
                return ds5.Z0(q8bVar.q(h71Var));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    /* renamed from: v8b$g */
    /* loaded from: classes3.dex */
    class g implements w8b<gs5> {
        g() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public gs5 a(q8b q8bVar) {
            h71 h71Var = h71.f;
            if (q8bVar.G(h71Var)) {
                return gs5.r0(q8bVar.q(h71Var));
            }
            return null;
        }
    }

    public static final w8b<p71> a() {
        return b;
    }

    public static final w8b<ds5> b() {
        return f;
    }

    public static final w8b<gs5> c() {
        return g;
    }

    public static final w8b<wcc> d() {
        return e;
    }

    public static final w8b<x8b> e() {
        return c;
    }

    public static final w8b<vcc> f() {
        return d;
    }

    public static final w8b<vcc> g() {
        return a;
    }
}
