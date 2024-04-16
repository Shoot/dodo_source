package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ViewUtilsApi21.java */
/* renamed from: g1c  reason: default package */
/* loaded from: classes.dex */
class g1c extends e1c {
    private static boolean f = true;
    private static boolean g = true;

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
