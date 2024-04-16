package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class n extends r {
    private m d;
    private m e;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            n nVar = n.this;
            int[] c = nVar.c(nVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.j
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private int m(@NonNull View view, m mVar) {
        return (mVar.g(view) + (mVar.e(view) / 2)) - (mVar.m() + (mVar.n() / 2));
    }

    private View n(RecyclerView.p pVar, m mVar) {
        int T = pVar.T();
        View view = null;
        if (T == 0) {
            return null;
        }
        int m = mVar.m() + (mVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < T; i2++) {
            View S = pVar.S(i2);
            int abs = Math.abs((mVar.g(S) + (mVar.e(S) / 2)) - m);
            if (abs < i) {
                view = S;
                i = abs;
            }
        }
        return view;
    }

    @NonNull
    private m o(@NonNull RecyclerView.p pVar) {
        m mVar = this.e;
        if (mVar == null || mVar.a != pVar) {
            this.e = m.a(pVar);
        }
        return this.e;
    }

    private m p(RecyclerView.p pVar) {
        if (pVar.v()) {
            return q(pVar);
        }
        if (pVar.u()) {
            return o(pVar);
        }
        return null;
    }

    @NonNull
    private m q(@NonNull RecyclerView.p pVar) {
        m mVar = this.d;
        if (mVar == null || mVar.a != pVar) {
            this.d = m.c(pVar);
        }
        return this.d;
    }

    private boolean r(RecyclerView.p pVar, int i, int i2) {
        if (pVar.u()) {
            if (i <= 0) {
                return false;
            }
            return true;
        } else if (i2 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean s(RecyclerView.p pVar) {
        PointF a2;
        int i0 = pVar.i0();
        if (!(pVar instanceof RecyclerView.z.b) || (a2 = ((RecyclerView.z.b) pVar).a(i0 - 1)) == null) {
            return false;
        }
        if (a2.x >= 0.0f && a2.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    public int[] c(@NonNull RecyclerView.p pVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (pVar.u()) {
            iArr[0] = m(view, o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.v()) {
            iArr[1] = m(view, q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.r
    protected RecyclerView.z e(@NonNull RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new a(this.a.getContext());
    }

    @Override // androidx.recyclerview.widget.r
    public View h(RecyclerView.p pVar) {
        if (pVar.v()) {
            return n(pVar, q(pVar));
        }
        if (pVar.u()) {
            return n(pVar, o(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r
    public int i(RecyclerView.p pVar, int i, int i2) {
        m p;
        int i3;
        int i0 = pVar.i0();
        if (i0 == 0 || (p = p(pVar)) == null) {
            return -1;
        }
        int T = pVar.T();
        View view = null;
        View view2 = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < T; i6++) {
            View S = pVar.S(i6);
            if (S != null) {
                int m = m(S, p);
                if (m <= 0 && m > i4) {
                    view2 = S;
                    i4 = m;
                }
                if (m >= 0 && m < i5) {
                    view = S;
                    i5 = m;
                }
            }
        }
        boolean r = r(pVar, i, i2);
        if (r && view != null) {
            return pVar.n0(view);
        }
        if (!r && view2 != null) {
            return pVar.n0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int n0 = pVar.n0(view);
        if (s(pVar) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = n0 + i3;
        if (i7 < 0 || i7 >= i0) {
            return -1;
        }
        return i7;
    }
}
