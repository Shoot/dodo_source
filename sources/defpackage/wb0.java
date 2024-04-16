package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
/* compiled from: BitmapDrawableTranscoder.java */
/* renamed from: wb0  reason: default package */
/* loaded from: classes.dex */
public class wb0 implements ck9<Bitmap, BitmapDrawable> {
    private final Resources a;

    public wb0(@NonNull Resources resources) {
        this.a = (Resources) eh8.d(resources);
    }

    @Override // defpackage.ck9
    public nj9<BitmapDrawable> a(@NonNull nj9<Bitmap> nj9Var, @NonNull ac7 ac7Var) {
        return sn5.e(this.a, nj9Var);
    }
}
