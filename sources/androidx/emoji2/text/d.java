package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
public class d implements e.d {
    private static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    private final TextPaint a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder b2 = b();
        b2.setLength(0);
        while (i < i2) {
            b2.append(charSequence.charAt(i));
            i++;
        }
        return qp7.a(this.a, b2.toString());
    }
}
