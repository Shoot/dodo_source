package defpackage;

import android.text.Spanned;
import kotlin.Metadata;
/* compiled from: SpannedExtensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a(\u0010\b\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "a", "", "startInclusive", "endExclusive", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bra  reason: default package */
/* loaded from: classes.dex */
public final class bra {
    public static final boolean a(Spanned spanned, Class<?> cls) {
        z65.h(spanned, "<this>");
        z65.h(cls, "clazz");
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final boolean b(Spanned spanned, Class<?> cls, int i, int i2) {
        z65.h(spanned, "<this>");
        z65.h(cls, "clazz");
        if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
            return true;
        }
        return false;
    }
}
