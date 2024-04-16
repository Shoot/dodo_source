package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int l5 = i19.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] m5 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer g5;
    private boolean h5;
    private boolean i5;
    private ImageView.ScaleType j5;
    private Boolean k5;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.Y);
    }

    private Pair<Integer, Integer> R(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void S(Context context) {
        int i;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        fa6 fa6Var = new fa6();
        if (background != null) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        fa6Var.b0(ColorStateList.valueOf(i));
        fa6Var.Q(context);
        fa6Var.a0(syb.y(this));
        syb.y0(this, fa6Var);
    }

    private void T(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void U() {
        if (!this.h5 && !this.i5) {
            return;
        }
        TextView e = xib.e(this);
        TextView c = xib.c(this);
        if (e == null && c == null) {
            return;
        }
        Pair<Integer, Integer> R = R(e, c);
        if (this.h5 && e != null) {
            T(e, R);
        }
        if (this.i5 && c != null) {
            T(c, R);
        }
    }

    private Drawable V(Drawable drawable) {
        if (drawable != null && this.g5 != null) {
            Drawable r = f83.r(drawable.mutate());
            f83.n(r, this.g5.intValue());
            return r;
        }
        return drawable;
    }

    private void W() {
        ImageView b = xib.b(this);
        if (b != null) {
            Boolean bool = this.k5;
            if (bool != null) {
                b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.j5;
            if (scaleType != null) {
                b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.j5;
    }

    public Integer getNavigationIconTint() {
        return this.g5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        U();
        W();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ga6.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.k5;
        if (bool == null || bool.booleanValue() != z) {
            this.k5 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.j5 != scaleType) {
            this.j5 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.g5 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.i5 != z) {
            this.i5 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.h5 != z) {
            this.h5 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.l5
            android.content.Context r8 = defpackage.ia6.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.b29.U4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.b29.X4
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = defpackage.b29.Z4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.h5 = r10
            int r10 = defpackage.b29.Y4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.i5 = r10
            int r10 = defpackage.b29.W4
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.m5
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.j5 = r10
        L4a:
            int r10 = defpackage.b29.V4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.k5 = r10
        L5c:
            r9.recycle()
            r7.S(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
