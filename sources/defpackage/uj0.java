package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 implements rj9<ByteBuffer, Bitmap> {
    private final cc0 a = new cc0();

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.a.c(createSource, i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull ac7 ac7Var) throws IOException {
        return true;
    }
}
