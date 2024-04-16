package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private int q;
    private final int r;
    private int s;
    private int t;
    @NonNull
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> u;
    private boolean v;
    private boolean w;
    private boolean x;
    @NonNull
    protected ColorStateList y;
    private static final int z = i19.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> A = new b(Float.class, "width");
    static final Property<View, Float> B = new c(Float.class, "height");
    static final Property<View, Float> I = new d(Float.class, "paddingStart");
    static final Property<View, Float> S4 = new e(Float.class, "paddingEnd");

    /* loaded from: classes2.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;
        private boolean b;
        private boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        private static boolean c(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean f(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.b && !this.c) || fVar.e() != view.getId()) {
                return false;
            }
            return true;
        }

        private boolean h(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            v03.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean i(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        protected void a(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.c) {
                ExtendedFloatingActionButton.m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.n(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.p(null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: b */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (c(view)) {
                i(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: e */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> l = coordinatorLayout.l(extendedFloatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = l.get(i2);
                if (view instanceof AppBarLayout) {
                    if (h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (c(view) && i(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.C(extendedFloatingActionButton, i);
            return true;
        }

        protected void g(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.c) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.p(null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.v2);
            this.b = obtainStyledAttributes.getBoolean(b29.w2, false);
            this.c = obtainStyledAttributes.getBoolean(b29.x2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        private boolean a;

        a(com.google.android.material.floatingactionbutton.d dVar, f fVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a */
        public Float get(@NonNull View view) {
            return Float.valueOf(syb.J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull View view, @NonNull Float f) {
            syb.J0(view, f.intValue(), view.getPaddingTop(), syb.I(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a */
        public Float get(@NonNull View view) {
            return Float.valueOf(syb.I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull View view, @NonNull Float f) {
            syb.J0(view, syb.J(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.d n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    private boolean o() {
        if (getVisibility() != 0) {
            if (this.q != 2) {
                return false;
            }
            return true;
        } else if (this.q == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(@NonNull com.google.android.material.floatingactionbutton.d dVar, f fVar) {
        if (dVar.b()) {
            return;
        }
        if (!r()) {
            dVar.a();
            dVar.e(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet c2 = dVar.c();
        c2.addListener(new a(dVar, fVar));
        for (Animator.AnimatorListener animatorListener : dVar.d()) {
            c2.addListener(animatorListener);
        }
        c2.start();
    }

    private void q() {
        this.y = getTextColors();
    }

    private boolean r() {
        if ((syb.Y(this) || (!o() && this.x)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.u;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i = this.r;
        if (i < 0) {
            return (Math.min(syb.J(this), syb.I(this)) * 2) + getIconSize();
        }
        return i;
    }

    public bp6 getExtendMotionSpec() {
        throw null;
    }

    public bp6 getHideMotionSpec() {
        throw null;
    }

    public bp6 getShowMotionSpec() {
        throw null;
    }

    public bp6 getShrinkMotionSpec() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.v = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
        this.x = z2;
    }

    public void setExtendMotionSpec(bp6 bp6Var) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(bp6.c(getContext(), i));
    }

    public void setExtended(boolean z2) {
        if (this.v == z2) {
            return;
        }
        throw null;
    }

    public void setHideMotionSpec(bp6 bp6Var) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(bp6.c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.v && !this.w) {
            this.s = syb.J(this);
            this.t = syb.I(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.v && !this.w) {
            this.s = i;
            this.t = i3;
        }
    }

    public void setShowMotionSpec(bp6 bp6Var) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(bp6.c(getContext(), i));
    }

    public void setShrinkMotionSpec(bp6 bp6Var) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(bp6.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        q();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        q();
    }
}
