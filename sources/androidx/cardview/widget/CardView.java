package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] h = {16842801};
    private static final c i;
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;
    private final b g;

    /* loaded from: classes.dex */
    class a implements b {
        private Drawable a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public void b(int i, int i2, int i3, int i4) {
            CardView.this.f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.a;
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        i = aVar;
        aVar.l();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    public void d(int i2, int i3, int i4, int i5) {
        this.e.set(i2, i3, i4, i5);
        i.k(this.g);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return i.e(this.g);
    }

    public float getCardElevation() {
        return i.i(this.g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return i.d(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return i.b(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        c cVar = i;
        if (!(cVar instanceof androidx.cardview.widget.a)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.m(this.g)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.f(this.g)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        i.n(this.g, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        i.c(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        i.o(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            i.g(this.g);
        }
    }

    public void setRadius(float f) {
        i.a(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            i.j(this.g);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, rv8.a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.n(this.g, colorStateList);
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29.a, i2, l19.a);
        int i3 = f29.d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(hw8.b);
            } else {
                color = getResources().getColor(hw8.a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(f29.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(f29.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(f29.g, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(f29.i, false);
        this.b = obtainStyledAttributes.getBoolean(f29.h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f29.j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(f29.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(f29.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(f29.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(f29.k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = obtainStyledAttributes.getDimensionPixelSize(f29.b, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(f29.c, 0);
        obtainStyledAttributes.recycle();
        i.h(aVar, context, colorStateList, dimension, dimension2, f);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }
}
