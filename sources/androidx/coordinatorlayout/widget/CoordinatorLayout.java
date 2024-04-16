package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements nv6, ov6 {
    static final String u;
    static final Class<?>[] v;
    static final ThreadLocal<Map<String, Constructor<c>>> w;
    static final Comparator<View> x;
    private static final jf8<Rect> y;
    private final List<View> a;
    private final s23<View> b;
    private final List<View> c;
    private final List<View> d;
    private Paint e;
    private final int[] f;
    private final int[] g;
    private boolean h;
    private boolean i;
    private int[] j;
    private View k;
    private View l;
    private g m;
    private boolean n;
    private c5c o;
    private boolean p;
    private Drawable q;
    ViewGroup.OnHierarchyChangeListener r;
    private h77 s;
    private final pv6 t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h77 {
        a() {
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            return CoordinatorLayout.this.Q(c5cVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @NonNull
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static Object getTag(@NonNull View view) {
            return ((f) view.getLayoutParams()).r;
        }

        public static void setTag(@NonNull View view, Object obj) {
            ((f) view.getLayoutParams()).r = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return -16777216;
        }

        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(@NonNull f fVar) {
        }

        @NonNull
        public c5c onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull c5c c5cVar) {
            return c5cVar;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float R = syb.R(view);
            float R2 = syb.R(view2);
            if (R > R2) {
                return -1;
            }
            if (R < R2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        u = str;
        x = new h();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal<>();
        y = new nf8(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sv8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + CoreConstants.DOT + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean F(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if ((z || z2) && actionMasked != 0) {
                if (f2 != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            f2.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        f2.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z && f2 != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z = f2.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z = f2.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z) {
                        this.k = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i3 = fVar.i(this, view);
                if (i3 && !c2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i3 && !z2) {
                    break;
                }
            }
        }
        list.clear();
        return z;
    }

    private void G() {
        this.a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f s = s(childAt);
            s.d(this, childAt);
            this.b.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (s.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.a.addAll(this.b.i());
        Collections.reverse(this.a);
    }

    private static void I(@NonNull Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    private void K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f2.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    f2.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((f) getChildAt(i2).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    private static int L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            return i | 48;
        }
        return i;
    }

    private static int N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void O(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.i;
        if (i2 != i) {
            syb.e0(view, i - i2);
            fVar.i = i;
        }
    }

    private void P(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.j;
        if (i2 != i) {
            syb.f0(view, i - i2);
            fVar.j = i;
        }
    }

    private void R() {
        if (syb.B(this)) {
            if (this.s == null) {
                this.s = new a();
            }
            syb.I0(this, this.s);
            setSystemUiVisibility(1280);
            return;
        }
        syb.I0(this, null);
    }

    @NonNull
    private static Rect a() {
        Rect b2 = y.b();
        if (b2 == null) {
            return new Rect();
        }
        return b2;
    }

    private static int c(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    private void d(f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private c5c e(c5c c5cVar) {
        c f2;
        if (c5cVar.p()) {
            return c5cVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (syb.B(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                c5cVar = f2.onApplyWindowInsets(this, childAt, c5cVar);
                if (c5cVar.p()) {
                    break;
                }
            }
        }
        return c5cVar;
    }

    private void p(View view, int i, Rect rect, Rect rect2, f fVar, int i2, int i3) {
        int width;
        int height;
        int b2 = ii4.b(L(fVar.c), i);
        int b3 = ii4.b(M(fVar.d), i);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int i6 = b3 & 7;
        int i7 = b3 & 112;
        if (i6 != 1) {
            if (i6 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i4 != 1) {
            if (i4 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private int q(int i) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    private void t(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean u(View view) {
        return this.b.j(view);
    }

    private void w(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        Rect a2 = a();
        a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.o != null && syb.B(this) && !syb.B(view)) {
            a2.left += this.o.j();
            a2.top += this.o.l();
            a2.right -= this.o.k();
            a2.bottom -= this.o.i();
        }
        Rect a3 = a();
        ii4.a(M(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
        I(a2);
        I(a3);
    }

    private void x(View view, View view2, int i) {
        Rect a2 = a();
        Rect a3 = a();
        try {
            n(view2, a2);
            o(view, i, a2, a3);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
        } finally {
            I(a2);
            I(a3);
        }
    }

    private void y(View view, int i, int i2) {
        int i3;
        f fVar = (f) view.getLayoutParams();
        int b2 = ii4.b(N(fVar.c), i2);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int q = q(i) - measuredWidth;
        if (i4 != 1) {
            if (i4 == 5) {
                q += measuredWidth;
            }
        } else {
            q += measuredWidth / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                i3 = 0;
            } else {
                i3 = measuredHeight;
            }
        } else {
            i3 = measuredHeight / 2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void z(View view, Rect rect, int i) {
        boolean z;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (syb.Y(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect a2 = a();
            Rect a3 = a();
            a3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 != null && f2.getInsetDodgeRect(this, view, a2)) {
                if (!a3.contains(a2)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a2.toShortString() + " | Bounds:" + a3.toShortString());
                }
            } else {
                a2.set(a3);
            }
            I(a3);
            if (a2.isEmpty()) {
                I(a2);
                return;
            }
            int b2 = ii4.b(fVar.h, i);
            boolean z2 = true;
            if ((b2 & 48) == 48 && (i6 = (a2.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) < (i7 = rect.top)) {
                P(view, i7 - i6);
                z = true;
            } else {
                z = false;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - a2.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i5 = rect.bottom)) {
                P(view, height - i5);
            } else if (!z) {
                P(view, 0);
            }
            if ((b2 & 3) == 3 && (i3 = (a2.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) < (i4 = rect.left)) {
                O(view, i4 - i3);
            } else {
                z2 = false;
            }
            if ((b2 & 5) == 5 && (width = ((getWidth() - a2.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) < (i2 = rect.right)) {
                O(view, width - i2);
            } else if (!z2) {
                O(view, 0);
            }
            I(a2);
        }
    }

    void A(View view, int i) {
        c f2;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect a2 = a();
            Rect a3 = a();
            Rect a4 = a();
            n(fVar.k, a2);
            boolean z = false;
            k(view, false, a3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            p(view, i, a2, a4, fVar, measuredWidth, measuredHeight);
            z = (a4.left == a3.left && a4.top == a3.top) ? true : true;
            d(fVar, a4, measuredWidth, measuredHeight);
            int i2 = a4.left - a3.left;
            int i3 = a4.top - a3.top;
            if (i2 != 0) {
                syb.e0(view, i2);
            }
            if (i3 != 0) {
                syb.f0(view, i3);
            }
            if (z && (f2 = fVar.f()) != null) {
                f2.onDependentViewChanged(this, view, fVar.k);
            }
            I(a2);
            I(a3);
            I(a4);
        }
    }

    final void B(int i) {
        boolean z;
        int E = syb.E(this);
        int size = this.a.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.a.get(i2);
            f fVar = (f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (fVar.l == this.a.get(i3)) {
                        A(view, E);
                    }
                }
                k(view, true, a3);
                if (fVar.g != 0 && !a3.isEmpty()) {
                    int b2 = ii4.b(fVar.g, E);
                    int i4 = b2 & 112;
                    if (i4 != 48) {
                        if (i4 == 80) {
                            a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                        }
                    } else {
                        a2.top = Math.max(a2.top, a3.bottom);
                    }
                    int i5 = b2 & 7;
                    if (i5 != 3) {
                        if (i5 == 5) {
                            a2.right = Math.max(a2.right, getWidth() - a3.left);
                        }
                    } else {
                        a2.left = Math.max(a2.left, a3.right);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    z(view, a2, E);
                }
                if (i != 2) {
                    r(view, a4);
                    if (!a4.equals(a3)) {
                        H(view, a3);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.a.get(i6);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.layoutDependsOn(this, view2, view)) {
                        if (i == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i != 2) {
                                z = f2.onDependentViewChanged(this, view2, view);
                            } else {
                                f2.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                fVar2.p(z);
                            }
                        }
                    }
                }
            }
        }
        I(a2);
        I(a3);
        I(a4);
    }

    public void C(@NonNull View view, int i) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.k;
            if (view2 != null) {
                x(view, view2, i);
                return;
            }
            int i2 = fVar.e;
            if (i2 >= 0) {
                y(view, i2, i);
                return;
            } else {
                w(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void J() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    final c5c Q(c5c c5cVar) {
        boolean z;
        if (!p57.a(this.o, c5cVar)) {
            this.o = c5cVar;
            boolean z2 = false;
            if (c5cVar != null && c5cVar.l() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.p = z;
            if (!z && getBackground() == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            c5c e2 = e(c5cVar);
            requestLayout();
            return e2;
        }
        return c5cVar;
    }

    void b() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.e == null) {
                    this.e = new Paint();
                }
                this.e.setColor(fVar.a.getScrimColor(this, view));
                this.e.setAlpha(c(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(@NonNull View view) {
        List g2 = this.b.g(view);
        if (g2 != null && !g2.isEmpty()) {
            for (int i = 0; i < g2.size(); i++) {
                View view2 = (View) g2.get(i);
                c f2 = ((f) view2.getLayoutParams()).f();
                if (f2 != null) {
                    f2.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.n) {
            if (z) {
                b();
            } else {
                J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.a);
    }

    public final c5c getLastWindowInsets() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    void k(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                n(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @NonNull
    public List<View> l(@NonNull View view) {
        List<View> h2 = this.b.h(view);
        this.d.clear();
        if (h2 != null) {
            this.d.addAll(h2);
        }
        return this.d;
    }

    @NonNull
    public List<View> m(@NonNull View view) {
        List g2 = this.b.g(view);
        this.d.clear();
        if (g2 != null) {
            this.d.addAll(g2);
        }
        return this.d;
    }

    void n(View view, Rect rect) {
        izb.a(this, view, rect);
    }

    void o(View view, int i, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && syb.B(this)) {
            syb.r0(this);
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.p && this.q != null) {
            c5c c5cVar = this.o;
            if (c5cVar != null) {
                i = c5cVar.l();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.q.setBounds(0, 0, getWidth(), i);
                this.q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean F = F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            K(true);
        }
        return F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c f2;
        int E = syb.E(this);
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.a.get(i5);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.onLayoutChild(this, view, E))) {
                C(view, E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z2 |= f4.onNestedFling(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            B(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z |= f4.onNestedPreFling(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c f2 = s(childAt).f();
            if (id != -1 && f2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f2.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f2 != null && (onSaveInstanceState = f2.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.F(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.k
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 != null && f2.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.h) {
            K(false);
            this.h = true;
        }
    }

    f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                f83.m(this.q, syb.E(this));
                Drawable drawable4 = this.q;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.q.setCallback(this);
            }
            syb.l0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = iu1.e(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    public boolean v(@NonNull View view, int i, int i2) {
        Rect a2 = a();
        n(view, a2);
        try {
            return a2.contains(i, i2);
        } finally {
            I(a2);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.q) {
            return false;
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public f(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.l = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i) {
            int b = ii4.b(((f) view.getLayoutParams()).g, i);
            if (b != 0 && (ii4.b(this.h, i) & b) == b) {
                return true;
            }
            return false;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.l = null;
                    this.k = null;
                    return false;
                }
            }
            this.l = view2;
            return true;
        }

        boolean a() {
            if (this.k == null && this.f != -1) {
                return true;
            }
            return false;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            if (view2 != this.l && !s(view2, syb.E(coordinatorLayout)) && ((cVar = this.a) == null || !cVar.layoutDependsOn(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.m;
            if (z2) {
                return true;
            }
            c cVar = this.a;
            if (cVar != null) {
                z = cVar.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.m = z3;
            return z3;
        }

        boolean j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        void k() {
            this.p = false;
        }

        void l(int i) {
            r(i, false);
        }

        void m() {
            this.m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        void p(boolean z) {
            this.p = z;
        }

        void q(Rect rect) {
            this.q.set(rect);
        }

        void r(int i, boolean z) {
            if (i != 0) {
                if (i == 1) {
                    this.o = z;
                    return;
                }
                return;
            }
            this.n = z;
        }

        f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h29.e);
            this.c = obtainStyledAttributes.getInteger(h29.f, 0);
            this.f = obtainStyledAttributes.getResourceId(h29.g, -1);
            this.d = obtainStyledAttributes.getInteger(h29.h, 0);
            this.e = obtainStyledAttributes.getInteger(h29.l, -1);
            this.g = obtainStyledAttributes.getInt(h29.k, 0);
            this.h = obtainStyledAttributes.getInt(h29.j, 0);
            int i = h29.i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.E(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.a = new ArrayList();
        this.b = new s23<>();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new pv6(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h29.b, 0, m19.a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h29.b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, h29.b, attributeSet, obtainStyledAttributes, 0, m19.a);
            } else {
                saveAttributeDataForStyleable(context, h29.b, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(h29.c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.j;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        this.q = obtainStyledAttributes.getDrawable(h29.d);
        obtainStyledAttributes.recycle();
        R();
        super.setOnHierarchyChangeListener(new e());
        if (syb.C(this) == 0) {
            syb.F0(this, 1);
        }
    }

    @Override // defpackage.nv6
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        c f2;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f;
                    if (i > 0) {
                        min = Math.max(i4, iArr3[0]);
                    } else {
                        min = Math.min(i4, iArr3[0]);
                    }
                    i4 = min;
                    int[] iArr4 = this.f;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr4[1]);
                    } else {
                        min2 = Math.min(i5, iArr4[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            B(1);
        }
    }

    @Override // defpackage.nv6
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.g);
    }

    @Override // defpackage.nv6
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        c f2;
        this.t.c(view, view2, i, i2);
        this.l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2) && (f2 = fVar.f()) != null) {
                f2.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // defpackage.nv6
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean onStartNestedScroll = f2.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    fVar.r(i2, onStartNestedScroll);
                } else {
                    fVar.r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.nv6
    public void onStopNestedScroll(View view, int i) {
        this.t.e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.onStopNestedScroll(this, childAt, view, i);
                }
                fVar.l(i);
                fVar.k();
            }
        }
        this.l = null;
    }

    @Override // defpackage.ov6
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        c f2;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i5) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f;
                    if (i3 > 0) {
                        min = Math.max(i6, iArr3[0]);
                    } else {
                        min = Math.min(i6, iArr3[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, this.f[1]);
                    } else {
                        min2 = Math.min(i7, this.f[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            B(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        SparseArray<Parcelable> c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.c.keyAt(i3);
                parcelableArr[i3] = this.c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
