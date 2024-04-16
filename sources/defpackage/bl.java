package defpackage;

import defpackage.j81;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
/* compiled from: AnnotatedClass.java */
/* renamed from: bl  reason: default package */
/* loaded from: classes2.dex */
public final class bl extends al implements znb {
    private static final a o = new a(null, Collections.emptyList(), Collections.emptyList());
    protected final y85 a;
    protected final Class<?> b;
    protected final qnb c;
    protected final List<y85> d;
    protected final ql e;
    protected final rnb f;
    protected final j81.a g;
    protected final Class<?> h;
    protected final boolean i;
    protected final tl j;
    protected a k;
    protected kl l;
    protected List<fl> m;
    protected transient Boolean n;

    /* compiled from: AnnotatedClass.java */
    /* renamed from: bl$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final dl a;
        public final List<dl> b;
        public final List<il> c;

        public a(dl dlVar, List<dl> list, List<il> list2) {
            this.a = dlVar;
            this.b = list;
            this.c = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bl(y85 y85Var, Class<?> cls, List<y85> list, Class<?> cls2, tl tlVar, qnb qnbVar, ql qlVar, j81.a aVar, rnb rnbVar, boolean z) {
        this.a = y85Var;
        this.b = cls;
        this.d = list;
        this.h = cls2;
        this.j = tlVar;
        this.c = qnbVar;
        this.e = qlVar;
        this.g = aVar;
        this.f = rnbVar;
        this.i = z;
    }

    private final a i() {
        a aVar = this.k;
        if (aVar == null) {
            y85 y85Var = this.a;
            if (y85Var == null) {
                aVar = o;
            } else {
                aVar = el.p(this.e, this.f, this, y85Var, this.h, this.i);
            }
            this.k = aVar;
        }
        return aVar;
    }

    private final List<fl> j() {
        List<fl> list = this.m;
        if (list == null) {
            y85 y85Var = this.a;
            if (y85Var == null) {
                list = Collections.emptyList();
            } else {
                list = gl.m(this.e, this, this.g, this.f, y85Var, this.i);
            }
            this.m = list;
        }
        return list;
    }

    private final kl k() {
        kl klVar = this.l;
        if (klVar == null) {
            y85 y85Var = this.a;
            if (y85Var == null) {
                klVar = new kl();
            } else {
                klVar = jl.m(this.e, this, this.g, this.f, y85Var, this.d, this.h, this.i);
            }
            this.l = klVar;
        }
        return klVar;
    }

    @Override // defpackage.znb
    public y85 a(Type type) {
        return this.f.W(type, this.c);
    }

    @Override // defpackage.al
    public <A extends Annotation> A b(Class<A> cls) {
        return (A) this.j.a(cls);
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.b;
    }

    @Override // defpackage.al
    public y85 d() {
        return this.a;
    }

    @Override // defpackage.al
    public boolean e(Class<?> cls) {
        return this.j.b(cls);
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (q81.E(obj, bl.class) && ((bl) obj).b == this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.al
    public boolean f(Class<? extends Annotation>[] clsArr) {
        return this.j.c(clsArr);
    }

    @Override // defpackage.al
    public String getName() {
        return this.b.getName();
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.b.getName().hashCode();
    }

    public Iterable<fl> l() {
        return j();
    }

    public Class<?> m() {
        return this.b;
    }

    public tl n() {
        return this.j;
    }

    public List<dl> o() {
        return i().b;
    }

    public dl q() {
        return i().a;
    }

    public List<il> r() {
        return i().c;
    }

    public boolean s() {
        if (this.j.size() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[AnnotedClass " + this.b.getName() + "]";
    }

    public boolean u() {
        Boolean bool = this.n;
        if (bool == null) {
            bool = Boolean.valueOf(q81.L(this.b));
            this.n = bool;
        }
        return bool.booleanValue();
    }

    public Iterable<il> w() {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bl(Class<?> cls) {
        this.a = null;
        this.b = cls;
        this.d = Collections.emptyList();
        this.h = null;
        this.j = pl.d();
        this.c = qnb.j();
        this.e = null;
        this.g = null;
        this.f = null;
        this.i = false;
    }
}
