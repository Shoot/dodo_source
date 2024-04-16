package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class e extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - a) * f2));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - a) * f2));
        }
        return f * 1.5f;
    }
}
