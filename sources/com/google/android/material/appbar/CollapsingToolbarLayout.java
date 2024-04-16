package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int S4 = i19.Widget_Design_CollapsingToolbar;
    private boolean A;
    private int B;
    private boolean I;
    private boolean a;
    private int b;
    private ViewGroup c;
    private View d;
    private View e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Rect j;
    @NonNull
    final tb1 k;
    @NonNull
    final te3 l;
    private boolean m;
    private boolean n;
    private Drawable o;
    Drawable p;
    private int q;
    private boolean r;
    private ValueAnimator s;
    private long t;
    private int u;
    private AppBarLayout.h v;
    int w;
    private int x;
    c5c y;
    private int z;

    /* loaded from: classes2.dex */
    class a implements h77 {
        a() {
        }

        @Override // defpackage.h77
        public c5c a(View view, @NonNull c5c c5cVar) {
            return CollapsingToolbarLayout.this.n(c5cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes2.dex */
    private class d implements AppBarLayout.h {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            int i2;
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.w = i;
            c5c c5cVar = collapsingToolbarLayout.y;
            if (c5cVar != null) {
                i2 = c5cVar.l();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                com.google.android.material.appbar.d j = CollapsingToolbarLayout.j(childAt);
                int i4 = cVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        j.j(Math.round((-i) * cVar.b));
                    }
                } else {
                    j.j(na6.b(-i, 0, CollapsingToolbarLayout.this.h(childAt)));
                }
            }
            CollapsingToolbarLayout.this.u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.p != null && i2 > 0) {
                syb.l0(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - syb.F(CollapsingToolbarLayout.this)) - i2;
            float f = height2;
            CollapsingToolbarLayout.this.k.w0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.k.j0(collapsingToolbarLayout3.w + height2);
            CollapsingToolbarLayout.this.k.u0(Math.abs(i) / f);
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.collapsingToolbarLayoutStyle);
    }

    private void a(int i) {
        TimeInterpolator timeInterpolator;
        c();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.s = valueAnimator2;
            if (i > this.q) {
                timeInterpolator = sk.c;
            } else {
                timeInterpolator = sk.d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.s.cancel();
        }
        this.s.setDuration(this.t);
        this.s.setIntValues(this.q, i);
        this.s.start();
    }

    private void b(AppBarLayout appBarLayout) {
        if (k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void c() {
        if (!this.a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.c = null;
        this.d = null;
        int i = this.b;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.c = viewGroup2;
            if (viewGroup2 != null) {
                this.d = d(viewGroup2);
            }
        }
        if (this.c == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (l(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i2++;
            }
            this.c = viewGroup;
        }
        t();
        this.a = false;
    }

    @NonNull
    private View d(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    private static int g(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    static com.google.android.material.appbar.d j(@NonNull View view) {
        int i = ky8.view_offset_helper;
        com.google.android.material.appbar.d dVar = (com.google.android.material.appbar.d) view.getTag(i);
        if (dVar == null) {
            com.google.android.material.appbar.d dVar2 = new com.google.android.material.appbar.d(view);
            view.setTag(i, dVar2);
            return dVar2;
        }
        return dVar;
    }

    private boolean k() {
        if (this.x == 1) {
            return true;
        }
        return false;
    }

    private static boolean l(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    private boolean m(View view) {
        View view2 = this.d;
        if (view2 != null && view2 != this) {
            if (view != view2) {
                return false;
            }
        } else if (view != this.c) {
            return false;
        }
        return true;
    }

    private void p(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view = this.d;
        if (view == null) {
            view = this.c;
        }
        int h = h(view);
        v03.a(this, this.e, this.j);
        ViewGroup viewGroup = this.c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.getTitleMarginStart();
            i3 = toolbar.getTitleMarginEnd();
            i4 = toolbar.getTitleMarginTop();
            i2 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        tb1 tb1Var = this.k;
        Rect rect = this.j;
        int i6 = rect.left;
        if (z) {
            i5 = i3;
        } else {
            i5 = i;
        }
        int i7 = i6 + i5;
        int i8 = rect.top + h + i4;
        int i9 = rect.right;
        if (!z) {
            i = i3;
        }
        tb1Var.b0(i7, i8, i9 - i, (rect.bottom + h) - i2);
    }

    private void q() {
        setContentDescription(getTitle());
    }

    private void r(@NonNull Drawable drawable, int i, int i2) {
        s(drawable, this.c, i, i2);
    }

    private void s(@NonNull Drawable drawable, View view, int i, int i2) {
        if (k() && view != null && this.m) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void t() {
        View view;
        if (!this.m && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (this.m && this.c != null) {
            if (this.e == null) {
                this.e = new View(getContext());
            }
            if (this.e.getParent() == null) {
                this.c.addView(this.e, -1, -1);
            }
        }
    }

    private void v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.m && (view = this.e) != null) {
            boolean z3 = false;
            if (syb.X(view) && this.e.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.n = z2;
            if (z2 || z) {
                if (syb.E(this) == 1) {
                    z3 = true;
                }
                p(z3);
                tb1 tb1Var = this.k;
                if (z3) {
                    i5 = this.h;
                } else {
                    i5 = this.f;
                }
                int i7 = this.j.top + this.g;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f;
                } else {
                    i6 = this.h;
                }
                tb1Var.k0(i5, i7, i8 - i6, (i4 - i2) - this.i);
                this.k.Z(z);
            }
        }
    }

    private void w() {
        if (this.c != null && this.m && TextUtils.isEmpty(this.k.M())) {
            setTitle(i(this.c));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.c == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.m && this.n) {
            if (this.c != null && this.o != null && this.q > 0 && k() && this.k.D() < this.k.E()) {
                int save = canvas.save();
                canvas.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                this.k.l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.k.l(canvas);
            }
        }
        if (this.p != null && this.q > 0) {
            c5c c5cVar = this.y;
            if (c5cVar != null) {
                i = c5cVar.l();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.p.setBounds(0, -this.w, getWidth(), i - this.w);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.o != null && this.q > 0 && m(view)) {
            s(this.o, view, getWidth(), getHeight());
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        tb1 tb1Var = this.k;
        if (tb1Var != null) {
            z |= tb1Var.E0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.k.q();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.k.u();
    }

    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.k.A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.k.C();
    }

    public int getHyphenationFrequency() {
        return this.k.F();
    }

    public int getLineCount() {
        return this.k.G();
    }

    public float getLineSpacingAdd() {
        return this.k.H();
    }

    public float getLineSpacingMultiplier() {
        return this.k.I();
    }

    public int getMaxLines() {
        return this.k.J();
    }

    int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.u;
        if (i2 >= 0) {
            return i2 + this.z + this.B;
        }
        c5c c5cVar = this.y;
        if (c5cVar != null) {
            i = c5cVar.l();
        } else {
            i = 0;
        }
        int F = syb.F(this);
        if (F > 0) {
            return Math.min((F * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.p;
    }

    public CharSequence getTitle() {
        if (this.m) {
            return this.k.M();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.x;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.L();
    }

    final int h(@NonNull View view) {
        return ((getHeight() - j(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    c5c n(@NonNull c5c c5cVar) {
        c5c c5cVar2;
        if (syb.B(this)) {
            c5cVar2 = c5cVar;
        } else {
            c5cVar2 = null;
        }
        if (!p57.a(this.y, c5cVar2)) {
            this.y = c5cVar2;
            requestLayout();
        }
        return c5cVar.c();
    }

    public void o(boolean z, boolean z2) {
        if (this.r != z) {
            int i = 0;
            if (z2) {
                if (z) {
                    i = 255;
                }
                a(i);
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.r = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            syb.D0(this, syb.B(appBarLayout));
            if (this.v == null) {
                this.v = new d();
            }
            appBarLayout.d(this.v);
            syb.r0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.V(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.h hVar = this.v;
        if (hVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).r(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c5c c5cVar = this.y;
        if (c5cVar != null) {
            int l = c5cVar.l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!syb.B(childAt) && childAt.getTop() < l) {
                    syb.f0(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            j(getChildAt(i6)).g();
        }
        v(i, i2, i3, i4, false);
        w();
        u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            j(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        c5c c5cVar = this.y;
        if (c5cVar != null) {
            i3 = c5cVar.l();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A) && i3 > 0) {
            this.z = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.I && this.k.J() > 1) {
            w();
            v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int y = this.k.y();
            if (y > 1) {
                this.B = Math.round(this.k.z()) * (y - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.B, 1073741824));
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.d;
            if (view != null && view != this) {
                setMinimumHeight(g(view));
            } else {
                setMinimumHeight(g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.o;
        if (drawable != null) {
            r(drawable, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.k.g0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.k.d0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.k.h0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            if (drawable3 != null) {
                r(drawable3, getWidth(), getHeight());
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            syb.l0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(iu1.e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.k.q0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.k.n0(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.k.p0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.k.s0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.I = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A = z;
    }

    public void setHyphenationFrequency(int i) {
        this.k.x0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.k.z0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.k.A0(f);
    }

    public void setMaxLines(int i) {
        this.k.B0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.D0(z);
    }

    void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.q) {
            if (this.o != null && (viewGroup = this.c) != null) {
                syb.l0(viewGroup);
            }
            this.q = i;
            syb.l0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.t = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.u != i) {
            this.u = i;
            u();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        if (syb.Y(this) && !isInEditMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        o(z, z2);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                f83.m(this.p, syb.E(this));
                Drawable drawable4 = this.p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            syb.l0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(iu1.e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.k.F0(charSequence);
        q();
    }

    public void setTitleCollapseMode(int i) {
        this.x = i;
        boolean k = k();
        this.k.v0(k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (k && this.o == null) {
            setContentScrimColor(this.l.d(getResources().getDimension(ww8.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            q();
            t();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.k.C0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.o.setVisible(z, false);
        }
    }

    final void u() {
        boolean z;
        if (this.o != null || this.p != null) {
            if (getHeight() + this.w < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.o && drawable != this.p) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.k.f0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class c extends FrameLayout.LayoutParams {
        int a;
        float b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.g2);
            this.a = obtainStyledAttributes.getInt(b29.h2, 0);
            a(obtainStyledAttributes.getFloat(b29.i2, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f) {
            this.b = f;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.b = 0.5f;
        }

        public c(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
    }
}
