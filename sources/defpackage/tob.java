package defpackage;

import android.graphics.Typeface;
import kotlin.Metadata;
/* compiled from: AndroidFontUtils.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Ltob;", "", "Landroid/graphics/Typeface;", "typeface", "", "finalFontWeight", "", "finalFontStyle", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tob  reason: default package */
/* loaded from: classes.dex */
public final class tob {
    public static final tob a = new tob();

    private tob() {
    }

    public final Typeface a(Typeface typeface, int i, boolean z) {
        Typeface create;
        z65.h(typeface, "typeface");
        create = Typeface.create(typeface, i, z);
        z65.g(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
