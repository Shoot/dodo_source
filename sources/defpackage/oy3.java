package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
/* compiled from: FitCenter.java */
/* renamed from: oy3  reason: default package */
/* loaded from: classes.dex */
public class oy3 extends jc0 {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(se5.a);

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.jc0
    protected Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        return xkb.e(gc0Var, bitmap, i, i2);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        return obj instanceof oy3;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return 1572326941;
    }
}
