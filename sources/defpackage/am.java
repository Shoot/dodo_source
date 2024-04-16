package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import kotlin.Metadata;
/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lam;", "", "", "width", "height", "Lfu4;", "bitmapConfig", "", "hasAlpha", "Ljd1;", "colorSpace", "Landroid/graphics/Bitmap;", "b", "(IIIZLjd1;)Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)Ljd1;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: am  reason: default package */
/* loaded from: classes.dex */
public final class am {
    public static final am a = new am();

    private am() {
    }

    public static final jd1 a(Bitmap bitmap) {
        ColorSpace colorSpace;
        jd1 b;
        z65.h(bitmap, "<this>");
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b = zf.b(colorSpace)) == null) {
            return lf1.a.w();
        }
        return b;
    }

    public static final Bitmap b(int i, int i2, int i3, boolean z, jd1 jd1Var) {
        Bitmap createBitmap;
        z65.h(jd1Var, "colorSpace");
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, bh.d(i3), z, zf.a(jd1Var));
        z65.g(createBitmap, "createBitmap(\n          …oidColorSpace()\n        )");
        return createBitmap;
    }
}
