package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class j extends f<ObjectAnimator> {
    private static final int[] l = {533, 567, 850, 750};
    private static final int[] m = {1267, 1000, 333, 0};
    private static final Property<j, Float> n = new c(Float.class, "animationFraction");
    private ObjectAnimator d;
    private ObjectAnimator e;
    private final Interpolator[] f;
    private final com.google.android.material.progressindicator.b g;
    private int h;
    private boolean i;
    private float j;
    nj k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            j jVar = j.this;
            jVar.h = (jVar.h + 1) % j.this.g.c.length;
            j.this.i = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            j.this.a();
            j jVar = j.this;
            nj njVar = jVar.k;
            if (njVar != null) {
                njVar.a(jVar.a);
            }
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class c extends Property<j, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(j jVar) {
            return Float.valueOf(jVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(j jVar, Float f) {
            jVar.r(f.floatValue());
        }
    }

    public j(@NonNull Context context, @NonNull k kVar) {
        super(2);
        this.h = 0;
        this.k = null;
        this.g = kVar;
        this.f = new Interpolator[]{uk.a(context, mv8.linear_indeterminate_line1_head_interpolator), uk.a(context, mv8.linear_indeterminate_line1_tail_interpolator), uk.a(context, mv8.linear_indeterminate_line2_head_interpolator), uk.a(context, mv8.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.j;
    }

    private void o() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, n, 1.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.e.setInterpolator(null);
            this.e.addListener(new b());
        }
    }

    private void p() {
        if (this.i) {
            Arrays.fill(this.c, ba6.a(this.g.c[this.h], this.a.getAlpha()));
            this.i = false;
        }
    }

    private void s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2] = Math.max(0.0f, Math.min(1.0f, this.f[i2].getInterpolation(b(i, m[i2], l[i2]))));
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void a() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.f
    public void d(@NonNull nj njVar) {
        this.k = njVar;
    }

    @Override // com.google.android.material.progressindicator.f
    public void f() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            a();
            if (this.a.isVisible()) {
                this.e.setFloatValues(this.j, 1.0f);
                this.e.setDuration((1.0f - this.j) * 1800.0f);
                this.e.start();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.f
    public void g() {
        o();
        q();
        this.d.start();
    }

    @Override // com.google.android.material.progressindicator.f
    public void h() {
        this.k = null;
    }

    void q() {
        this.h = 0;
        int a2 = ba6.a(this.g.c[0], this.a.getAlpha());
        int[] iArr = this.c;
        iArr[0] = a2;
        iArr[1] = a2;
    }

    void r(float f) {
        this.j = f;
        s((int) (f * 1800.0f));
        p();
        this.a.invalidateSelf();
    }
}
