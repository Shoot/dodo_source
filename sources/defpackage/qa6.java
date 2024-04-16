package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
/* compiled from: MatrixEvaluator.java */
/* renamed from: qa6  reason: default package */
/* loaded from: classes2.dex */
public class qa6 implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    @NonNull
    public Matrix a(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float f3 = this.a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
