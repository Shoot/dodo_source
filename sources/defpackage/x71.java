package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* compiled from: CircleAnimationUtil.java */
/* renamed from: x71  reason: default package */
/* loaded from: classes.dex */
public class x71 {
    private View a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private WeakReference<ViewGroup> i;
    private y71 l;
    private Animator.AnimatorListener m;
    private int h = 1000;
    private int j = 4;
    private int k = -16777216;

    private AnimatorSet d() {
        float max = Math.max(this.d, this.e) / 2.0f;
        this.l.setDrawableRadius(max);
        int[] iArr = new int[2];
        this.i.get().getLocationOnScreen(iArr);
        int i = iArr[1];
        float f = this.b;
        float f2 = i;
        float f3 = this.c - f2;
        float f4 = max * 0.2f;
        float f5 = this.f - f4;
        float f6 = (this.g - f2) - f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, View.X, f, f5);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, View.Y, f3, f6);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.l, View.SCALE_X, 1.0f, 0.2f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.l, View.SCALE_Y, 1.0f, 0.2f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.l, View.ALPHA, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(this.h);
        animatorSet2.playTogether(animatorSet);
        animatorSet2.setInterpolator(new ap3());
        animatorSet2.addListener(new a());
        return animatorSet2;
    }

    private void e() {
        if (this.i.get() != null) {
            ViewGroup viewGroup = this.i.get();
            View view = this.a;
            Bitmap f = f(view, view.getWidth(), this.a.getHeight());
            if (this.l == null) {
                this.l = new y71(viewGroup.getContext());
            }
            this.l.setImageBitmap(f);
            this.l.setBorderWidth(this.j);
            this.l.setBorderColor(this.k);
            if (this.l.getParent() == null) {
                viewGroup.addView(this.l);
            }
        }
    }

    private Bitmap f(View view, int i, int i2) {
        new BitmapDrawable();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.l.setImageBitmap(null);
        if (this.l.getParent() != null) {
            ((ViewGroup) this.l.getParent()).removeView(this.l);
        }
        this.l = null;
    }

    public x71 c(ViewGroup viewGroup) {
        this.i = new WeakReference<>(viewGroup);
        return this;
    }

    public x71 h(int i) {
        this.k = i;
        return this;
    }

    public x71 i(int i, int i2) {
        this.f = i;
        this.g = i2;
        return this;
    }

    public x71 j(int i) {
        this.h = i;
        return this;
    }

    public x71 k(View view) {
        this.a = view;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = this.a.getWidth();
        this.e = this.a.getHeight();
        return this;
    }

    public void l() {
        e();
        d().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircleAnimationUtil.java */
    /* renamed from: x71$a */
    /* loaded from: classes.dex */
    public class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (x71.this.m != null) {
                x71.this.m.onAnimationEnd(animator);
            }
            x71.this.g();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x71.this.m != null) {
                x71.this.m.onAnimationStart(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
