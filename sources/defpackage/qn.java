package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.u;
/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: qn  reason: default package */
/* loaded from: classes.dex */
class qn extends mn {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qn(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    private void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable r = f83.r(drawable.mutate());
                this.e = r;
                if (this.h) {
                    f83.o(r, this.f);
                }
                if (this.i) {
                    f83.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.mn
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.d.getContext();
        int[] iArr = n29.V;
        e0 v = e0.v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.d;
        syb.s0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i, 0);
        Drawable h = v.h(n29.W);
        if (h != null) {
            this.d.setThumb(h);
        }
        j(v.g(n29.X));
        int i2 = n29.Z;
        if (v.s(i2)) {
            this.g = u.e(v.k(i2, -1), this.g);
            this.i = true;
        }
        int i3 = n29.Y;
        if (v.s(i3)) {
            this.f = v.c(i3);
            this.h = true;
        }
        v.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i;
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            f83.m(drawable, syb.E(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
