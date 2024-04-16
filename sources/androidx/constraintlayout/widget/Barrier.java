package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
/* loaded from: classes.dex */
public class Barrier extends b {
    private int j;
    private int k;
    private q60 l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void y(lr1 lr1Var, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (lr1Var instanceof q60) {
            ((q60) lr1Var).v1(this.k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.l.p1();
    }

    public int getMargin() {
        return this.l.r1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void p(AttributeSet attributeSet) {
        super.p(attributeSet);
        this.l = new q60();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.C1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.B1) {
                    this.l.u1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == g29.D1) {
                    this.l.w1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        x();
    }

    @Override // androidx.constraintlayout.widget.b
    public void q(d.a aVar, eo4 eo4Var, ConstraintLayout.b bVar, SparseArray<lr1> sparseArray) {
        super.q(aVar, eo4Var, bVar, sparseArray);
        if (eo4Var instanceof q60) {
            q60 q60Var = (q60) eo4Var;
            y(q60Var, aVar.e.g0, ((mr1) eo4Var.L()).L1());
            q60Var.u1(aVar.e.o0);
            q60Var.w1(aVar.e.h0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void r(lr1 lr1Var, boolean z) {
        y(lr1Var, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.u1(z);
    }

    public void setDpMargin(int i) {
        q60 q60Var = this.l;
        q60Var.w1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.w1(i);
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
