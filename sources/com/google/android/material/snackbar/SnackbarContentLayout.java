package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements eu1 {
    private TextView a;
    private Button b;
    private int c;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(@NonNull View view, int i, int i2) {
        if (syb.a0(view)) {
            syb.J0(view, syb.J(view), i, syb.I(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        d(this.a, i2, i3);
        return true;
    }

    @Override // defpackage.eu1
    public void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.eu1
    public void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f) {
        if (f != 1.0f) {
            this.b.setTextColor(ba6.h(ba6.d(this, qv8.colorSurface), this.b.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(ky8.snackbar_text);
        this.b = (Button) findViewById(ky8.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(ww8.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(ww8.design_snackbar_padding_vertical);
        if (this.a.getLayout().getLineCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.c > 0 && this.b.getMeasuredWidth() > this.c) {
            if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.c = i;
    }
}
