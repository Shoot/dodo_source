package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;
/* compiled from: LineHeightSpan.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lxp5;", "Landroid/text/style/LineHeightSpan;", "", "text", "", "start", "end", "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "", "a", "F", "getLineHeight", "()F", "<init>", "(F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xp5  reason: default package */
/* loaded from: classes.dex */
public final class xp5 implements LineHeightSpan {
    private final float a;

    public xp5(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        z65.h(charSequence, "text");
        z65.h(fontMetricsInt, "fontMetricsInt");
        int a = aq5.a(fontMetricsInt);
        if (a <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.a);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / a));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
