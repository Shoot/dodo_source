package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* renamed from: n83  reason: default package */
/* loaded from: classes.dex */
public class n83 implements tkb<Drawable> {
    private final tkb<Bitmap> b;
    private final boolean c;

    public n83(tkb<Bitmap> tkbVar, boolean z) {
        this.b = tkbVar;
        this.c = z;
    }

    private nj9<Drawable> d(Context context, nj9<Bitmap> nj9Var) {
        return sn5.e(context.getResources(), nj9Var);
    }

    @Override // defpackage.tkb
    @NonNull
    public nj9<Drawable> a(@NonNull Context context, @NonNull nj9<Drawable> nj9Var, int i, int i2) {
        gc0 f = b.c(context).f();
        Drawable drawable = nj9Var.get();
        nj9<Bitmap> a = m83.a(f, drawable, i, i2);
        if (a == null) {
            if (!this.c) {
                return nj9Var;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        nj9<Bitmap> a2 = this.b.a(context, a, i, i2);
        if (a2.equals(a)) {
            a2.b();
            return nj9Var;
        }
        return d(context, a2);
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (obj instanceof n83) {
            return this.b.equals(((n83) obj).b);
        }
        return false;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return this.b.hashCode();
    }

    public tkb<BitmapDrawable> c() {
        return this;
    }
}
