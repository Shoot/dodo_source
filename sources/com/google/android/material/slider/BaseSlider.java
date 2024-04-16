package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.google.android.material.slider.BaseSlider;
import defpackage.d4;
import defpackage.d80;
import defpackage.e80;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends d80<S>, T extends e80<S>> extends View {
    private static final String q5 = "BaseSlider";
    static final int r5 = i19.Widget_MaterialComponents_Slider;
    private int A;
    private float B;
    private MotionEvent I;
    private cj5 S4;
    private boolean T4;
    private float U4;
    private float V4;
    private ArrayList<Float> W4;
    private int X4;
    private int Y4;
    private float Z4;
    @NonNull
    private final Paint a;
    private float[] a5;
    @NonNull
    private final Paint b;
    private boolean b5;
    @NonNull
    private final Paint c;
    private int c5;
    @NonNull
    private final Paint d;
    private boolean d5;
    @NonNull
    private final Paint e;
    private boolean e5;
    @NonNull
    private final Paint f;
    private boolean f5;
    @NonNull
    private final e g;
    @NonNull
    private ColorStateList g5;
    private final AccessibilityManager h;
    @NonNull
    private ColorStateList h5;
    private BaseSlider<S, L, T>.d i;
    @NonNull
    private ColorStateList i5;
    @NonNull
    private final f j;
    @NonNull
    private ColorStateList j5;
    @NonNull
    private final List<cjb> k;
    @NonNull
    private ColorStateList k5;
    @NonNull
    private final List<L> l;
    @NonNull
    private final fa6 l5;
    @NonNull
    private final List<T> m;
    private Drawable m5;
    private boolean n;
    @NonNull
    private List<Drawable> n5;
    private ValueAnimator o;
    private float o5;
    private ValueAnimator p;
    private int p5;
    private final int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();
        float a;
        float b;
        ArrayList<Float> c;
        float d;
        boolean e;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<SliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a */
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.d);
            parcel.writeBooleanArray(new boolean[]{this.e});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.d = parcel.readFloat();
            this.e = parcel.createBooleanArray()[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements f {
        final /* synthetic */ AttributeSet a;
        final /* synthetic */ int b;

        a(AttributeSet attributeSet, int i) {
            this.a = attributeSet;
            this.b = i;
        }

        @Override // com.google.android.material.slider.BaseSlider.f
        public cjb a() {
            TypedArray h = sdb.h(BaseSlider.this.getContext(), this.a, b29.X6, this.b, BaseSlider.r5, new int[0]);
            cjb X = BaseSlider.X(BaseSlider.this.getContext(), h);
            h.recycle();
            return X;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (cjb cjbVar : BaseSlider.this.k) {
                cjbVar.A0(floatValue);
            }
            syb.l0(BaseSlider.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (cjb cjbVar : BaseSlider.this.k) {
                z0c.f(BaseSlider.this).b(cjbVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        int a;

        private d() {
            this.a = -1;
        }

        void a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.g.W(this.a, 4);
        }

        /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    private static class e extends ln3 {
        private final BaseSlider<?, ?, ?> q;
        final Rect r;

        e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.r = new Rect();
            this.q = baseSlider;
        }

        @NonNull
        private String Y(int i) {
            if (i == this.q.getValues().size() - 1) {
                return this.q.getContext().getString(w09.material_slider_range_end);
            }
            if (i == 0) {
                return this.q.getContext().getString(w09.material_slider_range_start);
            }
            return "";
        }

        @Override // defpackage.ln3
        protected int B(float f, float f2) {
            for (int i = 0; i < this.q.getValues().size(); i++) {
                this.q.j0(i, this.r);
                if (this.r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.ln3
        protected void C(List<Integer> list) {
            for (int i = 0; i < this.q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.ln3
        protected boolean L(int i, int i2, Bundle bundle) {
            if (!this.q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float n = this.q.n(20);
                if (i2 == 8192) {
                    n = -n;
                }
                if (this.q.L()) {
                    n = -n;
                }
                if (this.q.h0(i, na6.a(this.q.getValues().get(i).floatValue() + n, this.q.getValueFrom(), this.q.getValueTo()))) {
                    this.q.k0();
                    this.q.postInvalidate();
                    E(i);
                    return true;
                }
                return false;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.q.h0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.q.k0();
                    this.q.postInvalidate();
                    E(i);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ln3
        protected void P(int i, d4 d4Var) {
            d4Var.b(d4.a.L);
            List<Float> values = this.q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.q.getValueFrom();
            float valueTo = this.q.getValueTo();
            if (this.q.isEnabled()) {
                if (floatValue > valueFrom) {
                    d4Var.a(8192);
                }
                if (floatValue < valueTo) {
                    d4Var.a(4096);
                }
            }
            d4Var.M0(d4.d.a(1, valueFrom, valueTo, floatValue));
            d4Var.n0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.q.getContentDescription() != null) {
                sb.append(this.q.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(Y(i));
                sb.append(this.q.C(floatValue));
            }
            d4Var.r0(sb.toString());
            this.q.j0(i, this.r);
            d4Var.i0(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface f {
        cjb a();
    }

    public BaseSlider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.sliderStyle);
    }

    private void A() {
        if (this.n) {
            this.n = false;
            ValueAnimator p = p(false);
            this.p = p;
            this.o = null;
            p.addListener(new c());
            this.p.start();
        }
    }

    private void B(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        S(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                S(Integer.MAX_VALUE);
                return;
            }
            R(Integer.MIN_VALUE);
            return;
        }
        R(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C(float f2) {
        String str;
        if (G()) {
            return this.S4.getFormattedValue(f2);
        }
        if (((int) f2) == f2) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f2));
    }

    private static float D(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f2;
    }

    private float E(int i, float f2) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.p5 == 0) {
            minSeparation = s(minSeparation);
        }
        if (L()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.W4.size()) {
            floatValue = this.V4;
        } else {
            floatValue = this.W4.get(i2).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            floatValue2 = this.U4;
        } else {
            floatValue2 = this.W4.get(i3).floatValue() + minSeparation;
        }
        return na6.a(f2, floatValue2, floatValue);
    }

    private int F(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private Drawable H(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        j(newDrawable);
        return newDrawable;
    }

    private void I() {
        this.a.setStrokeWidth(this.v);
        this.b.setStrokeWidth(this.v);
        this.e.setStrokeWidth(this.v / 2.0f);
        this.f.setStrokeWidth(this.v / 2.0f);
    }

    private boolean J() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean K(float f2) {
        double doubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.Z4)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    private void M(@NonNull Resources resources) {
        this.t = resources.getDimensionPixelSize(ww8.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ww8.mtrl_slider_track_side_padding);
        this.r = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.s = resources.getDimensionPixelSize(ww8.mtrl_slider_thumb_radius);
        this.x = resources.getDimensionPixelOffset(ww8.mtrl_slider_track_top);
        this.A = resources.getDimensionPixelSize(ww8.mtrl_slider_label_padding);
    }

    private void N() {
        if (this.Z4 <= 0.0f) {
            return;
        }
        m0();
        int min = Math.min((int) (((this.V4 - this.U4) / this.Z4) + 1.0f), (this.c5 / (this.v * 2)) + 1);
        float[] fArr = this.a5;
        if (fArr == null || fArr.length != min * 2) {
            this.a5 = new float[min * 2];
        }
        float f2 = this.c5 / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.a5;
            fArr2[i] = this.w + ((i / 2) * f2);
            fArr2[i + 1] = o();
        }
    }

    private void O(@NonNull Canvas canvas, int i, int i2) {
        if (e0()) {
            int T = (int) (this.w + (T(this.W4.get(this.Y4).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.z;
                canvas.clipRect(T - i3, i2 - i3, T + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(T, i2, this.z, this.d);
        }
    }

    private void P(@NonNull Canvas canvas) {
        if (this.b5 && this.Z4 > 0.0f) {
            float[] activeRange = getActiveRange();
            int Z = Z(this.a5, activeRange[0]);
            int Z2 = Z(this.a5, activeRange[1]);
            int i = Z * 2;
            canvas.drawPoints(this.a5, 0, i, this.e);
            int i2 = Z2 * 2;
            canvas.drawPoints(this.a5, i, i2 - i, this.f);
            float[] fArr = this.a5;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.e);
        }
    }

    private void Q() {
        this.w = this.r + Math.max(this.y - this.s, 0);
        if (syb.Y(this)) {
            l0(getWidth());
        }
    }

    private boolean R(int i) {
        int i2 = this.Y4;
        int c2 = (int) na6.c(i2 + i, 0L, this.W4.size() - 1);
        this.Y4 = c2;
        if (c2 == i2) {
            return false;
        }
        if (this.X4 != -1) {
            this.X4 = c2;
        }
        k0();
        postInvalidate();
        return true;
    }

    private boolean S(int i) {
        if (L()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return R(i);
    }

    private float T(float f2) {
        float f3 = this.U4;
        float f4 = (f2 - f3) / (this.V4 - f3);
        if (L()) {
            return 1.0f - f4;
        }
        return f4;
    }

    private Boolean U(int i, @NonNull KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    S(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    S(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        R(-1);
                        return Boolean.TRUE;
                    }
                }
                R(1);
                return Boolean.TRUE;
            }
            this.X4 = this.Y4;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(R(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(R(-1));
            }
            return Boolean.FALSE;
        }
    }

    private void V() {
        for (T t : this.m) {
            t.onStartTrackingTouch(this);
        }
    }

    private void W() {
        for (T t : this.m) {
            t.onStopTrackingTouch(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static cjb X(@NonNull Context context, @NonNull TypedArray typedArray) {
        return cjb.t0(context, null, 0, typedArray.getResourceId(b29.f7, i19.Widget_MaterialComponents_Tooltip));
    }

    private static int Z(float[] fArr, float f2) {
        return Math.round(f2 * ((fArr.length / 2) - 1));
    }

    private void a0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = sdb.h(context, attributeSet, b29.X6, i, r5, new int[0]);
        this.U4 = h.getFloat(b29.a7, 0.0f);
        this.V4 = h.getFloat(b29.b7, 1.0f);
        setValues(Float.valueOf(this.U4));
        this.Z4 = h.getFloat(b29.Z6, 0.0f);
        int i4 = b29.p7;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = b29.r7;
        }
        if (!hasValue) {
            i4 = b29.q7;
        }
        ColorStateList a2 = ea6.a(context, h, i2);
        if (a2 == null) {
            a2 = on.a(context, gw8.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a3 = ea6.a(context, h, i4);
        if (a3 == null) {
            a3 = on.a(context, gw8.material_slider_active_track_color);
        }
        setTrackActiveTintList(a3);
        this.l5.b0(ea6.a(context, h, b29.g7));
        int i5 = b29.j7;
        if (h.hasValue(i5)) {
            setThumbStrokeColor(ea6.a(context, h, i5));
        }
        setThumbStrokeWidth(h.getDimension(b29.k7, 0.0f));
        ColorStateList a4 = ea6.a(context, h, b29.c7);
        if (a4 == null) {
            a4 = on.a(context, gw8.material_slider_halo_color);
        }
        setHaloTintList(a4);
        this.b5 = h.getBoolean(b29.o7, true);
        int i6 = b29.l7;
        boolean hasValue2 = h.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = b29.n7;
        }
        if (!hasValue2) {
            i6 = b29.m7;
        }
        ColorStateList a5 = ea6.a(context, h, i3);
        if (a5 == null) {
            a5 = on.a(context, gw8.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a5);
        ColorStateList a6 = ea6.a(context, h, i6);
        if (a6 == null) {
            a6 = on.a(context, gw8.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a6);
        setThumbRadius(h.getDimensionPixelSize(b29.i7, 0));
        setHaloRadius(h.getDimensionPixelSize(b29.d7, 0));
        setThumbElevation(h.getDimension(b29.h7, 0.0f));
        setTrackHeight(h.getDimensionPixelSize(b29.s7, 0));
        setLabelBehavior(h.getInt(b29.e7, 0));
        if (!h.getBoolean(b29.Y6, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    private void b0(int i) {
        BaseSlider<S, L, T>.d dVar = this.i;
        if (dVar == null) {
            this.i = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.i.a(i);
        postDelayed(this.i, 200L);
    }

    private void c0(cjb cjbVar, float f2) {
        cjbVar.B0(C(f2));
        int T = (this.w + ((int) (T(f2) * this.c5))) - (cjbVar.getIntrinsicWidth() / 2);
        int o = o() - (this.A + this.y);
        cjbVar.setBounds(T, o - cjbVar.getIntrinsicHeight(), cjbVar.getIntrinsicWidth() + T, o);
        Rect rect = new Rect(cjbVar.getBounds());
        v03.c(z0c.e(this), this, rect);
        cjbVar.setBounds(rect);
        z0c.f(this).a(cjbVar);
    }

    private boolean d0() {
        if (this.u == 3) {
            return true;
        }
        return false;
    }

    private boolean e0() {
        if (!this.d5 && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    private boolean f0(float f2) {
        return h0(this.X4, f2);
    }

    private double g0(float f2) {
        float f3 = this.Z4;
        if (f3 > 0.0f) {
            int i = (int) ((this.V4 - this.U4) / f3);
            return Math.round(f2 * i) / i;
        }
        return f2;
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.W4.size() == 1) {
            floatValue2 = this.U4;
        }
        float T = T(floatValue2);
        float T2 = T(floatValue);
        return L() ? new float[]{T2, T} : new float[]{T, T2};
    }

    private float getValueOfTouchPosition() {
        double g0 = g0(this.o5);
        if (L()) {
            g0 = 1.0d - g0;
        }
        float f2 = this.V4;
        float f3 = this.U4;
        return (float) ((g0 * (f2 - f3)) + f3);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.o5;
        if (L()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.V4;
        float f4 = this.U4;
        return (f2 * (f3 - f4)) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h0(int i, float f2) {
        this.Y4 = i;
        if (Math.abs(f2 - this.W4.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.W4.set(i, Float.valueOf(E(i, f2)));
        t(i);
        return true;
    }

    private boolean i0() {
        return f0(getValueOfTouchPosition());
    }

    private void j(Drawable drawable) {
        int i = this.y * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = i / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    private void k(cjb cjbVar) {
        cjbVar.z0(z0c.e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        if (!e0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int T = (int) ((T(this.W4.get(this.Y4).floatValue()) * this.c5) + this.w);
                int o = o();
                int i = this.z;
                f83.l(background, T - i, o - i, T + i, o + i);
            }
        }
    }

    private Float l(int i) {
        float m;
        if (this.e5) {
            m = n(20);
        } else {
            m = m();
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 69) {
                    if (i != 70 && i != 81) {
                        return null;
                    }
                    return Float.valueOf(m);
                }
                return Float.valueOf(-m);
            }
            if (L()) {
                m = -m;
            }
            return Float.valueOf(m);
        }
        if (!L()) {
            m = -m;
        }
        return Float.valueOf(m);
    }

    private void l0(int i) {
        this.c5 = Math.max(i - (this.w * 2), 0);
        N();
    }

    private float m() {
        float f2 = this.Z4;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    private void m0() {
        if (this.f5) {
            p0();
            q0();
            o0();
            r0();
            n0();
            u0();
            this.f5 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n(int i) {
        float f2;
        float f3;
        float m = m();
        if ((this.V4 - this.U4) / m <= i) {
            return m;
        }
        return Math.round(f2 / f3) * m;
    }

    private void n0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f2 = this.Z4;
            if (f2 > 0.0f && minSeparation > 0.0f) {
                if (this.p5 == 1) {
                    if (minSeparation < f2 || !K(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.Z4), Float.valueOf(this.Z4)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.Z4)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    private int o() {
        int i = this.x;
        int i2 = 0;
        if (this.u == 1 || d0()) {
            i2 = this.k.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    private void o0() {
        if (this.Z4 > 0.0f && !s0(this.V4)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.Z4), Float.valueOf(this.U4), Float.valueOf(this.V4)));
        }
    }

    private ValueAnimator p(boolean z) {
        float f2;
        ValueAnimator valueAnimator;
        long j;
        TimeInterpolator timeInterpolator;
        float f3 = 1.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if (z) {
            valueAnimator = this.p;
        } else {
            valueAnimator = this.o;
        }
        float D = D(valueAnimator, f2);
        if (!z) {
            f3 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(D, f3);
        if (z) {
            j = 83;
        } else {
            j = 117;
        }
        ofFloat.setDuration(j);
        if (z) {
            timeInterpolator = sk.e;
        } else {
            timeInterpolator = sk.c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private void p0() {
        if (this.U4 < this.V4) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.U4), Float.valueOf(this.V4)));
    }

    private void q() {
        if (this.k.size() > this.W4.size()) {
            List<cjb> subList = this.k.subList(this.W4.size(), this.k.size());
            for (cjb cjbVar : subList) {
                if (syb.X(this)) {
                    r(cjbVar);
                }
            }
            subList.clear();
        }
        while (this.k.size() < this.W4.size()) {
            cjb a2 = this.j.a();
            this.k.add(a2);
            if (syb.X(this)) {
                k(a2);
            }
        }
        int i = 1;
        if (this.k.size() == 1) {
            i = 0;
        }
        for (cjb cjbVar2 : this.k) {
            cjbVar2.l0(i);
        }
    }

    private void q0() {
        if (this.V4 > this.U4) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.V4), Float.valueOf(this.U4)));
    }

    private void r(cjb cjbVar) {
        zzb f2 = z0c.f(this);
        if (f2 != null) {
            f2.b(cjbVar);
            cjbVar.v0(z0c.e(this));
        }
    }

    private void r0() {
        Iterator<Float> it = this.W4.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.U4 && next.floatValue() <= this.V4) {
                if (this.Z4 > 0.0f && !s0(next.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.U4), Float.valueOf(this.Z4), Float.valueOf(this.Z4)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.U4), Float.valueOf(this.V4)));
            }
        }
    }

    private float s(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = (f2 - this.w) / this.c5;
        float f4 = this.U4;
        return (f3 * (f4 - this.V4)) + f4;
    }

    private boolean s0(float f2) {
        return K(f2 - this.U4);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.W4.size() == arrayList.size() && this.W4.equals(arrayList)) {
                return;
            }
            this.W4 = arrayList;
            this.f5 = true;
            this.Y4 = 0;
            k0();
            q();
            u();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private void t(int i) {
        for (L l : this.l) {
            l.a(this, this.W4.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            b0(i);
        }
    }

    private float t0(float f2) {
        return (T(f2) * this.c5) + this.w;
    }

    private void u() {
        for (L l : this.l) {
            Iterator<Float> it = this.W4.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void u0() {
        float f2 = this.Z4;
        if (f2 == 0.0f) {
            return;
        }
        if (((int) f2) != f2) {
            Log.w(q5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f2)));
        }
        float f3 = this.U4;
        if (((int) f3) != f3) {
            Log.w(q5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f3)));
        }
        float f4 = this.V4;
        if (((int) f4) != f4) {
            Log.w(q5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f4)));
        }
    }

    private void v(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.w;
        float f2 = i;
        float f3 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f2), f3, i3 + (activeRange[1] * f2), f3, this.b);
    }

    private void w(@NonNull Canvas canvas, int i, int i2) {
        int i3;
        float[] activeRange = getActiveRange();
        float f2 = i;
        float f3 = this.w + (activeRange[1] * f2);
        if (f3 < i3 + i) {
            float f4 = i2;
            canvas.drawLine(f3, f4, i3 + i, f4, this.a);
        }
        int i4 = this.w;
        float f5 = i4 + (activeRange[0] * f2);
        if (f5 > i4) {
            float f6 = i2;
            canvas.drawLine(i4, f6, f5, f6, this.a);
        }
    }

    private void x(@NonNull Canvas canvas, int i, int i2, float f2, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.w + ((int) (T(f2) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void y(@NonNull Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.W4.size(); i3++) {
            float floatValue = this.W4.get(i3).floatValue();
            Drawable drawable = this.m5;
            if (drawable != null) {
                x(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.n5.size()) {
                x(canvas, i, i2, floatValue, this.n5.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.w + (T(floatValue) * i), i2, this.y, this.c);
                }
                x(canvas, i, i2, floatValue, this.l5);
            }
        }
    }

    private void z() {
        if (this.u == 2) {
            return;
        }
        if (!this.n) {
            this.n = true;
            ValueAnimator p = p(true);
            this.o = p;
            this.p = null;
            p.start();
        }
        Iterator<cjb> it = this.k.iterator();
        for (int i = 0; i < this.W4.size() && it.hasNext(); i++) {
            if (i != this.Y4) {
                c0(it.next(), this.W4.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            c0(it.next(), this.W4.get(this.Y4).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.k.size()), Integer.valueOf(this.W4.size())));
    }

    public boolean G() {
        if (this.S4 != null) {
            return true;
        }
        return false;
    }

    final boolean L() {
        if (syb.E(this) == 1) {
            return true;
        }
        return false;
    }

    protected boolean Y() {
        boolean z;
        if (this.X4 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float t0 = t0(valueOfTouchPositionAbsolute);
        this.X4 = 0;
        float abs = Math.abs(this.W4.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.W4.size(); i++) {
            float abs2 = Math.abs(this.W4.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float t02 = t0(this.W4.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!L() ? t02 - t0 < 0.0f : t02 - t0 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.X4 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(t02 - t0) < this.q) {
                    this.X4 = -1;
                    return false;
                } else if (z) {
                    this.X4 = i;
                }
            }
            abs = abs2;
        }
        if (this.X4 != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.g.v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(F(this.k5));
        this.b.setColor(F(this.j5));
        this.e.setColor(F(this.i5));
        this.f.setColor(F(this.h5));
        for (cjb cjbVar : this.k) {
            if (cjbVar.isStateful()) {
                cjbVar.setState(getDrawableState());
            }
        }
        if (this.l5.isStateful()) {
            this.l5.setState(getDrawableState());
        }
        this.d.setColor(F(this.g5));
        this.d.setAlpha(63);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.g.x();
    }

    public int getActiveThumbIndex() {
        return this.X4;
    }

    public int getFocusedThumbIndex() {
        return this.Y4;
    }

    public int getHaloRadius() {
        return this.z;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.g5;
    }

    public int getLabelBehavior() {
        return this.u;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.Z4;
    }

    public float getThumbElevation() {
        return this.l5.w();
    }

    public int getThumbRadius() {
        return this.y;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.l5.F();
    }

    public float getThumbStrokeWidth() {
        return this.l5.H();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.l5.x();
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.h5;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.i5;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.i5.equals(this.h5)) {
            return this.h5;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.j5;
    }

    public int getTrackHeight() {
        return this.v;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.k5;
    }

    public int getTrackSidePadding() {
        return this.w;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.k5.equals(this.j5)) {
            return this.j5;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.c5;
    }

    public float getValueFrom() {
        return this.U4;
    }

    public float getValueTo() {
        return this.V4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.W4);
    }

    public void h(@NonNull L l) {
        this.l.add(l);
    }

    public void i(@NonNull T t) {
        this.m.add(t);
    }

    void j0(int i, Rect rect) {
        int T = this.w + ((int) (T(getValues().get(i).floatValue()) * this.c5));
        int o = o();
        int i2 = this.y;
        rect.set(T - i2, o - i2, T + i2, o + i2);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (cjb cjbVar : this.k) {
            k(cjbVar);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.i;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.n = false;
        for (cjb cjbVar : this.k) {
            r(cjbVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.f5) {
            m0();
            N();
        }
        super.onDraw(canvas);
        int o = o();
        w(canvas, this.c5, o);
        if (((Float) Collections.max(getValues())).floatValue() > this.U4) {
            v(canvas, this.c5, o);
        }
        P(canvas);
        if ((this.T4 || isFocused() || d0()) && isEnabled()) {
            O(canvas, this.c5, o);
            if (this.X4 == -1 && !d0()) {
                A();
            } else {
                z();
            }
        } else {
            A();
        }
        y(canvas, this.c5, o);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.X4 = -1;
            this.g.o(this.Y4);
            return;
        }
        B(i);
        this.g.V(this.Y4);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.W4.size() == 1) {
            this.X4 = 0;
        }
        if (this.X4 == -1) {
            Boolean U = U(i, keyEvent);
            if (U != null) {
                return U.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.e5 |= keyEvent.isLongPress();
        Float l = l(i);
        if (l != null) {
            if (f0(this.W4.get(this.X4).floatValue() + l.floatValue())) {
                k0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return R(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return R(-1);
            }
        }
        this.X4 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.e5 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.t;
        int i4 = 0;
        if (this.u == 1 || d0()) {
            i4 = this.k.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.U4 = sliderState.a;
        this.V4 = sliderState.b;
        setValuesInternal(sliderState.c);
        this.Z4 = sliderState.d;
        if (sliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.a = this.U4;
        sliderState.b = this.V4;
        sliderState.c = new ArrayList<>(this.W4);
        sliderState.d = this.Z4;
        sliderState.e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        l0(i);
        k0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f2 = (x - this.w) / this.c5;
        this.o5 = f2;
        float max = Math.max(0.0f, f2);
        this.o5 = max;
        this.o5 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.T4) {
                        if (J() && Math.abs(x - this.B) < this.q) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        V();
                    }
                    if (Y()) {
                        this.T4 = true;
                        i0();
                        k0();
                        invalidate();
                    }
                }
            } else {
                this.T4 = false;
                MotionEvent motionEvent2 = this.I;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.I.getX() - motionEvent.getX()) <= this.q && Math.abs(this.I.getY() - motionEvent.getY()) <= this.q && Y()) {
                    V();
                }
                if (this.X4 != -1) {
                    i0();
                    this.X4 = -1;
                    W();
                }
                invalidate();
            }
        } else {
            this.B = x;
            if (!J()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (Y()) {
                    requestFocus();
                    this.T4 = true;
                    i0();
                    k0();
                    invalidate();
                    V();
                }
            }
        }
        setPressed(this.T4);
        this.I = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.X4 = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.W4.size()) {
            this.Y4 = i;
            this.g.V(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        Drawable background = getBackground();
        if (!e0() && (background instanceof RippleDrawable)) {
            v83.b((RippleDrawable) background, this.z);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.g5)) {
            return;
        }
        this.g5 = colorStateList;
        Drawable background = getBackground();
        if (!e0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.d.setColor(F(colorStateList));
        this.d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.u != i) {
            this.u = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(cj5 cj5Var) {
        this.S4 = cj5Var;
    }

    protected void setSeparationUnit(int i) {
        this.p5 = i;
        this.f5 = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.Z4 != f2) {
                this.Z4 = f2;
                this.f5 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f2), Float.valueOf(this.U4), Float.valueOf(this.V4)));
    }

    public void setThumbElevation(float f2) {
        this.l5.a0(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.y) {
            return;
        }
        this.y = i;
        Q();
        this.l5.setShapeAppearanceModel(uga.a().q(0, this.y).m());
        fa6 fa6Var = this.l5;
        int i2 = this.y;
        fa6Var.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.m5;
        if (drawable != null) {
            j(drawable);
        }
        for (Drawable drawable2 : this.n5) {
            j(drawable2);
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.l5.k0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(on.a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.l5.l0(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.l5.x())) {
            return;
        }
        this.l5.b0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.h5)) {
            return;
        }
        this.h5 = colorStateList;
        this.f.setColor(F(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.i5)) {
            return;
        }
        this.i5 = colorStateList;
        this.e.setColor(F(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.b5 != z) {
            this.b5 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.j5)) {
            return;
        }
        this.j5 = colorStateList;
        this.b.setColor(F(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.v != i) {
            this.v = i;
            I();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.k5)) {
            return;
        }
        this.k5 = colorStateList;
        this.a.setColor(F(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.U4 = f2;
        this.f5 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.V4 = f2;
        this.f5 = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(ia6.c(context, attributeSet, i, r5), attributeSet, i);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = false;
        this.T4 = false;
        this.W4 = new ArrayList<>();
        this.X4 = -1;
        this.Y4 = -1;
        this.Z4 = 0.0f;
        this.b5 = true;
        this.e5 = false;
        fa6 fa6Var = new fa6();
        this.l5 = fa6Var;
        this.n5 = Collections.emptyList();
        this.p5 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        M(context2.getResources());
        this.j = new a(attributeSet, i);
        a0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        fa6Var.h0(2);
        this.q = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.g = eVar;
        syb.u0(this, eVar);
        this.h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.m5 = H(drawable);
        this.n5.clear();
        postInvalidate();
    }

    void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.m5 = null;
        this.n5 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.n5.add(H(drawable));
        }
        postInvalidate();
    }
}
