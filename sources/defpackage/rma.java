package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: SingleRequest.java */
/* renamed from: rma  reason: default package */
/* loaded from: classes.dex */
public final class rma<R> implements ii9, kna, pj9 {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;
    private int a;
    private final String b;
    private final eva c;
    private final Object d;
    private final vi9<R> e;
    private final ki9 f;
    private final Context g;
    private final d h;
    private final Object i;
    private final Class<R> j;
    private final g80<?> k;
    private final int l;
    private final int m;
    private final yj8 n;
    private final n6b<R> o;
    private final List<vi9<R>> p;
    private final elb<? super R> q;
    private final Executor r;
    private nj9<R> s;
    private j.d t;
    private long u;
    private volatile j v;
    private a w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRequest.java */
    /* renamed from: rma$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private rma(Context context, d dVar, @NonNull Object obj, Object obj2, Class<R> cls, g80<?> g80Var, int i, int i2, yj8 yj8Var, n6b<R> n6bVar, vi9<R> vi9Var, List<vi9<R>> list, ki9 ki9Var, j jVar, elb<? super R> elbVar, Executor executor) {
        String str;
        if (E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.b = str;
        this.c = eva.a();
        this.d = obj;
        this.g = context;
        this.h = dVar;
        this.i = obj2;
        this.j = cls;
        this.k = g80Var;
        this.l = i;
        this.m = i2;
        this.n = yj8Var;
        this.o = n6bVar;
        this.e = vi9Var;
        this.p = list;
        this.f = ki9Var;
        this.v = jVar;
        this.q = elbVar;
        this.r = executor;
        this.w = a.PENDING;
        if (this.D == null && dVar.g().a(c.C0097c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(nj9<R> nj9Var, R r, dl2 dl2Var, boolean z) {
        boolean z2;
        boolean s = s();
        this.w = a.COMPLETE;
        this.s = nj9Var;
        if (this.h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + dl2Var + " for " + this.i + " with size [" + this.A + "x" + this.B + "] in " + hx5.a(this.u) + " ms");
        }
        x();
        boolean z3 = true;
        this.C = true;
        try {
            List<vi9<R>> list = this.p;
            if (list != null) {
                z2 = false;
                for (vi9<R> vi9Var : list) {
                    boolean f = z2 | vi9Var.f(r, this.i, this.o, dl2Var, s);
                    if (vi9Var instanceof in3) {
                        z2 = ((in3) vi9Var).b(r, this.i, this.o, dl2Var, s, z) | f;
                    } else {
                        z2 = f;
                    }
                }
            } else {
                z2 = false;
            }
            vi9<R> vi9Var2 = this.e;
            if (vi9Var2 == null || !vi9Var2.f(r, this.i, this.o, dl2Var, s)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.o.d(r, this.q.a(dl2Var, s));
            }
            this.C = false;
            fg4.f("GlideRequest", this.a);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    private void B() {
        Drawable drawable;
        if (!l()) {
            return;
        }
        if (this.i == null) {
            drawable = q();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = p();
        }
        if (drawable == null) {
            drawable = r();
        }
        this.o.b(drawable);
    }

    private void i() {
        if (!this.C) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    private boolean j() {
        ki9 ki9Var = this.f;
        if (ki9Var != null && !ki9Var.c(this)) {
            return false;
        }
        return true;
    }

    private boolean l() {
        ki9 ki9Var = this.f;
        if (ki9Var != null && !ki9Var.i(this)) {
            return false;
        }
        return true;
    }

    private boolean m() {
        ki9 ki9Var = this.f;
        if (ki9Var != null && !ki9Var.j(this)) {
            return false;
        }
        return true;
    }

    private void n() {
        i();
        this.c.c();
        this.o.l(this);
        j.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
            this.t = null;
        }
    }

    private void o(Object obj) {
        List<vi9<R>> list = this.p;
        if (list == null) {
            return;
        }
        for (vi9<R> vi9Var : list) {
            if (vi9Var instanceof in3) {
                ((in3) vi9Var).a(obj);
            }
        }
    }

    private Drawable p() {
        if (this.x == null) {
            Drawable m = this.k.m();
            this.x = m;
            if (m == null && this.k.l() > 0) {
                this.x = t(this.k.l());
            }
        }
        return this.x;
    }

    private Drawable q() {
        if (this.z == null) {
            Drawable n = this.k.n();
            this.z = n;
            if (n == null && this.k.o() > 0) {
                this.z = t(this.k.o());
            }
        }
        return this.z;
    }

    private Drawable r() {
        if (this.y == null) {
            Drawable t = this.k.t();
            this.y = t;
            if (t == null && this.k.v() > 0) {
                this.y = t(this.k.v());
            }
        }
        return this.y;
    }

    private boolean s() {
        ki9 ki9Var = this.f;
        if (ki9Var != null && ki9Var.b().a()) {
            return false;
        }
        return true;
    }

    private Drawable t(int i) {
        Resources.Theme theme;
        if (this.k.B() != null) {
            theme = this.k.B();
        } else {
            theme = this.g.getTheme();
        }
        return j83.a(this.g, i, theme);
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    private static int v(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return Math.round(f * i);
        }
        return i;
    }

    private void w() {
        ki9 ki9Var = this.f;
        if (ki9Var != null) {
            ki9Var.d(this);
        }
    }

    private void x() {
        ki9 ki9Var = this.f;
        if (ki9Var != null) {
            ki9Var.f(this);
        }
    }

    public static <R> rma<R> y(Context context, d dVar, Object obj, Object obj2, Class<R> cls, g80<?> g80Var, int i, int i2, yj8 yj8Var, n6b<R> n6bVar, vi9<R> vi9Var, List<vi9<R>> list, ki9 ki9Var, j jVar, elb<? super R> elbVar, Executor executor) {
        return new rma<>(context, dVar, obj, obj2, cls, g80Var, i, i2, yj8Var, n6bVar, vi9Var, list, ki9Var, jVar, elbVar, executor);
    }

    private void z(GlideException glideException, int i) {
        boolean z;
        this.c.c();
        synchronized (this.d) {
            try {
                glideException.m(this.D);
                int h = this.h.h();
                if (h <= i) {
                    Log.w("Glide", "Load failed for [" + this.i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                    if (h <= 4) {
                        glideException.i("Glide");
                    }
                }
                this.t = null;
                this.w = a.FAILED;
                w();
                boolean z2 = true;
                this.C = true;
                List<vi9<R>> list = this.p;
                if (list != null) {
                    z = false;
                    for (vi9<R> vi9Var : list) {
                        z |= vi9Var.e(glideException, this.i, this.o, s());
                    }
                } else {
                    z = false;
                }
                vi9<R> vi9Var2 = this.e;
                if (vi9Var2 == null || !vi9Var2.e(glideException, this.i, this.o, s())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    B();
                }
                this.C = false;
                fg4.f("GlideRequest", this.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ii9
    public boolean a() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pj9
    public void b(nj9<?> nj9Var, dl2 dl2Var, boolean z) {
        Object obj;
        String str;
        this.c.c();
        nj9<?> nj9Var2 = null;
        try {
            synchronized (this.d) {
                try {
                    this.t = null;
                    if (nj9Var == null) {
                        c(new GlideException("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = nj9Var.get();
                    try {
                        if (obj2 != null && this.j.isAssignableFrom(obj2.getClass())) {
                            if (!m()) {
                                this.s = null;
                                this.w = a.COMPLETE;
                                fg4.f("GlideRequest", this.a);
                                this.v.k(nj9Var);
                                return;
                            }
                            A(nj9Var, obj2, dl2Var, z);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.j);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(nj9Var);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        c(new GlideException(sb.toString()));
                        this.v.k(nj9Var);
                    } catch (Throwable th) {
                        nj9Var2 = nj9Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (nj9Var2 != null) {
                this.v.k(nj9Var2);
            }
            throw th3;
        }
    }

    @Override // defpackage.pj9
    public void c(GlideException glideException) {
        z(glideException, 5);
    }

    @Override // defpackage.ii9
    public void clear() {
        synchronized (this.d) {
            try {
                i();
                this.c.c();
                a aVar = this.w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                n();
                nj9<R> nj9Var = this.s;
                if (nj9Var != null) {
                    this.s = null;
                } else {
                    nj9Var = null;
                }
                if (j()) {
                    this.o.i(r());
                }
                fg4.f("GlideRequest", this.a);
                this.w = aVar2;
                if (nj9Var != null) {
                    this.v.k(nj9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kna
    public void d(int i, int i2) {
        Object obj;
        this.c.c();
        Object obj2 = this.d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = E;
                    if (z) {
                        u("Got onSizeReady in " + hx5.a(this.u));
                    }
                    if (this.w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.w = aVar;
                        float A = this.k.A();
                        this.A = v(i, A);
                        this.B = v(i2, A);
                        if (z) {
                            u("finished setup for calling load in " + hx5.a(this.u));
                        }
                        obj = obj2;
                        try {
                            this.t = this.v.f(this.h, this.i, this.k.z(), this.A, this.B, this.k.y(), this.j, this.n, this.k.j(), this.k.C(), this.k.O(), this.k.K(), this.k.q(), this.k.I(), this.k.F(), this.k.D(), this.k.p(), this, this.r);
                            if (this.w != aVar) {
                                this.t = null;
                            }
                            if (z) {
                                u("finished onSizeReady in " + hx5.a(this.u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // defpackage.ii9
    public boolean e() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.pj9
    public Object f() {
        this.c.c();
        return this.d;
    }

    @Override // defpackage.ii9
    public boolean g() {
        boolean z;
        synchronized (this.d) {
            if (this.w == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public boolean h(ii9 ii9Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        g80<?> g80Var;
        yj8 yj8Var;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        g80<?> g80Var2;
        yj8 yj8Var2;
        int i6;
        if (!(ii9Var instanceof rma)) {
            return false;
        }
        synchronized (this.d) {
            try {
                i = this.l;
                i2 = this.m;
                obj = this.i;
                cls = this.j;
                g80Var = this.k;
                yj8Var = this.n;
                List<vi9<R>> list = this.p;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        rma rmaVar = (rma) ii9Var;
        synchronized (rmaVar.d) {
            try {
                i4 = rmaVar.l;
                i5 = rmaVar.m;
                obj2 = rmaVar.i;
                cls2 = rmaVar.j;
                g80Var2 = rmaVar.k;
                yj8Var2 = rmaVar.n;
                List<vi9<R>> list2 = rmaVar.p;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        if (i == i4 && i2 == i5 && vub.d(obj, obj2) && cls.equals(cls2) && vub.c(g80Var, g80Var2) && yj8Var == yj8Var2 && i3 == i6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ii9
    public boolean isRunning() {
        boolean z;
        synchronized (this.d) {
            try {
                a aVar = this.w;
                if (aVar != a.RUNNING && aVar != a.WAITING_FOR_SIZE) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public void k() {
        int i;
        synchronized (this.d) {
            try {
                i();
                this.c.c();
                this.u = hx5.b();
                Object obj = this.i;
                if (obj == null) {
                    if (vub.v(this.l, this.m)) {
                        this.A = this.l;
                        this.B = this.m;
                    }
                    if (q() == null) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    z(new GlideException("Received null model"), i);
                    return;
                }
                a aVar = this.w;
                a aVar2 = a.RUNNING;
                if (aVar != aVar2) {
                    if (aVar == a.COMPLETE) {
                        b(this.s, dl2.MEMORY_CACHE, false);
                        return;
                    }
                    o(obj);
                    this.a = fg4.b("GlideRequest");
                    a aVar3 = a.WAITING_FOR_SIZE;
                    this.w = aVar3;
                    if (vub.v(this.l, this.m)) {
                        d(this.l, this.m);
                    } else {
                        this.o.c(this);
                    }
                    a aVar4 = this.w;
                    if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                        this.o.a(r());
                    }
                    if (E) {
                        u("finished run method in " + hx5.a(this.u));
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ii9
    public void pause() {
        synchronized (this.d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
