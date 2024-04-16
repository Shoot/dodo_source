package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    private ValueAnimator a;
    private boolean b;
    private float c;
    private float d;
    private boolean e;
    private int f;
    private final List<c> g;
    private final int h;
    private final float i;
    private final Paint j;
    private final RectF k;
    private final int l;
    private float m;
    private boolean n;
    private double o;
    private int p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.materialClockStyle);
    }

    private void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.j.setStrokeWidth(0.0f);
        canvas.drawCircle((this.p * ((float) Math.cos(this.o))) + width2, (this.p * ((float) Math.sin(this.o))) + f, this.h, this.j);
        double sin = Math.sin(this.o);
        double cos = Math.cos(this.o);
        this.j.setStrokeWidth(this.l);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.j);
        canvas.drawCircle(width2, f, this.i, this.j);
    }

    private int e(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            return degrees + 450;
        }
        return i;
    }

    private Pair<Float, Float> h(float f) {
        float f2 = f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    private boolean i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float e = e(f, f2);
        boolean z5 = false;
        if (f() != e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.b) {
            z5 = true;
        }
        l(e, z5);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.m = f2;
        this.o = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.p * ((float) Math.cos(this.o)));
        float height = (getHeight() / 2) + (this.p * ((float) Math.sin(this.o)));
        RectF rectF = this.k;
        int i = this.h;
        rectF.set(width - i, height - i, width + i, height + i);
        for (c cVar : this.g) {
            cVar.a(f2, z);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.g.add(cVar);
    }

    public RectF d() {
        return this.k;
    }

    public float f() {
        return this.m;
    }

    public int g() {
        return this.h;
    }

    public void j(int i) {
        this.p = i;
        invalidate();
    }

    public void k(float f) {
        l(f, false);
    }

    public void l(float f, boolean z) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f, false);
            return;
        }
        Pair<Float, Float> h = h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h.first).floatValue(), ((Float) h.second).floatValue());
        this.a = ofFloat;
        ofFloat.setDuration(200L);
        this.a.addUpdateListener(new a());
        this.a.addListener(new b());
        this.a.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z = false;
                z2 = false;
            } else {
                int i = (int) (x - this.c);
                int i2 = (int) (y - this.d);
                if ((i * i) + (i2 * i2) > this.f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.e = z4;
                z = this.n;
                if (actionMasked == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z5;
                z2 = false;
                this.n |= i(x, y, z, z2, z3);
                return true;
            }
        } else {
            this.c = x;
            this.d = y;
            this.e = true;
            this.n = false;
            z = false;
            z2 = true;
        }
        z3 = false;
        this.n |= i(x, y, z, z2, z3);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ArrayList();
        Paint paint = new Paint();
        this.j = paint;
        this.k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.E1, i, i19.Widget_MaterialComponents_TimePicker_Clock);
        this.p = obtainStyledAttributes.getDimensionPixelSize(b29.G1, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(b29.H1, 0);
        Resources resources = getResources();
        this.l = resources.getDimensionPixelSize(ww8.material_clock_hand_stroke_width);
        this.i = resources.getDimensionPixelSize(ww8.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(b29.F1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        syb.F0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
