package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class m {
    @NonNull
    private final ImageView a;
    private c0 b;
    private c0 c;
    private c0 d;
    private int e = 0;

    public m(@NonNull ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.d == null) {
            this.d = new c0();
        }
        c0 c0Var = this.d;
        c0Var.a();
        ColorStateList a = cw4.a(this.a);
        if (a != null) {
            c0Var.d = true;
            c0Var.a = a;
        }
        PorterDuff.Mode b = cw4.b(this.a);
        if (b != null) {
            c0Var.c = true;
            c0Var.b = b;
        }
        if (!c0Var.d && !c0Var.c) {
            return false;
        }
        i.i(drawable, c0Var, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.b == null) {
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
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            u.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            c0 c0Var = this.c;
            if (c0Var != null) {
                i.i(drawable, c0Var, this.a.getDrawableState());
                return;
            }
            c0 c0Var2 = this.b;
            if (c0Var2 != null) {
                i.i(drawable, c0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        c0 c0Var = this.c;
        if (c0Var != null) {
            return c0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        c0 c0Var = this.c;
        if (c0Var != null) {
            return c0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (this.a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.a.getContext();
        int[] iArr = n29.R;
        e0 v = e0.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        syb.s0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (n = v.n(n29.S, -1)) != -1 && (drawable = on.b(this.a.getContext(), n)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                u.b(drawable);
            }
            int i2 = n29.T;
            if (v.s(i2)) {
                cw4.c(this.a, v.c(i2));
            }
            int i3 = n29.U;
            if (v.s(i3)) {
                cw4.d(this.a, u.e(v.k(i3, -1), null));
            }
            v.w();
        } catch (Throwable th) {
            v.w();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@NonNull Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = on.b(this.a.getContext(), i);
            if (b != null) {
                u.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new c0();
        }
        c0 c0Var = this.c;
        c0Var.a = colorStateList;
        c0Var.d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new c0();
        }
        c0 c0Var = this.c;
        c0Var.b = mode;
        c0Var.c = true;
        c();
    }
}
