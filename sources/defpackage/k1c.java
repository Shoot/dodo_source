package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ViewUtilsApi23.java */
/* renamed from: k1c  reason: default package */
/* loaded from: classes.dex */
class k1c extends i1c {
    private static boolean i = true;

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
