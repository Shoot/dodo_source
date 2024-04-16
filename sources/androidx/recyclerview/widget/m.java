package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class m {
    protected final RecyclerView.p a;
    private int b;
    final Rect c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class a extends m {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.a.d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int g(View view) {
            return this.a.a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int h() {
            return this.a.u0();
        }

        @Override // androidx.recyclerview.widget.m
        public int i() {
            return this.a.u0() - this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.m
        public int j() {
            return this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.m
        public int k() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.m
        public int l() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.m
        public int m() {
            return this.a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.m
        public int n() {
            return (this.a.u0() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.m
        public int p(View view) {
            this.a.t0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.m
        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.m
        public void r(int i) {
            this.a.J0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class b extends m {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int g(View view) {
            return this.a.e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int h() {
            return this.a.g0();
        }

        @Override // androidx.recyclerview.widget.m
        public int i() {
            return this.a.g0() - this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.m
        public int j() {
            return this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.m
        public int k() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.m
        public int l() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.m
        public int m() {
            return this.a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.m
        public int n() {
            return (this.a.g0() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.m
        public int p(View view) {
            this.a.t0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.m
        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.m
        public void r(int i) {
            this.a.K0(i);
        }
    }

    /* synthetic */ m(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static m a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static m b(RecyclerView.p pVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static m c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }

    private m(RecyclerView.p pVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = pVar;
    }
}
