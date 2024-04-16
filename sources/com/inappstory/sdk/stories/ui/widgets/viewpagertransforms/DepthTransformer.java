package com.inappstory.sdk.stories.ui.widgets.viewpagertransforms;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes3.dex */
public class DepthTransformer implements ViewPager.k {
    @Override // androidx.viewpager.widget.ViewPager.k
    public void transformPage(View view, float f) {
        if (f <= -1.0d) {
            view.setTranslationX(0.0f);
        } else if (f <= 0.0f) {
            float abs = (0.14999998f * (1.0f - Math.abs(f))) + 0.85f;
            view.setAlpha(1.0f + f);
            view.setPivotY(view.getHeight() * 0.5f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setScaleX(abs);
            view.setScaleY(abs);
        } else if (f <= 1.0f) {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f > 1.0f) {
            view.setTranslationX(view.getWidth());
        }
    }
}
