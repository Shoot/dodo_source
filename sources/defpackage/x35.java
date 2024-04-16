package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* renamed from: x35  reason: default package */
/* loaded from: classes.dex */
public final class x35 implements rj9<InputStream, Bitmap> {
    private final cc0 a = new cc0();

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull InputStream inputStream, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(ck0.b(inputStream));
        return this.a.c(createSource, i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull InputStream inputStream, @NonNull ac7 ac7Var) throws IOException {
        return true;
    }
}
