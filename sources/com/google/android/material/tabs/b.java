package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
class b extends c {
    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float b;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = c.a(tabLayout, view);
        if (i < 0) {
            b = sk.b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            b = sk.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}
