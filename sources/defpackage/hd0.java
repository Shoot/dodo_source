package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
/* compiled from: BlockQuoteSpan.java */
/* renamed from: hd0  reason: default package */
/* loaded from: classes3.dex */
public class hd0 implements LeadingMarginSpan {
    private final y86 a;
    private final Rect b = q57.b();
    private final Paint c = q57.a();

    public hd0(@NonNull y86 y86Var) {
        this.a = y86Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int l = this.a.l();
        this.c.set(paint);
        this.a.a(this.c);
        int i8 = i2 * l;
        int i9 = i + i8;
        int i10 = i8 + i9;
        this.b.set(Math.min(i9, i10), i3, Math.max(i9, i10), i5);
        canvas.drawRect(this.b, this.c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.a.k();
    }
}
