package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
class a extends c {
    private static float e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float f2;
        float e;
        RectF a = c.a(tabLayout, view);
        RectF a2 = c.a(tabLayout, view2);
        if (a.left < a2.left) {
            f2 = e(f);
            e = f(f);
        } else {
            f2 = f(f);
            e = e(f);
        }
        drawable.setBounds(sk.c((int) a.left, (int) a2.left, f2), drawable.getBounds().top, sk.c((int) a.right, (int) a2.right, e), drawable.getBounds().bottom);
    }
}
