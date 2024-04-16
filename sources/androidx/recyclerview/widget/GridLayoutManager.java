package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.d4;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean U4;
    int V4;
    int[] W4;
    View[] X4;
    final SparseIntArray Y4;
    final SparseIntArray Z4;
    c a5;
    final Rect b5;
    private boolean c5;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {
        int e;
        int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }

        int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.b.put(i, d);
            return d;
        }

        int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.f(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.U4 = false;
        this.V4 = -1;
        this.Y4 = new SparseIntArray();
        this.Z4 = new SparseIntArray();
        this.a5 = new a();
        this.b5 = new Rect();
        l3(RecyclerView.p.o0(context, attributeSet, i, i2).b);
    }

    private void U2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.X4[i2];
            b bVar = (b) view.getLayoutParams();
            int h3 = h3(wVar, a0Var, n0(view));
            bVar.f = h3;
            bVar.e = i5;
            i5 += h3;
            i2 += i4;
        }
    }

    private void V2() {
        int T = T();
        for (int i = 0; i < T; i++) {
            b bVar = (b) S(i).getLayoutParams();
            int a2 = bVar.a();
            this.Y4.put(a2, bVar.f());
            this.Z4.put(a2, bVar.e());
        }
    }

    private void W2(int i) {
        this.W4 = X2(this.W4, this.V4, i);
    }

    static int[] X2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void Y2() {
        this.Y4.clear();
        this.Z4.clear();
    }

    private int Z2(RecyclerView.a0 a0Var) {
        int max;
        if (T() != 0 && a0Var.b() != 0) {
            b2();
            boolean x2 = x2();
            View g2 = g2(!x2, true);
            View f2 = f2(!x2, true);
            if (g2 != null && f2 != null) {
                int b2 = this.a5.b(n0(g2), this.V4);
                int b3 = this.a5.b(n0(f2), this.V4);
                int min = Math.min(b2, b3);
                int max2 = Math.max(b2, b3);
                int b4 = this.a5.b(a0Var.b() - 1, this.V4) + 1;
                if (this.x) {
                    max = Math.max(0, (b4 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!x2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.u.d(f2) - this.u.g(g2)) / ((this.a5.b(n0(f2), this.V4) - this.a5.b(n0(g2), this.V4)) + 1))) + (this.u.m() - this.u.g(g2)));
            }
        }
        return 0;
    }

    private int a3(RecyclerView.a0 a0Var) {
        if (T() != 0 && a0Var.b() != 0) {
            b2();
            View g2 = g2(!x2(), true);
            View f2 = f2(!x2(), true);
            if (g2 != null && f2 != null) {
                if (!x2()) {
                    return this.a5.b(a0Var.b() - 1, this.V4) + 1;
                }
                int d = this.u.d(f2) - this.u.g(g2);
                int b2 = this.a5.b(n0(g2), this.V4);
                return (int) ((d / ((this.a5.b(n0(f2), this.V4) - b2) + 1)) * (this.a5.b(a0Var.b() - 1, this.V4) + 1));
            }
        }
        return 0;
    }

    private void b3(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int g3 = g3(wVar, a0Var, aVar.b);
        if (z) {
            while (g3 > 0) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    g3 = g3(wVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = a0Var.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int g32 = g3(wVar, a0Var, i5);
            if (g32 <= g3) {
                break;
            }
            i4 = i5;
            g3 = g32;
        }
        aVar.b = i4;
    }

    private void c3() {
        View[] viewArr = this.X4;
        if (viewArr == null || viewArr.length != this.V4) {
            this.X4 = new View[this.V4];
        }
    }

    private int f3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.a5.b(i, this.V4);
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.a5.b(f, this.V4);
    }

    private int g3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.a5.c(i, this.V4);
        }
        int i2 = this.Z4.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.a5.c(f, this.V4);
    }

    private int h3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.a5.f(i);
        }
        int i2 = this.Y4.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.a5.f(f);
    }

    private void i3(float f, int i) {
        W2(Math.max(Math.round(f * this.V4), i));
    }

    private void j3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int d3 = d3(bVar.e, bVar.f);
        if (this.s == 1) {
            i3 = RecyclerView.p.U(d3, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.p.U(this.u.n(), h0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int U = RecyclerView.p.U(d3, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int U2 = RecyclerView.p.U(this.u.n(), v0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = U;
            i3 = U2;
        }
        k3(view, i3, i2, z);
    }

    private void k3(View view, int i, int i2, boolean z) {
        boolean N1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z) {
            N1 = P1(view, i, i2, qVar);
        } else {
            N1 = N1(view, i, i2, qVar);
        }
        if (N1) {
            view.measure(i, i2);
        }
    }

    private void n3() {
        int g0;
        int paddingTop;
        if (v2() == 1) {
            g0 = u0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            g0 = g0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        W2(g0 - paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A2(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.A2(wVar, a0Var, aVar, i);
        n3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            b3(wVar, a0Var, aVar, i);
        }
        c3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        if (this.c5) {
            return Z2(a0Var);
        }
        return super.B(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        if (this.c5) {
            return a3(a0Var);
        }
        return super.C(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        if (this.c5) {
            return Z2(a0Var);
        }
        return super.E(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        n3();
        c3();
        return super.E1(i, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        if (this.c5) {
            return a3(a0Var);
        }
        return super.F(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        n3();
        c3();
        return super.G1(i, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(Rect rect, int i, int i2) {
        int x;
        int x2;
        if (this.W4 == null) {
            super.K1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.s == 1) {
            x2 = RecyclerView.p.x(i2, rect.height() + paddingTop, l0());
            int[] iArr = this.W4;
            x = RecyclerView.p.x(i, iArr[iArr.length - 1] + paddingLeft, m0());
        } else {
            x = RecyclerView.p.x(i, rect.width() + paddingLeft, m0());
            int[] iArr2 = this.W4;
            x2 = RecyclerView.p.x(i2, iArr2[iArr2.length - 1] + paddingTop, l0());
        }
        J1(x, x2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void L2(boolean z) {
        if (!z) {
            super.L2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
        if (r13 == r10) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View Q0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        if (this.X == null && !this.U4) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void V1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i = this.V4;
        for (int i2 = 0; i2 < this.V4 && cVar.c(a0Var) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.a5.f(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.a0 a0Var, View view, d4 d4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.V0(view, d4Var);
            return;
        }
        b bVar = (b) layoutParams;
        int f3 = f3(wVar, a0Var, bVar.a());
        if (this.s == 0) {
            d4Var.q0(d4.c.f(bVar.e(), bVar.f(), f3, 1, false, false));
        } else {
            d4Var.q0(d4.c.f(f3, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int X(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.V4;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return f3(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i, int i2) {
        this.a5.h();
        this.a5.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView) {
        this.a5.h();
        this.a5.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.a5.h();
        this.a5.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i, int i2) {
        this.a5.h();
        this.a5.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.a5.h();
        this.a5.g();
    }

    int d3(int i, int i2) {
        if (this.s == 1 && w2()) {
            int[] iArr = this.W4;
            int i3 = this.V4;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.W4;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            V2();
        }
        super.e1(wVar, a0Var);
        Y2();
    }

    public int e3() {
        return this.V4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.U4 = false;
    }

    public void l3(int i) {
        if (i == this.V4) {
            return;
        }
        this.U4 = true;
        if (i >= 1) {
            this.V4 = i;
            this.a5.h();
            B1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    public void m3(c cVar) {
        this.a5 = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View p2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int T = T();
        int i3 = 1;
        if (z2) {
            i2 = T() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = T;
            i2 = 0;
        }
        int b2 = a0Var.b();
        b2();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View S = S(i2);
            int n0 = n0(S);
            if (n0 >= 0 && n0 < b2 && g3(wVar, a0Var, n0) == 0) {
                if (((RecyclerView.q) S.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = S;
                    }
                } else if (this.u.g(S) < i4 && this.u.d(S) >= m) {
                    return S;
                } else {
                    if (view == null) {
                        view = S;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.V4;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return f3(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void y2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.y2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.U4 = false;
        this.V4 = -1;
        this.Y4 = new SparseIntArray();
        this.Z4 = new SparseIntArray();
        this.a5 = new a();
        this.b5 = new Rect();
        l3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.U4 = false;
        this.V4 = -1;
        this.Y4 = new SparseIntArray();
        this.Z4 = new SparseIntArray();
        this.a5 = new a();
        this.b5 = new Rect();
        l3(i);
    }
}
