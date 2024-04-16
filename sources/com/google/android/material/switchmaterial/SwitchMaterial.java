package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int n5 = i19.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] o5 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @NonNull
    private final te3 j5;
    private ColorStateList k5;
    private ColorStateList l5;
    private boolean m5;

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.T);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.k5 == null) {
            int d = ba6.d(this, qv8.colorSurface);
            int d2 = ba6.d(this, qv8.k);
            float dimension = getResources().getDimension(ww8.mtrl_switch_thumb_elevation);
            if (this.j5.e()) {
                dimension += z0c.h(this);
            }
            int c = this.j5.c(d, dimension);
            int[][] iArr = o5;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ba6.h(d, d2, 1.0f);
            iArr2[1] = c;
            iArr2[2] = ba6.h(d, d2, 0.38f);
            iArr2[3] = c;
            this.k5 = new ColorStateList(iArr, iArr2);
        }
        return this.k5;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.l5 == null) {
            int[][] iArr = o5;
            int[] iArr2 = new int[iArr.length];
            int d = ba6.d(this, qv8.colorSurface);
            int d2 = ba6.d(this, qv8.k);
            int d3 = ba6.d(this, qv8.colorOnSurface);
            iArr2[0] = ba6.h(d, d2, 0.54f);
            iArr2[1] = ba6.h(d, d3, 0.32f);
            iArr2[2] = ba6.h(d, d2, 0.12f);
            iArr2[3] = ba6.h(d, d3, 0.12f);
            this.l5 = new ColorStateList(iArr, iArr2);
        }
        return this.l5;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m5 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.m5 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m5 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.n5
            android.content.Context r7 = defpackage.ia6.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            te3 r7 = new te3
            r7.<init>(r0)
            r6.j5 = r7
            int[] r2 = defpackage.b29.J7
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r9 = defpackage.b29.K7
            boolean r7 = r8.getBoolean(r9, r7)
            r6.m5 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
