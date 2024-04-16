package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* compiled from: ViewDragHelper.java */
/* renamed from: bzb  reason: default package */
/* loaded from: classes.dex */
public class bzb {
    private static final Interpolator x = new a();
    private int a;
    private int b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private int c = -1;
    private final Runnable w = new b();

    /* compiled from: ViewDragHelper.java */
    /* renamed from: bzb$a */
    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: bzb$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bzb.this.J(0);
        }
    }

    private bzb(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull c cVar) {
        if (viewGroup != null) {
            if (cVar != null) {
                this.v = viewGroup;
                this.s = cVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.p = i;
                this.o = i;
                this.b = viewConfiguration.getScaledTouchSlop();
                this.m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.r = new OverScroller(context, x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private boolean C(int i) {
        if (!B(i)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    private void F() {
        this.l.computeCurrentVelocity(1000, this.m);
        p(g(this.l.getXVelocity(this.c), this.n, this.m), g(this.l.getYVelocity(this.c), this.n, this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [bzb$c] */
    private void G(float f, float f2, int i) {
        boolean c2 = c(f, f2, i, 1);
        boolean z = c2;
        if (c(f2, f, i, 4)) {
            z = c2 | true;
        }
        boolean z2 = z;
        if (c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.f(r0, i);
        }
    }

    private void H(float f, float f2, int i) {
        s(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.e;
        this.g[i] = f2;
        fArr2[i] = f2;
        this.h[i] = x((int) f, (int) f2);
        this.k |= 1 << i;
    }

    private void I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (C(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    private boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.s.g(i2)) {
            int[] iArr = this.j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.i[i] & i2) != 0 || abs <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.s.d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.s.e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            if (f <= 0.0f) {
                return -f3;
            }
            return f3;
        }
        return f;
    }

    private int h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            if (i <= 0) {
                return -i3;
            }
            return i3;
        }
        return i;
    }

    private void i() {
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void j(int i) {
        if (this.d != null && B(i)) {
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k = (~(1 << i)) & this.k;
        }
    }

    private int k(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f = width / 2;
        float q = f + (q(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(q / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int h = h(i3, (int) this.n, (int) this.m);
        int h2 = h(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h);
        int abs4 = Math.abs(h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (h2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((k(i, h, this.s.d(view)) * f5) + (k(i2, h2, this.s.e(view)) * (f3 / f4)));
    }

    public static bzb n(@NonNull ViewGroup viewGroup, float f, @NonNull c cVar) {
        bzb o = o(viewGroup, cVar);
        o.b = (int) (o.b * (1.0f / f));
        return o;
    }

    public static bzb o(@NonNull ViewGroup viewGroup, @NonNull c cVar) {
        return new bzb(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f, float f2) {
        this.u = true;
        this.s.l(this.t, f, f2);
        this.u = false;
        if (this.a == 1) {
            J(0);
        }
    }

    private float q(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void r(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i3 != 0) {
            i = this.s.a(this.t, i, i3);
            syb.e0(this.t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.s.b(this.t, i2, i4);
            syb.f0(this.t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.s.k(this.t, i5, i6, i5 - left, i6 - top);
        }
    }

    private void s(int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean u(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.r.abortAnimation();
            J(0);
            return false;
        }
        this.r.startScroll(left, top, i5, i6, l(this.t, i5, i6, i3, i4));
        J(2);
        return true;
    }

    private int x(int i, int i2) {
        int i3;
        if (i < this.v.getLeft() + this.o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.v.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.v.getRight() - this.o) {
            i3 |= 2;
        }
        if (i2 > this.v.getBottom() - this.o) {
            return i3 | 8;
        }
        return i3;
    }

    public boolean A(int i, int i2) {
        return D(this.t, i, i2);
    }

    public boolean B(int i) {
        if (((1 << i) & this.k) != 0) {
            return true;
        }
        return false;
    }

    public boolean D(View view, int i, int i2) {
        if (view == null || i < view.getLeft() || i >= view.getRight() || i2 < view.getTop() || i2 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r9.c == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
        F();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(@androidx.annotation.NonNull android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzb.E(android.view.MotionEvent):void");
    }

    void J(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.j(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public void K(int i) {
        this.o = i;
    }

    public boolean L(int i, int i2) {
        if (this.u) {
            return u(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzb.M(android.view.MotionEvent):boolean");
    }

    public boolean N(@NonNull View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean u = u(i, i2, 0, 0);
        if (!u && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return u;
    }

    boolean O(View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view != null && this.s.m(view, i)) {
            this.c = i;
            b(view, i);
            return true;
        }
        return false;
    }

    public void a() {
        this.c = -1;
        i();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(@NonNull View view, int i) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i;
            this.s.i(view, i);
            J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean d(int i) {
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i, int i2) {
        boolean z;
        boolean z2;
        if (!B(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (z && z2) {
            int i3 = this.b;
            if ((f * f) + (f2 * f2) <= i3 * i3) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L6a
            android.widget.OverScroller r0 = r11.r
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.r
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.r
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.t
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.t
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L2f
            android.view.View r4 = r11.t
            defpackage.syb.e0(r4, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r4 = r11.t
            defpackage.syb.f0(r4, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L43
        L3a:
            bzb$c r4 = r11.s
            android.view.View r5 = r11.t
            r6 = r3
            r7 = r10
            r4.k(r5, r6, r7, r8, r9)
        L43:
            if (r0 == 0) goto L5b
            android.widget.OverScroller r4 = r11.r
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L5b
            android.widget.OverScroller r3 = r11.r
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L5b
            android.widget.OverScroller r0 = r11.r
            r0.abortAnimation()
            goto L5d
        L5b:
            if (r0 != 0) goto L6a
        L5d:
            if (r12 == 0) goto L67
            android.view.ViewGroup r12 = r11.v
            java.lang.Runnable r0 = r11.w
            r12.post(r0)
            goto L6a
        L67:
            r11.J(r1)
        L6a:
            int r12 = r11.a
            if (r12 != r2) goto L6f
            r1 = 1
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzb.m(boolean):boolean");
    }

    public View t(int i, int i2) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.v.getChildAt(this.s.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int v() {
        return this.p;
    }

    public int w() {
        return this.o;
    }

    public int y() {
        return this.b;
    }

    public int z() {
        return this.a;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: bzb$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(@NonNull View view, int i, int i2);

        public abstract int b(@NonNull View view, int i, int i2);

        public int d(@NonNull View view) {
            return 0;
        }

        public int e(@NonNull View view) {
            return 0;
        }

        public boolean g(int i) {
            return false;
        }

        public abstract void j(int i);

        public abstract void k(@NonNull View view, int i, int i2, int i3, int i4);

        public abstract void l(@NonNull View view, float f, float f2);

        public abstract boolean m(@NonNull View view, int i);

        public int c(int i) {
            return i;
        }

        public void f(int i, int i2) {
        }

        public void h(int i, int i2) {
        }

        public void i(@NonNull View view, int i) {
        }
    }
}
