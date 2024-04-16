package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class q extends RecyclerView.m {
    boolean g = true;

    public abstract boolean A(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);

    public abstract boolean B(RecyclerView.d0 d0Var);

    public final void C(RecyclerView.d0 d0Var) {
        K(d0Var);
        h(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var) {
        L(d0Var);
    }

    public final void E(RecyclerView.d0 d0Var, boolean z) {
        M(d0Var, z);
        h(d0Var);
    }

    public final void F(RecyclerView.d0 d0Var, boolean z) {
        N(d0Var, z);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
        h(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
    }

    public final void I(RecyclerView.d0 d0Var) {
        Q(d0Var);
        h(d0Var);
    }

    public final void J(RecyclerView.d0 d0Var) {
        R(d0Var);
    }

    public void S(boolean z) {
        this.g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(@NonNull RecyclerView.d0 d0Var, RecyclerView.m.c cVar, @NonNull RecyclerView.m.c cVar2) {
        int i;
        int i2;
        if (cVar != null && ((i = cVar.a) != (i2 = cVar2.a) || cVar.b != cVar2.b)) {
            return A(d0Var, i, cVar.b, i2, cVar2.b);
        }
        return y(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(@NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.d0 d0Var2, @NonNull RecyclerView.m.c cVar, @NonNull RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (d0Var2.shouldIgnore()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return z(d0Var, d0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(@NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        View view = d0Var.itemView;
        if (cVar2 == null) {
            i = view.getLeft();
        } else {
            i = cVar2.a;
        }
        int i5 = i;
        if (cVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = cVar2.b;
        }
        int i6 = i2;
        if (!d0Var.isRemoved() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return A(d0Var, i3, i4, i5, i6);
        }
        return B(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(@NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.m.c cVar, @NonNull RecyclerView.m.c cVar2) {
        int i = cVar.a;
        int i2 = cVar2.a;
        if (i == i2 && cVar.b == cVar2.b) {
            G(d0Var);
            return false;
        }
        return A(d0Var, i, cVar.b, i2, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(@NonNull RecyclerView.d0 d0Var) {
        if (this.g && !d0Var.isInvalid()) {
            return false;
        }
        return true;
    }

    public abstract boolean y(RecyclerView.d0 d0Var);

    public abstract boolean z(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    public void K(RecyclerView.d0 d0Var) {
    }

    public void L(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    public void Q(RecyclerView.d0 d0Var) {
    }

    public void R(RecyclerView.d0 d0Var) {
    }

    public void M(RecyclerView.d0 d0Var, boolean z) {
    }

    public void N(RecyclerView.d0 d0Var, boolean z) {
    }
}
