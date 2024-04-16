package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: GranularRoundedCorners.java */
/* renamed from: gi4  reason: default package */
/* loaded from: classes.dex */
public final class gi4 extends jc0 {
    private static final byte[] f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(se5.a);
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public gi4(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.b).putFloat(this.c).putFloat(this.d).putFloat(this.e).array());
    }

    @Override // defpackage.jc0
    protected Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        return xkb.n(gc0Var, bitmap, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof gi4)) {
            return false;
        }
        gi4 gi4Var = (gi4) obj;
        if (this.b != gi4Var.b || this.c != gi4Var.c || this.d != gi4Var.d || this.e != gi4Var.e) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return vub.n(this.e, vub.n(this.d, vub.n(this.c, vub.p(-2013597734, vub.m(this.b)))));
    }
}
