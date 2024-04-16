package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class i extends f<ObjectAnimator> {
    private static final Property<i, Float> j = new b(Float.class, "animationFraction");
    private ObjectAnimator d;
    private bp3 e;
    private final com.google.android.material.progressindicator.b f;
    private int g;
    private boolean h;
    private float i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            i iVar = i.this;
            iVar.g = (iVar.g + 1) % i.this.f.c.length;
            i.this.h = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class b extends Property<i, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(i iVar) {
            return Float.valueOf(iVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(i iVar, Float f) {
            iVar.r(f.floatValue());
        }
    }

    public i(@NonNull k kVar) {
        super(3);
        this.g = 1;
        this.f = kVar;
        this.e = new bp3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.i;
    }

    private void o() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, j, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
    }

    private void p() {
        if (this.h && this.b[3] < 1.0f) {
            int[] iArr = this.c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = ba6.a(this.f.c[this.g], this.a.getAlpha());
            this.h = false;
        }
    }

    private void s(int i) {
        this.b[0] = 0.0f;
        float b2 = b(i, 0, 667);
        float[] fArr = this.b;
        float interpolation = this.e.getInterpolation(b2);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.b;
        float interpolation2 = this.e.getInterpolation(b2 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.b[5] = 1.0f;
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
    public void g() {
        o();
        q();
        this.d.start();
    }

    void q() {
        this.h = true;
        this.g = 1;
        Arrays.fill(this.c, ba6.a(this.f.c[0], this.a.getAlpha()));
    }

    void r(float f) {
        this.i = f;
        s((int) (f * 333.0f));
        p();
        this.a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.f
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.f
    public void h() {
    }

    @Override // com.google.android.material.progressindicator.f
    public void d(nj njVar) {
    }
}
