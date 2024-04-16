package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public final class LinearProgressIndicator extends a<k> {
    public static final int p = i19.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.linearProgressIndicatorStyle);
    }

    private void s() {
        setIndeterminateDrawable(g.s(getContext(), (k) this.a));
        setProgressDrawable(c.u(getContext(), (k) this.a));
    }

    public int getIndeterminateAnimationType() {
        return ((k) this.a).g;
    }

    public int getIndicatorDirection() {
        return ((k) this.a).h;
    }

    @Override // com.google.android.material.progressindicator.a
    public void o(int i, boolean z) {
        S s = this.a;
        if (s != 0 && ((k) s).g == 0 && isIndeterminate()) {
            return;
        }
        super.o(i, z);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.a;
        k kVar = (k) s;
        boolean z2 = true;
        if (((k) s).h != 1 && ((syb.E(this) != 1 || ((k) this.a).h != 2) && (syb.E(this) != 0 || ((k) this.a).h != 3))) {
            z2 = false;
        }
        kVar.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        g<k> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        c<k> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r */
    public k i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((k) this.a).g == i) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.a;
        ((k) s).g = i;
        ((k) s).e();
        if (i == 0) {
            getIndeterminateDrawable().v(new i((k) this.a));
        } else {
            getIndeterminateDrawable().v(new j(getContext(), (k) this.a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((k) this.a).e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.a;
        ((k) s).h = i;
        k kVar = (k) s;
        boolean z = true;
        if (i != 1 && ((syb.E(this) != 1 || ((k) this.a).h != 2) && (syb.E(this) != 0 || i != 3))) {
            z = false;
        }
        kVar.i = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((k) this.a).e();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, p);
        s();
    }
}
