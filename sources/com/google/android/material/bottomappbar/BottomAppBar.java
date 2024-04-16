package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int y5 = i19.Widget_MaterialComponents_BottomAppBar;
    private Integer g5;
    private final int h5;
    private final fa6 i5;
    private Animator j5;
    private Animator k5;
    private int l5;
    private int m5;
    private boolean n5;
    private int o5;
    private ArrayList<g> p5;
    private int q5;
    private boolean r5;
    private boolean s5;
    private Behavior t5;
    private int u5;
    private int v5;
    private int w5;
    @NonNull
    AnimatorListenerAdapter x5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int c;
        boolean d;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.j5 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends FloatingActionButton.b {
        final /* synthetic */ int a;

        /* loaded from: classes2.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.n0();
            }
        }

        b(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.s0(this.a));
            floatingActionButton.s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.r5 = false;
            BottomAppBar.this.k5 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public boolean a;
        final /* synthetic */ ActionMenuView b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;

        d(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.a) {
                if (BottomAppBar.this.q5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.x0(bottomAppBar.q5);
                BottomAppBar.this.D0(this.b, this.c, this.d, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        final /* synthetic */ ActionMenuView a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        e(ActionMenuView actionMenuView, int i, boolean z) {
            this.a = actionMenuView;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.a;
            actionMenuView.setTranslationX(BottomAppBar.this.r0(actionMenuView, this.b, this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.x5.onAnimationStart(animator);
            FloatingActionButton p0 = BottomAppBar.this.p0();
            if (p0 != null) {
                p0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private void C0(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        D0(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.u5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return s0(this.l5);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.w5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.v5;
    }

    @NonNull
    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.i5.E().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.x5);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void j0() {
        Animator animator = this.k5;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.j5;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void l0(int i, @NonNull List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p0(), "translationX", s0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void m0(int i, boolean z, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - r0(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        ArrayList<g> arrayList;
        int i = this.o5 - 1;
        this.o5 = i;
        if (i == 0 && (arrayList = this.p5) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        ArrayList<g> arrayList;
        int i = this.o5;
        this.o5 = i + 1;
        if (i == 0 && (arrayList = this.p5) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton p0() {
        View q0 = q0();
        if (q0 instanceof FloatingActionButton) {
            return (FloatingActionButton) q0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View q0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.q0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float s0(int i) {
        int i2;
        boolean i3 = z0c.i(this);
        int i4 = 1;
        if (i == 1) {
            if (i3) {
                i2 = this.w5;
            } else {
                i2 = this.v5;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (this.h5 + i2);
            if (i3) {
                i4 = -1;
            }
            return measuredWidth * i4;
        }
        return 0.0f;
    }

    private boolean t0() {
        FloatingActionButton p0 = p0();
        if (p0 != null && p0.o()) {
            return true;
        }
        return false;
    }

    private void u0(int i, boolean z) {
        if (!syb.Y(this)) {
            this.r5 = false;
            x0(this.q5);
            return;
        }
        Animator animator = this.k5;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!t0()) {
            i = 0;
            z = false;
        }
        m0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.k5 = animatorSet;
        animatorSet.addListener(new c());
        this.k5.start();
    }

    private void v0(int i) {
        if (this.l5 != i && syb.Y(this)) {
            Animator animator = this.j5;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.m5 == 1) {
                l0(i, arrayList);
            } else {
                k0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.j5 = animatorSet;
            animatorSet.addListener(new a());
            this.j5.start();
        }
    }

    private Drawable w0(Drawable drawable) {
        if (drawable != null && this.g5 != null) {
            Drawable r = f83.r(drawable.mutate());
            f83.n(r, this.g5.intValue());
            return r;
        }
        return drawable;
    }

    private void y0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.k5 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!t0()) {
                C0(actionMenuView, 0, false);
            } else {
                C0(actionMenuView, this.l5, this.s5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        float f2;
        getTopEdgeTreatment().o(getFabTranslationX());
        View q0 = q0();
        fa6 fa6Var = this.i5;
        if (this.s5 && t0()) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fa6Var.c0(f2);
        if (q0 != null) {
            q0.setTranslationY(getFabTranslationY());
            q0.setTranslationX(getFabTranslationX());
        }
    }

    public void A0(int i, int i2) {
        this.q5 = i2;
        this.r5 = true;
        u0(i, this.s5);
        v0(i);
        this.l5 = i;
    }

    boolean B0(int i) {
        float f2 = i;
        if (f2 != getTopEdgeTreatment().h()) {
            getTopEdgeTreatment().n(f2);
            this.i5.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.i5.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.l5;
    }

    public int getFabAnimationMode() {
        return this.m5;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.n5;
    }

    protected void k0(int i, List<Animator> list) {
        FloatingActionButton p0 = p0();
        if (p0 != null && !p0.n()) {
            o0();
            p0.l(new b(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.f(this, this.i5);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j0();
            z0();
        }
        y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.l5 = savedState.c;
        this.s5 = savedState.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.l5;
        savedState.d = this.s5;
        return savedState;
    }

    protected int r0(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int left;
        int i3;
        if (i != 1 || !z) {
            return 0;
        }
        boolean i4 = z0c.i(this);
        if (i4) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (i4) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (i4) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (i4) {
            i3 = this.v5;
        } else {
            i3 = -this.w5;
        }
        return i2 - (left + i3);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        f83.o(this.i5, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f2);
            this.i5.invalidateSelf();
            z0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.i5.a0(f2);
        getBehavior().e(this, this.i5.D() - this.i5.C());
    }

    public void setFabAlignmentMode(int i) {
        A0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.m5 = i;
    }

    void setFabCornerSize(float f2) {
        if (f2 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().j(f2);
            this.i5.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().l(f2);
            this.i5.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m(f2);
            this.i5.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.n5 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(w0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.g5 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void x0(int i) {
        if (i != 0) {
            this.q5 = 0;
            getMenu().clear();
            x(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.t5 == null) {
            this.t5 = new Behavior();
        }
        return this.t5;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @NonNull
        private final Rect e;
        private WeakReference<BottomAppBar> f;
        private int g;
        private final View.OnLayoutChangeListener h;

        /* loaded from: classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.e);
                    int height = Behavior.this.e.height();
                    bottomAppBar.B0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ww8.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (z0c.i(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.h5;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.h5;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.h = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View q0 = bottomAppBar.q0();
            if (q0 != null && !syb.Y(q0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) q0.getLayoutParams();
                fVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (q0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) q0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(mv8.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(mv8.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.i0(floatingActionButton);
                }
                bottomAppBar.z0();
            }
            coordinatorLayout.C(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new a();
            this.e = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
