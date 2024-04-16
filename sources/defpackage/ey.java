package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
/* compiled from: AsyncDrawableSpan.java */
/* renamed from: ey  reason: default package */
/* loaded from: classes3.dex */
public class ey extends ReplacementSpan {
    private final y86 a;
    private final xx b;
    private final int c;
    private final boolean d;

    public ey(@NonNull y86 y86Var, @NonNull xx xxVar, int i, boolean z) {
        this.a = y86Var;
        this.b = xxVar;
        this.c = i;
        this.d = z;
    }

    private static float b(int i, int i2, @NonNull Paint paint) {
        return (int) ((i + ((i2 - i) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }

    @NonNull
    public xx a() {
        return this.b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        int i6;
        this.b.h(xqa.a(canvas, charSequence), paint.getTextSize());
        xx xxVar = this.b;
        if (xxVar.f()) {
            int i7 = i5 - xxVar.getBounds().bottom;
            int save = canvas.save();
            try {
                int i8 = this.c;
                if (2 == i8) {
                    i6 = ((i5 - i3) - xxVar.getBounds().height()) / 2;
                } else {
                    if (1 == i8) {
                        i6 = paint.getFontMetricsInt().descent;
                    }
                    canvas.translate(f, i7);
                    xxVar.draw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                i7 -= i6;
                canvas.translate(f, i7);
                xxVar.draw(canvas);
                canvas.restoreToCount(save);
                return;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        float b = b(i3, i5, paint);
        if (this.d) {
            this.a.f(paint);
        }
        canvas.drawText(charSequence, i, i2, f, b, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.b.f()) {
            Rect bounds = this.b.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.d) {
            this.a.f(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }
}
