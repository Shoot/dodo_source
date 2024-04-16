package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
/* compiled from: BitmapResource.java */
/* renamed from: ic0  reason: default package */
/* loaded from: classes.dex */
public class ic0 implements nj9<Bitmap>, t25 {
    private final Bitmap a;
    private final gc0 b;

    public ic0(@NonNull Bitmap bitmap, @NonNull gc0 gc0Var) {
        this.a = (Bitmap) eh8.e(bitmap, "Bitmap must not be null");
        this.b = (gc0) eh8.e(gc0Var, "BitmapPool must not be null");
    }

    public static ic0 e(Bitmap bitmap, @NonNull gc0 gc0Var) {
        if (bitmap == null) {
            return null;
        }
        return new ic0(bitmap, gc0Var);
    }

    @Override // defpackage.nj9
    public int a() {
        return vub.i(this.a);
    }

    @Override // defpackage.nj9
    public void b() {
        this.b.c(this.a);
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // defpackage.nj9
    @NonNull
    /* renamed from: d */
    public Bitmap get() {
        return this.a;
    }

    @Override // defpackage.t25
    public void initialize() {
        this.a.prepareToDraw();
    }
}
