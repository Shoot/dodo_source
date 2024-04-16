package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: j0c  reason: default package */
/* loaded from: classes.dex */
public final class j0c {
    private final WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: j0c$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ l0c a;
        final /* synthetic */ View b;

        a(l0c l0cVar, View view) {
            this.a = l0cVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: j0c$b */
    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0c(View view) {
        this.a = new WeakReference<>(view);
    }

    private void i(View view, l0c l0cVar) {
        if (l0cVar != null) {
            view.animate().setListener(new a(l0cVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public j0c b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @NonNull
    public j0c f(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @NonNull
    public j0c g(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public j0c h(l0c l0cVar) {
        View view = this.a.get();
        if (view != null) {
            i(view, l0cVar);
        }
        return this;
    }

    @NonNull
    public j0c j(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @NonNull
    public j0c k(final n0c n0cVar) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.a.get();
        if (view != null) {
            if (n0cVar != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: i0c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        n0c.this.a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            b.a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public void l() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public j0c m(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
