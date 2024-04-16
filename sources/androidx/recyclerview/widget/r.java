package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class r extends RecyclerView.s {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.u c = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    class a extends RecyclerView.u {
        boolean a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                r.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class b extends j {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            r rVar = r.this;
            RecyclerView recyclerView = rVar.a;
            if (recyclerView == null) {
                return;
            }
            int[] c = rVar.c(recyclerView.getLayoutManager(), view);
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
    }

    private void g() {
        this.a.removeOnScrollListener(this.c);
        this.a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.addOnScrollListener(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(@NonNull RecyclerView.p pVar, int i, int i2) {
        RecyclerView.z e;
        int i3;
        if (!(pVar instanceof RecyclerView.z.b) || (e = e(pVar)) == null || (i3 = i(pVar, i, i2)) == -1) {
            return false;
        }
        e.p(i3);
        pVar.R1(e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !k(layoutManager, i, i2)) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            j();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public abstract int[] c(@NonNull RecyclerView.p pVar, @NonNull View view);

    public int[] d(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    protected RecyclerView.z e(@NonNull RecyclerView.p pVar) {
        return f(pVar);
    }

    @Deprecated
    protected j f(@NonNull RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public abstract View h(RecyclerView.p pVar);

    public abstract int i(RecyclerView.p pVar, int i, int i2);

    void l() {
        RecyclerView.p layoutManager;
        View h;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h = h(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, h);
        int i = c[0];
        if (i != 0 || c[1] != 0) {
            this.a.smoothScrollBy(i, c[1]);
        }
    }
}
