package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
/* compiled from: AutoScrollHelper.java */
/* renamed from: b10  reason: default package */
/* loaded from: classes.dex */
public abstract class b10 implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    final View c;
    private Runnable d;
    private int g;
    private int h;
    private boolean l;
    boolean m;
    boolean n;
    boolean o;
    private boolean p;
    private boolean q;
    final a a = new a();
    private final Interpolator b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: b10$a */
    /* loaded from: classes.dex */
    public static class a {
        private int a;
        private int b;
        private float c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        a() {
        }

        private float e(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 >= 0 && j >= j3) {
                float f = this.j;
                return (1.0f - f) + (f * b10.e(((float) (j - j3)) / this.k, 0.0f, 1.0f));
            }
            return b10.e(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = g(e(currentAnimationTimeMillis));
                this.f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f)) * g;
                this.g = (int) (this.c * f);
                this.h = (int) (f * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean h() {
            if (this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k) {
                return true;
            }
            return false;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = b10.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: b10$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b10 b10Var = b10.this;
            if (!b10Var.o) {
                return;
            }
            if (b10Var.m) {
                b10Var.m = false;
                b10Var.a.m();
            }
            a aVar = b10.this.a;
            if (!aVar.h() && b10.this.u()) {
                b10 b10Var2 = b10.this;
                if (b10Var2.n) {
                    b10Var2.n = false;
                    b10Var2.c();
                }
                aVar.a();
                b10.this.j(aVar.b(), aVar.c());
                syb.m0(b10.this.c, this);
                return;
            }
            b10.this.o = false;
        }
    }

    public b10(@NonNull View view) {
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(r);
        r(500);
        q(500);
    }

    private float d(int i, float f, float f2, float f3) {
        float h = h(this.e[i], f2, this.f[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.i[i];
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return e(h * f7, f5, f6);
        }
        return -e((-h) * f7, f5, f6);
    }

    static float e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    static int f(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    private float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.o && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float e = e(f * f2, 0.0f, f3);
        float g = g(f2 - f4, e) - g(f4, e);
        if (g < 0.0f) {
            interpolation = -this.b.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.b.getInterpolation(g);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.m) {
            this.o = false;
        } else {
            this.a.i();
        }
    }

    private void v() {
        int i;
        if (this.d == null) {
            this.d = new b();
        }
        this.o = true;
        this.m = true;
        if (!this.l && (i = this.h) > 0) {
            syb.n0(this.c, this.d, i);
        } else {
            this.d.run();
        }
        this.l = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i, int i2);

    @NonNull
    public b10 k(int i) {
        this.h = i;
        return this;
    }

    @NonNull
    public b10 l(int i) {
        this.g = i;
        return this;
    }

    public b10 m(boolean z) {
        if (this.p && !z) {
            i();
        }
        this.p = z;
        return this;
    }

    @NonNull
    public b10 n(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public b10 o(float f, float f2) {
        float[] fArr = this.k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.n = r2
            r5.l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            b10$a r7 = r5.a
            r7.l(r0, r6)
            boolean r6 = r5.o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.q
            if (r6 == 0) goto L61
            boolean r6 = r5.o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @NonNull
    public b10 p(float f, float f2) {
        float[] fArr = this.j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public b10 q(int i) {
        this.a.j(i);
        return this;
    }

    @NonNull
    public b10 r(int i) {
        this.a.k(i);
        return this;
    }

    @NonNull
    public b10 s(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public b10 t(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    boolean u() {
        a aVar = this.a;
        int f = aVar.f();
        int d = aVar.d();
        if ((f != 0 && b(f)) || (d != 0 && a(d))) {
            return true;
        }
        return false;
    }
}
