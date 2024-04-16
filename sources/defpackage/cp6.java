package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: MotionTiming.java */
/* renamed from: cp6  reason: default package */
/* loaded from: classes2.dex */
public class cp6 {
    private long a;
    private long b;
    private TimeInterpolator c;
    private int d;
    private int e;

    public cp6(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static cp6 b(@NonNull ValueAnimator valueAnimator) {
        cp6 cp6Var = new cp6(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        cp6Var.d = valueAnimator.getRepeatCount();
        cp6Var.e = valueAnimator.getRepeatMode();
        return cp6Var;
    }

    private static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return sk.c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return sk.d;
            }
            return interpolator;
        }
        return sk.b;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            return sk.b;
        }
        return timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp6)) {
            return false;
        }
        cp6 cp6Var = (cp6) obj;
        if (c() != cp6Var.c() || d() != cp6Var.d() || g() != cp6Var.g() || h() != cp6Var.h()) {
            return false;
        }
        return e().getClass().equals(cp6Var.e().getClass());
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public cp6(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
