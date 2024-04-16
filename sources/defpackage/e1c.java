package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ViewUtilsApi19.java */
/* renamed from: e1c  reason: default package */
/* loaded from: classes.dex */
class e1c extends m1c {
    private static boolean e = true;

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public float c(@NonNull View view) {
        float transitionAlpha;
        if (e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, float f) {
        if (e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // defpackage.m1c
    public void a(@NonNull View view) {
    }

    @Override // defpackage.m1c
    public void d(@NonNull View view) {
    }
}
