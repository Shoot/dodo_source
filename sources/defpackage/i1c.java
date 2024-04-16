package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ViewUtilsApi22.java */
/* renamed from: i1c  reason: default package */
/* loaded from: classes.dex */
class i1c extends g1c {
    private static boolean h = true;

    @Override // defpackage.m1c
    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, int i, int i2, int i3, int i4) {
        if (h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
