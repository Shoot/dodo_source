package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
/* compiled from: TypefaceSpan.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lxob;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Paint;", "paint", "", "a", "Landroid/text/TextPaint;", "ds", "updateDrawState", "updateMeasureState", "Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xob  reason: default package */
/* loaded from: classes.dex */
public final class xob extends MetricAffectingSpan {
    private final Typeface a;

    public xob(Typeface typeface) {
        z65.h(typeface, "typeface");
        this.a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        z65.h(textPaint, "ds");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        z65.h(textPaint, "paint");
        a(textPaint);
    }
}
