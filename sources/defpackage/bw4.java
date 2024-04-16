package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.s58;
/* compiled from: ImageViewAction.java */
/* renamed from: bw4  reason: default package */
/* loaded from: classes3.dex */
class bw4 extends s4<ImageView> {
    gm0 m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw4(s58 s58Var, ImageView imageView, gi9 gi9Var, int i, int i2, int i3, Drawable drawable, String str, Object obj, gm0 gm0Var, boolean z) {
        super(s58Var, imageView, gi9Var, i, i2, i3, drawable, str, obj, z);
        this.m = gm0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.s4
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // defpackage.s4
    public void b(Bitmap bitmap, s58.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.c.get();
            if (imageView == null) {
                return;
            }
            s58 s58Var = this.a;
            t58.c(imageView, s58Var.d, bitmap, eVar, this.d, s58Var.l);
            gm0 gm0Var = this.m;
            if (gm0Var != null) {
                gm0Var.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // defpackage.s4
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        gm0 gm0Var = this.m;
        if (gm0Var != null) {
            gm0Var.onError(exc);
        }
    }
}
