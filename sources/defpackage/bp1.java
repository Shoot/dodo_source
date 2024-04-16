package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.File;
import kotlin.Metadata;
/* compiled from: compressutils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001a\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\n¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/BitmapFactory$Options;", "", "reqWidth", "reqHeight", "", "a", "Landroid/graphics/Matrix;", "Landroid/media/ExifInterface;", "exif", "b", "", c.a, "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: bp1  reason: default package */
/* loaded from: classes4.dex */
public final class bp1 {
    public static final void a(BitmapFactory.Options options, int i, int i2) {
        z65.h(options, "<this>");
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        options.inSampleSize = i5;
    }

    public static final void b(Matrix matrix, ExifInterface exifInterface) {
        z65.h(matrix, "<this>");
        z65.h(exifInterface, "exif");
        float c = c(exifInterface);
        if (c > 0.0f) {
            matrix.postRotate(c);
        }
    }

    public static final float c(ExifInterface exifInterface) {
        z65.h(exifInterface, "<this>");
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt != 3) {
            if (attributeInt != 6) {
                if (attributeInt != 8) {
                    return 0.0f;
                }
                return 270.0f;
            }
            return 90.0f;
        }
        return 180.0f;
    }

    public static final String d(Context context) {
        z65.h(context, "<this>");
        String path = context.getCacheDir().getPath();
        String str = File.separator;
        return path + str + "images";
    }
}
