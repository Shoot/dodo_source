package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: Fade.java */
/* renamed from: qo3  reason: default package */
/* loaded from: classes.dex */
public class qo3 extends t1c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* renamed from: qo3$a */
    /* loaded from: classes.dex */
    public class a extends glb {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            a1c.g(this.a, 1.0f);
            a1c.a(this.a);
            clbVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* renamed from: qo3$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a1c.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (syb.U(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public qo3(int i) {
        o0(i);
    }

    private Animator p0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        a1c.g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a1c.b, f2);
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    private static float r0(mlb mlbVar, float f) {
        Float f2;
        if (mlbVar != null && (f2 = (Float) mlbVar.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // defpackage.t1c, defpackage.clb
    public void j(@NonNull mlb mlbVar) {
        super.j(mlbVar);
        mlbVar.a.put("android:fade:transitionAlpha", Float.valueOf(a1c.c(mlbVar.b)));
    }

    @Override // defpackage.t1c
    public Animator k0(ViewGroup viewGroup, View view, mlb mlbVar, mlb mlbVar2) {
        float f = 0.0f;
        float r0 = r0(mlbVar, 0.0f);
        if (r0 != 1.0f) {
            f = r0;
        }
        return p0(view, f, 1.0f);
    }

    @Override // defpackage.t1c
    public Animator m0(ViewGroup viewGroup, View view, mlb mlbVar, mlb mlbVar2) {
        a1c.e(view);
        return p0(view, r0(mlbVar, 1.0f), 0.0f);
    }

    public qo3() {
    }
}
