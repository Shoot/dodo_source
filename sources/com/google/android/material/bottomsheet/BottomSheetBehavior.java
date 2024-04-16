package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.bzb;
import defpackage.d4;
import defpackage.i4;
import defpackage.z0c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int d0 = i19.Widget_Design_BottomSheet_Modal;
    private ValueAnimator A;
    int B;
    int C;
    int D;
    float E;
    int F;
    float G;
    boolean H;
    private boolean I;
    private boolean J;
    int K;
    int L;
    bzb M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    int R;
    int S;
    WeakReference<V> T;
    WeakReference<View> U;
    @NonNull
    private final ArrayList<f> V;
    private VelocityTracker W;
    int X;
    private int Y;
    boolean Z;
    private int a;
    private Map<View, Integer> a0;
    private boolean b;
    private int b0;
    private boolean c;
    private final bzb.c c0;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private fa6 i;
    private ColorStateList j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private uga x;
    private boolean y;
    private final BottomSheetBehavior<V>.g z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.n0(this.a, this.b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.i != null) {
                BottomSheetBehavior.this.i.c0(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements z0c.d {
        final /* synthetic */ boolean a;

        c(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
            if (r6 != false) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
        @Override // defpackage.z0c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.c5c a(android.view.View r11, defpackage.c5c r12, defpackage.z0c.e r13) {
            /*
                r10 = this;
                int r0 = defpackage.c5c.m.d()
                n45 r0 = r12.f(r0)
                int r1 = defpackage.c5c.m.c()
                n45 r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.b
                com.google.android.material.bottomsheet.BottomSheetBehavior.j(r2, r3)
                boolean r2 = defpackage.z0c.i(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.k(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.m(r3, r6)
                int r3 = r13.d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.l(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.n(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.c
                goto L50
            L4e:
                int r4 = r13.a
            L50:
                int r6 = r0.a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.o(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.a
                goto L62
            L60:
                int r13 = r13.c
            L62:
                int r2 = r0.c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.p(r2)
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.q(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                goto L93
            L92:
                r6 = r2
            L93:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.b(r2)
                if (r2 == 0) goto La4
                int r2 = r13.topMargin
                int r0 = r0.b
                if (r2 == r0) goto La4
                r13.topMargin = r0
                goto La6
            La4:
                if (r6 == 0) goto La9
            La6:
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.d
                com.google.android.material.bottomsheet.BottomSheetBehavior.c(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.k(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.d(r11, r7)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, c5c, z0c$e):c5c");
        }
    }

    /* loaded from: classes2.dex */
    class d extends bzb.c {
        private long a;

        d() {
        }

        private boolean n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.S + bottomSheetBehavior.D()) / 2) {
                return true;
            }
            return false;
        }

        @Override // defpackage.bzb.c
        public int a(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // defpackage.bzb.c
        public int b(@NonNull View view, int i, int i2) {
            int i3;
            int D = BottomSheetBehavior.this.D();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.H) {
                i3 = bottomSheetBehavior.S;
            } else {
                i3 = bottomSheetBehavior.F;
            }
            return na6.b(i, D, i3);
        }

        @Override // defpackage.bzb.c
        public int e(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.H) {
                return bottomSheetBehavior.S;
            }
            return bottomSheetBehavior.F;
        }

        @Override // defpackage.bzb.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.J) {
                BottomSheetBehavior.this.g0(1);
            }
        }

        @Override // defpackage.bzb.c
        public void k(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.z(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (r10.i0(r3, (r9 * 100.0f) / r10.S) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (r9 > r7.b.D) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.b.D()) < java.lang.Math.abs(r8.getTop() - r7.b.D)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
            if (r7.b.l0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
            if (java.lang.Math.abs(r9 - r7.b.C) < java.lang.Math.abs(r9 - r7.b.F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
            if (r7.b.l0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
            if (r7.b.l0() == false) goto L6;
         */
        @Override // defpackage.bzb.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // defpackage.bzb.c
        public boolean m(@NonNull View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.K;
            if (i2 == 1 || bottomSheetBehavior.Z) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.X == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.U;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements i4 {
        final /* synthetic */ int a;

        e(int i) {
            this.a = i;
        }

        @Override // defpackage.i4
        public boolean a(@NonNull View view, i4.a aVar) {
            BottomSheetBehavior.this.f0(this.a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.l = -1;
        this.z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.b0 = -1;
        this.c0 = new d();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> B(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) layoutParams).f();
            if (f2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int C(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    private int H(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.D;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.S;
            }
            return this.F;
        }
        return D();
    }

    private float I() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.W.getYVelocity(this.X);
    }

    private boolean L(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && syb.X(v)) {
            return true;
        }
        return false;
    }

    private void O(V v, d4.a aVar, int i) {
        syb.q0(v, aVar, null, w(i));
    }

    private void P() {
        this.X = -1;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    private void Q(@NonNull SavedState savedState) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.e = savedState.d;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = savedState.e;
        }
        if (i == -1 || (i & 4) == 4) {
            this.H = savedState.f;
        }
        if (i == -1 || (i & 8) == 8) {
            this.I = savedState.g;
        }
    }

    private void R(V v, Runnable runnable) {
        if (L(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void h0(@NonNull View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !J() && !this.f) {
            z = true;
        } else {
            z = false;
        }
        if (!this.o && !this.p && !this.q && !this.s && !this.t && !this.u && !z) {
            return;
        }
        z0c.b(view, new c(z));
    }

    private boolean j0() {
        if (this.M != null && (this.J || this.K == 1)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(View view, int i, boolean z) {
        int H = H(i);
        bzb bzbVar = this.M;
        if (bzbVar != null && (!z ? bzbVar.N(view, view.getLeft(), H) : bzbVar.L(view.getLeft(), H))) {
            g0(2);
            p0(i);
            this.z.c(i);
            return;
        }
        g0(i);
    }

    private void o0() {
        V v;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        syb.o0(v, 524288);
        syb.o0(v, 262144);
        syb.o0(v, 1048576);
        int i = this.b0;
        if (i != -1) {
            syb.o0(v, i);
        }
        int i2 = 6;
        if (!this.b && this.K != 6) {
            this.b0 = r(v, w09.bottomsheet_action_expand_halfway, 6);
        }
        if (this.H && this.K != 5) {
            O(v, d4.a.y, 5);
        }
        int i3 = this.K;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 6) {
                    O(v, d4.a.x, 4);
                    O(v, d4.a.w, 3);
                    return;
                }
                return;
            }
            if (this.b) {
                i2 = 3;
            }
            O(v, d4.a.w, i2);
            return;
        }
        if (this.b) {
            i2 = 4;
        }
        O(v, d4.a.x, i2);
    }

    private void p0(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f2;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.y != z) {
            this.y = z;
            if (this.i != null && (valueAnimator = this.A) != null) {
                if (valueAnimator.isRunning()) {
                    this.A.reverse();
                    return;
                }
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                this.A.setFloatValues(1.0f - f2, f2);
                this.A.start();
            }
        }
    }

    private void q0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.a0 == null) {
                this.a0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.T.get()) {
                if (z) {
                    this.a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.c) {
                        syb.F0(childAt, 4);
                    }
                } else if (this.c && (map = this.a0) != null && map.containsKey(childAt)) {
                    syb.F0(childAt, this.a0.get(childAt).intValue());
                }
            }
        }
        if (!z) {
            this.a0 = null;
        } else if (this.c) {
            this.T.get().sendAccessibilityEvent(8);
        }
    }

    private int r(V v, int i, int i2) {
        return syb.c(v, v.getResources().getString(i), w(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(boolean z) {
        V v;
        if (this.T != null) {
            t();
            if (this.K == 4 && (v = this.T.get()) != null) {
                if (z) {
                    f0(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    private void t() {
        int v = v();
        if (this.b) {
            this.F = Math.max(this.S - v, this.C);
        } else {
            this.F = this.S - v;
        }
    }

    private void u() {
        this.D = (int) (this.S * (1.0f - this.E));
    }

    private int v() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.S - ((this.R * 9) / 16)), this.Q) + this.v;
        }
        if (!this.n && !this.o && (i = this.m) > 0) {
            return Math.max(this.e, i + this.h);
        }
        return this.e + this.v;
    }

    private i4 w(int i) {
        return new e(i);
    }

    private void x(@NonNull Context context) {
        if (this.x == null) {
            return;
        }
        fa6 fa6Var = new fa6(this.x);
        this.i = fa6Var;
        fa6Var.Q(context);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            this.i.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.i.setTint(typedValue.data);
    }

    private void y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = ofFloat;
        ofFloat.setDuration(500L);
        this.A.addUpdateListener(new b());
    }

    View A(View view) {
        if (syb.Z(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A = A(viewGroup.getChildAt(i));
                if (A != null) {
                    return A;
                }
            }
            return null;
        }
        return null;
    }

    public int D() {
        int i;
        if (this.b) {
            return this.C;
        }
        int i2 = this.B;
        if (this.r) {
            i = 0;
        } else {
            i = this.w;
        }
        return Math.max(i2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa6 E() {
        return this.i;
    }

    public int F() {
        if (this.f) {
            return -1;
        }
        return this.e;
    }

    public int G() {
        return this.K;
    }

    public boolean J() {
        return this.n;
    }

    public boolean K() {
        return this.H;
    }

    public boolean M() {
        return true;
    }

    public void N(@NonNull f fVar) {
        this.V.remove(fVar);
    }

    @Deprecated
    public void S(f fVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.V.clear();
        if (fVar != null) {
            this.V.add(fVar);
        }
    }

    public void T(boolean z) {
        this.J = z;
    }

    public void U(int i) {
        if (i >= 0) {
            this.B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void V(boolean z) {
        int i;
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.T != null) {
            t();
        }
        if (this.b && this.K == 6) {
            i = 3;
        } else {
            i = this.K;
        }
        g0(i);
        o0();
    }

    public void W(boolean z) {
        this.n = z;
    }

    public void X(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.E = f2;
            if (this.T != null) {
                u();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void Y(boolean z) {
        if (this.H != z) {
            this.H = z;
            if (!z && this.K == 5) {
                f0(4);
            }
            o0();
        }
    }

    public void Z(int i) {
        this.l = i;
    }

    public void a0(int i) {
        this.k = i;
    }

    public void b0(int i) {
        c0(i, false);
    }

    public final void c0(int i, boolean z) {
        if (i == -1) {
            if (!this.f) {
                this.f = true;
            } else {
                return;
            }
        } else if (this.f || this.e != i) {
            this.f = false;
            this.e = Math.max(0, i);
        } else {
            return;
        }
        r0(z);
    }

    public void d0(int i) {
        this.a = i;
    }

    public void e0(boolean z) {
        this.I = z;
    }

    public void f0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.H && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.b && H(i) <= this.C) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference<V> weakReference = this.T;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.T.get();
                R(v, new a(v, i2));
                return;
            }
            g0(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    void g0(int i) {
        V v;
        if (this.K == i) {
            return;
        }
        this.K = i;
        if (i == 4 || i == 3 || i == 6 || (this.H && i == 5)) {
            this.L = i;
        }
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            q0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            q0(false);
        }
        p0(i);
        for (int i2 = 0; i2 < this.V.size(); i2++) {
            this.V.get(i2).c(v, i);
        }
        o0();
    }

    public boolean i0(long j, float f2) {
        return false;
    }

    boolean k0(@NonNull View view, float f2) {
        if (this.I) {
            return true;
        }
        if (view.getTop() < this.F) {
            return false;
        }
        if (Math.abs((view.getTop() + (f2 * 0.1f)) - this.F) / v() > 0.5f) {
            return true;
        }
        return false;
    }

    public boolean l0() {
        return false;
    }

    public boolean m0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        View view;
        bzb bzbVar;
        if (v.isShown() && this.J) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                P();
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.Z = false;
                    this.X = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.Y = (int) motionEvent.getY();
                if (this.K != 2) {
                    WeakReference<View> weakReference = this.U;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.v(view, x, this.Y)) {
                        this.X = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.Z = true;
                    }
                }
                if (this.X == -1 && !coordinatorLayout.v(v, x, this.Y)) {
                    z = true;
                } else {
                    z = false;
                }
                this.N = z;
            }
            if (!this.N && (bzbVar = this.M) != null && bzbVar.M(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.U;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.N || this.K == 1 || coordinatorLayout.v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Y - motionEvent.getY()) <= this.M.y()) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        boolean z;
        float f2;
        if (syb.B(coordinatorLayout) && !syb.B(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.T == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(ww8.design_bottom_sheet_peek_height_min);
            h0(v);
            this.T = new WeakReference<>(v);
            fa6 fa6Var = this.i;
            if (fa6Var != null) {
                syb.y0(v, fa6Var);
                fa6 fa6Var2 = this.i;
                float f3 = this.G;
                if (f3 == -1.0f) {
                    f3 = syb.y(v);
                }
                fa6Var2.a0(f3);
                if (this.K == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.y = z;
                fa6 fa6Var3 = this.i;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                fa6Var3.c0(f2);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    syb.z0(v, colorStateList);
                }
            }
            o0();
            if (syb.C(v) == 0) {
                syb.F0(v, 1);
            }
        }
        if (this.M == null) {
            this.M = bzb.o(coordinatorLayout, this.c0);
        }
        int top = v.getTop();
        coordinatorLayout.C(v, i);
        this.R = coordinatorLayout.getWidth();
        this.S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.Q = height;
        int i2 = this.S;
        int i3 = i2 - height;
        int i4 = this.w;
        if (i3 < i4) {
            if (this.r) {
                this.Q = i2;
            } else {
                this.Q = i2 - i4;
            }
        }
        this.C = Math.max(0, i2 - this.Q);
        u();
        t();
        int i5 = this.K;
        if (i5 == 3) {
            syb.f0(v, D());
        } else if (i5 == 6) {
            syb.f0(v, this.D);
        } else if (this.H && i5 == 5) {
            syb.f0(v, this.S);
        } else if (i5 == 4) {
            syb.f0(v, this.F);
        } else if (i5 == 1 || i5 == 2) {
            syb.f0(v, top - v.getTop());
        }
        this.U = new WeakReference<>(A(v));
        for (int i6 = 0; i6 < this.V.size(); i6++) {
            this.V.get(i6).a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(C(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), C(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (!M() || (weakReference = this.U) == null || view != weakReference.get()) {
            return false;
        }
        if (this.K == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f2, f3)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.U;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (M() && view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < D()) {
                int D = top - D();
                iArr[1] = D;
                syb.f0(v, -D);
                g0(3);
            } else if (!this.J) {
                return;
            } else {
                iArr[1] = i2;
                syb.f0(v, -i2);
                g0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.F;
            if (i4 > i5 && !this.H) {
                int i6 = top - i5;
                iArr[1] = i6;
                syb.f0(v, -i6);
                g0(4);
            } else if (!this.J) {
                return;
            } else {
                iArr[1] = i2;
                syb.f0(v, -i2);
                g0(1);
            }
        }
        z(v.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.a());
        Q(savedState);
        int i = savedState.c;
        if (i != 1 && i != 2) {
            this.K = i;
            this.L = i;
            return;
        }
        this.K = 4;
        this.L = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.D) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.C) < java.lang.Math.abs(r3 - r2.F)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (l0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.g0(r0)
            return
        Lf:
            boolean r3 = r2.M()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.D
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.H
            if (r3 == 0) goto L49
            float r3 = r2.I()
            boolean r3 = r2.k0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.D
            if (r3 >= r1) goto L7e
            int r1 = r2.F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.l0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.n0(r4, r0, r3)
            r2.P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.K == 1 && actionMasked == 0) {
            return true;
        }
        if (j0()) {
            this.M.E(motionEvent);
        }
        if (actionMasked == 0) {
            P();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (j0() && actionMasked == 2 && !this.N && Math.abs(this.Y - motionEvent.getY()) > this.M.y()) {
            this.M.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.N;
    }

    public void s(@NonNull f fVar) {
        if (!this.V.contains(fVar)) {
            this.V.add(fVar);
        }
    }

    void z(int i) {
        float f2;
        float f3;
        V v = this.T.get();
        if (v != null && !this.V.isEmpty()) {
            int i2 = this.F;
            if (i <= i2 && i2 != D()) {
                int i3 = this.F;
                f2 = i3 - i;
                f3 = i3 - D();
            } else {
                int i4 = this.F;
                f2 = i4 - i;
                f3 = this.S - i4;
            }
            float f4 = f2 / f3;
            for (int i5 = 0; i5 < this.V.size(); i5++) {
                this.V.get(i5).b(v, f4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class g {
        private int a;
        private boolean b;
        private final Runnable c;

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.b = false;
                bzb bzbVar = BottomSheetBehavior.this.M;
                if (bzbVar != null && bzbVar.m(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K == 2) {
                    bottomSheetBehavior.g0(gVar2.a);
                }
            }
        }

        private g() {
            this.c = new a();
        }

        void c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.T;
            if (weakReference != null && weakReference.get() != null) {
                this.a = i;
                if (!this.b) {
                    syb.m0(BottomSheetBehavior.this.T.get(), this.c);
                    this.b = true;
                }
            }
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.l = -1;
        this.z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.b0 = -1;
        this.c0 = new d();
        this.h = context.getResources().getDimensionPixelSize(ww8.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.d0);
        int i2 = b29.h0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.j = ea6.a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(b29.y0)) {
            this.x = uga.e(context, attributeSet, qv8.bottomSheetStyle, d0).m();
        }
        x(context);
        y();
        this.G = obtainStyledAttributes.getDimension(b29.g0, -1.0f);
        int i3 = b29.e0;
        if (obtainStyledAttributes.hasValue(i3)) {
            a0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = b29.f0;
        if (obtainStyledAttributes.hasValue(i4)) {
            Z(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = b29.n0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            b0(i);
        } else {
            b0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        Y(obtainStyledAttributes.getBoolean(b29.m0, false));
        W(obtainStyledAttributes.getBoolean(b29.q0, false));
        V(obtainStyledAttributes.getBoolean(b29.k0, true));
        e0(obtainStyledAttributes.getBoolean(b29.p0, false));
        T(obtainStyledAttributes.getBoolean(b29.i0, true));
        d0(obtainStyledAttributes.getInt(b29.o0, 0));
        X(obtainStyledAttributes.getFloat(b29.l0, 0.5f));
        int i6 = b29.j0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 != null && peekValue2.type == 16) {
            U(peekValue2.data);
        } else {
            U(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        this.o = obtainStyledAttributes.getBoolean(b29.u0, false);
        this.p = obtainStyledAttributes.getBoolean(b29.v0, false);
        this.q = obtainStyledAttributes.getBoolean(b29.w0, false);
        this.r = obtainStyledAttributes.getBoolean(b29.x0, true);
        this.s = obtainStyledAttributes.getBoolean(b29.r0, false);
        this.t = obtainStyledAttributes.getBoolean(b29.s0, false);
        this.u = obtainStyledAttributes.getBoolean(b29.t0, false);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final int c;
        int d;
        boolean e;
        boolean f;
        boolean g;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.c = bottomSheetBehavior.K;
            this.d = ((BottomSheetBehavior) bottomSheetBehavior).e;
            this.e = ((BottomSheetBehavior) bottomSheetBehavior).b;
            this.f = bottomSheetBehavior.H;
            this.g = ((BottomSheetBehavior) bottomSheetBehavior).I;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
        public abstract void b(@NonNull View view, float f);

        public abstract void c(@NonNull View view, int i);

        void a(@NonNull View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }
}
