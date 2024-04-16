package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.eu4;
import kotlin.Metadata;
/* compiled from: ImageResources.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Leu4$a;", "Landroid/content/res/Resources;", "res", "", "id", "Leu4;", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: mv4  reason: default package */
/* loaded from: classes.dex */
public final class mv4 {
    public static final eu4 a(eu4.a aVar, Resources resources, int i) {
        z65.h(aVar, "<this>");
        z65.h(resources, "res");
        Drawable drawable = resources.getDrawable(i, null);
        z65.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        z65.g(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return bh.c(bitmap);
    }
}
