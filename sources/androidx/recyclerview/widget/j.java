package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class j extends RecyclerView.z {
    protected PointF k;
    private final DisplayMetrics l;
    private float n;
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean m = false;
    protected int o = 0;
    protected int p = 0;

    public j(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.m) {
            this.n = v(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected int B() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF a = a(f());
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            i(a);
            this.k = a;
            this.o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            aVar.d((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (x(10000) * 1.2f), this.i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i);
        int y = y(this.p, i2);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((t * t) + (u * u)));
        if (w > 0) {
            aVar.d(-t, -u, w, this.j);
        }
    }

    public int s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int t(View view, int i) {
        RecyclerView.p e = e();
        if (e != null && e.u()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(e.a0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e.d0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e.getPaddingLeft(), e.u0() - e.getPaddingRight(), i);
        }
        return 0;
    }

    public int u(View view, int i) {
        RecyclerView.p e = e();
        if (e != null && e.v()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(e.e0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e.getPaddingTop(), e.g0() - e.getPaddingBottom(), i);
        }
        return 0;
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i) {
        return (int) Math.ceil(x(i) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i) {
        return (int) Math.ceil(Math.abs(i) * A());
    }

    protected int z() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }
}
