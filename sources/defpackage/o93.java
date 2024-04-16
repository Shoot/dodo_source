package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import defpackage.o93;
import defpackage.rk;
import java.util.ArrayList;
/* compiled from: DynamicAnimation.java */
/* renamed from: o93  reason: default package */
/* loaded from: classes.dex */
public abstract class o93<T extends o93<T>> implements rk.b {
    public static final r m = new f("translationX");
    public static final r n = new g("translationY");
    public static final r o = new h("translationZ");
    public static final r p = new i("scaleX");
    public static final r q = new j("scaleY");
    public static final r r = new k("rotation");
    public static final r s = new l("rotationX");
    public static final r t = new m("rotationY");
    public static final r u = new n("x");
    public static final r v = new a("y");
    public static final r w = new b("z");
    public static final r x = new c("alpha");
    public static final r y = new d("scrollX");
    public static final r z = new e("scrollY");
    final Object d;
    final lz3 e;
    private float j;
    float a = 0.0f;
    float b = Float.MAX_VALUE;
    boolean c = false;
    boolean f = false;
    float g = Float.MAX_VALUE;
    float h = -Float.MAX_VALUE;
    private long i = 0;
    private final ArrayList<p> k = new ArrayList<>();
    private final ArrayList<q> l = new ArrayList<>();

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$a */
    /* loaded from: classes.dex */
    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getY();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$b */
    /* loaded from: classes.dex */
    static class b extends r {
        b(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return syb.R(view);
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            syb.R0(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$c */
    /* loaded from: classes.dex */
    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$d */
    /* loaded from: classes.dex */
    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$e */
    /* loaded from: classes.dex */
    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$f */
    /* loaded from: classes.dex */
    static class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$g */
    /* loaded from: classes.dex */
    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$h */
    /* loaded from: classes.dex */
    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return syb.O(view);
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            syb.P0(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$i */
    /* loaded from: classes.dex */
    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$j */
    /* loaded from: classes.dex */
    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$k */
    /* loaded from: classes.dex */
    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$l */
    /* loaded from: classes.dex */
    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$m */
    /* loaded from: classes.dex */
    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$n */
    /* loaded from: classes.dex */
    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(View view) {
            return view.getX();
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$o */
    /* loaded from: classes.dex */
    static class o {
        float a;
        float b;
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$p */
    /* loaded from: classes.dex */
    public interface p {
        void a(o93 o93Var, boolean z, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$q */
    /* loaded from: classes.dex */
    public interface q {
        void a(o93 o93Var, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: o93$r */
    /* loaded from: classes.dex */
    public static abstract class r extends lz3<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> o93(K k2, lz3<K> lz3Var) {
        this.d = k2;
        this.e = lz3Var;
        if (lz3Var != r && lz3Var != s && lz3Var != t) {
            if (lz3Var == x) {
                this.j = 0.00390625f;
                return;
            } else if (lz3Var != p && lz3Var != q) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }

    private void b(boolean z2) {
        this.f = false;
        rk.d().g(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z2, this.b, this.a);
            }
        }
        f(this.k);
    }

    private float c() {
        return this.e.a(this.d);
    }

    private static <T> void f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (!this.f) {
            this.f = true;
            if (!this.c) {
                this.b = c();
            }
            float f2 = this.b;
            if (f2 <= this.g && f2 >= this.h) {
                rk.d().a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // defpackage.rk.b
    public boolean a(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            g(this.b);
            return false;
        }
        this.i = j2;
        boolean k2 = k(j2 - j3);
        float min = Math.min(this.b, this.g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        g(max);
        if (k2) {
            b(false);
        }
        return k2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.j * 0.75f;
    }

    public boolean e() {
        return this.f;
    }

    void g(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, this.b, this.a);
            }
        }
        f(this.l);
    }

    public T h(float f2) {
        this.b = f2;
        this.c = true;
        return this;
    }

    public void i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f) {
                j();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    abstract boolean k(long j2);
}
