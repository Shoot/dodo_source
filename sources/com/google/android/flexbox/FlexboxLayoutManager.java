package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.m;
import ch.qos.logback.core.CoreConstants;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements com.google.android.flexbox.a, RecyclerView.z.b {
    private static final Rect e5 = new Rect();
    private final com.google.android.flexbox.c A;
    private RecyclerView.w B;
    private RecyclerView.a0 I;
    private m S4;
    private SavedState T4;
    private int U4;
    private int V4;
    private int W4;
    private c X;
    private int X4;
    private b Y;
    private boolean Y4;
    private m Z;
    private SparseArray<View> Z4;
    private final Context a5;
    private View b5;
    private int c5;
    private c.b d5;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private List<com.google.android.flexbox.b> z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.q implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private float e;
        private float f;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int F0() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int H1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int J1() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int P() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int P1() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Q() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int T() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int e0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void e1(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int i1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void l0(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float m0() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float r0() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean x0() {
            return this.m;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.e = parcel.readFloat();
            this.f = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private boolean f;
        private boolean g;

        private b() {
            this.d = 0;
        }

        static /* synthetic */ int l(b bVar, int i) {
            int i2 = bVar.d + i;
            bVar.d = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            int m;
            int u0;
            if (!FlexboxLayoutManager.this.k() && FlexboxLayoutManager.this.x) {
                if (this.e) {
                    u0 = FlexboxLayoutManager.this.Z.i();
                } else {
                    u0 = FlexboxLayoutManager.this.u0() - FlexboxLayoutManager.this.Z.m();
                }
                this.c = u0;
                return;
            }
            if (this.e) {
                m = FlexboxLayoutManager.this.Z.i();
            } else {
                m = FlexboxLayoutManager.this.Z.m();
            }
            this.c = m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            m mVar = FlexboxLayoutManager.this.t == 0 ? FlexboxLayoutManager.this.S4 : FlexboxLayoutManager.this.Z;
            if (!FlexboxLayoutManager.this.k() && FlexboxLayoutManager.this.x) {
                if (this.e) {
                    this.c = mVar.g(view) + mVar.o();
                } else {
                    this.c = mVar.d(view);
                }
            } else if (this.e) {
                this.c = mVar.d(view) + mVar.o();
            } else {
                this.c = mVar.g(view);
            }
            this.a = FlexboxLayoutManager.this.n0(view);
            int i = 0;
            this.g = false;
            int[] iArr = FlexboxLayoutManager.this.A.c;
            int i2 = this.a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.b = i;
            if (FlexboxLayoutManager.this.z.size() > this.b) {
                this.a = ((com.google.android.flexbox.b) FlexboxLayoutManager.this.z.get(this.b)).o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t() {
            this.a = -1;
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            boolean z = false;
            this.f = false;
            this.g = false;
            if (FlexboxLayoutManager.this.k()) {
                if (FlexboxLayoutManager.this.t == 0) {
                    if (FlexboxLayoutManager.this.s == 1) {
                        z = true;
                    }
                    this.e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.t == 2) {
                    z = true;
                }
                this.e = z;
            } else if (FlexboxLayoutManager.this.t == 0) {
                if (FlexboxLayoutManager.this.s == 3) {
                    z = true;
                }
                this.e = z;
            } else {
                if (FlexboxLayoutManager.this.t == 2) {
                    z = true;
                }
                this.e = z;
            }
        }

        @NonNull
        public String toString() {
            return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + CoreConstants.CURLY_RIGHT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        private c() {
            this.h = 1;
            this.i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D(RecyclerView.a0 a0Var, List<com.google.android.flexbox.b> list) {
            int i;
            int i2 = this.d;
            if (i2 >= 0 && i2 < a0Var.b() && (i = this.c) >= 0 && i < list.size()) {
                return true;
            }
            return false;
        }

        static /* synthetic */ int c(c cVar, int i) {
            int i2 = cVar.e + i;
            cVar.e = i2;
            return i2;
        }

        static /* synthetic */ int d(c cVar, int i) {
            int i2 = cVar.e - i;
            cVar.e = i2;
            return i2;
        }

        static /* synthetic */ int i(c cVar, int i) {
            int i2 = cVar.a - i;
            cVar.a = i2;
            return i2;
        }

        static /* synthetic */ int l(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        static /* synthetic */ int m(c cVar) {
            int i = cVar.c;
            cVar.c = i - 1;
            return i;
        }

        static /* synthetic */ int n(c cVar, int i) {
            int i2 = cVar.c + i;
            cVar.c = i2;
            return i2;
        }

        static /* synthetic */ int q(c cVar, int i) {
            int i2 = cVar.f + i;
            cVar.f = i2;
            return i2;
        }

        static /* synthetic */ int u(c cVar, int i) {
            int i2 = cVar.d + i;
            cVar.d = i2;
            return i2;
        }

        static /* synthetic */ int v(c cVar, int i) {
            int i2 = cVar.d - i;
            cVar.d = i2;
            return i2;
        }

        @NonNull
        public String toString() {
            return "LayoutState{mAvailable=" + this.a + ", mFlexLinePosition=" + this.c + ", mPosition=" + this.d + ", mOffset=" + this.e + ", mScrollingOffset=" + this.f + ", mLastScrollDelta=" + this.g + ", mItemDirection=" + this.h + ", mLayoutDirection=" + this.i + CoreConstants.CURLY_RIGHT;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private int A2(int i) {
        int height;
        int g0;
        int i2;
        if (T() != 0 && i != 0) {
            i2();
            boolean k = k();
            View view = this.b5;
            if (k) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (k) {
                g0 = u0();
            } else {
                g0 = g0();
            }
            if (j0() == 1) {
                int abs = Math.abs(i);
                if (i < 0) {
                    i2 = Math.min((g0 + this.Y.d) - height, abs);
                } else if (this.Y.d + i > 0) {
                    i2 = this.Y.d;
                } else {
                    return i;
                }
            } else if (i > 0) {
                return Math.min((g0 - this.Y.d) - height, i);
            } else {
                if (this.Y.d + i < 0) {
                    i2 = this.Y.d;
                } else {
                    return i;
                }
            }
            return -i2;
        }
        return 0;
    }

    private boolean B2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int u0 = u0() - getPaddingRight();
        int g0 = g0() - getPaddingBottom();
        int w2 = w2(view);
        int y2 = y2(view);
        int x2 = x2(view);
        int u2 = u2(view);
        if (paddingLeft <= w2 && u0 >= x2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (w2 < u0 && x2 < paddingLeft) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (paddingTop <= y2 && g0 >= u2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (y2 < g0 && u2 < paddingTop) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z) {
            if (z2 && z4) {
                return true;
            }
            return false;
        } else if (z3 && z5) {
            return true;
        } else {
            return false;
        }
    }

    private int C2(com.google.android.flexbox.b bVar, c cVar) {
        if (k()) {
            return D2(bVar, cVar);
        }
        return E2(bVar, cVar);
    }

    private static boolean D0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int D2(com.google.android.flexbox.b r22, com.google.android.flexbox.FlexboxLayoutManager.c r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.D2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int E2(com.google.android.flexbox.b r26, com.google.android.flexbox.FlexboxLayoutManager.c r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private void F2(RecyclerView.w wVar, c cVar) {
        if (!cVar.j) {
            return;
        }
        if (cVar.i == -1) {
            H2(wVar, cVar);
        } else {
            I2(wVar, cVar);
        }
    }

    private void G2(RecyclerView.w wVar, int i, int i2) {
        while (i2 >= i) {
            v1(i2, wVar);
            i2--;
        }
    }

    private void H2(RecyclerView.w wVar, c cVar) {
        int T;
        int i;
        View S;
        int i2;
        if (cVar.f < 0 || (T = T()) == 0 || (S = S(T - 1)) == null || (i2 = this.A.c[n0(S)]) == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.z.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View S2 = S(i3);
            if (S2 != null) {
                if (!b2(S2, cVar.f)) {
                    break;
                } else if (bVar.o != n0(S2)) {
                    continue;
                } else if (i2 <= 0) {
                    T = i3;
                    break;
                } else {
                    i2 += cVar.i;
                    bVar = this.z.get(i2);
                    T = i3;
                }
            }
            i3--;
        }
        G2(wVar, T, i);
    }

    private void I2(RecyclerView.w wVar, c cVar) {
        int T;
        View S;
        if (cVar.f < 0 || (T = T()) == 0 || (S = S(0)) == null) {
            return;
        }
        int i = this.A.c[n0(S)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.z.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= T) {
                break;
            }
            View S2 = S(i3);
            if (S2 != null) {
                if (!c2(S2, cVar.f)) {
                    break;
                } else if (bVar.p != n0(S2)) {
                    continue;
                } else if (i >= this.z.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += cVar.i;
                    bVar = this.z.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        G2(wVar, 0, i2);
    }

    private void J2() {
        int v0;
        boolean z;
        if (k()) {
            v0 = h0();
        } else {
            v0 = v0();
        }
        c cVar = this.X;
        if (v0 != 0 && v0 != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        cVar.b = z;
    }

    private void K2() {
        boolean z;
        boolean z2;
        boolean z3;
        int j0 = j0();
        int i = this.s;
        boolean z4 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.x = false;
                        this.y = false;
                        return;
                    }
                    if (j0 == 1) {
                        z4 = true;
                    }
                    this.x = z4;
                    if (this.t == 2) {
                        this.x = !z4;
                    }
                    this.y = true;
                    return;
                }
                if (j0 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.x = z3;
                if (this.t == 2) {
                    this.x = !z3;
                }
                this.y = false;
                return;
            }
            if (j0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.x = z2;
            if (this.t == 2) {
                z4 = true;
            }
            this.y = z4;
            return;
        }
        if (j0 == 1) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        if (this.t == 2) {
            z4 = true;
        }
        this.y = z4;
    }

    private boolean N1(View view, int i, int i2, RecyclerView.q qVar) {
        if (!view.isLayoutRequested() && C0() && D0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && D0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) {
            return false;
        }
        return true;
    }

    private boolean O2(RecyclerView.a0 a0Var, b bVar) {
        View k2;
        int m;
        if (T() == 0) {
            return false;
        }
        if (bVar.e) {
            k2 = n2(a0Var.b());
        } else {
            k2 = k2(a0Var.b());
        }
        if (k2 != null) {
            bVar.s(k2);
            if (!a0Var.e() && T1()) {
                if (this.Z.g(k2) >= this.Z.i() || this.Z.d(k2) < this.Z.m()) {
                    if (bVar.e) {
                        m = this.Z.i();
                    } else {
                        m = this.Z.m();
                    }
                    bVar.c = m;
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean P2(RecyclerView.a0 a0Var, b bVar, SavedState savedState) {
        int i;
        View S;
        int g;
        boolean z = false;
        if (!a0Var.e() && (i = this.U4) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                bVar.a = this.U4;
                bVar.b = this.A.c[bVar.a];
                SavedState savedState2 = this.T4;
                if (savedState2 != null && savedState2.g(a0Var.b())) {
                    bVar.c = this.Z.m() + savedState.b;
                    bVar.g = true;
                    bVar.b = -1;
                    return true;
                } else if (this.V4 == Integer.MIN_VALUE) {
                    View M = M(this.U4);
                    if (M != null) {
                        if (this.Z.e(M) > this.Z.n()) {
                            bVar.r();
                            return true;
                        } else if (this.Z.g(M) - this.Z.m() < 0) {
                            bVar.c = this.Z.m();
                            bVar.e = false;
                            return true;
                        } else if (this.Z.i() - this.Z.d(M) < 0) {
                            bVar.c = this.Z.i();
                            bVar.e = true;
                            return true;
                        } else {
                            if (bVar.e) {
                                g = this.Z.d(M) + this.Z.o();
                            } else {
                                g = this.Z.g(M);
                            }
                            bVar.c = g;
                        }
                    } else {
                        if (T() > 0 && (S = S(0)) != null) {
                            if (this.U4 < n0(S)) {
                                z = true;
                            }
                            bVar.e = z;
                        }
                        bVar.r();
                    }
                    return true;
                } else {
                    if (k() || !this.x) {
                        bVar.c = this.Z.m() + this.V4;
                    } else {
                        bVar.c = this.V4 - this.Z.j();
                    }
                    return true;
                }
            }
            this.U4 = -1;
            this.V4 = Integer.MIN_VALUE;
        }
        return false;
    }

    private void Q2(RecyclerView.a0 a0Var, b bVar) {
        if (!P2(a0Var, bVar, this.T4) && !O2(a0Var, bVar)) {
            bVar.r();
            bVar.a = 0;
            bVar.b = 0;
        }
    }

    private void R2(int i) {
        if (i >= p2()) {
            return;
        }
        int T = T();
        this.A.t(T);
        this.A.u(T);
        this.A.s(T);
        if (i >= this.A.c.length) {
            return;
        }
        this.c5 = i;
        View v2 = v2();
        if (v2 == null) {
            return;
        }
        this.U4 = n0(v2);
        if (!k() && this.x) {
            this.V4 = this.Z.d(v2) + this.Z.j();
        } else {
            this.V4 = this.Z.g(v2) - this.Z.m();
        }
    }

    private void S2(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        int u0 = u0();
        int g0 = g0();
        boolean z = false;
        if (k()) {
            int i4 = this.W4;
            if (i4 != Integer.MIN_VALUE && i4 != u0) {
                z = true;
            }
            i2 = this.X.b ? this.a5.getResources().getDisplayMetrics().heightPixels : this.X.a;
        } else {
            int i5 = this.X4;
            if (i5 != Integer.MIN_VALUE && i5 != g0) {
                z = true;
            }
            if (!this.X.b) {
                i2 = this.X.a;
            } else {
                i2 = this.a5.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i6 = i2;
        this.W4 = u0;
        this.X4 = g0;
        int i7 = this.c5;
        if (i7 == -1 && (this.U4 != -1 || z)) {
            if (this.Y.e) {
                return;
            }
            this.z.clear();
            this.d5.a();
            if (k()) {
                this.A.e(this.d5, makeMeasureSpec, makeMeasureSpec2, i6, this.Y.a, this.z);
            } else {
                this.A.h(this.d5, makeMeasureSpec, makeMeasureSpec2, i6, this.Y.a, this.z);
            }
            this.z = this.d5.a;
            this.A.p(makeMeasureSpec, makeMeasureSpec2);
            this.A.X();
            b bVar = this.Y;
            bVar.b = this.A.c[bVar.a];
            this.X.c = this.Y.b;
            return;
        }
        if (i7 == -1) {
            i3 = this.Y.a;
        } else {
            i3 = Math.min(i7, this.Y.a);
        }
        int i8 = i3;
        this.d5.a();
        if (k()) {
            if (this.z.size() > 0) {
                this.A.j(this.z, i8);
                this.A.b(this.d5, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.Y.a, this.z);
            } else {
                this.A.s(i);
                this.A.d(this.d5, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.z);
            }
        } else if (this.z.size() > 0) {
            this.A.j(this.z, i8);
            this.A.b(this.d5, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.Y.a, this.z);
        } else {
            this.A.s(i);
            this.A.g(this.d5, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.z);
        }
        this.z = this.d5.a;
        this.A.q(makeMeasureSpec, makeMeasureSpec2, i8);
        this.A.Y(i8);
    }

    private void T2(int i, int i2) {
        boolean z;
        int i3;
        this.X.i = i;
        boolean k = k();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        if (!k && this.x) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            View S = S(T() - 1);
            if (S == null) {
                return;
            }
            this.X.e = this.Z.d(S);
            int n0 = n0(S);
            View o2 = o2(S, this.z.get(this.A.c[n0]));
            this.X.h = 1;
            c cVar = this.X;
            cVar.d = n0 + cVar.h;
            if (this.A.c.length <= this.X.d) {
                this.X.c = -1;
            } else {
                c cVar2 = this.X;
                cVar2.c = this.A.c[cVar2.d];
            }
            if (z) {
                this.X.e = this.Z.g(o2);
                this.X.f = (-this.Z.g(o2)) + this.Z.m();
                c cVar3 = this.X;
                cVar3.f = Math.max(cVar3.f, 0);
            } else {
                this.X.e = this.Z.d(o2);
                this.X.f = this.Z.d(o2) - this.Z.i();
            }
            if ((this.X.c == -1 || this.X.c > this.z.size() - 1) && this.X.d <= getFlexItemCount()) {
                int i4 = i2 - this.X.f;
                this.d5.a();
                if (i4 > 0) {
                    if (k) {
                        this.A.d(this.d5, makeMeasureSpec, makeMeasureSpec2, i4, this.X.d, this.z);
                    } else {
                        this.A.g(this.d5, makeMeasureSpec, makeMeasureSpec2, i4, this.X.d, this.z);
                    }
                    this.A.q(makeMeasureSpec, makeMeasureSpec2, this.X.d);
                    this.A.Y(this.X.d);
                }
            }
        } else {
            View S2 = S(0);
            if (S2 == null) {
                return;
            }
            this.X.e = this.Z.g(S2);
            int n02 = n0(S2);
            View l2 = l2(S2, this.z.get(this.A.c[n02]));
            this.X.h = 1;
            int i5 = this.A.c[n02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 <= 0) {
                this.X.d = -1;
            } else {
                this.X.d = n02 - this.z.get(i5 - 1).b();
            }
            c cVar4 = this.X;
            if (i5 > 0) {
                i3 = i5 - 1;
            } else {
                i3 = 0;
            }
            cVar4.c = i3;
            if (z) {
                this.X.e = this.Z.d(l2);
                this.X.f = this.Z.d(l2) - this.Z.i();
                c cVar5 = this.X;
                cVar5.f = Math.max(cVar5.f, 0);
            } else {
                this.X.e = this.Z.g(l2);
                this.X.f = (-this.Z.g(l2)) + this.Z.m();
            }
        }
        c cVar6 = this.X;
        cVar6.a = i2 - cVar6.f;
    }

    private void U2(b bVar, boolean z, boolean z2) {
        if (!z2) {
            this.X.b = false;
        } else {
            J2();
        }
        if (!k() && this.x) {
            this.X.a = bVar.c - getPaddingRight();
        } else {
            this.X.a = this.Z.i() - bVar.c;
        }
        this.X.d = bVar.a;
        this.X.h = 1;
        this.X.i = 1;
        this.X.e = bVar.c;
        this.X.f = Integer.MIN_VALUE;
        this.X.c = bVar.b;
        if (z && this.z.size() > 1 && bVar.b >= 0 && bVar.b < this.z.size() - 1) {
            c.l(this.X);
            c.u(this.X, this.z.get(bVar.b).b());
        }
    }

    private void V2(b bVar, boolean z, boolean z2) {
        if (!z2) {
            this.X.b = false;
        } else {
            J2();
        }
        if (!k() && this.x) {
            this.X.a = (this.b5.getWidth() - bVar.c) - this.Z.m();
        } else {
            this.X.a = bVar.c - this.Z.m();
        }
        this.X.d = bVar.a;
        this.X.h = 1;
        this.X.i = -1;
        this.X.e = bVar.c;
        this.X.f = Integer.MIN_VALUE;
        this.X.c = bVar.b;
        if (z && bVar.b > 0 && this.z.size() > bVar.b) {
            c.m(this.X);
            c.v(this.X, this.z.get(bVar.b).b());
        }
    }

    private boolean b2(View view, int i) {
        if (!k() && this.x) {
            if (this.Z.d(view) > i) {
                return false;
            }
            return true;
        } else if (this.Z.g(view) < this.Z.h() - i) {
            return false;
        } else {
            return true;
        }
    }

    private boolean c2(View view, int i) {
        if (!k() && this.x) {
            if (this.Z.h() - this.Z.g(view) > i) {
                return false;
            }
            return true;
        } else if (this.Z.d(view) > i) {
            return false;
        } else {
            return true;
        }
    }

    private void d2() {
        this.z.clear();
        this.Y.t();
        this.Y.d = 0;
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        i2();
        View k2 = k2(b2);
        View n2 = n2(b2);
        if (a0Var.b() == 0 || k2 == null || n2 == null) {
            return 0;
        }
        return Math.min(this.Z.n(), this.Z.d(n2) - this.Z.g(k2));
    }

    private int f2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        View k2 = k2(b2);
        View n2 = n2(b2);
        if (a0Var.b() != 0 && k2 != null && n2 != null) {
            int n0 = n0(k2);
            int n02 = n0(n2);
            int abs = Math.abs(this.Z.d(n2) - this.Z.g(k2));
            int[] iArr = this.A.c;
            int i = iArr[n0];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[n02] - i) + 1))) + (this.Z.m() - this.Z.g(k2)));
            }
        }
        return 0;
    }

    private int g2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        View k2 = k2(b2);
        View n2 = n2(b2);
        if (a0Var.b() == 0 || k2 == null || n2 == null) {
            return 0;
        }
        int m2 = m2();
        return (int) ((Math.abs(this.Z.d(n2) - this.Z.g(k2)) / ((p2() - m2) + 1)) * a0Var.b());
    }

    private void h2() {
        if (this.X == null) {
            this.X = new c();
        }
    }

    private void i2() {
        if (this.Z != null) {
            return;
        }
        if (k()) {
            if (this.t == 0) {
                this.Z = m.a(this);
                this.S4 = m.c(this);
                return;
            }
            this.Z = m.c(this);
            this.S4 = m.a(this);
        } else if (this.t == 0) {
            this.Z = m.c(this);
            this.S4 = m.a(this);
        } else {
            this.Z = m.a(this);
            this.S4 = m.c(this);
        }
    }

    private int j2(RecyclerView.w wVar, RecyclerView.a0 a0Var, c cVar) {
        if (cVar.f != Integer.MIN_VALUE) {
            if (cVar.a < 0) {
                c.q(cVar, cVar.a);
            }
            F2(wVar, cVar);
        }
        int i = cVar.a;
        int i2 = cVar.a;
        boolean k = k();
        int i3 = 0;
        while (true) {
            if ((i2 > 0 || this.X.b) && cVar.D(a0Var, this.z)) {
                com.google.android.flexbox.b bVar = this.z.get(cVar.c);
                cVar.d = bVar.o;
                i3 += C2(bVar, cVar);
                if (!k && this.x) {
                    c.d(cVar, bVar.a() * cVar.i);
                } else {
                    c.c(cVar, bVar.a() * cVar.i);
                }
                i2 -= bVar.a();
            }
        }
        c.i(cVar, i3);
        if (cVar.f != Integer.MIN_VALUE) {
            c.q(cVar, i3);
            if (cVar.a < 0) {
                c.q(cVar, cVar.a);
            }
            F2(wVar, cVar);
        }
        return i - cVar.a;
    }

    private View k2(int i) {
        View r2 = r2(0, T(), i);
        if (r2 == null) {
            return null;
        }
        int i2 = this.A.c[n0(r2)];
        if (i2 == -1) {
            return null;
        }
        return l2(r2, this.z.get(i2));
    }

    private View l2(View view, com.google.android.flexbox.b bVar) {
        boolean k = k();
        int i = bVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View S = S(i2);
            if (S != null && S.getVisibility() != 8) {
                if (this.x && !k) {
                    if (this.Z.d(view) >= this.Z.d(S)) {
                    }
                    view = S;
                } else {
                    if (this.Z.g(view) <= this.Z.g(S)) {
                    }
                    view = S;
                }
            }
        }
        return view;
    }

    private View n2(int i) {
        View r2 = r2(T() - 1, -1, i);
        if (r2 == null) {
            return null;
        }
        return o2(r2, this.z.get(this.A.c[n0(r2)]));
    }

    private View o2(View view, com.google.android.flexbox.b bVar) {
        boolean k = k();
        int T = (T() - bVar.h) - 1;
        for (int T2 = T() - 2; T2 > T; T2--) {
            View S = S(T2);
            if (S != null && S.getVisibility() != 8) {
                if (this.x && !k) {
                    if (this.Z.g(view) <= this.Z.g(S)) {
                    }
                    view = S;
                } else {
                    if (this.Z.d(view) >= this.Z.d(S)) {
                    }
                    view = S;
                }
            }
        }
        return view;
    }

    private View q2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View S = S(i);
            if (B2(S, z)) {
                return S;
            }
            i += i3;
        }
        return null;
    }

    private View r2(int i, int i2, int i3) {
        int i4;
        int n0;
        i2();
        h2();
        int m = this.Z.m();
        int i5 = this.Z.i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View S = S(i);
            if (S != null && (n0 = n0(S)) >= 0 && n0 < i3) {
                if (((RecyclerView.q) S.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = S;
                    }
                } else if (this.Z.g(S) >= m && this.Z.d(S) <= i5) {
                    return S;
                } else {
                    if (view == null) {
                        view = S;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    private int s2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int i3;
        if (!k() && this.x) {
            int m = i - this.Z.m();
            if (m <= 0) {
                return 0;
            }
            i2 = z2(m, wVar, a0Var);
        } else {
            int i4 = this.Z.i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -z2(-i4, wVar, a0Var);
        }
        int i5 = i + i2;
        if (z && (i3 = this.Z.i() - i5) > 0) {
            this.Z.r(i3);
            return i3 + i2;
        }
        return i2;
    }

    private int t2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int m;
        if (!k() && this.x) {
            int i3 = this.Z.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = z2(-i3, wVar, a0Var);
        } else {
            int m2 = i - this.Z.m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -z2(m2, wVar, a0Var);
        }
        int i4 = i + i2;
        if (z && (m = i4 - this.Z.m()) > 0) {
            this.Z.r(-m);
            return i2 - m;
        }
        return i2;
    }

    private int u2(View view) {
        return Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    private View v2() {
        return S(0);
    }

    private int w2(View view) {
        return a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    private int x2(View view) {
        return d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    private int y2(View view) {
        return e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    private int z2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        boolean z;
        if (T() == 0 || i == 0) {
            return 0;
        }
        i2();
        int i2 = 1;
        this.X.j = true;
        if (!k() && this.x) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        T2(i2, abs);
        int j2 = this.X.f + j2(wVar, a0Var, this.X);
        if (j2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > j2) {
                i = (-i2) * j2;
            }
        } else if (abs > j2) {
            i = i2 * j2;
        }
        this.Z.r(-i);
        this.X.g = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(@NonNull RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(@NonNull RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(@NonNull RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(@NonNull RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(@NonNull RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (k() && this.t != 0) {
            int A2 = A2(i);
            b.l(this.Y, A2);
            this.S4.r(-A2);
            return A2;
        }
        int z2 = z2(i, wVar, a0Var);
        this.Z4.clear();
        return z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(@NonNull RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i) {
        this.U4 = i;
        this.V4 = Integer.MIN_VALUE;
        SavedState savedState = this.T4;
        if (savedState != null) {
            savedState.h();
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (!k() && (this.t != 0 || k())) {
            int A2 = A2(i);
            b.l(this.Y, A2);
            this.S4.r(-A2);
            return A2;
        }
        int z2 = z2(i, wVar, a0Var);
        this.Z4.clear();
        return z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        r1();
    }

    public void L2(int i) {
        int i2 = this.v;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                r1();
                d2();
            }
            this.v = i;
            B1();
        }
    }

    public void M2(int i) {
        if (this.s != i) {
            r1();
            this.s = i;
            this.Z = null;
            this.S4 = null;
            d2();
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView recyclerView) {
        super.N0(recyclerView);
        this.b5 = (View) recyclerView.getParent();
    }

    public void N2(int i) {
        if (i != 2) {
            int i2 = this.t;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    r1();
                    d2();
                }
                this.t = i;
                this.Z = null;
                this.S4 = null;
                B1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        if (this.Y4) {
            s1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        R1(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.Y0(recyclerView, i, i2);
        R2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        View S;
        int i2;
        if (T() == 0 || (S = S(0)) == null) {
            return null;
        }
        if (i < n0(S)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (k()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.a1(recyclerView, i, i2, i3);
        R2(Math.min(i, i2));
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i, int i2, com.google.android.flexbox.b bVar) {
        t(view, e5);
        if (k()) {
            int k0 = k0(view) + p0(view);
            bVar.e += k0;
            bVar.f += k0;
            return;
        }
        int s0 = s0(view) + R(view);
        bVar.e += s0;
        bVar.f += s0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.b1(recyclerView, i, i2);
        R2(i);
    }

    @Override // com.google.android.flexbox.a
    public int c(int i, int i2, int i3) {
        return RecyclerView.p.U(u0(), v0(), i2, i3, u());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.c1(recyclerView, i, i2);
        R2(i);
    }

    @Override // com.google.android.flexbox.a
    public View d(int i) {
        View view = this.Z4.get(i);
        if (view != null) {
            return view;
        }
        return this.B.o(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.d1(recyclerView, i, i2, obj);
        R2(i);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i, int i2, int i3) {
        return RecyclerView.p.U(g0(), h0(), i2, i3, v());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        this.B = wVar;
        this.I = a0Var;
        int b2 = a0Var.b();
        if (b2 == 0 && a0Var.e()) {
            return;
        }
        K2();
        i2();
        h2();
        this.A.t(b2);
        this.A.u(b2);
        this.A.s(b2);
        this.X.j = false;
        SavedState savedState = this.T4;
        if (savedState != null && savedState.g(b2)) {
            this.U4 = this.T4.a;
        }
        if (!this.Y.f || this.U4 != -1 || this.T4 != null) {
            this.Y.t();
            Q2(a0Var, this.Y);
            this.Y.f = true;
        }
        G(wVar);
        if (this.Y.e) {
            V2(this.Y, false, true);
        } else {
            U2(this.Y, false, true);
        }
        S2(b2);
        j2(wVar, a0Var, this.X);
        if (this.Y.e) {
            i2 = this.X.e;
            U2(this.Y, true, false);
            j2(wVar, a0Var, this.X);
            i = this.X.e;
        } else {
            i = this.X.e;
            V2(this.Y, true, false);
            j2(wVar, a0Var, this.X);
            i2 = this.X.e;
        }
        if (T() > 0) {
            if (this.Y.e) {
                t2(i2 + s2(i, wVar, a0Var, true), wVar, a0Var, false);
            } else {
                s2(i + t2(i2, wVar, a0Var, true), wVar, a0Var, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public int f(View view) {
        int k0;
        int p0;
        if (k()) {
            k0 = s0(view);
            p0 = R(view);
        } else {
            k0 = k0(view);
            p0 = p0(view);
        }
        return k0 + p0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.T4 = null;
        this.U4 = -1;
        this.V4 = Integer.MIN_VALUE;
        this.c5 = -1;
        this.Y.t();
        this.Z4.clear();
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.v;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.s;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.I.b();
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.b> getFlexLinesInternal() {
        return this.z;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.t;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.z.size() == 0) {
            return 0;
        }
        int size = this.z.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.z.get(i2).e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.w;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.z.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.z.get(i2).g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public View h(int i) {
        return d(i);
    }

    @Override // com.google.android.flexbox.a
    public void i(int i, View view) {
        this.Z4.put(i, view);
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i, int i2) {
        int s0;
        int R;
        if (k()) {
            s0 = k0(view);
            R = p0(view);
        } else {
            s0 = s0(view);
            R = R(view);
        }
        return s0 + R;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.T4 = (SavedState) parcelable;
            B1();
        }
    }

    @Override // com.google.android.flexbox.a
    public boolean k() {
        int i = this.s;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        if (this.T4 != null) {
            return new SavedState(this.T4);
        }
        SavedState savedState = new SavedState();
        if (T() <= 0) {
            savedState.h();
        } else {
            View v2 = v2();
            savedState.a = n0(v2);
            savedState.b = this.Z.g(v2) - this.Z.m();
        }
        return savedState;
    }

    public int m2() {
        View q2 = q2(0, T(), false);
        if (q2 == null) {
            return -1;
        }
        return n0(q2);
    }

    public int p2() {
        View q2 = q2(T() - 1, -1, false);
        if (q2 == null) {
            return -1;
        }
        return n0(q2);
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.b> list) {
        this.z = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        int i;
        if (this.t == 0) {
            return k();
        }
        if (k()) {
            int u0 = u0();
            View view = this.b5;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (u0 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        int i;
        if (this.t == 0) {
            return !k();
        }
        if (k()) {
            return true;
        }
        int g0 = g0();
        View view = this.b5;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (g0 > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private int a;
        private int b;

        /* loaded from: classes2.dex */
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int i) {
            int i2 = this.a;
            if (i2 >= 0 && i2 < i) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + CoreConstants.CURLY_RIGHT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.w = -1;
        this.z = new ArrayList();
        this.A = new com.google.android.flexbox.c(this);
        this.Y = new b();
        this.U4 = -1;
        this.V4 = Integer.MIN_VALUE;
        this.W4 = Integer.MIN_VALUE;
        this.X4 = Integer.MIN_VALUE;
        this.Z4 = new SparseArray<>();
        this.c5 = -1;
        this.d5 = new c.b();
        M2(i);
        N2(i2);
        L2(4);
        this.a5 = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = -1;
        this.z = new ArrayList();
        this.A = new com.google.android.flexbox.c(this);
        this.Y = new b();
        this.U4 = -1;
        this.V4 = Integer.MIN_VALUE;
        this.W4 = Integer.MIN_VALUE;
        this.X4 = Integer.MIN_VALUE;
        this.Z4 = new SparseArray<>();
        this.c5 = -1;
        this.d5 = new c.b();
        RecyclerView.p.d o0 = RecyclerView.p.o0(context, attributeSet, i, i2);
        int i3 = o0.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (o0.c) {
                    M2(3);
                } else {
                    M2(2);
                }
            }
        } else if (o0.c) {
            M2(1);
        } else {
            M2(0);
        }
        N2(1);
        L2(4);
        this.a5 = context;
    }

    @Override // com.google.android.flexbox.a
    public void g(com.google.android.flexbox.b bVar) {
    }
}
