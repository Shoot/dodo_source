package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;
/* compiled from: PaintExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lop7;", "", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Rect;", "rect", "", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: op7  reason: default package */
/* loaded from: classes.dex */
final class op7 {
    public static final op7 a = new op7();

    private op7() {
    }

    public static final void a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        z65.h(paint, "paint");
        z65.h(charSequence, "text");
        z65.h(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
