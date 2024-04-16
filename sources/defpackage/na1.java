package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
/* compiled from: CodeBlockSpan.java */
/* renamed from: na1  reason: default package */
/* loaded from: classes3.dex */
public class na1 extends MetricAffectingSpan implements LeadingMarginSpan {
    private final y86 a;
    private final Rect b = q57.b();
    private final Paint c = q57.a();

    public na1(@NonNull y86 y86Var) {
        this.a = y86Var;
    }

    private void a(TextPaint textPaint) {
        this.a.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        this.c.setStyle(Paint.Style.FILL);
        this.c.setColor(this.a.o(paint));
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            i8 = i;
        }
        this.b.set(i, i3, i8, i5);
        canvas.drawRect(this.b, this.c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.a.p();
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
