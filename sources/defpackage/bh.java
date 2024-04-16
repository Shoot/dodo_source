package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.fu4;
import kotlin.Metadata;
/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a=\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroid/graphics/Bitmap;", "Leu4;", c.a, "", "width", "height", "Lfu4;", "config", "", "hasAlpha", "Ljd1;", "colorSpace", "a", "(IIIZLjd1;)Leu4;", "b", "Landroid/graphics/Bitmap$Config;", DateTokenConverter.CONVERTER_KEY, "(I)Landroid/graphics/Bitmap$Config;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bh  reason: default package */
/* loaded from: classes.dex */
public final class bh {
    public static final eu4 a(int i, int i2, int i3, boolean z, jd1 jd1Var) {
        Bitmap createBitmap;
        z65.h(jd1Var, "colorSpace");
        Bitmap.Config d = d(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = am.b(i, i2, i3, z, jd1Var);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, d);
            z65.g(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z);
        }
        return new yg(createBitmap);
    }

    public static final Bitmap b(eu4 eu4Var) {
        z65.h(eu4Var, "<this>");
        if (eu4Var instanceof yg) {
            return ((yg) eu4Var).b();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final eu4 c(Bitmap bitmap) {
        z65.h(bitmap, "<this>");
        return new yg(bitmap);
    }

    public static final Bitmap.Config d(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        fu4.a aVar = fu4.a;
        if (fu4.g(i, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (fu4.g(i, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (fu4.g(i, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && fu4.g(i, aVar.c())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i2 >= 26 && fu4.g(i, aVar.d())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }
}
