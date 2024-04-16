package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: qb0  reason: default package */
/* loaded from: classes.dex */
public class qb0 implements ck9<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public qb0() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // defpackage.ck9
    public nj9<byte[]> a(@NonNull nj9<Bitmap> nj9Var, @NonNull ac7 ac7Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        nj9Var.get().compress(this.a, this.b, byteArrayOutputStream);
        nj9Var.b();
        return new pk0(byteArrayOutputStream.toByteArray());
    }

    public qb0(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
