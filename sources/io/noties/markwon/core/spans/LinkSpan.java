package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class LinkSpan extends URLSpan {
    private final y86 a;
    private final String b;
    private final mq5 c;

    public LinkSpan(@NonNull y86 y86Var, @NonNull String str, @NonNull mq5 mq5Var) {
        super(str);
        this.a = y86Var;
        this.b = str;
        this.c = mq5Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.c.a(view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.a.g(textPaint);
    }
}
