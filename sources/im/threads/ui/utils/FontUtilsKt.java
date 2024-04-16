package im.threads.ui.utils;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
/* compiled from: FontUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"typefaceSpanCompatV28", "Landroid/text/style/TypefaceSpan;", "typeface", "Landroid/graphics/Typeface;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontUtilsKt {
    @TargetApi(28)
    public static final TypefaceSpan typefaceSpanCompatV28(Typeface typeface) {
        z65.h(typeface, "typeface");
        return x60.a(typeface);
    }
}
