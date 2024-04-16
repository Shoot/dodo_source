package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
/* compiled from: ThematicBreakSpan.java */
/* renamed from: qdb  reason: default package */
/* loaded from: classes3.dex */
public class qdb implements LeadingMarginSpan {
    private final y86 a;
    private final Rect b = q57.b();
    private final Paint c = q57.a();

    public qdb(@NonNull y86 y86Var) {
        this.a = y86Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = i3 + ((i5 - i3) / 2);
        this.c.set(paint);
        this.a.i(this.c);
        int strokeWidth = (int) ((((int) (this.c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i8 = i;
            i -= canvas.getWidth();
        }
        this.b.set(i, i9 - strokeWidth, i8, i9 + strokeWidth);
        canvas.drawRect(this.b, this.c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
