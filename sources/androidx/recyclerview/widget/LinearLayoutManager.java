package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    int A;
    int B;
    private boolean I;
    private int S4;
    private int[] T4;
    SavedState X;
    final a Y;
    private final b Z;
    int s;
    private c t;
    m u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;
        boolean c;

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

        boolean a() {
            if (this.a >= 0) {
                return true;
            }
            return false;
        }

        void b() {
            this.a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        m a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            e();
        }

        void a() {
            int m;
            if (this.d) {
                m = this.a.i();
            } else {
                m = this.a.m();
            }
            this.c = m;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (!qVar.c() && qVar.a() >= 0 && qVar.a() < a0Var.b()) {
                return true;
            }
            return false;
        }

        void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int k;
        boolean m;
        boolean a = true;
        int h = 0;
        int i = 0;
        boolean j = false;
        List<RecyclerView.d0> l = null;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) f.getLayoutParams()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i = this.d;
            if (i >= 0 && i < a0Var.b()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View d(RecyclerView.w wVar) {
            if (this.l != null) {
                return e();
            }
            View o = wVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a = (qVar.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void B2(RecyclerView.w wVar, c cVar) {
        if (cVar.a && !cVar.m) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                D2(wVar, i, i2);
            } else {
                E2(wVar, i, i2);
            }
        }
    }

    private void C2(RecyclerView.w wVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                v1(i3, wVar);
            }
            return;
        }
        while (i > i2) {
            v1(i, wVar);
            i--;
        }
    }

    private void D2(RecyclerView.w wVar, int i, int i2) {
        int T = T();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < T; i3++) {
                View S = S(i3);
                if (this.u.g(S) < h || this.u.q(S) < h) {
                    C2(wVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = T - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View S2 = S(i5);
            if (this.u.g(S2) < h || this.u.q(S2) < h) {
                C2(wVar, i4, i5);
                return;
            }
        }
    }

    private void E2(RecyclerView.w wVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int T = T();
        if (this.x) {
            int i4 = T - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View S = S(i5);
                if (this.u.d(S) > i3 || this.u.p(S) > i3) {
                    C2(wVar, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < T; i6++) {
            View S2 = S(i6);
            if (this.u.d(S2) > i3 || this.u.p(S2) > i3) {
                C2(wVar, 0, i6);
                return;
            }
        }
    }

    private void G2() {
        if (this.s != 1 && w2()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    private boolean M2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        View p2;
        boolean z;
        boolean z2 = false;
        if (T() == 0) {
            return false;
        }
        View f0 = f0();
        if (f0 != null && aVar.d(f0, a0Var)) {
            aVar.c(f0, n0(f0));
            return true;
        }
        boolean z3 = this.v;
        boolean z4 = this.y;
        if (z3 != z4 || (p2 = p2(wVar, a0Var, aVar.d, z4)) == null) {
            return false;
        }
        aVar.b(p2, n0(p2));
        if (!a0Var.e() && T1()) {
            int g = this.u.g(p2);
            int d = this.u.d(p2);
            int m = this.u.m();
            int i = this.u.i();
            if (d <= m && g < m) {
                z = true;
            } else {
                z = false;
            }
            if (g >= i && d > i) {
                z2 = true;
            }
            if (z || z2) {
                if (aVar.d) {
                    m = i;
                }
                aVar.c = m;
            }
        }
        return true;
    }

    private boolean N2(RecyclerView.a0 a0Var, a aVar) {
        int i;
        boolean z;
        int g;
        boolean z2 = false;
        if (!a0Var.e() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                aVar.b = this.A;
                SavedState savedState = this.X;
                if (savedState != null && savedState.a()) {
                    boolean z3 = this.X.c;
                    aVar.d = z3;
                    if (z3) {
                        aVar.c = this.u.i() - this.X.b;
                    } else {
                        aVar.c = this.u.m() + this.X.b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View M = M(this.A);
                    if (M != null) {
                        if (this.u.e(M) > this.u.n()) {
                            aVar.a();
                            return true;
                        } else if (this.u.g(M) - this.u.m() < 0) {
                            aVar.c = this.u.m();
                            aVar.d = false;
                            return true;
                        } else if (this.u.i() - this.u.d(M) < 0) {
                            aVar.c = this.u.i();
                            aVar.d = true;
                            return true;
                        } else {
                            if (aVar.d) {
                                g = this.u.d(M) + this.u.o();
                            } else {
                                g = this.u.g(M);
                            }
                            aVar.c = g;
                        }
                    } else {
                        if (T() > 0) {
                            if (this.A < n0(S(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.x) {
                                z2 = true;
                            }
                            aVar.d = z2;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z4 = this.x;
                    aVar.d = z4;
                    if (z4) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void O2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        int i;
        if (N2(a0Var, aVar) || M2(wVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        if (this.y) {
            i = a0Var.b() - 1;
        } else {
            i = 0;
        }
        aVar.b = i;
    }

    private void P2(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int i3;
        int m;
        this.t.m = F2();
        this.t.f = i;
        int[] iArr = this.T4;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        U1(a0Var, iArr);
        int max = Math.max(0, this.T4[0]);
        int max2 = Math.max(0, this.T4[1]);
        if (i == 1) {
            z2 = true;
        }
        c cVar = this.t;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View s2 = s2();
            c cVar2 = this.t;
            if (this.x) {
                i4 = -1;
            }
            cVar2.e = i4;
            int n0 = n0(s2);
            c cVar3 = this.t;
            cVar2.d = n0 + cVar3.e;
            cVar3.b = this.u.d(s2);
            m = this.u.d(s2) - this.u.i();
        } else {
            View t2 = t2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            if (!this.x) {
                i4 = -1;
            }
            cVar4.e = i4;
            int n02 = n0(t2);
            c cVar5 = this.t;
            cVar4.d = n02 + cVar5.e;
            cVar5.b = this.u.g(t2);
            m = (-this.u.g(t2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    private void Q2(int i, int i2) {
        int i3;
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        if (this.x) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.e = i3;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void R2(a aVar) {
        Q2(aVar.b, aVar.c);
    }

    private void S2(int i, int i2) {
        int i3;
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        if (this.x) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.e = i3;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void T2(a aVar) {
        S2(aVar.b, aVar.c);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return p.a(a0Var, this.u, g2(!this.z, true), f2(!this.z, true), this, this.z);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return p.b(a0Var, this.u, g2(!this.z, true), f2(!this.z, true), this, this.z, this.x);
    }

    private int Y1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return p.c(a0Var, this.u, g2(!this.z, true), f2(!this.z, true), this, this.z);
    }

    private View e2() {
        return l2(0, T());
    }

    private View j2() {
        return l2(T() - 1, -1);
    }

    private View n2() {
        if (this.x) {
            return e2();
        }
        return j2();
    }

    private View o2() {
        if (this.x) {
            return j2();
        }
        return e2();
    }

    private int q2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -H2(-i3, wVar, a0Var);
            int i5 = i + i4;
            if (z && (i2 = this.u.i() - i5) > 0) {
                this.u.r(i2);
                return i2 + i4;
            }
            return i4;
        }
        return 0;
    }

    private int r2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 > 0) {
            int i2 = -H2(m2, wVar, a0Var);
            int i3 = i + i2;
            if (z && (m = i3 - this.u.m()) > 0) {
                this.u.r(-m);
                return i2 - m;
            }
            return i2;
        }
        return 0;
    }

    private View s2() {
        int T;
        if (this.x) {
            T = 0;
        } else {
            T = T() - 1;
        }
        return S(T);
    }

    private View t2() {
        int i;
        if (this.x) {
            i = T() - 1;
        } else {
            i = 0;
        }
        return S(i);
    }

    private void z2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i, int i2) {
        boolean z;
        if (a0Var.g() && T() != 0 && !a0Var.e() && T1()) {
            List<RecyclerView.d0> k = wVar.k();
            int size = k.size();
            int n0 = n0(S(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.d0 d0Var = k.get(i5);
                if (!d0Var.isRemoved()) {
                    if (d0Var.getLayoutPosition() < n0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.x) {
                        i3 += this.u.e(d0Var.itemView);
                    } else {
                        i4 += this.u.e(d0Var.itemView);
                    }
                }
            }
            this.t.l = k;
            if (i3 > 0) {
                S2(n0(t2()), i);
                c cVar = this.t;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a();
                c2(wVar, this.t, a0Var, false);
            }
            if (i4 > 0) {
                Q2(n0(s2()), i2);
                c cVar2 = this.t;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a();
                c2(wVar, this.t, a0Var, false);
            }
            this.t.l = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return H2(i, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.X;
        if (savedState != null) {
            savedState.b();
        }
        B1();
    }

    boolean F2() {
        if (this.u.k() == 0 && this.u.h() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return H2(i, wVar, a0Var);
    }

    int H2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i2;
        if (T() == 0 || i == 0) {
            return 0;
        }
        b2();
        this.t.a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        P2(i2, abs, true, a0Var);
        c cVar = this.t;
        int c2 = cVar.g + c2(wVar, cVar, a0Var, false);
        if (c2 < 0) {
            return 0;
        }
        if (abs > c2) {
            i = i2 * c2;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    public void I2(int i, int i2) {
        this.A = i;
        this.B = i2;
        SavedState savedState = this.X;
        if (savedState != null) {
            savedState.b();
        }
        B1();
    }

    public void J2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        q(null);
        if (i != this.s || this.u == null) {
            m b2 = m.b(this, i);
            this.u = b2;
            this.Y.a = b2;
            this.s = i;
            B1();
        }
    }

    public void K2(boolean z) {
        q(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        B1();
    }

    public void L2(boolean z) {
        q(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M(int i) {
        int T = T();
        if (T == 0) {
            return null;
        }
        int n0 = i - n0(S(0));
        if (n0 >= 0 && n0 < T) {
            View S = S(n0);
            if (n0(S) == i) {
                return S;
            }
        }
        return super.M(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean O1() {
        if (h0() != 1073741824 && v0() != 1073741824 && w0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        if (this.I) {
            s1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Q0(View view, int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int Z1;
        View n2;
        View s2;
        G2();
        if (T() == 0 || (Z1 = Z1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        b2();
        P2(Z1, (int) (this.u.n() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        c2(wVar, cVar, a0Var, true);
        if (Z1 == -1) {
            n2 = o2();
        } else {
            n2 = n2();
        }
        if (Z1 == -1) {
            s2 = t2();
        } else {
            s2 = s2();
        }
        if (s2.hasFocusable()) {
            if (n2 == null) {
                return null;
            }
            return s2;
        }
        return n2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        R1(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            accessibilityEvent.setFromIndex(h2());
            accessibilityEvent.setToIndex(k2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        if (this.X == null && this.v == this.y) {
            return true;
        }
        return false;
    }

    protected void U1(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
        int i;
        int u2 = u2(a0Var);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = u2;
            u2 = 0;
        }
        iArr[0] = u2;
        iArr[1] = i;
    }

    void V1(RecyclerView.a0 a0Var, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < a0Var.b()) {
            cVar2.a(i, Math.max(0, cVar.g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Z1(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.s != 1 && w2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.s == 1 || !w2()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (T() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < n0(S(0))) {
            z = true;
        }
        if (z != this.x) {
            i2 = -1;
        }
        if (this.s == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    c a2() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b2() {
        if (this.t == null) {
            this.t = a2();
        }
    }

    int c2(RecyclerView.w wVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            B2(wVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.Z;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            y2(wVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !a0Var.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    B2(wVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public int d2() {
        View m2 = m2(0, T(), true, false);
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int q2;
        int i6;
        View M;
        int g;
        int i7;
        int i8 = -1;
        if ((this.X != null || this.A != -1) && a0Var.b() == 0) {
            s1(wVar);
            return;
        }
        SavedState savedState = this.X;
        if (savedState != null && savedState.a()) {
            this.A = this.X.a;
        }
        b2();
        this.t.a = false;
        G2();
        View f0 = f0();
        a aVar = this.Y;
        if (aVar.e && this.A == -1 && this.X == null) {
            if (f0 != null && (this.u.g(f0) >= this.u.i() || this.u.d(f0) <= this.u.m())) {
                this.Y.c(f0, n0(f0));
            }
        } else {
            aVar.e();
            a aVar2 = this.Y;
            aVar2.d = this.x ^ this.y;
            O2(wVar, a0Var, aVar2);
            this.Y.e = true;
        }
        c cVar = this.t;
        if (cVar.k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f = i;
        int[] iArr = this.T4;
        iArr[0] = 0;
        iArr[1] = 0;
        U1(a0Var, iArr);
        int max = Math.max(0, this.T4[0]) + this.u.m();
        int max2 = Math.max(0, this.T4[1]) + this.u.j();
        if (a0Var.e() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (M = M(i6)) != null) {
            if (this.x) {
                i7 = this.u.i() - this.u.d(M);
                g = this.B;
            } else {
                g = this.u.g(M) - this.u.m();
                i7 = this.B;
            }
            int i9 = i7 - g;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        a aVar3 = this.Y;
        if (!aVar3.d ? !this.x : this.x) {
            i8 = 1;
        }
        A2(wVar, a0Var, aVar3, i8);
        G(wVar);
        this.t.m = F2();
        this.t.j = a0Var.e();
        this.t.i = 0;
        a aVar4 = this.Y;
        if (aVar4.d) {
            T2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            c2(wVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i3 = cVar3.b;
            int i10 = cVar3.d;
            int i11 = cVar3.c;
            if (i11 > 0) {
                max2 += i11;
            }
            R2(this.Y);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            c2(wVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i2 = cVar5.b;
            int i12 = cVar5.c;
            if (i12 > 0) {
                S2(i10, i3);
                c cVar6 = this.t;
                cVar6.h = i12;
                c2(wVar, cVar6, a0Var, false);
                i3 = this.t.b;
            }
        } else {
            R2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            c2(wVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i2 = cVar8.b;
            int i13 = cVar8.d;
            int i14 = cVar8.c;
            if (i14 > 0) {
                max += i14;
            }
            T2(this.Y);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            c2(wVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i3 = cVar10.b;
            int i15 = cVar10.c;
            if (i15 > 0) {
                Q2(i13, i2);
                c cVar11 = this.t;
                cVar11.h = i15;
                c2(wVar, cVar11, a0Var, false);
                i2 = this.t.b;
            }
        }
        if (T() > 0) {
            if (this.x ^ this.y) {
                int q22 = q2(i2, wVar, a0Var, true);
                i4 = i3 + q22;
                i5 = i2 + q22;
                q2 = r2(i4, wVar, a0Var, false);
            } else {
                int r2 = r2(i3, wVar, a0Var, true);
                i4 = i3 + r2;
                i5 = i2 + r2;
                q2 = q2(i5, wVar, a0Var, false);
            }
            i3 = i4 + q2;
            i2 = i5 + q2;
        }
        z2(wVar, a0Var, i3, i2);
        if (!a0Var.e()) {
            this.u.s();
        } else {
            this.Y.e();
        }
        this.v = this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.X = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.Y.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f2(boolean z, boolean z2) {
        if (this.x) {
            return m2(0, T(), z, z2);
        }
        return m2(T() - 1, -1, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View g2(boolean z, boolean z2) {
        if (this.x) {
            return m2(T() - 1, -1, z, z2);
        }
        return m2(0, T(), z, z2);
    }

    public int h2() {
        View m2 = m2(0, T(), false, true);
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    public int i2() {
        View m2 = m2(T() - 1, -1, true, false);
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.X = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        if (this.X != null) {
            return new SavedState(this.X);
        }
        SavedState savedState = new SavedState();
        if (T() > 0) {
            b2();
            boolean z = this.v ^ this.x;
            savedState.c = z;
            if (z) {
                View s2 = s2();
                savedState.b = this.u.i() - this.u.d(s2);
                savedState.a = n0(s2);
            } else {
                View t2 = t2();
                savedState.a = n0(t2);
                savedState.b = this.u.g(t2) - this.u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    public int k2() {
        View m2 = m2(T() - 1, -1, false, true);
        if (m2 == null) {
            return -1;
        }
        return n0(m2);
    }

    View l2(int i, int i2) {
        int i3;
        int i4;
        b2();
        if (i2 > i || i2 < i) {
            if (this.u.g(S(i)) < this.u.m()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.s == 0) {
                return this.e.a(i, i2, i3, i4);
            }
            return this.f.a(i, i2, i3, i4);
        }
        return S(i);
    }

    View m2(int i, int i2, boolean z, boolean z2) {
        int i3;
        b2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    View p2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        b2();
        int T = T();
        if (z2) {
            i2 = T() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = T;
            i2 = 0;
            i3 = 1;
        }
        int b2 = a0Var.b();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View S = S(i2);
            int n0 = n0(S);
            int g = this.u.g(S);
            int d = this.u.d(S);
            if (n0 >= 0 && n0 < b2) {
                if (((RecyclerView.q) S.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = S;
                    }
                } else {
                    if (d <= m && g < m) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (g >= i4 && d > i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return S;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = S;
                        }
                        view2 = S;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = S;
                        }
                        view2 = S;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(String str) {
        if (this.X == null) {
            super.q(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        if (this.s == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    protected int u2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        if (this.s == 1) {
            return true;
        }
        return false;
    }

    public int v2() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w2() {
        if (j0() == 1) {
            return true;
        }
        return false;
    }

    public boolean x2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int i3;
        if (this.s != 0) {
            i = i2;
        }
        if (T() != 0 && i != 0) {
            b2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            P2(i3, Math.abs(i), true, a0Var);
            V1(a0Var, this.t, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return true;
    }

    void y2(RecyclerView.w wVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        boolean z2;
        View d = cVar.d(wVar);
        if (d == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d.getLayoutParams();
        if (cVar.l == null) {
            boolean z3 = this.x;
            if (cVar.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                n(d);
            } else {
                o(d, 0);
            }
        } else {
            boolean z4 = this.x;
            if (cVar.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                l(d);
            } else {
                m(d, 0);
            }
        }
        H0(d, 0, 0);
        bVar.a = this.u.e(d);
        if (this.s == 1) {
            if (w2()) {
                f = u0() - getPaddingRight();
                i4 = f - this.u.f(d);
            } else {
                i4 = getPaddingLeft();
                f = this.u.f(d) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.b;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f2 = this.u.f(d) + paddingTop;
            if (cVar.f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i = paddingTop;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i = paddingTop;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        G0(d, i4, i, i2, i3);
        if (qVar.c() || qVar.b()) {
            bVar.c = true;
        }
        bVar.d = d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.X;
        int i3 = -1;
        if (savedState != null && savedState.a()) {
            SavedState savedState2 = this.X;
            z = savedState2.c;
            i2 = savedState2.a;
        } else {
            G2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.S4 && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.X = null;
        this.Y = new a();
        this.Z = new b();
        this.S4 = 2;
        this.T4 = new int[2];
        J2(i);
        K2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.X = null;
        this.Y = new a();
        this.Z = new b();
        this.S4 = 2;
        this.T4 = new int[2];
        RecyclerView.p.d o0 = RecyclerView.p.o0(context, attributeSet, i, i2);
        J2(o0.a);
        K2(o0.c);
        L2(o0.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }
}
