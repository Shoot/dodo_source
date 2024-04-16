package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;
/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: vb0  reason: default package */
/* loaded from: classes.dex */
public class vb0 implements uj9<BitmapDrawable> {
    private final gc0 a;
    private final uj9<Bitmap> b;

    public vb0(gc0 gc0Var, uj9<Bitmap> uj9Var) {
        this.a = gc0Var;
        this.b = uj9Var;
    }

    @Override // defpackage.uj9
    @NonNull
    public xg3 b(@NonNull ac7 ac7Var) {
        return this.b.b(ac7Var);
    }

    @Override // defpackage.bh3
    /* renamed from: c */
    public boolean a(@NonNull nj9<BitmapDrawable> nj9Var, @NonNull File file, @NonNull ac7 ac7Var) {
        return this.b.a(new ic0(nj9Var.get().getBitmap(), this.a), file, ac7Var);
    }
}
