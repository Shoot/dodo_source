package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: BubbleDrawable.java */
/* renamed from: pg0  reason: default package */
/* loaded from: classes.dex */
class pg0 extends Drawable {
    private final Drawable a;
    private final Drawable b;
    private int c = -1;

    public pg0(Context context) {
        this.b = iu1.e(context, ex8.a);
        this.a = iu1.e(context, ex8.b);
    }

    public void a(int i) {
        this.c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.b.draw(canvas);
        canvas.drawColor(this.c, PorterDuff.Mode.SRC_IN);
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        this.b.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.b.setBounds(rect);
        this.a.setBounds(rect);
    }
}
