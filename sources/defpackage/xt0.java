package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
/* compiled from: CenterInside.java */
/* renamed from: xt0  reason: default package */
/* loaded from: classes.dex */
public class xt0 extends jc0 {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(se5.a);

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.jc0
    protected Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        return xkb.c(gc0Var, bitmap, i, i2);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        return obj instanceof xt0;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return -670243078;
    }
}
