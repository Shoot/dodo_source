package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class e {
    @NonNull
    private final View a;
    private c0 d;
    private c0 e;
    private c0 f;
    private int c = -1;
    private final i b = i.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@NonNull View view) {
        this.a = view;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f == null) {
            this.f = new c0();
        }
        c0 c0Var = this.f;
        c0Var.a();
        ColorStateList u = syb.u(this.a);
        if (u != null) {
            c0Var.d = true;
            c0Var.a = u;
        }
        PorterDuff.Mode v = syb.v(this.a);
        if (v != null) {
            c0Var.c = true;
            c0Var.b = v;
        }
        if (!c0Var.d && !c0Var.c) {
            return false;
        }
        i.i(drawable, c0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.d == null) {
                return false;
            }
            return true;
        } else if (i != 21) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            c0 c0Var = this.e;
            if (c0Var != null) {
                i.i(background, c0Var, this.a.getDrawableState());
                return;
            }
            c0 c0Var2 = this.d;
            if (c0Var2 != null) {
                i.i(background, c0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        c0 c0Var = this.e;
        if (c0Var != null) {
            return c0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        c0 c0Var = this.e;
        if (c0Var != null) {
            return c0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = n29.O3;
        e0 v = e0.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        syb.s0(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            int i2 = n29.P3;
            if (v.s(i2)) {
                this.c = v.n(i2, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            int i3 = n29.Q3;
            if (v.s(i3)) {
                syb.z0(this.a, v.c(i3));
            }
            int i4 = n29.R3;
            if (v.s(i4)) {
                syb.A0(this.a, u.e(v.k(i4, -1), null));
            }
            v.w();
        } catch (Throwable th) {
            v.w();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i) {
        ColorStateList colorStateList;
        this.c = i;
        i iVar = this.b;
        if (iVar != null) {
            colorStateList = iVar.f(this.a.getContext(), i);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new c0();
            }
            c0 c0Var = this.d;
            c0Var.a = colorStateList;
            c0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new c0();
        }
        c0 c0Var = this.e;
        c0Var.a = colorStateList;
        c0Var.d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new c0();
        }
        c0 c0Var = this.e;
        c0Var.b = mode;
        c0Var.c = true;
        b();
    }
}
