package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* compiled from: StateListAnimator.java */
/* renamed from: oua  reason: default package */
/* loaded from: classes2.dex */
public final class oua {
    private final ArrayList<b> a = new ArrayList<>();
    private b b = null;
    ValueAnimator c = null;
    private final Animator.AnimatorListener d = new a();

    /* compiled from: StateListAnimator.java */
    /* renamed from: oua$a */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            oua ouaVar = oua.this;
            if (ouaVar.c == animator) {
                ouaVar.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* renamed from: oua$b */
    /* loaded from: classes2.dex */
    static class b {
        final int[] a;
        final ValueAnimator b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }
}
