package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: r2  reason: default package */
/* loaded from: classes.dex */
public final class r2 extends ClickableSpan {
    private final int a;
    private final d4 b;
    private final int c;

    public r2(int i, @NonNull d4 d4Var, int i2) {
        this.a = i;
        this.b = d4Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.c0(this.c, bundle);
    }
}
