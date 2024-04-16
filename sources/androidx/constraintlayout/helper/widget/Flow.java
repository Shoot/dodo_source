package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
/* loaded from: classes.dex */
public class Flow extends r1c {
    private nz3 l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i, int i2) {
        y(this.l, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.r1c, androidx.constraintlayout.widget.b
    public void p(AttributeSet attributeSet) {
        super.p(attributeSet);
        this.l = new nz3();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.n1) {
                    this.l.x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.o1) {
                    this.l.D1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.y1) {
                    this.l.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.z1) {
                    this.l.F1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.p1) {
                    this.l.G1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.q1) {
                    this.l.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.r1) {
                    this.l.H1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.s1) {
                    this.l.E1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.Y1) {
                    this.l.C2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.O1) {
                    this.l.r2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.X1) {
                    this.l.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.I1) {
                    this.l.l2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.Q1) {
                    this.l.t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.K1) {
                    this.l.n2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.S1) {
                    this.l.v2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g29.M1) {
                    this.l.p2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.H1) {
                    this.l.k2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.P1) {
                    this.l.s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.J1) {
                    this.l.m2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.R1) {
                    this.l.u2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.V1) {
                    this.l.z2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g29.L1) {
                    this.l.o2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == g29.U1) {
                    this.l.y2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == g29.N1) {
                    this.l.q2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.W1) {
                    this.l.A2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g29.T1) {
                    this.l.w2(obtainStyledAttributes.getInt(index, -1));
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
        if (eo4Var instanceof nz3) {
            nz3 nz3Var = (nz3) eo4Var;
            int i = bVar.Y;
            if (i != -1) {
                nz3Var.x2(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void r(lr1 lr1Var, boolean z) {
        this.l.o1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.k2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.l2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.m2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.n2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.o2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.p2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.q2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.r2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.w2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.x2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.D1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.E1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.G1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.H1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.J1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.y2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.z2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.A2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.C2(i);
        requestLayout();
    }

    @Override // defpackage.r1c
    public void y(s1c s1cVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (s1cVar != null) {
            s1cVar.x1(mode, size, mode2, size2);
            setMeasuredDimension(s1cVar.s1(), s1cVar.r1());
            return;
        }
        setMeasuredDimension(0, 0);
    }
}
