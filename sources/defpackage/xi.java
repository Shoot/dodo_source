package defpackage;

import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: AndroidTextPaint.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroid/text/TextPaint;", "", "alpha", "", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi {
    public static final void a(TextPaint textPaint, float f) {
        float k;
        int c;
        z65.h(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            k = i.k(f, 0.0f, 1.0f);
            c = la6.c(k * 255);
            textPaint.setAlpha(c);
        }
    }
}
