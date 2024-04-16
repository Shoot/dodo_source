package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public class g extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private RecyclerView s;
    final ValueAnimator z;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.h(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            g.this.s(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) g.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                g gVar = g.this;
                gVar.A = 0;
                gVar.p(0);
            } else {
                g gVar2 = g.this;
                gVar2.A = 2;
                gVar2.m();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            g.this.c.setAlpha(floatValue);
            g.this.d.setAlpha(floatValue);
            g.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        a(recyclerView);
    }

    private void b() {
        this.s.removeCallbacks(this.B);
    }

    private void c() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        b();
    }

    private void d(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.g.setBounds(0, 0, i5, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void e(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.r);
        if (j()) {
            this.d.draw(canvas);
            canvas.translate(this.e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    private int[] f() {
        int[] iArr = this.y;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    private int[] g() {
        int[] iArr = this.x;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    private void i(float f) {
        int[] f2 = f();
        float max = Math.max(f2[0], Math.min(f2[1], f));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        int o = o(this.p, max, f2, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (o != 0) {
            this.s.scrollBy(o, 0);
        }
        this.p = max;
    }

    private boolean j() {
        if (syb.E(this.s) == 1) {
            return true;
        }
        return false;
    }

    private void n(int i) {
        b();
        this.s.postDelayed(this.B, i);
    }

    private int o(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private void q() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    private void t(float f) {
        int[] g = g();
        float max = Math.max(g[0], Math.min(g[1], f));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int o = o(this.m, max, g, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (o != 0) {
            this.s.scrollBy(0, o);
        }
        this.m = max;
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            c();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            q();
        }
    }

    void h(int i) {
        int i2 = this.A;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.z.cancel();
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    boolean k(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean l(float f, float f2) {
        if (!j() ? f >= this.q - this.e : f <= this.e) {
            int i = this.l;
            int i2 = this.k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    void m() {
        this.s.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    e(canvas);
                }
                if (this.u) {
                    d(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        p(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean l = l(motionEvent.getX(), motionEvent.getY());
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!l && !k) {
                return false;
            }
            if (k) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (l) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            p(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean l = l(motionEvent.getX(), motionEvent.getY());
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            if (l || k) {
                if (k) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (l) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                p(2);
            }
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            p(1);
            this.w = 0;
        } else if (motionEvent.getAction() == 2 && this.v == 2) {
            r();
            if (this.w == 1) {
                i(motionEvent.getX());
            }
            if (this.w == 2) {
                t(motionEvent.getY());
            }
        }
    }

    void p(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(D);
            b();
        }
        if (i == 0) {
            m();
        } else {
            r();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(E);
            n(1200);
        } else if (i == 1) {
            n(1500);
        }
        this.v = i;
    }

    public void r() {
        int i = this.A;
        if (i != 0) {
            if (i == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void s(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.a) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.u = z2;
        boolean z3 = this.t;
        if (!z3 && !z2) {
            if (this.v != 0) {
                p(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            p(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }
}
