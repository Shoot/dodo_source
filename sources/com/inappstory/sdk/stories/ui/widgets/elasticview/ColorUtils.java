package com.inappstory.sdk.stories.ui.widgets.elasticview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import defpackage.xp7;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes3.dex */
public class ColorUtils {
    public static final int IS_DARK = 1;
    public static final int IS_LIGHT = 0;
    public static final int LIGHTNESS_UNKNOWN = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Lightness {
    }

    private ColorUtils() {
    }

    public static xp7.d getMostPopulousSwatch(xp7 xp7Var) {
        xp7.d dVar = null;
        if (xp7Var != null) {
            for (xp7.d dVar2 : xp7Var.m()) {
                if (dVar == null || dVar2.d() > dVar.d()) {
                    dVar = dVar2;
                }
            }
        }
        return dVar;
    }

    public static int getThemeColor(@NonNull Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        return iu1.c(context, i2);
    }

    public static int isDark(xp7 xp7Var) {
        xp7.d mostPopulousSwatch = getMostPopulousSwatch(xp7Var);
        if (mostPopulousSwatch == null) {
            return 2;
        }
        return isDark(mostPopulousSwatch.e()) ? 1 : 0;
    }

    public static int modifyAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static int scrimify(int i, boolean z, float f) {
        float[] fArr = new float[3];
        qf1.h(i, fArr);
        fArr[2] = na6.a(fArr[2] * (!z ? f + 1.0f : 1.0f - f), 0.0f, 1.0f);
        return qf1.a(fArr);
    }

    public static int modifyAlpha(int i, float f) {
        return modifyAlpha(i, (int) (f * 255.0f));
    }

    public static boolean isDark(@NonNull Bitmap bitmap) {
        return isDark(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
    }

    public static boolean isDark(@NonNull Bitmap bitmap, int i, int i2) {
        xp7 a = xp7.b(bitmap).c(3).a();
        if (a == null || a.m().size() <= 0) {
            return isDark(bitmap.getPixel(i, i2));
        }
        return isDark(a) == 1;
    }

    public static int scrimify(int i, float f) {
        return scrimify(i, isDark(i), f);
    }

    public static boolean isDark(int i) {
        return qf1.f(i) < 0.5d;
    }
}
