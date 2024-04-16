package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.d4;
import defpackage.i4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int t = i19.Widget_Design_AppBarLayout;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private c5c g;
    private List<c> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private WeakReference<View> n;
    private ValueAnimator o;
    private final List<g> p;
    private int[] q;
    private Drawable r;
    private Behavior s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private d onDragCallback;
        private SavedState savedState;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.setHeaderTopBottomOffset(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements i4 {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;
            final /* synthetic */ View c;
            final /* synthetic */ int d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.i4
            public boolean a(@NonNull View view, i4.a aVar) {
                BaseBehavior.this.onNestedPreScroll(this.a, (CoordinatorLayout) this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements i4 {
            final /* synthetic */ AppBarLayout a;
            final /* synthetic */ boolean b;

            c(AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.b = z;
            }

            @Override // defpackage.i4
            public boolean a(@NonNull View view, i4.a aVar) {
                this.a.setExpanded(this.b);
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static abstract class d<T extends AppBarLayout> {
        }

        public BaseBehavior() {
        }

        private void addAccessibilityScrollActions(CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view) {
            if (getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                addActionToExpand(coordinatorLayout, t, d4.a.q, false);
            }
            if (getTopBottomOffsetForScrollingSibling() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        syb.q0(coordinatorLayout, d4.a.r, null, new b(coordinatorLayout, t, view, i));
                        return;
                    }
                    return;
                }
                addActionToExpand(coordinatorLayout, t, d4.a.r, true);
            }
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull d4.a aVar, boolean z) {
            syb.q0(coordinatorLayout, aVar, null, new c(t, z));
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @NonNull T t, int i, float f) {
            int height;
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t, i, height);
        }

        private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.offsetAnimator.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(sk.e);
                this.offsetAnimator.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i2, (int) MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
            if (i >= (i2 + i3) / 2) {
                return i3;
            }
            return i2;
        }

        private boolean canScrollChildren(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view) {
            if (t.l() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                return true;
            }
            return false;
        }

        private static boolean checkFlag(int i, int i2) {
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        private View findFirstScrollingChild(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof lv6) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View getAppBarChildOnOffset(@NonNull AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@NonNull T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f fVar = (f) childAt.getLayoutParams();
                if (checkFlag(fVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int interpolateOffset(@NonNull T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                f fVar = (f) childAt.getLayoutParams();
                Interpolator d2 = fVar.d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (d2 != null) {
                        int c2 = fVar.c();
                        if ((c2 & 1) != 0) {
                            i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                            if ((c2 & 2) != 0) {
                                i2 -= syb.F(childAt);
                            }
                        }
                        if (syb.B(childAt)) {
                            i2 -= t.getTopInset();
                        }
                        if (i2 > 0) {
                            float f = i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * d2.getInterpolation((abs - childAt.getTop()) / f)));
                        }
                    }
                } else {
                    i3++;
                }
            }
            return i;
        }

        private boolean shouldJumpElevationState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            List<View> m = coordinatorLayout.m(t);
            int size = m.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f = ((CoordinatorLayout.f) m.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f).d() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t.getChildAt(childIndexOnOffset);
                f fVar = (f) childAt.getLayoutParams();
                int c2 = fVar.c();
                if ((c2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && syb.B(t) && syb.B(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (checkFlag(c2, 2)) {
                        i2 += syb.F(childAt);
                    } else if (checkFlag(c2, 5)) {
                        int F = syb.F(childAt) + i2;
                        if (topBottomOffsetForScrollingSibling < F) {
                            i = F;
                        } else {
                            i2 = F;
                        }
                    }
                    if (checkFlag(c2, 32)) {
                        i += ((LinearLayout.LayoutParams) fVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t, na6.b(calculateSnapOffset(topBottomOffsetForScrollingSibling, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            syb.o0(coordinatorLayout, d4.a.q.b());
            syb.o0(coordinatorLayout, d4.a.r.b());
            View findFirstScrollingChild = findFirstScrollingChild(coordinatorLayout);
            if (findFirstScrollingChild == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) findFirstScrollingChild.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            addAccessibilityScrollActions(coordinatorLayout, t, findFirstScrollingChild);
        }

        private void updateAppBarLayoutDrawableState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, boolean z) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
            boolean z2 = false;
            if (appBarChildOnOffset != null) {
                int c2 = ((f) appBarChildOnOffset.getLayoutParams()).c();
                if ((c2 & 1) != 0) {
                    int F = syb.F(appBarChildOnOffset);
                    if (i2 <= 0 || (c2 & 12) == 0 ? !((c2 & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - F) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - F) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.n()) {
                z2 = t.B(findFirstScrollingChild(coordinatorLayout));
            }
            boolean y = t.y(z2);
            if (z || (y && shouldJumpElevationState(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ boolean canDragView(View view) {
            return canDragView((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int getMaxDragOffset(@NonNull View view) {
            return getMaxDragOffset((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int getScrollRangeForDragFling(@NonNull View view) {
            return getScrollRangeForDragFling((BaseBehavior<T>) ((AppBarLayout) view));
        }

        @Override // com.google.android.material.appbar.a
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            onFlingFinished(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return onLayoutChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return onMeasureChild(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, iArr, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            onNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, i3, i4, i5, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            return onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
            return onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i);
        }

        void restoreScrollState(SavedState savedState, boolean z) {
            if (this.savedState == null || z) {
                this.savedState = savedState;
            }
        }

        SavedState saveScrollState(Parcelable parcelable, @NonNull T t) {
            boolean z;
            boolean z2;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.d = z;
                    if (!z && (-topAndBottomOffset) >= t.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    savedState.c = z2;
                    savedState.e = i;
                    if (bottom == syb.F(childAt) + t.getTopInset()) {
                        z3 = true;
                    }
                    savedState.g = z3;
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return setHeaderTopBottomOffset(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        boolean canDragView(T t) {
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        int getMaxDragOffset(@NonNull T t) {
            return -t.getDownNestedScrollRange();
        }

        int getScrollRangeForDragFling(@NonNull T t) {
            return t.getTotalScrollRange();
        }

        void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            snapToChildIfNeeded(coordinatorLayout, t);
            if (t.n()) {
                t.y(t.B(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.c) {
                setHeaderTopBottomOffset(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.d) {
                setHeaderTopBottomOffset(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.e);
                int i3 = -childAt.getBottom();
                if (this.savedState.g) {
                    round = syb.F(childAt) + t.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.savedState.f);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t, i3 + round);
            }
            t.s();
            this.savedState = null;
            setTopAndBottomOffset(na6.b(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.o(getTopAndBottomOffset());
            updateAccessibilityActions(coordinatorLayout, t);
            return onLayoutChild;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.D(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = scroll(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.n()) {
                t.y(t.B(view));
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = scroll(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                updateAccessibilityActions(coordinatorLayout, t);
            }
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t, this.savedState.a());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t, parcelable);
            this.savedState = null;
        }

        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t);
            SavedState saveScrollState = saveScrollState(onSaveInstanceState, t);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.n() || canScrollChildren(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, t);
                if (t.n()) {
                    t.y(t.B(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i4 = 0;
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                this.offsetDelta = 0;
            } else {
                int b2 = na6.b(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != b2) {
                    int interpolateOffset = t.j() ? interpolateOffset(t, b2) : b2;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i5 = topBottomOffsetForScrollingSibling - b2;
                    this.offsetDelta = b2 - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i4 < t.getChildCount()) {
                            f fVar = (f) t.getChildAt(i4).getLayoutParams();
                            d b3 = fVar.b();
                            if (b3 != null && (fVar.c() & 1) != 0) {
                                b3.a(t, t.getChildAt(i4), getTopAndBottomOffset());
                            }
                            i4++;
                        }
                    }
                    if (!topAndBottomOffset && t.j()) {
                        coordinatorLayout.f(t);
                    }
                    t.o(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t, b2, b2 < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i4 = i5;
                }
            }
            updateAccessibilityActions(coordinatorLayout, t);
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            boolean c;
            boolean d;
            int e;
            float f;
            boolean g;

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

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readByte() != 0;
                this.d = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public void setDragCallback(d dVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.d dVar) {
            super.setDragCallback(dVar);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int k(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void l(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                syb.f0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).offsetDelta) + f()) - b(view2));
            }
        }

        private void m(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.n()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float c(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int k = k(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + k > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (k / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int e(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.e(view);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: j */
        public AppBarLayout a(@NonNull List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            l(view, view2);
            m(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                syb.o0(coordinatorLayout, d4.a.q.b());
                syb.o0(coordinatorLayout, d4.a.r.b());
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.l(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.t(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.z6);
            h(obtainStyledAttributes.getDimensionPixelSize(b29.A6, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    class a implements h77 {
        a() {
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            return AppBarLayout.this.p(c5cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ fa6 a;

        b(fa6 fa6Var) {
            this.a = fa6Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.a0(floatValue);
            if (AppBarLayout.this.r instanceof fa6) {
                ((fa6) AppBarLayout.this.r).a0(floatValue);
            }
            for (g gVar : AppBarLayout.this.p) {
                gVar.a(floatValue, this.a.A());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    /* loaded from: classes2.dex */
    public static abstract class d {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f);
    }

    /* loaded from: classes2.dex */
    public static class e extends d {
        private final Rect a = new Rect();
        private final Rect b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f) {
            b(this.a, appBarLayout, view);
            float abs = this.a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float a = 1.0f - na6.a(Math.abs(abs / this.a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.a.height() * 0.3f) * (1.0f - (a * a)));
                view.setTranslationY(height);
                view.getDrawingRect(this.b);
                this.b.offset(0, (int) (-height));
                syb.B0(view, this.b);
                return;
            }
            syb.B0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(float f, int i);
    }

    /* loaded from: classes2.dex */
    public interface h extends c<AppBarLayout> {
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.appBarLayoutStyle);
    }

    private boolean A() {
        if (this.r != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    private boolean C() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || syb.B(childAt)) {
            return false;
        }
        return true;
    }

    private void D(@NonNull fa6 fa6Var, boolean z) {
        float f2;
        float dimension = getResources().getDimension(ww8.design_appbar_elevation);
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.o = ofFloat;
        ofFloat.setDuration(getResources().getInteger(zy8.app_bar_elevation_anim_duration));
        this.o.setInterpolator(sk.a);
        this.o.addUpdateListener(new b(fa6Var));
        this.o.start();
    }

    private void E() {
        setWillNotDraw(!A());
    }

    private void e() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    private View f(View view) {
        int i;
        View view2;
        if (this.n == null && (i = this.m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (view2 != null) {
                this.n = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void m() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.s;
        if (behavior != null && this.b != -1 && this.f == 0) {
            savedState = behavior.saveScrollState(AbsSavedState.b, this);
        } else {
            savedState = null;
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (savedState != null) {
            this.s.restoreScrollState(savedState, false);
        }
    }

    private void u(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f = i4 | i3;
        requestLayout();
    }

    private boolean w(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    boolean B(View view) {
        View f2 = f(view);
        if (f2 != null) {
            view = f2;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public void c(c cVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (cVar != null && !this.h.contains(cVar)) {
            this.h.add(cVar);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public void d(h hVar) {
        c(hVar);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (A()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public f generateDefaultLayoutParams() {
        return new f(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.s = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int F;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    F = syb.F(childAt);
                } else if ((i4 & 2) != 0) {
                    F = measuredHeight - syb.F(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && syb.B(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + F;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            int i4 = fVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= syb.F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int F = syb.F(this);
        if (F == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                F = syb.F(getChildAt(childCount - 1));
            } else {
                F = 0;
            }
            if (F == 0) {
                return getHeight() / 3;
            }
        }
        return (F * 2) + topInset;
    }

    int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        c5c c5cVar = this.g;
        if (c5cVar != null) {
            return c5cVar.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            if (i2 == 0 && syb.B(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= syb.F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    boolean j() {
        return this.e;
    }

    boolean l() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.l;
    }

    void o(int i) {
        this.a = i;
        if (!willNotDraw()) {
            syb.l0(this);
        }
        List<c> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.h.get(i2);
                if (cVar != null) {
                    cVar.a(this, i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i4 = qv8.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.k) {
            i2 = qv8.state_lifted;
        } else {
            i2 = -qv8.state_lifted;
        }
        iArr[1] = i2;
        int i5 = qv8.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.k) {
            i3 = qv8.state_collapsed;
        } else {
            i3 = -qv8.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (syb.B(this) && C()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                syb.f0(getChildAt(childCount), topInset);
            }
        }
        m();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((f) getChildAt(i5).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.i) {
            if (!this.l && !k()) {
                z2 = false;
            }
            w(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && syb.B(this) && C()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = na6.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m();
    }

    c5c p(c5c c5cVar) {
        c5c c5cVar2;
        if (syb.B(this)) {
            c5cVar2 = c5cVar;
        } else {
            c5cVar2 = null;
        }
        if (!p57.a(this.g, c5cVar2)) {
            this.g = c5cVar2;
            E();
            requestLayout();
        }
        return c5cVar;
    }

    public void q(c cVar) {
        List<c> list = this.h;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    public void r(h hVar) {
        q(hVar);
    }

    void s() {
        this.f = 0;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ga6.d(this, f2);
    }

    public void setExpanded(boolean z) {
        t(z, syb.Y(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                f83.m(this.r, syb.E(this));
                Drawable drawable4 = this.r;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.r.setCallback(this);
            }
            E();
            syb.l0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(on.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        com.google.android.material.appbar.e.b(this, f2);
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
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public void t(boolean z, boolean z2) {
        u(z, z2, true);
    }

    public boolean v(boolean z) {
        this.i = true;
        return w(z);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.r) {
            return false;
        }
        return true;
    }

    public boolean x(boolean z) {
        return z(z, true);
    }

    boolean y(boolean z) {
        return z(z, !this.i);
    }

    boolean z(boolean z, boolean z2) {
        if (z2 && this.k != z) {
            this.k = z;
            refreshDrawableState();
            if (this.l && (getBackground() instanceof fa6)) {
                D((fa6) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.t
            android.content.Context r10 = defpackage.ia6.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.b = r10
            r9.c = r10
            r9.d = r10
            r6 = 0
            r9.f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.p = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.e.a(r9)
        L2f:
            com.google.android.material.appbar.e.c(r9, r11, r12, r4)
            int[] r2 = defpackage.b29.k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r12 = defpackage.b29.l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            defpackage.syb.y0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L6a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            fa6 r0 = new fa6
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.b0(r12)
            r0.Q(r7)
            defpackage.syb.y0(r9, r0)
        L6a:
            int r12 = defpackage.b29.p
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L79
            boolean r12 = r11.getBoolean(r12, r6)
            r9.u(r12, r6, r6)
        L79:
            int r12 = defpackage.b29.o
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L89
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.e.b(r9, r12)
        L89:
            r12 = 26
            if (r8 < r12) goto Lab
            int r12 = defpackage.b29.n
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L9c
            boolean r12 = r11.getBoolean(r12, r6)
            defpackage.bn.a(r9, r12)
        L9c:
            int r12 = defpackage.b29.m
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Lab:
            int r12 = defpackage.b29.q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.l = r12
            int r12 = defpackage.b29.r
            int r10 = r11.getResourceId(r12, r10)
            r9.m = r10
            int r10 = defpackage.b29.s
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            defpackage.syb.I0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes2.dex */
    public static class f extends LinearLayout.LayoutParams {
        int a;
        private d b;
        Interpolator c;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.u);
            this.a = obtainStyledAttributes.getInt(b29.w, 0);
            f(a(obtainStyledAttributes.getInt(b29.v, 0)));
            int i = b29.x;
            if (obtainStyledAttributes.hasValue(i)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private d a(int i) {
            if (i != 1) {
                return null;
            }
            return new e();
        }

        public d b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        boolean e() {
            int i = this.a;
            if ((i & 1) == 1 && (i & 10) != 0) {
                return true;
            }
            return false;
        }

        public void f(d dVar) {
            this.b = dVar;
        }

        public f(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
