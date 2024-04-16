package defpackage;

import android.content.res.TypedArray;
import kotlin.Metadata;
/* compiled from: TypedArray.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: eob  reason: default package */
/* loaded from: classes.dex */
public final class eob {
    private static final void a(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    public static final int b(TypedArray typedArray, int i) {
        z65.h(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getColor(i, 0);
    }
}
