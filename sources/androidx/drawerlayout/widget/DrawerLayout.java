package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import defpackage.d4;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] V4 = {16843828};
    static final int[] W4 = {16842931};
    static final boolean X4;
    private static final boolean Y4;
    private static boolean Z4;
    private Drawable A;
    private Drawable B;
    private final ArrayList<View> I;
    private Rect S4;
    private Matrix T4;
    private final i4 U4;
    private float a;
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final bzb f;
    private final bzb g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private a p;
    private List<a> q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private Object w;
    private boolean x;
    private Drawable y;
    private Drawable z;

    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull View view);

        void b(@NonNull View view);

        void c(int i);

        void d(@NonNull View view, float f);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        X4 = true;
        Y4 = true;
        if (i < 29) {
            z = false;
        }
        Z4 = z;
    }

    private boolean A(float f, float f2, View view) {
        if (this.S4 == null) {
            this.S4 = new Rect();
        }
        view.getHitRect(this.S4);
        return this.S4.contains((int) f, (int) f2);
    }

    private void B(Drawable drawable, int i) {
        if (drawable != null && f83.h(drawable)) {
            f83.m(drawable, i);
        }
    }

    private Drawable G() {
        int E = syb.E(this);
        if (E == 0) {
            Drawable drawable = this.y;
            if (drawable != null) {
                B(drawable, E);
                return this.y;
            }
        } else {
            Drawable drawable2 = this.z;
            if (drawable2 != null) {
                B(drawable2, E);
                return this.z;
            }
        }
        return this.A;
    }

    private Drawable H() {
        int E = syb.E(this);
        if (E == 0) {
            Drawable drawable = this.z;
            if (drawable != null) {
                B(drawable, E);
                return this.z;
            }
        } else {
            Drawable drawable2 = this.y;
            if (drawable2 != null) {
                B(drawable2, E);
                return this.y;
            }
        }
        return this.B;
    }

    private void I() {
        if (Y4) {
            return;
        }
        this.u = G();
        this.v = H();
    }

    private void L(View view) {
        d4.a aVar = d4.a.y;
        syb.o0(view, aVar.b());
        if (x(view) && o(view) != 2) {
            syb.q0(view, aVar, null, this.U4);
        }
    }

    private void M(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !y(childAt)) || (z && childAt == view)) {
                syb.F0(childAt, 1);
            } else {
                syb.F0(childAt, 4);
            }
        }
    }

    private boolean j(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent r = r(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(r);
            r.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent r(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.T4 == null) {
                this.T4 = new Matrix();
            }
            matrix.invert(this.T4);
            obtain.transform(this.T4);
        }
        return obtain;
    }

    static String s(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    private static boolean t(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean u() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((b) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean v() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    void C(View view, float f) {
        float q = q(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (q * width));
        if (!b(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        K(view, f);
    }

    public void D(@NonNull View view) {
        E(view, true);
    }

    public void E(@NonNull View view, boolean z) {
        if (y(view)) {
            b bVar = (b) view.getLayoutParams();
            if (this.j) {
                bVar.b = 1.0f;
                bVar.d = 1;
                M(view, true);
                L(view);
            } else if (z) {
                bVar.d |= 2;
                if (b(view, 3)) {
                    this.f.N(view, 0, view.getTop());
                } else {
                    this.g.N(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                C(view, 1.0f);
                N(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void F(@NonNull a aVar) {
        List<a> list;
        if (aVar == null || (list = this.q) == null) {
            return;
        }
        list.remove(aVar);
    }

    public void J(int i, int i2) {
        View k;
        bzb bzbVar;
        int b2 = ii4.b(i2, syb.E(this));
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.n = i;
                    }
                } else {
                    this.m = i;
                }
            } else {
                this.l = i;
            }
        } else {
            this.k = i;
        }
        if (i != 0) {
            if (b2 == 3) {
                bzbVar = this.f;
            } else {
                bzbVar = this.g;
            }
            bzbVar.a();
        }
        if (i != 1) {
            if (i == 2 && (k = k(b2)) != null) {
                D(k);
                return;
            }
            return;
        }
        View k2 = k(b2);
        if (k2 != null) {
            c(k2);
        }
    }

    void K(View view, float f) {
        b bVar = (b) view.getLayoutParams();
        if (f == bVar.b) {
            return;
        }
        bVar.b = f;
        i(view, f);
    }

    void N(int i, View view) {
        int i2;
        int z = this.f.z();
        int z2 = this.g.z();
        if (z != 1 && z2 != 1) {
            i2 = 2;
            if (z != 2 && z2 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((b) view.getLayoutParams()).b;
            if (f == 0.0f) {
                g(view);
            } else if (f == 1.0f) {
                h(view);
            }
        }
        if (i2 != this.h) {
            this.h = i2;
            List<a> list = this.q;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.q.get(size).c(i2);
                }
            }
        }
    }

    public void a(@NonNull a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (y(childAt)) {
                if (x(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.I.add(childAt);
            }
        }
        if (!z) {
            int size = this.I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (l() == null && !y(view)) {
            syb.F0(view, 1);
        } else {
            syb.F0(view, 4);
        }
        if (!X4) {
            syb.u0(view, null);
        }
    }

    boolean b(View view, int i) {
        if ((p(view) & i) == i) {
            return true;
        }
        return false;
    }

    public void c(@NonNull View view) {
        d(view, true);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof b) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((b) getChildAt(i).getLayoutParams()).b);
        }
        this.d = f;
        boolean m = this.f.m(true);
        boolean m2 = this.g.m(true);
        if (m || m2) {
            syb.l0(this);
        }
    }

    public void d(@NonNull View view, boolean z) {
        if (y(view)) {
            b bVar = (b) view.getLayoutParams();
            if (this.j) {
                bVar.b = 0.0f;
                bVar.d = 0;
            } else if (z) {
                bVar.d |= 4;
                if (b(view, 3)) {
                    this.f.N(view, -view.getWidth(), view.getTop());
                } else {
                    this.g.N(view, getWidth(), view.getTop());
                }
            } else {
                C(view, 0.0f);
                N(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.d > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (A(x, y, childAt) && !w(childAt) && j(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean w = w(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (w) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && t(childAt) && y(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.d;
        if (f > 0.0f && w) {
            int i4 = this.c;
            this.e.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.e);
        } else if (this.u != null && b(view, 3)) {
            int intrinsicWidth = this.u.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f.w(), 1.0f));
            this.u.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.u.setAlpha((int) (max * 255.0f));
            this.u.draw(canvas);
        } else if (this.v != null && b(view, 5)) {
            int intrinsicWidth2 = this.v.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.g.w(), 1.0f));
            this.v.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.v.setAlpha((int) (max2 * 255.0f));
            this.v.draw(canvas);
        }
        return drawChild;
    }

    public void e() {
        f(false);
    }

    void f(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = (b) childAt.getLayoutParams();
            if (y(childAt) && (!z || bVar.c)) {
                int width = childAt.getWidth();
                if (b(childAt, 3)) {
                    this.f.N(childAt, -width, childAt.getTop());
                } else {
                    this.g.N(childAt, getWidth(), childAt.getTop());
                }
                bVar.c = false;
            }
        }
        throw null;
    }

    void g(View view) {
        View rootView;
        b bVar = (b) view.getLayoutParams();
        if ((bVar.d & 1) == 1) {
            bVar.d = 0;
            List<a> list = this.q;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.q.get(size).b(view);
                }
            }
            M(view, false);
            L(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public float getDrawerElevation() {
        if (Y4) {
            return this.a;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.t;
    }

    void h(View view) {
        b bVar = (b) view.getLayoutParams();
        if ((bVar.d & 1) == 0) {
            bVar.d = 1;
            List<a> list = this.q;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.q.get(size).a(view);
                }
            }
            M(view, true);
            L(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void i(View view, float f) {
        List<a> list = this.q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.q.get(size).d(view, f);
            }
        }
    }

    View k(int i) {
        int b2 = ii4.b(i, syb.E(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((p(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    View l() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((b) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (y(childAt) && z(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int n(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int E = syb.E(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        int i6 = this.n;
                        if (i6 != 3) {
                            return i6;
                        }
                        if (E == 0) {
                            i5 = this.l;
                        } else {
                            i5 = this.k;
                        }
                        if (i5 != 3) {
                            return i5;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i7 = this.m;
                if (i7 != 3) {
                    return i7;
                }
                if (E == 0) {
                    i4 = this.k;
                } else {
                    i4 = this.l;
                }
                if (i4 != 3) {
                    return i4;
                }
                return 0;
            }
            int i8 = this.l;
            if (i8 != 3) {
                return i8;
            }
            if (E == 0) {
                i3 = this.n;
            } else {
                i3 = this.m;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        int i9 = this.k;
        if (i9 != 3) {
            return i9;
        }
        if (E == 0) {
            i2 = this.m;
        } else {
            i2 = this.n;
        }
        if (i2 != 3) {
            return i2;
        }
        return 0;
    }

    public int o(@NonNull View view) {
        if (y(view)) {
            return n(((b) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.x && this.t != null) {
            Object obj = this.w;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.t.setBounds(0, 0, getWidth(), i);
                this.t.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            bzb r1 = r6.f
            boolean r1 = r1.M(r7)
            bzb r2 = r6.g
            boolean r2 = r2.M(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 == r2) goto L29
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L29
            goto L2e
        L1e:
            bzb r7 = r6.f
            boolean r7 = r7.d(r4)
            if (r7 != 0) goto L27
            goto L2e
        L27:
            r7 = 0
            throw r7
        L29:
            r6.f(r2)
            r6.o = r3
        L2e:
            r7 = 0
            goto L58
        L30:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.r = r0
            r6.s = r7
            float r4 = r6.d
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L55
            bzb r4 = r6.f
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L55
            boolean r7 = r6.w(r7)
            if (r7 == 0) goto L55
            r7 = 1
            goto L56
        L55:
            r7 = 0
        L56:
            r6.o = r3
        L58:
            if (r1 != 0) goto L68
            if (r7 != 0) goto L68
            boolean r7 = r6.u()
            if (r7 != 0) goto L68
            boolean r7 = r6.o
            if (r7 == 0) goto L67
            goto L68
        L67:
            r2 = 0
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && v()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m = m();
            if (m != null && o(m) == 0) {
                e();
            }
            if (m != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r1 = getRootWindowInsets();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.w != null && syb.B(this)) {
            z = true;
        } else {
            z = false;
        }
        int E = syb.E(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (z) {
                    int b2 = ii4.b(bVar.a, E);
                    if (syb.B(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.w;
                        if (b2 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.w;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (w(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) bVar).leftMargin) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) bVar).topMargin) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, 1073741824));
                } else if (y(childAt)) {
                    if (Y4) {
                        float y = syb.y(childAt);
                        float f = this.a;
                        if (y != f) {
                            syb.C0(childAt, f);
                        }
                    }
                    int p = p(childAt) & 7;
                    if (p == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z2 && z3) || (!z2 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + s(p) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.b + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, ((ViewGroup.MarginLayoutParams) bVar).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View k;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i = savedState.c;
        if (i != 0 && (k = k(i)) != null) {
            D(k);
        }
        int i2 = savedState.d;
        if (i2 != 3) {
            J(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            J(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            J(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            J(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        I();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            b bVar = (b) getChildAt(i).getLayoutParams();
            int i2 = bVar.d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.c = bVar.a;
                break;
            }
        }
        savedState.d = this.k;
        savedState.e = this.l;
        savedState.f = this.m;
        savedState.g = this.n;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (o(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            bzb r0 = r6.f
            r0.E(r7)
            bzb r0 = r6.g
            r0.E(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.f(r2)
            r6.o = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            bzb r3 = r6.f
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.w(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.r
            float r0 = r0 - r3
            float r3 = r6.s
            float r7 = r7 - r3
            bzb r3 = r6.f
            int r3 = r3.y()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.l()
            if (r7 == 0) goto L5d
            int r7 = r6.o(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.f(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.r = r0
            r6.s = r7
            r6.o = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    int p(View view) {
        return ii4.b(((b) view.getLayoutParams()).a, syb.E(this));
    }

    float q(View view) {
        return ((b) view.getLayoutParams()).b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            f(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.i) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (y(childAt)) {
                syb.C0(childAt, this.a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(a aVar) {
        a aVar2 = this.p;
        if (aVar2 != null) {
            F(aVar2);
        }
        if (aVar != null) {
            a(aVar);
        }
        this.p = aVar;
    }

    public void setDrawerLockMode(int i) {
        J(i, 3);
        J(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.t = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.t = new ColorDrawable(i);
        invalidate();
    }

    boolean w(View view) {
        if (((b) view.getLayoutParams()).a == 0) {
            return true;
        }
        return false;
    }

    public boolean x(@NonNull View view) {
        if (y(view)) {
            if ((((b) view.getLayoutParams()).d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean y(View view) {
        int b2 = ii4.b(((b) view.getLayoutParams()).a, syb.E(view));
        if ((b2 & 3) != 0 || (b2 & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean z(@NonNull View view) {
        if (y(view)) {
            if (((b) view.getLayoutParams()).b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setStatusBarBackground(int i) {
        this.t = i != 0 ? iu1.e(getContext(), i) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int a;
        float b;
        boolean c;
        int d;

        public b(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.W4);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public b(@NonNull b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.a = 0;
            this.a = bVar.a;
        }

        public b(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int c;
        int d;
        int e;
        int f;
        int g;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.c = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }
}
