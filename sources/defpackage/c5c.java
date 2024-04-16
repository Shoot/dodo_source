package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* compiled from: WindowInsetsCompat.java */
/* renamed from: c5c  reason: default package */
/* loaded from: classes.dex */
public class c5c {
    @NonNull
    public static final c5c b;
    private final l a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: c5c$a */
    /* loaded from: classes.dex */
    public static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static c5c a(@NonNull View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            c5c a2 = new b().b(n45.c(rect)).c(n45.c(rect2)).a();
                            a2.t(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(@NonNull c5c c5cVar) {
            super(c5cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$f */
    /* loaded from: classes.dex */
    public static class f {
        private final c5c a;
        n45[] b;

        f() {
            this(new c5c((c5c) null));
        }

        protected final void a() {
            n45[] n45VarArr = this.b;
            if (n45VarArr != null) {
                n45 n45Var = n45VarArr[m.b(1)];
                n45 n45Var2 = this.b[m.b(2)];
                if (n45Var2 == null) {
                    n45Var2 = this.a.f(2);
                }
                if (n45Var == null) {
                    n45Var = this.a.f(1);
                }
                f(n45.a(n45Var, n45Var2));
                n45 n45Var3 = this.b[m.b(16)];
                if (n45Var3 != null) {
                    e(n45Var3);
                }
                n45 n45Var4 = this.b[m.b(32)];
                if (n45Var4 != null) {
                    c(n45Var4);
                }
                n45 n45Var5 = this.b[m.b(64)];
                if (n45Var5 != null) {
                    g(n45Var5);
                }
            }
        }

        @NonNull
        c5c b() {
            throw null;
        }

        void d(@NonNull n45 n45Var) {
            throw null;
        }

        void f(@NonNull n45 n45Var) {
            throw null;
        }

        f(@NonNull c5c c5cVar) {
            this.a = c5cVar;
        }

        void c(@NonNull n45 n45Var) {
        }

        void e(@NonNull n45 n45Var) {
        }

        void g(@NonNull n45 n45Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$g */
    /* loaded from: classes.dex */
    public static class g extends l {
        private static boolean h = false;
        private static Method i;
        private static Class<?> j;
        private static Field k;
        private static Field l;
        @NonNull
        final WindowInsets c;
        private n45[] d;
        private n45 e;
        private c5c f;
        n45 g;

        g(@NonNull c5c c5cVar, @NonNull WindowInsets windowInsets) {
            super(c5cVar);
            this.e = null;
            this.c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private n45 t(int i2, boolean z) {
            n45 n45Var = n45.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    n45Var = n45.a(n45Var, u(i3, z));
                }
            }
            return n45Var;
        }

        private n45 v() {
            c5c c5cVar = this.f;
            if (c5cVar != null) {
                return c5cVar.g();
            }
            return n45.e;
        }

        private n45 w(@NonNull View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    x();
                }
                Method method = i;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) k.get(l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return n45.c(rect);
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @Override // defpackage.c5c.l
        void d(@NonNull View view) {
            n45 w = w(view);
            if (w == null) {
                w = n45.e;
            }
            q(w);
        }

        @Override // defpackage.c5c.l
        void e(@NonNull c5c c5cVar) {
            c5cVar.t(this.f);
            c5cVar.s(this.g);
        }

        @Override // defpackage.c5c.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.g, ((g) obj).g);
        }

        @Override // defpackage.c5c.l
        @NonNull
        public n45 g(int i2) {
            return t(i2, false);
        }

        @Override // defpackage.c5c.l
        @NonNull
        final n45 k() {
            if (this.e == null) {
                this.e = n45.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // defpackage.c5c.l
        @NonNull
        c5c m(int i2, int i3, int i4, int i5) {
            b bVar = new b(c5c.w(this.c));
            bVar.c(c5c.o(k(), i2, i3, i4, i5));
            bVar.b(c5c.o(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // defpackage.c5c.l
        boolean o() {
            return this.c.isRound();
        }

        @Override // defpackage.c5c.l
        public void p(n45[] n45VarArr) {
            this.d = n45VarArr;
        }

        @Override // defpackage.c5c.l
        void q(@NonNull n45 n45Var) {
            this.g = n45Var;
        }

        @Override // defpackage.c5c.l
        void r(c5c c5cVar) {
            this.f = c5cVar;
        }

        @NonNull
        protected n45 u(int i2, boolean z) {
            int i3;
            x33 f;
            if (i2 != 1) {
                n45 n45Var = null;
                if (i2 != 2) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return n45.e;
                                    }
                                    c5c c5cVar = this.f;
                                    if (c5cVar != null) {
                                        f = c5cVar.e();
                                    } else {
                                        f = f();
                                    }
                                    if (f != null) {
                                        return n45.b(f.b(), f.d(), f.c(), f.a());
                                    }
                                    return n45.e;
                                }
                                return l();
                            }
                            return h();
                        }
                        return j();
                    }
                    n45[] n45VarArr = this.d;
                    if (n45VarArr != null) {
                        n45Var = n45VarArr[m.b(8)];
                    }
                    if (n45Var != null) {
                        return n45Var;
                    }
                    n45 k2 = k();
                    n45 v = v();
                    int i4 = k2.d;
                    if (i4 > v.d) {
                        return n45.b(0, 0, 0, i4);
                    }
                    n45 n45Var2 = this.g;
                    if (n45Var2 != null && !n45Var2.equals(n45.e) && (i3 = this.g.d) > v.d) {
                        return n45.b(0, 0, 0, i3);
                    }
                    return n45.e;
                } else if (z) {
                    n45 v2 = v();
                    n45 i5 = i();
                    return n45.b(Math.max(v2.a, i5.a), 0, Math.max(v2.c, i5.c), Math.max(v2.d, i5.d));
                } else {
                    n45 k3 = k();
                    c5c c5cVar2 = this.f;
                    if (c5cVar2 != null) {
                        n45Var = c5cVar2.g();
                    }
                    int i6 = k3.d;
                    if (n45Var != null) {
                        i6 = Math.min(i6, n45Var.d);
                    }
                    return n45.b(k3.a, 0, k3.c, i6);
                }
            } else if (z) {
                return n45.b(0, Math.max(v().b, k().b), 0, 0);
            } else {
                return n45.b(0, k().b, 0, 0);
            }
        }

        g(@NonNull c5c c5cVar, @NonNull g gVar) {
            this(c5cVar, new WindowInsets(gVar.c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$h */
    /* loaded from: classes.dex */
    private static class h extends g {
        private n45 m;

        h(@NonNull c5c c5cVar, @NonNull WindowInsets windowInsets) {
            super(c5cVar, windowInsets);
            this.m = null;
        }

        @Override // defpackage.c5c.l
        @NonNull
        c5c b() {
            return c5c.w(this.c.consumeStableInsets());
        }

        @Override // defpackage.c5c.l
        @NonNull
        c5c c() {
            return c5c.w(this.c.consumeSystemWindowInsets());
        }

        @Override // defpackage.c5c.l
        @NonNull
        final n45 i() {
            if (this.m == null) {
                this.m = n45.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // defpackage.c5c.l
        boolean n() {
            return this.c.isConsumed();
        }

        @Override // defpackage.c5c.l
        public void s(n45 n45Var) {
            this.m = n45Var;
        }

        h(@NonNull c5c c5cVar, @NonNull h hVar) {
            super(c5cVar, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$i */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(@NonNull c5c c5cVar, @NonNull WindowInsets windowInsets) {
            super(c5cVar, windowInsets);
        }

        @Override // defpackage.c5c.l
        @NonNull
        c5c a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.c.consumeDisplayCutout();
            return c5c.w(consumeDisplayCutout);
        }

        @Override // defpackage.c5c.g, defpackage.c5c.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.c5c.l
        x33 f() {
            DisplayCutout displayCutout;
            displayCutout = this.c.getDisplayCutout();
            return x33.e(displayCutout);
        }

        @Override // defpackage.c5c.l
        public int hashCode() {
            return this.c.hashCode();
        }

        i(@NonNull c5c c5cVar, @NonNull i iVar) {
            super(c5cVar, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$j */
    /* loaded from: classes.dex */
    private static class j extends i {
        private n45 n;
        private n45 o;
        private n45 p;

        j(@NonNull c5c c5cVar, @NonNull WindowInsets windowInsets) {
            super(c5cVar, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // defpackage.c5c.l
        @NonNull
        n45 h() {
            Insets mandatorySystemGestureInsets;
            if (this.o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.o = n45.d(mandatorySystemGestureInsets);
            }
            return this.o;
        }

        @Override // defpackage.c5c.l
        @NonNull
        n45 j() {
            Insets systemGestureInsets;
            if (this.n == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.n = n45.d(systemGestureInsets);
            }
            return this.n;
        }

        @Override // defpackage.c5c.l
        @NonNull
        n45 l() {
            Insets tappableElementInsets;
            if (this.p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.p = n45.d(tappableElementInsets);
            }
            return this.p;
        }

        @Override // defpackage.c5c.g, defpackage.c5c.l
        @NonNull
        c5c m(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.c.inset(i, i2, i3, i4);
            return c5c.w(inset);
        }

        j(@NonNull c5c c5cVar, @NonNull j jVar) {
            super(c5cVar, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // defpackage.c5c.h, defpackage.c5c.l
        public void s(n45 n45Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$k */
    /* loaded from: classes.dex */
    private static class k extends j {
        @NonNull
        static final c5c q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            q = c5c.w(windowInsets);
        }

        k(@NonNull c5c c5cVar, @NonNull WindowInsets windowInsets) {
            super(c5cVar, windowInsets);
        }

        @Override // defpackage.c5c.g, defpackage.c5c.l
        @NonNull
        public n45 g(int i) {
            Insets insets;
            insets = this.c.getInsets(n.a(i));
            return n45.d(insets);
        }

        k(@NonNull c5c c5cVar, @NonNull k kVar) {
            super(c5cVar, kVar);
        }

        @Override // defpackage.c5c.g, defpackage.c5c.l
        final void d(@NonNull View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$m */
    /* loaded from: classes.dex */
    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                if (i != 8) {
                    if (i == 16) {
                        return 4;
                    }
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                if (i == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 7;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$n */
    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.b;
        }
    }

    private c5c(@NonNull WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new i(this, windowInsets);
        } else {
            this.a = new h(this, windowInsets);
        }
    }

    static n45 o(@NonNull n45 n45Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, n45Var.a - i2);
        int max2 = Math.max(0, n45Var.b - i3);
        int max3 = Math.max(0, n45Var.c - i4);
        int max4 = Math.max(0, n45Var.d - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return n45Var;
        }
        return n45.b(max, max2, max3, max4);
    }

    @NonNull
    public static c5c w(@NonNull WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    @NonNull
    public static c5c x(@NonNull WindowInsets windowInsets, View view) {
        c5c c5cVar = new c5c((WindowInsets) kh8.f(windowInsets));
        if (view != null && syb.X(view)) {
            c5cVar.t(syb.L(view));
            c5cVar.d(view.getRootView());
        }
        return c5cVar;
    }

    @NonNull
    @Deprecated
    public c5c a() {
        return this.a.a();
    }

    @NonNull
    @Deprecated
    public c5c b() {
        return this.a.b();
    }

    @NonNull
    @Deprecated
    public c5c c() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@NonNull View view) {
        this.a.d(view);
    }

    public x33 e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5c)) {
            return false;
        }
        return p57.a(this.a, ((c5c) obj).a);
    }

    @NonNull
    public n45 f(int i2) {
        return this.a.g(i2);
    }

    @NonNull
    @Deprecated
    public n45 g() {
        return this.a.i();
    }

    @NonNull
    @Deprecated
    public n45 h() {
        return this.a.j();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().d;
    }

    @Deprecated
    public int j() {
        return this.a.k().a;
    }

    @Deprecated
    public int k() {
        return this.a.k().c;
    }

    @Deprecated
    public int l() {
        return this.a.k().b;
    }

    @Deprecated
    public boolean m() {
        return !this.a.k().equals(n45.e);
    }

    @NonNull
    public c5c n(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean p() {
        return this.a.n();
    }

    @NonNull
    @Deprecated
    public c5c q(int i2, int i3, int i4, int i5) {
        return new b(this).c(n45.b(i2, i3, i4, i5)).a();
    }

    void r(n45[] n45VarArr) {
        this.a.p(n45VarArr);
    }

    void s(@NonNull n45 n45Var) {
        this.a.q(n45Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(c5c c5cVar) {
        this.a.r(c5cVar);
    }

    void u(n45 n45Var) {
        this.a.s(n45Var);
    }

    public WindowInsets v() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$c */
    /* loaded from: classes.dex */
    private static class c extends f {
        private static Field e = null;
        private static boolean f = false;
        private static Constructor<WindowInsets> g = null;
        private static boolean h = false;
        private WindowInsets c;
        private n45 d;

        c() {
            this.c = h();
        }

        private static WindowInsets h() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // defpackage.c5c.f
        @NonNull
        c5c b() {
            a();
            c5c w = c5c.w(this.c);
            w.r(this.b);
            w.u(this.d);
            return w;
        }

        @Override // defpackage.c5c.f
        void d(n45 n45Var) {
            this.d = n45Var;
        }

        @Override // defpackage.c5c.f
        void f(@NonNull n45 n45Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(n45Var.a, n45Var.b, n45Var.c, n45Var.d);
            }
        }

        c(@NonNull c5c c5cVar) {
            super(c5cVar);
            this.c = c5cVar.v();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$d */
    /* loaded from: classes.dex */
    private static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = zra.a();
        }

        @Override // defpackage.c5c.f
        @NonNull
        c5c b() {
            WindowInsets build;
            a();
            build = this.c.build();
            c5c w = c5c.w(build);
            w.r(this.b);
            return w;
        }

        @Override // defpackage.c5c.f
        void c(@NonNull n45 n45Var) {
            this.c.setMandatorySystemGestureInsets(n45Var.e());
        }

        @Override // defpackage.c5c.f
        void d(@NonNull n45 n45Var) {
            this.c.setStableInsets(n45Var.e());
        }

        @Override // defpackage.c5c.f
        void e(@NonNull n45 n45Var) {
            this.c.setSystemGestureInsets(n45Var.e());
        }

        @Override // defpackage.c5c.f
        void f(@NonNull n45 n45Var) {
            this.c.setSystemWindowInsets(n45Var.e());
        }

        @Override // defpackage.c5c.f
        void g(@NonNull n45 n45Var) {
            this.c.setTappableElementInsets(n45Var.e());
        }

        d(@NonNull c5c c5cVar) {
            super(c5cVar);
            WindowInsets.Builder a;
            WindowInsets v = c5cVar.v();
            if (v != null) {
                a = i5c.a(v);
            } else {
                a = zra.a();
            }
            this.c = a;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        @NonNull
        public c5c a() {
            return this.a.b();
        }

        @NonNull
        @Deprecated
        public b b(@NonNull n45 n45Var) {
            this.a.d(n45Var);
            return this;
        }

        @NonNull
        @Deprecated
        public b c(@NonNull n45 n45Var) {
            this.a.f(n45Var);
            return this;
        }

        public b(@NonNull c5c c5cVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(c5cVar);
            } else if (i >= 29) {
                this.a = new d(c5cVar);
            } else {
                this.a = new c(c5cVar);
            }
        }
    }

    public c5c(c5c c5cVar) {
        if (c5cVar != null) {
            l lVar = c5cVar.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: c5c$l */
    /* loaded from: classes.dex */
    public static class l {
        @NonNull
        static final c5c b = new b().a().a().b().c();
        final c5c a;

        l(@NonNull c5c c5cVar) {
            this.a = c5cVar;
        }

        @NonNull
        c5c a() {
            return this.a;
        }

        @NonNull
        c5c b() {
            return this.a;
        }

        @NonNull
        c5c c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (o() == lVar.o() && n() == lVar.n() && p57.a(k(), lVar.k()) && p57.a(i(), lVar.i()) && p57.a(f(), lVar.f())) {
                return true;
            }
            return false;
        }

        x33 f() {
            return null;
        }

        @NonNull
        n45 g(int i) {
            return n45.e;
        }

        @NonNull
        n45 h() {
            return k();
        }

        public int hashCode() {
            return p57.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        @NonNull
        n45 i() {
            return n45.e;
        }

        @NonNull
        n45 j() {
            return k();
        }

        @NonNull
        n45 k() {
            return n45.e;
        }

        @NonNull
        n45 l() {
            return k();
        }

        @NonNull
        c5c m(int i, int i2, int i3, int i4) {
            return b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(@NonNull View view) {
        }

        void e(@NonNull c5c c5cVar) {
        }

        public void p(n45[] n45VarArr) {
        }

        void q(@NonNull n45 n45Var) {
        }

        void r(c5c c5cVar) {
        }

        public void s(n45 n45Var) {
        }
    }
}
