package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.a;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    @NonNull
    private final ViewGroup a;
    private final Context b;
    @NonNull
    protected final t c;
    @NonNull
    private final eu1 d;
    private int e;
    private boolean f;
    private q g;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private List<r<B>> p;
    private Behavior q;
    private final AccessibilityManager r;
    private static final boolean u = false;
    private static final int[] v = {qv8.snackbarStyle};
    private static final String w = BaseTransientBottomBar.class.getSimpleName();
    @NonNull
    static final Handler t = new Handler(Looper.getMainLooper(), new h());
    private boolean h = false;
    private final Runnable i = new i();
    @NonNull
    a.b s = new l();

    /* loaded from: classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        @NonNull
        private final s k = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void l(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean a(View view) {
            return this.k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.M(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.c.setScaleX(floatValue);
            BaseTransientBottomBar.this.c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        private int a;
        final /* synthetic */ int b;

        e(int i) {
            this.b = i;
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                syb.f0(BaseTransientBottomBar.this.c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.M(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        private int a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                syb.f0(BaseTransientBottomBar.this.c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    /* loaded from: classes2.dex */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).G(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).V();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int A;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c == null || baseTransientBottomBar.b == null || (A = (BaseTransientBottomBar.this.A() - BaseTransientBottomBar.this.E()) + ((int) BaseTransientBottomBar.this.c.getTranslationY())) >= BaseTransientBottomBar.this.m) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.w, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.m - A;
            BaseTransientBottomBar.this.c.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class j implements h77 {
        j() {
        }

        @Override // defpackage.h77
        @NonNull
        public c5c a(View view, @NonNull c5c c5cVar) {
            BaseTransientBottomBar.this.j = c5cVar.i();
            BaseTransientBottomBar.this.k = c5cVar.j();
            BaseTransientBottomBar.this.l = c5cVar.k();
            BaseTransientBottomBar.this.b0();
            return c5cVar;
        }
    }

    /* loaded from: classes2.dex */
    class k extends s2 {
        k() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.a(1048576);
            d4Var.t0(true);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.s();
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    /* loaded from: classes2.dex */
    class l implements a.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i) {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void c() {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.M(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.s);
                    return;
                }
                return;
            }
            com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = BaseTransientBottomBar.this.c;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.X();
            } else {
                BaseTransientBottomBar.this.Z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @NonNull
        private final WeakReference<BaseTransientBottomBar> a;
        @NonNull
        private final WeakReference<View> b;

        private q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.a = new WeakReference<>(baseTransientBottomBar);
            this.b = new WeakReference<>(view);
        }

        static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (syb.X(view)) {
                z0c.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.a.get() == null) {
                c();
                return true;
            }
            return false;
        }

        View b() {
            return this.b.get();
        }

        void c() {
            if (this.b.get() != null) {
                this.b.get().removeOnAttachStateChangeListener(this);
                z0c.k(this.b.get(), this);
            }
            this.b.clear();
            this.a.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.a.get().h) {
                this.a.get().O();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            z0c.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            z0c.k(view, this);
        }
    }

    /* loaded from: classes2.dex */
    public static class s {
        private a.b a;

        public s(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.h(0.1f);
            swipeDismissBehavior.f(0.6f);
            swipeDismissBehavior.i(0);
        }

        public boolean a(View view) {
            return view instanceof t;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.a.c().k(this.a);
                }
            } else if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.a.c().j(this.a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.s;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class t extends FrameLayout {
        private static final View.OnTouchListener k = new a();
        private BaseTransientBottomBar<?> a;
        private int b;
        private final float c;
        private final float d;
        private final int e;
        private final int f;
        private ColorStateList g;
        private PorterDuff.Mode h;
        private Rect i;
        private boolean j;

        /* loaded from: classes2.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public t(@NonNull Context context, AttributeSet attributeSet) {
            super(ia6.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b29.u7);
            int i = b29.B7;
            if (obtainStyledAttributes.hasValue(i)) {
                syb.C0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.b = obtainStyledAttributes.getInt(b29.x7, 0);
            this.c = obtainStyledAttributes.getFloat(b29.y7, 1.0f);
            setBackgroundTintList(ea6.a(context2, obtainStyledAttributes, b29.z7));
            setBackgroundTintMode(z0c.j(obtainStyledAttributes.getInt(b29.A7, -1), PorterDuff.Mode.SRC_IN));
            this.d = obtainStyledAttributes.getFloat(b29.w7, 1.0f);
            this.e = obtainStyledAttributes.getDimensionPixelSize(b29.v7, -1);
            this.f = obtainStyledAttributes.getDimensionPixelSize(b29.C7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(k);
            setFocusable(true);
            if (getBackground() == null) {
                syb.y0(this, d());
            }
        }

        @NonNull
        private Drawable d() {
            float dimension = getResources().getDimension(ww8.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(ba6.i(this, qv8.colorSurface, qv8.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.g != null) {
                Drawable r = f83.r(gradientDrawable);
                f83.o(r, this.g);
                return r;
            }
            return f83.r(gradientDrawable);
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.j = true;
            viewGroup.addView(this);
            this.j = false;
        }

        float getActionTextColorAlpha() {
            return this.d;
        }

        int getAnimationMode() {
            return this.b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.c;
        }

        int getMaxInlineActionWidth() {
            return this.f;
        }

        int getMaxWidth() {
            return this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.J();
            }
            syb.r0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.K();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.L();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.e;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void setAnimationMode(int i) {
            this.b = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.g != null) {
                drawable = f83.r(drawable.mutate());
                f83.o(drawable, this.g);
                f83.p(drawable, this.h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.g = colorStateList;
            if (getBackground() != null) {
                Drawable r = f83.r(getBackground().mutate());
                f83.o(r, colorStateList);
                f83.p(r, this.h);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.h = mode;
            if (getBackground() != null) {
                Drawable r = f83.r(getBackground().mutate());
                f83.p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.j && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.b0();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = k;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull eu1 eu1Var) {
        if (viewGroup != null) {
            if (view != null) {
                if (eu1Var != null) {
                    this.a = viewGroup;
                    this.d = eu1Var;
                    this.b = context;
                    sdb.a(context);
                    t tVar = (t) LayoutInflater.from(context).inflate(B(), viewGroup, false);
                    this.c = tVar;
                    tVar.setBaseTransientBottomBar(this);
                    if (view instanceof SnackbarContentLayout) {
                        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                        snackbarContentLayout.c(tVar.getActionTextColorAlpha());
                        snackbarContentLayout.setMaxInlineActionWidth(tVar.getMaxInlineActionWidth());
                    }
                    tVar.addView(view);
                    syb.w0(tVar, 1);
                    syb.F0(tVar, 1);
                    syb.D0(tVar, true);
                    syb.I0(tVar, new j());
                    syb.u0(tVar, new k());
                    this.r = (AccessibilityManager) context.getSystemService("accessibility");
                    return;
                }
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int C() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        return iArr[1] + this.c.getHeight();
    }

    private boolean I() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.n = r();
        b0();
    }

    private void R(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = y();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).l(this);
        }
        swipeDismissBehavior.g(new n());
        fVar.o(swipeDismissBehavior);
        if (v() == null) {
            fVar.g = 80;
        }
    }

    private boolean T() {
        if (this.m > 0 && !this.f && I()) {
            return true;
        }
        return false;
    }

    private void W() {
        if (S()) {
            p();
            return;
        }
        if (this.c.getParent() != null) {
            this.c.setVisibility(0);
        }
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        ValueAnimator u2 = u(0.0f, 1.0f);
        ValueAnimator z = z(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(u2, z);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void Y(int i2) {
        ValueAnimator u2 = u(1.0f, 0.0f);
        u2.setDuration(75L);
        u2.addListener(new a(i2));
        u2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        int C = C();
        if (u) {
            syb.f0(this.c, C);
        } else {
            this.c.setTranslationY(C);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(C, 0);
        valueAnimator.setInterpolator(sk.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(C));
        valueAnimator.start();
    }

    private void a0(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, C());
        valueAnimator.setInterpolator(sk.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int i2;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.c.i != null) {
            if (this.c.getParent() == null) {
                return;
            }
            if (v() != null) {
                i2 = this.n;
            } else {
                i2 = this.j;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.c.i.bottom + i2;
            marginLayoutParams.leftMargin = this.c.i.left + this.k;
            marginLayoutParams.rightMargin = this.c.i.right + this.l;
            marginLayoutParams.topMargin = this.c.i.top;
            this.c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && T()) {
                this.c.removeCallbacks(this.i);
                this.c.post(this.i);
                return;
            }
            return;
        }
        Log.w(w, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    private void q(int i2) {
        if (this.c.getAnimationMode() == 1) {
            Y(i2);
        } else {
            a0(i2);
        }
    }

    private int r() {
        if (v() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        v().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.a.getHeight()) - i2;
    }

    private ValueAnimator u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(sk.a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(sk.d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    protected int B() {
        if (F()) {
            return kz8.mtrl_layout_snackbar;
        }
        return kz8.design_layout_snackbar;
    }

    @NonNull
    public View D() {
        return this.c;
    }

    protected boolean F() {
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    final void G(int i2) {
        if (S() && this.c.getVisibility() == 0) {
            q(i2);
        } else {
            M(i2);
        }
    }

    public boolean H() {
        return com.google.android.material.snackbar.a.c().e(this.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r2.c.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void J() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1b
            com.google.android.material.snackbar.BaseTransientBottomBar$t r0 = r2.c
            android.view.WindowInsets r0 = defpackage.l80.a(r0)
            if (r0 == 0) goto L1b
            android.graphics.Insets r0 = defpackage.n5c.a(r0)
            int r0 = defpackage.t83.a(r0)
            r2.m = r0
            r2.b0()
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.J():void");
    }

    void K() {
        if (H()) {
            t.post(new m());
        }
    }

    void L() {
        if (this.o) {
            W();
            this.o = false;
        }
    }

    void M(int i2) {
        com.google.android.material.snackbar.a.c().h(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    void N() {
        com.google.android.material.snackbar.a.c().i(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).b(this);
            }
        }
    }

    @NonNull
    public B P(View view) {
        q a2;
        q qVar = this.g;
        if (qVar != null) {
            qVar.c();
        }
        if (view == null) {
            a2 = null;
        } else {
            a2 = q.a(this, view);
        }
        this.g = a2;
        return this;
    }

    @NonNull
    public B Q(int i2) {
        this.e = i2;
        return this;
    }

    boolean S() {
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void U() {
        com.google.android.material.snackbar.a.c().m(x(), this.s);
    }

    final void V() {
        if (this.c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                R((CoordinatorLayout.f) layoutParams);
            }
            this.c.c(this.a);
            O();
            this.c.setVisibility(4);
        }
        if (syb.Y(this.c)) {
            W();
        } else {
            this.o = true;
        }
    }

    void p() {
        this.c.post(new o());
    }

    public void s() {
        t(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(int i2) {
        com.google.android.material.snackbar.a.c().b(this.s, i2);
    }

    public View v() {
        q qVar = this.g;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    @NonNull
    public Context w() {
        return this.b;
    }

    public int x() {
        return this.e;
    }

    @NonNull
    protected SwipeDismissBehavior<? extends View> y() {
        return new Behavior();
    }

    /* loaded from: classes2.dex */
    public static abstract class r<B> {
        public void b(B b) {
        }

        public void a(B b, int i) {
        }
    }
}
