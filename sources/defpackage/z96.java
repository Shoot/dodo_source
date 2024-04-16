package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
/* compiled from: MaterialCheckBox.java */
/* renamed from: z96  reason: default package */
/* loaded from: classes2.dex */
public class z96 extends AppCompatCheckBox {
    private static final int h = i19.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;
    private boolean g;

    public z96(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[][] iArr = i;
            int[] iArr2 = new int[iArr.length];
            int d = ba6.d(this, qv8.k);
            int d2 = ba6.d(this, qv8.colorSurface);
            int d3 = ba6.d(this, qv8.colorOnSurface);
            iArr2[0] = ba6.h(d2, d, 1.0f);
            iArr2[1] = ba6.h(d2, d3, 0.54f);
            iArr2[2] = ba6.h(d2, d3, 0.38f);
            iArr2[3] = ba6.h(d2, d3, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && so1.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a;
        int i2;
        if (this.g && TextUtils.isEmpty(getText()) && (a = so1.a(this)) != null) {
            if (z0c.i(this)) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i2;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a.getBounds();
                f83.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.g = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            so1.c(this, getMaterialThemeColorsTintList());
        } else {
            so1.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z96(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = defpackage.z96.h
            android.content.Context r8 = defpackage.ia6.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.b29.A4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.b29.B4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = defpackage.ea6.a(r8, r9, r10)
            defpackage.so1.c(r7, r8)
        L28:
            int r8 = defpackage.b29.D4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f = r8
            int r8 = defpackage.b29.C4
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z96.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
