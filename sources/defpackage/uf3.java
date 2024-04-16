package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.emoji2.text.g;
/* compiled from: EmojiSpan.java */
/* renamed from: uf3  reason: default package */
/* loaded from: classes.dex */
public abstract class uf3 extends ReplacementSpan {
    @NonNull
    private final g b;
    private final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    private short c = -1;
    private short d = -1;
    private float e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uf3(@NonNull g gVar) {
        kh8.g(gVar, "metadata cannot be null");
        this.b = gVar;
    }

    @NonNull
    public final g a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.a);
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.d = (short) (this.b.e() * this.e);
        short i3 = (short) (this.b.i() * this.e);
        this.c = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
