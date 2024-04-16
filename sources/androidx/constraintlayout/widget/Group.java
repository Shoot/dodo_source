package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Group extends b {
    public Group(Context context, AttributeSet attributeSet) {
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
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void p(AttributeSet attributeSet) {
        super.p(attributeSet);
        this.e = false;
    }

    @Override // androidx.constraintlayout.widget.b
    public void s(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.u0.f1(0);
        bVar.u0.G0(0);
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
}
