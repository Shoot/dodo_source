package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class n extends Drawable implements Drawable.Callback, Animatable {
    private Paint A;
    private Rect B;
    private Rect I;
    private Matrix S4;
    private boolean T4;
    private RectF X;
    private RectF Y;
    private Matrix Z;
    private ez5 a;
    private final a06 b;
    private boolean c;
    private boolean d;
    private boolean e;
    private c f;
    private final ArrayList<b> g;
    private final ValueAnimator.AnimatorUpdateListener h;
    private du4 i;
    private String j;
    private t24 k;
    private boolean l;
    private boolean m;
    private boolean n;
    private ko1 o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private he9 t;
    private boolean u;
    private final Matrix v;
    private Bitmap w;
    private Canvas x;
    private Rect y;
    private RectF z;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (n.this.o != null) {
                n.this.o.L(n.this.b.i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(ez5 ez5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public n() {
        a06 a06Var = new a06();
        this.b = a06Var;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = c.NONE;
        this.g = new ArrayList<>();
        a aVar = new a();
        this.h = aVar;
        this.m = false;
        this.n = true;
        this.p = 255;
        this.t = he9.AUTOMATIC;
        this.u = false;
        this.v = new Matrix();
        this.T4 = false;
        a06Var.addUpdateListener(aVar);
    }

    private void C(int i, int i2) {
        Bitmap bitmap = this.w;
        if (bitmap != null && bitmap.getWidth() >= i && this.w.getHeight() >= i2) {
            if (this.w.getWidth() > i || this.w.getHeight() > i2) {
                Bitmap createBitmap = Bitmap.createBitmap(this.w, 0, 0, i, i2);
                this.w = createBitmap;
                this.x.setBitmap(createBitmap);
                this.T4 = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.w = createBitmap2;
        this.x.setBitmap(createBitmap2);
        this.T4 = true;
    }

    private void D() {
        if (this.x != null) {
            return;
        }
        this.x = new Canvas();
        this.Y = new RectF();
        this.Z = new Matrix();
        this.S4 = new Matrix();
        this.y = new Rect();
        this.z = new RectF();
        this.A = new yi5();
        this.B = new Rect();
        this.I = new Rect();
        this.X = new RectF();
    }

    private Context H() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private t24 I() {
        if (getCallback() == null) {
            return null;
        }
        if (this.k == null) {
            this.k = new t24(getCallback(), null);
        }
        return this.k;
    }

    private du4 K() {
        if (getCallback() == null) {
            return null;
        }
        du4 du4Var = this.i;
        if (du4Var != null && !du4Var.b(H())) {
            this.i = null;
        }
        if (this.i == null) {
            this.i = new du4(getCallback(), this.j, null, this.a.j());
        }
        return this.i;
    }

    private boolean Y() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(of5 of5Var, Object obj, b06 b06Var, ez5 ez5Var) {
        q(of5Var, obj, b06Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(ez5 ez5Var) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(ez5 ez5Var) {
        t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(int i, ez5 ez5Var) {
        z0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(int i, ez5 ez5Var) {
        E0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(String str, ez5 ez5Var) {
        F0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(float f, ez5 ez5Var) {
        G0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(int i, int i2, ez5 ez5Var) {
        H0(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(String str, ez5 ez5Var) {
        I0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(int i, ez5 ez5Var) {
        J0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(String str, ez5 ez5Var) {
        K0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(float f, ez5 ez5Var) {
        L0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(float f, ez5 ez5Var) {
        O0(f);
    }

    private boolean r() {
        if (!this.c && !this.d) {
            return false;
        }
        return true;
    }

    private void r0(Canvas canvas, ko1 ko1Var) {
        if (this.a != null && ko1Var != null) {
            D();
            canvas.getMatrix(this.Z);
            canvas.getClipBounds(this.y);
            w(this.y, this.z);
            this.Z.mapRect(this.z);
            x(this.z, this.y);
            if (this.n) {
                this.Y.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                ko1Var.d(this.Y, null, false);
            }
            this.Z.mapRect(this.Y);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            u0(this.Y, width, height);
            if (!Y()) {
                RectF rectF = this.Y;
                Rect rect = this.y;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.Y.width());
            int ceil2 = (int) Math.ceil(this.Y.height());
            if (ceil != 0 && ceil2 != 0) {
                C(ceil, ceil2);
                if (this.T4) {
                    this.v.set(this.Z);
                    this.v.preScale(width, height);
                    Matrix matrix = this.v;
                    RectF rectF2 = this.Y;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.w.eraseColor(0);
                    ko1Var.h(this.x, this.v, this.p);
                    this.Z.invert(this.S4);
                    this.S4.mapRect(this.X, this.Y);
                    x(this.X, this.I);
                }
                this.B.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.w, this.B, this.I, this.A);
            }
        }
    }

    private void s() {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            return;
        }
        ko1 ko1Var = new ko1(this, hm5.b(ez5Var), ez5Var.k(), ez5Var);
        this.o = ko1Var;
        if (this.r) {
            ko1Var.J(true);
        }
        this.o.O(this.n);
    }

    private void u0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private void v() {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            return;
        }
        this.u = this.t.a(Build.VERSION.SDK_INT, ez5Var.q(), ez5Var.m());
    }

    private void w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void y(Canvas canvas) {
        ko1 ko1Var = this.o;
        ez5 ez5Var = this.a;
        if (ko1Var != null && ez5Var != null) {
            this.v.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                float height = bounds.height() / ez5Var.b().height();
                this.v.preScale(bounds.width() / ez5Var.b().width(), height);
            }
            ko1Var.h(canvas, this.v, this.p);
        }
    }

    public boolean A() {
        return this.l;
    }

    public void A0(boolean z) {
        this.d = z;
    }

    public void B() {
        this.g.clear();
        this.b.h();
        if (!isVisible()) {
            this.f = c.NONE;
        }
    }

    public void B0(cu4 cu4Var) {
        du4 du4Var = this.i;
        if (du4Var != null) {
            du4Var.d(cu4Var);
        }
    }

    public void C0(String str) {
        this.j = str;
    }

    public void D0(boolean z) {
        this.m = z;
    }

    public Bitmap E(String str) {
        du4 K = K();
        if (K != null) {
            return K.a(str);
        }
        return null;
    }

    public void E0(final int i) {
        if (this.a == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.g0(i, ez5Var);
                }
            });
        } else {
            this.b.B(i + 0.99f);
        }
    }

    public boolean F() {
        return this.n;
    }

    public void F0(final String str) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var2) {
                    n.this.h0(str, ez5Var2);
                }
            });
            return;
        }
        n86 l = ez5Var.l(str);
        if (l != null) {
            E0((int) (l.b + l.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public ez5 G() {
        return this.a;
    }

    public void G0(final float f) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var2) {
                    n.this.i0(f, ez5Var2);
                }
            });
        } else {
            this.b.B(ql6.i(ez5Var.p(), this.a.f(), f));
        }
    }

    public void H0(final int i, final int i2) {
        if (this.a == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.j0(i, i2, ez5Var);
                }
            });
        } else {
            this.b.C(i, i2 + 0.99f);
        }
    }

    public void I0(final String str) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var2) {
                    n.this.k0(str, ez5Var2);
                }
            });
            return;
        }
        n86 l = ez5Var.l(str);
        if (l != null) {
            int i = (int) l.b;
            H0(i, ((int) l.c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int J() {
        return (int) this.b.j();
    }

    public void J0(final int i) {
        if (this.a == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.l0(i, ez5Var);
                }
            });
        } else {
            this.b.D(i);
        }
    }

    public void K0(final String str) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var2) {
                    n.this.m0(str, ez5Var2);
                }
            });
            return;
        }
        n86 l = ez5Var.l(str);
        if (l != null) {
            J0((int) l.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public String L() {
        return this.j;
    }

    public void L0(final float f) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var2) {
                    n.this.n0(f, ez5Var2);
                }
            });
        } else {
            J0((int) ql6.i(ez5Var.p(), this.a.f(), f));
        }
    }

    public rz5 M(String str) {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            return null;
        }
        return ez5Var.j().get(str);
    }

    public void M0(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        ko1 ko1Var = this.o;
        if (ko1Var != null) {
            ko1Var.J(z);
        }
    }

    public boolean N() {
        return this.m;
    }

    public void N0(boolean z) {
        this.q = z;
        ez5 ez5Var = this.a;
        if (ez5Var != null) {
            ez5Var.v(z);
        }
    }

    public float O() {
        return this.b.m();
    }

    public void O0(final float f) {
        if (this.a == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.o0(f, ez5Var);
                }
            });
            return;
        }
        oi5.a("Drawable#setProgress");
        this.b.A(this.a.h(f));
        oi5.b("Drawable#setProgress");
    }

    public float P() {
        return this.b.n();
    }

    public void P0(he9 he9Var) {
        this.t = he9Var;
        v();
    }

    public by7 Q() {
        ez5 ez5Var = this.a;
        if (ez5Var != null) {
            return ez5Var.n();
        }
        return null;
    }

    public void Q0(int i) {
        this.b.setRepeatCount(i);
    }

    public float R() {
        return this.b.i();
    }

    public void R0(int i) {
        this.b.setRepeatMode(i);
    }

    public he9 S() {
        if (this.u) {
            return he9.SOFTWARE;
        }
        return he9.HARDWARE;
    }

    public void S0(boolean z) {
        this.e = z;
    }

    public int T() {
        return this.b.getRepeatCount();
    }

    public void T0(float f) {
        this.b.F(f);
    }

    @SuppressLint({"WrongConstant"})
    public int U() {
        return this.b.getRepeatMode();
    }

    public void U0(Boolean bool) {
        this.c = bool.booleanValue();
    }

    public float V() {
        return this.b.o();
    }

    public mab W() {
        return null;
    }

    public boolean W0() {
        if (this.a.c().n() > 0) {
            return true;
        }
        return false;
    }

    public Typeface X(String str, String str2) {
        t24 I = I();
        if (I != null) {
            return I.b(str, str2);
        }
        return null;
    }

    public boolean Z() {
        a06 a06Var = this.b;
        if (a06Var == null) {
            return false;
        }
        return a06Var.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        if (isVisible()) {
            return this.b.isRunning();
        }
        c cVar = this.f;
        if (cVar != c.PLAY && cVar != c.RESUME) {
            return false;
        }
        return true;
    }

    public boolean b0() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        oi5.a("Drawable#draw");
        if (this.e) {
            try {
                if (this.u) {
                    r0(canvas, this.o);
                } else {
                    y(canvas);
                }
            } catch (Throwable th) {
                ox5.b("Lottie crashed in draw!", th);
            }
        } else if (this.u) {
            r0(canvas, this.o);
        } else {
            y(canvas);
        }
        this.T4 = false;
        oi5.b("Drawable#draw");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            return -1;
        }
        return ez5Var.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ez5 ez5Var = this.a;
        if (ez5Var == null) {
            return -1;
        }
        return ez5Var.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.T4) {
            return;
        }
        this.T4 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Z();
    }

    public void p(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    public void p0() {
        this.g.clear();
        this.b.q();
        if (!isVisible()) {
            this.f = c.NONE;
        }
    }

    public <T> void q(final of5 of5Var, final T t, final b06<T> b06Var) {
        ko1 ko1Var = this.o;
        if (ko1Var == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.c0(of5Var, t, b06Var, ez5Var);
                }
            });
            return;
        }
        if (of5Var == of5.c) {
            ko1Var.f(t, b06Var);
        } else if (of5Var.d() != null) {
            of5Var.d().f(t, b06Var);
        } else {
            List<of5> s0 = s0(of5Var);
            for (int i = 0; i < s0.size(); i++) {
                s0.get(i).d().f(t, b06Var);
            }
            if (!(!s0.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == xz5.E) {
            O0(R());
        }
    }

    public void q0() {
        float O;
        if (this.o == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.d0(ez5Var);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.b.r();
                this.f = c.NONE;
            } else {
                this.f = c.PLAY;
            }
        }
        if (!r()) {
            if (V() < 0.0f) {
                O = P();
            } else {
                O = O();
            }
            z0((int) O);
            this.b.h();
            if (!isVisible()) {
                this.f = c.NONE;
            }
        }
    }

    public List<of5> s0(of5 of5Var) {
        if (this.o == null) {
            ox5.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.o.g(of5Var, 0, arrayList, new of5(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ox5.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            c cVar = this.f;
            if (cVar == c.PLAY) {
                q0();
            } else if (cVar == c.RESUME) {
                t0();
            }
        } else if (this.b.isRunning()) {
            p0();
            this.f = c.RESUME;
        } else if (!z3) {
            this.f = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        q0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public void t() {
        this.g.clear();
        this.b.cancel();
        if (!isVisible()) {
            this.f = c.NONE;
        }
    }

    public void t0() {
        float O;
        if (this.o == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.e0(ez5Var);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.b.w();
                this.f = c.NONE;
            } else {
                this.f = c.RESUME;
            }
        }
        if (!r()) {
            if (V() < 0.0f) {
                O = P();
            } else {
                O = O();
            }
            z0((int) O);
            this.b.h();
            if (!isVisible()) {
                this.f = c.NONE;
            }
        }
    }

    public void u() {
        if (this.b.isRunning()) {
            this.b.cancel();
            if (!isVisible()) {
                this.f = c.NONE;
            }
        }
        this.a = null;
        this.o = null;
        this.i = null;
        this.b.g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v0(boolean z) {
        this.s = z;
    }

    public void w0(boolean z) {
        if (z != this.n) {
            this.n = z;
            ko1 ko1Var = this.o;
            if (ko1Var != null) {
                ko1Var.O(z);
            }
            invalidateSelf();
        }
    }

    public boolean x0(ez5 ez5Var) {
        if (this.a == ez5Var) {
            return false;
        }
        this.T4 = true;
        u();
        this.a = ez5Var;
        s();
        this.b.z(ez5Var);
        O0(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(ez5Var);
            }
            it.remove();
        }
        this.g.clear();
        ez5Var.v(this.q);
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void y0(s24 s24Var) {
        t24 t24Var = this.k;
        if (t24Var != null) {
            t24Var.c(s24Var);
        }
    }

    public void z(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        if (this.a != null) {
            s();
        }
    }

    public void z0(final int i) {
        if (this.a == null) {
            this.g.add(new b() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.n.b
                public final void a(ez5 ez5Var) {
                    n.this.f0(i, ez5Var);
                }
            });
        } else {
            this.b.A(i);
        }
    }

    public void V0(mab mabVar) {
    }
}
