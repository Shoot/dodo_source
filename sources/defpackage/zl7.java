package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: OrderedListItemSpan.java */
/* renamed from: zl7  reason: default package */
/* loaded from: classes3.dex */
public class zl7 implements LeadingMarginSpan {
    private final y86 a;
    private final String b;
    private final Paint c = q57.a();
    private int d;

    public zl7(@NonNull y86 y86Var, @NonNull String str) {
        this.a = y86Var;
        this.b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        zl7[] zl7VarArr = (zl7[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), zl7.class);
        if (zl7VarArr != null) {
            TextPaint paint = textView.getPaint();
            for (zl7 zl7Var : zl7VarArr) {
                zl7Var.d = (int) (paint.measureText(zl7Var.b) + 0.5f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && ho5.b(i6, charSequence, this)) {
            this.c.set(paint);
            this.a.h(this.c);
            int measureText = (int) (this.c.measureText(this.b) + 0.5f);
            int k = this.a.k();
            if (measureText > k) {
                this.d = measureText;
                k = measureText;
            } else {
                this.d = 0;
            }
            if (i2 > 0) {
                i8 = (i + (k * i2)) - measureText;
            } else {
                i8 = i + (i2 * k) + (k - measureText);
            }
            canvas.drawText(this.b, i8, i4, this.c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.d, this.a.k());
    }
}
