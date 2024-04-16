package defpackage;

import android.text.Layout;
import kotlin.Metadata;
/* compiled from: LayoutCompat.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¨\u0006\u0006"}, d2 = {"Landroid/text/Layout;", "", "offset", "", "upstream", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: mm5  reason: default package */
/* loaded from: classes.dex */
public final class mm5 {
    public static final int a(Layout layout, int i, boolean z) {
        z65.h(layout, "<this>");
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            if (z) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        } else if (!z) {
            return lineForOffset + 1;
        } else {
            return lineForOffset;
        }
    }
}
