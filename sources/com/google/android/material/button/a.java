package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public class a {
    private static final boolean t;
    private static final boolean u;
    private final MaterialButton a;
    @NonNull
    private uga b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;
    private int s;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        t = true;
        if (i > 22) {
            z = false;
        }
        u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, @NonNull uga ugaVar) {
        this.a = materialButton;
        this.b = ugaVar;
    }

    private void E(int i, int i2) {
        int J = syb.J(this.a);
        int paddingTop = this.a.getPaddingTop();
        int I = syb.I(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            F();
        }
        syb.J0(this.a, J, (paddingTop + i) - i3, I, (paddingBottom + i2) - i4);
    }

    private void F() {
        this.a.setInternalBackground(a());
        fa6 f = f();
        if (f != null) {
            f.a0(this.s);
        }
    }

    private void G(@NonNull uga ugaVar) {
        if (u && !this.o) {
            int J = syb.J(this.a);
            int paddingTop = this.a.getPaddingTop();
            int I = syb.I(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            F();
            syb.J0(this.a, J, paddingTop, I, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(ugaVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(ugaVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(ugaVar);
        }
    }

    private void I() {
        int i;
        fa6 f = f();
        fa6 n = n();
        if (f != null) {
            f.j0(this.h, this.k);
            if (n != null) {
                float f2 = this.h;
                if (this.n) {
                    i = ba6.d(this.a, qv8.colorSurface);
                } else {
                    i = 0;
                }
                n.i0(f2, i);
            }
        }
    }

    @NonNull
    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        int i;
        fa6 fa6Var = new fa6(this.b);
        fa6Var.Q(this.a.getContext());
        f83.o(fa6Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            f83.p(fa6Var, mode);
        }
        fa6Var.j0(this.h, this.k);
        fa6 fa6Var2 = new fa6(this.b);
        fa6Var2.setTint(0);
        float f = this.h;
        if (this.n) {
            i = ba6.d(this.a, qv8.colorSurface);
        } else {
            i = 0;
        }
        fa6Var2.i0(f, i);
        if (t) {
            fa6 fa6Var3 = new fa6(this.b);
            this.m = fa6Var3;
            f83.n(fa6Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(rm9.d(this.l), J(new LayerDrawable(new Drawable[]{fa6Var2, fa6Var})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        qm9 qm9Var = new qm9(this.b);
        this.m = qm9Var;
        f83.o(qm9Var, rm9.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fa6Var2, fa6Var, this.m});
        this.r = layerDrawable;
        return J(layerDrawable);
    }

    private fa6 g(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (t) {
                return (fa6) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (fa6) this.r.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    private fa6 n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i) {
        if (this.h != i) {
            this.h = i;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                f83.o(f(), this.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() != null && this.i != null) {
                f83.p(f(), this.i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i2 - this.d, i - this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public oha e() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.r.getNumberOfLayers() > 2) {
                return (oha) this.r.getDrawable(2);
            }
            return (oha) this.r.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa6 f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public uga i() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@NonNull TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(b29.z3, 0);
        this.d = typedArray.getDimensionPixelOffset(b29.A3, 0);
        this.e = typedArray.getDimensionPixelOffset(b29.B3, 0);
        this.f = typedArray.getDimensionPixelOffset(b29.C3, 0);
        int i = b29.G3;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.g = dimensionPixelSize;
            y(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(b29.Q3, 0);
        this.i = z0c.j(typedArray.getInt(b29.F3, -1), PorterDuff.Mode.SRC_IN);
        this.j = ea6.a(this.a.getContext(), typedArray, b29.E3);
        this.k = ea6.a(this.a.getContext(), typedArray, b29.P3);
        this.l = ea6.a(this.a.getContext(), typedArray, b29.O3);
        this.q = typedArray.getBoolean(b29.D3, false);
        this.s = typedArray.getDimensionPixelSize(b29.H3, 0);
        int J = syb.J(this.a);
        int paddingTop = this.a.getPaddingTop();
        int I = syb.I(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(b29.y3)) {
            s();
        } else {
            F();
        }
        syb.J0(this.a, J + this.c, paddingTop + this.e, I + this.d, paddingBottom + this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(boolean z) {
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i) {
        if (!this.p || this.g != i) {
            this.g = i;
            this.p = true;
            y(this.b.w(i));
        }
    }

    public void v(int i) {
        E(this.e, i);
    }

    public void w(int i) {
        E(i, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = t;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(rm9.d(colorStateList));
            } else if (!z && (this.a.getBackground() instanceof qm9)) {
                ((qm9) this.a.getBackground()).setTintList(rm9.d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(@NonNull uga ugaVar) {
        this.b = ugaVar;
        G(ugaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z) {
        this.n = z;
        I();
    }
}
