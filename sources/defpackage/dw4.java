package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import defpackage.dlb;
/* compiled from: ImageViewTarget.java */
/* renamed from: dw4  reason: default package */
/* loaded from: classes.dex */
public abstract class dw4<Z> extends r0c<ImageView, Z> implements dlb.a {
    private Animatable i;

    public dw4(ImageView imageView) {
        super(imageView);
    }

    private void p(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.i = animatable;
            animatable.start();
            return;
        }
        this.i = null;
    }

    private void r(Z z) {
        q(z);
        p(z);
    }

    @Override // defpackage.r0c, defpackage.k80, defpackage.n6b
    public void a(Drawable drawable) {
        super.a(drawable);
        r(null);
        e(drawable);
    }

    @Override // defpackage.k80, defpackage.n6b
    public void b(Drawable drawable) {
        super.b(drawable);
        r(null);
        e(drawable);
    }

    @Override // defpackage.n6b
    public void d(@NonNull Z z, dlb<? super Z> dlbVar) {
        if (dlbVar != null && dlbVar.a(z, this)) {
            p(z);
        } else {
            r(z);
        }
    }

    @Override // defpackage.dlb.a
    public void e(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    @Override // defpackage.dlb.a
    public Drawable f() {
        return ((ImageView) this.b).getDrawable();
    }

    @Override // defpackage.k80, defpackage.mp5
    public void g() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.r0c, defpackage.k80, defpackage.n6b
    public void i(Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
        r(null);
        e(drawable);
    }

    @Override // defpackage.k80, defpackage.mp5
    public void onStart() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.start();
        }
    }

    protected abstract void q(Z z);
}
