package defpackage;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
/* compiled from: MotionHelper.java */
/* renamed from: zo6  reason: default package */
/* loaded from: classes.dex */
public class zo6 extends b implements MotionLayout.k {
    private boolean j;
    private boolean k;
    private float l;
    protected View[] m;

    public boolean A() {
        return this.j;
    }

    public float getProgress() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void p(AttributeSet attributeSet) {
        super.p(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.C8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.E8) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == g29.D8) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.b > 0) {
            this.m = o((ConstraintLayout) getParent());
            while (i < this.b) {
                F(this.m[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof zo6)) {
                F(childAt, f);
            }
            i++;
        }
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        return this.k;
    }

    public void B(MotionLayout motionLayout) {
    }

    public void C(Canvas canvas) {
    }

    public void D(Canvas canvas) {
    }

    public void E(MotionLayout motionLayout, HashMap<View, j> hashMap) {
    }

    public void F(View view, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void b(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void c(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void d(MotionLayout motionLayout, int i, boolean z, float f) {
    }
}
