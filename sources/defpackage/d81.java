package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import defpackage.g81;
/* compiled from: CircularRevealCompat.java */
/* renamed from: d81  reason: default package */
/* loaded from: classes2.dex */
public final class d81 {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: d81$a */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ g81 a;

        a(g81 g81Var) {
            this.a = g81Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.a();
        }
    }

    @NonNull
    public static Animator a(@NonNull g81 g81Var, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(g81Var, (Property<g81, V>) g81.c.a, (TypeEvaluator) g81.b.b, (Object[]) new g81.e[]{new g81.e(f, f2, f3)});
        g81.e revealInfo = g81Var.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) g81Var, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @NonNull
    public static Animator.AnimatorListener b(@NonNull g81 g81Var) {
        return new a(g81Var);
    }
}
