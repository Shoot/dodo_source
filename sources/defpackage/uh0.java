package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
/* compiled from: BulletListItemSpan.java */
/* renamed from: uh0  reason: default package */
/* loaded from: classes3.dex */
public class uh0 implements LeadingMarginSpan {
    private static final boolean f;
    private y86 a;
    private final Paint b = q57.a();
    private final RectF c = q57.c();
    private final Rect d = q57.b();
    private final int e;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (24 != i && 25 != i) {
            z = false;
        } else {
            z = true;
        }
        f = z;
    }

    public uh0(@NonNull y86 y86Var, int i) {
        this.a = y86Var;
        this.e = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        Paint.Style style;
        int i10;
        if (z && ho5.b(i6, charSequence, this)) {
            this.b.set(paint);
            this.a.h(this.b);
            int save = canvas.save();
            try {
                int k = this.a.k();
                int m = this.a.m((int) ((this.b.descent() - this.b.ascent()) + 0.5f));
                int i11 = (k - m) / 2;
                if (f) {
                    if (i2 < 0) {
                        i10 = i - (layout.getWidth() - (k * this.e));
                    } else {
                        i10 = (k * this.e) - i;
                    }
                    int i12 = i + (i11 * i2);
                    int i13 = (i2 * m) + i12;
                    int i14 = i2 * i10;
                    i8 = Math.min(i12, i13) + i14;
                    i9 = Math.max(i12, i13) + i14;
                } else {
                    if (i2 <= 0) {
                        i -= k;
                    }
                    i8 = i + i11;
                    i9 = i8 + m;
                }
                int descent = (i4 + ((int) (((this.b.descent() + this.b.ascent()) / 2.0f) + 0.5f))) - (m / 2);
                int i15 = m + descent;
                int i16 = this.e;
                if (i16 != 0 && i16 != 1) {
                    this.d.set(i8, descent, i9, i15);
                    this.b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.d, this.b);
                    canvas.restoreToCount(save);
                }
                this.c.set(i8, descent, i9, i15);
                if (this.e == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                this.b.setStyle(style);
                canvas.drawOval(this.c, this.b);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.a.k();
    }
}
