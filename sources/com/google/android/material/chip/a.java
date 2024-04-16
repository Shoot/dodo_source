package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import defpackage.tab;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public class a extends fa6 implements ghb, Drawable.Callback, tab.b {
    private static final int[] V5 = {16842910};
    private static final ShapeDrawable W5 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private int A5;
    private float B;
    private int B5;
    private int C5;
    private int D5;
    private int E5;
    private int F5;
    private boolean G5;
    private int H5;
    private float I;
    private int I5;
    private ColorFilter J5;
    private PorterDuffColorFilter K5;
    private ColorStateList L5;
    private PorterDuff.Mode M5;
    private int[] N5;
    private boolean O5;
    private ColorStateList P5;
    @NonNull
    private WeakReference<InterfaceC0227a> Q5;
    private TextUtils.TruncateAt R5;
    private CharSequence S4;
    private boolean S5;
    private boolean T4;
    private int T5;
    private Drawable U4;
    private boolean U5;
    private ColorStateList V4;
    private float W4;
    private ColorStateList X;
    private boolean X4;
    private float Y;
    private boolean Y4;
    private ColorStateList Z;
    private Drawable Z4;
    private Drawable a5;
    private ColorStateList b5;
    private float c5;
    private CharSequence d5;
    private boolean e5;
    private boolean f5;
    private Drawable g5;
    private ColorStateList h5;
    private bp6 i5;
    private bp6 j5;
    private float k5;
    private float l5;
    private float m5;
    private float n5;
    private float o5;
    private float p5;
    private float q5;
    private float r5;
    @NonNull
    private final Context s5;
    private final Paint t5;
    private final Paint u5;
    private final Paint.FontMetrics v5;
    private final RectF w5;
    private final PointF x5;
    private final Path y5;
    private ColorStateList z;
    @NonNull
    private final tab z5;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0227a {
        void a();
    }

    private a(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = -1.0f;
        this.t5 = new Paint(1);
        this.v5 = new Paint.FontMetrics();
        this.w5 = new RectF();
        this.x5 = new PointF();
        this.y5 = new Path();
        this.I5 = 255;
        this.M5 = PorterDuff.Mode.SRC_IN;
        this.Q5 = new WeakReference<>(null);
        Q(context);
        this.s5 = context;
        tab tabVar = new tab(this);
        this.z5 = tabVar;
        this.S4 = "";
        tabVar.e().density = context.getResources().getDisplayMetrics().density;
        this.u5 = null;
        int[] iArr = V5;
        setState(iArr);
        q2(iArr);
        this.S5 = true;
        if (rm9.a) {
            W5.setTint(-1);
        }
    }

    @NonNull
    public static a A0(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.z1(attributeSet, i, i2);
        return aVar;
    }

    private void B0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (R2()) {
            q0(rect, this.w5);
            RectF rectF = this.w5;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.g5.setBounds(0, 0, (int) this.w5.width(), (int) this.w5.height());
            this.g5.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean B1(@androidx.annotation.NonNull int[] r7, @androidx.annotation.NonNull int[] r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.B1(int[], int[]):boolean");
    }

    private void C0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.U5) {
            this.t5.setColor(this.B5);
            this.t5.setStyle(Paint.Style.FILL);
            this.t5.setColorFilter(q1());
            this.w5.set(rect);
            canvas.drawRoundRect(this.w5, N0(), N0(), this.t5);
        }
    }

    private void D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (S2()) {
            q0(rect, this.w5);
            RectF rectF = this.w5;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.U4.setBounds(0, 0, (int) this.w5.width(), (int) this.w5.height());
            this.U4.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.Y > 0.0f && !this.U5) {
            this.t5.setColor(this.D5);
            this.t5.setStyle(Paint.Style.STROKE);
            if (!this.U5) {
                this.t5.setColorFilter(q1());
            }
            RectF rectF = this.w5;
            float f = this.Y;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.I - (this.Y / 2.0f);
            canvas.drawRoundRect(this.w5, f2, f2, this.t5);
        }
    }

    private void F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.U5) {
            this.t5.setColor(this.A5);
            this.t5.setStyle(Paint.Style.FILL);
            this.w5.set(rect);
            canvas.drawRoundRect(this.w5, N0(), N0(), this.t5);
        }
    }

    private void G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (T2()) {
            t0(rect, this.w5);
            RectF rectF = this.w5;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.Z4.setBounds(0, 0, (int) this.w5.width(), (int) this.w5.height());
            if (rm9.a) {
                this.a5.setBounds(this.Z4.getBounds());
                this.a5.jumpToCurrentState();
                this.a5.draw(canvas);
            } else {
                this.Z4.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.t5.setColor(this.E5);
        this.t5.setStyle(Paint.Style.FILL);
        this.w5.set(rect);
        if (!this.U5) {
            canvas.drawRoundRect(this.w5, N0(), N0(), this.t5);
            return;
        }
        h(new RectF(rect), this.y5);
        super.q(canvas, this.t5, this.y5, u());
    }

    private void I0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Paint paint = this.u5;
        if (paint != null) {
            paint.setColor(qf1.p(-16777216, 127));
            canvas.drawRect(rect, this.u5);
            if (S2() || R2()) {
                q0(rect, this.w5);
                canvas.drawRect(this.w5, this.u5);
            }
            if (this.S4 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.u5);
            }
            if (T2()) {
                t0(rect, this.w5);
                canvas.drawRect(this.w5, this.u5);
            }
            this.u5.setColor(qf1.p(-65536, 127));
            s0(rect, this.w5);
            canvas.drawRect(this.w5, this.u5);
            this.u5.setColor(qf1.p(-16711936, 127));
            u0(rect, this.w5);
            canvas.drawRect(this.w5, this.u5);
        }
    }

    private void J0(@NonNull Canvas canvas, @NonNull Rect rect) {
        boolean z;
        if (this.S4 != null) {
            Paint.Align y0 = y0(rect, this.x5);
            w0(rect, this.w5);
            if (this.z5.d() != null) {
                this.z5.e().drawableState = getState();
                this.z5.j(this.s5);
            }
            this.z5.e().setTextAlign(y0);
            int i = 0;
            if (Math.round(this.z5.f(m1().toString())) > Math.round(this.w5.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.w5);
            }
            CharSequence charSequence = this.S4;
            if (z && this.R5 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.z5.e(), this.w5.width(), this.R5);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.x5;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.z5.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private boolean R2() {
        if (this.f5 && this.g5 != null && this.G5) {
            return true;
        }
        return false;
    }

    private boolean S2() {
        if (this.T4 && this.U4 != null) {
            return true;
        }
        return false;
    }

    private boolean T2() {
        if (this.Y4 && this.Z4 != null) {
            return true;
        }
        return false;
    }

    private void U2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void V2() {
        ColorStateList colorStateList;
        if (this.O5) {
            colorStateList = rm9.d(this.Z);
        } else {
            colorStateList = null;
        }
        this.P5 = colorStateList;
    }

    @TargetApi(21)
    private void W2() {
        this.a5 = new RippleDrawable(rm9.d(k1()), this.Z4, W5);
    }

    private float e1() {
        Drawable drawable;
        if (this.G5) {
            drawable = this.g5;
        } else {
            drawable = this.U4;
        }
        float f = this.W4;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(z0c.c(this.s5, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    private float f1() {
        Drawable drawable;
        if (this.G5) {
            drawable = this.g5;
        } else {
            drawable = this.U4;
        }
        float f = this.W4;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    private void g2(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    private void p0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        f83.m(drawable, f83.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z4) {
            if (drawable.isStateful()) {
                drawable.setState(b1());
            }
            f83.o(drawable, this.b5);
            return;
        }
        Drawable drawable2 = this.U4;
        if (drawable == drawable2 && this.X4) {
            f83.o(drawable2, this.V4);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void q0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (S2() || R2()) {
            float f = this.k5 + this.l5;
            float f1 = f1();
            if (f83.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + f1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - f1;
            }
            float e1 = e1();
            float exactCenterY = rect.exactCenterY() - (e1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + e1;
        }
    }

    private ColorFilter q1() {
        ColorFilter colorFilter = this.J5;
        if (colorFilter == null) {
            return this.K5;
        }
        return colorFilter;
    }

    private void s0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (T2()) {
            float f = this.r5 + this.q5 + this.c5 + this.p5 + this.o5;
            if (f83.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private static boolean s1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void t0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f = this.r5 + this.q5;
            if (f83.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.c5;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.c5;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.c5;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f = this.r5 + this.q5 + this.c5 + this.p5 + this.o5;
            if (f83.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void w0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.S4 != null) {
            float r0 = this.k5 + r0() + this.n5;
            float v0 = this.r5 + v0() + this.o5;
            if (f83.f(this) == 0) {
                rectF.left = rect.left + r0;
                rectF.right = rect.right - v0;
            } else {
                rectF.left = rect.left + v0;
                rectF.right = rect.right - r0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean w1(fab fabVar) {
        if (fabVar != null && fabVar.i() != null && fabVar.i().isStateful()) {
            return true;
        }
        return false;
    }

    private float x0() {
        this.z5.e().getFontMetrics(this.v5);
        Paint.FontMetrics fontMetrics = this.v5;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean x1(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    private static boolean y1(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    private boolean z0() {
        if (this.f5 && this.g5 != null && this.e5) {
            return true;
        }
        return false;
    }

    private void z1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = sdb.h(this.s5, attributeSet, b29.C0, i, i2, new int[0]);
        this.U5 = h.hasValue(b29.o1);
        g2(ea6.a(this.s5, h, b29.b1));
        K1(ea6.a(this.s5, h, b29.O0));
        Y1(h.getDimension(b29.W0, 0.0f));
        int i3 = b29.P0;
        if (h.hasValue(i3)) {
            M1(h.getDimension(i3, 0.0f));
        }
        c2(ea6.a(this.s5, h, b29.Z0));
        e2(h.getDimension(b29.a1, 0.0f));
        D2(ea6.a(this.s5, h, b29.n1));
        I2(h.getText(b29.I0));
        fab g = ea6.g(this.s5, h, b29.D0);
        g.l(h.getDimension(b29.E0, g.j()));
        if (Build.VERSION.SDK_INT < 23) {
            g.k(ea6.a(this.s5, h, b29.F0));
        }
        J2(g);
        int i4 = h.getInt(b29.G0, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    v2(TextUtils.TruncateAt.END);
                }
            } else {
                v2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            v2(TextUtils.TruncateAt.START);
        }
        X1(h.getBoolean(b29.V0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            X1(h.getBoolean(b29.S0, false));
        }
        Q1(ea6.e(this.s5, h, b29.R0));
        int i5 = b29.U0;
        if (h.hasValue(i5)) {
            U1(ea6.a(this.s5, h, i5));
        }
        S1(h.getDimension(b29.T0, -1.0f));
        t2(h.getBoolean(b29.i1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            t2(h.getBoolean(b29.d1, false));
        }
        h2(ea6.e(this.s5, h, b29.c1));
        r2(ea6.a(this.s5, h, b29.h1));
        m2(h.getDimension(b29.f1, 0.0f));
        C1(h.getBoolean(b29.J0, false));
        J1(h.getBoolean(b29.N0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            J1(h.getBoolean(b29.L0, false));
        }
        E1(ea6.e(this.s5, h, b29.K0));
        int i6 = b29.M0;
        if (h.hasValue(i6)) {
            G1(ea6.a(this.s5, h, i6));
        }
        G2(bp6.b(this.s5, h, b29.p1));
        w2(bp6.b(this.s5, h, b29.k1));
        a2(h.getDimension(b29.Y0, 0.0f));
        A2(h.getDimension(b29.m1, 0.0f));
        y2(h.getDimension(b29.l1, 0.0f));
        N2(h.getDimension(b29.r1, 0.0f));
        L2(h.getDimension(b29.q1, 0.0f));
        o2(h.getDimension(b29.g1, 0.0f));
        j2(h.getDimension(b29.e1, 0.0f));
        O1(h.getDimension(b29.Q0, 0.0f));
        C2(h.getDimensionPixelSize(b29.H0, Integer.MAX_VALUE));
        h.recycle();
    }

    protected void A1() {
        InterfaceC0227a interfaceC0227a = this.Q5.get();
        if (interfaceC0227a != null) {
            interfaceC0227a.a();
        }
    }

    public void A2(float f) {
        if (this.l5 != f) {
            float r0 = r0();
            this.l5 = f;
            float r02 = r0();
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    public void B2(int i) {
        A2(this.s5.getResources().getDimension(i));
    }

    public void C1(boolean z) {
        if (this.e5 != z) {
            this.e5 = z;
            float r0 = r0();
            if (!z && this.G5) {
                this.G5 = false;
            }
            float r02 = r0();
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    public void C2(int i) {
        this.T5 = i;
    }

    public void D1(int i) {
        C1(this.s5.getResources().getBoolean(i));
    }

    public void D2(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            V2();
            onStateChange(getState());
        }
    }

    public void E1(Drawable drawable) {
        if (this.g5 != drawable) {
            float r0 = r0();
            this.g5 = drawable;
            float r02 = r0();
            U2(this.g5);
            p0(this.g5);
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    public void E2(int i) {
        D2(on.a(this.s5, i));
    }

    public void F1(int i) {
        E1(on.b(this.s5, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F2(boolean z) {
        this.S5 = z;
    }

    public void G1(ColorStateList colorStateList) {
        if (this.h5 != colorStateList) {
            this.h5 = colorStateList;
            if (z0()) {
                f83.o(this.g5, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void G2(bp6 bp6Var) {
        this.i5 = bp6Var;
    }

    public void H1(int i) {
        G1(on.a(this.s5, i));
    }

    public void H2(int i) {
        G2(bp6.c(this.s5, i));
    }

    public void I1(int i) {
        J1(this.s5.getResources().getBoolean(i));
    }

    public void I2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.S4, charSequence)) {
            this.S4 = charSequence;
            this.z5.i(true);
            invalidateSelf();
            A1();
        }
    }

    public void J1(boolean z) {
        if (this.f5 != z) {
            boolean R2 = R2();
            this.f5 = z;
            boolean R22 = R2();
            if (R2 != R22) {
                if (R22) {
                    p0(this.g5);
                } else {
                    U2(this.g5);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public void J2(fab fabVar) {
        this.z5.h(fabVar, this.s5);
    }

    public Drawable K0() {
        return this.g5;
    }

    public void K1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void K2(int i) {
        J2(new fab(this.s5, i));
    }

    public ColorStateList L0() {
        return this.h5;
    }

    public void L1(int i) {
        K1(on.a(this.s5, i));
    }

    public void L2(float f) {
        if (this.o5 != f) {
            this.o5 = f;
            invalidateSelf();
            A1();
        }
    }

    public ColorStateList M0() {
        return this.A;
    }

    @Deprecated
    public void M1(float f) {
        if (this.I != f) {
            this.I = f;
            setShapeAppearanceModel(E().w(f));
        }
    }

    public void M2(int i) {
        L2(this.s5.getResources().getDimension(i));
    }

    public float N0() {
        if (this.U5) {
            return J();
        }
        return this.I;
    }

    @Deprecated
    public void N1(int i) {
        M1(this.s5.getResources().getDimension(i));
    }

    public void N2(float f) {
        if (this.n5 != f) {
            this.n5 = f;
            invalidateSelf();
            A1();
        }
    }

    public float O0() {
        return this.r5;
    }

    public void O1(float f) {
        if (this.r5 != f) {
            this.r5 = f;
            invalidateSelf();
            A1();
        }
    }

    public void O2(int i) {
        N2(this.s5.getResources().getDimension(i));
    }

    public Drawable P0() {
        Drawable drawable = this.U4;
        if (drawable != null) {
            return f83.q(drawable);
        }
        return null;
    }

    public void P1(int i) {
        O1(this.s5.getResources().getDimension(i));
    }

    public void P2(boolean z) {
        if (this.O5 != z) {
            this.O5 = z;
            V2();
            onStateChange(getState());
        }
    }

    public float Q0() {
        return this.W4;
    }

    public void Q1(Drawable drawable) {
        Drawable drawable2;
        Drawable P0 = P0();
        if (P0 != drawable) {
            float r0 = r0();
            if (drawable != null) {
                drawable2 = f83.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.U4 = drawable2;
            float r02 = r0();
            U2(P0);
            if (S2()) {
                p0(this.U4);
            }
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q2() {
        return this.S5;
    }

    public ColorStateList R0() {
        return this.V4;
    }

    public void R1(int i) {
        Q1(on.b(this.s5, i));
    }

    public float S0() {
        return this.B;
    }

    public void S1(float f) {
        if (this.W4 != f) {
            float r0 = r0();
            this.W4 = f;
            float r02 = r0();
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    public float T0() {
        return this.k5;
    }

    public void T1(int i) {
        S1(this.s5.getResources().getDimension(i));
    }

    public ColorStateList U0() {
        return this.X;
    }

    public void U1(ColorStateList colorStateList) {
        this.X4 = true;
        if (this.V4 != colorStateList) {
            this.V4 = colorStateList;
            if (S2()) {
                f83.o(this.U4, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float V0() {
        return this.Y;
    }

    public void V1(int i) {
        U1(on.a(this.s5, i));
    }

    public Drawable W0() {
        Drawable drawable = this.Z4;
        if (drawable != null) {
            return f83.q(drawable);
        }
        return null;
    }

    public void W1(int i) {
        X1(this.s5.getResources().getBoolean(i));
    }

    public CharSequence X0() {
        return this.d5;
    }

    public void X1(boolean z) {
        if (this.T4 != z) {
            boolean S2 = S2();
            this.T4 = z;
            boolean S22 = S2();
            if (S2 != S22) {
                if (S22) {
                    p0(this.U4);
                } else {
                    U2(this.U4);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public float Y0() {
        return this.q5;
    }

    public void Y1(float f) {
        if (this.B != f) {
            this.B = f;
            invalidateSelf();
            A1();
        }
    }

    public float Z0() {
        return this.c5;
    }

    public void Z1(int i) {
        Y1(this.s5.getResources().getDimension(i));
    }

    @Override // defpackage.tab.b
    public void a() {
        A1();
        invalidateSelf();
    }

    public float a1() {
        return this.p5;
    }

    public void a2(float f) {
        if (this.k5 != f) {
            this.k5 = f;
            invalidateSelf();
            A1();
        }
    }

    @NonNull
    public int[] b1() {
        return this.N5;
    }

    public void b2(int i) {
        a2(this.s5.getResources().getDimension(i));
    }

    public ColorStateList c1() {
        return this.b5;
    }

    public void c2(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.U5) {
                k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d1(@NonNull RectF rectF) {
        u0(getBounds(), rectF);
    }

    public void d2(int i) {
        c2(on.a(this.s5, i));
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.I5;
            if (i2 < 255) {
                i = rn0.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            F0(canvas, bounds);
            C0(canvas, bounds);
            if (this.U5) {
                super.draw(canvas);
            }
            E0(canvas, bounds);
            H0(canvas, bounds);
            D0(canvas, bounds);
            B0(canvas, bounds);
            if (this.S5) {
                J0(canvas, bounds);
            }
            G0(canvas, bounds);
            I0(canvas, bounds);
            if (this.I5 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void e2(float f) {
        if (this.Y != f) {
            this.Y = f;
            this.t5.setStrokeWidth(f);
            if (this.U5) {
                super.l0(f);
            }
            invalidateSelf();
        }
    }

    public void f2(int i) {
        e2(this.s5.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt g1() {
        return this.R5;
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.I5;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.J5;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.k5 + r0() + this.n5 + this.z5.f(m1().toString()) + this.o5 + v0() + this.r5), this.T5);
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.U5) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.I);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.I);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public bp6 h1() {
        return this.j5;
    }

    public void h2(Drawable drawable) {
        Drawable drawable2;
        Drawable W0 = W0();
        if (W0 != drawable) {
            float v0 = v0();
            if (drawable != null) {
                drawable2 = f83.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.Z4 = drawable2;
            if (rm9.a) {
                W2();
            }
            float v02 = v0();
            U2(W0);
            if (T2()) {
                p0(this.Z4);
            }
            invalidateSelf();
            if (v0 != v02) {
                A1();
            }
        }
    }

    public float i1() {
        return this.m5;
    }

    public void i2(CharSequence charSequence) {
        if (this.d5 != charSequence) {
            this.d5 = bb0.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!x1(this.z) && !x1(this.A) && !x1(this.X) && ((!this.O5 || !x1(this.P5)) && !w1(this.z5.d()) && !z0() && !y1(this.U4) && !y1(this.g5) && !x1(this.L5))) {
            return false;
        }
        return true;
    }

    public float j1() {
        return this.l5;
    }

    public void j2(float f) {
        if (this.q5 != f) {
            this.q5 = f;
            invalidateSelf();
            if (T2()) {
                A1();
            }
        }
    }

    public ColorStateList k1() {
        return this.Z;
    }

    public void k2(int i) {
        j2(this.s5.getResources().getDimension(i));
    }

    public bp6 l1() {
        return this.i5;
    }

    public void l2(int i) {
        h2(on.b(this.s5, i));
    }

    public CharSequence m1() {
        return this.S4;
    }

    public void m2(float f) {
        if (this.c5 != f) {
            this.c5 = f;
            invalidateSelf();
            if (T2()) {
                A1();
            }
        }
    }

    public fab n1() {
        return this.z5.d();
    }

    public void n2(int i) {
        m2(this.s5.getResources().getDimension(i));
    }

    public float o1() {
        return this.o5;
    }

    public void o2(float f) {
        if (this.p5 != f) {
            this.p5 = f;
            invalidateSelf();
            if (T2()) {
                A1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S2()) {
            onLayoutDirectionChanged |= f83.m(this.U4, i);
        }
        if (R2()) {
            onLayoutDirectionChanged |= f83.m(this.g5, i);
        }
        if (T2()) {
            onLayoutDirectionChanged |= f83.m(this.Z4, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S2()) {
            onLevelChange |= this.U4.setLevel(i);
        }
        if (R2()) {
            onLevelChange |= this.g5.setLevel(i);
        }
        if (T2()) {
            onLevelChange |= this.Z4.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable, defpackage.tab.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.U5) {
            super.onStateChange(iArr);
        }
        return B1(iArr, b1());
    }

    public float p1() {
        return this.n5;
    }

    public void p2(int i) {
        o2(this.s5.getResources().getDimension(i));
    }

    public boolean q2(@NonNull int[] iArr) {
        if (!Arrays.equals(this.N5, iArr)) {
            this.N5 = iArr;
            if (T2()) {
                return B1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r0() {
        if (!S2() && !R2()) {
            return 0.0f;
        }
        return this.l5 + f1() + this.m5;
    }

    public boolean r1() {
        return this.O5;
    }

    public void r2(ColorStateList colorStateList) {
        if (this.b5 != colorStateList) {
            this.b5 = colorStateList;
            if (T2()) {
                f83.o(this.Z4, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s2(int i) {
        r2(on.a(this.s5, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.I5 != i) {
            this.I5 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.J5 != colorFilter) {
            this.J5 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.L5 != colorStateList) {
            this.L5 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.M5 != mode) {
            this.M5 = mode;
            this.K5 = v83.c(this, this.L5, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S2()) {
            visible |= this.U4.setVisible(z, z2);
        }
        if (R2()) {
            visible |= this.g5.setVisible(z, z2);
        }
        if (T2()) {
            visible |= this.Z4.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean t1() {
        return this.e5;
    }

    public void t2(boolean z) {
        if (this.Y4 != z) {
            boolean T2 = T2();
            this.Y4 = z;
            boolean T22 = T2();
            if (T2 != T22) {
                if (T22) {
                    p0(this.Z4);
                } else {
                    U2(this.Z4);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public boolean u1() {
        return y1(this.Z4);
    }

    public void u2(InterfaceC0227a interfaceC0227a) {
        this.Q5 = new WeakReference<>(interfaceC0227a);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v0() {
        if (T2()) {
            return this.p5 + this.c5 + this.q5;
        }
        return 0.0f;
    }

    public boolean v1() {
        return this.Y4;
    }

    public void v2(TextUtils.TruncateAt truncateAt) {
        this.R5 = truncateAt;
    }

    public void w2(bp6 bp6Var) {
        this.j5 = bp6Var;
    }

    public void x2(int i) {
        w2(bp6.c(this.s5, i));
    }

    @NonNull
    Paint.Align y0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.S4 != null) {
            float r0 = this.k5 + r0() + this.n5;
            if (f83.f(this) == 0) {
                pointF.x = rect.left + r0;
            } else {
                pointF.x = rect.right - r0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - x0();
        }
        return align;
    }

    public void y2(float f) {
        if (this.m5 != f) {
            float r0 = r0();
            this.m5 = f;
            float r02 = r0();
            invalidateSelf();
            if (r0 != r02) {
                A1();
            }
        }
    }

    public void z2(int i) {
        y2(this.s5.getResources().getDimension(i));
    }
}
