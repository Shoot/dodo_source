package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;
/* compiled from: TypefaceEmojiSpan.java */
/* renamed from: sob  reason: default package */
/* loaded from: classes.dex */
public final class sob extends uf3 {
    private static Paint f;

    public sob(@NonNull g gVar) {
        super(gVar);
    }

    @NonNull
    private static Paint c() {
        if (f == null) {
            TextPaint textPaint = new TextPaint();
            f = textPaint;
            textPaint.setColor(e.b().c());
            f.setStyle(Paint.Style.FILL);
        }
        return f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f2, i3, f2 + b(), i5, c());
        }
        a().a(canvas, f2, i4, paint);
    }
}
