package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class k extends r {
    private m d;
    private m e;

    private float m(RecyclerView.p pVar, m mVar) {
        int T = pVar.T();
        if (T == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < T; i3++) {
            View S = pVar.S(i3);
            int n0 = pVar.n0(S);
            if (n0 != -1) {
                if (n0 < i) {
                    view = S;
                    i = n0;
                }
                if (n0 > i2) {
                    view2 = S;
                    i2 = n0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(mVar.d(view), mVar.d(view2)) - Math.min(mVar.g(view), mVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    private int n(@NonNull View view, m mVar) {
        return (mVar.g(view) + (mVar.e(view) / 2)) - (mVar.m() + (mVar.n() / 2));
    }

    private int o(RecyclerView.p pVar, m mVar, int i, int i2) {
        int i3;
        int[] d = d(i, i2);
        float m = m(pVar, mVar);
        if (m <= 0.0f) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            i3 = d[0];
        } else {
            i3 = d[1];
        }
        return Math.round(i3 / m);
    }

    private View p(RecyclerView.p pVar, m mVar) {
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
    private m q(@NonNull RecyclerView.p pVar) {
        m mVar = this.e;
        if (mVar == null || mVar.a != pVar) {
            this.e = m.a(pVar);
        }
        return this.e;
    }

    @NonNull
    private m r(@NonNull RecyclerView.p pVar) {
        m mVar = this.d;
        if (mVar == null || mVar.a != pVar) {
            this.d = m.c(pVar);
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.r
    public int[] c(@NonNull RecyclerView.p pVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (pVar.u()) {
            iArr[0] = n(view, q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.v()) {
            iArr[1] = n(view, r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.r
    public View h(RecyclerView.p pVar) {
        if (pVar.v()) {
            return p(pVar, r(pVar));
        }
        if (pVar.u()) {
            return p(pVar, q(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r
    public int i(RecyclerView.p pVar, int i, int i2) {
        int i0;
        View h;
        int n0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(pVar instanceof RecyclerView.z.b) || (i0 = pVar.i0()) == 0 || (h = h(pVar)) == null || (n0 = pVar.n0(h)) == -1 || (a = ((RecyclerView.z.b) pVar).a(i0 - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (pVar.u()) {
            i4 = o(pVar, q(pVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (pVar.v()) {
            i5 = o(pVar, r(pVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (pVar.v()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = n0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 < i0) {
            return i6;
        }
        return i3;
    }
}
