package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: RoundedCorners.java */
/* renamed from: mo9  reason: default package */
/* loaded from: classes.dex */
public final class mo9 extends jc0 {
    private static final byte[] c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(se5.a);
    private final int b;

    public mo9(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        eh8.a(z, "roundingRadius must be greater than 0.");
        this.b = i;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.jc0
    protected Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        return xkb.o(gc0Var, bitmap, this.b);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof mo9) || this.b != ((mo9) obj).b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return vub.p(-569625254, vub.o(this.b));
    }
}
