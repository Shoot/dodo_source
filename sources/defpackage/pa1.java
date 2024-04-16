package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
/* compiled from: CodeSpan.java */
/* renamed from: pa1  reason: default package */
/* loaded from: classes3.dex */
public class pa1 extends MetricAffectingSpan {
    private final y86 a;

    public pa1(@NonNull y86 y86Var) {
        this.a = y86Var;
    }

    private void a(TextPaint textPaint) {
        this.a.c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
        textPaint.bgColor = this.a.n(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
