package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import java.security.MessageDigest;
/* compiled from: GifDrawableTransformation.java */
/* renamed from: of4  reason: default package */
/* loaded from: classes.dex */
public class of4 implements tkb<kf4> {
    private final tkb<Bitmap> b;

    public of4(tkb<Bitmap> tkbVar) {
        this.b = (tkb) eh8.d(tkbVar);
    }

    @Override // defpackage.tkb
    @NonNull
    public nj9<kf4> a(@NonNull Context context, @NonNull nj9<kf4> nj9Var, int i, int i2) {
        kf4 kf4Var = nj9Var.get();
        nj9<Bitmap> ic0Var = new ic0(kf4Var.e(), b.c(context).f());
        nj9<Bitmap> a = this.b.a(context, ic0Var, i, i2);
        if (!ic0Var.equals(a)) {
            ic0Var.b();
        }
        kf4Var.m(this.b, a.get());
        return nj9Var;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (obj instanceof of4) {
            return this.b.equals(((of4) obj).b);
        }
        return false;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return this.b.hashCode();
    }
}
