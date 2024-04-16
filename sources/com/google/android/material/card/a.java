package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import defpackage.uga;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes2.dex */
public class a {
    private static final double u = Math.cos(Math.toRadians(45.0d));
    private static final Drawable v;
    @NonNull
    private final MaterialCardView a;
    @NonNull
    private final fa6 c;
    @NonNull
    private final fa6 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private Drawable j;
    private ColorStateList k;
    private ColorStateList l;
    private uga m;
    private ColorStateList n;
    private Drawable o;
    private LayerDrawable p;
    private fa6 q;
    private fa6 r;
    private boolean t;
    @NonNull
    private final Rect b = new Rect();
    private boolean s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0226a extends InsetDrawable {
        C0226a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        v = colorDrawable;
    }

    public a(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.a = materialCardView;
        fa6 fa6Var = new fa6(materialCardView.getContext(), attributeSet, i, i2);
        this.c = fa6Var;
        fa6Var.Q(materialCardView.getContext());
        fa6Var.g0(-12303292);
        uga.b v2 = fa6Var.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, b29.A0, i, i19.a);
        int i3 = b29.B0;
        if (obtainStyledAttributes.hasValue(i3)) {
            v2.o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.d = new fa6();
        V(v2.m());
        obtainStyledAttributes.recycle();
    }

    @NonNull
    private Drawable B(Drawable drawable) {
        int i;
        int i2;
        if (this.a.getUseCompatPadding()) {
            i2 = (int) Math.ceil(d());
            i = (int) Math.ceil(c());
        } else {
            i = 0;
            i2 = 0;
        }
        return new C0226a(drawable, i, i2, i, i2);
    }

    private boolean E() {
        if ((this.g & 80) == 80) {
            return true;
        }
        return false;
    }

    private boolean F() {
        if ((this.g & 8388613) == 8388613) {
            return true;
        }
        return false;
    }

    private boolean Z() {
        if (this.a.getPreventCornerOverlap() && !e()) {
            return true;
        }
        return false;
    }

    private float a() {
        return Math.max(Math.max(b(this.m.q(), this.c.J()), b(this.m.s(), this.c.K())), Math.max(b(this.m.k(), this.c.t()), b(this.m.i(), this.c.s())));
    }

