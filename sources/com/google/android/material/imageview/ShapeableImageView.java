package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements oha {
    private static final int s = i19.Widget_MaterialComponents_ShapeableImageView;
    private final vga a;
    private final RectF b;
    private final RectF c;
    private final Paint d;
    private final Paint e;
    private final Path f;
    private ColorStateList g;
    private fa6 h;
    private uga i;
    private float j;
    private Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    @TargetApi(21)
    /* loaded from: classes2.dex */
    class a extends ViewOutlineProvider {
        private final Rect a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.i == null) {
                return;
            }
            if (ShapeableImageView.this.h == null) {
                ShapeableImageView.this.h = new fa6(ShapeableImageView.this.i);
            }
            ShapeableImageView.this.b.round(this.a);
            ShapeableImageView.this.h.setBounds(this.a);
            ShapeableImageView.this.h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(Canvas canvas) {
        if (this.g == null) {
            return;
        }
        this.d.setStrokeWidth(this.j);
        int colorForState = this.g.getColorForState(getDrawableState(), this.g.getDefaultColor());
        if (this.j > 0.0f && colorForState != 0) {
            this.d.setColor(colorForState);
            canvas.drawPath(this.f, this.d);
        }
    }

    private boolean h() {
        if (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean i() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private void j(int i, int i2) {
        this.b.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.a.e(this.i, 1.0f, this.b, this.f);
        this.k.rewind();
        this.k.addPath(this.f);
        this.c.set(0.0f, 0.0f, i, i2);
        this.k.addRect(this.c, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.o;
    }

    public final int getContentPaddingEnd() {
        int i = this.q;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i()) {
            return this.l;
        }
        return this.n;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (h()) {
            if (i() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!i() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (h()) {
            if (i() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!i() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int getContentPaddingStart() {
        int i = this.p;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i()) {
            return this.n;
        }
        return this.l;
    }

    public int getContentPaddingTop() {
        return this.m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public uga getShapeAppearanceModel() {
        return this.i;
    }

    public ColorStateList getStrokeColor() {
        return this.g;
    }

    public float getStrokeWidth() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.e);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r || !isLayoutDirectionResolved()) {
            return;
        }
        this.r = true;
        if (!isPaddingRelative() && !h()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j(i, i2);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    @Override // defpackage.oha
    public void setShapeAppearanceModel(@NonNull uga ugaVar) {
        this.i = ugaVar;
        fa6 fa6Var = this.h;
        if (fa6Var != null) {
            fa6Var.setShapeAppearanceModel(ugaVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(on.a(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.j != f) {
            this.j = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.s
            android.content.Context r7 = defpackage.ia6.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            vga r7 = defpackage.vga.k()
            r6.a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f = r7
            r7 = 0
            r6.r = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.e = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.b = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.c = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.k = r2
            int[] r2 = defpackage.b29.N6
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = defpackage.b29.V6
            android.content.res.ColorStateList r4 = defpackage.ea6.a(r1, r2, r4)
            r6.g = r4
            int r4 = defpackage.b29.W6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.j = r4
            int r4 = defpackage.b29.O6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.l = r7
            r6.m = r7
            r6.n = r7
            r6.o = r7
            int r4 = defpackage.b29.R6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.l = r4
            int r4 = defpackage.b29.U6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.m = r4
            int r4 = defpackage.b29.S6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.n = r4
            int r4 = defpackage.b29.P6
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.o = r7
            int r7 = defpackage.b29.T6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.p = r7
            int r7 = defpackage.b29.Q6
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.q = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.d = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            uga$b r7 = defpackage.uga.e(r1, r8, r9, r0)
            uga r7 = r7.m()
            r6.i = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
