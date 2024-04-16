package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
/* compiled from: LazyBitmapDrawableResource.java */
/* renamed from: sn5  reason: default package */
/* loaded from: classes.dex */
public final class sn5 implements nj9<BitmapDrawable>, t25 {
    private final Resources a;
    private final nj9<Bitmap> b;

    private sn5(@NonNull Resources resources, @NonNull nj9<Bitmap> nj9Var) {
        this.a = (Resources) eh8.d(resources);
        this.b = (nj9) eh8.d(nj9Var);
    }

    public static nj9<BitmapDrawable> e(@NonNull Resources resources, nj9<Bitmap> nj9Var) {
        if (nj9Var == null) {
            return null;
        }
        return new sn5(resources, nj9Var);
    }

    @Override // defpackage.nj9
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.nj9
    public void b() {
        this.b.b();
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.nj9
    @NonNull
    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }

    @Override // defpackage.t25
    public void initialize() {
        nj9<Bitmap> nj9Var = this.b;
        if (nj9Var instanceof t25) {
            ((t25) nj9Var).initialize();
        }
    }
}