    private boolean a0() {
        if (this.a.getPreventCornerOverlap() && e() && this.a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    private float b(gx1 gx1Var, float f) {
        if (gx1Var instanceof lo9) {
            return (float) ((1.0d - u) * f);
        }
        if (gx1Var instanceof h62) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        float f;
        float maxCardElevation = this.a.getMaxCardElevation();
        if (a0()) {
            f = a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    private float d() {
        float f;
        float maxCardElevation = this.a.getMaxCardElevation() * 1.5f;
        if (a0()) {
            f = a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    private boolean e() {
        return this.c.T();
    }

    private void e0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.a.getForeground()).setDrawable(drawable);
        } else {
            this.a.setForeground(B(drawable));
        }
    }

    @NonNull
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        fa6 h = h();
        this.q = h;
        h.b0(this.k);
        stateListDrawable.addState(new int[]{16842919}, this.q);
        return stateListDrawable;
    }

    @NonNull
    private Drawable g() {
        if (rm9.a) {
            this.r = h();
            return new RippleDrawable(this.k, null, this.r);
        }
        return f();
    }

    private void g0() {
        Drawable drawable;
        if (rm9.a && (drawable = this.o) != null) {
            ((RippleDrawable) drawable).setColor(this.k);
            return;
        }
        fa6 fa6Var = this.q;
        if (fa6Var != null) {
            fa6Var.b0(this.k);
        }
    }

    @NonNull
    private fa6 h() {
        return new fa6(this.m);
    }

    @NonNull
    private Drawable r() {
        if (this.o == null) {
            this.o = g();
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, ky8.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    private float t() {
        if (this.a.getPreventCornerOverlap() && this.a.getUseCompatPadding()) {
            return (float) ((1.0d - u) * this.a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect A() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(@NonNull TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a = ea6.a(this.a.getContext(), typedArray, b29.y4);
        this.n = a;
        if (a == null) {
            this.n = ColorStateList.valueOf(-1);
        }
        this.h = typedArray.getDimensionPixelSize(b29.z4, 0);
        boolean z = typedArray.getBoolean(b29.q4, false);
        this.t = z;
        this.a.setLongClickable(z);
        this.l = ea6.a(this.a.getContext(), typedArray, b29.w4);
        N(ea6.e(this.a.getContext(), typedArray, b29.s4));
        Q(typedArray.getDimensionPixelSize(b29.v4, 0));
        P(typedArray.getDimensionPixelSize(b29.u4, 0));
        this.g = typedArray.getInteger(b29.t4, 8388661);
        ColorStateList a2 = ea6.a(this.a.getContext(), typedArray, b29.x4);
        this.k = a2;
        if (a2 == null) {
            this.k = ColorStateList.valueOf(ba6.d(this.a, qv8.l));
        }
        K(ea6.a(this.a.getContext(), typedArray, b29.r4));
        g0();
        d0();
        h0();
        this.a.setBackgroundInternal(B(this.c));
        if (this.a.isClickable()) {
            drawable = r();
        } else {
            drawable = this.d;
        }
        this.i = drawable;
        this.a.setForeground(B(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.p != null) {
            if (this.a.getUseCompatPadding()) {
                i3 = (int) Math.ceil(d() * 2.0f);
                i4 = (int) Math.ceil(c() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (F()) {
                i5 = ((i - this.e) - this.f) - i4;
            } else {
                i5 = this.e;
            }
            if (E()) {
                i6 = this.e;
            } else {
                i6 = ((i2 - this.e) - this.f) - i3;
            }
            int i11 = i6;
            if (F()) {
                i7 = this.e;
            } else {
                i7 = ((i - this.e) - this.f) - i4;
            }
            if (E()) {
                i8 = ((i2 - this.e) - this.f) - i3;
            } else {
                i8 = this.e;
            }
            int i12 = i8;
            if (syb.E(this.a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.c.b0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(ColorStateList colorStateList) {
        fa6 fa6Var = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fa6Var.b0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(boolean z) {
        this.t = z;
    }

    public void M(boolean z) {
        int i;
        Drawable drawable = this.j;
        if (drawable != null) {
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = f83.r(drawable).mutate();
            this.j = mutate;
            f83.o(mutate, this.l);
            M(this.a.isChecked());
        } else {
            this.j = v;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(ky8.mtrl_card_checked_layer_id, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i) {
        this.g = i;
        H(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(int i) {
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(int i) {
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable drawable = this.j;
        if (drawable != null) {
            f83.o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(float f) {
        V(this.m.w(f));
        this.i.invalidateSelf();
        if (a0() || Z()) {
            c0();
        }
        if (a0()) {
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(float f) {
        this.c.c0(f);
        fa6 fa6Var = this.d;
        if (fa6Var != null) {
            fa6Var.c0(f);
        }
        fa6 fa6Var2 = this.r;
        if (fa6Var2 != null) {
            fa6Var2.c0(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(ColorStateList colorStateList) {
        this.k = colorStateList;
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(@NonNull uga ugaVar) {
        this.m = ugaVar;
        this.c.setShapeAppearanceModel(ugaVar);
        fa6 fa6Var = this.c;
        fa6Var.f0(!fa6Var.T());
        fa6 fa6Var2 = this.d;
        if (fa6Var2 != null) {
            fa6Var2.setShapeAppearanceModel(ugaVar);
        }
        fa6 fa6Var3 = this.r;
        if (fa6Var3 != null) {
            fa6Var3.setShapeAppearanceModel(ugaVar);
        }
        fa6 fa6Var4 = this.q;
        if (fa6Var4 != null) {
            fa6Var4.setShapeAppearanceModel(ugaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0() {
        Drawable drawable;
        Drawable drawable2 = this.i;
        if (this.a.isClickable()) {
            drawable = r();
        } else {
            drawable = this.d;
        }
        this.i = drawable;
        if (drawable2 != drawable) {
            e0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0() {
        float a;
        if (!Z() && !a0()) {
            a = 0.0f;
        } else {
            a = a();
        }
        int t = (int) (a - t());
        MaterialCardView materialCardView = this.a;
        Rect rect = this.b;
        materialCardView.i(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0() {
        this.c.a0(this.a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        if (!C()) {
            this.a.setBackgroundInternal(B(this.c));
        }
        this.a.setForeground(B(this.i));
    }

    void h0() {
        this.d.j0(this.h, this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public fa6 j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList k() {
        return this.c.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.d.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable m() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList q() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.c.J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float u() {
        return this.c.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList v() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public uga w() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x() {
        ColorStateList colorStateList = this.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList y() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z() {
        return this.h;
    }
}
