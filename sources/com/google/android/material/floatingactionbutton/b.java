package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class b {
    static final TimeInterpolator D = sk.c;
    static final int[] E = {16842919, 16842910};
    static final int[] F = {16843623, 16842908, 16842910};
    static final int[] G = {16842908, 16842910};
    static final int[] H = {16843623, 16842910};
    static final int[] I = {16842910};
    static final int[] J = new int[0];
    private ViewTreeObserver.OnPreDrawListener C;
    uga a;
    fa6 b;
    Drawable c;
    com.google.android.material.floatingactionbutton.a d;
    Drawable e;
    boolean f;
    float h;
    float i;
    float j;
    int k;
    @NonNull
    private final oua l;
    private Animator m;
    private bp6 n;
    private bp6 o;
    private float p;
    private int r;
    private ArrayList<Animator.AnimatorListener> t;
    private ArrayList<Animator.AnimatorListener> u;
    private ArrayList<j> v;
    final FloatingActionButton w;
    final rga x;
    boolean g = true;
    private float q = 1.0f;
    private int s = 0;
    private final Rect y = new Rect();
    private final RectF z = new RectF();
    private final RectF A = new RectF();
    private final Matrix B = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ k c;

        a(boolean z, k kVar) {
            this.b = z;
            this.c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            b.this.s = 0;
            b.this.m = null;
            if (!this.a) {
                FloatingActionButton floatingActionButton = b.this.w;
                boolean z = this.b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.b(i, z);
                k kVar = this.c;
                if (kVar != null) {
                    kVar.b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.w.b(0, this.b);
            b.this.s = 1;
            b.this.m = animator;
            this.a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0230b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ k b;

        C0230b(boolean z, k kVar) {
            this.a = z;
            this.b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.s = 0;
            b.this.m = null;
            k kVar = this.b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.w.b(0, this.a);
            b.this.s = 2;
            b.this.m = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class c extends qa6 {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            b.this.q = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ float f;
        final /* synthetic */ float g;
        final /* synthetic */ Matrix h;

        d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.w.setAlpha(sk.b(this.a, this.b, 0.0f, 0.2f, floatValue));
            b.this.w.setScaleX(sk.a(this.c, this.d, floatValue));
            b.this.w.setScaleY(sk.a(this.e, this.d, floatValue));
            b.this.q = sk.a(this.f, this.g, floatValue);
            b.this.h(sk.a(this.f, this.g, floatValue), this.h);
            b.this.w.setImageMatrix(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class e implements TypeEvaluator<Float> {
        FloatEvaluator a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.G();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class g extends m {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class h extends m {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.h + bVar.i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class i extends m {
        i() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.h + bVar.j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    interface k {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class l extends m {
        l() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return b.this.h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f0((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float w;
            if (!this.a) {
                fa6 fa6Var = b.this.b;
                if (fa6Var == null) {
                    w = 0.0f;
                } else {
                    w = fa6Var.w();
                }
                this.b = w;
                this.c = a();
                this.a = true;
            }
            b bVar = b.this;
            float f = this.b;
            bVar.f0((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, rga rgaVar) {
        this.w = floatingActionButton;
        this.x = rgaVar;
        oua ouaVar = new oua();
        this.l = ouaVar;
        ouaVar.a(E, k(new i()));
        ouaVar.a(F, k(new h()));
        ouaVar.a(G, k(new h()));
        ouaVar.a(H, k(new h()));
        ouaVar.a(I, k(new l()));
        ouaVar.a(J, k(new g()));
        this.p = floatingActionButton.getRotation();
    }

    private boolean Z() {
        if (syb.Y(this.w) && !this.w.isInEditMode()) {
            return true;
        }
        return false;
    }

    private void g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f2, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.w.getDrawable();
        if (drawable != null && this.r != 0) {
            RectF rectF = this.z;
            RectF rectF2 = this.A;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i2 = this.r;
            rectF2.set(0.0f, 0.0f, i2, i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.r;
            matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
        }
    }

    @NonNull
    private AnimatorSet i(@NonNull bp6 bp6Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.w, View.ALPHA, f2);
        bp6Var.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.w, View.SCALE_X, f3);
        bp6Var.e("scale").a(ofFloat2);
        g0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.w, View.SCALE_Y, f3);
        bp6Var.e("scale").a(ofFloat3);
        g0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f4, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.w, new av4(), new c(), new Matrix(this.B));
        bp6Var.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        yk.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.w.getAlpha(), f2, this.w.getScaleX(), f3, this.w.getScaleY(), this.q, f4, new Matrix(this.B)));
        arrayList.add(ofFloat);
        yk.a(animatorSet, arrayList);
        animatorSet.setDuration(dp6.d(this.w.getContext(), qv8.motionDurationLong1, this.w.getContext().getResources().getInteger(zy8.material_motion_duration_long_1)));
        animatorSet.setInterpolator(dp6.e(this.w.getContext(), qv8.motionEasingStandard, sk.b));
        return animatorSet;
    }

    @NonNull
    private ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        fa6 fa6Var = this.b;
        if (fa6Var != null) {
            ga6.f(this.w, fa6Var);
        }
        if (J()) {
            this.w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        ViewTreeObserver viewTreeObserver = this.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(int[] iArr) {
        throw null;
    }

    void E(float f2, float f3, float f4) {
        throw null;
    }

    void F(@NonNull Rect rect) {
        kh8.g(this.e, "Didn't initialize content background");
        if (Y()) {
            this.x.a(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.x.a(this.e);
    }

    void G() {
        float rotation = this.w.getRotation();
        if (this.p != rotation) {
            this.p = rotation;
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        ArrayList<j> arrayList = this.v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        ArrayList<j> arrayList = this.v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean J() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(ColorStateList colorStateList) {
        fa6 fa6Var = this.b;
        if (fa6Var != null) {
            fa6Var.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(PorterDuff.Mode mode) {
        fa6 fa6Var = this.b;
        if (fa6Var != null) {
            fa6Var.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(float f2) {
        if (this.h != f2) {
            this.h = f2;
            E(f2, this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(bp6 bp6Var) {
        this.o = bp6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P(float f2) {
        if (this.i != f2) {
            this.i = f2;
            E(this.h, f2, this.j);
        }
    }

    final void Q(float f2) {
        this.q = f2;
        Matrix matrix = this.B;
        h(f2, matrix);
        this.w.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(int i2) {
        if (this.r != i2) {
            this.r = i2;
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i2) {
        this.k = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(float f2) {
        if (this.j != f2) {
            this.j = f2;
            E(this.h, this.i, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            f83.o(drawable, rm9.d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(boolean z) {
        this.g = z;
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(@NonNull uga ugaVar) {
        this.a = ugaVar;
        fa6 fa6Var = this.b;
        if (fa6Var != null) {
            fa6Var.setShapeAppearanceModel(ugaVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof oha) {
            ((oha) drawable).setShapeAppearanceModel(ugaVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.d;
        if (aVar != null) {
            aVar.f(ugaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(bp6 bp6Var) {
        this.n = bp6Var;
    }

    boolean Y() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a0() {
        if (this.f && this.w.getSizeDimension() < this.k) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(k kVar, boolean z) {
        boolean z2;
        AnimatorSet j2;
        float f2;
        float f3;
        if (y()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        if (this.n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Z()) {
            if (this.w.getVisibility() != 0) {
                float f4 = 0.0f;
                this.w.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.w;
                if (z2) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.0f;
                }
                floatingActionButton.setScaleY(f2);
                FloatingActionButton floatingActionButton2 = this.w;
                if (z2) {
                    f3 = 0.4f;
                } else {
                    f3 = 0.0f;
                }
                floatingActionButton2.setScaleX(f3);
                if (z2) {
                    f4 = 0.4f;
                }
                Q(f4);
            }
            bp6 bp6Var = this.n;
            if (bp6Var != null) {
                j2 = i(bp6Var, 1.0f, 1.0f, 1.0f);
            } else {
                j2 = j(1.0f, 1.0f, 1.0f);
            }
            j2.addListener(new C0230b(z, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j2.addListener(it.next());
                }
            }
            j2.start();
            return;
        }
        this.w.b(0, z);
        this.w.setAlpha(1.0f);
        this.w.setScaleY(1.0f);
        this.w.setScaleX(1.0f);
        Q(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    void c0() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d0() {
        Q(this.q);
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e0() {
        Rect rect = this.y;
        r(rect);
        F(rect);
        this.x.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(float f2) {
        fa6 fa6Var = this.b;
        if (fa6Var != null) {
            fa6Var.a0(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@NonNull j jVar) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable l() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bp6 o() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@NonNull Rect rect) {
        int i2;
        float f2;
        if (this.f) {
            i2 = (this.k - this.w.getSizeDimension()) / 2;
        } else {
            i2 = 0;
        }
        if (this.g) {
            f2 = m() + this.j;
        } else {
            f2 = 0.0f;
        }
        int max = Math.max(i2, (int) Math.ceil(f2));
        int max2 = Math.max(i2, (int) Math.ceil(f2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final uga t() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bp6 u() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(k kVar, boolean z) {
        int i2;
        AnimatorSet j2;
        if (x()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        if (Z()) {
            bp6 bp6Var = this.o;
            if (bp6Var != null) {
                j2 = i(bp6Var, 0.0f, 0.0f, 0.0f);
            } else {
                j2 = j(0.0f, 0.4f, 0.4f);
            }
            j2.addListener(new a(z, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j2.addListener(it.next());
                }
            }
            j2.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.w;
        if (z) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        floatingActionButton.b(i2, z);
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        if (this.w.getVisibility() == 0) {
            if (this.s != 1) {
                return false;
            }
            return true;
        } else if (this.s == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        if (this.w.getVisibility() != 0) {
            if (this.s != 2) {
                return false;
            }
            return true;
        } else if (this.s == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        throw null;
    }
}
