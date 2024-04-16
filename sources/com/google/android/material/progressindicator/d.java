package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public abstract class d extends Drawable implements Animatable {
    private static final Property<d, Float> o = new c(Float.class, "growFraction");
    final Context a;
    final com.google.android.material.progressindicator.b b;
    private ValueAnimator d;
    private ValueAnimator e;
    private boolean f;
    private boolean g;
    private float h;
    private List<nj> i;
    private nj j;
    private boolean k;
    private float l;
    private int n;
    final Paint m = new Paint();
    wk c = new wk();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            d.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.super.setVisible(false, false);
            d.this.d();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(d dVar) {
            return Float.valueOf(dVar.g());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Float f) {
            dVar.m(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@NonNull Context context, @NonNull com.google.android.material.progressindicator.b bVar) {
        this.a = context;
        this.b = bVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        nj njVar = this.j;
        if (njVar != null) {
            njVar.a(this);
        }
        List<nj> list = this.i;
        if (list != null && !this.k) {
            for (nj njVar2 : list) {
                njVar2.a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        nj njVar = this.j;
        if (njVar != null) {
            njVar.b(this);
        }
        List<nj> list = this.i;
        if (list != null && !this.k) {
            for (nj njVar2 : list) {
                njVar2.b(this);
            }
        }
    }

    private void f(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z = this.k;
        this.k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.k = z;
    }

    private void k() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(500L);
            this.d.setInterpolator(sk.b);
            o(this.d);
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, 1.0f, 0.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.e.setInterpolator(sk.b);
            n(this.e);
        }
    }

    private void n(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        if (!this.b.b() && !this.b.a()) {
            return 1.0f;
        }
        if (!this.g && !this.f) {
            return this.l;
        }
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return p(false, false, false);
    }

    public boolean i() {
        ValueAnimator valueAnimator = this.e;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.g) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        if (!j() && !i()) {
            return false;
        }
        return true;
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.d;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f) {
            return true;
        }
        return false;
    }

    public void l(@NonNull nj njVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (!this.i.contains(njVar)) {
            this.i.add(njVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(float f) {
        if (this.l != f) {
            this.l = f;
            invalidateSelf();
        }
    }

    public boolean p(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a2 = this.c.a(this.a.getContentResolver());
        if (z3 && a2 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return q(z, z2, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean a2;
        k();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.d;
        } else {
            valueAnimator = this.e;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z) {
                a2 = this.b.b();
            } else {
                a2 = this.b.a();
            }
            if (!a2) {
                f(valueAnimator);
                return z4;
            }
            if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z4;
        }
    }

    public boolean r(@NonNull nj njVar) {
        List<nj> list = this.i;
        if (list != null && list.contains(njVar)) {
            this.i.remove(njVar);
            if (this.i.isEmpty()) {
                this.i = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return p(z, z2, true);
    }

    public void start() {
        q(true, true, false);
    }

    public void stop() {
        q(false, true, false);
    }
}
