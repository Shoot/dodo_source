package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;
/* compiled from: AnimatorUtils.java */
/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
class zk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull Animator animator) {
        animator.resume();
    }
}
