package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* renamed from: m83  reason: default package */
/* loaded from: classes.dex */
final class m83 {
    private static final gc0 a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nj9<Bitmap> a(gc0 gc0Var, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(gc0Var, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            gc0Var = a;
        }
        return ic0.e(bitmap, gc0Var);
    }

    private static Bitmap b(gc0 gc0Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock h = xkb.h();
            h.lock();
            Bitmap d = gc0Var.d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return d;
            } finally {
                h.unlock();
            }
        }
    }

    /* compiled from: DrawableToBitmapConverter.java */
    /* renamed from: m83$a */
    /* loaded from: classes.dex */
    class a extends hc0 {
        a() {
        }

        @Override // defpackage.hc0, defpackage.gc0
        public void c(Bitmap bitmap) {
        }
    }
}
