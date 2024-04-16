package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
final class a {
    @NonNull
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final uga f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, uga ugaVar, @NonNull Rect rect) {
        kh8.c(rect.left);
        kh8.c(rect.top);
        kh8.c(rect.right);
        kh8.c(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = ugaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static a a(@NonNull Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        kh8.a(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b29.e4);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(b29.f4, 0), obtainStyledAttributes.getDimensionPixelOffset(b29.h4, 0), obtainStyledAttributes.getDimensionPixelOffset(b29.g4, 0), obtainStyledAttributes.getDimensionPixelOffset(b29.i4, 0));
        ColorStateList a = ea6.a(context, obtainStyledAttributes, b29.j4);
        ColorStateList a2 = ea6.a(context, obtainStyledAttributes, b29.o4);
        ColorStateList a3 = ea6.a(context, obtainStyledAttributes, b29.m4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b29.n4, 0);
        uga m = uga.b(context, obtainStyledAttributes.getResourceId(b29.k4, 0), obtainStyledAttributes.getResourceId(b29.l4, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@NonNull TextView textView) {
        fa6 fa6Var = new fa6();
        fa6 fa6Var2 = new fa6();
        fa6Var.setShapeAppearanceModel(this.f);
        fa6Var2.setShapeAppearanceModel(this.f);
        fa6Var.b0(this.c);
        fa6Var.j0(this.e, this.d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), fa6Var, fa6Var2);
        Rect rect = this.a;
        syb.y0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
