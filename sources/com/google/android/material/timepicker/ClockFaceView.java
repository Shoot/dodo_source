package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.timepicker.ClockHandView;
import defpackage.d4;
import java.util.Arrays;
/* loaded from: classes2.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.c {
    private final ClockHandView d;
    private final Rect e;
    private final RectF f;
    private final SparseArray<TextView> g;
    private final s2 h;
    private final int[] i;
    private final float[] j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private String[] o;
    private float p;
    private final ColorStateList q;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.d(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.d.g()) - ClockFaceView.this.k);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class b extends s2 {
        b() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            int intValue = ((Integer) view.getTag(ky8.material_value_index)).intValue();
            if (intValue > 0) {
                d4Var.W0((View) ClockFaceView.this.g.get(intValue - 1));
            }
            d4Var.q0(d4.c.f(0, 1, intValue, 1, false, view.isSelected()));
            d4Var.o0(true);
            d4Var.b(d4.a.i);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
                ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.materialClockStyle);
    }

    private void k() {
        RectF d = this.d.d();
        for (int i = 0; i < this.g.size(); i++) {
            TextView textView = this.g.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.e);
                offsetDescendantRectToMyCoords(textView, this.e);
                textView.setSelected(d.contains(this.e.centerX(), this.e.centerY()));
                textView.getPaint().setShader(l(d, this.e, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient l(RectF rectF, Rect rect, TextView textView) {
        this.f.set(rect);
        this.f.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f.left, rectF.centerY() - this.f.top, rectF.width() * 0.5f, this.i, this.j, Shader.TileMode.CLAMP);
    }

    private static float m(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    private void o(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.g.size();
        for (int i2 = 0; i2 < Math.max(this.o.length, size); i2++) {
            TextView textView = this.g.get(i2);
            if (i2 >= this.o.length) {
                removeView(textView);
                this.g.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(kz8.material_clockface_textview, (ViewGroup) this, false);
                    this.g.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.o[i2]);
                textView.setTag(ky8.material_value_index, Integer.valueOf(i2));
                syb.u0(textView, this.h);
                textView.setTextColor(this.q);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.o[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f, boolean z) {
        if (Math.abs(this.p - f) > 0.001f) {
            this.p = f;
            k();
        }
    }

    @Override // com.google.android.material.timepicker.b
    public void d(int i) {
        if (i != c()) {
            super.d(i);
            this.d.j(c());
        }
    }

    public void n(String[] strArr, int i) {
        this.o = strArr;
        o(i);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d4.d1(accessibilityNodeInfo).p0(d4.b.d(1, this.o.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m = (int) (this.n / m(this.l / displayMetrics.heightPixels, this.m / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
        setMeasuredDimension(m, m);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new RectF();
        this.g = new SparseArray<>();
        this.j = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.B1, i, i19.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = ea6.a(context, obtainStyledAttributes, b29.D1);
        this.q = a2;
        LayoutInflater.from(context).inflate(kz8.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ky8.material_clock_hand);
        this.d = clockHandView;
        this.k = resources.getDimensionPixelSize(ww8.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.i = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = on.a(context, gw8.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = ea6.a(context, obtainStyledAttributes, b29.C1);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.h = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        n(strArr, 0);
        this.l = resources.getDimensionPixelSize(ww8.material_time_picker_minimum_screen_height);
        this.m = resources.getDimensionPixelSize(ww8.material_time_picker_minimum_screen_width);
        this.n = resources.getDimensionPixelSize(ww8.material_clock_size);
    }
}
