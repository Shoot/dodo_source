package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
/* compiled from: BitmapTransformation.java */
/* renamed from: jc0  reason: default package */
/* loaded from: classes.dex */
public abstract class jc0 implements tkb<Bitmap> {
    @Override // defpackage.tkb
    @NonNull
    public final nj9<Bitmap> a(@NonNull Context context, @NonNull nj9<Bitmap> nj9Var, int i, int i2) {
        if (vub.v(i, i2)) {
            gc0 f = b.c(context).f();
            Bitmap bitmap = nj9Var.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(f, bitmap, i, i2);
            if (!bitmap.equals(c)) {
                return ic0.e(c, f);
            }
            return nj9Var;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    protected abstract Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2);
}
