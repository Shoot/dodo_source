package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import defpackage.g80;
import java.util.Map;
/* compiled from: BaseRequestOptions.java */
/* renamed from: g80  reason: default package */
/* loaded from: classes.dex */
public abstract class g80<T extends g80<T>> implements Cloneable {
    private int a;
    private Drawable e;
    private int f;
    private Drawable g;
    private int h;
    private boolean m;
    private Drawable o;
    private int p;
    private boolean t;
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean z;
    private float b = 1.0f;
    @NonNull
    private d33 c = d33.e;
    @NonNull
    private yj8 d = yj8.NORMAL;
    private boolean i = true;
    private int j = -1;
    private int k = -1;
    @NonNull
    private se5 l = ug3.c();
    private boolean n = true;
    @NonNull
    private ac7 q = new ac7();
    @NonNull
    private Map<Class<?>, tkb<?>> r = new yl0();
    @NonNull
    private Class<?> s = Object.class;
    private boolean y = true;

    private boolean L(int i) {
        return M(this.a, i);
    }

    private static boolean M(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    private T X(@NonNull a73 a73Var, @NonNull tkb<Bitmap> tkbVar) {
        return d0(a73Var, tkbVar, false);
    }

    @NonNull
    private T d0(@NonNull a73 a73Var, @NonNull tkb<Bitmap> tkbVar, boolean z) {
        T Y;
        if (z) {
            Y = m0(a73Var, tkbVar);
        } else {
            Y = Y(a73Var, tkbVar);
        }
        Y.y = true;
        return Y;
    }

    public final float A() {
        return this.b;
    }

    public final Resources.Theme B() {
        return this.u;
    }

    @NonNull
    public final Map<Class<?>, tkb<?>> C() {
        return this.r;
    }

    public final boolean D() {
        return this.z;
    }

    public final boolean F() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean G() {
        return this.v;
    }

    public final boolean H(g80<?> g80Var) {
        if (Float.compare(g80Var.b, this.b) == 0 && this.f == g80Var.f && vub.e(this.e, g80Var.e) && this.h == g80Var.h && vub.e(this.g, g80Var.g) && this.p == g80Var.p && vub.e(this.o, g80Var.o) && this.i == g80Var.i && this.j == g80Var.j && this.k == g80Var.k && this.m == g80Var.m && this.n == g80Var.n && this.w == g80Var.w && this.x == g80Var.x && this.c.equals(g80Var.c) && this.d == g80Var.d && this.q.equals(g80Var.q) && this.r.equals(g80Var.r) && this.s.equals(g80Var.s) && vub.e(this.l, g80Var.l) && vub.e(this.u, g80Var.u)) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.i;
    }

    public final boolean J() {
        return L(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K() {
        return this.y;
    }

    public final boolean N() {
        return this.n;
    }

    public final boolean O() {
        return this.m;
    }

    public final boolean P() {
        return L(2048);
    }

    public final boolean Q() {
        return vub.v(this.k, this.j);
    }

    @NonNull
    public T R() {
        this.t = true;
        return e0();
    }

    @NonNull
    public T S(boolean z) {
        if (this.v) {
            return (T) clone().S(z);
        }
        this.x = z;
        this.a |= 524288;
        return f0();
    }

    @NonNull
    public T T() {
        return Y(a73.e, new wt0());
    }

    @NonNull
    public T U() {
        return X(a73.d, new xt0());
    }

    @NonNull
    public T V() {
        return X(a73.c, new oy3());
    }

    @NonNull
    final T Y(@NonNull a73 a73Var, @NonNull tkb<Bitmap> tkbVar) {
        if (this.v) {
            return (T) clone().Y(a73Var, tkbVar);
        }
        h(a73Var);
        return p0(tkbVar, false);
    }

    @NonNull
    public T Z(int i, int i2) {
        if (this.v) {
            return (T) clone().Z(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        return f0();
    }

    @NonNull
    public T a0(int i) {
        if (this.v) {
            return (T) clone().a0(i);
        }
        this.h = i;
        this.g = null;
        this.a = (this.a | 128) & (-65);
        return f0();
    }

    @NonNull
    public T b(@NonNull g80<?> g80Var) {
        if (this.v) {
            return (T) clone().b(g80Var);
        }
        if (M(g80Var.a, 2)) {
            this.b = g80Var.b;
        }
        if (M(g80Var.a, 262144)) {
            this.w = g80Var.w;
        }
        if (M(g80Var.a, 1048576)) {
            this.z = g80Var.z;
        }
        if (M(g80Var.a, 4)) {
            this.c = g80Var.c;
        }
        if (M(g80Var.a, 8)) {
            this.d = g80Var.d;
        }
        if (M(g80Var.a, 16)) {
            this.e = g80Var.e;
            this.f = 0;
            this.a &= -33;
        }
        if (M(g80Var.a, 32)) {
            this.f = g80Var.f;
            this.e = null;
            this.a &= -17;
        }
        if (M(g80Var.a, 64)) {
            this.g = g80Var.g;
            this.h = 0;
            this.a &= -129;
        }
        if (M(g80Var.a, 128)) {
            this.h = g80Var.h;
            this.g = null;
            this.a &= -65;
        }
        if (M(g80Var.a, 256)) {
            this.i = g80Var.i;
        }
        if (M(g80Var.a, 512)) {
            this.k = g80Var.k;
            this.j = g80Var.j;
        }
        if (M(g80Var.a, 1024)) {
            this.l = g80Var.l;
        }
        if (M(g80Var.a, 4096)) {
            this.s = g80Var.s;
        }
        if (M(g80Var.a, 8192)) {
            this.o = g80Var.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (M(g80Var.a, 16384)) {
            this.p = g80Var.p;
            this.o = null;
            this.a &= -8193;
        }
        if (M(g80Var.a, 32768)) {
            this.u = g80Var.u;
        }
        if (M(g80Var.a, 65536)) {
            this.n = g80Var.n;
        }
        if (M(g80Var.a, 131072)) {
            this.m = g80Var.m;
        }
        if (M(g80Var.a, 2048)) {
            this.r.putAll(g80Var.r);
            this.y = g80Var.y;
        }
        if (M(g80Var.a, 524288)) {
            this.x = g80Var.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.a;
            this.m = false;
            this.a = i & (-133121);
            this.y = true;
        }
        this.a |= g80Var.a;
        this.q.d(g80Var.q);
        return f0();
    }

    @NonNull
    public T b0(@NonNull yj8 yj8Var) {
        if (this.v) {
            return (T) clone().b0(yj8Var);
        }
        this.d = (yj8) eh8.d(yj8Var);
        this.a |= 8;
        return f0();
    }

    @NonNull
    public T c() {
        if (this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        return R();
    }

    T c0(@NonNull mb7<?> mb7Var) {
        if (this.v) {
            return (T) clone().c0(mb7Var);
        }
        this.q.e(mb7Var);
        return f0();
    }

    @NonNull
    public T d() {
        return m0(a73.e, new wt0());
    }

    @Override // 
    /* renamed from: e */
    public T clone() {
        try {
            T t = (T) super.clone();
            ac7 ac7Var = new ac7();
            t.q = ac7Var;
            ac7Var.d(this.q);
            yl0 yl0Var = new yl0();
            t.r = yl0Var;
            yl0Var.putAll(this.r);
            t.t = false;
            t.v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof g80) {
            return H((g80) obj);
        }
        return false;
    }

    @NonNull
    public T f(@NonNull Class<?> cls) {
        if (this.v) {
            return (T) clone().f(cls);
        }
        this.s = (Class) eh8.d(cls);
        this.a |= 4096;
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public final T f0() {
        if (!this.t) {
            return e0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @NonNull
    public T g(@NonNull d33 d33Var) {
        if (this.v) {
            return (T) clone().g(d33Var);
        }
        this.c = (d33) eh8.d(d33Var);
        this.a |= 4;
        return f0();
    }

    @NonNull
    public <Y> T g0(@NonNull mb7<Y> mb7Var, @NonNull Y y) {
        if (this.v) {
            return (T) clone().g0(mb7Var, y);
        }
        eh8.d(mb7Var);
        eh8.d(y);
        this.q.f(mb7Var, y);
        return f0();
    }

    @NonNull
    public T h(@NonNull a73 a73Var) {
        return g0(a73.h, eh8.d(a73Var));
    }

    @NonNull
    public T h0(@NonNull se5 se5Var) {
        if (this.v) {
            return (T) clone().h0(se5Var);
        }
        this.l = (se5) eh8.d(se5Var);
        this.a |= 1024;
        return f0();
    }

    public int hashCode() {
        return vub.q(this.u, vub.q(this.l, vub.q(this.s, vub.q(this.r, vub.q(this.q, vub.q(this.d, vub.q(this.c, vub.r(this.x, vub.r(this.w, vub.r(this.n, vub.r(this.m, vub.p(this.k, vub.p(this.j, vub.r(this.i, vub.q(this.o, vub.p(this.p, vub.q(this.g, vub.p(this.h, vub.q(this.e, vub.p(this.f, vub.m(this.b)))))))))))))))))))));
    }

    @NonNull
    public T i(int i) {
        if (this.v) {
            return (T) clone().i(i);
        }
        this.f = i;
        this.e = null;
        this.a = (this.a | 32) & (-17);
        return f0();
    }

    @NonNull
    public T i0(float f) {
        if (this.v) {
            return (T) clone().i0(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.b = f;
            this.a |= 2;
            return f0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @NonNull
    public final d33 j() {
        return this.c;
    }

    @NonNull
    public T j0(boolean z) {
        if (this.v) {
            return (T) clone().j0(true);
        }
        this.i = !z;
        this.a |= 256;
        return f0();
    }

    @NonNull
    public T k0(Resources.Theme theme) {
        if (this.v) {
            return (T) clone().k0(theme);
        }
        this.u = theme;
        if (theme != null) {
            this.a |= 32768;
            return g0(tj9.b, theme);
        }
        this.a &= -32769;
        return c0(tj9.b);
    }

    public final int l() {
        return this.f;
    }

    @NonNull
    public T l0(int i) {
        return g0(jq4.b, Integer.valueOf(i));
    }

    public final Drawable m() {
        return this.e;
    }

    @NonNull
    final T m0(@NonNull a73 a73Var, @NonNull tkb<Bitmap> tkbVar) {
        if (this.v) {
            return (T) clone().m0(a73Var, tkbVar);
        }
        h(a73Var);
        return o0(tkbVar);
    }

    public final Drawable n() {
        return this.o;
    }

    public final int o() {
        return this.p;
    }

    @NonNull
    public T o0(@NonNull tkb<Bitmap> tkbVar) {
        return p0(tkbVar, true);
    }

    public final boolean p() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    T p0(@NonNull tkb<Bitmap> tkbVar, boolean z) {
        if (this.v) {
            return (T) clone().p0(tkbVar, z);
        }
        n83 n83Var = new n83(tkbVar, z);
        r0(Bitmap.class, tkbVar, z);
        r0(Drawable.class, n83Var, z);
        r0(BitmapDrawable.class, n83Var.c(), z);
        r0(kf4.class, new of4(tkbVar), z);
        return f0();
    }

    @NonNull
    public final ac7 q() {
        return this.q;
    }

    public final int r() {
        return this.j;
    }

    @NonNull
    <Y> T r0(@NonNull Class<Y> cls, @NonNull tkb<Y> tkbVar, boolean z) {
        if (this.v) {
            return (T) clone().r0(cls, tkbVar, z);
        }
        eh8.d(cls);
        eh8.d(tkbVar);
        this.r.put(cls, tkbVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.y = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        return f0();
    }

    public final int s() {
        return this.k;
    }

    @NonNull
    public T s0(@NonNull tkb<Bitmap>... tkbVarArr) {
        if (tkbVarArr.length > 1) {
            return p0(new aq6(tkbVarArr), true);
        }
        if (tkbVarArr.length == 1) {
            return o0(tkbVarArr[0]);
        }
        return f0();
    }

    public final Drawable t() {
        return this.g;
    }

    @NonNull
    public T t0(boolean z) {
        if (this.v) {
            return (T) clone().t0(z);
        }
        this.z = z;
        this.a |= 1048576;
        return f0();
    }

    public final int v() {
        return this.h;
    }

    @NonNull
    public final yj8 w() {
        return this.d;
    }

    @NonNull
    public final Class<?> y() {
        return this.s;
    }

    @NonNull
    public final se5 z() {
        return this.l;
    }

    private T e0() {
        return this;
    }
}
