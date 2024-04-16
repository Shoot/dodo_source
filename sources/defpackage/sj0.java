package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: sj0  reason: default package */
/* loaded from: classes.dex */
public class sj0 implements rj9<ByteBuffer, Bitmap> {
    private final g73 a;

    public sj0(g73 g73Var) {
        this.a = g73Var;
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        return this.a.g(byteBuffer, i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull ac7 ac7Var) {
        return this.a.q(byteBuffer);
    }
}
