package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, oha {
    private static final int[] n = {16842911};
    private static final int[] o = {16842912};
    private static final int[] p = {qv8.state_dragged};
    private static final int q = i19.Widget_MaterialComponents_CardView;
    @NonNull
    private final com.google.android.material.card.a j;
    private boolean k;
    private boolean l;
    private boolean m;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.materialCardViewStyle);
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.j.i();
        }
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.j.j().getBounds());
        return rectF;
    }

    public boolean g() {
        com.google.android.material.card.a aVar = this.j;
        if (aVar != null && aVar.D()) {
            return true;
        }
        return false;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.j.k();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.j.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.j.m();
    }

    public int getCheckedIconGravity() {
        return this.j.n();
    }

    public int getCheckedIconMargin() {
        return this.j.o();
    }

    public int getCheckedIconSize() {
        return this.j.p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.j.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.j.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.j.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.j.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.j.A().top;
    }

    public float getProgress() {
        return this.j.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.j.s();
    }

    public ColorStateList getRippleColor() {
        return this.j.v();
    }

    @NonNull
    public uga getShapeAppearanceModel() {
        return this.j.w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.j.x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.j.y();
    }

    public int getStrokeWidth() {
        return this.j.z();
    }

    public boolean h() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i, int i2, int i3, int i4) {
        super.d(i, i2, i3, i4);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.f(this, this.j.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, o);
        }
        if (h()) {
            View.mergeDrawableStates(onCreateDrawableState, p);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            if (!this.j.C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.j.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.j.J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.j.d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.j.K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.j.L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.j.N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.j.n() != i) {
            this.j.O(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.j.P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.j.P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.j.N(on.b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.j.Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.j.Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.j.R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        com.google.android.material.card.a aVar = this.j;
        if (aVar != null) {
            aVar.b0();
        }
    }

    public void setDragged(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.f0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.f0();
        this.j.c0();
    }

    public void setProgress(float f) {
        this.j.T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.j.S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.j.U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.j.U(on.a(getContext(), i));
    }

    @Override // defpackage.oha
    public void setShapeAppearanceModel(@NonNull uga ugaVar) {
        setClipToOutline(ugaVar.u(getBoundsAsRectF()));
        this.j.V(ugaVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.j.X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.f0();
        this.j.c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.l = !this.l;
            refreshDrawableState();
            f();
            this.j.M(this.l);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.q
            android.content.Context r8 = defpackage.ia6.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.l = r8
            r7.m = r8
            r0 = 1
            r7.k = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = defpackage.b29.p4
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.j = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.Y(r9, r10, r1, r2)
            r0.G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.j.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j.W(colorStateList);
        invalidate();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
