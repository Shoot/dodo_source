package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
/* compiled from: ResourceBitmapDecoder.java */
/* renamed from: oj9  reason: default package */
/* loaded from: classes.dex */
public class oj9 implements rj9<Uri, Bitmap> {
    private final tj9 a;
    private final gc0 b;

    public oj9(tj9 tj9Var, gc0 gc0Var) {
        this.a = tj9Var;
        this.b = gc0Var;
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        nj9<Drawable> b = this.a.b(uri, i, i2, ac7Var);
        if (b == null) {
            return null;
        }
        return m83.a(this.b, b.get(), i, i2);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull Uri uri, @NonNull ac7 ac7Var) {
        return "android.resource".equals(uri.getScheme());
    }
}
