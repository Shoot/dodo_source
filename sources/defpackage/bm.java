package defpackage;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lbm;", "", "Landroid/graphics/Typeface;", "typeface", "Landroid/text/style/TypefaceSpan;", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
final class bm {
    public static final bm a = new bm();

    private bm() {
    }

    public final TypefaceSpan a(Typeface typeface) {
        z65.h(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
