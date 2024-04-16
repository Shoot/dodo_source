package im.threads.ui.views.shimmerLayout;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Handler;
import im.threads.ui.views.shimmerLayout.ShimmerGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ShimmerGroup.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0019J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lim/threads/ui/views/shimmerLayout/ShimmerGroup;", "", "()V", "animatedValue", "", "getAnimatedValue$threads_release", "()F", "setAnimatedValue$threads_release", "(F)V", "animatedViews", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lim/threads/ui/views/shimmerLayout/ShimmerLayout;", "valueAnimator", "Landroid/animation/ValueAnimator;", "addView", "", "shimmerLayout", "animationDuration", "", "timeInterpolator", "Landroid/animation/TimeInterpolator;", "addView$threads_release", "invalidateViews", "removeView", "removeView$threads_release", "startAnimator", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerGroup {
    private float animatedValue;
    private final CopyOnWriteArrayList<WeakReference<ShimmerLayout>> animatedViews = new CopyOnWriteArrayList<>();
    private ValueAnimator valueAnimator;

    private final void invalidateViews(float f) {
        Unit unit;
        this.animatedValue = f;
        Iterator<WeakReference<ShimmerLayout>> it = this.animatedViews.iterator();
        z65.g(it, "invalidateViews$lambda$5");
        while (it.hasNext()) {
            ShimmerLayout shimmerLayout = it.next().get();
            if (shimmerLayout != null) {
                if (shimmerLayout.isShown()) {
                    shimmerLayout.invalidate();
                } else {
                    shimmerLayout.stopShimmerAnimation();
                }
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeView$lambda$0(ShimmerGroup shimmerGroup) {
        z65.h(shimmerGroup, "this$0");
        if (shimmerGroup.animatedViews.isEmpty()) {
            ValueAnimator valueAnimator = shimmerGroup.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = shimmerGroup.valueAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            shimmerGroup.valueAnimator = null;
        }
    }

    private final void startAnimator(long j, TimeInterpolator timeInterpolator) {
        if (this.valueAnimator != null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(j);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jia
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerGroup.startAnimator$lambda$2$lambda$1(ShimmerGroup.this, valueAnimator);
            }
        });
        ofFloat.start();
        this.valueAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimator$lambda$2$lambda$1(ShimmerGroup shimmerGroup, ValueAnimator valueAnimator) {
        z65.h(shimmerGroup, "this$0");
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        shimmerGroup.invalidateViews(((Float) animatedValue).floatValue());
    }

    public final void addView$threads_release(ShimmerLayout shimmerLayout, long j, TimeInterpolator timeInterpolator) {
        z65.h(shimmerLayout, "shimmerLayout");
        z65.h(timeInterpolator, "timeInterpolator");
        pc1.I(this.animatedViews, new ShimmerGroup$addView$1(shimmerLayout));
        this.animatedViews.add(new WeakReference<>(shimmerLayout));
        startAnimator(j, timeInterpolator);
    }

    public final float getAnimatedValue$threads_release() {
        return this.animatedValue;
    }

    public final void removeView$threads_release(ShimmerLayout shimmerLayout) {
        z65.h(shimmerLayout, "shimmerLayout");
        pc1.I(this.animatedViews, new ShimmerGroup$removeView$1(shimmerLayout));
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isStarted() && this.animatedViews.isEmpty()) {
            new Handler().postDelayed(new Runnable() { // from class: iia
                @Override // java.lang.Runnable
                public final void run() {
                    ShimmerGroup.removeView$lambda$0(ShimmerGroup.this);
                }
            }, 500L);
        }
    }

    public final void setAnimatedValue$threads_release(float f) {
        this.animatedValue = f;
    }
}
