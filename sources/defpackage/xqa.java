package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: SpanUtils.java */
/* renamed from: xqa  reason: default package */
/* loaded from: classes3.dex */
public abstract class xqa {
    public static int a(@NonNull Canvas canvas, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout b = ccb.b(spanned);
            if (b != null) {
                return b.getWidth();
            }
            TextView c = idb.c(spanned);
            if (c != null) {
                return (c.getWidth() - c.getPaddingLeft()) - c.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
