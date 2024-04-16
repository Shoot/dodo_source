package com.inappstory.sdk.stories.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import ch.qos.logback.classic.Level;
/* loaded from: classes3.dex */
public class ViewAnimator {
    public static final String BLUR = "blur";
    public static final String FADE_IN_DOWN = "fade-in-down";
    public static final String FADE_IN_LEFT = "fade-in-left";
    public static final String FADE_IN_RIGHT = "fade-in-right";
    public static final String FADE_IN_UP = "fade-in-up";
    public static final String FOCUS_IN = "focus-in";
    public static final String SCROLL_DOWN = "scroll-down";
    public static final String SCROLL_LEFT = "scroll-left";
    public static final String SCROLL_RIGHT = "scroll-right";
    public static final String SCROLL_UP = "scroll-up";
    public static final String SHAKE = "shake";
    public static final String ZOOM = "zoom";
    public static final String ZOOM_IN = "zoom-in";
    public static final String ZOOM_OUT = "zoom-out";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BlurringView a;

        a(BlurringView blurringView) {
            this.a = blurringView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setDownsampleFactor(Math.max(1, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() / 3.0f)));
            this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.083333336f);
            if (((Float) valueAnimator.getAnimatedValue()).floatValue() < 0.01f) {
                this.a.setVisibility(8);
            }
            this.a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ AnimationSet b;

        b(View view, AnimationSet animationSet) {
            this.a = view;
            this.b = animationSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.startAnimation(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ AnimationSet b;

        c(View view, AnimationSet animationSet) {
            this.a = view;
            this.b = animationSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.startAnimation(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;
        final /* synthetic */ float[] b;
        final /* synthetic */ float[] c;
        final /* synthetic */ int[] d;

        d(View view, float[] fArr, float[] fArr2, int[] iArr) {
            this.a = view;
            this.b = fArr;
            this.c = fArr2;
            this.d = iArr;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Float) valueAnimator.getAnimatedValue()).intValue();
            this.a.setTranslationX(this.b[intValue]);
            this.a.setTranslationY(this.c[intValue]);
            this.a.setRotation(this.d[intValue]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ float[] b;
        final /* synthetic */ float[] c;
        final /* synthetic */ int[] d;

        e(View view, float[] fArr, float[] fArr2, int[] iArr) {
            this.a = view;
            this.b = fArr;
            this.c = fArr2;
            this.d = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a.setTranslationX(this.b[10]);
            this.a.setTranslationY(this.c[10]);
            this.a.setRotation(this.d[10]);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.a.setTranslationX(this.b[0]);
            this.a.setTranslationY(this.c[0]);
            this.a.setRotation(this.d[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ AnimationSet b;

        f(View view, AnimationSet animationSet) {
            this.a = view;
            this.b = animationSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.startAnimation(this.b);
        }
    }

    public ValueAnimator animate(View view, String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1828671716:
                if (str.equals(SCROLL_RIGHT)) {
                    c2 = 0;
                    break;
                }
                break;
            case -110060193:
                if (str.equals(ZOOM_IN)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3027047:
                if (str.equals(BLUR)) {
                    c2 = 2;
                    break;
                }
                break;
            case 3744723:
                if (str.equals(ZOOM)) {
                    c2 = 3;
                    break;
                }
                break;
            case 52499002:
                if (str.equals(FOCUS_IN)) {
                    c2 = 4;
                    break;
                }
                break;
            case 109399814:
                if (str.equals(SHAKE)) {
                    c2 = 5;
                    break;
                }
                break;
            case 417743259:
                if (str.equals(SCROLL_UP)) {
                    c2 = 6;
                    break;
                }
                break;
            case 444671481:
                if (str.equals(FADE_IN_DOWN)) {
                    c2 = 7;
                    break;
                }
                break;
            case 444899678:
                if (str.equals(FADE_IN_LEFT)) {
                    c2 = '\b';
                    break;
                }
                break;
            case 883107412:
                if (str.equals(ZOOM_OUT)) {
                    c2 = '\t';
                    break;
                }
                break;
            case 912649125:
                if (str.equals(FADE_IN_RIGHT)) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1220573618:
                if (str.equals(FADE_IN_UP)) {
                    c2 = 11;
                    break;
                }
                break;
            case 2018809762:
                if (str.equals(SCROLL_DOWN)) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2019037959:
                if (str.equals(SCROLL_LEFT)) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 6:
            case '\f':
            case '\r':
                return scroll(view, str);
            case 1:
            case 3:
            case '\t':
                return zoom(view, str);
            case 2:
                return blur(view);
            case 4:
                return focusIn(view);
            case 5:
                return shake(view);
            case 7:
            case '\b':
            case '\n':
            case 11:
                return fadeIn(view, str);
            default:
                return null;
        }
    }

    public ValueAnimator blur(View view) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ValueAnimator fadeIn(View view, String str) {
        int i;
        int i2;
        str.hashCode();
        int i3 = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case 444671481:
                if (str.equals(FADE_IN_DOWN)) {
                    c2 = 0;
                    break;
                }
                break;
            case 444899678:
                if (str.equals(FADE_IN_LEFT)) {
                    c2 = 1;
                    break;
                }
                break;
            case 912649125:
                if (str.equals(FADE_IN_RIGHT)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1220573618:
                if (str.equals(FADE_IN_UP)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                i = Sizes.getScreenSize().y;
                break;
            case 1:
                i2 = -Sizes.getScreenSize().x;
                i3 = i2;
                i = 0;
                break;
            case 2:
                i2 = Sizes.getScreenSize().x;
                i3 = i2;
                i = 0;
                break;
            case 3:
                i = -Sizes.getScreenSize().y;
                break;
            default:
                i = 0;
                break;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        long j = 1000;
        ofFloat.setDuration(j);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(i3, 0.0f, i, 0.0f));
        animationSet.setDuration(j);
        ofFloat.addListener(new b(view, animationSet));
        return ofFloat;
    }

    public ValueAnimator focusIn(View view) {
        BlurringView blurringView = new BlurringView(view.getContext());
        blurringView.setLayoutParams(view.getLayoutParams());
        ((RelativeLayout) view.getParent()).addView(blurringView);
        blurringView.setBlurredView(view);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(12.0f, 0.0f);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new a(blurringView));
        blurringView.invalidate();
        return ofFloat;
    }

    public ValueAnimator scroll(View view, String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        char c2 = 65535;
        if (i == -1) {
            i = Sizes.getScreenSize().x;
        }
        if (i2 == -1) {
            i2 = Sizes.getScreenSize().y;
        }
        int i3 = layoutParams.topMargin;
        float f2 = i3;
        float f3 = i3;
        int i4 = layoutParams.leftMargin;
        float f4 = i4;
        float f5 = i4;
        view.setPivotX(i / 2);
        view.setPivotY(i2 / 2);
        view.setScaleX(1.2f);
        view.setScaleY(1.2f);
        str.hashCode();
        switch (str.hashCode()) {
            case -1828671716:
                if (str.equals(SCROLL_RIGHT)) {
                    c2 = 0;
                    break;
                }
                break;
            case 417743259:
                if (str.equals(SCROLL_UP)) {
                    c2 = 1;
                    break;
                }
                break;
            case 2018809762:
                if (str.equals(SCROLL_DOWN)) {
                    c2 = 2;
                    break;
                }
                break;
            case 2019037959:
                if (str.equals(SCROLL_LEFT)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                float f6 = i * 0.08f;
                f2 -= f6;
                f3 += f6;
                break;
            case 1:
                float f7 = i2 * 0.08f;
                f4 += f7;
                f5 -= f7;
                break;
            case 2:
                float f8 = i2 * 0.08f;
                f4 -= f8;
                f5 += f8;
                break;
            case 3:
                float f9 = i * 0.08f;
                f2 += f9;
                f3 -= f9;
                break;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        AnimationSet animationSet = new AnimationSet(true);
        long j = (long) Level.INFO_INT;
        ofFloat.setDuration(j);
        animationSet.setDuration(j);
        ofFloat.addListener(new f(view, animationSet));
        animationSet.setFillAfter(true);
        animationSet.setFillBefore(true);
        animationSet.addAnimation(new TranslateAnimation(f2, f3, f4, f5));
        return ofFloat;
    }

    public ValueAnimator shake(View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        if (i2 == -1) {
            i2 = Sizes.getScreenSize().y;
        }
        if (i == -1) {
            view.setPivotX(Sizes.getScreenSize().x / 2.0f);
            view.setPivotY(i2 / 2.0f);
            view.setScaleX(1.1f);
            view.setScaleY(1.1f);
        }
        float[] fArr = {1.0f, -1.0f, -3.0f, 3.0f, 1.0f, -1.0f, -3.0f, -3.0f, -1.0f, 1.0f, 1.0f};
        float[] fArr2 = {1.0f, -2.0f, 0.0f, 2.0f, -1.0f, 2.0f, 1.0f, 1.0f, -1.0f, 2.0f, -2.0f};
        int[] iArr = {0, -1, 1, 0, 1, -1, 0, 0, 1, 0, -1};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 10.0f);
        ofFloat.setDuration(1000);
        ofFloat.addUpdateListener(new d(view, fArr, fArr2, iArr));
        ofFloat.addListener(new e(view, fArr, fArr2, iArr));
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    public ValueAnimator zoom(View view, String str) {
        float f2;
        float f3;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        char c2 = 65535;
        if (i == -1) {
            i = Sizes.getScreenSize().x;
        }
        if (i2 == -1) {
            i2 = Sizes.getScreenSize().y;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -110060193:
                if (str.equals(ZOOM_IN)) {
                    c2 = 0;
                    break;
                }
                break;
            case 3744723:
                if (str.equals(ZOOM)) {
                    c2 = 1;
                    break;
                }
                break;
            case 883107412:
                if (str.equals(ZOOM_OUT)) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                f2 = 1.0f;
                f3 = 1.2f;
                break;
            case 2:
                f2 = 1.2f;
                f3 = 1.0f;
                break;
            default:
                f2 = 1.0f;
                f3 = 1.0f;
                break;
        }
        if (f2 > 1.0f) {
            view.setPivotX(i / 2);
            view.setPivotY(i2 / 2);
            view.setScaleX(f2);
            view.setScaleY(f2);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        AnimationSet animationSet = new AnimationSet(true);
        long j = 10000;
        ofFloat.setDuration(j);
        animationSet.setDuration(j);
        ofFloat.addListener(new c(view, animationSet));
        animationSet.setFillAfter(true);
        animationSet.setFillBefore(true);
        animationSet.addAnimation(new ScaleAnimation(f2, f3, f2, f3, 2, 0.5f, 2, 0.5f));
        return ofFloat;
    }
}
