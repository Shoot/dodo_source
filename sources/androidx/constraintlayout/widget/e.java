package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class e extends ViewGroup {
    d a;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float w0;
        public boolean x0;
        public float y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.w0 = 1.0f;
            this.x0 = false;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.w0 = 1.0f;
            this.x0 = false;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.I4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.J4) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == g29.U4) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                    this.x0 = true;
                } else if (index == g29.R4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == g29.S4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == g29.Q4) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == g29.O4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == g29.P4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == g29.K4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == g29.L4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == g29.M4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == g29.N4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == g29.T4) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.a == null) {
            this.a = new d();
        }
        this.a.r(this);
        return this.a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
