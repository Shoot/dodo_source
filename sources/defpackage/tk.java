package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AnimationUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Ltk;", "", "", "offset", "duration", "Landroid/view/animation/Animation;", c.a, "b", "startOffset", "a", "Landroid/view/View;", "view", "animation", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tk  reason: default package */
/* loaded from: classes.dex */
public final class tk {
    public static final tk a = new tk();

    private tk() {
    }

    public final Animation a(int i, int i2) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setStartOffset(i);
        animationSet.setDuration(i2);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.5f, 1, 0.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    public final Animation b(int i, int i2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(i);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(i2);
        return alphaAnimation;
    }

    public final Animation c(int i, int i2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setStartOffset(i);
        scaleAnimation.setDuration(i2);
        return scaleAnimation;
    }

    public final View d(View view, Animation animation) {
        z65.h(view, "view");
        z65.h(animation, "animation");
        view.startAnimation(animation);
        return view;
    }
}
