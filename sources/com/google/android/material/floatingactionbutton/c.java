package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
class c extends b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes2.dex */
    public static class a extends fa6 {
        a(uga ugaVar) {
            super(ugaVar);
        }

        @Override // defpackage.fa6, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FloatingActionButton floatingActionButton, rga rgaVar) {
        super(floatingActionButton, rgaVar);
    }

    @NonNull
    private Animator i0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.D);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void B() {
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void D(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.w.isEnabled()) {
                this.w.setElevation(this.h);
                if (this.w.isPressed()) {
                    this.w.setTranslationZ(this.j);
                    return;
                } else if (!this.w.isFocused() && !this.w.isHovered()) {
                    this.w.setTranslationZ(0.0f);
                    return;
                } else {
                    this.w.setTranslationZ(this.i);
                    return;
                }
            }
            this.w.setElevation(0.0f);
            this.w.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void E(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.E, i0(f, f3));
            stateListAnimator.addState(b.F, i0(f, f2));
            stateListAnimator.addState(b.G, i0(f, f2));
            stateListAnimator.addState(b.H, i0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.w, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.D);
            stateListAnimator.addState(b.I, animatorSet);
            stateListAnimator.addState(b.J, i0(0.0f, 0.0f));
            this.w.setStateListAnimator(stateListAnimator);
        }
        if (Y()) {
            e0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean J() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(rm9.d(colorStateList));
        } else {
            super.U(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean Y() {
        if (!this.x.c() && a0()) {
            return false;
        }
        return true;
    }

    @NonNull
    com.google.android.material.floatingactionbutton.a h0(int i, ColorStateList colorStateList) {
        Context context = this.w.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((uga) kh8.f(this.a));
        aVar.e(iu1.c(context, gw8.design_fab_stroke_top_outer_color), iu1.c(context, gw8.design_fab_stroke_top_inner_color), iu1.c(context, gw8.design_fab_stroke_end_inner_color), iu1.c(context, gw8.design_fab_stroke_end_outer_color));
        aVar.d(i);
        aVar.c(colorStateList);
        return aVar;
    }

    @NonNull
    fa6 j0() {
        return new a((uga) kh8.f(this.a));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.w.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void r(@NonNull Rect rect) {
        if (this.x.c()) {
            super.r(rect);
        } else if (!a0()) {
            int sizeDimension = (this.k - this.w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        fa6 j0 = j0();
        this.b = j0;
        j0.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.Q(this.w.getContext());
        if (i > 0) {
            this.d = h0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) kh8.f(this.d), (Drawable) kh8.f(this.b)});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(rm9.d(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void c0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void z() {
    }
}
