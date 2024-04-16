package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    private BitSet B;
    private boolean S4;
    private boolean T4;
    private SavedState U4;
    private int V4;
    private int[] a5;
    d[] t;
    @NonNull
    m u;
    @NonNull
    m v;
    private int w;
    private int x;
    @NonNull
    private final i y;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int I = -1;
    int X = Integer.MIN_VALUE;
    LazySpanLookup Y = new LazySpanLookup();
    private int Z = 2;
    private final Rect W4 = new Rect();
    private final b X4 = new b();
    private boolean Y4 = false;
    private boolean Z4 = true;
    private final Runnable b5 = new a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List<LazySpanLookup.FullSpanItem> g;
        boolean h;
        boolean i;
        boolean j;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.a2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            c();
        }

        void a() {
            int m;
            if (this.c) {
                m = StaggeredGridLayoutManager.this.u.i();
            } else {
                m = StaggeredGridLayoutManager.this.u.m();
            }
            this.b = m;
        }

        void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].r(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {
        d e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        d(int i) {
            this.e = i;
        }

        void a(View view) {
            c p = p(view);
            p.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (p.c() || p.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void b(boolean z, int i) {
            int r;
            if (z) {
                r = n(Integer.MIN_VALUE);
            } else {
                r = r(Integer.MIN_VALUE);
            }
            e();
            if (r == Integer.MIN_VALUE) {
                return;
            }
            if (!z || r >= StaggeredGridLayoutManager.this.u.i()) {
                if (!z && r > StaggeredGridLayoutManager.this.u.m()) {
                    return;
                }
                if (i != Integer.MIN_VALUE) {
                    r += i;
                }
                this.c = r;
                this.b = r;
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c p = p(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (p.f && (f = StaggeredGridLayoutManager.this.Y.f(p.a())) != null && f.b == 1) {
                this.c += f.a(this.e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.a.get(0);
            c p = p(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (p.f && (f = StaggeredGridLayoutManager.this.Y.f(p.a())) != null && f.b == -1) {
                this.b -= f.a(this.e);
            }
        }

        void e() {
            this.a.clear();
            s();
            this.d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return j(this.a.size() - 1, -1, true);
            }
            return j(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return k(this.a.size() - 1, -1, false);
            }
            return k(0, this.a.size(), false);
        }

        public int h() {
            if (StaggeredGridLayoutManager.this.z) {
                return j(0, this.a.size(), true);
            }
            return j(this.a.size() - 1, -1, true);
        }

        int i(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int m = StaggeredGridLayoutManager.this.u.m();
            int i4 = StaggeredGridLayoutManager.this.u.i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z5 = false;
                if (!z3 ? g < i4 : g <= i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3 ? d > m : d >= m) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z && z2) {
                        if (g >= m && d <= i4) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.n0(view);
                    } else {
                        if (g < m || d > i4) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        int j(int i, int i2, boolean z) {
            return i(i, i2, false, false, z);
        }

        int k(int i, int i2, boolean z) {
            return i(i, i2, z, true, false);
        }

        public int l() {
            return this.d;
        }

        int m() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        int n(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View o(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.n0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.n0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.n0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.n0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c p(View view) {
            return (c) view.getLayoutParams();
        }

        int q() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        int r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        void s() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        void t(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        void u() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c p = p(remove);
            p.e = null;
            if (p.c() || p.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        void v() {
            View remove = this.a.remove(0);
            c p = p(remove);
            p.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (p.c() || p.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        void w(View view) {
            c p = p(view);
            p.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (p.c() || p.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void x(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d o0 = RecyclerView.p.o0(context, attributeSet, i, i2);
        Q2(o0.a);
        S2(o0.b);
        R2(o0.c);
        this.y = new i();
        i2();
    }

    private void D2(View view, int i, int i2, boolean z) {
        boolean N1;
        t(view, this.W4);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.W4;
        int a3 = a3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.W4;
        int a32 = a3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            N1 = P1(view, a3, a32, cVar);
        } else {
            N1 = N1(view, a3, a32, cVar);
        }
        if (N1) {
            view.measure(a3, a32);
        }
    }

    private void E2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                D2(view, this.V4, RecyclerView.p.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
            } else {
                D2(view, RecyclerView.p.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.V4, z);
            }
        } else if (this.w == 1) {
            D2(view, RecyclerView.p.U(this.x, v0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            D2(view, RecyclerView.p.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.U(this.x, h0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
        if (a2() != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean G2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.w == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.A) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.A) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != C2()) {
            return false;
        }
        return true;
    }

    private void I2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].w(view);
        }
    }

    private void J2(RecyclerView.w wVar, i iVar) {
        int min;
        int min2;
        if (iVar.a && !iVar.i) {
            if (iVar.b == 0) {
                if (iVar.e == -1) {
                    K2(wVar, iVar.g);
                } else {
                    L2(wVar, iVar.f);
                }
            } else if (iVar.e == -1) {
                int i = iVar.f;
                int v2 = i - v2(i);
                if (v2 < 0) {
                    min2 = iVar.g;
                } else {
                    min2 = iVar.g - Math.min(v2, iVar.b);
                }
                K2(wVar, min2);
            } else {
                int w2 = w2(iVar.g) - iVar.g;
                if (w2 < 0) {
                    min = iVar.f;
                } else {
                    min = Math.min(w2, iVar.b) + iVar.f;
                }
                L2(wVar, min);
            }
        }
    }

    private void K2(RecyclerView.w wVar, int i) {
        for (int T = T() - 1; T >= 0; T--) {
            View S = S(T);
            if (this.u.g(S) >= i && this.u.q(S) >= i) {
                c cVar = (c) S.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].u();
                    }
                } else if (cVar.e.a.size() == 1) {
                    return;
                } else {
                    cVar.e.u();
                }
                u1(S, wVar);
            } else {
                return;
            }
        }
    }

    private void L2(RecyclerView.w wVar, int i) {
        while (T() > 0) {
            View S = S(0);
            if (this.u.d(S) <= i && this.u.p(S) <= i) {
                c cVar = (c) S.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].v();
                    }
                } else if (cVar.e.a.size() == 1) {
                    return;
                } else {
                    cVar.e.v();
                }
                u1(S, wVar);
            } else {
                return;
            }
        }
    }

    private void M2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        int T = T();
        float f = 0.0f;
        for (int i = 0; i < T; i++) {
            View S = S(i);
            float e = this.v.e(S);
            if (e >= f) {
                if (((c) S.getLayoutParams()).e()) {
                    e = (e * 1.0f) / this.s;
                }
                f = Math.max(f, e);
            }
        }
        int i2 = this.x;
        int round = Math.round(f * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        Y2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < T; i3++) {
            View S2 = S(i3);
            c cVar = (c) S2.getLayoutParams();
            if (!cVar.f) {
                if (C2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    S2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        S2.offsetLeftAndRight(i7 - i8);
                    } else {
                        S2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    private void N2() {
        if (this.w != 1 && C2()) {
            this.A = !this.z;
        } else {
            this.A = this.z;
        }
    }

    private void P2(int i) {
        boolean z;
        i iVar = this.y;
        iVar.e = i;
        boolean z2 = this.A;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        iVar.d = i2;
    }

    private void T2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                Z2(this.t[i3], i, i2);
            }
        }
    }

    private void U1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private boolean U2(RecyclerView.a0 a0Var, b bVar) {
        int k2;
        if (this.S4) {
            k2 = p2(a0Var.b());
        } else {
            k2 = k2(a0Var.b());
        }
        bVar.a = k2;
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    private void V1(b bVar) {
        int m;
        SavedState savedState = this.U4;
        int i = savedState.c;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    SavedState savedState2 = this.U4;
                    int i3 = savedState2.d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.i) {
                            m = this.u.i();
                        } else {
                            m = this.u.m();
                        }
                        i3 += m;
                    }
                    this.t[i2].x(i3);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.U4;
                savedState3.a = savedState3.b;
            }
        }
        SavedState savedState4 = this.U4;
        this.T4 = savedState4.j;
        R2(savedState4.h);
        N2();
        SavedState savedState5 = this.U4;
        int i4 = savedState5.a;
        if (i4 != -1) {
            this.I = i4;
            bVar.c = savedState5.i;
        } else {
            bVar.c = this.A;
        }
        if (savedState5.e > 1) {
            LazySpanLookup lazySpanLookup = this.Y;
            lazySpanLookup.a = savedState5.f;
            lazySpanLookup.b = savedState5.g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.y
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.E0()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.m r5 = r4.u
            int r5 = r5.n()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.m r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.W()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.i r0 = r4.y
            androidx.recyclerview.widget.m r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.i r6 = r4.y
            androidx.recyclerview.widget.m r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.i r0 = r4.y
            androidx.recyclerview.widget.m r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.i r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5e:
            androidx.recyclerview.widget.i r5 = r4.y
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.m r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.m r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void Y1(View view, c cVar, i iVar) {
        if (iVar.e == 1) {
            if (cVar.f) {
                U1(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            I2(view);
        } else {
            cVar.e.w(view);
        }
    }

    private int Z1(int i) {
        boolean z;
        if (T() == 0) {
            if (!this.A) {
                return -1;
            }
            return 1;
        }
        if (i < s2()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.A) {
            return -1;
        }
        return 1;
    }

    private void Z2(d dVar, int i, int i2) {
        int l = dVar.l();
        if (i == -1) {
            if (dVar.q() + l <= i2) {
                this.B.set(dVar.e, false);
            }
        } else if (dVar.m() - l >= i2) {
            this.B.set(dVar.e, false);
        }
    }

    private int a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    private boolean b2(d dVar) {
        if (this.A) {
            if (dVar.m() < this.u.i()) {
                ArrayList<View> arrayList = dVar.a;
                return !dVar.p(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (dVar.q() > this.u.m()) {
            return !dVar.p(dVar.a.get(0)).f;
        }
        return false;
    }

    private int c2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return p.a(a0Var, this.u, m2(!this.Z4), l2(!this.Z4), this, this.Z4);
    }

    private int d2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return p.b(a0Var, this.u, m2(!this.Z4), l2(!this.Z4), this, this.Z4, this.A);
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return p.c(a0Var, this.u, m2(!this.Z4), l2(!this.Z4), this, this.Z4);
    }

    private int f2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.w != 1 && C2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.w == 1 || !C2()) {
            return -1;
        } else {
            return 1;
        }
    }

    private LazySpanLookup.FullSpanItem g2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.c[i2] = i - this.t[i2].n(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem h2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.c[i2] = this.t[i2].r(i) - i;
        }
        return fullSpanItem;
    }

    private void i2() {
        this.u = m.b(this, this.w);
        this.v = m.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int j2(RecyclerView.w wVar, i iVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int m;
        int u2;
        boolean z;
        d dVar;
        int r;
        int e;
        int i3;
        int m2;
        int i4;
        int e2;
        int i5;
        boolean X1;
        int n;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            if (iVar.e == 1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else {
            if (iVar.e == 1) {
                i = iVar.g + iVar.b;
            } else {
                i = iVar.f - iVar.b;
            }
            i2 = i;
        }
        T2(iVar.e, i2);
        if (this.A) {
            m = this.u.i();
        } else {
            m = this.u.m();
        }
        int i6 = m;
        boolean z2 = false;
        while (iVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View b2 = iVar.b(wVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.Y.g(a2);
            if (g == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (cVar.f) {
                    dVar = this.t[r9];
                } else {
                    dVar = y2(iVar);
                }
                this.Y.n(a2, dVar);
            } else {
                dVar = this.t[g];
            }
            d dVar2 = dVar;
            cVar.e = dVar2;
            if (iVar.e == 1) {
                n(b2);
            } else {
                o(b2, r9);
            }
            E2(b2, cVar, r9);
            if (iVar.e == 1) {
                if (cVar.f) {
                    n = u2(i6);
                } else {
                    n = dVar2.n(i6);
                }
                int e3 = this.u.e(b2) + n;
                if (z && cVar.f) {
                    LazySpanLookup.FullSpanItem g2 = g2(n);
                    g2.b = -1;
                    g2.a = a2;
                    this.Y.a(g2);
                }
                i3 = e3;
                e = n;
            } else {
                if (cVar.f) {
                    r = x2(i6);
                } else {
                    r = dVar2.r(i6);
                }
                e = r - this.u.e(b2);
                if (z && cVar.f) {
                    LazySpanLookup.FullSpanItem h2 = h2(r);
                    h2.b = 1;
                    h2.a = a2;
                    this.Y.a(h2);
                }
                i3 = r;
            }
            if (cVar.f && iVar.d == -1) {
                if (z) {
                    this.Y4 = true;
                } else {
                    if (iVar.e == 1) {
                        X1 = W1();
                    } else {
                        X1 = X1();
                    }
                    if (!X1) {
                        LazySpanLookup.FullSpanItem f = this.Y.f(a2);
                        if (f != null) {
                            f.d = true;
                        }
                        this.Y4 = true;
                    }
                }
            }
            Y1(b2, cVar, iVar);
            if (C2() && this.w == 1) {
                if (cVar.f) {
                    i5 = this.v.i();
                } else {
                    i5 = this.v.i() - (((this.s - 1) - dVar2.e) * this.x);
                }
                e2 = i5;
                i4 = i5 - this.v.e(b2);
            } else {
                if (cVar.f) {
                    m2 = this.v.m();
                } else {
                    m2 = (dVar2.e * this.x) + this.v.m();
                }
                i4 = m2;
                e2 = this.v.e(b2) + m2;
            }
            if (this.w == 1) {
                G0(b2, i4, e, e2, i3);
            } else {
                G0(b2, e, i4, i3, e2);
            }
            if (cVar.f) {
                T2(this.y.e, i2);
            } else {
                Z2(dVar2, this.y.e, i2);
            }
            J2(wVar, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    this.B.set(dVar2.e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            J2(wVar, this.y);
        }
        if (this.y.e == -1) {
            u2 = this.u.m() - x2(this.u.m());
        } else {
            u2 = u2(this.u.i()) - this.u.i();
        }
        if (u2 > 0) {
            return Math.min(iVar.b, u2);
        }
        return 0;
    }

    private int k2(int i) {
        int T = T();
        for (int i2 = 0; i2 < T; i2++) {
            int n0 = n0(S(i2));
            if (n0 >= 0 && n0 < i) {
                return n0;
            }
        }
        return 0;
    }

    private int p2(int i) {
        for (int T = T() - 1; T >= 0; T--) {
            int n0 = n0(S(T));
            if (n0 >= 0 && n0 < i) {
                return n0;
            }
        }
        return 0;
    }

    private void q2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        int u2 = u2(Integer.MIN_VALUE);
        if (u2 != Integer.MIN_VALUE && (i = this.u.i() - u2) > 0) {
            int i2 = i - (-O2(-i, wVar, a0Var));
            if (z && i2 > 0) {
                this.u.r(i2);
            }
        }
    }

    private void r2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int x2 = x2(Integer.MAX_VALUE);
        if (x2 != Integer.MAX_VALUE && (m = x2 - this.u.m()) > 0) {
            int O2 = m - O2(m, wVar, a0Var);
            if (z && O2 > 0) {
                this.u.r(-O2);
            }
        }
    }

    private int u2(int i) {
        int n = this.t[0].n(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int n2 = this.t[i2].n(i);
            if (n2 > n) {
                n = n2;
            }
        }
        return n;
    }

    private int v2(int i) {
        int r = this.t[0].r(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int r2 = this.t[i2].r(i);
            if (r2 > r) {
                r = r2;
            }
        }
        return r;
    }

    private int w2(int i) {
        int n = this.t[0].n(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int n2 = this.t[i2].n(i);
            if (n2 < n) {
                n = n2;
            }
        }
        return n;
    }

    private int x2(int i) {
        int r = this.t[0].r(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int r2 = this.t[i2].r(i);
            if (r2 < r) {
                r = r2;
            }
        }
        return r;
    }

    private d y2(i iVar) {
        int i;
        int i2;
        int i3;
        if (G2(iVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        d dVar = null;
        if (iVar.e == 1) {
            int m = this.u.m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                d dVar2 = this.t[i2];
                int n = dVar2.n(m);
                if (n < i4) {
                    dVar = dVar2;
                    i4 = n;
                }
                i2 += i3;
            }
            return dVar;
        }
        int i5 = this.u.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            d dVar3 = this.t[i2];
            int r = dVar3.r(i5);
            if (r > i6) {
                dVar = dVar3;
                i6 = r;
            }
            i2 += i3;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.t2()
            goto Ld
        L9:
            int r0 = r6.s2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.Y
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.Y
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.Y
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.Y
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.Y
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.s2()
            goto L52
        L4e:
            int r7 = r6.t2()
        L52:
            if (r3 > r7) goto L57
            r6.B1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.z2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View A2() {
        /*
            r12 = this;
            int r0 = r12.T()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.C2()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.S(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r9 = r12.b2(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.S(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.m r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.m r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.m r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.m r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    public void B2() {
        this.Y.b();
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    boolean C2() {
        if (j0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return O2(i, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i) {
        SavedState savedState = this.U4;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.I = i;
        this.X = Integer.MIN_VALUE;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return O2(i, wVar, a0Var);
    }

    void H2(int i, RecyclerView.a0 a0Var) {
        int s2;
        int i2;
        if (i > 0) {
            s2 = t2();
            i2 = 1;
        } else {
            s2 = s2();
            i2 = -1;
        }
        this.y.a = true;
        X2(s2, a0Var);
        P2(i2);
        i iVar = this.y;
        iVar.c = s2 + iVar.d;
        iVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(int i) {
        super.J0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].t(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(int i) {
        super.K0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].t(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(Rect rect, int i, int i2) {
        int x;
        int x2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.w == 1) {
            x2 = RecyclerView.p.x(i2, rect.height() + paddingTop, l0());
            x = RecyclerView.p.x(i, (this.x * this.s) + paddingLeft, m0());
        } else {
            x = RecyclerView.p.x(i, rect.width() + paddingLeft, m0());
            x2 = RecyclerView.p.x(i2, (this.x * this.s) + paddingTop, l0());
        }
        J1(x, x2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.Y.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int O2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i == 0) {
            return 0;
        }
        H2(i, a0Var);
        int j2 = j2(wVar, this.y, a0Var);
        if (this.y.b >= j2) {
            if (i < 0) {
                i = -j2;
            } else {
                i = j2;
            }
        }
        this.u.r(-i);
        this.S4 = this.A;
        i iVar = this.y;
        iVar.b = 0;
        J2(wVar, iVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        w1(this.b5);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Q0(View view, int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        View L;
        int s2;
        boolean z;
        boolean z2;
        int h;
        int h2;
        int h3;
        View o;
        if (T() == 0 || (L = L(view)) == null) {
            return null;
        }
        N2();
        int f2 = f2(i);
        if (f2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) L.getLayoutParams();
        boolean z3 = cVar.f;
        d dVar = cVar.e;
        if (f2 == 1) {
            s2 = t2();
        } else {
            s2 = s2();
        }
        X2(s2, a0Var);
        P2(f2);
        i iVar = this.y;
        iVar.c = iVar.d + s2;
        iVar.b = (int) (this.u.n() * 0.33333334f);
        i iVar2 = this.y;
        iVar2.h = true;
        iVar2.a = false;
        j2(wVar, iVar2, a0Var);
        this.S4 = this.A;
        if (!z3 && (o = dVar.o(s2, f2)) != null && o != L) {
            return o;
        }
        if (G2(f2)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View o2 = this.t[i2].o(s2, f2);
                if (o2 != null && o2 != L) {
                    return o2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View o3 = this.t[i3].o(s2, f2);
                if (o3 != null && o3 != L) {
                    return o3;
                }
            }
        }
        boolean z4 = !this.z;
        if (f2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                h3 = dVar.f();
            } else {
                h3 = dVar.h();
            }
            View M = M(h3);
            if (M != null && M != L) {
                return M;
            }
        }
        if (G2(f2)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != dVar.e) {
                    if (z2) {
                        h2 = this.t[i4].f();
                    } else {
                        h2 = this.t[i4].h();
                    }
                    View M2 = M(h2);
                    if (M2 != null && M2 != L) {
                        return M2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                if (z2) {
                    h = this.t[i5].f();
                } else {
                    h = this.t[i5].h();
                }
                View M3 = M(h);
                if (M3 != null && M3 != L) {
                    return M3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        R1(jVar);
    }

    public void Q2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        q(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        m mVar = this.u;
        this.u = this.v;
        this.v = mVar;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            View m2 = m2(false);
            View l2 = l2(false);
            if (m2 != null && l2 != null) {
                int n0 = n0(m2);
                int n02 = n0(l2);
                if (n0 < n02) {
                    accessibilityEvent.setFromIndex(n0);
                    accessibilityEvent.setToIndex(n02);
                    return;
                }
                accessibilityEvent.setFromIndex(n02);
                accessibilityEvent.setToIndex(n0);
            }
        }
    }

    public void R2(boolean z) {
        q(null);
        SavedState savedState = this.U4;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.z = z;
        B1();
    }

    public void S2(int i) {
        q(null);
        if (i != this.s) {
            B2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        if (this.U4 == null) {
            return true;
        }
        return false;
    }

    boolean V2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int s2;
        int m;
        boolean z = false;
        if (!a0Var.e() && (i = this.I) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                SavedState savedState = this.U4;
                if (savedState != null && savedState.a != -1 && savedState.c >= 1) {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.I;
                } else {
                    View M = M(this.I);
                    if (M != null) {
                        if (this.A) {
                            s2 = t2();
                        } else {
                            s2 = s2();
                        }
                        bVar.a = s2;
                        if (this.X != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.X) - this.u.d(M);
                            } else {
                                bVar.b = (this.u.m() + this.X) - this.u.g(M);
                            }
                            return true;
                        } else if (this.u.e(M) > this.u.n()) {
                            if (bVar.c) {
                                m = this.u.i();
                            } else {
                                m = this.u.m();
                            }
                            bVar.b = m;
                            return true;
                        } else {
                            int g = this.u.g(M) - this.u.m();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i2 = this.u.i() - this.u.d(M);
                            if (i2 < 0) {
                                bVar.b = i2;
                                return true;
                            }
                            bVar.b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i3 = this.I;
                        bVar.a = i3;
                        int i4 = this.X;
                        if (i4 == Integer.MIN_VALUE) {
                            if (Z1(i3) == 1) {
                                z = true;
                            }
                            bVar.c = z;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                }
                return true;
            }
            this.I = -1;
            this.X = Integer.MIN_VALUE;
        }
        return false;
    }

    boolean W1() {
        int n = this.t[0].n(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].n(Integer.MIN_VALUE) != n) {
                return false;
            }
        }
        return true;
    }

    void W2(RecyclerView.a0 a0Var, b bVar) {
        if (V2(a0Var, bVar) || U2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    boolean X1() {
        int r = this.t[0].r(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].r(Integer.MIN_VALUE) != r) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i, int i2) {
        z2(i, i2, 1);
    }

    void Y2(int i) {
        this.x = i / this.s;
        this.V4 = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView) {
        this.Y.b();
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int Z1 = Z1(i);
        PointF pointF = new PointF();
        if (Z1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = Z1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = Z1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i, int i2, int i3) {
        z2(i, i2, 8);
    }

    boolean a2() {
        int s2;
        int t2;
        int i;
        if (T() == 0 || this.Z == 0 || !x0()) {
            return false;
        }
        if (this.A) {
            s2 = t2();
            t2 = s2();
        } else {
            s2 = s2();
            t2 = t2();
        }
        if (s2 == 0 && A2() != null) {
            this.Y.b();
            C1();
            B1();
            return true;
        } else if (!this.Y4) {
            return false;
        } else {
            if (this.A) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = t2 + 1;
            LazySpanLookup.FullSpanItem e = this.Y.e(s2, i2, i, true);
            if (e == null) {
                this.Y4 = false;
                this.Y.d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.Y.e(s2, e.a, i * (-1), true);
            if (e2 == null) {
                this.Y.d(e.a);
            } else {
                this.Y.d(e2.a + 1);
            }
            C1();
            B1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i, int i2) {
        z2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        z2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        F2(wVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.I = -1;
        this.X = Integer.MIN_VALUE;
        this.U4 = null;
        this.X4.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.U4 = savedState;
            if (this.I != -1) {
                savedState.a();
                this.U4.b();
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        int s2;
        int r;
        int m;
        int[] iArr;
        if (this.U4 != null) {
            return new SavedState(this.U4);
        }
        SavedState savedState = new SavedState();
        savedState.h = this.z;
        savedState.i = this.S4;
        savedState.j = this.T4;
        LazySpanLookup lazySpanLookup = this.Y;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.a) != null) {
            savedState.f = iArr;
            savedState.e = iArr.length;
            savedState.g = lazySpanLookup.b;
        } else {
            savedState.e = 0;
        }
        if (T() > 0) {
            if (this.S4) {
                s2 = t2();
            } else {
                s2 = s2();
            }
            savedState.a = s2;
            savedState.b = n2();
            int i = this.s;
            savedState.c = i;
            savedState.d = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.S4) {
                    r = this.t[i2].n(Integer.MIN_VALUE);
                    if (r != Integer.MIN_VALUE) {
                        m = this.u.i();
                        r -= m;
                        savedState.d[i2] = r;
                    } else {
                        savedState.d[i2] = r;
                    }
                } else {
                    r = this.t[i2].r(Integer.MIN_VALUE);
                    if (r != Integer.MIN_VALUE) {
                        m = this.u.m();
                        r -= m;
                        savedState.d[i2] = r;
                    } else {
                        savedState.d[i2] = r;
                    }
                }
            }
        } else {
            savedState.a = -1;
            savedState.b = -1;
            savedState.c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l1(int i) {
        if (i == 0) {
            a2();
        }
    }

    View l2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int T = T() - 1; T >= 0; T--) {
            View S = S(T);
            int g = this.u.g(S);
            int d2 = this.u.d(S);
            if (d2 > m && g < i) {
                if (d2 > i && z) {
                    if (view == null) {
                        view = S;
                    }
                } else {
                    return S;
                }
            }
        }
        return view;
    }

    View m2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int T = T();
        View view = null;
        for (int i2 = 0; i2 < T; i2++) {
            View S = S(i2);
            int g = this.u.g(S);
            if (this.u.d(S) > m && g < i) {
                if (g < m && z) {
                    if (view == null) {
                        view = S;
                    }
                } else {
                    return S;
                }
            }
        }
        return view;
    }

    int n2() {
        View m2;
        if (this.A) {
            m2 = l2(true);
        } else {
            m2 = m2(true);
        }
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    public int[] o2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].g();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(String str) {
        if (this.U4 == null) {
            super.q(str);
        }
    }

    int s2() {
        if (T() == 0) {
            return 0;
        }
        return n0(S(0));
    }

    int t2() {
        int T = T();
        if (T == 0) {
            return 0;
        }
        return n0(S(T - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        if (this.w == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        if (this.w == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int n;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (T() != 0 && i != 0) {
            H2(i, a0Var);
            int[] iArr = this.a5;
            if (iArr == null || iArr.length < this.s) {
                this.a5 = new int[this.s];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.s; i5++) {
                i iVar = this.y;
                if (iVar.d == -1) {
                    n = iVar.f;
                    i3 = this.t[i5].r(n);
                } else {
                    n = this.t[i5].n(iVar.g);
                    i3 = this.y.g;
                }
                int i6 = n - i3;
                if (i6 >= 0) {
                    this.a5[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.a5, 0, i4);
            for (int i7 = 0; i7 < i4 && this.y.a(a0Var); i7++) {
                cVar.a(this.y.c, this.a5[i7]);
                i iVar2 = this.y;
                iVar2.c += iVar2.d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        if (this.Z != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        int[] a;
        List<FullSpanItem> b;

        LazySpanLookup() {
        }

        private int i(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (this.b.get(i2).a >= i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.b.remove(i2);
            return this.b.get(i2).a;
        }

        private void l(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i3 = fullSpanItem.a;
                if (i3 >= i) {
                    fullSpanItem.a = i3 + i2;
                }
            }
        }

        private void m(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i4 = fullSpanItem.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.a = i4 - i2;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.b.get(i);
                if (fullSpanItem2.a == fullSpanItem.a) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.a >= fullSpanItem.a) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.b.get(i4);
                int i5 = fullSpanItem.a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.b == i3 || (z && fullSpanItem.d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int min = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, min, -1);
            return min;
        }

        void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                l(i, i2);
            }
        }

        void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m(i, i2);
            }
        }

        void n(int i, d dVar) {
            c(i);
            this.a[i] = dVar.e;
        }

        int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            int a;
            int b;
            int[] c;
            boolean d;

            /* loaded from: classes.dex */
            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                this.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i) {
                int[] iArr = this.c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                    return;
                }
                parcel.writeInt(0);
            }

            FullSpanItem() {
            }
        }
    }
}
