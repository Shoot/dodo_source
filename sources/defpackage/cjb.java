package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.tab;
/* compiled from: TooltipDrawable.java */
/* renamed from: cjb  reason: default package */
/* loaded from: classes2.dex */
public class cjb extends fa6 implements tab.b {
    private static final int c5 = i19.Widget_MaterialComponents_Tooltip;
    private static final int d5 = qv8.tooltipStyle;
    @NonNull
    private final Context A;
    private final Paint.FontMetrics B;
    @NonNull
    private final tab I;
    private int S4;
    private int T4;
    private int U4;
    private int V4;
    private int W4;
    @NonNull
    private final View.OnLayoutChangeListener X;
    private float X4;
    @NonNull
    private final Rect Y;
    private float Y4;
    private int Z;
    private final float Z4;
    private float a5;
    private float b5;
    private CharSequence z;

    /* compiled from: TooltipDrawable.java */
    /* renamed from: cjb$a */
    /* loaded from: classes2.dex */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            cjb.this.D0(view);
        }
    }

    private cjb(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = new Paint.FontMetrics();
        tab tabVar = new tab(this);
        this.I = tabVar;
        this.X = new a();
        this.Y = new Rect();
        this.X4 = 1.0f;
        this.Y4 = 1.0f;
        this.Z4 = 0.5f;
        this.a5 = 0.5f;
        this.b5 = 1.0f;
        this.A = context;
        tabVar.e().density = context.getResources().getDisplayMetrics().density;
        tabVar.e().setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.W4 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.Y);
    }

    private float q0() {
        int i;
        if (((this.Y.right - getBounds().right) - this.W4) - this.U4 < 0) {
            i = ((this.Y.right - getBounds().right) - this.W4) - this.U4;
        } else if (((this.Y.left - getBounds().left) - this.W4) + this.U4 > 0) {
            i = ((this.Y.left - getBounds().left) - this.W4) + this.U4;
        } else {
            return 0.0f;
        }
        return i;
    }

    private float r0() {
        this.I.e().getFontMetrics(this.B);
        Paint.FontMetrics fontMetrics = this.B;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float s0(@NonNull Rect rect) {
        return rect.centerY() - r0();
    }

    @NonNull
    public static cjb t0(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        cjb cjbVar = new cjb(context, attributeSet, i, i2);
        cjbVar.y0(attributeSet, i, i2);
        return cjbVar;
    }

    private zc3 u0() {
        float width = ((float) (getBounds().width() - (this.V4 * Math.sqrt(2.0d)))) / 2.0f;
        return new w67(new o86(this.V4), Math.min(Math.max(-q0(), -width), width));
    }

    private void w0(@NonNull Canvas canvas) {
        if (this.z == null) {
            return;
        }
        Rect bounds = getBounds();
        int s0 = (int) s0(bounds);
        if (this.I.d() != null) {
            this.I.e().drawableState = getState();
            this.I.j(this.A);
            this.I.e().setAlpha((int) (this.b5 * 255.0f));
        }
        CharSequence charSequence = this.z;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), s0, this.I.e());
    }

    private float x0() {
        CharSequence charSequence = this.z;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.I.f(charSequence.toString());
    }

    private void y0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = sdb.h(this.A, attributeSet, b29.W9, i, i2, new int[0]);
        this.V4 = this.A.getResources().getDimensionPixelSize(ww8.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(E().v().s(u0()).m());
        B0(h.getText(b29.da));
        fab g = ea6.g(this.A, h, b29.X9);
        if (g != null) {
            int i3 = b29.Y9;
            if (h.hasValue(i3)) {
                g.k(ea6.a(this.A, h, i3));
            }
        }
        C0(g);
        b0(ColorStateList.valueOf(h.getColor(b29.ea, ba6.g(qf1.p(ba6.c(this.A, 16842801, cjb.class.getCanonicalName()), 229), qf1.p(ba6.c(this.A, qv8.colorOnBackground, cjb.class.getCanonicalName()), 153)))));
        k0(ColorStateList.valueOf(ba6.c(this.A, qv8.colorSurface, cjb.class.getCanonicalName())));
        this.Z = h.getDimensionPixelSize(b29.Z9, 0);
        this.S4 = h.getDimensionPixelSize(b29.ba, 0);
        this.T4 = h.getDimensionPixelSize(b29.ca, 0);
        this.U4 = h.getDimensionPixelSize(b29.aa, 0);
        h.recycle();
    }

    public void A0(float f) {
        this.a5 = 1.2f;
        this.X4 = f;
        this.Y4 = f;
        this.b5 = sk.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void B0(CharSequence charSequence) {
        if (!TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            this.I.i(true);
            invalidateSelf();
        }
    }

    public void C0(fab fabVar) {
        this.I.h(fabVar, this.A);
    }

    @Override // defpackage.tab.b
    public void a() {
        invalidateSelf();
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.scale(this.X4, this.Y4, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.a5));
        canvas.translate(q0(), (float) (-((this.V4 * Math.sqrt(2.0d)) - this.V4)));
        super.draw(canvas);
        w0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.I.e().getTextSize(), this.T4);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.Z * 2) + x0(), this.S4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fa6, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(E().v().s(u0()).m());
    }

    @Override // defpackage.fa6, android.graphics.drawable.Drawable, defpackage.tab.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void v0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.X);
    }

    public void z0(View view) {
        if (view == null) {
            return;
        }
        D0(view);
        view.addOnLayoutChangeListener(this.X);
    }
}
