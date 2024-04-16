package com.inappstory.sdk.stories.ui.widgets.viewpagertransforms;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes3.dex */
public class CubeTransformer implements ViewPager.k {
    protected boolean hideOffscreenPages() {
        return true;
    }

    protected boolean isPagingEnabled() {
        return false;
    }

    protected void onPreTransform(View view, float f) {
        float f2;
        float width = view.getWidth();
        float f3 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        if (isPagingEnabled()) {
            f2 = 0.0f;
        } else {
            f2 = (-width) * f;
        }
        view.setTranslationX(f2);
        if (hideOffscreenPages()) {
            if (f > -1.0f && f < 1.0f) {
                f3 = 1.0f;
            }
            view.setAlpha(f3);
            view.setEnabled(false);
            return;
        }
        view.setEnabled(true);
        view.setAlpha(1.0f);
    }

    protected void onTransform(View view, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(view.getHeight() * 0.6f);
        view.setRotationY(f * 30.0f);
    }

    @Override // androidx.viewpager.widget.ViewPager.k
    public void transformPage(View view, float f) {
        onTransform(view, f);
    }

    protected void onPostTransform(View view, float f) {
    }
}
