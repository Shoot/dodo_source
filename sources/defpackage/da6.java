package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.o;
/* compiled from: MaterialRadioButton.java */
/* renamed from: da6  reason: default package */
/* loaded from: classes2.dex */
public class da6 extends o {
    private static final int g = i19.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public da6(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.J);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int d = ba6.d(this, qv8.k);
            int d2 = ba6.d(this, qv8.colorOnSurface);
            int d3 = ba6.d(this, qv8.colorSurface);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ba6.h(d3, d, 1.0f);
            iArr2[1] = ba6.h(d3, d2, 0.54f);
            iArr2[2] = ba6.h(d3, d2, 0.38f);
            iArr2[3] = ba6.h(d3, d2, 0.38f);
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
    public da6(@androidx.annotation.NonNull android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = defpackage.da6.g
            android.content.Context r8 = defpackage.ia6.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.b29.F4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.b29.G4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = defpackage.ea6.a(r8, r9, r10)
            defpackage.so1.c(r7, r8)
        L28:
            int r8 = defpackage.b29.H4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da6.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
