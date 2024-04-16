package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: DrawableBytesTranscoder.java */
/* renamed from: e83  reason: default package */
/* loaded from: classes.dex */
public final class e83 implements ck9<Drawable, byte[]> {
    private final gc0 a;
    private final ck9<Bitmap, byte[]> b;
    private final ck9<kf4, byte[]> c;

    public e83(@NonNull gc0 gc0Var, @NonNull ck9<Bitmap, byte[]> ck9Var, @NonNull ck9<kf4, byte[]> ck9Var2) {
        this.a = gc0Var;
        this.b = ck9Var;
        this.c = ck9Var2;
    }

    @Override // defpackage.ck9
    public nj9<byte[]> a(@NonNull nj9<Drawable> nj9Var, @NonNull ac7 ac7Var) {
        Drawable drawable = nj9Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(ic0.e(((BitmapDrawable) drawable).getBitmap(), this.a), ac7Var);
        }
        if (drawable instanceof kf4) {
            return this.c.a(b(nj9Var), ac7Var);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    private static nj9<kf4> b(@NonNull nj9<Drawable> nj9Var) {
        return nj9Var;
    }
}
