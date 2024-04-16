package defpackage;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ViewUtilsApi29.java */
/* renamed from: l1c  reason: default package */
/* loaded from: classes.dex */
class l1c extends k1c {
    @Override // defpackage.e1c, defpackage.m1c
    public float c(@NonNull View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.i1c, defpackage.m1c
    public void e(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.e1c, defpackage.m1c
    public void f(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.k1c, defpackage.m1c
    public void g(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.g1c, defpackage.m1c
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.g1c, defpackage.m1c
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
