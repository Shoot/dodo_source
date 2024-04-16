package defpackage;

import android.graphics.Matrix;
import kotlin.Metadata;
/* compiled from: AndroidMatrixConversions.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Loa6;", "Landroid/graphics/Matrix;", "matrix", "", "b", "([FLandroid/graphics/Matrix;)V", "a", "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final class th {
    public static final void a(Matrix matrix, float[] fArr) {
        z65.h(matrix, "$this$setFrom");
        z65.h(fArr, "matrix");
        float f = fArr[2];
        if (f == 0.0f) {
            float f2 = fArr[6];
            if (f2 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f3 = fArr[8];
                if (f3 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    float f6 = fArr[3];
                    float f7 = fArr[4];
                    float f8 = fArr[5];
                    float f9 = fArr[7];
                    float f10 = fArr[12];
                    float f11 = fArr[13];
                    float f12 = fArr[15];
                    fArr[0] = f4;
                    fArr[1] = f7;
                    fArr[2] = f10;
                    fArr[3] = f5;
                    fArr[4] = f8;
                    fArr[5] = f11;
                    fArr[6] = f6;
                    fArr[7] = f9;
                    fArr[8] = f12;
                    matrix.setValues(fArr);
                    fArr[0] = f4;
                    fArr[1] = f5;
                    fArr[2] = f;
                    fArr[3] = f6;
                    fArr[4] = f7;
                    fArr[5] = f8;
                    fArr[6] = f2;
                    fArr[7] = f9;
                    fArr[8] = f3;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
    }

    public static final void b(float[] fArr, Matrix matrix) {
        z65.h(fArr, "$this$setFrom");
        z65.h(matrix, "matrix");
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }
}
