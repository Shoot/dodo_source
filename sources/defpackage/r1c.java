package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
/* compiled from: VirtualLayout.java */
/* renamed from: r1c  reason: default package */
/* loaded from: classes.dex */
public abstract class r1c extends b {
    private boolean j;
    private boolean k;

    public r1c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void k(ConstraintLayout constraintLayout) {
        j(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View viewById = constraintLayout.getViewById(this.a[i]);
                    if (viewById != null) {
                        if (this.j) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.k && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void p(AttributeSet attributeSet) {
        super.p(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.t1) {
                    this.j = true;
                } else if (index == g29.A1) {
                    this.k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        i();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        i();
    }

    public void y(s1c s1cVar, int i, int i2) {
    }
}
