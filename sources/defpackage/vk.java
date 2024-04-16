package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import kotlin.Metadata;
/* compiled from: AnimatorCreator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\b"}, d2 = {"Lvk;", "", "target", "Landroid/animation/Animator;", "a", "b", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vk  reason: default package */
/* loaded from: classes.dex */
public final class vk {
    public static final vk a = new vk();

    private vk() {
    }

    public final Animator a(Object obj) {
        z65.h(obj, "target");
        gs7 gs7Var = gs7.a;
        ObjectAnimator a2 = j47.a(obj, "translate", "", gs7Var.b());
        z65.g(a2, "ofFloat(...)");
        a2.setDuration(2000L);
        v65 v65Var = v65.a;
        a2.setInterpolator(v65Var.b());
        a2.setRepeatCount(-1);
        ObjectAnimator a3 = j47.a(obj, "", "scale", gs7Var.a());
        z65.g(a3, "ofFloat(...)");
        a3.setDuration(2000L);
        a3.setInterpolator(v65Var.a());
        a3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2, a3);
        return animatorSet;
    }

    public final Animator b(Object obj) {
        z65.h(obj, "target");
        gs7 gs7Var = gs7.a;
        ObjectAnimator a2 = j47.a(obj, "translate", "", gs7Var.d());
        z65.g(a2, "ofFloat(...)");
        a2.setDuration(2000L);
        v65 v65Var = v65.a;
        a2.setInterpolator(v65Var.d());
        a2.setRepeatCount(-1);
        ObjectAnimator a3 = j47.a(obj, "", "scale", gs7Var.c());
        z65.g(a3, "ofFloat(...)");
        a3.setDuration(2000L);
        a3.setInterpolator(v65Var.c());
        a3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2, a3);
        return animatorSet;
    }
}
