package defpackage;

import android.graphics.Color;
import androidx.annotation.NonNull;
/* compiled from: CamUtils.java */
/* renamed from: rm0  reason: default package */
/* loaded from: classes.dex */
final class rm0 {
    static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] c = {95.047f, 100.0f, 108.883f};
    static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f) {
        float f2;
        boolean z;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return qf1.d(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(int i) {
        return c(g(i));
    }

    static float c(float f) {
        float f2 = f / 100.0f;
        if (f2 <= 0.008856452f) {
            return f2 * 903.2963f;
        }
        return (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    static float e(int i) {
        float pow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static float[] f(int i) {
        float e = e(Color.red(i));
        float e2 = e(Color.green(i));
        float e3 = e(Color.blue(i));
        float[][] fArr = d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * e) + (fArr2[1] * e2) + (fArr2[2] * e3);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * e) + (fArr3[1] * e2) + (fArr3[2] * e3);
        float[] fArr4 = fArr[2];
        return new float[]{f, f2, (e * fArr4[0]) + (e2 * fArr4[1]) + (e3 * fArr4[2])};
    }

    static float g(int i) {
        float e = e(Color.red(i));
        float e2 = e(Color.green(i));
        float e3 = e(Color.blue(i));
        float[] fArr = d[1];
        return (e * fArr[0]) + (e2 * fArr[1]) + (e3 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float h(float f) {
        float f2;
        if (f > 8.0f) {
            f2 = (float) Math.pow((f + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}
