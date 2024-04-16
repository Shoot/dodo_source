package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
/* compiled from: HeadingSpan.java */
/* renamed from: mn4  reason: default package */
/* loaded from: classes3.dex */
public class mn4 extends MetricAffectingSpan implements LeadingMarginSpan {
    private final y86 a;
    private final Rect b = q57.b();
    private final Paint c = q57.a();
    private final int d;

    public mn4(@NonNull y86 y86Var, int i) {
        this.a = y86Var;
        this.d = i;
    }

    private void a(TextPaint textPaint) {
        this.a.e(textPaint, this.d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.d;
        if ((i9 == 1 || i9 == 2) && ho5.a(i7, charSequence, this)) {
            this.c.set(paint);
            this.a.d(this.c);
            float strokeWidth = this.c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                this.b.set(i, i10, i8, i5);
                canvas.drawRect(this.b, this.c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
