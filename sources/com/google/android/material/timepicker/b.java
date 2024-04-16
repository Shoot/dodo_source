package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
/* compiled from: RadialViewGroup.java */
/* loaded from: classes2.dex */
class b extends ConstraintLayout {
    private final Runnable a;
    private int b;
    private fa6 c;

    /* compiled from: RadialViewGroup.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
        }
    }

    public b(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable b() {
        fa6 fa6Var = new fa6();
        this.c = fa6Var;
        fa6Var.Z(new sc9(0.5f));
        this.c.b0(ColorStateList.valueOf(-1));
        return this.c;
    }

    private static boolean e(View view) {
        return "skip".equals(view.getTag());
    }

    private void g() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.a);
            handler.post(this.a);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(syb.m());
        }
        g();
    }

    public int c() {
        return this.b;
    }

    public void d(int i) {
        this.b = i;
        f();
    }

    protected void f() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (e(getChildAt(i2))) {
                i++;
            }
        }
        d dVar = new d();
        dVar.p(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = ky8.circle_center;
            if (id != i4 && !e(childAt)) {
                dVar.t(childAt.getId(), i4, this.b, f);
                f += 360.0f / (childCount - i);
            }
        }
        dVar.i(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c.b0(ColorStateList.valueOf(i));
    }

    public b(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(kz8.material_radial_view_group, this);
        syb.y0(this, b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.s6, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(b29.t6, 0);
        this.a = new a();
        obtainStyledAttributes.recycle();
    }
}
